package y00;

import java.security.Security;
import org.conscrypt.CertPinManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ly00/e0;", "Ly00/m0;", "Ly00/i;", "certUpdater", "Lz00/g;", "ocspCrlCertRevocationChecker", "Liy/t;", "keyStoreProvider", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "Ly00/h0;", "securityProviderFactory", "Lpx/d;", "remoteLogger", "<init>", "(Ly00/i;Lz00/g;Liy/t;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Ly00/h0;Lpx/d;)V", "Loq/i0;", "a", "()V", "Ly00/i;", "b", "Lz00/g;", "c", "Liy/t;", "d", "Lorg/conscrypt/CertPinManager;", "e", "Ly00/x;", "f", "Lz00/e;", "g", "Ly00/h0;", "h", "Lpx/d;", "", "i", "Z", "initialized", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i certUpdater;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z00.g ocspCrlCertRevocationChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CertPinManager certPinManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x nonCTTrustManagerProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z00.e ctVerificationChecker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile boolean initialized;

    public e0(i iVar, z00.g gVar, iy.t tVar, CertPinManager certPinManager, x xVar, z00.e eVar, h0 h0Var, px.d dVar) {
        this.certUpdater = iVar;
        this.ocspCrlCertRevocationChecker = gVar;
        this.keyStoreProvider = tVar;
        this.certPinManager = certPinManager;
        this.nonCTTrustManagerProvider = xVar;
        this.ctVerificationChecker = eVar;
        this.securityProviderFactory = h0Var;
        this.remoteLogger = dVar;
    }

    @Override // y00.l0
    public void a() {
        synchronized (this) {
            if (this.initialized) {
                return;
            }
            try {
                Security.insertProviderAt(this.securityProviderFactory.a(this.keyStoreProvider, this.certUpdater, this.certPinManager, this.nonCTTrustManagerProvider, this.ctVerificationChecker, this.ocspCrlCertRevocationChecker), 1);
                this.initialized = true;
            } catch (Exception e15) {
                this.initialized = false;
                this.remoteLogger.T6("Couldn't initialize CT trust manager late SecurityProvider: " + e15.getMessage(), e15, px.c.a(this));
            }
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }
}
