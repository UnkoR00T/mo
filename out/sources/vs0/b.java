package vs0;

import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import ie4.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import tq.e;
import xs0.RestrictionChecksPageDto;
import xs0.RestrictionStatusChangesPageDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lvs0/b;", "", "", "pageId", "Lge4/x;", "Lxs0/i;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "dateFrom", "dateTo", "b", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "Lxs0/n;", "d", "c", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @f("pesel-restriction/mobile/api/pesel/restrictions-history/checks/{pageId}")
    Object a(@s("pageId") String str, e<? super x<RestrictionChecksPageDto>> eVar);

    @o("pesel-restriction/mobile/api/pesel/restrictions-history/checks")
    Object b(@t("dateFrom") LocalDate localDate, @t("dateTo") LocalDate localDate2, e<? super x<RestrictionChecksPageDto>> eVar);

    @o("pesel-restriction/mobile/api/pesel/restrictions-history/status-changes")
    Object c(@t("dateFrom") LocalDate localDate, @t("dateTo") LocalDate localDate2, e<? super x<RestrictionStatusChangesPageDto>> eVar);

    @f("pesel-restriction/mobile/api/pesel/restrictions-history/status-changes/{pageId}")
    Object d(@s("pageId") String str, e<? super x<RestrictionStatusChangesPageDto>> eVar);
}
