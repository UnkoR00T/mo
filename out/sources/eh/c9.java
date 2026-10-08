package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f50312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f50313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f50314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f50315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f50316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f50317f;

    public final c9 a(Long l15) {
        this.f50314c = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final c9 b(Long l15) {
        this.f50315d = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final c9 c(Long l15) {
        this.f50312a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final c9 d(Long l15) {
        this.f50316e = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final c9 e(Long l15) {
        this.f50313b = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final c9 f(Long l15) {
        this.f50317f = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final e9 g() {
        return new e9(this, null);
    }
}
