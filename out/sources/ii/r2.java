package ii;

/* JADX INFO: loaded from: classes4.dex */
final class r2 extends p0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e0 f92750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f92751b;

    r2() {
    }

    @Override // ii.p0.a
    public final p0 a() {
        return new f6(this.f92750a, this.f92751b);
    }

    @Override // ii.p0.a
    public final p0.a b(e0 e0Var) {
        this.f92751b = e0Var;
        return this;
    }

    @Override // ii.p0.a
    public final p0.a c(e0 e0Var) {
        this.f92750a = e0Var;
        return this;
    }
}
