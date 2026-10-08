package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class p0 extends r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f103264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f103265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f103266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f103267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f103268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f103269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ii.d0 f103270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f103271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private vh.a f103272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r.b f103273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f103274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f103275l;

    p0() {
    }

    @Override // ji.r.a
    public final List<String> b() {
        return this.f103268e;
    }

    @Override // ji.r.a
    public final List<String> c() {
        return this.f103266c;
    }

    @Override // ji.r.a
    public final List<String> d() {
        return this.f103267d;
    }

    @Override // ji.r.a
    public final List<String> e() {
        return this.f103265b;
    }

    @Override // ji.r.a
    public final ii.d0 f() {
        ii.d0 d0Var = this.f103270g;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Property \"locationRestriction\" has not been set");
    }

    @Override // ji.r.a
    public final List<ii.l0.d> g() {
        List<ii.l0.d> list = this.f103271h;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // ji.r.a
    public final r.a h(vh.a aVar) {
        this.f103272i = aVar;
        return this;
    }

    @Override // ji.r.a
    public final r.a i(List<String> list) {
        this.f103268e = list;
        return this;
    }

    @Override // ji.r.a
    public final r.a j(List<String> list) {
        this.f103266c = list;
        return this;
    }

    @Override // ji.r.a
    public final r.a k(List<String> list) {
        this.f103267d = list;
        return this;
    }

    @Override // ji.r.a
    public final r.a l(List<String> list) {
        this.f103265b = list;
        return this;
    }

    @Override // ji.r.a
    public final r.a m(List<ii.l0.d> list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.f103271h = list;
        return this;
    }

    @Override // ji.r.a
    public final r.a n(boolean z15) {
        this.f103274k = z15;
        this.f103275l = (byte) 1;
        return this;
    }

    @Override // ji.r.a
    final r o() {
        ii.d0 d0Var;
        List list;
        if (this.f103275l == 1 && (d0Var = this.f103270g) != null && (list = this.f103271h) != null) {
            return new q0(this.f103264a, this.f103265b, this.f103266c, this.f103267d, this.f103268e, this.f103269f, d0Var, list, this.f103272i, this.f103273j, null, this.f103274k, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f103270g == null) {
            sb5.append(" locationRestriction");
        }
        if (this.f103271h == null) {
            sb5.append(" placeFields");
        }
        if (this.f103275l == 0) {
            sb5.append(" routingSummariesIncluded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final r.a p(ii.d0 d0Var) {
        if (d0Var == null) {
            throw new NullPointerException("Null locationRestriction");
        }
        this.f103270g = d0Var;
        return this;
    }
}
