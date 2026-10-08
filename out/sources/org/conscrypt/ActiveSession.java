package org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class ActiveSession implements ConscryptSession {
    private String applicationProtocol;
    private long creationTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private byte[] f149620id;
    private X509Certificate[] localCertificates;
    private volatile javax.security.cert.X509Certificate[] peerCertificateChain;
    private byte[] peerCertificateOcspData;
    private X509Certificate[] peerCertificates;
    private String peerHost;
    private byte[] peerTlsSctData;
    private String protocol;
    private final AbstractSessionContext sessionContext;
    private final NativeSsl ssl;
    private int peerPort = -1;
    private long lastAccessedTime = 0;
    private String[] peerSupportedSignatureAlgorithms = new String[0];

    ActiveSession(NativeSsl nativeSsl, AbstractSessionContext abstractSessionContext) {
        this.ssl = (NativeSsl) Preconditions.checkNotNull(nativeSsl, "ssl");
        this.sessionContext = (AbstractSessionContext) Preconditions.checkNotNull(abstractSessionContext, "sessionContext");
    }

    private void checkPeerCertificatesPresent() throws SSLPeerUnverifiedException {
        X509Certificate[] x509CertificateArr = this.peerCertificates;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new SSLPeerUnverifiedException("No peer certificates");
        }
    }

    private void configurePeer(String str, int i15, X509Certificate[] x509CertificateArr) {
        this.peerHost = str;
        this.peerPort = i15;
        this.peerCertificates = x509CertificateArr;
        synchronized (this.ssl) {
            this.peerCertificateOcspData = this.ssl.getPeerCertificateOcspData();
            this.peerTlsSctData = this.ssl.getPeerTlsSctData();
        }
    }

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        return 16384;
    }

    @Override // org.conscrypt.ConscryptSession
    public String getApplicationProtocol() {
        String protocolString;
        String str = this.applicationProtocol;
        if (str != null) {
            return str;
        }
        synchronized (this.ssl) {
            protocolString = SSLUtils.toProtocolString(this.ssl.getApplicationProtocol());
        }
        this.applicationProtocol = protocolString;
        return protocolString;
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        String cipherSuite;
        synchronized (this.ssl) {
            cipherSuite = this.ssl.getCipherSuite();
        }
        return cipherSuite == null ? "SSL_NULL_WITH_NULL_NULL" : cipherSuite;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        if (this.creationTime == 0) {
            synchronized (this.ssl) {
                this.creationTime = this.ssl.getTime();
            }
        }
        return this.creationTime;
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        if (this.f149620id == null) {
            synchronized (this.ssl) {
                this.f149620id = this.ssl.getSessionId();
            }
        }
        byte[] bArr = this.f149620id;
        return bArr != null ? (byte[]) bArr.clone() : EmptyArray.BYTE;
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        long j15 = this.lastAccessedTime;
        return j15 == 0 ? getCreationTime() : j15;
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        if (this.localCertificates == null) {
            synchronized (this.ssl) {
                this.localCertificates = this.ssl.getLocalCertificates();
            }
        }
        X509Certificate[] x509CertificateArr = this.localCertificates;
        if (x509CertificateArr == null) {
            return null;
        }
        return (Certificate[]) x509CertificateArr.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) getLocalCertificates();
        if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
            return null;
        }
        return x509CertificateArr[0].getSubjectX500Principal();
    }

    @Override // org.conscrypt.ConscryptSession
    public String[] getLocalSupportedSignatureAlgorithms() {
        return new String[]{"RSASSA-PSS", EdDSAParameterSpec.Ed25519, "SHA512withRSA", "SHA512withECDSA", "SHA384withRSA", "SHA384withECDSA", "SHA256withRSA", "SHA256withECDSA", "SHA224withRSA", "SHA224withECDSA", "SHA1withRSA", "SHA1withECDSA"};
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        return 16709;
    }

    @Override // javax.net.ssl.SSLSession
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        if (!Platform.isJavaxCertificateSupported()) {
            throw new UnsupportedOperationException("Use getPeerCertificates() instead");
        }
        checkPeerCertificatesPresent();
        javax.security.cert.X509Certificate[] x509CertificateArr = this.peerCertificateChain;
        if (x509CertificateArr != null) {
            return x509CertificateArr;
        }
        javax.security.cert.X509Certificate[] certificateChain = SSLUtils.toCertificateChain(this.peerCertificates);
        this.peerCertificateChain = certificateChain;
        return certificateChain;
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.peerHost;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.peerPort;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        checkPeerCertificatesPresent();
        return this.peerCertificates[0].getSubjectX500Principal();
    }

    @Override // org.conscrypt.ConscryptSession
    public byte[] getPeerSignedCertificateTimestamp() {
        byte[] bArr = this.peerTlsSctData;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    @Override // org.conscrypt.ConscryptSession
    public String[] getPeerSupportedSignatureAlgorithms() {
        return (String[]) this.peerSupportedSignatureAlgorithms.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        String version;
        String str = this.protocol;
        if (str != null) {
            return str;
        }
        synchronized (this.ssl) {
            version = this.ssl.getVersion();
        }
        this.protocol = version;
        return version;
    }

    @Override // org.conscrypt.ConscryptSession
    public String getRequestedServerName() {
        String requestedServerName;
        synchronized (this.ssl) {
            requestedServerName = this.ssl.getRequestedServerName();
        }
        return requestedServerName;
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        if (isValid()) {
            return this.sessionContext;
        }
        return null;
    }

    @Override // org.conscrypt.ConscryptSession
    public List<byte[]> getStatusResponses() {
        byte[] bArr = this.peerCertificateOcspData;
        return bArr == null ? Collections.EMPTY_LIST : Collections.singletonList((byte[]) bArr.clone());
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
        synchronized (this.ssl) {
            this.ssl.setTimeout(0L);
        }
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
        boolean z15;
        synchronized (this.ssl) {
            z15 = System.currentTimeMillis() - this.ssl.getTimeout() < this.ssl.getTime();
        }
        return z15;
    }

    void onPeerCertificateAvailable(String str, int i15) {
        synchronized (this.ssl) {
            try {
                this.f149620id = null;
                if (this.localCertificates == null) {
                    this.localCertificates = this.ssl.getLocalCertificates();
                }
                if (this.peerCertificates == null) {
                    configurePeer(str, i15, this.ssl.getPeerCertificates());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void onPeerCertificatesReceived(String str, int i15, X509Certificate[] x509CertificateArr) {
        configurePeer(str, i15, x509CertificateArr);
    }

    void onPeerSignatureAlgorithmsReceived(String[] strArr) {
        this.peerSupportedSignatureAlgorithms = strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ExternalSession.");
    }

    void setLastAccessedTime(long j15) {
        this.lastAccessedTime = j15;
    }

    @Override // org.conscrypt.ConscryptSession, javax.net.ssl.SSLSession
    public X509Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        checkPeerCertificatesPresent();
        return (X509Certificate[]) this.peerCertificates.clone();
    }
}
