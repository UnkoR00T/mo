package hs1;

import f00.j0;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lhs1/q;", "Ll00/g;", "Lhs1/f;", "", "Lhs1/g;", "Lyy/a;", "stateMachineFactory", "Lhs1/h;", "mapper", "Lhs1/x;", "setupContract", "<init>", "(Lyy/a;Lhs1/h;Lhs1/x;)V", "state", "Lhs1/g$a;", "m9", "(Lhs1/f;)Lhs1/g$a;", "b", "Lhs1/h;", "c", "Lhs1/x;", "d", "Lhs1/f;", "initialState", "Lxw/b;", "Lhs1/e;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements zx.b, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hs1.e> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhs1/q$a;", "Lf00/j0;", "Lhs1/x;", "Lhs1/q;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<x, q> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f86503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f86504b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f86505a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f86506b;

            /* JADX INFO: renamed from: hs1.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2018a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f86507d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f86508e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f86509f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f86511h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f86512j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f86513k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f86514l;

                public C2018a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f86507d = obj;
                    this.f86508e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f86505a = hVar;
                this.f86506b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2018a c2018a;
                if (eVar instanceof C2018a) {
                    c2018a = (C2018a) eVar;
                    int i15 = c2018a.f86508e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2018a.f86508e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2018a = new C2018a(eVar);
                    }
                } else {
                    c2018a = new C2018a(eVar);
                }
                Object obj2 = c2018a.f86507d;
                Object objE = uq.b.e();
                int i16 = c2018a.f86508e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f86505a;
                    g.Data dataM9 = this.f86506b.m9((State) obj);
                    c2018a.f86509f = vq.j.a(obj);
                    c2018a.f86511h = vq.j.a(c2018a);
                    c2018a.f86512j = vq.j.a(obj);
                    c2018a.f86513k = vq.j.a(hVar);
                    c2018a.f86514l = 0;
                    c2018a.f86508e = 1;
                    if (hVar.F(dataM9, c2018a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f86503a = gVar;
            this.f86504b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f86503a.a(new a(hVar, this.f86504b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhs1/d;", "<unused var>", "Lhs1/f;", "snapshot", "Loq/i0;", "<anonymous>", "(Lhs1/d;Lhs1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<hs1.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86516f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f86516f;
            uq.b.e();
            if (this.f86515e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.setupContract.l3(state.getSecondStepData());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hs1.d dVar, State state, tq.e<? super i0> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f86516f = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhs1/b;", "<unused var>", "Lk10/c0;", "Lhs1/f;", "state", "Lk10/l;", "<anonymous>", "(Lhs1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<hs1.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f86519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86520g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SecondStepData secondStepData, State state) {
            return State.b(state, null, secondStepData.getBar().length() > 0, secondStepData.getBaz().length() > 0, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f86520g;
            Object objE = uq.b.e();
            int i15 = this.f86519f;
            if (i15 == 0) {
                oq.u.b(obj);
                final SecondStepData secondStepData = ((State) c0Var.a()).getSecondStepData();
                if (secondStepData.getBar().length() == 0 || secondStepData.getBaz().length() == 0) {
                    return c0Var.b(new er.l() { // from class: hs1.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.d.O(secondStepData, (State) obj2);
                        }
                    });
                }
                q.this.setupContract.l3(secondStepData);
                xw.b<hs1.e> bVarY1 = q.this.Y1();
                hs1.e.a aVar = hs1.e.a.f86474a;
                this.f86520g = c0Var;
                this.f86518e = vq.j.a(secondStepData);
                this.f86519f = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hs1.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f86520g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhs1/a;", "action", "Lk10/c0;", "Lhs1/f;", "state", "Lk10/l;", "<anonymous>", "(Lhs1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnFirstInputDataChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86524g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnFirstInputDataChange onFirstInputDataChange, State state) {
            return State.b(state, SecondStepData.b(state.getSecondStepData(), onFirstInputDataChange.getValue(), null, 2, null), true, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnFirstInputDataChange onFirstInputDataChange = (OnFirstInputDataChange) this.f86523f;
            c0 c0Var = (c0) this.f86524g;
            uq.b.e();
            if (this.f86522e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hs1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(onFirstInputDataChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnFirstInputDataChange onFirstInputDataChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f86523f = onFirstInputDataChange;
            eVar2.f86524g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhs1/c;", "action", "Lk10/c0;", "Lhs1/f;", "state", "Lk10/l;", "<anonymous>", "(Lhs1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnSecondInputDataChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86527g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnSecondInputDataChange onSecondInputDataChange, State state) {
            return State.b(state, SecondStepData.b(state.getSecondStepData(), null, onSecondInputDataChange.getValue(), 1, null), false, true, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnSecondInputDataChange onSecondInputDataChange = (OnSecondInputDataChange) this.f86526f;
            c0 c0Var = (c0) this.f86527g;
            uq.b.e();
            if (this.f86525e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hs1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(onSecondInputDataChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnSecondInputDataChange onSecondInputDataChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f86526f = onSecondInputDataChange;
            fVar.f86527g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, h hVar, x xVar) {
        this.mapper = hVar;
        this.setupContract = xVar;
        State state = new State(xVar.B2(), true, true);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: hs1.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f86493a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data m9(State state) {
        return this.mapper.b(new h.Params(state, new er.l() { // from class: hs1.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.n9(this.f86494a, (String) obj);
            }
        }, new er.l() { // from class: hs1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f86495a, (String) obj);
            }
        }, b9(hs1.d.f86473a), b9(hs1.b.f86471a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(q qVar, String str) {
        qVar.d9(new OnFirstInputDataChange(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, String str) {
        qVar.d9(new OnSecondInputDataChange(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: hs1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f86496a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hs1.d.class), oVar, cVar);
        zVar.v(q0.c(hs1.b.class), oVar, qVar.new d(null));
        zVar.v(q0.c(OnFirstInputDataChange.class), oVar, new e(null));
        zVar.v(q0.c(OnSecondInputDataChange.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hs1.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(g.Data data) {
        super.P5(data);
    }
}
