package ez;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lez/h;", "", "Ljava/time/OffsetDateTime;", "date", "Ljava/time/ZoneId;", "zoneId", "Lfz/a;", "c", "(Ljava/time/OffsetDateTime;Ljava/time/ZoneId;)Lfz/a;", "Ljava/time/LocalDateTime;", "dateTime", "Lfz/f;", "targetTimeZoneId", "d", "(Ljava/time/LocalDateTime;Lfz/f;)Ljava/time/LocalDateTime;", "b", "(Ljava/time/OffsetDateTime;Lfz/f;)Ljava/time/OffsetDateTime;", "", "a", "(Lfz/f;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    boolean a(fz.f targetTimeZoneId);

    OffsetDateTime b(OffsetDateTime dateTime, fz.f targetTimeZoneId);

    fz.a c(OffsetDateTime date, ZoneId zoneId);

    LocalDateTime d(LocalDateTime dateTime, fz.f targetTimeZoneId);
}
