package ur3;

import bt3.SetupData;
import cj0.AllZusEVisitSummary;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001FB9\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001cH\u0096\u0001¢\u0006\u0004\b!\u0010\u001fJ\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0082@¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020+*\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00172\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u0010\u001bJ\u000f\u00109\u001a\u00020\u0017H\u0002¢\u0006\u0004\b9\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010>R\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010H\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR,\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030M8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u001b\u001a\u0004\bP\u0010QR \u0010Z\u001a\b\u0012\u0004\u0012\u00020U0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR&\u0010#\u001a\b\u0012\u0004\u0012\u00020+0[8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010\u001b\u001a\u0004\b^\u0010_R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010\u001f¨\u0006d"}, d2 = {"Lur3/z;", "Ll00/g;", "Lur3/b;", "Lur3/a;", "Lur3/c;", "", "Lnx/b;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lnr3/l;", "getZusVisitsUseCase", "Lib4/c;", "domainErrorMapper", "Lvr3/c;", "screenMapper", "snackBarManagerStateHolder", "Loz/q;", "ownerViewLifecycleManager", "<init>", "(Lyy/a;Lnr3/l;Lib4/c;Lvr3/c;Li70/n;Loz/q;)V", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "Lk10/c0;", "state", "Lk10/l;", "y9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "x9", "(Ldx/b;)V", "Lur3/c$a;", "B9", "(Lur3/b;)Lur3/c$a;", "", "id", "", "bookingAvailable", "w9", "(JZ)V", "Ly30/n$b$b;", "newItem", "C9", "(Ly30/n$b$b;)V", "v9", "d", "b", "Lnr3/l;", "c", "Lib4/c;", "Lvr3/c;", "e", "Li70/n;", "f", "Loz/q;", "Loz/j;", "g", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lur3/b$b;", "h", "Lur3/b$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lur3/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Li70/p;", "snackBarVisibilityState", "m", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<ur3.b, a> implements ur3.c, zx.d, nx.b, i70.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f200542n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.l getZusVisitsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vr3.c screenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ur3.b.C5219b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ur3.b, a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<ur3.c.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200553e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200553e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                a.c.C5218c c5218c = a.c.C5218c.f200476a;
                this.f200553e = 1;
                if (zVar.F(c5218c, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return z.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200555e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f200557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f200558h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j15, boolean z15, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f200557g = j15;
            this.f200558h = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200555e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                a.c.GoToVisitDetails goToVisitDetails = new a.c.GoToVisitDetails(new SetupData(this.f200557g, this.f200558h));
                this.f200555e = 1;
                if (zVar.F(goToVisitDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return z.this.new c(this.f200557g, this.f200558h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200559e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f200561g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(dx.b bVar, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f200561g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(z zVar, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                zVar.d9(a.d.f200479a);
            } else if (bVar instanceof ib4.c.b.AbstractC2161b.a) {
                zVar.d();
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200559e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ib4.c cVar = z.this.domainErrorMapper;
                dx.b bVar = this.f200561g;
                final z zVar2 = z.this;
                a.c.Error error = new a.c.Error(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ur3.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.d.V(zVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f200559e = 1;
                if (zVar.F(error, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return z.this.new d(this.f200561g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f200562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f200563e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f200565g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f200563e = obj;
            this.f200565g |= PKIFailureInfo.systemUnavail;
            return z.this.y9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.p<Long, Boolean, i0> {
        f(Object obj) {
            super(2, obj, z.class, "goToVisitDetails", "goToVisitDetails(JZ)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(Long l15, Boolean bool) {
            E(l15.longValue(), bool.booleanValue());
            return i0.f148189a;
        }

        public final void E(long j15, boolean z15) {
            ((z) this.f66391b).w9(j15, z15);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.a<i0> {
        g(Object obj) {
            super(0, obj, z.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((z) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.l<y30.n.Switch.EnumC5973b, i0> {
        h(Object obj) {
            super(1, obj, z.class, "onSwitchItemChanged", "onSwitchItemChanged(Lpl/gov/coi/common/ui/ds/controllers/ControllersData$Switch$Type;)V", 0);
        }

        public final void E(y30.n.Switch.EnumC5973b enumC5973b) {
            ((z) this.f66391b).C9(enumC5973b);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(y30.n.Switch.EnumC5973b enumC5973b) {
            E(enumC5973b);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class i extends fr.q implements er.a<i0> {
        i(Object obj) {
            super(0, obj, z.class, "goToInfoPage", "goToInfoPage()V", 0);
        }

        public final void E() {
            ((z) this.f66391b).v9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200566e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200566e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                a.c.C5217a c5217a = a.c.C5217a.f200474a;
                this.f200566e = 1;
                if (zVar.F(c5217a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return z.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k implements mu.g<ur3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f200568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f200569b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f200570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f200571b;

            /* JADX INFO: renamed from: ur3.z$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5221a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f200572d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f200573e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f200574f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f200576h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f200577j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f200578k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f200579l;

                public C5221a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f200572d = obj;
                    this.f200573e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f200570a = hVar;
                this.f200571b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5221a c5221a;
                if (eVar instanceof C5221a) {
                    c5221a = (C5221a) eVar;
                    int i15 = c5221a.f200573e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5221a.f200573e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5221a = new C5221a(eVar);
                    }
                } else {
                    c5221a = new C5221a(eVar);
                }
                Object obj2 = c5221a.f200572d;
                Object objE = uq.b.e();
                int i16 = c5221a.f200573e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f200570a;
                    ur3.c.a aVarB9 = this.f200571b.B9((ur3.b) obj);
                    c5221a.f200574f = vq.j.a(obj);
                    c5221a.f200576h = vq.j.a(c5221a);
                    c5221a.f200577j = vq.j.a(obj);
                    c5221a.f200578k = vq.j.a(hVar);
                    c5221a.f200579l = 0;
                    c5221a.f200573e = 1;
                    if (hVar.F(aVarB9, c5221a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public k(mu.g gVar, z zVar) {
            this.f200568a = gVar;
            this.f200569b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ur3.c.a> hVar, tq.e eVar) {
            Object objA = this.f200568a.a(new a(hVar, this.f200569b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lur3/b$b;", "state", "Lk10/l;", "Lur3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<ur3.b.C5219b>, tq.e<? super k10.l<? extends ur3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200581f;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f200581f;
            Object objE = uq.b.e();
            int i15 = this.f200580e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f200581f = vq.j.a(c0Var);
            this.f200580e = 1;
            Object objY9 = zVar.y9(c0Var, this);
            return objY9 == objE ? objE : objY9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ur3.b.C5219b> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) {
            return ((l) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f200581f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur3/a$d;", "<unused var>", "Lk10/c0;", "Lur3/b$a;", "state", "Lk10/l;", "Lur3/b;", "<anonymous>", "(Lur3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.d, k10.c0<ur3.b.a>, tq.e<? super k10.l<? extends ur3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200584f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f200584f;
            Object objE = uq.b.e();
            int i15 = this.f200583e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f200584f = vq.j.a(c0Var);
            this.f200583e = 1;
            Object objY9 = zVar.y9(c0Var, this);
            return objY9 == objE ? objE : objY9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, k10.c0<ur3.b.a> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f200584f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lur3/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lur3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<nx.a, ur3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200587f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f200587f;
            uq.b.e();
            if (this.f200586e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.STARTED) {
                z.this.d9(a.d.f200479a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, ur3.b.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = z.this.new n(eVar);
            nVar.f200587f = aVar;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur3/a$d;", "<unused var>", "Lk10/c0;", "Lur3/b$c;", "state", "Lk10/l;", "Lur3/b;", "<anonymous>", "(Lur3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.d, k10.c0<ur3.b.Initialized>, tq.e<? super k10.l<? extends ur3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200590f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f200590f;
            Object objE = uq.b.e();
            int i15 = this.f200589e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f200590f = vq.j.a(c0Var);
            this.f200589e = 1;
            Object objY9 = zVar.y9(c0Var, this);
            return objY9 == objE ? objE : objY9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, k10.c0<ur3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f200590f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur3/a$b;", "<unused var>", "Lk10/c0;", "Lur3/b$c;", "state", "Lk10/l;", "Lur3/b;", "<anonymous>", "(Lur3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.b, k10.c0<ur3.b.Initialized>, tq.e<? super k10.l<? extends ur3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200593f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur3.b.Initialized O(ur3.b.Initialized initialized) {
            return ur3.b.Initialized.b(initialized, null, null, false, false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f200593f;
            uq.b.e();
            if (this.f200592e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.p.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, k10.c0<ur3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) {
            p pVar = new p(eVar);
            pVar.f200593f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur3/a$a;", "<unused var>", "Lk10/c0;", "Lur3/b$c;", "state", "Lk10/l;", "Lur3/b;", "<anonymous>", "(Lur3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.C5216a, k10.c0<ur3.b.Initialized>, tq.e<? super k10.l<? extends ur3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200595f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur3.b.Initialized O(ur3.b.Initialized initialized) {
            return ur3.b.Initialized.b(initialized, null, null, false, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f200595f;
            uq.b.e();
            if (this.f200594e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.q.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C5216a c5216a, k10.c0<ur3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) {
            q qVar = new q(eVar);
            qVar.f200595f = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lur3/a$e;", "action", "Lk10/c0;", "Lur3/b$c;", "state", "Lk10/l;", "Lur3/b;", "<anonymous>", "(Lur3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.SwitchChanged, k10.c0<ur3.b.Initialized>, tq.e<? super k10.l<? extends ur3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200598g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ur3.b.Initialized O(a.SwitchChanged switchChanged, ur3.b.Initialized initialized) {
            return ur3.b.Initialized.b(initialized, null, switchChanged.getSwitchType(), false, false, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SwitchChanged switchChanged = (a.SwitchChanged) this.f200597f;
            k10.c0 c0Var = (k10.c0) this.f200598g;
            uq.b.e();
            if (this.f200596e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ur3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.r.O(switchChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SwitchChanged switchChanged, k10.c0<ur3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) {
            r rVar = new r(eVar);
            rVar.f200597f = switchChanged;
            rVar.f200598g = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lur3/a$f;", "<unused var>", "Lur3/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lur3/a$f;Lur3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.f, ur3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200600f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ur3.b.Initialized initialized = (ur3.b.Initialized) this.f200600f;
            Object objE = uq.b.e();
            int i15 = this.f200599e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                a.c.GoToNewVisitWizard goToNewVisitWizard = new a.c.GoToNewVisitWizard(new zr3.n.a.NewVisit(initialized.getVisits().getDefaultPostcode()));
                this.f200600f = vq.j.a(initialized);
                this.f200599e = 1;
                if (zVar.F(goToNewVisitWizard, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.f fVar, ur3.b.Initialized initialized, tq.e<? super i0> eVar) {
            s sVar = z.this.new s(eVar);
            sVar.f200600f = initialized;
            return sVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, nr3.l lVar, ib4.c cVar, vr3.c cVar2, i70.n nVar, oz.q qVar) {
        this.getZusVisitsUseCase = lVar;
        this.domainErrorMapper = cVar;
        this.screenMapper = cVar2;
        this.snackBarManagerStateHolder = nVar;
        this.ownerViewLifecycleManager = qVar;
        this.lifecycleConnector = qVar;
        ur3.b.C5219b c5219b = ur3.b.C5219b.f200484a;
        this.initialState = c5219b;
        this.stateMachine = aVar.a(c5219b, new er.l() { // from class: ur3.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.E9(this.f200535a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new k(e9().getState(), this), B9(c5219b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ur3.b.Initialized A9(AllZusEVisitSummary allZusEVisitSummary, k10.c0 c0Var, Object obj) {
        y30.n.Switch.EnumC5973b switchSelectedItem;
        Object objA = c0Var.a();
        ur3.b.Initialized initialized = objA instanceof ur3.b.Initialized ? (ur3.b.Initialized) objA : null;
        if (initialized == null || (switchSelectedItem = initialized.getSwitchSelectedItem()) == null) {
            switchSelectedItem = y30.n.Switch.EnumC5973b.LEFT;
        }
        return new ur3.b.Initialized(allZusEVisitSummary, switchSelectedItem, true, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ur3.c.a B9(ur3.b bVar) {
        vr3.c cVar = this.screenMapper;
        f fVar = new f(this);
        g gVar = new g(this);
        h hVar = new h(this);
        er.a<i0> aVarB9 = b9(a.f.f200481a);
        return cVar.b(new vr3.c.Params(bVar, fVar, b9(a.b.f200473a), b9(a.C5216a.f200472a), hVar, new i(this), aVarB9, gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9(y30.n.Switch.EnumC5973b newItem) {
        d9(new a.SwitchChanged(newItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(ur3.b.C5219b.class), new er.l() { // from class: ur3.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.F9(this.f200536a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ur3.b.a.class), new er.l() { // from class: ur3.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.G9(this.f200537a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ur3.b.Initialized.class), new er.l() { // from class: ur3.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.H9(this.f200538a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(z zVar, k10.z zVar2) {
        m mVar = zVar.new m(null);
        zVar2.v(q0.c(a.d.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(z zVar, k10.z zVar2) {
        k10.k.s(zVar2, zVar.x8(), null, zVar.new n(null), 2, null);
        o oVar = zVar.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(a.d.class), oVar2, oVar);
        zVar2.v(q0.c(a.b.class), oVar2, new p(null));
        zVar2.v(q0.c(a.C5216a.class), oVar2, new q(null));
        zVar2.v(q0.c(a.SwitchChanged.class), oVar2, new r(null));
        zVar2.x(q0.c(a.f.class), oVar2, zVar.new s(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        i00.a.a(this, new j(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v9() {
        i00.a.a(this, new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w9(long id5, boolean bookingAvailable) {
        i00.a.a(this, new c(id5, bookingAvailable, null));
    }

    private final void x9(dx.b error) {
        i00.a.a(this, new d(error, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y9(final k10.c0<?> c0Var, tq.e<? super k10.l<? extends ur3.b>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f200565g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f200565g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f200563e;
        Object objE = uq.b.e();
        int i16 = eVar2.f200565g;
        if (i16 == 0) {
            oq.u.b(objA);
            nr3.l lVar = this.getZusVisitsUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f200562d = c0Var;
            eVar2.f200565g = 1;
            objA = lVar.a(c1792a, eVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) eVar2.f200562d;
            oq.u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            x9((dx.b) ((dx.i.Left) iVar).b());
            return c0Var.d(new er.l() { // from class: ur3.x
                @Override // er.l
                public final Object b(Object obj) {
                    return z.z9(obj);
                }
            });
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        final AllZusEVisitSummary allZusEVisitSummary = (AllZusEVisitSummary) ((dx.i.Right) iVar).b();
        return c0Var.d(new er.l() { // from class: ur3.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.A9(allZusEVisitSummary, c0Var, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ur3.b.a z9(Object obj) {
        return ur3.b.a.f200483a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<a.c> Y1() {
        return this.navAction;
    }

    @Override // ur3.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<ur3.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ur3.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
