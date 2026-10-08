package l53;

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
import p53.RepeatNewPinNavResultData;
import x60.BasicPinInputScreenData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Ll53/j;", "Ll00/g;", "Ll53/b;", "Ll53/a;", "Ll53/c;", "", "Lyy/a;", "stateMachineFactory", "Lm53/b;", "mapper", "Lg73/d;", "settingsNavigationDialogMapper", "<init>", "(Lyy/a;Lm53/b;Lg73/d;)V", "state", "Lx60/c;", "o9", "(Ll53/b;)Lx60/c;", "b", "Lm53/b;", "c", "Lg73/d;", "d", "Ll53/b;", "initialState", "Lxw/b;", "Ll53/a$b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, l53.a> implements l53.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m53.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l53.a.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, l53.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<BasicPinInputScreenData> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<BasicPinInputScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f116292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f116293b;

        /* JADX INFO: renamed from: l53.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2815a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f116294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f116295b;

            /* JADX INFO: renamed from: l53.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2816a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f116296d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f116297e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f116298f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f116300h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f116301j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f116302k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f116303l;

                public C2816a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f116296d = obj;
                    this.f116297e |= PKIFailureInfo.systemUnavail;
                    return C2815a.this.F(null, this);
                }
            }

            public C2815a(mu.h hVar, j jVar) {
                this.f116294a = hVar;
                this.f116295b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2816a c2816a;
                if (eVar instanceof C2816a) {
                    c2816a = (C2816a) eVar;
                    int i15 = c2816a.f116297e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2816a.f116297e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2816a = new C2816a(eVar);
                    }
                } else {
                    c2816a = new C2816a(eVar);
                }
                Object obj2 = c2816a.f116296d;
                Object objE = uq.b.e();
                int i16 = c2816a.f116297e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f116294a;
                    BasicPinInputScreenData basicPinInputScreenDataO9 = this.f116295b.o9((State) obj);
                    c2816a.f116298f = vq.j.a(obj);
                    c2816a.f116300h = vq.j.a(c2816a);
                    c2816a.f116301j = vq.j.a(obj);
                    c2816a.f116302k = vq.j.a(hVar);
                    c2816a.f116303l = 0;
                    c2816a.f116297e = 1;
                    if (hVar.F(basicPinInputScreenDataO9, c2816a) == objE) {
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
            this.f116292a = gVar;
            this.f116293b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super BasicPinInputScreenData> hVar, tq.e eVar) {
            Object objA = this.f116292a.a(new C2815a(hVar, this.f116293b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll53/a$e;", "<unused var>", "Ll53/b;", "Loq/i0;", "<anonymous>", "(Ll53/a$e;Ll53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<l53.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116304e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116304e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                l53.a.b.ShowNavigationDialog showNavigationDialog = new l53.a.b.ShowNavigationDialog(j.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(j.this.b9(l53.a.C2812a.f116266a), null, 2, null))));
                this.f116304e = 1;
                if (jVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(l53.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return j.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll53/a$a;", "<unused var>", "Ll53/b;", "Loq/i0;", "<anonymous>", "(Ll53/a$a;Ll53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<l53.a.C2812a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116306e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f116306e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                l53.a.b.C2813a c2813a = l53.a.b.C2813a.f116267a;
                this.f116306e = 1;
                if (jVar.F(c2813a, this) == objE) {
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
        public final Object w(l53.a.C2812a c2812a, State state, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll53/a$d;", "action", "Lk10/c0;", "Ll53/b;", "state", "Lk10/l;", "<anonymous>", "(Ll53/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<l53.a.OnPinChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f116310g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(l53.a.OnPinChanged onPinChanged, State state) {
            return state.a(onPinChanged.getPinValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return state.a(b0.INSTANCE.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l53.a.OnPinChanged onPinChanged = (l53.a.OnPinChanged) this.f116309f;
            c0 c0Var = (c0) this.f116310g;
            uq.b.e();
            if (this.f116308e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (onPinChanged.getPinValue().getData().length < 4) {
                return c0Var.b(new er.l() { // from class: l53.k
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j.d.V(onPinChanged, (State) obj2);
                    }
                });
            }
            j.this.d9(new l53.a.NavigateToRepeatNewPinScreen(new RepeatNewPinNavResultData(onPinChanged.getPinValue())));
            return c0Var.b(new er.l() { // from class: l53.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.d.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(l53.a.OnPinChanged onPinChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = j.this.new d(eVar);
            dVar.f116309f = onPinChanged;
            dVar.f116310g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll53/a$c;", "action", "Ll53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll53/a$c;Ll53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<l53.a.NavigateToRepeatNewPinScreen, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f116312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f116313f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l53.a.NavigateToRepeatNewPinScreen navigateToRepeatNewPinScreen = (l53.a.NavigateToRepeatNewPinScreen) this.f116313f;
            Object objE = uq.b.e();
            int i15 = this.f116312e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                l53.a.b.C2814b c2814b = new l53.a.b.C2814b(navigateToRepeatNewPinScreen.getResultData());
                this.f116313f = vq.j.a(navigateToRepeatNewPinScreen);
                this.f116312e = 1;
                if (jVar.F(c2814b, this) == objE) {
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
        public final Object w(l53.a.NavigateToRepeatNewPinScreen navigateToRepeatNewPinScreen, State state, tq.e<? super i0> eVar) {
            e eVar2 = j.this.new e(eVar);
            eVar2.f116313f = navigateToRepeatNewPinScreen;
            return eVar2.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, m53.b bVar, g73.d dVar) {
        this.mapper = bVar;
        this.settingsNavigationDialogMapper = dVar;
        State state = new State(null, 1, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: l53.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.r9(this.f116283a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasicPinInputScreenData o9(State state) {
        return this.mapper.b(new m53.b.Params(state, b9(l53.a.e.f116276a), new er.l() { // from class: l53.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.p9(this.f116285a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(j jVar, b0 b0Var) {
        jVar.d9(new l53.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: l53.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.s9(this.f116284a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l53.a.e.class), oVar, bVar);
        zVar.x(q0.c(l53.a.C2812a.class), oVar, jVar.new c(null));
        zVar.v(q0.c(l53.a.OnPinChanged.class), oVar, jVar.new d(null));
        zVar.x(q0.c(l53.a.NavigateToRepeatNewPinScreen.class), oVar, jVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l53.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, l53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<BasicPinInputScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(l53.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
