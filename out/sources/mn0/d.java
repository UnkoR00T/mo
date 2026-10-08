package mn0;

import ge4.x;
import ie4.f;
import ie4.s;
import on0.GradeDetailsDto;
import on0.SemesterDetailsDto;
import on0.SemestersDto;
import on0.SubjectGradesDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lmn0/d;", "", "", "studentId", "gradeId", "Lge4/x;", "Lon0/p;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Lon0/j0;", "f", "Lon0/m0;", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "subjectId", "Lon0/o0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @f("education/mobile/api/grades/by-student/{studentId}/semesters/{semesterId}/subjects/{subjectId}/grades")
    Object c(@s("studentId") String str, @s("semesterId") String str2, @s("subjectId") String str3, tq.e<? super x<SubjectGradesDto>> eVar);

    @f("education/mobile/api/grades/by-student/{studentId}/grade-details/{gradeId}")
    Object e(@s("studentId") String str, @s("gradeId") String str2, tq.e<? super x<GradeDetailsDto>> eVar);

    @f("education/mobile/api/grades/by-student/{studentId}/previous-semesters/{semesterId}")
    Object f(@s("studentId") String str, @s("semesterId") String str2, tq.e<? super x<SemesterDetailsDto>> eVar);

    @f("education/mobile/api/grades/by-student/{studentId}/semesters")
    Object g(@s("studentId") String str, tq.e<? super x<SemestersDto>> eVar);
}
