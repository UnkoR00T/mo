package v80;

import dx.i;
import java.time.LocalDate;
import p071kotlin.Metadata;
import tq.e;
import u80.BEBehaviourSemesters;
import u80.BEGradeDetails;
import u80.BELessonDetails;
import u80.BESemesterDetails;
import u80.BESemesters;
import u80.BESubjectGrades;
import u80.BETimetableWeek;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0010\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0012\u0010\u000bJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00022\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00022\u0006\u0010\u0018\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u001a\u0010\u000bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0002H¦@¢\u0006\u0004\b\u001c\u0010\u0006¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lv80/b;", "", "Ldx/i;", "Ldx/b;", "Lu80/b0;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "semesterId", "Lu80/y;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lu80/d0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "gradeId", "Lu80/n;", "a", "Ljava/time/LocalDate;", "date", "Lu80/l0;", "g", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "lessonId", "Lu80/r;", "b", "Lu80/m;", "f", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(String str, e<? super i<? extends dx.b, BEGradeDetails>> eVar);

    Object b(String str, e<? super i<? extends dx.b, BELessonDetails>> eVar);

    Object c(e<? super i<? extends dx.b, BESemesters>> eVar);

    Object d(String str, String str2, e<? super i<? extends dx.b, BESubjectGrades>> eVar);

    Object e(String str, e<? super i<? extends dx.b, BESemesterDetails>> eVar);

    Object f(e<? super i<? extends dx.b, BEBehaviourSemesters>> eVar);

    Object g(LocalDate localDate, e<? super i<? extends dx.b, BETimetableWeek>> eVar);
}
