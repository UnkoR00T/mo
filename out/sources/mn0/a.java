package mn0;

import ge4.x;
import ie4.f;
import ie4.s;
import ie4.t;
import on0.AttendanceStatusDetailsDto;
import on0.AttendanceSummaryDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lmn0/a;", "", "", "studentId", "Lon0/b;", "attendanceStatus", "semesterId", "Lge4/x;", "Lon0/c;", "e", "(Ljava/lang/String;Lon0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lon0/e;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("education/mobile/api/attendance/by-student/{studentId}/summary")
    Object d(@s("studentId") String str, tq.e<? super x<AttendanceSummaryDto>> eVar);

    @f("education/mobile/api/attendance/by-student/{studentId}/statuses/{attendanceStatus}")
    Object e(@s("studentId") String str, @s("attendanceStatus") on0.b bVar, @t("semesterId") String str2, tq.e<? super x<AttendanceStatusDetailsDto>> eVar);
}
