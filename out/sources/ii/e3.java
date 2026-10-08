package ii;

/* JADX INFO: loaded from: classes4.dex */
final class e3 extends y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a0 f92421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f92422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f92423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f92424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f92425e;

    e3() {
    }

    @Override // ii.y0.a
    public final y0 a() {
        p pVar;
        b0 b0Var;
        if (this.f92425e == 1 && (pVar = this.f92422b) != null && (b0Var = this.f92423c) != null) {
            return new s6(this.f92421a, pVar, b0Var, this.f92424d);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92422b == null) {
            sb5.append(" day");
        }
        if (this.f92423c == null) {
            sb5.append(" time");
        }
        if (this.f92425e == 0) {
            sb5.append(" truncated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    @Override // ii.y0.a
    public final y0.a b(a0 a0Var) {
        this.f92421a = a0Var;
        return this;
    }

    @Override // ii.y0.a
    public final y0.a c(b0 b0Var) {
        if (b0Var == null) {
            throw new NullPointerException("Null time");
        }
        this.f92423c = b0Var;
        return this;
    }

    @Override // ii.y0.a
    public final y0.a d(boolean z15) {
        this.f92424d = z15;
        this.f92425e = (byte) 1;
        return this;
    }

    public final y0.a e(p pVar) {
        if (pVar == null) {
            throw new NullPointerException("Null day");
        }
        this.f92422b = pVar;
        return this;
    }
}
