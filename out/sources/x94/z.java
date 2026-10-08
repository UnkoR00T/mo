package x94;

import fr.q0;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u00012B3\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010&R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0014\u0010.\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0016\u00101\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lx94/z;", "Ll00/g;", "Lx94/w;", "", "Lyy/a;", "stateMachineFactory", "Lu94/a;", "featureConfig", "", "studentId", "initialGradeId", "<init>", "(Lyy/a;Lu94/a;Ljava/lang/String;Ljava/lang/String;)V", "semesterId", "subjectId", "subjectTitle", "Loq/i0;", "W4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lx94/v;", "grade", "p5", "(Lx94/v;)V", "b", "Lx94/w;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "()Lu94/a;", "f", "()Ljava/lang/String;", "z", "selectedSemesterId", "G6", "selectedSubjectId", "h8", "selectedSubjectTitle", "p0", "()Lx94/v;", "selectedGrade", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, Object> implements l00.e, ia4.a, fa4.a, ca4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lx94/z$a;", "", "Lu94/a;", "featureConfig", "", "studentId", "initialGradeId", "Lx94/z;", "a", "(Lu94/a;Ljava/lang/String;Ljava/lang/String;)Lx94/z;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        z a(u94.a featureConfig, String studentId, String initialGradeId);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx94/u;", "action", "Lk10/c0;", "Lx94/w;", "state", "Lk10/l;", "<anonymous>", "(Lx94/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SelectSubject, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217706g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SelectSubject selectSubject, State state) {
            return State.b(state, null, null, selectSubject.getSemesterId(), selectSubject.getSubjectId(), selectSubject.getSubjectTitle(), null, 35, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectSubject selectSubject = (SelectSubject) this.f217705f;
            k10.c0 c0Var = (k10.c0) this.f217706g;
            uq.b.e();
            if (this.f217704e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: x94.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.b.O(selectSubject, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectSubject selectSubject, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f217705f = selectSubject;
            bVar.f217706g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx94/t;", "action", "Lk10/c0;", "Lx94/w;", "state", "Lk10/l;", "<anonymous>", "(Lx94/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SelectGrade, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217709g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SelectGrade selectGrade, State state) {
            return State.b(state, null, null, null, null, null, selectGrade.getGrade(), 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectGrade selectGrade = (SelectGrade) this.f217708f;
            k10.c0 c0Var = (k10.c0) this.f217709g;
            uq.b.e();
            if (this.f217707e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: x94.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.c.O(selectGrade, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectGrade selectGrade, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f217708f = selectGrade;
            cVar.f217709g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, u94.a aVar2, String str, String str2) {
        State state = new State(aVar2, str, null, null, null, str2 != null ? new v.GradeById(str2) : null, 28, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: x94.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.i9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: x94.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.j9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(SelectSubject.class), oVar, bVar);
        zVar.v(q0.c(SelectGrade.class), oVar, new c(null));
        return i0.f148189a;
    }

    @Override // fa4.a
    public String G6() {
        return getState().getValue().getSelectedSubjectId();
    }

    @Override // ia4.a
    public void W4(String semesterId, String subjectId, String subjectTitle) {
        d9(new SelectSubject(semesterId, subjectId, subjectTitle));
    }

    @Override // ia4.a, fa4.a, ca4.a
    public u94.a b() {
        return getState().getValue().getFeatureConfig();
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // ia4.a, fa4.a, ca4.a
    public String f() {
        return getState().getValue().getStudentId();
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // fa4.a
    public String h8() {
        String selectedSubjectTitle = getState().getValue().getSelectedSubjectTitle();
        return selectedSubjectTitle == null ? "" : selectedSubjectTitle;
    }

    @Override // ca4.a
    public v p0() {
        return getState().getValue().getSelectedGrade();
    }

    @Override // fa4.a
    public void p5(v grade) {
        d9(new SelectGrade(grade));
    }

    @Override // fa4.a
    public String z() {
        return getState().getValue().getSelectedSemesterId();
    }
}
