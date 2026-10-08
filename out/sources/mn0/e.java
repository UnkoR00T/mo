package mn0;

import ge4.x;
import ie4.f;
import ie4.s;
import java.time.LocalDate;
import on0.LessonDetailsDto;
import on0.LessonsWeekDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lmn0/e;", "", "", "studentId", "lessonId", "Lge4/x;", "Lon0/w;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "Lon0/d0;", "a", "(Ljava/time/LocalDate;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @f("education/mobile/api/timetable/by-student/{studentId}/week-by-date/{date}")
    Object a(@s("date") LocalDate localDate, @s("studentId") String str, tq.e<? super x<LessonsWeekDto>> eVar);

    @f("education/mobile/api/timetable/by-student/{studentId}/lessons/{lessonId}")
    Object b(@s("studentId") String str, @s("lessonId") String str2, tq.e<? super x<LessonDetailsDto>> eVar);
}
