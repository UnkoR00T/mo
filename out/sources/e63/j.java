package e63;

import a63.RepeatSetNewPinNavResultData;
import er.q;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import x60.BasicPinInputScreenData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Le63/j;", "Ll00/g;", "Le63/b;", "Le63/a;", "Le63/c;", "", "Lyy/a;", "stateMachineFactory", "Lg73/d;", "settingsNavigationDialogMapper", "Lf63/b;", "mapper", "<init>", "(Lyy/a;Lg73/d;Lf63/b;)V", "state", "Lx60/c;", "n9", "(Le63/b;)Lx60/c;", "b", "Lg73/d;", "c", "Lf63/b;", "d", "Le63/b;", "initialState", "Lxw/b;", "Le63/a$b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, e63.a> implements e63.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f63.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e63.a.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, e63.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<BasicPinInputScreenData> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<BasicPinInputScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f47876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f47877b;

        /* JADX INFO: renamed from: e63.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1110a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f47878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f47879b;

            /* JADX INFO: renamed from: e63.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1111a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f47880d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f47881e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f47882f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f47884h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f47885j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f47886k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f47887l;

                public C1111a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f47880d = obj;
                    this.f47881e |= PKIFailureInfo.systemUnavail;
                    return C1110a.this.F(null, this);
                }
            }

            public C1110a(mu.h hVar, j jVar) {
                this.f47878a = hVar;
                this.f47879b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1111a c1111a;
                if (eVar instanceof C1111a) {
                    c1111a = (C1111a) eVar;
                    int i15 = c1111a.f47881e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1111a.f47881e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1111a = new C1111a(eVar);
                    }
                } else {
                    c1111a = new C1111a(eVar);
                }
                Object obj2 = c1111a.f47880d;
                Object objE = uq.b.e();
                int i16 = c1111a.f47881e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f47878a;
                    BasicPinInputScreenData basicPinInputScreenDataN9 = this.f47879b.n9((State) obj);
                    c1111a.f47882f = vq.j.a(obj);
                    c1111a.f47884h = vq.j.a(c1111a);
                    c1111a.f47885j = vq.j.a(obj);
                    c1111a.f47886k = vq.j.a(hVar);
                    c1111a.f47887l = 0;
                    c1111a.f47881e = 1;
                    if (hVar.F(basicPinInputScreenDataN9, c1111a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f47876a = gVar;
            this.f47877b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super BasicPinInputScreenData> hVar, tq.e eVar) {
            Object objA = this.f47876a.a(new C1110a(hVar, this.f47877b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le63/a$a;", "<unused var>", "Le63/b;", "Loq/i0;", "<anonymous>", "(Le63/a$a;Le63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<e63.a.C1107a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47888e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47888e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                e63.a.b.C1108a c1108a = e63.a.b.C1108a.f47851a;
                this.f47888e = 1;
                if (jVar.F(c1108a, this) == objE) {
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
        public final Object w(e63.a.C1107a c1107a, State state, tq.e<? super i0> eVar) {
            return j.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le63/a$e;", "<unused var>", "Le63/b;", "Loq/i0;", "<anonymous>", "(Le63/a$e;Le63/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<e63.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47890e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47890e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                e63.a.b.c cVar = new e63.a.b.c(j.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(j.this.b9(e63.a.C1107a.f47850a), null, 2, null))));
                this.f47890e = 1;
                if (jVar.F(cVar, this) == objE) {
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
        public final Object w(e63.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return j.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le63/a$d;", "action", "Lk10/c0;", "Le63/b;", "state", "Lk10/l;", "<anonymous>", "(Le63/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<e63.a.OnPinChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f47894g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(e63.a.OnPinChanged onPinChanged, State state) {
            return state.a(onPinChanged.getPinValue(), hz.b.C2039b.f86846c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e63.a.OnPinChanged onPinChanged = (e63.a.OnPinChanged) this.f47893f;
            c0 c0Var = (c0) this.f47894g;
            uq.b.e();
            if (this.f47892e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: e63.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.d.O(onPinChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e63.a.OnPinChanged onPinChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f47893f = onPinChanged;
            dVar.f47894g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le63/a$c;", "<unused var>", "Lk10/c0;", "Le63/b;", "state", "Lk10/l;", "<anonymous>", "(Le63/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<e63.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47896f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(b0.INSTANCE.a(), hz.b.C2039b.f86846c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f47896f;
            Object objE = uq.b.e();
            int i15 = this.f47895e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                e63.a.b.NavigateToRepeatSetNewPinScreen navigateToRepeatSetNewPinScreen = new e63.a.b.NavigateToRepeatSetNewPinScreen(new RepeatSetNewPinNavResultData(((State) c0Var.a()).getPinValue()));
                this.f47896f = c0Var;
                this.f47895e = 1;
                if (jVar.F(navigateToRepeatSetNewPinScreen, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: e63.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e63.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = j.this.new e(eVar);
            eVar2.f47896f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, g73.d dVar, f63.b bVar) {
        this.settingsNavigationDialogMapper = dVar;
        this.mapper = bVar;
        State state = new State(b0.INSTANCE.a(), hz.b.C2039b.f86846c);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: e63.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.q9(this.f47867a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasicPinInputScreenData n9(State state) {
        return this.mapper.b(new f63.b.Params(state, b9(e63.a.e.f47859a), new er.l() { // from class: e63.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.o9(this.f47868a, (b0) obj);
            }
        }, b9(e63.a.c.f47856a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(j jVar, b0 b0Var) {
        jVar.d9(new e63.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: e63.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.r9(this.f47869a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e63.a.C1107a.class), oVar, bVar);
        zVar.x(q0.c(e63.a.e.class), oVar, jVar.new c(null));
        zVar.v(q0.c(e63.a.OnPinChanged.class), oVar, new d(null));
        zVar.v(q0.c(e63.a.c.class), oVar, jVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e63.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, e63.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<BasicPinInputScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(e63.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
