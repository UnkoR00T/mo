package ws2;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lws2/g;", "Lgz/b;", "Lgz/b$a$a;", "Ljava/time/OffsetDateTime;", "Lws2/h;", "getUnrestrictStartDate", "<init>", "(Lws2/h;)V", "", "currentMinutes", "", "d", "(I)J", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lws2/h;", "b", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<gz.b.a.C1792a, OffsetDateTime> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214906c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h getUnrestrictStartDate;

    public g(h hVar) {
        this.getUnrestrictStartDate = hVar;
    }

    private final long d(int currentMinutes) {
        return (10 - (currentMinutes % 10)) % 10;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super OffsetDateTime> eVar) {
        OffsetDateTime offsetDateTimeTruncatedTo = this.getUnrestrictStartDate.b(gz.b.a.C1792a.f78542a).getNextAvailableDateTime().truncatedTo(ChronoUnit.MINUTES);
        return offsetDateTimeTruncatedTo.plusMinutes(d(offsetDateTimeTruncatedTo.getMinute()));
    }
}
