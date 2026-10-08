package b20;

import android.annotation.SuppressLint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J)\u00101\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J!\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00104J!\u00105\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u001cH\u0016¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lb20/c;", "Lez/c;", "<init>", "()V", "Ljava/time/LocalDate;", "localeDate", "Ljava/util/Date;", "f", "(Ljava/time/LocalDate;)Ljava/util/Date;", "Ljava/time/LocalDateTime;", "h", "(Ljava/time/LocalDateTime;)Ljava/util/Date;", "Ljava/time/OffsetDateTime;", "offsetDateTime", "d", "(Ljava/time/OffsetDateTime;)Ljava/util/Date;", "Ljava/time/OffsetTime;", "offsetTime", "g", "(Ljava/time/OffsetTime;)Ljava/util/Date;", "Ljava/time/Instant;", "instant", "m", "(Ljava/time/Instant;)Ljava/util/Date;", "date", "l", "(Ljava/util/Date;)Ljava/time/LocalDate;", "localDate", "", "a", "(Ljava/time/LocalDate;)Ljava/lang/String;", "", "timestamp", "b", "(J)Ljava/time/LocalDateTime;", "Ljava/time/ZoneId;", "zone", "n", "(JLjava/time/ZoneId;)Ljava/time/LocalDate;", "Lfz/b$d;", "Lfz/b$f;", "j", "(Lfz/b$d;)Lfz/b$f;", "i", "(Ljava/lang/String;)Ljava/time/OffsetDateTime;", "Lfz/c;", "formatType", "Lfz/f;", "timeZoneId", "k", "(Ljava/lang/String;Lfz/c;Lfz/f;)Ljava/time/OffsetDateTime;", "o", "(Ljava/lang/String;Lfz/c;)Ljava/time/LocalDate;", "e", "(Ljava/lang/String;Lfz/c;)Ljava/util/Date;", "c", "(Ljava/lang/String;)Ljava/lang/Long;", "time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements ez.c {
    @Override // ez.c
    @SuppressLint({"SimpleDateFormat"})
    public String a(LocalDate localDate) {
        return new SimpleDateFormat("dd.MM.yyyy").format(f(localDate));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.time.LocalDateTime] */
    @Override // ez.c
    public LocalDateTime b(long timestamp) {
        return Instant.ofEpochMilli(timestamp).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    @Override // ez.c
    public Long c(String date) {
        Long lValueOf;
        Iterator it = d.f16136a.iterator();
        while (true) {
            lValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) it.next(), Locale.US);
            simpleDateFormat.setTimeZone(d.f16137b);
            simpleDateFormat.setLenient(false);
            try {
                Date date2 = simpleDateFormat.parse(date);
                if (date2 == null) {
                    break;
                }
                lValueOf = Long.valueOf(date2.getTime());
                break;
            } catch (ParseException unused) {
            }
        }
        return lValueOf;
    }

    @Override // ez.c
    public Date d(OffsetDateTime offsetDateTime) {
        return Date.from(offsetDateTime.atZoneSameInstant(ZoneId.systemDefault()).toInstant());
    }

    @Override // ez.c
    @SuppressLint({"SimpleDateFormat"})
    public Date e(String date, fz.c formatType) {
        try {
            return new SimpleDateFormat(formatType.getFormat()).parse(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // ez.c
    public Date f(LocalDate localeDate) {
        return Date.from(localeDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    @Override // ez.c
    public Date g(OffsetTime offsetTime) {
        return Date.from(offsetTime.toLocalTime().atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant());
    }

    @Override // ez.c
    public Date h(LocalDateTime localeDate) {
        return Date.from(localeDate.atZone(ZoneId.systemDefault()).toInstant());
    }

    @Override // ez.c
    public OffsetDateTime i(String date) {
        try {
            return OffsetDateTime.parse(date);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // ez.c
    public fz.b.OffsetDateTime j(fz.b.LocalDateTime date) {
        return new fz.b.OffsetDateTime(ZonedDateTime.of(date.getDate(), ZoneId.systemDefault()).toOffsetDateTime());
    }

    @Override // ez.c
    public OffsetDateTime k(String date, fz.c formatType, fz.f timeZoneId) {
        try {
            return OffsetDateTime.ofInstant(Instant.ofEpochMilli(new SimpleDateFormat(formatType.getFormat(), Locale.getDefault()).parse(date).getTime()), ZoneId.of(timeZoneId.getId()));
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // ez.c
    public LocalDate l(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @Override // ez.c
    public Date m(Instant instant) {
        return Date.from(instant);
    }

    @Override // ez.c
    public LocalDate n(long timestamp, ZoneId zone) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(timestamp);
        if (zone == null) {
            zone = ZoneId.systemDefault();
        }
        return instantOfEpochMilli.atZone(zone).toLocalDate();
    }

    @Override // ez.c
    public LocalDate o(String date, fz.c formatType) {
        try {
            return (LocalDate) DateTimeFormatter.ofPattern(formatType.getFormat()).parse(date, new m10.a());
        } catch (ParseException unused) {
            return null;
        }
    }
}
