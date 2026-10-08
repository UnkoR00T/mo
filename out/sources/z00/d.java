package z00;

import iy.f0;
import iy.t;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.X509TrustManager;
import oq.p;
import org.conscrypt.CertPinManager;
import org.conscrypt.TrustManagerImpl;
import p071kotlin.Metadata;
import pl.gov.coi.common.security.ct.CTTrustManager;
import pq.v;
import y00.i;
import y00.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u0016\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.¨\u00062"}, d2 = {"Lz00/d;", "Ljavax/net/ssl/TrustManagerFactorySpi;", "Liy/t;", "keyStoreProvider", "Ly00/i;", "certUpdater", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "Lz00/g;", "ocspCrlCertRevocationChecker", "<init>", "(Liy/t;Ly00/i;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Lz00/g;)V", "Ljavax/net/ssl/X509TrustManager;", "a", "()Ljavax/net/ssl/X509TrustManager;", "Ljava/security/KeyStore;", "ks", "Loq/i0;", "engineInit", "(Ljava/security/KeyStore;)V", "Ljavax/net/ssl/ManagerFactoryParameters;", "spec", "(Ljavax/net/ssl/ManagerFactoryParameters;)V", "", "Ljavax/net/ssl/TrustManager;", "engineGetTrustManagers", "()[Ljavax/net/ssl/TrustManager;", "Liy/t;", "b", "Ly00/i;", "c", "Lorg/conscrypt/CertPinManager;", "d", "Ly00/x;", "e", "Lz00/e;", "f", "Lz00/g;", "g", "Ljava/security/KeyStore;", "keyStore", "h", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "i", "trustManagerCache", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends TrustManagerFactorySpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i certUpdater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CertPinManager certPinManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x nonCTTrustManagerProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e ctVerificationChecker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g ocspCrlCertRevocationChecker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private KeyStore keyStore;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private X509TrustManager platformTrustManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private X509TrustManager trustManagerCache;

    public d(t tVar, i iVar, CertPinManager certPinManager, x xVar, e eVar, g gVar) {
        this.keyStoreProvider = tVar;
        this.certUpdater = iVar;
        this.certPinManager = certPinManager;
        this.nonCTTrustManagerProvider = xVar;
        this.ctVerificationChecker = eVar;
        this.ocspCrlCertRevocationChecker = gVar;
    }

    private final X509TrustManager a() {
        CTTrustManager cTTrustManager = new CTTrustManager(new TrustManagerImpl(this.keyStore, this.certPinManager), this.platformTrustManager, this.ocspCrlCertRevocationChecker, this.ctVerificationChecker);
        this.trustManagerCache = cTTrustManager;
        return cTTrustManager;
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    protected TrustManager[] engineGetTrustManagers() {
        if (this.keyStore == null) {
            throw new IllegalStateException("TrustManagerFactory is not initialized");
        }
        X509TrustManager x509TrustManagerA = this.trustManagerCache;
        if (x509TrustManagerA == null) {
            x509TrustManagerA = a();
        }
        return (TrustManager[]) v.e(x509TrustManagerA).toArray(new TrustManager[0]);
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    protected void engineInit(KeyStore ks4) {
        Object objB;
        Object objB2 = null;
        if (ks4 == null) {
            dx.i iVarA = t.a(this.keyStoreProvider, f0.ANDROID_CA_STORE, null, null, 6, null);
            if (iVarA instanceof dx.i.Left) {
                objB = null;
            } else {
                if (!(iVarA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) iVarA).b();
            }
            ks4 = (KeyStore) objB;
        }
        this.keyStore = ks4 != null ? this.certUpdater.a(ks4) : null;
        dx.i<dx.b, X509TrustManager> iVarC = this.nonCTTrustManagerProvider.c();
        if (iVarC instanceof dx.i.Left) {
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new p();
            }
            objB2 = ((dx.i.Right) iVarC).b();
        }
        this.platformTrustManager = (X509TrustManager) objB2;
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    protected void engineInit(ManagerFactoryParameters spec) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
