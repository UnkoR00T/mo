package z00;

import iy.t;
import java.security.Provider;
import org.conscrypt.CertPinManager;
import p071kotlin.Metadata;
import pq.v;
import y00.i;
import y00.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lz00/c;", "Ljava/security/Provider$Service;", "Ljava/security/Provider;", "provider", "Liy/t;", "keyStoreProvider", "Ly00/i;", "certUpdater", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "Lz00/g;", "ocspCrlCertRevocationChecker", "<init>", "(Ljava/security/Provider;Liy/t;Ly00/i;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Lz00/g;)V", "", "constructorParameter", "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Liy/t;", "b", "Ly00/i;", "c", "Lorg/conscrypt/CertPinManager;", "d", "Ly00/x;", "e", "Lz00/e;", "f", "Lz00/g;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends Provider.Service {

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

    public c(Provider provider, t tVar, i iVar, CertPinManager certPinManager, x xVar, e eVar, g gVar) {
        super(provider, "TrustManagerFactory", "PKIX", provider.getClass().getName(), v.e("Alg.Alias.TrustManagerFactory.X509"), null);
        this.keyStoreProvider = tVar;
        this.certUpdater = iVar;
        this.certPinManager = certPinManager;
        this.nonCTTrustManagerProvider = xVar;
        this.ctVerificationChecker = eVar;
        this.ocspCrlCertRevocationChecker = gVar;
    }

    @Override // java.security.Provider.Service
    public Object newInstance(Object constructorParameter) {
        return new d(this.keyStoreProvider, this.certUpdater, this.certPinManager, this.nonCTTrustManagerProvider, this.ctVerificationChecker, this.ocspCrlCertRevocationChecker);
    }
}
