package s91;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Ls91/m;", "Ll00/g;", "Ls91/b;", "Ls91/a;", "Ls91/c;", "", "Lyy/a;", "stateMachineFactory", "Ls91/e;", "mapper", "Lm61/b;", "checkIsReasonValidUC", "Lt91/a;", "setupContract", "<init>", "(Lyy/a;Ls91/e;Lm61/b;Lt91/a;)V", "state", "Ls91/c$a;", "m9", "(Ls91/b;)Ls91/c$a;", "data", "Loq/i0;", "n9", "(Lt91/a;)V", "b", "Ls91/e;", "c", "Lm61/b;", "d", "Lt91/a;", "e", "Ls91/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ls91/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, s91.a> implements s91.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m61.b checkIsReasonValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t91.a setupContract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, s91.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<s91.c.Data> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s91.a.InterfaceC4611a> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s91.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f179440b;

        /* JADX INFO: renamed from: s91.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4613a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179441a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f179442b;

            /* JADX INFO: renamed from: s91.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4614a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179443d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179444e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179445f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179447h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179448j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179449k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179450l;

                public C4614a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179443d = obj;
                    this.f179444e |= PKIFailureInfo.systemUnavail;
                    return C4613a.this.F(null, this);
                }
            }

            public C4613a(mu.h hVar, m mVar) {
                this.f179441a = hVar;
                this.f179442b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4614a c4614a;
                if (eVar instanceof C4614a) {
                    c4614a = (C4614a) eVar;
                    int i15 = c4614a.f179444e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4614a.f179444e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4614a = new C4614a(eVar);
                    }
                } else {
                    c4614a = new C4614a(eVar);
                }
                Object obj2 = c4614a.f179443d;
                Object objE = uq.b.e();
                int i16 = c4614a.f179444e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f179441a;
                    s91.c.Data dataM9 = this.f179442b.m9((State) obj);
                    c4614a.f179445f = vq.j.a(obj);
                    c4614a.f179447h = vq.j.a(c4614a);
                    c4614a.f179448j = vq.j.a(obj);
                    c4614a.f179449k = vq.j.a(hVar);
                    c4614a.f179450l = 0;
                    c4614a.f179444e = 1;
                    if (hVar.F(dataM9, c4614a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, m mVar) {
            this.f179439a = gVar;
            this.f179440b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s91.c.Data> hVar, tq.e eVar) {
            Object objA = this.f179439a.a(new C4613a(hVar, this.f179440b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls91/a$a;", "action", "Ls91/b;", "state", "Loq/i0;", "<anonymous>", "(Ls91/a$a;Ls91/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<s91.a.InterfaceC4611a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179452f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s91.a.InterfaceC4611a interfaceC4611a = (s91.a.InterfaceC4611a) this.f179452f;
            Object objE = uq.b.e();
            int i15 = this.f179451e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f179452f = vq.j.a(interfaceC4611a);
                this.f179451e = 1;
                if (mVar.F(interfaceC4611a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s91.a.InterfaceC4611a interfaceC4611a, State state, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f179452f = interfaceC4611a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls91/a$c;", "action", "Lk10/c0;", "Ls91/b;", "state", "Lk10/l;", "<anonymous>", "(Ls91/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s91.a.Setup, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f179456g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(s91.a.Setup setup, State state) {
            i61.h reasonType = setup.getReasonType();
            return state.a(new DropDownState(reasonType != null ? Integer.valueOf(reasonType.ordinal()) : null, null, 2, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s91.a.Setup setup = (s91.a.Setup) this.f179455f;
            c0 c0Var = (c0) this.f179456g;
            uq.b.e();
            if (this.f179454e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: s91.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.c.O(setup, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s91.a.Setup setup, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f179455f = setup;
            cVar.f179456g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls91/a$b;", "<unused var>", "Lk10/c0;", "Ls91/b;", "state", "Lk10/l;", "<anonymous>", "(Ls91/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s91.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f179457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f179458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f179459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f179460h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, State state) {
            return state.a(new DropDownState(null, bVar, 1, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i61.h hVar;
            hz.b.Companion companion;
            c0 c0Var = (c0) this.f179460h;
            Object objE = uq.b.e();
            int i15 = this.f179459g;
            if (i15 == 0) {
                u.b(obj);
                Integer initialPick = ((State) c0Var.a()).getDropDownState().getInitialPick();
                if (initialPick != null) {
                    hVar = i61.h.e().get(initialPick.intValue());
                } else {
                    hVar = null;
                }
                hz.b.Companion companion2 = hz.b.INSTANCE;
                m61.b bVar = m.this.checkIsReasonValidUC;
                m61.b.Params params = new m61.b.Params(hVar);
                this.f179460h = c0Var;
                this.f179457e = vq.j.a(hVar);
                this.f179458f = companion2;
                this.f179459g = 1;
                obj = bVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
                companion = companion2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f179458f;
                u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            if (!bVarA.a()) {
                return c0Var.b(new er.l() { // from class: s91.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.d.O(bVarA, (State) obj2);
                    }
                });
            }
            m.this.d9(s91.a.InterfaceC4611a.c.f179403a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s91.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f179460h = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, e eVar, m61.b bVar, t91.a aVar2) {
        this.mapper = eVar;
        this.checkIsReasonValidUC = bVar;
        this.setupContract = aVar2;
        i61.h reason = aVar2.q7().getReason();
        State state = new State(new DropDownState(reason != null ? Integer.valueOf(reason.ordinal()) : null, null, 2, null));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: s91.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f179431a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s91.c.Data m9(State state) {
        return this.mapper.b(new e.Params(state, b9(s91.a.InterfaceC4611a.C4612a.f179401a), b9(s91.a.InterfaceC4611a.b.f179402a), b9(s91.a.b.f179405a), b9(s91.a.InterfaceC4611a.d.f179404a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: s91.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f179430a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s91.a.InterfaceC4611a.class), oVar, bVar);
        zVar.v(q0.c(s91.a.Setup.class), oVar, new c(null));
        zVar.v(q0.c(s91.a.b.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s91.a.InterfaceC4611a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, s91.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s91.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(s91.a.InterfaceC4611a interfaceC4611a, tq.e<? super i0> eVar) {
        return super.F(interfaceC4611a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public void P5(t91.a data) {
        t91.a.ChildPassportApplicationReasonData childPassportApplicationReasonDataQ7 = data.q7();
        d9(new s91.a.Setup(childPassportApplicationReasonDataQ7 != null ? childPassportApplicationReasonDataQ7.getReason() : null));
    }
}
