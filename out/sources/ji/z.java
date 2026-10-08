package ji;

/* JADX INFO: loaded from: classes4.dex */
final class z extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f103314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f103315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ii.k0 f103316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vh.a f103317d;

    z() {
    }

    @Override // ji.e.a
    public final Integer b() {
        return this.f103315b;
    }

    @Override // ji.e.a
    public final Integer c() {
        return this.f103314a;
    }

    @Override // ji.e.a
    public final e.a d(vh.a aVar) {
        this.f103317d = aVar;
        return this;
    }

    @Override // ji.e.a
    public final e.a e(Integer num) {
        this.f103315b = num;
        return this;
    }

    @Override // ji.e.a
    public final e.a f(Integer num) {
        this.f103314a = num;
        return this;
    }

    @Override // ji.e.a
    final ii.k0 g() {
        ii.k0 k0Var = this.f103316c;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // ji.e.a
    final e h() {
        ii.k0 k0Var = this.f103316c;
        if (k0Var != null) {
            return new a0(this.f103314a, this.f103315b, k0Var, this.f103317d, null);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }

    final e.a i(ii.k0 k0Var) {
        if (k0Var == null) {
            throw new NullPointerException("Null photoMetadata");
        }
        this.f103316c = k0Var;
        return this;
    }
}
