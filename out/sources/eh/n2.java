package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q2 f50831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f50832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e9 f50833c;

    public final n2 a(Integer num) {
        this.f50832b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final n2 b(e9 e9Var) {
        this.f50833c = e9Var;
        return this;
    }

    public final n2 c(q2 q2Var) {
        this.f50831a = q2Var;
        return this;
    }

    public final s2 e() {
        return new s2(this, null);
    }
}
