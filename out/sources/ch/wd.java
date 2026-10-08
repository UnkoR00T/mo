package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f26453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f26454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f26455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f26456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f26457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f26458f;

    public final wd a(Long l15) {
        this.f26455c = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final wd b(Long l15) {
        this.f26456d = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final wd c(Long l15) {
        this.f26453a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final wd d(Long l15) {
        this.f26457e = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final wd e(Long l15) {
        this.f26454b = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final wd f(Long l15) {
        this.f26458f = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final yd g() {
        return new yd(this, null);
    }
}
