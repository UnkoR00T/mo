package pa4;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001#B3\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u0006$"}, d2 = {"Lpa4/u;", "Ll00/g;", "Lpa4/r;", "", "Lyy/a;", "stateMachineFactory", "Lma4/a;", "featureConfig", "", "studentId", "lessonId", "<init>", "(Lyy/a;Lma4/a;Ljava/lang/String;Ljava/lang/String;)V", "Loq/i0;", "c7", "(Ljava/lang/String;)V", "b", "Lpa4/r;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "()Lma4/a;", "f", "()Ljava/lang/String;", "J2", "a", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<State, Object> implements l00.e, va4.a, sa4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lpa4/u$a;", "", "Lma4/a;", "featureConfig", "", "studentId", "lessonId", "Lpa4/u;", "a", "(Lma4/a;Ljava/lang/String;Ljava/lang/String;)Lpa4/u;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        u a(ma4.a featureConfig, String studentId, String lessonId);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpa4/q;", "action", "Lk10/c0;", "Lpa4/r;", "state", "Lk10/l;", "<anonymous>", "(Lpa4/q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SelectLesson, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f154026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f154027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f154028g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SelectLesson selectLesson, State state) {
            return State.b(state, null, null, selectLesson.getLessonId(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectLesson selectLesson = (SelectLesson) this.f154027f;
            c0 c0Var = (c0) this.f154028g;
            uq.b.e();
            if (this.f154026e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: pa4.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.b.O(selectLesson, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectLesson selectLesson, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f154027f = selectLesson;
            bVar.f154028g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, ma4.a aVar2, String str, String str2) {
        State state = new State(aVar2, str, str2);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: pa4.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.i9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: pa4.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.j9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(z zVar) {
        b bVar = new b(null);
        zVar.v(q0.c(SelectLesson.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // sa4.a
    public String J2() {
        return getState().getValue().getSelectedLessonId();
    }

    @Override // va4.a, sa4.a
    public ma4.a b() {
        return getState().getValue().getFeatureConfig();
    }

    @Override // va4.a
    public void c7(String lessonId) {
        d9(new SelectLesson(lessonId));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // va4.a, sa4.a
    public String f() {
        return getState().getValue().getStudentId();
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }
}
