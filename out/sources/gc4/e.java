package gc4;

import java.time.LocalTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgc4/e;", "Lac4/e;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "Ljava/time/LocalTime;", "", "beforeText", "afterText", "", "c", "(Ljava/time/LocalTime;Ljava/lang/String;Ljava/lang/String;)Z", "Lgz/b$a$a;", "params", "Lac4/p;", "b", "(Lgz/b$a$a;)Lac4/p;", "a", "Lez/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements ac4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    public e(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    private final boolean c(LocalTime localTime, String str, String str2) {
        return localTime.isAfter(LocalTime.parse(str)) && localTime.isBefore(LocalTime.parse(str2));
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ac4.p a(gz.b.a.C1792a params) {
        LocalTime localTimeB = this.currentTimeProvider.b();
        if (c(localTimeB, "03:59:59", "12:00:00")) {
            return ac4.p.MORNING;
        }
        return c(localTimeB, "11:59:59", "18:00:00") ? ac4.p.AFTERNOON : ac4.p.EVENING;
    }
}
