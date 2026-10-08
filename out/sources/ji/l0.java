package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class l0 extends p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vh.a f103211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f103212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ii.c0 f103213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ii.d0 f103214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f103215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f103216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f103217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f103218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f103219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p.b f103220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f103221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f103222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f103223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f103224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f103225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f103226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f103227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f103228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f103229s;

    l0() {
    }

    @Override // ji.p.a
    public final Double b() {
        return this.f103216f;
    }

    @Override // ji.p.a
    public final List<ii.l0.d> c() {
        List<ii.l0.d> list = this.f103218h;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"placeFields\" has not been set");
    }

    @Override // ji.p.a
    public final List<Integer> d() {
        List<Integer> list = this.f103219i;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"priceLevels\" has not been set");
    }

    @Override // ji.p.a
    public final p.a e(vh.a aVar) {
        this.f103211a = aVar;
        return this;
    }

    @Override // ji.p.a
    public final p.a f(List<ii.l0.d> list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.f103218h = list;
        return this;
    }

    @Override // ji.p.a
    public final p.a g(List<Integer> list) {
        if (list == null) {
            throw new NullPointerException("Null priceLevels");
        }
        this.f103219i = list;
        return this;
    }

    @Override // ji.p.a
    public final p.a h(boolean z15) {
        this.f103225o = z15;
        this.f103229s = (byte) (this.f103229s | 8);
        return this;
    }

    @Override // ji.p.a
    public final p.a i(boolean z15) {
        this.f103224n = z15;
        this.f103229s = (byte) (this.f103229s | 4);
        return this;
    }

    @Override // ji.p.a
    public final p.a j(boolean z15) {
        this.f103226p = z15;
        this.f103229s = (byte) (this.f103229s | 16);
        return this;
    }

    @Override // ji.p.a
    public final p.a k(boolean z15) {
        this.f103222l = z15;
        this.f103229s = (byte) (this.f103229s | 2);
        return this;
    }

    @Override // ji.p.a
    public final p.a l(String str) {
        if (str == null) {
            throw new NullPointerException("Null textQuery");
        }
        this.f103223m = str;
        return this;
    }

    @Override // ji.p.a
    public final p.a m(int i15) {
        this.f103228r = i15;
        this.f103229s = (byte) (this.f103229s | 32);
        return this;
    }

    @Override // ji.p.a
    final p n() {
        List list;
        List list2;
        String str;
        if (this.f103229s == 63 && (list = this.f103218h) != null && (list2 = this.f103219i) != null && (str = this.f103223m) != null) {
            return new m0(this.f103211a, this.f103212b, this.f103213c, this.f103214d, this.f103215e, this.f103216f, this.f103217g, list, list2, this.f103220j, this.f103221k, this.f103222l, str, null, null, null, this.f103224n, this.f103225o, this.f103226p, this.f103227q, this.f103228r, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if ((this.f103229s & 1) == 0) {
            sb5.append(" openNow");
        }
        if (this.f103218h == null) {
            sb5.append(" placeFields");
        }
        if (this.f103219i == null) {
            sb5.append(" priceLevels");
        }
        if ((this.f103229s & 2) == 0) {
            sb5.append(" strictTypeFiltering");
        }
        if (this.f103223m == null) {
            sb5.append(" textQuery");
        }
        if ((this.f103229s & 4) == 0) {
            sb5.append(" routingSummariesIncluded");
        }
        if ((this.f103229s & 8) == 0) {
            sb5.append(" pureServiceAreaBusinessesIncluded");
        }
        if ((this.f103229s & 16) == 0) {
            sb5.append(" searchUriIncluded");
        }
        if ((this.f103229s & 32) == 0) {
            sb5.append(" requestPageIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final p.a o(boolean z15) {
        this.f103217g = z15;
        this.f103229s = (byte) (this.f103229s | 1);
        return this;
    }

    l0(p pVar) {
        this.f103211a = pVar.a();
        this.f103212b = pVar.d();
        this.f103213c = pVar.e();
        this.f103214d = pVar.f();
        this.f103215e = pVar.g();
        this.f103216f = pVar.h();
        this.f103217g = pVar.p();
        this.f103218h = pVar.i();
        this.f103219i = pVar.j();
        this.f103220j = pVar.k();
        this.f103221k = pVar.l();
        this.f103222l = pVar.t();
        this.f103223m = pVar.o();
        pVar.c();
        pVar.m();
        pVar.n();
        this.f103224n = pVar.r();
        this.f103225o = pVar.q();
        this.f103226p = pVar.s();
        this.f103227q = pVar.u();
        this.f103228r = pVar.v();
        this.f103229s = (byte) 63;
    }
}
