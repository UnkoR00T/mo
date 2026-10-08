package ev2;

import ez.h;
import java.time.LocalDate;
import java.time.LocalDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lev2/b;", "Lev2/a;", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/h;Lez/e;Lez/a;)V", "Ljava/time/LocalDateTime;", "d", "()Ljava/time/LocalDateTime;", "Ljava/time/LocalDate;", "date", "", "c", "(Ljava/time/LocalDate;)Ljava/lang/String;", "a", "()Ljava/time/LocalDate;", "b", "Lez/h;", "Lez/e;", "Lez/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53806e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final LocalDate f53807f = LocalDate.of(2022, 10, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    public b(h hVar, ez.e eVar, ez.a aVar) {
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar;
    }

    @Override // ev2.a
    public LocalDate a() {
        return f53807f;
    }

    @Override // ev2.a
    public LocalDate b() {
        return d().toLocalDate();
    }

    @Override // ev2.a
    public String c(LocalDate date) {
        return this.dateFormatter.d(new fz.b.LocalDate(date), fz.c.DOTTED);
    }

    @Override // ev2.a
    public LocalDateTime d() {
        return this.timeProvider.d(this.currentTimeProvider.c().atStartOfDay(), fz.f.POLISH);
    }
}
