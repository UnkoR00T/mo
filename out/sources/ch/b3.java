package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e3 f25780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f25781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yd f25782c;

    public final b3 a(Integer num) {
        this.f25781b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final b3 b(yd ydVar) {
        this.f25782c = ydVar;
        return this;
    }

    public final b3 c(e3 e3Var) {
        this.f25780a = e3Var;
        return this;
    }

    public final g3 e() {
        return new g3(this, null);
    }
}
