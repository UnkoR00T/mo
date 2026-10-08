package ez;

import java.time.DayOfWeek;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lez/b;", "", "Ljava/time/DayOfWeek;", "dayOfWeek", "Lfz/b$c;", "fromDate", "f", "(Ljava/time/DayOfWeek;Lfz/b$c;)Lfz/b$c;", "firstDayInWeekDate", "Lfz/b$i;", "c", "(Lfz/b$c;)Lfz/b$i;", "startDate", "endDate", "", "a", "(Lfz/b$c;Lfz/b$c;)I", "Ljava/util/Date;", "date", "", "e", "(Ljava/util/Date;)J", "timestamp", "Lgu/b;", "timeToPass", "", "d", "(JJ)Z", "Lfz/b$f;", "b", "(Lfz/b$f;)J", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    int a(fz.b.LocalDate startDate, fz.b.LocalDate endDate);

    long b(fz.b.OffsetDateTime date);

    fz.b.YearMonth c(fz.b.LocalDate firstDayInWeekDate);

    boolean d(long timestamp, long timeToPass);

    long e(Date date);

    fz.b.LocalDate f(DayOfWeek dayOfWeek, fz.b.LocalDate fromDate);
}
