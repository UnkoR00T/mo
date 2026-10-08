package sn0;

import dx.b;
import dx.i;
import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;
import rn0.BEAttendanceStatusDetails;
import rn0.BEAttendanceSummary;
import rn0.BEBehaviourSemesters;
import rn0.BEChildStudent;
import rn0.BEGradeDetails;
import rn0.BELessonDetails;
import rn0.BESemesterDetails;
import rn0.BESemesters;
import rn0.BESubjectGrades;
import rn0.BETimetableWeek;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH¦@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH¦@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH¦@¢\u0006\u0004\b\u0017\u0010\u0010J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH¦@¢\u0006\u0004\b\u001f\u0010\u0010J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b!\u0010\fJ4\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\bH¦@¢\u0006\u0004\b%\u0010&J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b(\u0010\f¨\u0006)À\u0006\u0003"}, d2 = {"Lsn0/a;", "", "Ldx/i;", "Ldx/b;", "", "Lrn0/n;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "studentId", "Lrn0/f0;", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Lrn0/c0;", "f", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lrn0/h0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "gradeId", "Lrn0/o;", "e", "Ljava/time/LocalDate;", "date", "Lrn0/p0;", "i", "(Ljava/lang/String;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "lessonId", "Lrn0/u;", "h", "Lrn0/e;", "d", "Lrn0/b;", "attendanceStatus", "Lrn0/c;", "j", "(Ljava/lang/String;Lrn0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lrn0/m;", "b", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends b, ? extends List<BEChildStudent>>> eVar);

    Object b(String str, e<? super i<? extends b, BEBehaviourSemesters>> eVar);

    Object c(String str, String str2, String str3, e<? super i<? extends b, BESubjectGrades>> eVar);

    Object d(String str, e<? super i<? extends b, BEAttendanceSummary>> eVar);

    Object e(String str, String str2, e<? super i<? extends b, BEGradeDetails>> eVar);

    Object f(String str, String str2, e<? super i<? extends b, BESemesterDetails>> eVar);

    Object g(String str, e<? super i<? extends b, BESemesters>> eVar);

    Object h(String str, String str2, e<? super i<? extends b, BELessonDetails>> eVar);

    Object i(String str, LocalDate localDate, e<? super i<? extends b, BETimetableWeek>> eVar);

    Object j(String str, rn0.b bVar, String str2, e<? super i<? extends b, BEAttendanceStatusDetails>> eVar);
}
