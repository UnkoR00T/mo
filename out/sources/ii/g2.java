package ii;

/* JADX INFO: loaded from: classes4.dex */
final class g2 extends j0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y0 f92456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y0 f92457b;

    g2() {
    }

    @Override // ii.j0.a
    public final j0 a() {
        return new t5(this.f92456a, this.f92457b);
    }

    @Override // ii.j0.a
    public final j0.a b(y0 y0Var) {
        this.f92457b = y0Var;
        return this;
    }

    @Override // ii.j0.a
    public final j0.a c(y0 y0Var) {
        this.f92456a = y0Var;
        return this;
    }
}
