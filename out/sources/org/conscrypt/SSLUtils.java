package org.conscrypt;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.parseBoolean(System.getProperty("org.conscrypt.useEngineSocketByDefault", "true"));

    static final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    enum SessionType {
        OPEN_SSL(1),
        OPEN_SSL_WITH_OCSP(2),
        OPEN_SSL_WITH_TLS_SCT(3);

        final int value;

        SessionType(int i15) {
            this.value = i15;
        }

        static boolean isSupportedType(int i15) {
            return i15 == OPEN_SSL.value || i15 == OPEN_SSL_WITH_OCSP.value || i15 == OPEN_SSL_WITH_TLS_SCT.value;
        }
    }

    private SSLUtils() {
    }

    static int calculateOutNetBufSize(int i15) {
        return Math.min(16709, Math.min(MAX_ENCRYPTION_OVERHEAD_DIFF, i15) + MAX_ENCRYPTION_OVERHEAD_LENGTH);
    }

    static String[] concat(String[]... strArr) {
        int length = 0;
        for (String[] strArr2 : strArr) {
            length += strArr2.length;
        }
        String[] strArr3 = new String[length];
        int length2 = 0;
        for (String[] strArr4 : strArr) {
            System.arraycopy(strArr4, 0, strArr3, length2, strArr4.length);
            length2 += strArr4.length;
        }
        return strArr3;
    }

    static String[] decodeProtocols(byte[] bArr) {
        String string;
        if (bArr.length == 0) {
            return EmptyArray.STRING;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < bArr.length) {
            int i18 = bArr[i16] & 255;
            if (i18 < 0 || i18 >= bArr.length - i16) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Protocol has invalid length (");
                sb5.append(i18);
                sb5.append(" at position ");
                sb5.append(i16);
                sb5.append("): ");
                if (bArr.length < 50) {
                    string = Arrays.toString(bArr);
                } else {
                    string = bArr.length + " byte array";
                }
                sb5.append(string);
                throw new IllegalArgumentException(sb5.toString());
            }
            i17++;
            i16 += i18 + 1;
        }
        String[] strArr = new String[i17];
        int i19 = 0;
        while (i15 < bArr.length) {
            int i25 = bArr[i15] & 255;
            int i26 = i19 + 1;
            strArr[i19] = i25 > 0 ? new String(bArr, i15 + 1, i25, StandardCharsets.US_ASCII) : "";
            i15 += i25 + 1;
            i19 = i26;
        }
        return strArr;
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) {
        return certificateFactory != null ? (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)) : OpenSSLX509Certificate.fromX509Der(bArr);
    }

    static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) {
        CertificateFactory certificateFactory = getCertificateFactory();
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i15 = 0; i15 < length; i15++) {
            x509CertificateArr[i15] = decodeX509Certificate(certificateFactory, bArr[i15]);
        }
        return x509CertificateArr;
    }

    static byte[] encodeProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("protocols array must be non-null");
        }
        if (strArr.length == 0) {
            return EmptyArray.BYTE;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < strArr.length; i16++) {
            String str = strArr[i16];
            if (str == null) {
                throw new IllegalArgumentException("protocol[" + i16 + "] is null");
            }
            int length = str.length();
            if (length == 0 || length > 255) {
                throw new IllegalArgumentException("protocol[" + i16 + "] has invalid length: " + length);
            }
            i15 += length + 1;
        }
        byte[] bArr = new byte[i15];
        int i17 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            bArr[i17] = (byte) length2;
            i17++;
            int i18 = 0;
            while (i18 < length2) {
                char cCharAt = str2.charAt(i18);
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Protocol contains invalid character: " + cCharAt + "(protocol=" + str2 + ")");
                }
                bArr[i17] = (byte) cCharAt;
                i18++;
                i17++;
            }
        }
        return bArr;
    }

    static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) {
        byte[][] bArr = new byte[x509CertificateArr.length][];
        for (int i15 = 0; i15 < x509CertificateArr.length; i15++) {
            bArr[i15] = x509CertificateArr[i15].getSubjectX500Principal().getEncoded();
        }
        return bArr;
    }

    private static CertificateFactory getCertificateFactory() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            return null;
        }
    }

    static String getClientKeyType(byte b15) {
        if (b15 == 1) {
            return KEY_TYPE_RSA;
        }
        if (b15 != 64) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    static String getClientKeyTypeFromSignatureAlg(int i15) {
        int iSSL_get_signature_algorithm_key_type = NativeCrypto.SSL_get_signature_algorithm_key_type(i15);
        if (iSSL_get_signature_algorithm_key_type == 6) {
            return KEY_TYPE_RSA;
        }
        if (iSSL_get_signature_algorithm_key_type != 408) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i15) {
        ByteBuffer byteBuffer = byteBufferArr[i15];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        while (true) {
            int i16 = i15 + 1;
            ByteBuffer byteBuffer2 = byteBufferArr[i15];
            int iPosition = byteBuffer2.position();
            int iLimit = byteBuffer2.limit();
            if (byteBuffer2.remaining() > byteBufferAllocate.remaining()) {
                byteBuffer2.limit(byteBufferAllocate.remaining() + iPosition);
            }
            try {
                byteBufferAllocate.put(byteBuffer2);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                if (!byteBufferAllocate.hasRemaining()) {
                    byteBufferAllocate.flip();
                    return getEncryptedPacketLength(byteBufferAllocate);
                }
                i15 = i16;
            } catch (Throwable th4) {
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th4;
            }
        }
    }

    static String getServerX509KeyType(long j15) {
        String strSSL_CIPHER_get_kx_name = NativeCrypto.SSL_CIPHER_get_kx_name(j15);
        if (strSSL_CIPHER_get_kx_name.equals(KEY_TYPE_RSA) || strSSL_CIPHER_get_kx_name.equals("DHE_RSA") || strSSL_CIPHER_get_kx_name.equals("ECDHE_RSA")) {
            return KEY_TYPE_RSA;
        }
        if (strSSL_CIPHER_get_kx_name.equals("ECDHE_ECDSA")) {
            return KEY_TYPE_EC;
        }
        return null;
    }

    static Set<String> getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
        HashSet hashSet = new HashSet(bArr.length);
        for (byte b15 : bArr) {
            String clientKeyType = getClientKeyType(b15);
            if (clientKeyType != null) {
                hashSet.add(clientKeyType);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(iArr.length);
        for (int i15 : iArr) {
            String clientKeyTypeFromSignatureAlg = getClientKeyTypeFromSignatureAlg(i15);
            if (clientKeyTypeFromSignatureAlg != null) {
                linkedHashSet.add(clientKeyTypeFromSignatureAlg);
            }
        }
        if (bArr.length <= 0 || iArr.length <= 0) {
            return iArr.length > 0 ? linkedHashSet : hashSet;
        }
        linkedHashSet.retainAll(hashSet);
        return linkedHashSet;
    }

    static String[] mapSignatureAlgorithms(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new String[]{"SHA256withRSA", "SHA256withECDSA", "SHA384withRSA", "SHA384withECDSA", "SHA512withRSA", "SHA512withECDSA", "SHA1withRSA", "SHA1withECDSA"};
        }
        ArrayList arrayList = new ArrayList();
        for (int i15 : iArr) {
            if (i15 == 513) {
                arrayList.add("SHA1withRSA");
            } else if (i15 == 515) {
                arrayList.add("SHA1withECDSA");
            } else if (i15 == 1025) {
                arrayList.add("SHA256withRSA");
            } else if (i15 == 1027) {
                arrayList.add("SHA256withECDSA");
            } else if (i15 == 1281) {
                arrayList.add("SHA384withRSA");
            } else if (i15 == 1283) {
                arrayList.add("SHA384withECDSA");
            } else if (i15 == 1537) {
                arrayList.add("SHA512withRSA");
            } else if (i15 != 1539) {
                switch (i15) {
                    case 2052:
                    case 2053:
                    case 2054:
                        break;
                    case 2055:
                        arrayList.add(EdDSAParameterSpec.Ed25519);
                        continue;
                    default:
                        switch (i15) {
                            case 2057:
                            case 2058:
                            case 2059:
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                arrayList.add("RSASSA-PSS");
            } else {
                arrayList.add("SHA512withECDSA");
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) throws SSLPeerUnverifiedException {
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
            for (int i15 = 0; i15 < x509CertificateArr.length; i15++) {
                x509CertificateArr2[i15] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr[i15].getEncoded());
            }
            return x509CertificateArr2;
        } catch (CertificateEncodingException | javax.security.cert.CertificateException e15) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e15.getMessage());
            sSLPeerUnverifiedException.initCause(e15);
            throw sSLPeerUnverifiedException;
        }
    }

    static byte[] toProtocolBytes(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    static String toProtocolString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.US_ASCII);
    }

    static SSLException toSSLException(Throwable th4) {
        return th4 instanceof SSLException ? (SSLException) th4 : new SSLException(th4);
    }

    static SSLHandshakeException toSSLHandshakeException(Throwable th4) {
        return th4 instanceof SSLHandshakeException ? (SSLHandshakeException) th4 : (SSLHandshakeException) new SSLHandshakeException(th4.getMessage()).initCause(th4);
    }

    private static short unsignedByte(byte b15) {
        return (short) (b15 & 255);
    }

    private static int unsignedShort(short s15) {
        return s15 & HPKE.aead_EXPORT_ONLY;
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        int iUnsignedShort;
        int iPosition = byteBuffer.position();
        switch (unsignedByte(byteBuffer.get(iPosition))) {
            case 20:
            case 21:
            case 22:
            case 23:
                if (unsignedByte(byteBuffer.get(iPosition + 1)) == 3 && (iUnsignedShort = unsignedShort(byteBuffer.getShort(iPosition + 3)) + 5) > 5) {
                    return iUnsignedShort;
                }
                return -1;
            default:
                return -1;
        }
    }
}
