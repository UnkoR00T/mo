package fs1;

import fr.q0;
import gs1.FirstStepData;
import hs1.SecondStepData;
import is1.SummaryData;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00168\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u001c\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u00103¨\u00065"}, d2 = {"Lfs1/t;", "Ll00/g;", "Lfs1/e;", "", "Lfs1/f;", "Lyy/a;", "stateMachineFactory", "<init>", "(Lyy/a;)V", "Lgs1/t;", "data", "Loq/i0;", "J7", "(Lgs1/t;)V", "Lhs1/y;", "l3", "(Lhs1/y;)V", "b", "Lfs1/e;", "getInitialState", "()Lfs1/e;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lfs1/d;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "L5", "()Lgs1/t;", "firstStepData", "B2", "()Lhs1/y;", "secondStepData", "Lis1/k;", "()Lis1/k;", "summaryData", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfs1/a;", "<unused var>", "Lfs1/e;", "Loq/i0;", "<anonymous>", "(Lfs1/a;Lfs1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<fs1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66855e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f66855e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<d> bVarY1 = t.this.Y1();
                d.a aVar = d.a.f66832a;
                this.f66855e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(fs1.a aVar, State state, tq.e<? super i0> eVar) {
            return t.this.new a(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfs1/b;", "action", "Lk10/c0;", "Lfs1/e;", "state", "Lk10/l;", "<anonymous>", "(Lfs1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<FirstStepChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66858f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66859g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(FirstStepChanged firstStepChanged, State state) {
            return State.b(state, firstStepChanged.getData(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final FirstStepChanged firstStepChanged = (FirstStepChanged) this.f66858f;
            c0 c0Var = (c0) this.f66859g;
            uq.b.e();
            if (this.f66857e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fs1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.b.O(firstStepChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(FirstStepChanged firstStepChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f66858f = firstStepChanged;
            bVar.f66859g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfs1/c;", "action", "Lk10/c0;", "Lfs1/e;", "state", "Lk10/l;", "<anonymous>", "(Lfs1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SecondStepChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66862g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SecondStepChanged secondStepChanged, State state) {
            return State.b(state, null, secondStepChanged.getData(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SecondStepChanged secondStepChanged = (SecondStepChanged) this.f66861f;
            c0 c0Var = (c0) this.f66862g;
            uq.b.e();
            if (this.f66860e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fs1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.c.O(secondStepChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SecondStepChanged secondStepChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f66861f = secondStepChanged;
            cVar.f66862g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar) {
        State state = new State(new FirstStepData(""), new SecondStepData("", ""));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: fs1.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.j9(this.f66849a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: fs1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.k9(this.f66850a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(t tVar, z zVar) {
        a aVar = tVar.new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fs1.a.class), oVar, aVar);
        zVar.v(q0.c(FirstStepChanged.class), oVar, new b(null));
        zVar.v(q0.c(SecondStepChanged.class), oVar, new c(null));
        return i0.f148189a;
    }

    @Override // hs1.x
    public SecondStepData B2() {
        return getState().getValue().getSecondStepData();
    }

    @Override // gs1.s
    public void J7(FirstStepData data) {
        d9(new FirstStepChanged(data));
    }

    @Override // gs1.s
    public FirstStepData L5() {
        return getState().getValue().getFirstStepData();
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // is1.l
    public SummaryData c() {
        return new SummaryData(getState().getValue().getFirstStepData(), getState().getValue().getSecondStepData());
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // hs1.x
    public void l3(SecondStepData data) {
        d9(new SecondStepChanged(data));
    }
}
