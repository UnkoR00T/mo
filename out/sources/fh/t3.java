package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w3 f63532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f63533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jd f63534c;

    public final t3 a(Integer num) {
        this.f63533b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final t3 b(jd jdVar) {
        this.f63534c = jdVar;
        return this;
    }

    public final t3 c(w3 w3Var) {
        this.f63532a = w3Var;
        return this;
    }

    public final y3 e() {
        return new y3(this, null);
    }
}
