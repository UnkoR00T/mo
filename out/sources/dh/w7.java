package dh;

/* JADX INFO: loaded from: classes3.dex */
public final class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f42416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x7 f42417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r7 f42418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f42419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f42420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f42421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f42422g;

    public final w7 b(Long l15) {
        this.f42416a = Long.valueOf(l15.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final w7 c(Integer num) {
        this.f42419d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final w7 d(r7 r7Var) {
        this.f42418c = r7Var;
        return this;
    }

    public final w7 e(Integer num) {
        this.f42421f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final w7 f(x7 x7Var) {
        this.f42417b = x7Var;
        return this;
    }

    public final w7 g(Integer num) {
        this.f42420e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final w7 h(Integer num) {
        this.f42422g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final z7 j() {
        return new z7(this, null);
    }
}
