package p92;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lp92/o;", "Ll00/g;", "Lp92/e;", "", "Lp92/f;", "Lyy/a;", "stateMachineFactory", "Le82/f;", "checkIfWasteTypeIsValidUseCase", "Lr92/a;", "wasteTypeEntryFieldMapper", "Lq92/a;", "contract", "<init>", "(Lyy/a;Le82/f;Lr92/a;Lq92/a;)V", "state", "Lp92/f$a;", "n9", "(Lp92/e;)Lp92/f$a;", "b", "Le82/f;", "c", "Lr92/a;", "d", "Lq92/a;", "e", "Lp92/e;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lp92/c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e82.f checkIfWasteTypeIsValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r92.a wasteTypeEntryFieldMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q92.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p92.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f153680b;

        /* JADX INFO: renamed from: p92.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3799a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f153682b;

            /* JADX INFO: renamed from: p92.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3800a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153683d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153684e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153685f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153687h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153688j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153689k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153690l;

                public C3800a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153683d = obj;
                    this.f153684e |= PKIFailureInfo.systemUnavail;
                    return C3799a.this.F(null, this);
                }
            }

            public C3799a(mu.h hVar, o oVar) {
                this.f153681a = hVar;
                this.f153682b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3800a c3800a;
                if (eVar instanceof C3800a) {
                    c3800a = (C3800a) eVar;
                    int i15 = c3800a.f153684e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3800a.f153684e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3800a = new C3800a(eVar);
                    }
                } else {
                    c3800a = new C3800a(eVar);
                }
                Object obj2 = c3800a.f153683d;
                Object objE = uq.b.e();
                int i16 = c3800a.f153684e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f153681a;
                    f.Data dataN9 = this.f153682b.n9((State) obj);
                    c3800a.f153685f = vq.j.a(obj);
                    c3800a.f153687h = vq.j.a(c3800a);
                    c3800a.f153688j = vq.j.a(obj);
                    c3800a.f153689k = vq.j.a(hVar);
                    c3800a.f153690l = 0;
                    c3800a.f153684e = 1;
                    if (hVar.F(dataN9, c3800a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f153679a = gVar;
            this.f153680b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f153679a.a(new C3799a(hVar, this.f153680b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp92/a;", "action", "Lk10/c0;", "Lp92/e;", "state", "Lk10/l;", "<anonymous>", "(Lp92/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<AddWasteTypeAction, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f153693g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(AddWasteTypeAction addWasteTypeAction, State state) {
            return State.b(state, new State.InputState(null, addWasteTypeAction.getWasteType(), 1, null), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final AddWasteTypeAction addWasteTypeAction = (AddWasteTypeAction) this.f153692f;
            k10.c0 c0Var = (k10.c0) this.f153693g;
            uq.b.e();
            if (this.f153691e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p92.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.O(addWasteTypeAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(AddWasteTypeAction addWasteTypeAction, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f153692f = addWasteTypeAction;
            bVar.f153693g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp92/d;", "<unused var>", "Lk10/c0;", "Lp92/e;", "state", "Lk10/l;", "<anonymous>", "(Lp92/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<p92.d, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153695f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f153695f;
            uq.b.e();
            if (this.f153694e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: p92.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p92.d dVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f153695f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lp92/b;", "<unused var>", "Lk10/c0;", "Lp92/e;", "state", "Lk10/l;", "<anonymous>", "(Lp92/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<p92.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f153696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f153697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f153698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f153699h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f153700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f153701k;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return state.a(State.InputState.b(state.getWasteTypeState(), hz.b.INSTANCE.a(gVar), null, 2, null), true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f153701k;
            Object objE = uq.b.e();
            int i15 = this.f153700j;
            if (i15 == 0) {
                oq.u.b(obj);
                e82.f fVar = o.this.checkIfWasteTypeIsValidUseCase;
                e82.f.Params params = new e82.f.Params(((State) c0Var.a()).getWasteTypeState().getValue());
                this.f153701k = c0Var;
                this.f153700j = 1;
                obj = fVar.d(params, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f153697f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            final hz.g gVar = (hz.g) obj;
            if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                if (gVar instanceof hz.g.Invalid) {
                    return c0Var.b(new er.l() { // from class: p92.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o.d.O(gVar, (State) obj2);
                        }
                    });
                }
                throw new oq.p();
            }
            k10.l lVarC = c0Var.c();
            o oVar = o.this;
            oVar.contract.s8(new fp0.m.Others(mx.b.b(((State) c0Var.a()).getWasteTypeState().getValue(), "TypeTagOthers")));
            p92.c.a aVar = p92.c.a.f153617a;
            this.f153701k = vq.j.a(c0Var);
            this.f153696e = vq.j.a(gVar);
            this.f153697f = lVarC;
            this.f153698g = vq.j.a(lVarC);
            this.f153699h = 0;
            this.f153700j = 2;
            return oVar.F(aVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p92.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f153701k = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, e82.f fVar, r92.a aVar2, q92.a aVar3) {
        this.checkIfWasteTypeIsValidUseCase = fVar;
        this.wasteTypeEntryFieldMapper = aVar2;
        this.contract = aVar3;
        State state = new State(null, false, 3, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: p92.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f153671a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data n9(State state) {
        return this.wasteTypeEntryFieldMapper.b(new r92.a.Params(state, new er.l() { // from class: p92.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f153669a, (String) obj);
            }
        }, b9(p92.d.f153619a), b9(p92.b.f153616a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(o oVar, String str) {
        oVar.d9(new AddWasteTypeAction(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: p92.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f153670a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(AddWasteTypeAction.class), oVar2, bVar);
        zVar.v(q0.c(p92.d.class), oVar2, new c(null));
        zVar.v(q0.c(p92.b.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p92.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p92.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(q92.a aVar) {
        super.P5(aVar);
    }
}
