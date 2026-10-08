package b20;

import ez.h;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb20/g;", "Lez/h;", "<init>", "()V", "Ljava/time/OffsetDateTime;", "date", "Ljava/time/ZoneId;", "zoneId", "Lfz/a;", "c", "(Ljava/time/OffsetDateTime;Ljava/time/ZoneId;)Lfz/a;", "Ljava/time/LocalDateTime;", "dateTime", "Lfz/f;", "targetTimeZoneId", "d", "(Ljava/time/LocalDateTime;Lfz/f;)Ljava/time/LocalDateTime;", "b", "(Ljava/time/OffsetDateTime;Lfz/f;)Ljava/time/OffsetDateTime;", "", "a", "(Lfz/f;)Z", "time_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements h {
    @Override // ez.h
    public boolean a(fz.f targetTimeZoneId) {
        return ZoneId.systemDefault().getId().equals(targetTimeZoneId.getId());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.time.ZonedDateTime] */
    @Override // ez.h
    public OffsetDateTime b(OffsetDateTime dateTime, fz.f targetTimeZoneId) {
        return ZonedDateTime.ofInstant(dateTime.toInstant(), ZoneOffset.UTC).withZoneSameInstant(ZoneId.of(targetTimeZoneId.getId())).toLocalDateTime().atZone(ZoneId.systemDefault()).toOffsetDateTime();
    }

    @Override // ez.h
    public fz.a c(OffsetDateTime date, ZoneId zoneId) {
        LocalDate localDate = date.toLocalDate();
        if (ez.d.b(localDate, zoneId)) {
            return fz.a.TODAY;
        }
        if (ez.d.l(localDate, zoneId)) {
            return fz.a.YESTERDAY;
        }
        return ez.d.f(localDate, zoneId) ? fz.a.THIS_WEEK : fz.a.AFTER_THIS_WEEK;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.LocalDateTime] */
    @Override // ez.h
    public LocalDateTime d(LocalDateTime dateTime, fz.f targetTimeZoneId) {
        return ZonedDateTime.of(dateTime, ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of(targetTimeZoneId.getId())).toLocalDateTime();
    }
}
