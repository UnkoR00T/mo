package ez;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u001aH&¢\u0006\u0004\b)\u0010*J+\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-H&¢\u0006\u0004\b/\u00100J!\u00101\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b1\u00102J!\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u001aH&¢\u0006\u0004\b5\u00106¨\u00067À\u0006\u0003"}, d2 = {"Lez/c;", "", "Ljava/time/LocalDate;", "localeDate", "Ljava/util/Date;", "f", "(Ljava/time/LocalDate;)Ljava/util/Date;", "Ljava/time/LocalDateTime;", "h", "(Ljava/time/LocalDateTime;)Ljava/util/Date;", "Ljava/time/OffsetDateTime;", "offsetDateTime", "d", "(Ljava/time/OffsetDateTime;)Ljava/util/Date;", "Ljava/time/OffsetTime;", "offsetTime", "g", "(Ljava/time/OffsetTime;)Ljava/util/Date;", "Ljava/time/Instant;", "instant", "m", "(Ljava/time/Instant;)Ljava/util/Date;", "date", "l", "(Ljava/util/Date;)Ljava/time/LocalDate;", "localDate", "", "a", "(Ljava/time/LocalDate;)Ljava/lang/String;", "", "timestamp", "b", "(J)Ljava/time/LocalDateTime;", "Ljava/time/ZoneId;", "zone", "n", "(JLjava/time/ZoneId;)Ljava/time/LocalDate;", "Lfz/b$d;", "Lfz/b$f;", "j", "(Lfz/b$d;)Lfz/b$f;", "i", "(Ljava/lang/String;)Ljava/time/OffsetDateTime;", "Lfz/c;", "formatType", "Lfz/f;", "timeZoneId", "k", "(Ljava/lang/String;Lfz/c;Lfz/f;)Ljava/time/OffsetDateTime;", "o", "(Ljava/lang/String;Lfz/c;)Ljava/time/LocalDate;", "e", "(Ljava/lang/String;Lfz/c;)Ljava/util/Date;", "c", "(Ljava/lang/String;)Ljava/lang/Long;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    String a(LocalDate localDate);

    LocalDateTime b(long timestamp);

    Long c(String date);

    Date d(OffsetDateTime offsetDateTime);

    Date e(String date, fz.c formatType);

    Date f(LocalDate localeDate);

    Date g(OffsetTime offsetTime);

    Date h(LocalDateTime localeDate);

    OffsetDateTime i(String date);

    fz.b.OffsetDateTime j(fz.b.LocalDateTime date);

    OffsetDateTime k(String date, fz.c formatType, fz.f timeZoneId);

    LocalDate l(Date date);

    Date m(Instant instant);

    LocalDate n(long timestamp, ZoneId zone);

    LocalDate o(String date, fz.c formatType);
}
