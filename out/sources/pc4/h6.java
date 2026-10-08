package pc4;

import android.content.Context;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010)R!\u00100\u001a\b\u0012\u0004\u0012\u00020,0+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000e\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000e\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lpc4/h6;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroid/content/Context;", "contextProvider", "Loq/i0;", "y", "(Ler/a;)V", "b", "Ler/a;", "Ly04/a;", "c", "Loq/k;", "q", "()Ly04/a;", "buildConfigRepository", "Lay/a;", "d", "o", "()Lay/a;", "baseUrlProvider", "Lay/b;", "e", "p", "()Lay/b;", "baseUrlProvidersProxy", "Lay/k;", "f", "t", "()Lay/k;", "networkConnectionManager", "Lpl/gov/coi/common/network/i0;", "g", "u", "()Lpl/gov/coi/common/network/i0;", "networkExceptionParser", "Ly00/c0;", "h", "v", "()Ly00/c0;", "securityExceptionParser", "Ldx/j;", "Ldx/b;", "i", "r", "()Ldx/j;", "exceptionParser", "Lpx/b;", "j", "s", "()Lpx/b;", "localLogger", "Ly00/h0;", "k", "x", "()Ly00/h0;", "securityProviderFactory", "Ly00/f0;", "l", "w", "()Ly00/f0;", "securityProviderEarlyInitializer", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static er.a<? extends Context> contextProvider;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h6 f154667a = new h6();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final oq.k buildConfigRepository = oq.l.a(new er.a() { // from class: pc4.x5
        @Override // er.a
        public final Object a() {
            return h6.m();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final oq.k baseUrlProvider = oq.l.a(new er.a() { // from class: pc4.y5
        @Override // er.a
        public final Object a() {
            return h6.k();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final oq.k baseUrlProvidersProxy = oq.l.a(new er.a() { // from class: pc4.z5
        @Override // er.a
        public final Object a() {
            return h6.l();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final oq.k networkConnectionManager = oq.l.a(new er.a() { // from class: pc4.a6
        @Override // er.a
        public final Object a() {
            return h6.A();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final oq.k networkExceptionParser = oq.l.a(new er.a() { // from class: pc4.b6
        @Override // er.a
        public final Object a() {
            return h6.B();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final oq.k securityExceptionParser = oq.l.a(new er.a() { // from class: pc4.c6
        @Override // er.a
        public final Object a() {
            return h6.C();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final oq.k exceptionParser = oq.l.a(new er.a() { // from class: pc4.d6
        @Override // er.a
        public final Object a() {
            return h6.n();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final oq.k localLogger = oq.l.a(new er.a() { // from class: pc4.e6
        @Override // er.a
        public final Object a() {
            return h6.z();
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final oq.k securityProviderFactory = oq.l.a(new er.a() { // from class: pc4.f6
        @Override // er.a
        public final Object a() {
            return h6.E();
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final oq.k securityProviderEarlyInitializer = oq.l.a(new er.a() { // from class: pc4.g6
        @Override // er.a
        public final Object a() {
            return h6.D();
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f154679m = 8;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"pc4/h6$a", "Lay/a;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "baseUrl", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements ay.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String baseUrl;

        a() {
            h6 h6Var = h6.f154667a;
            this.baseUrl = ni2.a.a(h6Var.q().getServerScheme(), h6Var.q().getServerHost());
        }

        @Override // ay.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getBaseUrl() {
            return this.baseUrl;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"pc4/h6$b", "Lay/b;", "", "Lay/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "setBaseUrlProxy", "(Ljava/util/List;)V", "baseUrlProxy", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements ay.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private List<? extends ay.a> baseUrlProxy = pq.v.e(h6.f154667a.o());

        b() {
        }

        @Override // ay.b
        public List<ay.a> a() {
            return this.baseUrlProxy;
        }
    }

    private h6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.common.network.h0 A() {
        er.a<? extends Context> aVar = contextProvider;
        if (aVar == null) {
            aVar = null;
        }
        return new pl.gov.coi.common.network.h0(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.common.network.j0 B() {
        h6 h6Var = f154667a;
        return new pl.gov.coi.common.network.j0(h6Var.p(), h6Var.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y00.d0 C() {
        return new y00.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y00.g0 D() {
        h6 h6Var = f154667a;
        return new y00.g0(h6Var.x(), h6Var.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y00.k0 E() {
        return new y00.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nd4.a m() {
        return new nd4.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dx.k n() {
        h6 h6Var = f154667a;
        return new dx.k(pq.v.q(h6Var.u(), h6Var.v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qz.a z() {
        return new qz.a();
    }

    public final ay.a o() {
        return (ay.a) baseUrlProvider.getValue();
    }

    public final ay.b p() {
        return (ay.b) baseUrlProvidersProxy.getValue();
    }

    public final y04.a q() {
        return (y04.a) buildConfigRepository.getValue();
    }

    public final dx.j<dx.b> r() {
        return (dx.j) exceptionParser.getValue();
    }

    public final px.b s() {
        return (px.b) localLogger.getValue();
    }

    public final ay.k t() {
        return (ay.k) networkConnectionManager.getValue();
    }

    public final pl.gov.coi.common.network.i0 u() {
        return (pl.gov.coi.common.network.i0) networkExceptionParser.getValue();
    }

    public final y00.c0 v() {
        return (y00.c0) securityExceptionParser.getValue();
    }

    public final y00.f0 w() {
        return (y00.f0) securityProviderEarlyInitializer.getValue();
    }

    public final y00.h0 x() {
        return (y00.h0) securityProviderFactory.getValue();
    }

    public final void y(er.a<? extends Context> contextProvider2) {
        contextProvider = contextProvider2;
        xw.c.f221622a.c(r(), s());
        w().a();
    }
}
