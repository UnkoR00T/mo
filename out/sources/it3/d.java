package it3;

import ge4.x;
import ie4.f;
import ie4.s;
import java.time.LocalDate;
import jt3.LessonDetailsDto;
import jt3.LessonsWeekDto;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lit3/d;", "", "", "lessonId", "Lge4/x;", "Ljt3/s;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "Ljt3/z;", "c", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @f("education/mobile/api/timetable/lessons/{lessonId}")
    Object b(@s("lessonId") String str, e<? super x<LessonDetailsDto>> eVar);

    @f("education/mobile/api/timetable/week-by-date/{date}")
    Object c(@s("date") LocalDate localDate, e<? super x<LessonsWeekDto>> eVar);
}
