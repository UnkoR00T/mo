package gc4;

import fc4.ServerTimeData;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgc4/d;", "Lac4/d;", "Lez/a;", "currentTimeProvider", "Lfc4/b;", "serverTimeLocalRepository", "<init>", "(Lez/a;Lfc4/b;)V", "Lgz/b$a$a;", "params", "Ljava/time/OffsetDateTime;", "b", "(Lgz/b$a$a;)Ljava/time/OffsetDateTime;", "a", "Lez/a;", "Lfc4/b;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements ac4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fc4.b serverTimeLocalRepository;

    public d(ez.a aVar, fc4.b bVar) {
        this.currentTimeProvider = aVar;
        this.serverTimeLocalRepository = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public OffsetDateTime a(gz.b.a.C1792a params) {
        fz.b.OffsetDateTime serverCurrentTime;
        OffsetDateTime date;
        long jE = this.currentTimeProvider.e();
        ServerTimeData value = this.serverTimeLocalRepository.f().getValue();
        if (value == null) {
            return this.currentTimeProvider.f();
        }
        long elapsedRealtimeDuringFetch = value.getElapsedRealtimeDuringFetch();
        ServerTimeData value2 = this.serverTimeLocalRepository.f().getValue();
        return (value2 == null || (serverCurrentTime = value2.getServerCurrentTime()) == null || (date = serverCurrentTime.getDate()) == null) ? this.currentTimeProvider.f() : date.plusSeconds((jE - elapsedRealtimeDuringFetch) / ((long) 1000));
    }
}
