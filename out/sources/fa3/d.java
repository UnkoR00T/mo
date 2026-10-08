package fa3;

import fr.t;
import fz.e;
import java.time.chrono.ChronoLocalDate;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ1\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfa3/d;", "Lfa3/c;", "<init>", "()V", "Lfz/e$a;", "previous", "", "c", "(Lfz/e$a;Lfz/e$a;)Z", "", "other", "b", "(Ljava/util/List;Lfz/e$a;)Z", "d", "current", "allRangesWithoutCurrent", "Lfa3/c$a;", "a", "(Lfz/e$a;Lfz/e$a;Ljava/util/List;)Lfa3/c$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {
    private final boolean b(List<e.LocalDate> list, e.LocalDate localDate) {
        List<e.LocalDate> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (e.LocalDate localDate2 : list2) {
            if (localDate2 != null && d(localDate2, localDate)) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(e.LocalDate localDate, e.LocalDate localDate2) {
        if (localDate.getEnd().compareTo((ChronoLocalDate) localDate2.getStart()) >= 0) {
            return t.c(localDate.getEnd(), localDate2.getStart()) && localDate.getStart().compareTo((ChronoLocalDate) localDate2.getEnd()) < 0;
        }
        return true;
    }

    private final boolean d(e.LocalDate localDate, e.LocalDate localDate2) {
        return localDate.getStart().compareTo((ChronoLocalDate) localDate2.getEnd()) < 0 && localDate.getEnd().compareTo((ChronoLocalDate) localDate2.getStart()) > 0;
    }

    @Override // fa3.c
    public c.a a(e.LocalDate previous, e.LocalDate current, List<e.LocalDate> allRangesWithoutCurrent) {
        if (b(allRangesWithoutCurrent, current)) {
            return c.a.b.f60531a;
        }
        return (previous == null || !c(current, previous)) ? c.a.C1367a.f60530a : c.a.C1368c.f60532a;
    }
}
