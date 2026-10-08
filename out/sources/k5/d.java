package k5;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f108473i = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f108474j = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f108475k = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f108476l = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f108477m = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f108478n = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f108480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f108481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f108482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f108483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f108484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f108485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f108486h;

    private d() {
        this.f108479a = -2;
        this.f108480b = 0;
        this.f108481c = Integer.MAX_VALUE;
        this.f108482d = 1.0f;
        this.f108483e = 0;
        this.f108484f = null;
        this.f108485g = f108474j;
        this.f108486h = false;
    }

    public static d b(int i15) {
        d dVar = new d(f108473i);
        dVar.i(i15);
        return dVar;
    }

    public static d c(Object obj) {
        d dVar = new d(f108473i);
        dVar.j(obj);
        return dVar;
    }

    public static d d() {
        return new d(f108476l);
    }

    public static d e(Object obj, float f15) {
        d dVar = new d(f108477m);
        dVar.p(obj, f15);
        return dVar;
    }

    public static d f(String str) {
        d dVar = new d(f108478n);
        dVar.q(str);
        return dVar;
    }

    public static d g(Object obj) {
        d dVar = new d();
        dVar.s(obj);
        return dVar;
    }

    public static d h() {
        return new d(f108474j);
    }

    public void a(g gVar, n5.e eVar, int i15) {
        String str = this.f108484f;
        if (str != null) {
            eVar.G0(str);
        }
        int i16 = 2;
        if (i15 == 0) {
            if (this.f108486h) {
                eVar.S0(n5.e.b.MATCH_CONSTRAINT);
                Object obj = this.f108485g;
                if (obj == f108474j) {
                    i16 = 1;
                } else if (obj != f108477m) {
                    i16 = 0;
                }
                eVar.T0(i16, this.f108480b, this.f108481c, this.f108482d);
                return;
            }
            int i17 = this.f108480b;
            if (i17 > 0) {
                eVar.d1(i17);
            }
            int i18 = this.f108481c;
            if (i18 < Integer.MAX_VALUE) {
                eVar.a1(i18);
            }
            Object obj2 = this.f108485g;
            if (obj2 == f108474j) {
                eVar.S0(n5.e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f108476l) {
                eVar.S0(n5.e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar.S0(n5.e.b.FIXED);
                    eVar.n1(this.f108483e);
                    return;
                }
                return;
            }
        }
        if (this.f108486h) {
            eVar.j1(n5.e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f108485g;
            if (obj3 == f108474j) {
                i16 = 1;
            } else if (obj3 != f108477m) {
                i16 = 0;
            }
            eVar.k1(i16, this.f108480b, this.f108481c, this.f108482d);
            return;
        }
        int i19 = this.f108480b;
        if (i19 > 0) {
            eVar.c1(i19);
        }
        int i25 = this.f108481c;
        if (i25 < Integer.MAX_VALUE) {
            eVar.Z0(i25);
        }
        Object obj4 = this.f108485g;
        if (obj4 == f108474j) {
            eVar.j1(n5.e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f108476l) {
            eVar.j1(n5.e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar.j1(n5.e.b.FIXED);
            eVar.O0(this.f108483e);
        }
    }

    public d i(int i15) {
        this.f108485g = null;
        this.f108483e = i15;
        return this;
    }

    public d j(Object obj) {
        this.f108485g = obj;
        if (obj instanceof Integer) {
            this.f108483e = ((Integer) obj).intValue();
            this.f108485g = null;
        }
        return this;
    }

    int k() {
        return this.f108483e;
    }

    public d l(int i15) {
        if (this.f108481c >= 0) {
            this.f108481c = i15;
        }
        return this;
    }

    public d m(Object obj) {
        Object obj2 = f108474j;
        if (obj == obj2 && this.f108486h) {
            this.f108485g = obj2;
            this.f108481c = Integer.MAX_VALUE;
        }
        return this;
    }

    public d n(int i15) {
        if (i15 >= 0) {
            this.f108480b = i15;
        }
        return this;
    }

    public d o(Object obj) {
        if (obj == f108474j) {
            this.f108480b = -2;
        }
        return this;
    }

    public d p(Object obj, float f15) {
        this.f108482d = f15;
        return this;
    }

    public d q(String str) {
        this.f108484f = str;
        return this;
    }

    public d r(int i15) {
        this.f108486h = true;
        if (i15 >= 0) {
            this.f108481c = i15;
        }
        return this;
    }

    public d s(Object obj) {
        this.f108485g = obj;
        this.f108486h = true;
        return this;
    }

    private d(Object obj) {
        this.f108479a = -2;
        this.f108480b = 0;
        this.f108481c = Integer.MAX_VALUE;
        this.f108482d = 1.0f;
        this.f108483e = 0;
        this.f108484f = null;
        this.f108486h = false;
        this.f108485g = obj;
    }
}
