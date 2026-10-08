package it3;

import ge4.x;
import ie4.f;
import ie4.s;
import ie4.t;
import jt3.AttendanceStatusDetailsDto;
import jt3.AttendanceSummaryDto;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lit3/a;", "", "Ljt3/b;", "attendanceStatus", "", "semesterId", "Lge4/x;", "Ljt3/c;", "b", "(Ljt3/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljt3/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("education/mobile/api/attendance/summary")
    Object a(e<? super x<AttendanceSummaryDto>> eVar);

    @f("education/mobile/api/attendance/statuses/{attendanceStatus}")
    Object b(@s("attendanceStatus") jt3.b bVar, @t("semesterId") String str, e<? super x<AttendanceStatusDetailsDto>> eVar);
}
