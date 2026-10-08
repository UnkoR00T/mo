package m91;

import fr.q0;
import i61.r;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lm91/m;", "Ll00/g;", "Lm91/d;", "", "Lm91/e;", "Lyy/a;", "stateMachineFactory", "Ln91/c;", "mapper", "Lo91/a;", "setupData", "<init>", "(Lyy/a;Ln91/c;Lo91/a;)V", "state", "Lm91/e$a;", "l9", "(Lm91/d;)Lm91/e$a;", "b", "Ln91/c;", "c", "Lo91/a;", "d", "Lm91/d;", "initialState", "Lxw/b;", "Lm91/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n91.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o91.a setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m91.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f124747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f124748b;

        /* JADX INFO: renamed from: m91.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3065a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f124749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f124750b;

            /* JADX INFO: renamed from: m91.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3066a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f124751d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f124752e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f124753f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f124755h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f124756j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f124757k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f124758l;

                public C3066a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f124751d = obj;
                    this.f124752e |= PKIFailureInfo.systemUnavail;
                    return C3065a.this.F(null, this);
                }
            }

            public C3065a(mu.h hVar, m mVar) {
                this.f124749a = hVar;
                this.f124750b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3066a c3066a;
                if (eVar instanceof C3066a) {
                    c3066a = (C3066a) eVar;
                    int i15 = c3066a.f124752e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3066a.f124752e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3066a = new C3066a(eVar);
                    }
                } else {
                    c3066a = new C3066a(eVar);
                }
                Object obj2 = c3066a.f124751d;
                Object objE = uq.b.e();
                int i16 = c3066a.f124752e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f124749a;
                    e.Data dataL9 = this.f124750b.l9((State) obj);
                    c3066a.f124753f = vq.j.a(obj);
                    c3066a.f124755h = vq.j.a(c3066a);
                    c3066a.f124756j = vq.j.a(obj);
                    c3066a.f124757k = vq.j.a(hVar);
                    c3066a.f124758l = 0;
                    c3066a.f124752e = 1;
                    if (hVar.F(dataL9, c3066a) == objE) {
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
            this.f124747a = gVar;
            this.f124748b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f124747a.a(new C3065a(hVar, this.f124748b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm91/a;", "action", "Lm91/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm91/a;Lm91/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<m91.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124760f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m91.a aVar = (m91.a) this.f124760f;
            Object objE = uq.b.e();
            int i15 = this.f124759e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m91.a> bVarY1 = m.this.Y1();
                this.f124760f = vq.j.a(aVar);
                this.f124759e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(m91.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f124760f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm91/b;", "<unused var>", "Lm91/d;", "state", "Loq/i0;", "<anonymous>", "(Lm91/b;Lm91/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<m91.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124763f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f124763f;
            Object objE = uq.b.e();
            int i15 = this.f124762e;
            if (i15 == 0) {
                u.b(obj);
                m.this.setupData.G1(new o91.a.ChildPassportApplicationPickupMethodData(state.getPickupMethod()));
                xw.b<m91.a> bVarY1 = m.this.Y1();
                m91.a.c cVar = m91.a.c.f124722a;
                this.f124763f = vq.j.a(state);
                this.f124762e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(m91.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f124763f = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm91/c;", "action", "Lk10/c0;", "Lm91/d;", "state", "Lk10/l;", "<anonymous>", "(Lm91/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<PickupMethodChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f124767g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(PickupMethodChanged pickupMethodChanged, State state) {
            return State.b(state, pickupMethodChanged.getPickupMethod(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final PickupMethodChanged pickupMethodChanged = (PickupMethodChanged) this.f124766f;
            c0 c0Var = (c0) this.f124767g;
            uq.b.e();
            if (this.f124765e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: m91.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.d.O(pickupMethodChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(PickupMethodChanged pickupMethodChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f124766f = pickupMethodChanged;
            dVar.f124767g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, n91.c cVar, o91.a aVar2) {
        String address;
        this.mapper = cVar;
        this.setupData = aVar2;
        o91.a.ChildPassportApplicationPickupMethodData childPassportApplicationPickupMethodDataF4 = aVar2.f4();
        r pickupMethod = (childPassportApplicationPickupMethodDataF4 == null || (pickupMethod = childPassportApplicationPickupMethodDataF4.getPickupMethod()) == null) ? r.IN_PERSON : pickupMethod;
        i61.d.Foreign foreignK = aVar2.k();
        State state = new State(pickupMethod, (foreignK == null || (address = foreignK.getAddress()) == null) ? "" : address);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: m91.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f124740a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(State state) {
        return this.mapper.b(new n91.c.Params(state, b9(m91.a.C3064a.f124720a), b9(m91.a.b.f124721a), b9(m91.b.f124723a), new er.l() { // from class: m91.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f124739a, (r) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, r rVar) {
        mVar.d9(new PickupMethodChanged(rVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: m91.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f124738a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(m91.a.class), oVar, bVar);
        zVar.x(q0.c(m91.b.class), oVar, mVar.new c(null));
        zVar.v(q0.c(PickupMethodChanged.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m91.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(o91.a aVar) {
        super.P5(aVar);
    }
}
