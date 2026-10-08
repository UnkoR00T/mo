package ii;

/* JADX INFO: loaded from: classes4.dex */
final class a3 extends w0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a0 f92363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f92364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f92365c;

    a3() {
    }

    @Override // ii.w0.a
    public final w0 a() {
        a0 a0Var;
        if (this.f92365c == 1 && (a0Var = this.f92363a) != null) {
            return new o6(a0Var, this.f92364b);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92363a == null) {
            sb5.append(" date");
        }
        if (this.f92365c == 0) {
            sb5.append(" exceptional");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.w0.a
    public final w0.a b(boolean z15) {
        this.f92364b = z15;
        this.f92365c = (byte) 1;
        return this;
    }

    public final w0.a c(a0 a0Var) {
        if (a0Var == null) {
            throw new NullPointerException("Null date");
        }
        this.f92363a = a0Var;
        return this;
    }
}
