package hi1;

import iq0.CategoryDashboardServices;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0081\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020.0*H\u0096\u0001¢\u0006\u0004\b/\u0010-J\u0013\u00101\u001a\u000200*\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u00020'2\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020'2\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b7\u00106J(\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;082\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0082@¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;08*\b\u0012\u0004\u0012\u00020908H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R \u0010f\u001a\b\u0012\u0004\u0012\u00020a0`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR,\u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030g8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bh\u0010i\u0012\u0004\bl\u0010)\u001a\u0004\bj\u0010kR\u001a\u0010s\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR&\u0010z\u001a\b\u0012\u0004\u0012\u0002000t8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bu\u0010v\u0012\u0004\by\u0010)\u001a\u0004\bw\u0010x¨\u0006{"}, d2 = {"Lhi1/g0;", "Ll00/g;", "Lhi1/f;", "Lhi1/e;", "Lhi1/g;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lh64/q;", "loadRemoteSettingsUseCase", "Lch1/c0;", "getServicesUseCase", "Lh64/j;", "getServiceTemporaryInterruptionUseCase", "Lch1/i0;", "isWidgetManagementEnabledUC", "Lii1/h;", "serviceListMapper", "Lib4/c;", "domainErrorMapper", "Lby0/c;", "getAirQualityWidgetPointUC", "Lr44/c;", "getPaymentWidgetDataUC", "Loz/q;", "ownerViewLifecycleManager", "Lch1/z;", "getEnabledServiceWidgetsUC", "La14/u;", "observeHasNetworkConnectionUC", "Lyg1/a;", "dashboardContainersInteractor", "Ldh1/b;", "isGlobalSearchActiveUC", "Lh64/g;", "getGlobalSearchConfigurationUC", "<init>", "(Lyy/a;Lh64/q;Lch1/c0;Lh64/j;Lch1/i0;Lii1/h;Lib4/c;Lby0/c;Lr44/c;Loz/q;Lch1/z;La14/u;Lyg1/a;Ldh1/b;Lh64/g;)V", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lhi1/g$b;", "L9", "(Lhi1/f;)Lhi1/g$b;", "Ldx/b;", "domainError", "J9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "H9", "", "Lah1/g;", "enabledWidgets", "Lah1/h;", "G9", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "N9", "(Ljava/util/Set;)Ljava/util/Set;", "b", "Lh64/q;", "c", "Lch1/c0;", "d", "Lh64/j;", "e", "Lch1/i0;", "f", "Lii1/h;", "g", "Lib4/c;", "h", "Lby0/c;", "j", "Lr44/c;", "k", "Loz/q;", "l", "Lch1/z;", "m", "La14/u;", "n", "Lyg1/a;", "p", "Ldh1/b;", "q", "Lh64/g;", "Lhi1/f$c;", "r", "Lhi1/f$c;", "initialState", "Lxw/b;", "Lhi1/e$g;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Loz/j;", "v", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<hi1.f, hi1.e> implements hi1.g, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h64.q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ch1.c0 getServicesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h64.j getServiceTemporaryInterruptionUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ch1.i0 isWidgetManagementEnabledUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ii1.h serviceListMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final by0.c getAirQualityWidgetPointUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r44.c getPaymentWidgetDataUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ch1.z getEnabledServiceWidgetsUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.u observeHasNetworkConnectionUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final dh1.b isGlobalSearchActiveUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final h64.g getGlobalSearchConfigurationUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final hi1.f.c initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hi1.e.g> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hi1.f, hi1.e> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<hi1.g.b> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84857a;

        static {
            int[] iArr = new int[ah1.g.values().length];
            try {
                iArr[ah1.g.AIR_QUALITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah1.g.EPAYMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84857a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f84858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f84860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f84861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f84862h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f84863j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f84864k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f84865l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f84866m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f84867n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f84868p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f84869q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f84871s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f84869q = obj;
            this.f84871s |= PKIFailureInfo.systemUnavail;
            return g0.this.G9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<hi1.g.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f84873b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f84875b;

            /* JADX INFO: renamed from: hi1.g0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1979a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84876d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84877e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84878f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84880h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84881j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84882k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84883l;

                public C1979a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84876d = obj;
                    this.f84877e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, g0 g0Var) {
                this.f84874a = hVar;
                this.f84875b = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1979a c1979a;
                if (eVar instanceof C1979a) {
                    c1979a = (C1979a) eVar;
                    int i15 = c1979a.f84877e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1979a.f84877e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1979a = new C1979a(eVar);
                    }
                } else {
                    c1979a = new C1979a(eVar);
                }
                Object obj2 = c1979a.f84876d;
                Object objE = uq.b.e();
                int i16 = c1979a.f84877e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f84874a;
                    hi1.g.b bVarL9 = this.f84875b.L9((hi1.f) obj);
                    c1979a.f84878f = vq.j.a(obj);
                    c1979a.f84880h = vq.j.a(c1979a);
                    c1979a.f84881j = vq.j.a(obj);
                    c1979a.f84882k = vq.j.a(hVar);
                    c1979a.f84883l = 0;
                    c1979a.f84877e = 1;
                    if (hVar.F(bVarL9, c1979a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public c(mu.g gVar, g0 g0Var) {
            this.f84872a = gVar;
            this.f84873b = g0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super hi1.g.b> hVar, tq.e eVar) {
            Object objA = this.f84872a.a(new a(hVar, this.f84873b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhi1/f$c;", "it", "Loq/i0;", "<anonymous>", "(Lhi1/f$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<hi1.f.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84884e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f84884e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            g0.this.d9(hi1.e.f.f84808a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(hi1.f.c cVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(cVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return g0.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhi1/f$d;", "state", "Lk10/l;", "Lhi1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<hi1.f.d>, tq.e<? super k10.l<? extends hi1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f84887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f84888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f84889h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f84890j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f84891k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f84892l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f84893m;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.b O(hi1.f.d dVar) {
            return hi1.f.b.f84820a;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x008b  */
        /* JADX WARN: Code duplicated, block: B:18:0x0098  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:35:0x011a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0125  */
        /* JADX WARN: Code duplicated, block: B:41:0x014b  */
        /* JADX WARN: Code duplicated, block: B:45:0x0170  */
        /* JADX WARN: Code duplicated, block: B:49:0x017c  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
        
            if (r5.J9(r2, r11) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
        
            if (r5.J9(r2, r11) == r1) goto L44;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hi1.g0.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<hi1.f.d> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = g0.this.new e(eVar);
            eVar2.f84893m = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhi1/f$e;", "it", "Loq/i0;", "<anonymous>", "(Lhi1/f$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<hi1.f.LoadingWidgets, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84895e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f84895e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            g0.this.d9(hi1.e.c.f84805a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(hi1.f.LoadingWidgets loadingWidgets, tq.e<? super oq.i0> eVar) {
            return ((f) v(loadingWidgets, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return g0.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhi1/e$c;", "<unused var>", "Lk10/c0;", "Lhi1/f$e;", "state", "Lk10/l;", "Lhi1/f;", "<anonymous>", "(Lhi1/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<hi1.e.c, k10.c0<hi1.f.LoadingWidgets>, tq.e<? super k10.l<? extends hi1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84898f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.DataSet O(k10.c0 c0Var, Set set, hi1.f.LoadingWidgets loadingWidgets) {
            return new hi1.f.DataSet(new InitializedData(((hi1.f.LoadingWidgets) c0Var.a()).getData().e(), ((hi1.f.LoadingWidgets) c0Var.a()).getData().c(), set, ((hi1.f.LoadingWidgets) c0Var.a()).getData().d()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f84898f;
            Object objE = uq.b.e();
            int i15 = this.f84897e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0 g0Var = g0.this;
                Set<ah1.g> setD = ((hi1.f.LoadingWidgets) c0Var.a()).getData().d();
                this.f84898f = c0Var;
                this.f84897e = 1;
                obj = g0Var.G9(setD, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final Set set = (Set) obj;
            return c0Var.d(new er.l() { // from class: hi1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.g.O(c0Var, set, (f.LoadingWidgets) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.c cVar, k10.c0<hi1.f.LoadingWidgets> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) {
            g gVar = g0.this.new g(eVar);
            gVar.f84898f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhi1/s0;", "event", "Lk10/c0;", "Lhi1/f$a;", "state", "Lk10/l;", "Lhi1/f;", "<anonymous>", "(Lhi1/s0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<s0, k10.c0<hi1.f.DataSet>, tq.e<? super k10.l<? extends hi1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f84902g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f84904a;

            static {
                int[] iArr = new int[nx.a.values().length];
                try {
                    iArr[nx.a.STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f84904a = iArr;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f84905d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f84906e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f84907f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f84908g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f84907f = obj;
                this.f84908g |= PKIFailureInfo.systemUnavail;
                return h.X(null, null, this);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object X(final g0 g0Var, final k10.c0<hi1.f.DataSet> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f84908g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f84908g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objA = bVar.f84907f;
            Object objE = uq.b.e();
            int i16 = bVar.f84908g;
            if (i16 == 0) {
                oq.u.b(objA);
                ch1.z zVar = g0Var.getEnabledServiceWidgetsUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                bVar.f84905d = g0Var;
                bVar.f84906e = c0Var;
                bVar.f84908g = 1;
                objA = zVar.a(c1792a, bVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (k10.c0) bVar.f84906e;
                g0Var = (g0) bVar.f84905d;
                oq.u.b(objA);
            }
            final Set set = (Set) objA;
            return !set.isEmpty() ? c0Var.d(new er.l() { // from class: hi1.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return g0.h.Y(c0Var, g0Var, set, (f.DataSet) obj);
                }
            }) : c0Var.b(new er.l() { // from class: hi1.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return g0.h.Z(c0Var, (f.DataSet) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.LoadingWidgets Y(k10.c0 c0Var, g0 g0Var, Set set, hi1.f.DataSet dataSet) {
            return new hi1.f.LoadingWidgets(new InitializedData(((hi1.f.DataSet) c0Var.a()).getData().e(), ((hi1.f.DataSet) c0Var.a()).getData().c(), g0Var.N9(set), set));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.DataSet Z(k10.c0 c0Var, hi1.f.DataSet dataSet) {
            return dataSet.a(InitializedData.b(((hi1.f.DataSet) c0Var.a()).getData(), null, null, e1.e(), e1.e(), 3, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        
            if (r7 == r2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        
            if (r7 == r2) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f84901f
                hi1.s0 r0 = (hi1.s0) r0
                java.lang.Object r1 = r6.f84902g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f84900e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L26
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                oq.u.b(r7)
                goto L81
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L4d
            L26:
                oq.u.b(r7)
                boolean r7 = r0 instanceof hi1.s0.HasInternet
                if (r7 == 0) goto L55
                r7 = r0
                hi1.s0$a r7 = (hi1.s0.HasInternet) r7
                boolean r7 = r7.getValue()
                if (r7 == 0) goto L50
                hi1.g0 r7 = hi1.g0.this
                java.lang.Object r0 = vq.j.a(r0)
                r6.f84901f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r6.f84902g = r0
                r6.f84900e = r5
                java.lang.Object r7 = X(r7, r1, r6)
                if (r7 != r2) goto L4d
                goto L80
            L4d:
                k10.l r7 = (k10.l) r7
                return r7
            L50:
                k10.l r7 = r1.c()
                return r7
            L55:
                boolean r7 = r0 instanceof hi1.s0.Lifecycle
                if (r7 == 0) goto L89
                r7 = r0
                hi1.s0$b r7 = (hi1.s0.Lifecycle) r7
                nx.a r7 = r7.getValue()
                int[] r3 = hi1.g0.h.a.f84904a
                int r7 = r7.ordinal()
                r7 = r3[r7]
                if (r7 != r5) goto L84
                hi1.g0 r7 = hi1.g0.this
                java.lang.Object r0 = vq.j.a(r0)
                r6.f84901f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r6.f84902g = r0
                r6.f84900e = r4
                java.lang.Object r7 = X(r7, r1, r6)
                if (r7 != r2) goto L81
            L80:
                return r2
            L81:
                k10.l r7 = (k10.l) r7
                return r7
            L84:
                k10.l r7 = r1.c()
                return r7
            L89:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hi1.g0.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(s0 s0Var, k10.c0<hi1.f.DataSet> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) {
            h hVar = g0.this.new h(eVar);
            hVar.f84901f = s0Var;
            hVar.f84902g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lch1/c0$a;", "result", "Lk10/c0;", "Lhi1/f$a;", "state", "Lk10/l;", "Lhi1/f;", "<anonymous>", "(Lch1/c0$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ch1.c0.ServicesResult, k10.c0<hi1.f.DataSet>, tq.e<? super k10.l<? extends hi1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f84911g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.DataSet O(k10.c0 c0Var, ch1.c0.ServicesResult servicesResult, hi1.f.DataSet dataSet) {
            return dataSet.a(InitializedData.b(((hi1.f.DataSet) c0Var.a()).getData(), servicesResult.b(), servicesResult.a(), null, null, 12, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ch1.c0.ServicesResult servicesResult = (ch1.c0.ServicesResult) this.f84910f;
            final k10.c0 c0Var = (k10.c0) this.f84911g;
            uq.b.e();
            if (this.f84909e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hi1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.i.O(c0Var, servicesResult, (f.DataSet) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ch1.c0.ServicesResult servicesResult, k10.c0<hi1.f.DataSet> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) {
            i iVar = new i(eVar);
            iVar.f84910f = servicesResult;
            iVar.f84911g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhi1/e$b;", "event", "Lhi1/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhi1/e$b;Lhi1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<hi1.e.CheckServiceTemporaryInterruptions, hi1.f.DataSet, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f84913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f84914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f84915h;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            if (r4.F(r5, r6) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f84915h
                hi1.e$b r0 = (hi1.e.CheckServiceTemporaryInterruptions) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f84914g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r0 = r6.f84912e
                iq0.g0 r0 = (iq0.TemporaryInterruption) r0
                oq.u.b(r7)
                goto L7c
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L43
            L26:
                oq.u.b(r7)
                hi1.g0 r7 = hi1.g0.this
                h64.j r7 = hi1.g0.v9(r7)
                h64.j$a r2 = new h64.j$a
                rq0.c r5 = r0.getServiceType()
                r2.<init>(r5)
                r6.f84915h = r0
                r6.f84914g = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L43
                goto L6d
            L43:
                iq0.g0 r7 = (iq0.TemporaryInterruption) r7
                if (r7 == 0) goto L6e
                hi1.g0 r2 = hi1.g0.this
                xw.b r4 = r2.Y1()
                hi1.e$g$g r5 = new hi1.e$g$g
                ii1.h r2 = hi1.g0.y9(r2)
                cb4.d r2 = r2.A(r7)
                r5.<init>(r2)
                r6.f84915h = r0
                java.lang.Object r7 = vq.j.a(r7)
                r6.f84912e = r7
                r7 = 0
                r6.f84913f = r7
                r6.f84914g = r3
                java.lang.Object r7 = r4.F(r5, r6)
                if (r7 != r1) goto L7c
            L6d:
                return r1
            L6e:
                hi1.g0 r7 = hi1.g0.this
                hi1.e$e r1 = new hi1.e$e
                gx.b r0 = r0.getGlobalEvent()
                r1.<init>(r0)
                hi1.g0.q9(r7, r1)
            L7c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hi1.g0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.CheckServiceTemporaryInterruptions checkServiceTemporaryInterruptions, hi1.f.DataSet dataSet, tq.e<? super oq.i0> eVar) {
            j jVar = g0.this.new j(eVar);
            jVar.f84915h = checkServiceTemporaryInterruptions;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhi1/e$e;", "event", "Lhi1/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhi1/e$e;Lhi1/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<hi1.e.GoToServiceView, hi1.f.DataSet, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f84918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f84919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f84920h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f84921j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f84922k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f84923l;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            if (r2.H9(r3, r8) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
        
            if (r2.F(r5, r8) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f84923l
                hi1.e$e r0 = (hi1.e.GoToServiceView) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f84922k
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2f
                if (r2 == r5) goto L2b
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L22
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r0 = r8.f84918f
                dx.b r0 = (dx.b) r0
            L22:
                java.lang.Object r0 = r8.f84917e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto Lad
            L2b:
                oq.u.b(r9)
                goto L43
            L2f:
                oq.u.b(r9)
                hi1.g0 r9 = hi1.g0.this
                yg1.a r9 = hi1.g0.s9(r9)
                r8.f84923l = r0
                r8.f84922k = r5
                java.lang.Object r9 = r9.d(r8)
                if (r9 != r1) goto L43
                goto Lac
            L43:
                dx.i r9 = (dx.i) r9
                hi1.g0 r2 = hi1.g0.this
                boolean r5 = r9 instanceof dx.i.Left
                r6 = 0
                if (r5 == 0) goto L74
                r3 = r9
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                java.lang.Object r0 = vq.j.a(r0)
                r8.f84923l = r0
                java.lang.Object r9 = vq.j.a(r9)
                r8.f84917e = r9
                java.lang.Object r9 = vq.j.a(r3)
                r8.f84918f = r9
                r8.f84919g = r6
                r8.f84920h = r6
                r8.f84922k = r4
                java.lang.Object r9 = hi1.g0.z9(r2, r3, r8)
                if (r9 != r1) goto Lad
                goto Lac
            L74:
                boolean r4 = r9 instanceof dx.i.Right
                if (r4 == 0) goto Lb0
                r4 = r9
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                xw.b r2 = r2.Y1()
                hi1.e$g$f r5 = new hi1.e$g$f
                gx.b r7 = r0.getGlobalEvent()
                r5.<init>(r7)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f84923l = r0
                java.lang.Object r9 = vq.j.a(r9)
                r8.f84917e = r9
                r8.f84919g = r6
                r8.f84921j = r4
                r8.f84920h = r6
                r8.f84922k = r3
                java.lang.Object r9 = r2.F(r5, r8)
                if (r9 != r1) goto Lad
            Lac:
                return r1
            Lad:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            Lb0:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hi1.g0.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.GoToServiceView goToServiceView, hi1.f.DataSet dataSet, tq.e<? super oq.i0> eVar) {
            k kVar = g0.this.new k(eVar);
            kVar.f84923l = goToServiceView;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhi1/e$h;", "<unused var>", "Lk10/c0;", "Lhi1/f$b;", "state", "Lk10/l;", "Lhi1/f;", "<anonymous>", "(Lhi1/e$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<hi1.e.h, k10.c0<hi1.f.b>, tq.e<? super k10.l<? extends hi1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84926f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.d O(hi1.f.b bVar) {
            return hi1.f.d.f84822a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f84926f;
            uq.b.e();
            if (this.f84925e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hi1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.l.O((f.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.h hVar, k10.c0<hi1.f.b> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) {
            l lVar = new l(eVar);
            lVar.f84926f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhi1/e$f;", "<unused var>", "Lhi1/f;", "Loq/i0;", "<anonymous>", "(Lhi1/e$f;Lhi1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<hi1.e.f, hi1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84927e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84927e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g<ch1.c0.ServicesResult> gVarB = g0.this.getServicesUseCase.b(gz.b.a.C1792a.f78542a);
                this.f84927e = 1;
                obj = mu.i.B(gVarB, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            ch1.c0.ServicesResult servicesResult = (ch1.c0.ServicesResult) obj;
            if (servicesResult != null) {
                g0.this.d9(new hi1.e.SetupServices(servicesResult.b(), servicesResult.a()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.f fVar, hi1.f fVar2, tq.e<? super oq.i0> eVar) {
            return g0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhi1/e$i;", "action", "Lk10/c0;", "Lhi1/f;", "state", "Lk10/l;", "<anonymous>", "(Lhi1/e$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<hi1.e.SetupServices, k10.c0<hi1.f>, tq.e<? super k10.l<? extends hi1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f84931g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.b V(hi1.f fVar) {
            return hi1.f.b.f84820a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hi1.f.DataSet X(hi1.e.SetupServices setupServices, hi1.f fVar) {
            return new hi1.f.DataSet(new InitializedData(setupServices.b(), setupServices.a(), null, null, 12, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hi1.e.SetupServices setupServices = (hi1.e.SetupServices) this.f84930f;
            k10.c0 c0Var = (k10.c0) this.f84931g;
            uq.b.e();
            if (this.f84929e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<CategoryDashboardServices> listA = setupServices.a();
            return (listA == null || listA.isEmpty()) ? c0Var.d(new er.l() { // from class: hi1.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.n.V((f) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: hi1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.n.X(setupServices, (f) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.SetupServices setupServices, k10.c0<hi1.f> c0Var, tq.e<? super k10.l<? extends hi1.f>> eVar) {
            n nVar = new n(eVar);
            nVar.f84930f = setupServices;
            nVar.f84931g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhi1/e$a;", "<unused var>", "Lhi1/f;", "Loq/i0;", "<anonymous>", "(Lhi1/e$a;Lhi1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<hi1.e.a, hi1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84932e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84932e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hi1.e.g> bVarY1 = g0.this.Y1();
                hi1.e.g.d dVar = hi1.e.g.d.f84812a;
                this.f84932e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.a aVar, hi1.f fVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhi1/e$d;", "<unused var>", "Lhi1/f;", "Loq/i0;", "<anonymous>", "(Lhi1/e$d;Lhi1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<hi1.e.d, hi1.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84934e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f84934e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L4a
            L1b:
                oq.u.b(r5)
                hi1.g0 r5 = hi1.g0.this
                ch1.i0 r5 = hi1.g0.C9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                java.lang.Boolean r5 = r5.b(r1)
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L3d
                hi1.g0 r5 = hi1.g0.this
                hi1.e$g$c r1 = hi1.e.g.c.f84811a
                r4.f84934e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L4a
                goto L49
            L3d:
                hi1.g0 r5 = hi1.g0.this
                hi1.e$g$e r1 = hi1.e.g.C1976e.f84813a
                r4.f84934e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: hi1.g0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hi1.e.d dVar, hi1.f fVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class q implements mu.g<s0.Lifecycle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84936a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84937a;

            /* JADX INFO: renamed from: hi1.g0$q$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1980a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84938d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84939e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84940f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84942h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84943j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84944k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84945l;

                public C1980a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84938d = obj;
                    this.f84939e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f84937a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1980a c1980a;
                if (eVar instanceof C1980a) {
                    c1980a = (C1980a) eVar;
                    int i15 = c1980a.f84939e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1980a.f84939e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1980a = new C1980a(eVar);
                    }
                } else {
                    c1980a = new C1980a(eVar);
                }
                Object obj2 = c1980a.f84938d;
                Object objE = uq.b.e();
                int i16 = c1980a.f84939e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f84937a;
                    s0.Lifecycle lifecycle = new s0.Lifecycle((nx.a) obj);
                    c1980a.f84940f = vq.j.a(obj);
                    c1980a.f84942h = vq.j.a(c1980a);
                    c1980a.f84943j = vq.j.a(obj);
                    c1980a.f84944k = vq.j.a(hVar);
                    c1980a.f84945l = 0;
                    c1980a.f84939e = 1;
                    if (hVar.F(lifecycle, c1980a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public q(mu.g gVar) {
            this.f84936a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s0.Lifecycle> hVar, tq.e eVar) {
            Object objA = this.f84936a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class r implements mu.g<s0.HasInternet> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84946a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84947a;

            /* JADX INFO: renamed from: hi1.g0$r$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1981a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84948d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84949e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84950f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84952h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84953j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84954k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84955l;

                public C1981a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84948d = obj;
                    this.f84949e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f84947a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1981a c1981a;
                if (eVar instanceof C1981a) {
                    c1981a = (C1981a) eVar;
                    int i15 = c1981a.f84949e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1981a.f84949e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1981a = new C1981a(eVar);
                    }
                } else {
                    c1981a = new C1981a(eVar);
                }
                Object obj2 = c1981a.f84948d;
                Object objE = uq.b.e();
                int i16 = c1981a.f84949e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f84947a;
                    s0.HasInternet hasInternet = new s0.HasInternet(((Boolean) obj).booleanValue());
                    c1981a.f84950f = vq.j.a(obj);
                    c1981a.f84952h = vq.j.a(c1981a);
                    c1981a.f84953j = vq.j.a(obj);
                    c1981a.f84954k = vq.j.a(hVar);
                    c1981a.f84955l = 0;
                    c1981a.f84949e = 1;
                    if (hVar.F(hasInternet, c1981a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public r(mu.g gVar) {
            this.f84946a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s0.HasInternet> hVar, tq.e eVar) {
            Object objA = this.f84946a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public g0(yy.a aVar, h64.q qVar, ch1.c0 c0Var, h64.j jVar, ch1.i0 i0Var, ii1.h hVar, ib4.c cVar, by0.c cVar2, r44.c cVar3, oz.q qVar2, ch1.z zVar, a14.u uVar, yg1.a aVar2, dh1.b bVar, h64.g gVar) {
        this.loadRemoteSettingsUseCase = qVar;
        this.getServicesUseCase = c0Var;
        this.getServiceTemporaryInterruptionUseCase = jVar;
        this.isWidgetManagementEnabledUC = i0Var;
        this.serviceListMapper = hVar;
        this.domainErrorMapper = cVar;
        this.getAirQualityWidgetPointUC = cVar2;
        this.getPaymentWidgetDataUC = cVar3;
        this.ownerViewLifecycleManager = qVar2;
        this.getEnabledServiceWidgetsUC = zVar;
        this.observeHasNetworkConnectionUC = uVar;
        this.dashboardContainersInteractor = aVar2;
        this.isGlobalSearchActiveUC = bVar;
        this.getGlobalSearchConfigurationUC = gVar;
        hi1.f.c cVar4 = hi1.f.c.f84821a;
        this.initialState = cVar4;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar4, new er.l() { // from class: hi1.w
            @Override // er.l
            public final Object b(Object obj) {
                return g0.P9(this.f84989a, (k10.v) obj);
            }
        });
        this.lifecycleConnector = qVar2;
        this.state = a9(new c(e9().getState(), this), L9(cVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0103  */
    /* JADX WARN: Code duplicated, block: B:33:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00eb -> B:26:0x00ef). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object G9(java.util.Set<? extends ah1.g> r18, tq.e<? super java.util.Set<? extends ah1.h<?>>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hi1.g0.G9(java.util.Set, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H9(dx.b bVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new hi1.e.g.Error(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: hi1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.I9((ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(ib4.c.b bVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J9(dx.b bVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new hi1.e.g.Error(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: hi1.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.K9(this.f84824a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(g0 g0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            g0Var.d9(hi1.e.h.f84816a);
        } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hi1.g.b L9(hi1.f fVar) {
        return this.serviceListMapper.b(new ii1.h.ServiceListParams(fVar, new er.p() { // from class: hi1.x
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g0.M9(this.f84990a, (gx.b) obj, (rq0.c) obj2);
            }
        }, b9(hi1.e.h.f84816a), b9(hi1.e.d.f84806a), b9(new hi1.e.GoToServiceView(ay0.a.C0352a.f15203a)), b9(new hi1.e.GoToServiceView(new w32.b.ToPayments(w32.b.ToPayments.InterfaceC5522a.C5524b.f210183a, false, 2, null)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(g0 g0Var, gx.b bVar, rq0.c cVar) {
        g0Var.d9(new hi1.e.CheckServiceTemporaryInterruptions(bVar, cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<ah1.h<?>> N9(Set<? extends ah1.g> set) {
        ah1.h airQualityWidgetData;
        Set<? extends ah1.g> set2 = set;
        ArrayList arrayList = new ArrayList(pq.v.y(set2, 10));
        for (ah1.g gVar : set2) {
            int i15 = a.f84857a[gVar.ordinal()];
            if (i15 == 1) {
                airQualityWidgetData = new ah1.h.AirQualityWidgetData(gVar.getPosition(), null, true);
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                airQualityWidgetData = new ah1.h.PaymentsWidgetData(gVar.getPosition(), null, true);
            }
            arrayList.add(airQualityWidgetData);
        }
        return pq.v.k1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final g0 g0Var, k10.v vVar) {
        vVar.c(fr.q0.c(hi1.f.c.class), new er.l() { // from class: hi1.y
            @Override // er.l
            public final Object b(Object obj) {
                return g0.Q9(this.f84991a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hi1.f.d.class), new er.l() { // from class: hi1.z
            @Override // er.l
            public final Object b(Object obj) {
                return g0.R9(this.f84992a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hi1.f.LoadingWidgets.class), new er.l() { // from class: hi1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.S9(this.f84792a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hi1.f.DataSet.class), new er.l() { // from class: hi1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.T9(this.f84793a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hi1.f.b.class), new er.l() { // from class: hi1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.U9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hi1.f.class), new er.l() { // from class: hi1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.V9(this.f84801a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(g0 g0Var, k10.z zVar) {
        zVar.C(g0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(g0 g0Var, k10.z zVar) {
        zVar.C(g0Var.new f(null));
        g gVar = g0Var.new g(null);
        zVar.v(fr.q0.c(hi1.e.c.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(g0 g0Var, k10.z zVar) {
        q qVar = new q(mu.i.p(g0Var.x8()));
        a14.u uVar = g0Var.observeHasNetworkConnectionUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        k10.k.m(zVar, mu.i.Q(qVar, new r(mu.i.p((mu.g) uVar.a(c1792a)))), null, g0Var.new h(null), 2, null);
        k10.k.m(zVar, mu.i.p(g0Var.getServicesUseCase.b(c1792a)), null, new i(null), 2, null);
        j jVar = g0Var.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(hi1.e.CheckServiceTemporaryInterruptions.class), oVar, jVar);
        zVar.x(fr.q0.c(hi1.e.GoToServiceView.class), oVar, g0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(fr.q0.c(hi1.e.h.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(g0 g0Var, k10.z zVar) {
        m mVar = g0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(hi1.e.f.class), oVar, mVar);
        zVar.v(fr.q0.c(hi1.e.SetupServices.class), oVar, new n(null));
        zVar.x(fr.q0.c(hi1.e.a.class), oVar, g0Var.new o(null));
        zVar.x(fr.q0.c(hi1.e.d.class), oVar, g0Var.new p(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hi1.e.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: O9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hi1.g.b bVar) {
        super.P5(bVar);
    }

    @Override // hi1.g
    public void P() {
        d9(hi1.e.a.f84802a);
    }

    @Override // zx.b
    public xw.b<hi1.e.g> Y1() {
        return this.navAction;
    }

    @Override // hi1.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<hi1.f, hi1.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<hi1.g.b> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
