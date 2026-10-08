package b20;

import android.os.SystemClock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lb20/a;", "Lez/a;", "<init>", "()V", "", "a", "()J", "e", "Ljava/time/OffsetDateTime;", "f", "()Ljava/time/OffsetDateTime;", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Ljava/time/OffsetTime;", "g", "()Ljava/time/OffsetTime;", "Ljava/util/Date;", "h", "()Ljava/util/Date;", "Ljava/time/LocalTime;", "b", "()Ljava/time/LocalTime;", "Ljava/time/LocalDateTime;", "i", "()Ljava/time/LocalDateTime;", "Ljava/time/Instant;", "d", "()Ljava/time/Instant;", "time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ez.a {
    @Override // ez.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // ez.a
    public LocalTime b() {
        return LocalTime.now();
    }

    @Override // ez.a
    public LocalDate c() {
        return LocalDate.now();
    }

    @Override // ez.a
    public Instant d() {
        return Instant.now();
    }

    @Override // ez.a
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ez.a
    public OffsetDateTime f() {
        return OffsetDateTime.now(new GregorianCalendar().getTimeZone().toZoneId());
    }

    @Override // ez.a
    public OffsetTime g() {
        return OffsetTime.now();
    }

    @Override // ez.a
    public Date h() {
        return Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    @Override // ez.a
    public LocalDateTime i() {
        return LocalDateTime.now();
    }
}
