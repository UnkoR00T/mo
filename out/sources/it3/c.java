package it3;

import ge4.x;
import ie4.f;
import ie4.s;
import jt3.GradeDetailsDto;
import jt3.SemesterDetailsDto;
import jt3.SemestersDto;
import jt3.SubjectGradesDto;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lit3/c;", "", "", "gradeId", "Lge4/x;", "Ljt3/n;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "semesterId", "Ljt3/e0;", "e", "Ljt3/h0;", "c", "(Ltq/e;)Ljava/lang/Object;", "subjectId", "Ljt3/j0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @f("education/mobile/api/grades/grade-details/{gradeId}")
    Object a(@s("gradeId") String str, e<? super x<GradeDetailsDto>> eVar);

    @f("education/mobile/api/grades/semesters")
    Object c(e<? super x<SemestersDto>> eVar);

    @f("education/mobile/api/grades/semesters/{semesterId}/subjects/{subjectId}/grades")
    Object d(@s("semesterId") String str, @s("subjectId") String str2, e<? super x<SubjectGradesDto>> eVar);

    @f("education/mobile/api/grades/previous-semesters/{semesterId}")
    Object e(@s("semesterId") String str, e<? super x<SemesterDetailsDto>> eVar);
}
