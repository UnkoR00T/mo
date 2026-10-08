package ii;

/* JADX INFO: loaded from: classes4.dex */
final class n2 extends n0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92670b;

    n2() {
    }

    @Override // ii.n0.a
    public final n0 a() {
        return new b6(this.f92669a, this.f92670b);
    }

    @Override // ii.n0.a
    public final n0.a b(String str) {
        this.f92669a = str;
        return this;
    }

    @Override // ii.n0.a
    public final n0.a c(String str) {
        this.f92670b = str;
        return this;
    }
}
