package t84;

import fr.q0;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;
import s84.AttendanceStatusSummary;
import s84.SemesterAttendanceSummary;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001<B?\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0016\u00104\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lt84/z;", "Ll00/g;", "Lt84/w;", "", "Lyy/a;", "stateMachineFactory", "Lq84/a;", "featureConfig", "", "studentId", "initialSemesterId", "Ls84/h;", "initialAttendanceType", "<init>", "(Lyy/a;Lq84/a;Ljava/lang/String;Ljava/lang/String;Ls84/h;)V", "semesterId", "Loq/i0;", "P7", "(Ljava/lang/String;)V", "attendanceType", "t8", "(Ls84/h;)V", "Ls84/f$a;", "summary", "Q7", "(Ls84/f$a;)V", "b", "Lt84/w;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "()Lq84/a;", "f", "()Ljava/lang/String;", "c6", "()Ls84/f$a;", "attendanceSummary", "z", "selectedSemesterId", "Ls84/k;", "E3", "()Ls84/k;", "selectedSemester", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37088o, "()Ls84/h;", "selectedAttendanceType", "", "K3", "()Ljava/lang/Integer;", "statusCount", "a", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, Object> implements l00.e, w84.a, d94.a, a94.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lt84/z$a;", "", "Lq84/a;", "featureConfig", "", "studentId", "initialSemesterId", "Ls84/h;", "initialAttendanceType", "Lt84/z;", "a", "(Lq84/a;Ljava/lang/String;Ljava/lang/String;Ls84/h;)Lt84/z;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        z a(q84.a featureConfig, String studentId, String initialSemesterId, s84.h initialAttendanceType);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lt84/u;", "action", "Lk10/c0;", "Lt84/w;", "state", "Lk10/l;", "<anonymous>", "(Lt84/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SetAttendanceSummary, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f188935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f188936g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:19:0x004e A[PHI: r0
          0x004e: PHI (r0v1 java.lang.String) = (r0v0 java.lang.String), (r0v8 java.lang.String), (r0v9 java.lang.String) binds: [B:3:0x0008, B:15:0x0038, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
        public static final State O(SetAttendanceSummary setAttendanceSummary, State state) {
            String str;
            Object next;
            s84.f.AttendanceSemesters summary = setAttendanceSummary.getSummary();
            String selectedSemesterId = state.getSelectedSemesterId();
            if (selectedSemesterId == null) {
                Iterator<T> it = setAttendanceSummary.getSummary().a().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((SemesterAttendanceSummary) next).getCurrent());
                SemesterAttendanceSummary semesterAttendanceSummary = (SemesterAttendanceSummary) next;
                selectedSemesterId = semesterAttendanceSummary != null ? semesterAttendanceSummary.getSemesterId() : null;
                if (selectedSemesterId != null) {
                    str = selectedSemesterId;
                } else {
                    SemesterAttendanceSummary semesterAttendanceSummary2 = (SemesterAttendanceSummary) pq.v.n0(setAttendanceSummary.getSummary().a());
                    if (semesterAttendanceSummary2 != null) {
                        selectedSemesterId = semesterAttendanceSummary2.getSemesterId();
                        str = selectedSemesterId;
                    } else {
                        str = null;
                    }
                }
            } else {
                str = selectedSemesterId;
            }
            return State.b(state, null, null, summary, str, null, 19, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetAttendanceSummary setAttendanceSummary = (SetAttendanceSummary) this.f188935f;
            k10.c0 c0Var = (k10.c0) this.f188936g;
            uq.b.e();
            if (this.f188934e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: t84.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.b.O(setAttendanceSummary, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetAttendanceSummary setAttendanceSummary, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f188935f = setAttendanceSummary;
            bVar.f188936g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lt84/v;", "action", "Lk10/c0;", "Lt84/w;", "state", "Lk10/l;", "<anonymous>", "(Lt84/v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SetSemesterSelected, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f188938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f188939g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetSemesterSelected setSemesterSelected, State state) {
            return State.b(state, null, null, null, setSemesterSelected.getSelectedSemesterId(), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetSemesterSelected setSemesterSelected = (SetSemesterSelected) this.f188938f;
            k10.c0 c0Var = (k10.c0) this.f188939g;
            uq.b.e();
            if (this.f188937e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: t84.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.c.O(setSemesterSelected, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetSemesterSelected setSemesterSelected, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f188938f = setSemesterSelected;
            cVar.f188939g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lt84/t;", "action", "Lk10/c0;", "Lt84/w;", "state", "Lk10/l;", "<anonymous>", "(Lt84/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SetAbsenceType, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f188941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f188942g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetAbsenceType setAbsenceType, State state) {
            return State.b(state, null, null, null, null, setAbsenceType.getAttendanceType(), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetAbsenceType setAbsenceType = (SetAbsenceType) this.f188941f;
            k10.c0 c0Var = (k10.c0) this.f188942g;
            uq.b.e();
            if (this.f188940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: t84.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.d.O(setAbsenceType, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetAbsenceType setAbsenceType, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f188941f = setAbsenceType;
            dVar.f188942g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, q84.a aVar2, String str, String str2, s84.h hVar) {
        State state = new State(aVar2, str, null, str2, hVar, 4, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: t84.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.i9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: t84.y
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
        zVar.v(q0.c(SetAttendanceSummary.class), oVar, bVar);
        zVar.v(q0.c(SetSemesterSelected.class), oVar, new c(null));
        zVar.v(q0.c(SetAbsenceType.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // a94.a
    public SemesterAttendanceSummary E3() {
        List<SemesterAttendanceSummary> listA;
        s84.f.AttendanceSemesters attendanceSummary = getState().getValue().getAttendanceSummary();
        Object obj = null;
        if (attendanceSummary == null || (listA = attendanceSummary.a()) == null) {
            return null;
        }
        for (Object obj2 : listA) {
            if (fr.t.c(((SemesterAttendanceSummary) obj2).getSemesterId(), getState().getValue().getSelectedSemesterId())) {
                obj = obj2;
                break;
            }
        }
        return (SemesterAttendanceSummary) obj;
    }

    @Override // d94.a
    public s84.h H1() {
        return getState().getValue().getSelectedAttendanceType();
    }

    @Override // d94.a
    public Integer K3() {
        s84.f.AttendanceSemesters attendanceSummary;
        List<SemesterAttendanceSummary> listA;
        Object next;
        s84.h selectedAttendanceType;
        s84.c cVarB;
        Object next2;
        String selectedSemesterId = getState().getValue().getSelectedSemesterId();
        if (selectedSemesterId != null && (attendanceSummary = getState().getValue().getAttendanceSummary()) != null && (listA = attendanceSummary.a()) != null) {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((SemesterAttendanceSummary) next).getSemesterId(), selectedSemesterId));
            SemesterAttendanceSummary semesterAttendanceSummary = (SemesterAttendanceSummary) next;
            if (semesterAttendanceSummary != null && (selectedAttendanceType = getState().getValue().getSelectedAttendanceType()) != null && (cVarB = s84.g.b(selectedAttendanceType)) != null) {
                Iterator<T> it4 = semesterAttendanceSummary.d().iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((AttendanceStatusSummary) next2).getStatus() != cVarB);
                AttendanceStatusSummary attendanceStatusSummary = (AttendanceStatusSummary) next2;
                if (attendanceStatusSummary != null) {
                    return Integer.valueOf(attendanceStatusSummary.getCount());
                }
            }
        }
        return null;
    }

    @Override // w84.a
    public void P7(String semesterId) {
        d9(new SetSemesterSelected(semesterId));
    }

    @Override // w84.a
    public void Q7(s84.f.AttendanceSemesters summary) {
        d9(new SetAttendanceSummary(summary));
    }

    @Override // w84.a, d94.a
    public q84.a b() {
        return getState().getValue().getFeatureConfig();
    }

    @Override // a94.a
    public s84.f.AttendanceSemesters c6() {
        return getState().getValue().getAttendanceSummary();
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // w84.a, d94.a
    public String f() {
        return getState().getValue().getStudentId();
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // w84.a
    public void t8(s84.h attendanceType) {
        d9(new SetAbsenceType(attendanceType));
    }

    @Override // w84.a, d94.a
    public String z() {
        return getState().getValue().getSelectedSemesterId();
    }
}
