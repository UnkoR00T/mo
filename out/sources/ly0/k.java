package ly0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lly0/k;", "Lgz/b;", "Lgz/b$a$a;", "", "Lky0/b;", "airQualityWidgetRepository", "Lez/a;", "currentTimeProvider", "<init>", "(Lky0/b;Lez/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lky0/b;", "b", "Lez/a;", "c", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f121442d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f121443e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ky0.b airQualityWidgetRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f121443e = gu.b.A(gu.d.q(5, gu.e.MINUTES));
    }

    public k(ky0.b bVar, ez.a aVar) {
        this.airQualityWidgetRepository = bVar;
        this.currentTimeProvider = aVar;
    }

    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) {
        Long lB = this.airQualityWidgetRepository.b();
        if (lB != null) {
            return vq.b.a(this.currentTimeProvider.e() - lB.longValue() >= f121443e);
        }
        return vq.b.a(true);
    }
}
