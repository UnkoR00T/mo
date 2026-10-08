package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v9 f51117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r9 f51118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n9 f51119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f51120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f51121e;

    public final ua d(Integer num) {
        this.f51120d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final ua e(n9 n9Var) {
        this.f51119c = n9Var;
        return this;
    }

    public final ua f(r9 r9Var) {
        this.f51118b = r9Var;
        return this;
    }

    public final ua g(v9 v9Var) {
        this.f51117a = v9Var;
        return this;
    }

    public final ua h(Integer num) {
        this.f51121e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final wa i() {
        return new wa(this, null);
    }
}
