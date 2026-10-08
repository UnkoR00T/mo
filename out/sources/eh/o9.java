package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p9 f50898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f50899b;

    public final o9 a(p9 p9Var) {
        this.f50898a = p9Var;
        return this;
    }

    public final o9 b(Integer num) {
        this.f50899b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final r9 d() {
        return new r9(this, null);
    }
}
