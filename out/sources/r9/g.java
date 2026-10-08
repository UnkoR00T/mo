package r9;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f172395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f172396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f172397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f172398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f172399e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f172405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f172406l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f172409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f172410p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f172412r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f172414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f172415u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f172400f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f172401g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f172402h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f172403i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f172404j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f172407m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f172408n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f172411q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f172413s = Float.MAX_VALUE;

    private g t(g gVar, boolean z15) {
        int i15;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f172397c && gVar.f172397c) {
                z(gVar.f172396b);
            }
            if (this.f172402h == -1) {
                this.f172402h = gVar.f172402h;
            }
            if (this.f172403i == -1) {
                this.f172403i = gVar.f172403i;
            }
            if (this.f172395a == null && (str = gVar.f172395a) != null) {
                this.f172395a = str;
            }
            if (this.f172400f == -1) {
                this.f172400f = gVar.f172400f;
            }
            if (this.f172401g == -1) {
                this.f172401g = gVar.f172401g;
            }
            if (this.f172408n == -1) {
                this.f172408n = gVar.f172408n;
            }
            if (this.f172409o == null && (alignment2 = gVar.f172409o) != null) {
                this.f172409o = alignment2;
            }
            if (this.f172410p == null && (alignment = gVar.f172410p) != null) {
                this.f172410p = alignment;
            }
            if (this.f172411q == -1) {
                this.f172411q = gVar.f172411q;
            }
            if (this.f172404j == -1) {
                this.f172404j = gVar.f172404j;
                this.f172405k = gVar.f172405k;
            }
            if (this.f172412r == null) {
                this.f172412r = gVar.f172412r;
            }
            if (this.f172413s == Float.MAX_VALUE) {
                this.f172413s = gVar.f172413s;
            }
            if (this.f172414t == null) {
                this.f172414t = gVar.f172414t;
            }
            if (this.f172415u == null) {
                this.f172415u = gVar.f172415u;
            }
            if (z15 && !this.f172399e && gVar.f172399e) {
                w(gVar.f172398d);
            }
            if (z15 && this.f172407m == -1 && (i15 = gVar.f172407m) != -1) {
                this.f172407m = i15;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f172395a = str;
        return this;
    }

    public g B(float f15) {
        this.f172405k = f15;
        return this;
    }

    public g C(int i15) {
        this.f172404j = i15;
        return this;
    }

    public g D(String str) {
        this.f172406l = str;
        return this;
    }

    public g E(boolean z15) {
        this.f172403i = z15 ? 1 : 0;
        return this;
    }

    public g F(boolean z15) {
        this.f172400f = z15 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f172410p = alignment;
        return this;
    }

    public g H(String str) {
        this.f172414t = str;
        return this;
    }

    public g I(int i15) {
        this.f172408n = i15;
        return this;
    }

    public g J(int i15) {
        this.f172407m = i15;
        return this;
    }

    public g K(float f15) {
        this.f172413s = f15;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f172409o = alignment;
        return this;
    }

    public g M(boolean z15) {
        this.f172411q = z15 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f172412r = bVar;
        return this;
    }

    public g O(boolean z15) {
        this.f172401g = z15 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f172399e) {
            return this.f172398d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f172415u;
    }

    public int d() {
        if (this.f172397c) {
            return this.f172396b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f172395a;
    }

    public float f() {
        return this.f172405k;
    }

    public int g() {
        return this.f172404j;
    }

    public String h() {
        return this.f172406l;
    }

    public Layout.Alignment i() {
        return this.f172410p;
    }

    public String j() {
        return this.f172414t;
    }

    public int k() {
        return this.f172408n;
    }

    public int l() {
        return this.f172407m;
    }

    public float m() {
        return this.f172413s;
    }

    public int n() {
        int i15 = this.f172402h;
        if (i15 == -1 && this.f172403i == -1) {
            return -1;
        }
        return (i15 == 1 ? 1 : 0) | (this.f172403i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f172409o;
    }

    public boolean p() {
        return this.f172411q == 1;
    }

    public b q() {
        return this.f172412r;
    }

    public boolean r() {
        return this.f172399e;
    }

    public boolean s() {
        return this.f172397c;
    }

    public boolean u() {
        return this.f172400f == 1;
    }

    public boolean v() {
        return this.f172401g == 1;
    }

    public g w(int i15) {
        this.f172398d = i15;
        this.f172399e = true;
        return this;
    }

    public g x(boolean z15) {
        this.f172402h = z15 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f172415u = str;
        return this;
    }

    public g z(int i15) {
        this.f172396b = i15;
        this.f172397c = true;
        return this;
    }
}
