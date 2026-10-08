package ji;

/* JADX INFO: loaded from: classes4.dex */
final class t extends a.AbstractC2439a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f103294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f103295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ii.k0 f103296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vh.a f103297d;

    t() {
    }

    @Override // ji.a.AbstractC2439a
    public final Integer b() {
        return this.f103295b;
    }

    @Override // ji.a.AbstractC2439a
    public final Integer c() {
        return this.f103294a;
    }

    @Override // ji.a.AbstractC2439a
    public final a.AbstractC2439a d(vh.a aVar) {
        this.f103297d = aVar;
        return this;
    }

    @Override // ji.a.AbstractC2439a
    public final a.AbstractC2439a e(Integer num) {
        this.f103295b = num;
        return this;
    }

    @Override // ji.a.AbstractC2439a
    public final a.AbstractC2439a f(Integer num) {
        this.f103294a = num;
        return this;
    }

    @Override // ji.a.AbstractC2439a
    final ii.k0 g() {
        ii.k0 k0Var = this.f103296c;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // ji.a.AbstractC2439a
    final a h() {
        ii.k0 k0Var = this.f103296c;
        if (k0Var != null) {
            return new u(this.f103294a, this.f103295b, k0Var, this.f103297d, null);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }

    final a.AbstractC2439a i(ii.k0 k0Var) {
        if (k0Var == null) {
            throw new NullPointerException("Null photoMetadata");
        }
        this.f103296c = k0Var;
        return this;
    }
}
