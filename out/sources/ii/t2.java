package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class t2 extends r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f92774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f92776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Double f92777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f92778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f92779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f92780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f92781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a0 f92782k;

    t2() {
    }

    @Override // ii.r0.a
    public final r0.a b(Uri uri) {
        this.f92781j = uri;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a c(String str) {
        this.f92775d = str;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a d(String str) {
        this.f92776e = str;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a e(String str) {
        this.f92780i = str;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a f(String str) {
        this.f92772a = str;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a g(String str) {
        this.f92773b = str;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a h(String str) {
        this.f92774c = str;
        return this;
    }

    @Override // ii.r0.a
    public final r0.a i(a0 a0Var) {
        this.f92782k = a0Var;
        return this;
    }

    @Override // ii.r0.a
    final r0.a j(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.f92778g = fVar;
        return this;
    }

    @Override // ii.r0.a
    final r0.a k(String str) {
        this.f92779h = str;
        return this;
    }

    @Override // ii.r0.a
    final r0 l() {
        f fVar;
        String str;
        Double d15 = this.f92777f;
        if (d15 != null && (fVar = this.f92778g) != null && (str = this.f92779h) != null) {
            return new h6(this.f92772a, this.f92773b, this.f92774c, this.f92775d, this.f92776e, d15, fVar, str, this.f92780i, this.f92781j, this.f92782k);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92777f == null) {
            sb5.append(" rating");
        }
        if (this.f92778g == null) {
            sb5.append(" authorAttribution");
        }
        if (this.f92779h == null) {
            sb5.append(" attribution");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final r0.a m(Double d15) {
        if (d15 == null) {
            throw new NullPointerException("Null rating");
        }
        this.f92777f = d15;
        return this;
    }
}
