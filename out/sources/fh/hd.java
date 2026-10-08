package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f63075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f63076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f63077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f63078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f63079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f63080f;

    public final hd a(Long l15) {
        this.f63077c = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final hd b(Long l15) {
        this.f63078d = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final hd c(Long l15) {
        this.f63075a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final hd d(Long l15) {
        this.f63079e = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final hd e(Long l15) {
        this.f63076b = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final hd f(Long l15) {
        this.f63080f = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final jd g() {
        return new jd(this, null);
    }
}
