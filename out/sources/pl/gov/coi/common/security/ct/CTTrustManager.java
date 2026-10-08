package pl.gov.coi.common.security.ct;

import androidx.annotation.Keep;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.TrustManagerImpl;
import p071kotlin.Metadata;
import pq.v;
import z00.e;
import z00.g;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ+\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001bJ5\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u0017\u0010\u001eJ9\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"J9\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b#\u0010\"J9\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b#\u0010$JM\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010'\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b#\u0010(J9\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0010\u0010)\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b*\u0010+J7\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0010\u0010)\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b*\u0010,J\r\u0010-\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b/\u00100J+\u0010!\u001a\u00020\u00162\u0010\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b!\u0010\u0018J5\u0010!\u001a\u00020\u00162\u0010\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u00142\b\u00103\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b!\u0010\u001bJ5\u0010!\u001a\u00020\u00162\u0010\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u00142\b\u00103\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\u001eJ+\u0010#\u001a\u00020\u00162\u0010\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b#\u0010\u0018J5\u0010#\u001a\u00020\u00162\u0010\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u00142\b\u00103\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b#\u0010\u001bJ5\u0010#\u001a\u00020\u00162\u0010\u00101\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u00142\b\u00103\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b#\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lpl/gov/coi/common/security/ct/CTTrustManager;", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "tm", "platformTm", "Lz00/g;", "ocspCrlCertRevocationChecker", "Lz00/e;", "ctVerificationChecker", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/X509TrustManager;Lz00/g;Lz00/e;)V", "Ljavax/net/ssl/SSLSession;", "session", "", "getSctsFromSession", "(Ljavax/net/ssl/SSLSession;)[B", "getOcspFromSession", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "Loq/i0;", "checkPlatformServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "Ljava/net/Socket;", "socket", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "sslEngine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "hostname", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Ljava/util/List;", "ocspData", "tlsSctData", "host", "([Ljava/security/cert/X509Certificate;[B[BLjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "certs", "getTrustedChainForServer", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)Ljava/util/List;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)Ljava/util/List;", "handleTrustStorageUpdate", "()V", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "p0", "p1", "p2", "Ljavax/net/ssl/X509TrustManager;", "Lz00/g;", "Lz00/e;", "Lorg/conscrypt/TrustManagerImpl;", "conscryptTm", "Lorg/conscrypt/TrustManagerImpl;", "platformExtendedTm", "Ljavax/net/ssl/X509ExtendedTrustManager;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CTTrustManager extends X509ExtendedTrustManager implements X509TrustManager {
    private final TrustManagerImpl conscryptTm;
    private final e ctVerificationChecker;
    private final g ocspCrlCertRevocationChecker;
    private final X509ExtendedTrustManager platformExtendedTm;
    private final X509TrustManager platformTm;
    private final X509TrustManager tm;

    public CTTrustManager(X509TrustManager x509TrustManager, X509TrustManager x509TrustManager2, g gVar, e eVar) {
        this.tm = x509TrustManager;
        this.platformTm = x509TrustManager2;
        this.ocspCrlCertRevocationChecker = gVar;
        this.ctVerificationChecker = eVar;
        this.conscryptTm = (TrustManagerImpl) x509TrustManager;
        this.platformExtendedTm = x509TrustManager2 instanceof X509ExtendedTrustManager ? (X509ExtendedTrustManager) x509TrustManager2 : null;
    }

    private final void checkPlatformServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        X509TrustManager x509TrustManager = this.platformTm;
        if (x509TrustManager != null) {
            x509TrustManager.checkServerTrusted(chain, authType);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0015, B:10:0x0019, B:13:0x001f), top: B:17:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0015, B:10:0x0019, B:13:0x001f), top: B:17:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    private final byte[] getOcspFromSession(SSLSession session) {
        Object objInvoke;
        List list;
        if (session != null) {
            try {
                Method method = session.getClass().getMethod("getStatusResponses", null);
                if (method != null) {
                    objInvoke = method.invoke(session, null);
                } else {
                    objInvoke = null;
                }
                if (objInvoke instanceof List) {
                    list = (List) objInvoke;
                } else {
                    list = null;
                }
                if (list != null) {
                    return (byte[]) v.n0(list);
                }
            } catch (Exception unused) {
            }
        } else {
            objInvoke = null;
            if (objInvoke instanceof List) {
                list = (List) objInvoke;
            } else {
                list = null;
            }
            if (list != null) {
                return (byte[]) v.n0(list);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019 A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0015, B:10:0x0019), top: B:14:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    private final byte[] getSctsFromSession(SSLSession session) {
        Object objInvoke;
        if (session != null) {
            try {
                Method method = session.getClass().getMethod("getPeerSignedCertificateTimestamp", null);
                if (method != null) {
                    objInvoke = method.invoke(session, null);
                } else {
                    objInvoke = null;
                }
                if (objInvoke instanceof byte[]) {
                    return (byte[]) objInvoke;
                }
            } catch (Exception unused) {
            }
        } else {
            objInvoke = null;
            if (objInvoke instanceof byte[]) {
                return (byte[]) objInvoke;
            }
        }
        return null;
    }

    public final List<X509Certificate> checkClientTrusted(X509Certificate[] chain, String authType, String hostname) {
        return this.conscryptTm.checkClientTrusted(chain, authType, hostname);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String hostname) throws CertificateException {
        checkPlatformServerTrusted(chain, authType);
        List<X509Certificate> listCheckServerTrusted = this.conscryptTm.checkServerTrusted(chain, authType, hostname);
        this.ocspCrlCertRevocationChecker.a(listCheckServerTrusted);
        this.ctVerificationChecker.a(listCheckServerTrusted, null, null);
        return listCheckServerTrusted;
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.conscryptTm.getAcceptedIssuers();
    }

    public final List<X509Certificate> getTrustedChainForServer(X509Certificate[] certs, String authType, Socket socket) throws CertificateException {
        checkPlatformServerTrusted(certs, authType, socket);
        List<X509Certificate> trustedChainForServer = this.conscryptTm.getTrustedChainForServer(certs, authType, socket);
        this.ocspCrlCertRevocationChecker.a(trustedChainForServer);
        SSLSocket sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
        SSLSession handshakeSession = sSLSocket != null ? sSLSocket.getHandshakeSession() : null;
        this.ctVerificationChecker.a(trustedChainForServer, getSctsFromSession(handshakeSession), getOcspFromSession(handshakeSession));
        return trustedChainForServer;
    }

    public final void handleTrustStorageUpdate() {
        this.conscryptTm.handleTrustStorageUpdate();
    }

    private final void checkPlatformServerTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        X509ExtendedTrustManager x509ExtendedTrustManager = this.platformExtendedTm;
        if (x509ExtendedTrustManager == null || socket == null) {
            checkPlatformServerTrusted(chain, authType);
        } else {
            x509ExtendedTrustManager.checkServerTrusted(chain, authType, socket);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] p15, String p16) throws CertificateException {
        this.conscryptTm.checkClientTrusted(p15, p16);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] p15, String p16, Socket p17) throws CertificateException {
        this.conscryptTm.checkClientTrusted(p15, p16, p17);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] p15, String p16, SSLEngine p17) throws CertificateException {
        this.conscryptTm.checkClientTrusted(p15, p16, p17);
    }

    private final void checkPlatformServerTrusted(X509Certificate[] chain, String authType, SSLEngine sslEngine) throws CertificateException {
        X509ExtendedTrustManager x509ExtendedTrustManager = this.platformExtendedTm;
        if (x509ExtendedTrustManager != null && sslEngine != null) {
            x509ExtendedTrustManager.checkServerTrusted(chain, authType, sslEngine);
        } else {
            checkPlatformServerTrusted(chain, authType);
        }
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, SSLSession session) throws CertificateException {
        checkPlatformServerTrusted(chain, authType);
        List<X509Certificate> listCheckServerTrusted = this.conscryptTm.checkServerTrusted(chain, authType, session);
        this.ocspCrlCertRevocationChecker.a(listCheckServerTrusted);
        this.ctVerificationChecker.a(listCheckServerTrusted, getSctsFromSession(session), getOcspFromSession(session));
        return listCheckServerTrusted;
    }

    public final List<X509Certificate> getTrustedChainForServer(X509Certificate[] certs, String authType, SSLEngine sslEngine) throws CertificateException {
        checkPlatformServerTrusted(certs, authType, sslEngine);
        List<X509Certificate> trustedChainForServer = this.conscryptTm.getTrustedChainForServer(certs, authType, sslEngine);
        this.ocspCrlCertRevocationChecker.a(trustedChainForServer);
        SSLSession handshakeSession = sslEngine.getHandshakeSession();
        this.ctVerificationChecker.a(trustedChainForServer, getSctsFromSession(handshakeSession), getOcspFromSession(handshakeSession));
        return trustedChainForServer;
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, byte[] ocspData, byte[] tlsSctData, String authType, String host) throws CertificateException {
        checkPlatformServerTrusted(chain, authType);
        List<X509Certificate> listCheckServerTrusted = this.conscryptTm.checkServerTrusted(chain, authType, host);
        this.ocspCrlCertRevocationChecker.a(listCheckServerTrusted);
        this.ctVerificationChecker.a(listCheckServerTrusted, tlsSctData, ocspData);
        return listCheckServerTrusted;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] p15, String p16) throws CertificateException {
        checkPlatformServerTrusted(p15, p16);
        List<X509Certificate> listCheckServerTrusted = this.conscryptTm.checkServerTrusted(p15, p16, (String) null);
        this.ocspCrlCertRevocationChecker.a(listCheckServerTrusted);
        this.ctVerificationChecker.a(listCheckServerTrusted, null, null);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] p15, String p16, Socket p17) throws CertificateException {
        checkPlatformServerTrusted(p15, p16, p17);
        List<X509Certificate> trustedChainForServer = this.conscryptTm.getTrustedChainForServer(p15, p16, p17);
        this.ocspCrlCertRevocationChecker.a(trustedChainForServer);
        SSLSocket sSLSocket = p17 instanceof SSLSocket ? (SSLSocket) p17 : null;
        SSLSession handshakeSession = sSLSocket != null ? sSLSocket.getHandshakeSession() : null;
        this.ctVerificationChecker.a(trustedChainForServer, getSctsFromSession(handshakeSession), getOcspFromSession(handshakeSession));
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] p15, String p16, SSLEngine p17) throws CertificateException {
        checkPlatformServerTrusted(p15, p16, p17);
        List<X509Certificate> trustedChainForServer = this.conscryptTm.getTrustedChainForServer(p15, p16, p17);
        this.ocspCrlCertRevocationChecker.a(trustedChainForServer);
        SSLSession handshakeSession = p17 != null ? p17.getHandshakeSession() : null;
        this.ctVerificationChecker.a(trustedChainForServer, getSctsFromSession(handshakeSession), getOcspFromSession(handshakeSession));
    }
}
