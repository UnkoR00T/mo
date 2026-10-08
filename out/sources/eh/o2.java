package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ca f50870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f50871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n9 f50872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f50873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f50874e;

    public final o2 a(Integer num) {
        this.f50873d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final o2 b(n9 n9Var) {
        this.f50872c = n9Var;
        return this;
    }

    public final o2 c(ca caVar) {
        this.f50870a = caVar;
        return this;
    }

    public final o2 d(Boolean bool) {
        this.f50871b = bool;
        return this;
    }

    public final o2 e(Integer num) {
        this.f50874e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final q2 f() {
        return new q2(this, null);
    }
}
