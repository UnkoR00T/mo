package ez;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0003*\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0014*\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljava/time/LocalDate;", "Ljava/time/ZoneId;", "zoneId", "", "b", "(Ljava/time/LocalDate;Ljava/time/ZoneId;)Z", "d", "l", "f", "Ljava/time/OffsetDateTime;", "", "k", "(Ljava/time/OffsetDateTime;)J", "otherDate", "a", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Z", "Lfz/b$f;", "Lfz/b$d;", "j", "(Lfz/b$f;)Lfz/b$d;", "Lfz/b$c;", "i", "(Lfz/b$f;)Lfz/b$c;", "h", "(Lfz/b$d;)Lfz/b$c;", "domain"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final boolean a(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        return offsetDateTime2 != null && offsetDateTime.getDayOfYear() == offsetDateTime2.getDayOfYear() && offsetDateTime.getYear() == offsetDateTime2.getYear();
    }

    public static final boolean b(LocalDate localDate, ZoneId zoneId) {
        return localDate.isEqual(LocalDate.now(zoneId));
    }

    public static /* synthetic */ boolean c(LocalDate localDate, ZoneId zoneId, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return b(localDate, zoneId);
    }

    public static final boolean d(LocalDate localDate, ZoneId zoneId) {
        return localDate.isEqual(LocalDate.now(zoneId).plusDays(1L));
    }

    public static /* synthetic */ boolean e(LocalDate localDate, ZoneId zoneId, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return d(localDate, zoneId);
    }

    public static final boolean f(LocalDate localDate, ZoneId zoneId) {
        return localDate.isBefore(LocalDate.now(zoneId).plusDays(7L)) && localDate.isAfter(LocalDate.now(zoneId).minusDays(7L));
    }

    public static /* synthetic */ boolean g(LocalDate localDate, ZoneId zoneId, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return f(localDate, zoneId);
    }

    public static final fz.b.LocalDate h(fz.b.LocalDateTime localDateTime) {
        return new fz.b.LocalDate(localDateTime.getDate().toLocalDate());
    }

    public static final fz.b.LocalDate i(fz.b.OffsetDateTime offsetDateTime) {
        return new fz.b.LocalDate(offsetDateTime.getDate().toLocalDate());
    }

    public static final fz.b.LocalDateTime j(fz.b.OffsetDateTime offsetDateTime) {
        return new fz.b.LocalDateTime(offsetDateTime.getDate().toLocalDateTime());
    }

    public static final long k(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toInstant().toEpochMilli();
    }

    public static final boolean l(LocalDate localDate, ZoneId zoneId) {
        return localDate.isEqual(LocalDate.now(zoneId).minusDays(1L));
    }

    public static /* synthetic */ boolean m(LocalDate localDate, ZoneId zoneId, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return l(localDate, zoneId);
    }
}
