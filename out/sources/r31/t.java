package r31;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lr31/t;", "Ll00/g;", "Lr31/d;", "Lr31/a;", "Lr31/e;", "", "Lyy/a;", "stateMachineFactory", "Ls31/b;", "mapper", "Lr31/c;", "setupData", "<init>", "(Lyy/a;Ls31/b;Lr31/c;)V", "Lr31/e$a;", "n9", "(Lr31/d;)Lr31/e$a;", "b", "Ls31/b;", "c", "Lr31/c;", "d", "Lr31/d;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lr31/a$a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, r31.a> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s31.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, r31.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r31.a.InterfaceC4344a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f171314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f171315b;

        /* JADX INFO: renamed from: r31.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4346a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f171316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f171317b;

            /* JADX INFO: renamed from: r31.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4347a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f171318d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f171319e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f171320f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f171322h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f171323j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f171324k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f171325l;

                public C4347a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f171318d = obj;
                    this.f171319e |= PKIFailureInfo.systemUnavail;
                    return C4346a.this.F(null, this);
                }
            }

            public C4346a(mu.h hVar, t tVar) {
                this.f171316a = hVar;
                this.f171317b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4347a c4347a;
                if (eVar instanceof C4347a) {
                    c4347a = (C4347a) eVar;
                    int i15 = c4347a.f171319e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4347a.f171319e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4347a = new C4347a(eVar);
                    }
                } else {
                    c4347a = new C4347a(eVar);
                }
                Object obj2 = c4347a.f171318d;
                Object objE = uq.b.e();
                int i16 = c4347a.f171319e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f171316a;
                    e.Data dataN9 = this.f171317b.n9((State) obj);
                    c4347a.f171320f = vq.j.a(obj);
                    c4347a.f171322h = vq.j.a(c4347a);
                    c4347a.f171323j = vq.j.a(obj);
                    c4347a.f171324k = vq.j.a(hVar);
                    c4347a.f171325l = 0;
                    c4347a.f171319e = 1;
                    if (hVar.F(dataN9, c4347a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f171314a = gVar;
            this.f171315b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f171314a.a(new C4346a(hVar, this.f171315b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr31/a$a;", "action", "Lr31/d;", "state", "Loq/i0;", "<anonymous>", "(Lr31/a$a;Lr31/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<r31.a.InterfaceC4344a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171328g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r31.a.InterfaceC4344a interfaceC4344a = (r31.a.InterfaceC4344a) this.f171327f;
            State state = (State) this.f171328g;
            Object objE = uq.b.e();
            int i15 = this.f171326e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(interfaceC4344a, r31.a.InterfaceC4344a.C4345a.f171274a) && state.getSearchIsActive()) {
                    t.this.d9(new r31.a.SetSearchActive(false));
                    return i0.f148189a;
                }
                xw.b<r31.a.InterfaceC4344a> bVarY1 = t.this.Y1();
                this.f171327f = vq.j.a(interfaceC4344a);
                this.f171328g = vq.j.a(state);
                this.f171326e = 1;
                if (bVarY1.F(interfaceC4344a, this) == objE) {
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
        public final Object w(r31.a.InterfaceC4344a interfaceC4344a, State state, tq.e<? super i0> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f171327f = interfaceC4344a;
            bVar.f171328g = state;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr31/a$b;", "action", "Lk10/c0;", "Lr31/d;", "state", "Lk10/l;", "<anonymous>", "(Lr31/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r31.a.SetSearchActive, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171332g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r31.a.SetSearchActive setSearchActive, State state) {
            return State.b(state, null, setSearchActive.getIsActive() ? state.getSearchQuery() : "", setSearchActive.getIsActive(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r31.a.SetSearchActive setSearchActive = (r31.a.SetSearchActive) this.f171331f;
            c0 c0Var = (c0) this.f171332g;
            uq.b.e();
            if (this.f171330e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r31.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.c.O(setSearchActive, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r31.a.SetSearchActive setSearchActive, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f171331f = setSearchActive;
            cVar.f171332g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr31/a$c;", "action", "Lk10/c0;", "Lr31/d;", "state", "Lk10/l;", "<anonymous>", "(Lr31/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r31.a.SetSearchQuery, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171335g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r31.a.SetSearchQuery setSearchQuery, State state) {
            return State.b(state, null, setSearchQuery.getQuery(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r31.a.SetSearchQuery setSearchQuery = (r31.a.SetSearchQuery) this.f171334f;
            c0 c0Var = (c0) this.f171335g;
            uq.b.e();
            if (this.f171333e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r31.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(setSearchQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r31.a.SetSearchQuery setSearchQuery, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f171334f = setSearchQuery;
            dVar.f171335g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, s31.b bVar, SetupData setupData) {
        this.mapper = bVar;
        this.setupData = setupData;
        State state = new State(setupData.getOfficeSearchItems(), null, false, 6, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: r31.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.s9(this.f171307a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9(final State state) {
        return this.mapper.b(new s31.b.Params(state, b9(r31.a.InterfaceC4344a.C4345a.f171274a), new er.l() { // from class: r31.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.o9(this.f171302a, state, (String) obj);
            }
        }, new er.l() { // from class: r31.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.p9(this.f171304a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: r31.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.q9(this.f171305a, (String) obj);
            }
        }, b9(new r31.a.SetSearchQuery(""))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(t tVar, State state, String str) {
        tVar.d9(new r31.a.InterfaceC4344a.SelectedItem(new ResultData(str, state.getOfficeSearchItems().getItemType())));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(t tVar, boolean z15) {
        tVar.d9(new r31.a.SetSearchActive(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(t tVar, String str) {
        tVar.d9(new r31.a.SetSearchQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: r31.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f171306a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(r31.a.InterfaceC4344a.class), oVar, bVar);
        zVar.v(q0.c(r31.a.SetSearchActive.class), oVar, new c(null));
        zVar.v(q0.c(r31.a.SetSearchQuery.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<r31.a.InterfaceC4344a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, r31.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
