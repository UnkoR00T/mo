package f73;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lf73/p;", "Ll00/g;", "Lf73/b;", "Lf73/a;", "Lf73/c;", "", "Lyy/a;", "stateMachineFactory", "Lf73/e;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lg73/d;", "settingsNavigationDialogMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lv64/j;", "compareWithCurrentPasswordUseCase", "<init>", "(Lyy/a;Lf73/e;Lib4/c;Lg73/d;Lac4/a;Lv64/j;)V", "state", "Lf73/c$a;", "s9", "(Lf73/b;)Lf73/c$a;", "b", "Lf73/e;", "c", "Lib4/c;", "d", "Lg73/d;", "e", "Lac4/a;", "f", "Lv64/j;", "g", "Lf73/b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lf73/a$d;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, f73.a> implements f73.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f73.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final v64.j compareWithCurrentPasswordUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, f73.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f73.a.d> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<f73.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f73.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f59899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f59900b;

        /* JADX INFO: renamed from: f73.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1352a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f59901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f59902b;

            /* JADX INFO: renamed from: f73.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1353a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f59903d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f59904e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f59905f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f59907h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f59908j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f59909k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f59910l;

                public C1353a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f59903d = obj;
                    this.f59904e |= PKIFailureInfo.systemUnavail;
                    return C1352a.this.F(null, this);
                }
            }

            public C1352a(mu.h hVar, p pVar) {
                this.f59901a = hVar;
                this.f59902b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1353a c1353a;
                if (eVar instanceof C1353a) {
                    c1353a = (C1353a) eVar;
                    int i15 = c1353a.f59904e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1353a.f59904e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1353a = new C1353a(eVar);
                    }
                } else {
                    c1353a = new C1353a(eVar);
                }
                Object obj2 = c1353a.f59903d;
                Object objE = uq.b.e();
                int i16 = c1353a.f59904e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f59901a;
                    f73.c.Data dataS9 = this.f59902b.s9((State) obj);
                    c1353a.f59905f = vq.j.a(obj);
                    c1353a.f59907h = vq.j.a(c1353a);
                    c1353a.f59908j = vq.j.a(obj);
                    c1353a.f59909k = vq.j.a(hVar);
                    c1353a.f59910l = 0;
                    c1353a.f59904e = 1;
                    if (hVar.F(dataS9, c1353a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f59899a = gVar;
            this.f59900b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f73.c.Data> hVar, tq.e eVar) {
            Object objA = this.f59899a.a(new C1352a(hVar, this.f59900b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf73/a$b;", "<unused var>", "Lf73/b;", "Loq/i0;", "<anonymous>", "(Lf73/a$b;Lf73/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f73.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59911e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f59911e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                f73.a.d.C1350a c1350a = f73.a.d.C1350a.f59848a;
                this.f59911e = 1;
                if (pVar.F(c1350a, this) == objE) {
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
        public final Object w(f73.a.b bVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf73/a$f;", "<unused var>", "Lf73/b;", "Loq/i0;", "<anonymous>", "(Lf73/a$f;Lf73/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<f73.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59913e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f59913e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                f73.a.d.ShowExitDialog showExitDialog = new f73.a.d.ShowExitDialog(p.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(p.this.b9(f73.a.b.f59846a), null, 2, null))));
                this.f59913e = 1;
                if (pVar.F(showExitDialog, this) == objE) {
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
        public final Object w(f73.a.f fVar, State state, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf73/a$e;", "action", "Lk10/c0;", "Lf73/b;", "state", "Lk10/l;", "<anonymous>", "(Lf73/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<f73.a.PasswordTyped, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59917g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f73.a.PasswordTyped passwordTyped, State state) {
            return state.a(passwordTyped.getPassword(), hz.b.C2039b.f86846c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final f73.a.PasswordTyped passwordTyped = (f73.a.PasswordTyped) this.f59916f;
            c0 c0Var = (c0) this.f59917g;
            uq.b.e();
            if (this.f59915e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: f73.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(passwordTyped, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f73.a.PasswordTyped passwordTyped, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f59916f = passwordTyped;
            dVar.f59917g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf73/a$a;", "<unused var>", "Lk10/c0;", "Lf73/b;", "state", "Lk10/l;", "<anonymous>", "(Lf73/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<f73.a.C1349a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59919f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lf73/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f59921e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f59922f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<State> f59923g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f59922f = pVar;
                this.f59923g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(p pVar, State state) {
                return State.b(state, null, new hz.b.Invalid(pVar.mapper.f()), 1, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f59921e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v64.j jVar = this.f59922f.compareWithCurrentPasswordUseCase;
                    v64.j.Params params = new v64.j.Params(this.f59923g.a().getPassword());
                    this.f59921e = 1;
                    obj = jVar.c(params, this);
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
                final p pVar = this.f59922f;
                c0<State> c0Var = this.f59923g;
                if (iVar instanceof dx.i.Left) {
                    pVar.d9(new f73.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                if (zBooleanValue) {
                    pVar.d9(f73.a.g.f59856a);
                    return c0Var.c();
                }
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return c0Var.b(new er.l() { // from class: f73.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.e.a.V(pVar, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f59922f, this.f59923g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p pVar, State state) {
            return State.b(state, null, new hz.b.Invalid(pVar.mapper.e()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f59919f;
            Object objE = uq.b.e();
            int i15 = this.f59918e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fu.r.t0(iy.c0.e(((State) c0Var.a()).getPassword()))) {
                    final p pVar = p.this;
                    return c0Var.b(new er.l() { // from class: f73.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.e.O(pVar, (State) obj2);
                        }
                    });
                }
                ac4.a aVar = p.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p.this, c0Var, null);
                this.f59919f = vq.j.a(c0Var);
                this.f59918e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f73.a.C1349a c1349a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f59919f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf73/a$g;", "<unused var>", "Lf73/b;", "Loq/i0;", "<anonymous>", "(Lf73/a$g;Lf73/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<f73.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59924e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f59924e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                f73.a.d.C1351d c1351d = f73.a.d.C1351d.f59852a;
                this.f59924e = 1;
                if (pVar.F(c1351d, this) == objE) {
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
        public final Object w(f73.a.g gVar, State state, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf73/a$c;", "<destruct>", "Lf73/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf73/a$c;Lf73/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<f73.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59927f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.a.Close) {
                pVar.d9(f73.a.b.f59846a);
            } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    pVar.d9(f73.a.b.f59846a);
                } else if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f73.a.Error error = (f73.a.Error) this.f59927f;
            uq.b.e();
            if (this.f59926e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.b domainError = error.getDomainError();
            ib4.c cVar = p.this.genericDomainErrorMapper;
            final p pVar = p.this;
            new f73.a.d.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: f73.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O(pVar, (ib4.c.b) obj2);
                }
            }, 2, null)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f73.a.Error error, State state, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f59927f = error;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, f73.e eVar, ib4.c cVar, g73.d dVar, ac4.a aVar2, v64.j jVar) {
        this.mapper = eVar;
        this.genericDomainErrorMapper = cVar;
        this.settingsNavigationDialogMapper = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.compareWithCurrentPasswordUseCase = jVar;
        State state = new State(b0.INSTANCE.a(), hz.b.C2039b.f86846c);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: f73.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f59887a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f73.c.Data s9(State state) {
        return this.mapper.b(new f73.e.Params(state, new er.l() { // from class: f73.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f59888a, (b0) obj);
            }
        }, b9(f73.a.C1349a.f59845a), b9(f73.a.f.f59855a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, b0 b0Var) {
        pVar.d9(new f73.a.PasswordTyped(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: f73.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f59889a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(f73.a.b.class), oVar, bVar);
        zVar.x(q0.c(f73.a.f.class), oVar, pVar.new c(null));
        zVar.v(q0.c(f73.a.PasswordTyped.class), oVar, new d(null));
        zVar.v(q0.c(f73.a.C1349a.class), oVar, pVar.new e(null));
        zVar.x(q0.c(f73.a.g.class), oVar, pVar.new f(null));
        zVar.x(q0.c(f73.a.Error.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<f73.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, f73.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f73.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(f73.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
