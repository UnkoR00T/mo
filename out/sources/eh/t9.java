package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f51089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ca f51090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f51091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f51092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f51093e;

    public final t9 a(Boolean bool) {
        this.f51092d = bool;
        return this;
    }

    public final t9 b(Boolean bool) {
        this.f51093e = bool;
        return this;
    }

    public final t9 c(Long l15) {
        this.f51089a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final t9 d(ca caVar) {
        this.f51090b = caVar;
        return this;
    }

    public final t9 e(Boolean bool) {
        this.f51091c = bool;
        return this;
    }

    public final v9 f() {
        return new v9(this, null);
    }
}
