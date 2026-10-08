package y00;

import java.security.Provider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.CertPinManager;
import org.conscrypt.Conscrypt;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R#\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006\""}, d2 = {"Ly00/k0;", "Ly00/h0;", "<init>", "()V", "Liy/t;", "keyStoreProvider", "Ly00/i;", "certUpdater", "Lorg/conscrypt/CertPinManager;", "certPinManager", "Ly00/x;", "nonCTTrustManagerProvider", "Lz00/e;", "ctVerificationChecker", "Lz00/g;", "ocspCrlCertRevocationChecker", "Ljava/security/Provider;", "a", "(Liy/t;Ly00/i;Lorg/conscrypt/CertPinManager;Ly00/x;Lz00/e;Lz00/g;)Ljava/security/Provider;", "c", "()Ljava/security/Provider;", "b", "kotlin.jvm.PlatformType", "Loq/k;", "i", "conscryptProvider", "Lorg/bouncycastle/jce/provider/BouncyCastleProvider;", "h", "()Lorg/bouncycastle/jce/provider/BouncyCastleProvider;", "bouncyCastleProvider", "Lz00/b;", "Lz00/b;", "ctProvider", "d", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k conscryptProvider = oq.l.a(new er.a() { // from class: y00.i0
        @Override // er.a
        public final Object a() {
            return k0.g();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k bouncyCastleProvider = oq.l.a(new er.a() { // from class: y00.j0
        @Override // er.a
        public final Object a() {
            return k0.f();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private z00.b ctProvider;

    /* JADX INFO: Access modifiers changed from: private */
    public static final BouncyCastleProvider f() {
        return new BouncyCastleProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Provider g() {
        return Conscrypt.newProviderBuilder().provideTrustManager(false).defaultTlsProtocol("TLSv1.3").build();
    }

    private final BouncyCastleProvider h() {
        return (BouncyCastleProvider) this.bouncyCastleProvider.getValue();
    }

    private final Provider i() {
        return (Provider) this.conscryptProvider.getValue();
    }

    @Override // y00.h0
    public Provider a(iy.t keyStoreProvider, i certUpdater, CertPinManager certPinManager, x nonCTTrustManagerProvider, z00.e ctVerificationChecker, z00.g ocspCrlCertRevocationChecker) {
        z00.b bVar = this.ctProvider;
        if (bVar != null) {
            return bVar;
        }
        z00.b bVar2 = new z00.b(keyStoreProvider, certUpdater, certPinManager, nonCTTrustManagerProvider, ctVerificationChecker, ocspCrlCertRevocationChecker);
        this.ctProvider = bVar2;
        return bVar2;
    }

    @Override // y00.h0
    public Provider b() {
        return h();
    }

    @Override // y00.h0
    public Provider c() {
        return i();
    }
}
