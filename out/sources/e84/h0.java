package e84;

import d84.NotificationSettingsEntry;
import d84.NotificationSettingsSection;
import d84.NotificationSettingsUpdateEntry;
import fr.q0;
import java.util.List;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001bBk\b\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*J\u001e\u0010/\u001a\u00020.2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0082@¢\u0006\u0004\b/\u00100J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020501H\u0096\u0001¢\u0006\u0004\b6\u00104J\u0018\u00109\u001a\u00020.2\u0006\u00108\u001a\u000207H\u0096\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010d\u001a\u00020_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR&\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR \u0010q\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v¨\u0006w"}, d2 = {"Le84/h0;", "Ll00/g;", "Le84/y;", "Le84/x;", "Le84/z;", "", "Lnx/b;", "Li70/e;", "Lw74/a;", "featureConfig", "Lyy/a;", "stateMachineFactory", "Lf84/c;", "mapper", "Lb84/a;", "dataInteractorFactory", "Lh84/b;", "systemInteractorFactory", "Lk84/b;", "goToNotificationSettingsUseCase", "Lk84/a;", "goToNotificationChannelsSettingsUseCase", "Lib4/c;", "domainErrorMapper", "Lac4/a;", "withLoaderUseCase", "Lac4/n;", "openUrlUseCase", "globalSnackBarManager", "Loz/q;", "ownerViewLifecycleManager", "<init>", "(Lw74/a;Lyy/a;Lf84/c;Lb84/a;Lh84/b;Lk84/b;Lk84/a;Lib4/c;Lac4/a;Lac4/n;Li70/e;Loz/q;)V", "state", "Le84/z$a;", "z9", "(Le84/y;)Le84/z$a;", "Ldx/b;", "error", "action", "Le84/x$c$b;", "x9", "(Ldx/b;Le84/x;)Le84/x$c$b;", "", "Ld84/c;", "settings", "Loq/i0;", "H9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lw74/a;", "c", "Lf84/c;", "d", "Lb84/a;", "e", "Lh84/b;", "f", "Lk84/b;", "g", "Lk84/a;", "h", "Lib4/c;", "j", "Lac4/a;", "k", "Lac4/n;", "l", "Li70/e;", "m", "Loz/q;", "Lc84/a;", "n", "Lc84/a;", "dataInteractor", "Li84/b;", "p", "Li84/b;", "systemInteractor", "Le84/y$a;", "q", "Le84/y$a;", "initialState", "Loz/j;", "r", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Le84/x$c;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<y, x> implements z, zx.b, nx.b, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f84.c mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b84.a dataInteractorFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h84.b systemInteractorFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k84.b goToNotificationSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k84.a goToNotificationChannelsSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a withLoaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUrlUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final c84.a dataInteractor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i84.b systemInteractor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final y.Initialized initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y, x> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x.c> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0<z.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Le84/h0$a;", "Lf00/j0;", "Lw74/a;", "Le84/h0;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<w74.a, h0> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<z.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f48564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f48565b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f48566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f48567b;

            /* JADX INFO: renamed from: e84.h0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1130a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f48568d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f48569e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f48570f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f48572h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f48573j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f48574k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f48575l;

                public C1130a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f48568d = obj;
                    this.f48569e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f48566a = hVar;
                this.f48567b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1130a c1130a;
                if (eVar instanceof C1130a) {
                    c1130a = (C1130a) eVar;
                    int i15 = c1130a.f48569e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1130a.f48569e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1130a = new C1130a(eVar);
                    }
                } else {
                    c1130a = new C1130a(eVar);
                }
                Object obj2 = c1130a.f48568d;
                Object objE = uq.b.e();
                int i16 = c1130a.f48569e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f48566a;
                    z.a aVarZ9 = this.f48567b.z9((y) obj);
                    c1130a.f48570f = vq.j.a(obj);
                    c1130a.f48572h = vq.j.a(c1130a);
                    c1130a.f48573j = vq.j.a(obj);
                    c1130a.f48574k = vq.j.a(hVar);
                    c1130a.f48575l = 0;
                    c1130a.f48569e = 1;
                    if (hVar.F(aVarZ9, c1130a) == objE) {
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

        public b(mu.g gVar, h0 h0Var) {
            this.f48564a = gVar;
            this.f48565b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super z.a> hVar, tq.e eVar) {
            Object objA = this.f48564a.a(new a(hVar, this.f48565b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Le84/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Le84/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nx.a, y, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48577f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f48577f;
            uq.b.e();
            if (this.f48576e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                h0.this.d9(x.f.f48654a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, y yVar, tq.e<? super oq.i0> eVar) {
            c cVar = h0.this.new c(eVar);
            cVar.f48577f = aVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le84/x$f;", "action", "Lk10/c0;", "Le84/y;", "state", "Lk10/l;", "<anonymous>", "(Le84/x$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<x.f, k10.c0<y>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f48580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f48582h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Le84/y;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends y>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f48584e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f48585f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f48586g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f48587h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f48588j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f48589k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ h0 f48590l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ x.f f48591m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<y> f48592n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, x.f fVar, k10.c0<y> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f48590l = h0Var;
                this.f48591m = fVar;
                this.f48592n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y V(List list, k10.c0 c0Var, y yVar) {
                return new y.Initialized(list, ((y) c0Var.a()).getConfig());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final List list;
                final k10.c0<y> c0Var;
                k10.c0<y> c0Var2;
                Object objE = uq.b.e();
                int i15 = this.f48589k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    c84.a aVar = this.f48590l.dataInteractor;
                    this.f48589k = 1;
                    obj = aVar.d(this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        c0Var2 = (k10.c0) this.f48585f;
                        oq.u.b(obj);
                        return c0Var2.c();
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f48586g;
                    c0Var = (k10.c0) this.f48585f;
                    oq.u.b(obj);
                    return c0Var.b(new er.l() { // from class: e84.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.d.a.V(list, c0Var, (y) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                h0 h0Var = this.f48590l;
                x.f fVar = this.f48591m;
                k10.c0<y> c0Var3 = this.f48592n;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    xw.b<x.c> bVarY1 = h0Var.Y1();
                    x.c.Error errorX9 = h0Var.x9(bVar, fVar);
                    this.f48584e = vq.j.a(iVar);
                    this.f48585f = c0Var3;
                    this.f48586g = vq.j.a(bVar);
                    this.f48587h = 0;
                    this.f48588j = 0;
                    this.f48589k = 2;
                    if (bVarY1.F(errorX9, this) != objE) {
                        c0Var2 = c0Var3;
                        return c0Var2.c();
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    List list2 = (List) ((dx.i.Right) iVar).b();
                    this.f48584e = vq.j.a(iVar);
                    this.f48585f = c0Var3;
                    this.f48586g = list2;
                    this.f48587h = 0;
                    this.f48588j = 0;
                    this.f48589k = 3;
                    if (h0Var.H9(list2, this) != objE) {
                        list = list2;
                        c0Var = c0Var3;
                        return c0Var.b(new er.l() { // from class: e84.j0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.d.a.V(list, c0Var, (y) obj2);
                            }
                        });
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f48590l, this.f48591m, this.f48592n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends y>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y O(i84.b.InterfaceC2143b interfaceC2143b, k10.c0 c0Var, y yVar) {
            return new y.NoPermission(interfaceC2143b, ((y) c0Var.a()).getConfig());
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        
            if (r12 == r2) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f48581g
                e84.x$f r0 = (e84.x.f) r0
                java.lang.Object r1 = r11.f48582h
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r11.f48580f
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L26
                if (r3 != r4) goto L1e
                java.lang.Object r0 = r11.f48579e
                i84.b$b r0 = (i84.b.InterfaceC2143b) r0
                oq.u.b(r12)
                goto L87
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                oq.u.b(r12)
                goto L40
            L2a:
                oq.u.b(r12)
                e84.h0 r12 = e84.h0.this
                i84.b r12 = e84.h0.s9(r12)
                r11.f48581g = r0
                r11.f48582h = r1
                r11.f48580f = r5
                java.lang.Object r12 = r12.a(r11)
                if (r12 != r2) goto L40
                goto L86
            L40:
                i84.b$b r12 = (i84.b.InterfaceC2143b) r12
                i84.b$b$c r3 = i84.b.InterfaceC2143b.c.f90329a
                boolean r3 = fr.t.c(r12, r3)
                if (r3 != 0) goto L90
                i84.b$b$a r3 = i84.b.InterfaceC2143b.a.f90327a
                boolean r3 = fr.t.c(r12, r3)
                if (r3 == 0) goto L53
                goto L90
            L53:
                i84.b$b$b r3 = i84.b.InterfaceC2143b.C2144b.f90328a
                boolean r3 = fr.t.c(r12, r3)
                if (r3 == 0) goto L8a
                e84.h0 r3 = e84.h0.this
                ac4.a r5 = e84.h0.t9(r3)
                e84.h0$d$a r7 = new e84.h0$d$a
                e84.h0 r3 = e84.h0.this
                r6 = 0
                r7.<init>(r3, r0, r1, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r11.f48581g = r0
                java.lang.Object r0 = vq.j.a(r1)
                r11.f48582h = r0
                java.lang.Object r12 = vq.j.a(r12)
                r11.f48579e = r12
                r11.f48580f = r4
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r2) goto L87
            L86:
                return r2
            L87:
                k10.l r12 = (k10.l) r12
                return r12
            L8a:
                oq.p r12 = new oq.p
                r12.<init>()
                throw r12
            L90:
                e84.i0 r0 = new e84.i0
                r0.<init>()
                k10.l r12 = r1.b(r0)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: e84.h0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x.f fVar, k10.c0<y> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            d dVar = h0.this.new d(eVar);
            dVar.f48581g = fVar;
            dVar.f48582h = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le84/x$e;", "action", "Le84/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le84/x$e;Le84/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<x.OpenUrl, y, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f48594f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x.OpenUrl openUrl = (x.OpenUrl) this.f48594f;
            Object objE = uq.b.e();
            int i15 = this.f48593e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.n nVar = h0.this.openUrlUseCase;
                ac4.n.Params params = new ac4.n.Params(openUrl.getUrl());
                this.f48594f = vq.j.a(openUrl);
                this.f48593e = 1;
                obj = nVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            h0 h0Var = h0.this;
            if (iVar instanceof dx.i.Left) {
                h0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x.OpenUrl openUrl, y yVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = h0.this.new e(eVar);
            eVar2.f48594f = openUrl;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le84/x$a;", "<unused var>", "Le84/y;", "Loq/i0;", "<anonymous>", "(Le84/x$a;Le84/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<x.a, y, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f48596e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f48596e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x.c> bVarY1 = h0.this.Y1();
                x.c.a aVar = x.c.a.f48649a;
                this.f48596e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(x.a aVar, y yVar, tq.e<? super oq.i0> eVar) {
            return h0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le84/x$d;", "action", "Lk10/c0;", "Le84/y$a;", "state", "Lk10/l;", "Le84/y;", "<anonymous>", "(Le84/x$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<x.OnSwitchStateChanged, k10.c0<y.Initialized>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f48599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f48600g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f48601h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Le84/y;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends y>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f48603e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f48604f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f48605g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f48606h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f48607j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f48608k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f48609l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ h0 f48610m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List<NotificationSettingsSection> f48611n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ x.OnSwitchStateChanged f48612p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<y.Initialized> f48613q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, List<NotificationSettingsSection> list, x.OnSwitchStateChanged onSwitchStateChanged, k10.c0<y.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f48610m = h0Var;
                this.f48611n = list;
                this.f48612p = onSwitchStateChanged;
                this.f48613q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y.Initialized V(List list, y.Initialized initialized) {
                return y.Initialized.c(initialized, list, null, 2, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<y.Initialized> c0Var;
                final List<NotificationSettingsSection> list;
                k10.c0<y.Initialized> c0Var2;
                List<NotificationSettingsSection> list2;
                k10.c0<y.Initialized> c0Var3;
                Object objE = uq.b.e();
                int i15 = this.f48609l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    c84.a aVar = this.f48610m.dataInteractor;
                    List<NotificationSettingsUpdateEntry> listB = d84.b.b(this.f48611n);
                    this.f48609l = 1;
                    obj = aVar.c(listB, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        c0Var3 = (k10.c0) this.f48604f;
                        oq.u.b(obj);
                        return c0Var3.c();
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) this.f48605g;
                    c0Var2 = (k10.c0) this.f48604f;
                    oq.u.b(obj);
                    list = list2;
                    c0Var = c0Var2;
                    return c0Var.d(new er.l() { // from class: e84.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.g.a.V(list, (y.Initialized) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                h0 h0Var = this.f48610m;
                x.OnSwitchStateChanged onSwitchStateChanged = this.f48612p;
                c0Var = this.f48613q;
                list = this.f48611n;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                    if (fr.t.c(onSwitchStateChanged.getNotificationType(), "DOCUMENTS")) {
                        c84.a aVar2 = h0Var.dataInteractor;
                        boolean isChecked = onSwitchStateChanged.getIsChecked();
                        this.f48603e = vq.j.a(iVar);
                        this.f48604f = c0Var;
                        this.f48605g = list;
                        this.f48606h = vq.j.a(i0Var);
                        this.f48607j = 0;
                        this.f48608k = 0;
                        this.f48609l = 3;
                        if (aVar2.f(isChecked, this) != objE) {
                            c0Var2 = c0Var;
                            list2 = list;
                            list = list2;
                            c0Var = c0Var2;
                        }
                    }
                    return c0Var.d(new er.l() { // from class: e84.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.g.a.V(list, (y.Initialized) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<x.c> bVarY1 = h0Var.Y1();
                x.c.Error errorX9 = h0Var.x9(bVar, onSwitchStateChanged);
                this.f48603e = vq.j.a(iVar);
                this.f48604f = c0Var;
                this.f48605g = vq.j.a(bVar);
                this.f48607j = 0;
                this.f48608k = 0;
                this.f48609l = 2;
                if (bVarY1.F(errorX9, this) != objE) {
                    c0Var3 = c0Var;
                    return c0Var3.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f48610m, this.f48611n, this.f48612p, this.f48613q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends y>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x.OnSwitchStateChanged onSwitchStateChanged = (x.OnSwitchStateChanged) this.f48600g;
            k10.c0 c0Var = (k10.c0) this.f48601h;
            Object objE = uq.b.e();
            int i15 = this.f48599f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            List<NotificationSettingsSection> listC = d84.b.c(((y.Initialized) c0Var.a()).d(), onSwitchStateChanged.getNotificationType(), onSwitchStateChanged.getIsChecked());
            ac4.a aVar = h0.this.withLoaderUseCase;
            a aVar2 = new a(h0.this, listC, onSwitchStateChanged, c0Var, null);
            this.f48600g = vq.j.a(onSwitchStateChanged);
            this.f48601h = vq.j.a(c0Var);
            this.f48598e = vq.j.a(listC);
            this.f48599f = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x.OnSwitchStateChanged onSwitchStateChanged, k10.c0<y.Initialized> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            g gVar = h0.this.new g(eVar);
            gVar.f48600g = onSwitchStateChanged;
            gVar.f48601h = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le84/x$b;", "<unused var>", "Le84/y$b;", "state", "Loq/i0;", "<anonymous>", "(Le84/x$b;Le84/y$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<x.b, y.NoPermission, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f48615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f48616g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f48617h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f48618j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f48619k;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            if (r6.F(r2, r8) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
        
            if (r6.F(r2, r8) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e84.h0.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x.b bVar, y.NoPermission noPermission, tq.e<? super oq.i0> eVar) {
            h hVar = h0.this.new h(eVar);
            hVar.f48619k = noPermission;
            return hVar.J(oq.i0.f148189a);
        }
    }

    public h0(w74.a aVar, yy.a aVar2, f84.c cVar, b84.a aVar3, h84.b bVar, k84.b bVar2, k84.a aVar4, ib4.c cVar2, ac4.a aVar5, ac4.n nVar, i70.e eVar, oz.q qVar) {
        this.featureConfig = aVar;
        this.mapper = cVar;
        this.dataInteractorFactory = aVar3;
        this.systemInteractorFactory = bVar;
        this.goToNotificationSettingsUseCase = bVar2;
        this.goToNotificationChannelsSettingsUseCase = aVar4;
        this.domainErrorMapper = cVar2;
        this.withLoaderUseCase = aVar5;
        this.openUrlUseCase = nVar;
        this.globalSnackBarManager = eVar;
        this.ownerViewLifecycleManager = qVar;
        this.dataInteractor = aVar3.a(aVar);
        this.systemInteractor = bVar.a(aVar);
        y.Initialized initialized = new y.Initialized(pq.v.n(), aVar);
        this.initialState = initialized;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar2.a(initialized, new er.l() { // from class: e84.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.D9(this.f48542a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), z9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(h0 h0Var, String str, boolean z15) {
        h0Var.d9(new x.OnSwitchStateChanged(str, z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(h0 h0Var, String str) {
        h0Var.d9(new x.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final h0 h0Var, k10.v vVar) {
        vVar.c(q0.c(y.class), new er.l() { // from class: e84.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.E9(this.f48521a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y.Initialized.class), new er.l() { // from class: e84.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.F9(this.f48524a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y.NoPermission.class), new er.l() { // from class: e84.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.G9(this.f48527a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(h0 h0Var, k10.z zVar) {
        k10.k.s(zVar, h0Var.x8(), null, h0Var.new c(null), 2, null);
        d dVar = h0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(x.f.class), oVar, dVar);
        zVar.x(q0.c(x.OpenUrl.class), oVar, h0Var.new e(null));
        zVar.x(q0.c(x.a.class), oVar, h0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(h0 h0Var, k10.z zVar) {
        g gVar = h0Var.new g(null);
        zVar.v(q0.c(x.OnSwitchStateChanged.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(h0 h0Var, k10.z zVar) {
        h hVar = h0Var.new h(null);
        zVar.x(q0.c(x.b.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H9(List<NotificationSettingsSection> list, tq.e<? super oq.i0> eVar) {
        Object objF;
        NotificationSettingsEntry notificationSettingsEntryA = d84.b.a(list);
        return (notificationSettingsEntryA == null || (objF = this.dataInteractor.f(notificationSettingsEntryA.getEnabled(), eVar)) != uq.b.e()) ? oq.i0.f148189a : objF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x.c.Error x9(dx.b error, final x action) {
        return new x.c.Error(this.domainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: e84.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.y9(action, this, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(x xVar, h0 h0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            if (xVar instanceof x.f) {
                h0Var.d9(x.f.f48654a);
            } else if (xVar instanceof x.g) {
                h0Var.d9(x.g.f48655a);
            }
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.a)) {
                throw new oq.p();
            }
            h0Var.d9(x.a.f48647a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z.a z9(y state) {
        return this.mapper.b(new f84.c.Params(state, this.dataInteractor.getAppPzGovUrl(), b9(x.b.f48648a), new er.p() { // from class: e84.d0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return h0.A9(this.f48530a, (String) obj, ((Boolean) obj2).booleanValue());
            }
        }, b9(x.a.f48647a), new er.l() { // from class: e84.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.B9(this.f48533a, (String) obj);
            }
        }));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<x.c> Y1() {
        return this.navAction;
    }

    @Override // e84.z
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<y, x> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<z.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
