package org.conscrypt;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class NativeSsl {
    private static int[] parsedTlsNamedGroupsProperty = null;
    private static String unparsedTlsNamedGroupsProperty = "";
    private final SSLParametersImpl.AliasChooser aliasChooser;
    private final NativeCrypto.SSLHandshakeCallbacks handshakeCallbacks;
    private X509Certificate[] localCertificates;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final SSLParametersImpl parameters;
    private final SSLParametersImpl.PSKCallbacks pskCallbacks;
    private volatile long ssl;

    final class BioWrapper {
        private volatile long bio;

        void close() {
            NativeSsl.this.lock.writeLock().lock();
            try {
                long j15 = this.bio;
                this.bio = 0L;
                if (j15 != 0) {
                    NativeCrypto.BIO_free_all(j15);
                }
            } finally {
                NativeSsl.this.lock.writeLock().unlock();
            }
        }

        int getPendingWrittenBytes() {
            NativeSsl.this.lock.readLock().lock();
            try {
                return this.bio == 0 ? 0 : NativeCrypto.SSL_pending_written_bytes_in_BIO(this.bio);
            } finally {
                NativeSsl.this.lock.readLock().unlock();
            }
        }

        int readDirectByteBuffer(long j15, int i15) {
            NativeSsl.this.lock.readLock().lock();
            try {
                if (NativeSsl.this.isClosed()) {
                    throw new SSLException("Connection closed");
                }
                int iENGINE_SSL_read_BIO_direct = NativeCrypto.ENGINE_SSL_read_BIO_direct(NativeSsl.this.ssl, NativeSsl.this, this.bio, j15, i15, NativeSsl.this.handshakeCallbacks);
                NativeSsl.this.lock.readLock().unlock();
                return iENGINE_SSL_read_BIO_direct;
            } catch (Throwable th4) {
                NativeSsl.this.lock.readLock().unlock();
                throw th4;
            }
        }

        int writeDirectByteBuffer(long j15, int i15) {
            NativeSsl.this.lock.readLock().lock();
            try {
                if (NativeSsl.this.isClosed()) {
                    throw new SSLException("Connection closed");
                }
                int iENGINE_SSL_write_BIO_direct = NativeCrypto.ENGINE_SSL_write_BIO_direct(NativeSsl.this.ssl, NativeSsl.this, this.bio, j15, i15, NativeSsl.this.handshakeCallbacks);
                NativeSsl.this.lock.readLock().unlock();
                return iENGINE_SSL_write_BIO_direct;
            } catch (Throwable th4) {
                NativeSsl.this.lock.readLock().unlock();
                throw th4;
            }
        }

        private BioWrapper() {
            this.bio = NativeCrypto.SSL_BIO_new(NativeSsl.this.ssl, NativeSsl.this);
        }
    }

    static {
        parseTlsNamedGroupsProperty();
    }

    private NativeSsl(long j15, SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
        this.ssl = j15;
        this.parameters = sSLParametersImpl;
        this.handshakeCallbacks = sSLHandshakeCallbacks;
        this.aliasChooser = aliasChooser;
        this.pskCallbacks = pSKCallbacks;
    }

    private void enablePSKKeyManagerIfRequested() {
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager != null) {
            for (String str : this.parameters.enabledCipherSuites) {
                if (str != null && str.contains("PSK")) {
                    if (isClient()) {
                        NativeCrypto.set_SSL_psk_client_callback_enabled(this.ssl, this, true);
                        return;
                    }
                    NativeCrypto.set_SSL_psk_server_callback_enabled(this.ssl, this, true);
                    NativeCrypto.SSL_use_psk_identity_hint(this.ssl, this, this.pskCallbacks.chooseServerPSKIdentityHint(pSKKeyManager));
                    return;
                }
            }
        }
    }

    private Set<String> getCipherKeyTypes() {
        HashSet hashSet = new HashSet();
        for (long j15 : NativeCrypto.SSL_get_ciphers(this.ssl, this)) {
            String serverX509KeyType = SSLUtils.getServerX509KeyType(j15);
            if (serverX509KeyType != null) {
                hashSet.add(serverX509KeyType);
            }
        }
        return hashSet;
    }

    static synchronized int[] getParsedTlsNamedGroupsPropertyOrNull() {
        try {
            parseTlsNamedGroupsProperty();
        } catch (IllegalArgumentException unused) {
        }
        return parsedTlsNamedGroupsProperty;
    }

    private boolean isClient() {
        return this.parameters.getUseClientMode();
    }

    static NativeSsl newInstance(SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
        return new NativeSsl(sSLParametersImpl.getSessionContext().newSsl(), sSLParametersImpl, sSLHandshakeCallbacks, aliasChooser, pSKCallbacks);
    }

    static int[] parseNamedGroupsProperty(String str) {
        if (str != null) {
            return toBoringSslGroups(str.replace(" ", "").split(","));
        }
        throw new NullPointerException("namedGroupsProperty is null");
    }

    static synchronized void parseTlsNamedGroupsProperty() {
        try {
            String property = System.getProperty("jdk.tls.namedGroups");
            if (property == null || property.isEmpty()) {
                parsedTlsNamedGroupsProperty = null;
                unparsedTlsNamedGroupsProperty = "";
            } else if (!property.equals(unparsedTlsNamedGroupsProperty)) {
                unparsedTlsNamedGroupsProperty = property;
                parsedTlsNamedGroupsProperty = parseNamedGroupsProperty(property);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private void setCertificate(String str) throws SSLException {
        X509KeyManager x509KeyManager;
        PrivateKey privateKey;
        if (str == null || (x509KeyManager = this.parameters.getX509KeyManager()) == null || (privateKey = x509KeyManager.getPrivateKey(str)) == null) {
            return;
        }
        X509Certificate[] certificateChain = x509KeyManager.getCertificateChain(str);
        this.localCertificates = certificateChain;
        if (certificateChain == null) {
            return;
        }
        int length = certificateChain.length;
        PublicKey publicKey = length > 0 ? certificateChain[0].getPublicKey() : null;
        byte[][] bArr = new byte[length][];
        for (int i15 = 0; i15 < length; i15++) {
            bArr[i15] = this.localCertificates[i15].getEncoded();
        }
        try {
            NativeCrypto.setLocalCertsAndPrivateKey(this.ssl, this, bArr, OpenSSLKey.fromPrivateKeyForTLSStackOnly(privateKey, publicKey).getNativeRef());
        } catch (InvalidKeyException e15) {
            throw new SSLException(e15);
        }
    }

    private void setCertificateValidation() throws SSLException {
        if (isClient()) {
            return;
        }
        if (this.parameters.getNeedClientAuth()) {
            NativeCrypto.SSL_set_verify(this.ssl, this, 3);
        } else {
            if (!this.parameters.getWantClientAuth()) {
                NativeCrypto.SSL_set_verify(this.ssl, this, 0);
                return;
            }
            NativeCrypto.SSL_set_verify(this.ssl, this, 1);
        }
        X509Certificate[] acceptedIssuers = this.parameters.getX509TrustManager().getAcceptedIssuers();
        if (acceptedIssuers == null || acceptedIssuers.length == 0) {
            return;
        }
        try {
            NativeCrypto.SSL_set_client_CA_list(this.ssl, this, SSLUtils.encodeSubjectX509Principals(acceptedIssuers));
        } catch (CertificateEncodingException e15) {
            throw new SSLException("Problem encoding principals", e15);
        }
    }

    private static void setDefaultNamedGroups(long j15, NativeSsl nativeSsl) {
        NativeCrypto.SSL_set1_groups(j15, nativeSsl, new int[0]);
    }

    private void setTlsChannelId(OpenSSLKey openSSLKey) throws SSLHandshakeException {
        SSLParametersImpl sSLParametersImpl = this.parameters;
        if (sSLParametersImpl.channelIdEnabled) {
            if (!sSLParametersImpl.getUseClientMode()) {
                NativeCrypto.SSL_enable_tls_channel_id(this.ssl, this);
            } else {
                if (openSSLKey == null) {
                    throw new SSLHandshakeException("Invalid TLS channel ID key specified");
                }
                NativeCrypto.SSL_set1_tls_channel_id(this.ssl, this, openSSLKey.getNativeRef());
            }
        }
    }

    private static int toBoringSslGroup(String str) {
        str.getClass();
        switch (str) {
            case "X25519Kyber768Draft00":
                return 964;
            case "X25519":
            case "x25519":
                return 948;
            case "secp256r1":
            case "P-256":
                return 415;
            case "secp384r1":
            case "P-384":
                return 715;
            case "secp521r1":
            case "P-521":
                return 716;
            case "X25519MLKEM768":
                return org.conscrypt.metrics.ConscryptStatsLog.CONSCRYPT_SERVICE_USED;
            case "MLKEM1024":
                return 966;
            default:
                return -1;
        }
    }

    static int[] toBoringSslGroups(String[] strArr) {
        int[] iArr = new int[strArr.length];
        int i15 = 0;
        for (String str : strArr) {
            int boringSslGroup = toBoringSslGroup(str);
            if (boringSslGroup > 0) {
                iArr[i15] = boringSslGroup;
                i15++;
            }
        }
        if (i15 != 0) {
            return i15 < strArr.length ? Arrays.copyOf(iArr, i15) : iArr;
        }
        throw new IllegalArgumentException("No valid known group found in: " + Arrays.toString(strArr));
    }

    private void verifyWithSniMatchers(String str) throws SSLHandshakeException {
        if (AddressUtils.isValidSniHostname(str) && !Platform.serverNamePermitted(this.parameters, str)) {
            throw new SSLHandshakeException("SNI match failed: " + str);
        }
    }

    void chooseClientCertificate(byte[] bArr, int[] iArr, byte[][] bArr2) throws SSLException {
        X500Principal[] x500PrincipalArr;
        Set<String> supportedClientKeyTypes = SSLUtils.getSupportedClientKeyTypes(bArr, iArr);
        String[] strArr = (String[]) supportedClientKeyTypes.toArray(new String[0]);
        if (bArr2 == null) {
            x500PrincipalArr = null;
        } else {
            x500PrincipalArr = new X500Principal[bArr2.length];
            for (int i15 = 0; i15 < bArr2.length; i15++) {
                x500PrincipalArr[i15] = new X500Principal(bArr2[i15]);
            }
        }
        X509KeyManager x509KeyManager = this.parameters.getX509KeyManager();
        setCertificate(x509KeyManager != null ? this.aliasChooser.chooseClientAlias(x509KeyManager, x500PrincipalArr, strArr) : null);
    }

    int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        byte[] bytes;
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager == null) {
            return 0;
        }
        String strChooseClientPSKIdentity = this.pskCallbacks.chooseClientPSKIdentity(pSKKeyManager, str);
        if (strChooseClientPSKIdentity == null) {
            bytes = EmptyArray.BYTE;
            str2 = "";
        } else {
            str2 = strChooseClientPSKIdentity;
            bytes = strChooseClientPSKIdentity.isEmpty() ? EmptyArray.BYTE : strChooseClientPSKIdentity.getBytes(StandardCharsets.UTF_8);
        }
        if (bytes.length + 1 > bArr.length) {
            return 0;
        }
        if (bytes.length > 0) {
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        }
        bArr[bytes.length] = 0;
        byte[] encoded = this.pskCallbacks.getPSKKey(pSKKeyManager, str, str2).getEncoded();
        if (encoded == null || encoded.length > bArr2.length) {
            return 0;
        }
        System.arraycopy(encoded, 0, bArr2, 0, encoded.length);
        return encoded.length;
    }

    void close() {
        this.lock.writeLock().lock();
        try {
            if (!isClosed()) {
                long j15 = this.ssl;
                this.ssl = 0L;
                NativeCrypto.SSL_free(j15, this);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    void configureServerCertificate() throws IOException {
        X509KeyManager x509KeyManager;
        verifyWithSniMatchers(getRequestedServerName());
        if (isClient() || (x509KeyManager = this.parameters.getX509KeyManager()) == null) {
            return;
        }
        Iterator<String> it = getCipherKeyTypes().iterator();
        while (it.hasNext()) {
            try {
                setCertificate(this.aliasChooser.chooseServerAlias(x509KeyManager, it.next()));
            } catch (CertificateEncodingException e15) {
                throw new IOException(e15);
            }
        }
    }

    void doHandshake(FileDescriptor fileDescriptor, int i15) throws Throwable {
        this.lock.readLock().lock();
        try {
            try {
                if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                    throw new SocketException("Socket is closed");
                }
                NativeCrypto.SSL_do_handshake(this.ssl, this, fileDescriptor, this.handshakeCallbacks, i15);
                this.lock.readLock().unlock();
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        Throwable th6 = th;
        this.lock.readLock().unlock();
        throw th6;
    }

    byte[] exportKeyingMaterial(String str, byte[] bArr, int i15) {
        if (str == null) {
            throw new NullPointerException("Label is null");
        }
        return NativeCrypto.SSL_export_keying_material(this.ssl, this, str.getBytes(StandardCharsets.US_ASCII), bArr, i15);
    }

    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    void forceRead() {
        this.lock.readLock().lock();
        try {
            NativeCrypto.ENGINE_SSL_force_read(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    byte[] getApplicationProtocol() {
        return NativeCrypto.getApplicationProtocol(this.ssl, this);
    }

    String getCipherSuite() {
        return NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_get_current_cipher(this.ssl, this));
    }

    String getCurveNameForTesting() {
        return NativeCrypto.SSL_get_curve_name(this.ssl, this);
    }

    int getError(int i15) {
        return NativeCrypto.SSL_get_error(this.ssl, this, i15);
    }

    X509Certificate[] getLocalCertificates() {
        return this.localCertificates;
    }

    int getMaxSealOverhead() {
        return NativeCrypto.SSL_max_seal_overhead(this.ssl, this);
    }

    byte[] getPeerCertificateOcspData() {
        return NativeCrypto.SSL_get_ocsp_response(this.ssl, this);
    }

    X509Certificate[] getPeerCertificates() {
        byte[][] bArrSSL_get0_peer_certificates = NativeCrypto.SSL_get0_peer_certificates(this.ssl, this);
        if (bArrSSL_get0_peer_certificates == null) {
            return null;
        }
        return SSLUtils.decodeX509CertificateChain(bArrSSL_get0_peer_certificates);
    }

    byte[] getPeerTlsSctData() {
        return NativeCrypto.SSL_get_signed_cert_timestamp_list(this.ssl, this);
    }

    int getPendingReadableBytes() {
        this.lock.readLock().lock();
        try {
            if (isClosed()) {
                return 0;
            }
            return NativeCrypto.SSL_pending_readable_bytes(this.ssl, this);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    String getRequestedServerName() {
        return NativeCrypto.SSL_get_servername(this.ssl, this);
    }

    byte[] getSessionId() {
        return NativeCrypto.SSL_session_id(this.ssl, this);
    }

    long getTime() {
        return NativeCrypto.SSL_get_time(this.ssl, this);
    }

    long getTimeout() {
        return NativeCrypto.SSL_get_timeout(this.ssl, this);
    }

    byte[] getTlsChannelId() {
        return NativeCrypto.SSL_get_tls_channel_id(this.ssl, this);
    }

    byte[] getTlsUnique() {
        return NativeCrypto.SSL_get_tls_unique(this.ssl, this);
    }

    String getVersion() {
        return NativeCrypto.SSL_get_version(this.ssl, this);
    }

    void initialize(String str, OpenSSLKey openSSLKey) throws SSLException {
        if (!this.parameters.getEnableSessionCreation()) {
            NativeCrypto.SSL_set_session_creation_enabled(this.ssl, this, false);
        }
        NativeCrypto.SSL_accept_renegotiations(this.ssl, this);
        if (isClient()) {
            NativeCrypto.SSL_set_connect_state(this.ssl, this);
            NativeCrypto.SSL_enable_ocsp_stapling(this.ssl, this);
            if (this.parameters.isCTVerificationEnabled(str)) {
                NativeCrypto.SSL_enable_signed_cert_timestamps(this.ssl, this);
            }
        } else {
            NativeCrypto.SSL_set_accept_state(this.ssl, this);
            if (this.parameters.getOCSPResponse() != null) {
                NativeCrypto.SSL_enable_ocsp_stapling(this.ssl, this);
            }
        }
        if (this.parameters.getEnabledProtocols().length == 0 && this.parameters.isEnabledProtocolsFiltered) {
            throw new SSLHandshakeException("No enabled protocols; SSLv3, TLSv1 and TLSv1.1 are no longer supported and were filtered from the list");
        }
        NativeCrypto.setEnabledProtocols(this.ssl, this, this.parameters.enabledProtocols);
        if (!this.parameters.isSpake()) {
            long j15 = this.ssl;
            SSLParametersImpl sSLParametersImpl = this.parameters;
            NativeCrypto.setEnabledCipherSuites(j15, this, sSLParametersImpl.enabledCipherSuites, sSLParametersImpl.enabledProtocols);
        }
        String[] namedGroups = this.parameters.getNamedGroups();
        if (namedGroups != null) {
            NativeCrypto.SSL_set1_groups(this.ssl, this, toBoringSslGroups(namedGroups));
        } else {
            int[] parsedTlsNamedGroupsPropertyOrNull = getParsedTlsNamedGroupsPropertyOrNull();
            if (parsedTlsNamedGroupsPropertyOrNull == null) {
                setDefaultNamedGroups(this.ssl, this);
            } else {
                NativeCrypto.SSL_set1_groups(this.ssl, this, parsedTlsNamedGroupsPropertyOrNull);
            }
        }
        if (this.parameters.applicationProtocols.length > 0) {
            NativeCrypto.setApplicationProtocols(this.ssl, this, isClient(), this.parameters.applicationProtocols);
        }
        if (!isClient() && this.parameters.applicationProtocolSelector != null) {
            NativeCrypto.setHasApplicationProtocolSelector(this.ssl, this, true);
        }
        if (!isClient()) {
            NativeCrypto.SSL_set_options(this.ssl, this, 4194304L);
            if (this.parameters.sctExtension != null) {
                NativeCrypto.SSL_set_signed_cert_timestamp_list(this.ssl, this, this.parameters.sctExtension);
            }
            if (this.parameters.ocspResponse != null) {
                NativeCrypto.SSL_set_ocsp_response(this.ssl, this, this.parameters.ocspResponse);
            }
        }
        enablePSKKeyManagerIfRequested();
        if (this.parameters.useSessionTickets) {
            NativeCrypto.SSL_clear_options(this.ssl, this, 16384L);
        } else {
            NativeCrypto.SSL_set_options(this.ssl, this, NativeCrypto.SSL_get_options(this.ssl, this) | 16384);
        }
        if (this.parameters.getUseSni() && AddressUtils.isValidSniHostname(str)) {
            NativeCrypto.SSL_set_tlsext_host_name(this.ssl, this, str);
        }
        NativeCrypto.SSL_set_mode(this.ssl, this, 256L);
        if (!this.parameters.isSpake()) {
            setCertificateValidation();
        }
        setTlsChannelId(openSSLKey);
    }

    void interrupt() {
        NativeCrypto.SSL_interrupt(this.ssl, this);
    }

    boolean isClosed() {
        return this.ssl == 0;
    }

    BioWrapper newBio() {
        try {
            return new BioWrapper();
        } catch (SSLException e15) {
            throw new RuntimeException(e15);
        }
    }

    void offerToResumeSession(long j15) {
        NativeCrypto.SSL_set_session(this.ssl, this, j15);
    }

    int read(FileDescriptor fileDescriptor, byte[] bArr, int i15, int i16, int i17) throws Throwable {
        this.lock.readLock().lock();
        try {
            try {
                if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                    throw new SocketException("Socket is closed");
                }
                int iSSL_read = NativeCrypto.SSL_read(this.ssl, this, fileDescriptor, this.handshakeCallbacks, bArr, i15, i16, i17);
                this.lock.readLock().unlock();
                return iSSL_read;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        Throwable th6 = th;
        this.lock.readLock().unlock();
        throw th6;
    }

    int readDirectByteBuffer(long j15, int i15) throws Throwable {
        NativeSsl nativeSsl;
        this.lock.readLock().lock();
        try {
            nativeSsl = this;
            try {
                int iENGINE_SSL_read_direct = NativeCrypto.ENGINE_SSL_read_direct(this.ssl, nativeSsl, j15, i15, this.handshakeCallbacks);
                nativeSsl.lock.readLock().unlock();
                return iENGINE_SSL_read_direct;
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                nativeSsl.lock.readLock().unlock();
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            nativeSsl = this;
        }
    }

    int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        byte[] encoded;
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager == null || (encoded = this.pskCallbacks.getPSKKey(pSKKeyManager, str, str2).getEncoded()) == null || encoded.length > bArr.length) {
            return 0;
        }
        System.arraycopy(encoded, 0, bArr, 0, encoded.length);
        return encoded.length;
    }

    void setTimeout(long j15) {
        NativeCrypto.SSL_set_timeout(this.ssl, this, j15);
    }

    void shutdown(FileDescriptor fileDescriptor) {
        NativeCrypto.SSL_shutdown(this.ssl, this, fileDescriptor, this.handshakeCallbacks);
    }

    boolean wasShutdownReceived() {
        this.lock.readLock().lock();
        try {
            return (NativeCrypto.SSL_get_shutdown(this.ssl, this) & 2) != 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    boolean wasShutdownSent() {
        this.lock.readLock().lock();
        try {
            return (NativeCrypto.SSL_get_shutdown(this.ssl, this) & 1) != 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    void write(FileDescriptor fileDescriptor, byte[] bArr, int i15, int i16, int i17) throws Throwable {
        this.lock.readLock().lock();
        try {
            try {
                if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                    throw new SocketException("Socket is closed");
                }
                NativeCrypto.SSL_write(this.ssl, this, fileDescriptor, this.handshakeCallbacks, bArr, i15, i16, i17);
                this.lock.readLock().unlock();
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        Throwable th6 = th;
        this.lock.readLock().unlock();
        throw th6;
    }

    int writeDirectByteBuffer(long j15, int i15) throws Throwable {
        NativeSsl nativeSsl;
        this.lock.readLock().lock();
        try {
            nativeSsl = this;
            try {
                int iENGINE_SSL_write_direct = NativeCrypto.ENGINE_SSL_write_direct(this.ssl, nativeSsl, j15, i15, this.handshakeCallbacks);
                nativeSsl.lock.readLock().unlock();
                return iENGINE_SSL_write_direct;
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                nativeSsl.lock.readLock().unlock();
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            nativeSsl = this;
        }
    }

    void shutdown() {
        this.lock.readLock().lock();
        try {
            NativeCrypto.ENGINE_SSL_shutdown(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    int doHandshake() {
        this.lock.readLock().lock();
        try {
            return NativeCrypto.ENGINE_SSL_do_handshake(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }
}
