package org.conscrypt;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* JADX INFO: loaded from: classes5.dex */
abstract class NativeSslSession {
    private static final Logger logger = Logger.getLogger(NativeSslSession.class.getName());

    private static final class Impl extends NativeSslSession {
        private final String cipherSuite;
        private final AbstractSessionContext context;
        private final String host;
        private final X509Certificate[] peerCertificates;
        private final byte[] peerOcspStapledResponse;
        private final byte[] peerSignedCertificateTimestamp;
        private final int port;
        private final String protocol;
        private final NativeRef.SSL_SESSION ref;

        /* JADX INFO: Access modifiers changed from: private */
        public long getCreationTime() {
            return NativeCrypto.SSL_SESSION_get_time(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        String getCipherSuite() {
            return this.cipherSuite;
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] getId() {
            return NativeCrypto.SSL_SESSION_session_id(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        String getPeerHost() {
            return this.host;
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] getPeerOcspStapledResponse() {
            return this.peerOcspStapledResponse;
        }

        @Override // org.conscrypt.NativeSslSession
        int getPeerPort() {
            return this.port;
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] getPeerSignedCertificateTimestamp() {
            return this.peerSignedCertificateTimestamp;
        }

        @Override // org.conscrypt.NativeSslSession
        String getProtocol() {
            return this.protocol;
        }

        @Override // org.conscrypt.NativeSslSession
        boolean isSingleUse() {
            return NativeCrypto.SSL_SESSION_should_be_single_use(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        boolean isValid() {
            return System.currentTimeMillis() - (Math.max(0L, Math.min((long) this.context.getSessionTimeout(), NativeCrypto.SSL_SESSION_get_timeout(this.ref.address))) * 1000) < getCreationTime();
        }

        @Override // org.conscrypt.NativeSslSession
        void offerToResume(NativeSsl nativeSsl) {
            nativeSsl.offerToResumeSession(this.ref.address);
        }

        @Override // org.conscrypt.NativeSslSession
        byte[] toBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value);
                byte[] bArrI2d_SSL_SESSION = NativeCrypto.i2d_SSL_SESSION(this.ref.address);
                dataOutputStream.writeInt(bArrI2d_SSL_SESSION.length);
                dataOutputStream.write(bArrI2d_SSL_SESSION);
                dataOutputStream.writeInt(this.peerCertificates.length);
                for (X509Certificate x509Certificate : this.peerCertificates) {
                    byte[] encoded = x509Certificate.getEncoded();
                    dataOutputStream.writeInt(encoded.length);
                    dataOutputStream.write(encoded);
                }
                if (this.peerOcspStapledResponse != null) {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.peerOcspStapledResponse.length);
                    dataOutputStream.write(this.peerOcspStapledResponse);
                } else {
                    dataOutputStream.writeInt(0);
                }
                byte[] bArr = this.peerSignedCertificateTimestamp;
                if (bArr != null) {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(this.peerSignedCertificateTimestamp);
                } else {
                    dataOutputStream.writeInt(0);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e15) {
                NativeSslSession.logger.log(Level.FINE, "Failed to convert saved SSL Session: ", (Throwable) e15);
                return null;
            } catch (CertificateEncodingException e16) {
                NativeSslSession.log(e16);
                return null;
            }
        }

        @Override // org.conscrypt.NativeSslSession
        SSLSession toSSLSession() {
            return new SSLSession() { // from class: org.conscrypt.NativeSslSession.Impl.1
                @Override // javax.net.ssl.SSLSession
                public int getApplicationBufferSize() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getCipherSuite() {
                    return Impl.this.getCipherSuite();
                }

                @Override // javax.net.ssl.SSLSession
                public long getCreationTime() {
                    return Impl.this.getCreationTime();
                }

                @Override // javax.net.ssl.SSLSession
                public byte[] getId() {
                    return Impl.this.getId();
                }

                @Override // javax.net.ssl.SSLSession
                public long getLastAccessedTime() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Certificate[] getLocalCertificates() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Principal getLocalPrincipal() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public int getPacketBufferSize() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public javax.security.cert.X509Certificate[] getPeerCertificateChain() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Certificate[] getPeerCertificates() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getPeerHost() {
                    return Impl.this.getPeerHost();
                }

                @Override // javax.net.ssl.SSLSession
                public int getPeerPort() {
                    return Impl.this.getPeerPort();
                }

                @Override // javax.net.ssl.SSLSession
                public Principal getPeerPrincipal() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getProtocol() {
                    return Impl.this.getProtocol();
                }

                @Override // javax.net.ssl.SSLSession
                public SSLSessionContext getSessionContext() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Object getValue(String str) {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String[] getValueNames() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public void invalidate() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public boolean isValid() {
                    return Impl.this.isValid();
                }

                @Override // javax.net.ssl.SSLSession
                public void putValue(String str, Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public void removeValue(String str) {
                    throw new UnsupportedOperationException();
                }
            };
        }

        private Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i15, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2) {
            this.context = abstractSessionContext;
            this.host = str;
            this.port = i15;
            this.peerCertificates = x509CertificateArr;
            this.peerOcspStapledResponse = bArr;
            this.peerSignedCertificateTimestamp = bArr2;
            this.protocol = NativeCrypto.SSL_SESSION_get_version(ssl_session.address);
            this.cipherSuite = NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_SESSION_cipher(ssl_session.address));
            this.ref = ssl_session;
        }
    }

    NativeSslSession() {
    }

    private static void checkRemaining(ByteBuffer byteBuffer, int i15) throws IOException {
        if (i15 < 0) {
            throw new IOException("Length is negative: " + i15);
        }
        if (i15 <= byteBuffer.remaining()) {
            return;
        }
        throw new IOException("Length of blob is longer than available: " + i15 + " > " + byteBuffer.remaining());
    }

    private static byte[] getOcspResponse(ConscryptSession conscryptSession) {
        List<byte[]> statusResponses = conscryptSession.getStatusResponses();
        if (statusResponses.size() >= 1) {
            return statusResponses.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(Throwable th4) {
        logger.log(Level.FINE, "Error inflating SSL session: {0}", th4.getMessage() != null ? th4.getMessage() : th4.getClass().getName());
    }

    static NativeSslSession newInstance(NativeRef.SSL_SESSION ssl_session, ConscryptSession conscryptSession) {
        AbstractSessionContext abstractSessionContext = (AbstractSessionContext) conscryptSession.getSessionContext();
        if (abstractSessionContext instanceof ClientSessionContext) {
            return new Impl(abstractSessionContext, ssl_session, conscryptSession.getPeerHost(), conscryptSession.getPeerPort(), conscryptSession.getPeerCertificates(), getOcspResponse(conscryptSession), conscryptSession.getPeerSignedCertificateTimestamp());
        }
        return new Impl(abstractSessionContext, ssl_session, null, -1, null, null, null);
    }

    abstract String getCipherSuite();

    abstract byte[] getId();

    abstract String getPeerHost();

    abstract byte[] getPeerOcspStapledResponse();

    abstract int getPeerPort();

    abstract byte[] getPeerSignedCertificateTimestamp();

    abstract String getProtocol();

    abstract boolean isSingleUse();

    abstract boolean isValid();

    abstract void offerToResume(NativeSsl nativeSsl);

    abstract byte[] toBytes();

    abstract SSLSession toSSLSession();

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    static NativeSslSession newInstance(AbstractSessionContext abstractSessionContext, byte[] bArr, String str, int i15) {
        byte[] bArr2;
        byte[] bArr3;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        try {
            int i16 = byteBufferWrap.getInt();
            if (SSLUtils.SessionType.isSupportedType(i16)) {
                int i17 = byteBufferWrap.getInt();
                checkRemaining(byteBufferWrap, i17);
                byte[] bArr4 = new byte[i17];
                byteBufferWrap.get(bArr4);
                int i18 = byteBufferWrap.getInt();
                checkRemaining(byteBufferWrap, i18);
                X509Certificate[] x509CertificateArr = new X509Certificate[i18];
                for (int i19 = 0; i19 < i18; i19++) {
                    int i25 = byteBufferWrap.getInt();
                    checkRemaining(byteBufferWrap, i25);
                    byte[] bArr5 = new byte[i25];
                    byteBufferWrap.get(bArr5);
                    try {
                        x509CertificateArr[i19] = OpenSSLX509Certificate.fromX509Der(bArr5);
                    } catch (Exception unused) {
                        throw new IOException("Can not read certificate " + i19 + "/" + i18);
                    }
                }
                if (i16 >= SSLUtils.SessionType.OPEN_SSL_WITH_OCSP.value) {
                    int i26 = byteBufferWrap.getInt();
                    checkRemaining(byteBufferWrap, i26);
                    if (i26 >= 1) {
                        int i27 = byteBufferWrap.getInt();
                        checkRemaining(byteBufferWrap, i27);
                        byte[] bArr6 = new byte[i27];
                        byteBufferWrap.get(bArr6);
                        for (int i28 = 1; i28 < i26; i28++) {
                            int i29 = byteBufferWrap.getInt();
                            checkRemaining(byteBufferWrap, i29);
                            byteBufferWrap.position(byteBufferWrap.position() + i29);
                        }
                        bArr2 = bArr6;
                    } else {
                        bArr2 = null;
                    }
                } else {
                    bArr2 = null;
                }
                if (i16 == SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value) {
                    int i35 = byteBufferWrap.getInt();
                    checkRemaining(byteBufferWrap, i35);
                    if (i35 > 0) {
                        byte[] bArr7 = new byte[i35];
                        byteBufferWrap.get(bArr7);
                        bArr3 = bArr7;
                    } else {
                        bArr3 = null;
                    }
                } else {
                    bArr3 = null;
                }
                if (byteBufferWrap.remaining() != 0) {
                    log(new AssertionError("Read entire session, but data still remains; rejecting"));
                    return null;
                }
                return new Impl(abstractSessionContext, new NativeRef.SSL_SESSION(NativeCrypto.d2i_SSL_SESSION(bArr4)), str, i15, x509CertificateArr, bArr2, bArr3);
            }
            throw new IOException("Unexpected type ID: " + i16);
        } catch (IOException e15) {
            e = e15;
            log(e);
            return null;
        } catch (BufferUnderflowException e16) {
            e = e16;
            log(e);
            return null;
        }
    }
}
