package k94;

import fr.q0;
import j94.PartialBehaviourGrade;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001&B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lk94/t;", "Ll00/g;", "Lk94/q;", "", "Lyy/a;", "stateMachineFactory", "Lh94/a;", "featureConfig", "", "studentId", "<init>", "(Lyy/a;Lh94/a;Ljava/lang/String;)V", "Lj94/f;", "grade", "Loq/i0;", "V4", "(Lj94/f;)V", "b", "Lk94/q;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "()Lh94/a;", "f", "()Ljava/lang/String;", "p0", "()Lj94/f;", "selectedGrade", "a", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, Object> implements l00.e, n94.a, q94.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lk94/t$a;", "", "Lh94/a;", "featureConfig", "", "studentId", "Lk94/t;", "a", "(Lh94/a;Ljava/lang/String;)Lk94/t;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        t a(h94.a featureConfig, String studentId);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lk94/p;", "action", "Lk10/c0;", "Lk94/q;", "state", "Lk10/l;", "<anonymous>", "(Lk94/p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SelectedGrade, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f109305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f109306g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SelectedGrade selectedGrade, State state) {
            return State.b(state, null, null, selectedGrade.getGrade(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectedGrade selectedGrade = (SelectedGrade) this.f109305f;
            c0 c0Var = (c0) this.f109306g;
            uq.b.e();
            if (this.f109304e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: k94.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.b.O(selectedGrade, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectedGrade selectedGrade, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f109305f = selectedGrade;
            bVar.f109306g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, h94.a aVar2, String str) {
        State state = new State(aVar2, str, null, 4, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: k94.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.i9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: k94.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.j9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(z zVar) {
        b bVar = new b(null);
        zVar.v(q0.c(SelectedGrade.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // n94.a
    public void V4(PartialBehaviourGrade grade) {
        d9(new SelectedGrade(grade));
    }

    @Override // n94.a
    public h94.a b() {
        return getState().getValue().getFeatureConfig();
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // n94.a
    public String f() {
        return getState().getValue().getStudentId();
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // q94.a
    public PartialBehaviourGrade p0() {
        return getState().getValue().getSelectedGrade();
    }
}
