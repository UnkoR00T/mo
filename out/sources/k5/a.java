package k5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f108418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g f108420b;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f108423c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f108425d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    d f108429f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    d f108431g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Object f108433h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private n5.e f108435i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private HashMap<String, Integer> f108437j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private HashMap<String, Float> f108439k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    i5.g f108441l0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f108422c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    l5.e f108424d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f108426e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f108428f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f108430g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f108432h = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f108434i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f108436j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f108438k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f108440l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f108442m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f108443n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f108444o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f108445p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f108446q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f108447r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f108448s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f108449t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f108450u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f108451v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f108452w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f108453x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f108454y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f108455z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    float I = Float.NaN;
    int J = 0;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    protected Object T = null;
    Object U = null;
    protected Object V = null;
    protected Object W = null;
    Object X = null;
    Object Y = null;
    Object Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    Object f108419a0 = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    Object f108421b0 = null;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    g.b f108427e0 = null;

    /* JADX INFO: renamed from: k5.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2580a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f108456a;

        static {
            int[] iArr = new int[g.b.values().length];
            f108456a = iArr;
            try {
                iArr[g.b.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f108456a[g.b.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f108456a[g.b.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f108456a[g.b.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f108456a[g.b.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f108456a[g.b.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f108456a[g.b.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f108456a[g.b.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f108456a[g.b.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f108456a[g.b.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f108456a[g.b.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f108456a[g.b.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f108456a[g.b.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f108456a[g.b.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f108456a[g.b.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f108456a[g.b.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f108456a[g.b.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f108456a[g.b.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f108456a[g.b.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f108456a[g.b.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public a(g gVar) {
        Object obj = d.f108474j;
        this.f108429f0 = d.c(obj);
        this.f108431g0 = d.c(obj);
        this.f108437j0 = new HashMap<>();
        this.f108439k0 = new HashMap<>();
        this.f108441l0 = null;
        this.f108420b = gVar;
    }

    private Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f108420b.t(obj) : obj;
    }

    private n5.e D(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).a();
        }
        return null;
    }

    private void h(n5.e eVar, Object obj, g.b bVar) {
        n5.e eVarD = D(obj);
        if (eVarD == null) {
            return;
        }
        int[] iArr = C2580a.f108456a;
        int i15 = iArr[bVar.ordinal()];
        switch (iArr[bVar.ordinal()]) {
            case 1:
                n5.d.a aVar = n5.d.a.LEFT;
                eVar.o(aVar).b(eVarD.o(aVar), this.f108438k, this.f108446q, false);
                break;
            case 2:
                eVar.o(n5.d.a.LEFT).b(eVarD.o(n5.d.a.RIGHT), this.f108438k, this.f108446q, false);
                break;
            case 3:
                eVar.o(n5.d.a.RIGHT).b(eVarD.o(n5.d.a.LEFT), this.f108440l, this.f108447r, false);
                break;
            case 4:
                n5.d.a aVar2 = n5.d.a.RIGHT;
                eVar.o(aVar2).b(eVarD.o(aVar2), this.f108440l, this.f108447r, false);
                break;
            case 5:
                n5.d.a aVar3 = n5.d.a.LEFT;
                eVar.o(aVar3).b(eVarD.o(aVar3), this.f108442m, this.f108448s, false);
                break;
            case 6:
                eVar.o(n5.d.a.LEFT).b(eVarD.o(n5.d.a.RIGHT), this.f108442m, this.f108448s, false);
                break;
            case 7:
                eVar.o(n5.d.a.RIGHT).b(eVarD.o(n5.d.a.LEFT), this.f108443n, this.f108449t, false);
                break;
            case 8:
                n5.d.a aVar4 = n5.d.a.RIGHT;
                eVar.o(aVar4).b(eVarD.o(aVar4), this.f108443n, this.f108449t, false);
                break;
            case 9:
                n5.d.a aVar5 = n5.d.a.TOP;
                eVar.o(aVar5).b(eVarD.o(aVar5), this.f108444o, this.f108450u, false);
                break;
            case 10:
                eVar.o(n5.d.a.TOP).b(eVarD.o(n5.d.a.BOTTOM), this.f108444o, this.f108450u, false);
                break;
            case 11:
                eVar.g0(n5.d.a.TOP, eVarD, n5.d.a.BASELINE, this.f108444o, this.f108450u);
                break;
            case 12:
                eVar.o(n5.d.a.BOTTOM).b(eVarD.o(n5.d.a.TOP), this.f108445p, this.f108451v, false);
                break;
            case 13:
                n5.d.a aVar6 = n5.d.a.BOTTOM;
                eVar.o(aVar6).b(eVarD.o(aVar6), this.f108445p, this.f108451v, false);
                break;
            case 14:
                eVar.g0(n5.d.a.BOTTOM, eVarD, n5.d.a.BASELINE, this.f108445p, this.f108451v);
                break;
            case 15:
                eVar.g0(n5.d.a.BASELINE, eVarD, n5.d.a.BOTTOM, this.f108452w, this.f108453x);
                break;
            case 16:
                eVar.g0(n5.d.a.BASELINE, eVarD, n5.d.a.TOP, this.f108452w, this.f108453x);
                break;
            case 17:
                n5.d.a aVar7 = n5.d.a.BASELINE;
                eVar.g0(aVar7, eVarD, aVar7, this.f108452w, this.f108453x);
                break;
            case 18:
                eVar.l(eVarD, this.f108423c0, (int) this.f108425d0);
                break;
        }
    }

    private void x() {
        this.K = B(this.K);
        this.L = B(this.L);
        this.M = B(this.M);
        this.N = B(this.N);
        this.O = B(this.O);
        this.P = B(this.P);
        this.Q = B(this.Q);
        this.R = B(this.R);
        this.S = B(this.S);
        this.T = B(this.T);
        this.V = B(this.V);
        this.W = B(this.W);
        this.Y = B(this.Y);
        this.Z = B(this.Z);
        this.f108419a0 = B(this.f108419a0);
    }

    public a A(Object obj) {
        this.f108427e0 = g.b.END_TO_START;
        this.Q = obj;
        return this;
    }

    public d C() {
        return this.f108431g0;
    }

    public d E() {
        return this.f108429f0;
    }

    public a F(float f15) {
        this.f108434i = f15;
        return this;
    }

    public a G() {
        if (this.K != null) {
            this.f108427e0 = g.b.LEFT_TO_LEFT;
            return this;
        }
        this.f108427e0 = g.b.LEFT_TO_RIGHT;
        return this;
    }

    public a H(Object obj) {
        this.f108427e0 = g.b.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    public a I(Object obj) {
        this.f108427e0 = g.b.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    public a J(int i15) {
        g.b bVar = this.f108427e0;
        if (bVar == null) {
            this.f108438k = i15;
            this.f108440l = i15;
            this.f108442m = i15;
            this.f108443n = i15;
            this.f108444o = i15;
            this.f108445p = i15;
            return this;
        }
        switch (C2580a.f108456a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f108438k = i15;
                break;
            case 3:
            case 4:
                this.f108440l = i15;
                break;
            case 5:
            case 6:
                this.f108442m = i15;
                break;
            case 7:
            case 8:
                this.f108443n = i15;
                break;
            case 9:
            case 10:
            case 11:
                this.f108444o = i15;
                break;
            case 12:
            case 13:
            case 14:
                this.f108445p = i15;
                break;
            case 15:
            case 16:
            case 17:
                this.f108452w = i15;
                break;
            case 18:
                this.f108425d0 = i15;
                break;
        }
        return this;
    }

    public a K(Object obj) {
        return J(this.f108420b.e(obj));
    }

    public a L(int i15) {
        g.b bVar = this.f108427e0;
        if (bVar == null) {
            this.f108446q = i15;
            this.f108447r = i15;
            this.f108448s = i15;
            this.f108449t = i15;
            this.f108450u = i15;
            this.f108451v = i15;
            return this;
        }
        switch (C2580a.f108456a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.f108446q = i15;
                break;
            case 3:
            case 4:
                this.f108447r = i15;
                break;
            case 5:
            case 6:
                this.f108448s = i15;
                break;
            case 7:
            case 8:
                this.f108449t = i15;
                break;
            case 9:
            case 10:
            case 11:
                this.f108450u = i15;
                break;
            case 12:
            case 13:
            case 14:
                this.f108451v = i15;
                break;
            case 15:
            case 16:
            case 17:
                this.f108453x = i15;
                break;
        }
        return this;
    }

    public a M(Object obj) {
        return L(this.f108420b.e(obj));
    }

    public a N(float f15) {
        this.f108454y = f15;
        return this;
    }

    public a O(float f15) {
        this.f108455z = f15;
        return this;
    }

    public a P() {
        if (this.M != null) {
            this.f108427e0 = g.b.RIGHT_TO_LEFT;
            return this;
        }
        this.f108427e0 = g.b.RIGHT_TO_RIGHT;
        return this;
    }

    public a Q(Object obj) {
        this.f108427e0 = g.b.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public a R(Object obj) {
        this.f108427e0 = g.b.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public a S(float f15) {
        this.A = f15;
        return this;
    }

    public a T(float f15) {
        this.B = f15;
        return this;
    }

    public a U(float f15) {
        this.C = f15;
        return this;
    }

    public a V(float f15) {
        this.H = f15;
        return this;
    }

    public a W(float f15) {
        this.I = f15;
        return this;
    }

    public void X(l5.e eVar) {
        this.f108424d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public a Y(d dVar) {
        this.f108431g0 = dVar;
        return this;
    }

    public void Z(int i15) {
        this.f108426e = i15;
    }

    @Override // k5.f
    public n5.e a() {
        if (this.f108435i0 == null) {
            n5.e eVarW = w();
            this.f108435i0 = eVarW;
            eVarW.E0(this.f108433h0);
        }
        return this.f108435i0;
    }

    public void a0(float f15) {
        this.f108430g = f15;
    }

    @Override // k5.f
    public void apply() {
        if (this.f108435i0 == null) {
            return;
        }
        l5.e eVar = this.f108424d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f108429f0.a(this.f108420b, this.f108435i0, 0);
        this.f108431g0.a(this.f108420b, this.f108435i0, 1);
        x();
        i();
        int i15 = this.f108426e;
        if (i15 != 0) {
            this.f108435i0.Q0(i15);
        }
        int i16 = this.f108428f;
        if (i16 != 0) {
            this.f108435i0.h1(i16);
        }
        float f15 = this.f108430g;
        if (f15 != -1.0f) {
            this.f108435i0.U0(f15);
        }
        float f16 = this.f108432h;
        if (f16 != -1.0f) {
            this.f108435i0.l1(f16);
        }
        this.f108435i0.P0(this.f108434i);
        this.f108435i0.g1(this.f108436j);
        n5.e eVar2 = this.f108435i0;
        h hVar = eVar2.f131865n;
        hVar.f108561f = this.f108454y;
        hVar.f108562g = this.f108455z;
        hVar.f108563h = this.A;
        hVar.f108564i = this.B;
        hVar.f108565j = this.C;
        hVar.f108566k = this.D;
        hVar.f108567l = this.E;
        hVar.f108568m = this.F;
        hVar.f108569n = this.H;
        hVar.f108570o = this.I;
        hVar.f108571p = this.G;
        int i17 = this.J;
        hVar.f108573r = i17;
        eVar2.m1(i17);
        this.f108435i0.f131865n.h(this.f108441l0);
        HashMap<String, Integer> map = this.f108437j0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f108435i0.f131865n.g(str, 902, this.f108437j0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f108439k0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f108435i0.f131865n.f(str2, 901, this.f108439k0.get(str2).floatValue());
            }
        }
    }

    @Override // k5.f
    public void b(n5.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f108435i0 = eVar;
        eVar.E0(this.f108433h0);
    }

    public void b0(String str) {
        this.f108422c = str;
    }

    @Override // k5.f
    public void c(Object obj) {
        this.f108418a = obj;
    }

    public void c0(int i15) {
        this.f108428f = i15;
    }

    @Override // k5.f
    public l5.e d() {
        return this.f108424d;
    }

    public void d0(float f15) {
        this.f108432h = f15;
    }

    public void e(String str, int i15) {
        this.f108437j0.put(str, Integer.valueOf(i15));
    }

    public void e0(Object obj) {
        this.f108433h0 = obj;
        n5.e eVar = this.f108435i0;
        if (eVar != null) {
            eVar.E0(obj);
        }
    }

    public void f(String str, float f15) {
        if (this.f108439k0 == null) {
            this.f108439k0 = new HashMap<>();
        }
        this.f108439k0.put(str, Float.valueOf(f15));
    }

    public a f0(d dVar) {
        this.f108429f0 = dVar;
        return this;
    }

    public a g(float f15) {
        this.G = f15;
        return this;
    }

    public a g0() {
        if (this.O != null) {
            this.f108427e0 = g.b.START_TO_START;
            return this;
        }
        this.f108427e0 = g.b.START_TO_END;
        return this;
    }

    @Override // k5.f
    public Object getKey() {
        return this.f108418a;
    }

    public a h0(Object obj) {
        this.f108427e0 = g.b.START_TO_END;
        this.P = obj;
        return this;
    }

    public void i() {
        h(this.f108435i0, this.K, g.b.LEFT_TO_LEFT);
        h(this.f108435i0, this.L, g.b.LEFT_TO_RIGHT);
        h(this.f108435i0, this.M, g.b.RIGHT_TO_LEFT);
        h(this.f108435i0, this.N, g.b.RIGHT_TO_RIGHT);
        h(this.f108435i0, this.O, g.b.START_TO_START);
        h(this.f108435i0, this.P, g.b.START_TO_END);
        h(this.f108435i0, this.Q, g.b.END_TO_START);
        h(this.f108435i0, this.R, g.b.END_TO_END);
        h(this.f108435i0, this.S, g.b.TOP_TO_TOP);
        h(this.f108435i0, this.T, g.b.TOP_TO_BOTTOM);
        h(this.f108435i0, this.U, g.b.TOP_TO_BASELINE);
        h(this.f108435i0, this.V, g.b.BOTTOM_TO_TOP);
        h(this.f108435i0, this.W, g.b.BOTTOM_TO_BOTTOM);
        h(this.f108435i0, this.X, g.b.BOTTOM_TO_BASELINE);
        h(this.f108435i0, this.Y, g.b.BASELINE_TO_BASELINE);
        h(this.f108435i0, this.Z, g.b.BASELINE_TO_TOP);
        h(this.f108435i0, this.f108419a0, g.b.BASELINE_TO_BOTTOM);
        h(this.f108435i0, this.f108421b0, g.b.CIRCULAR_CONSTRAINT);
    }

    public a i0(Object obj) {
        this.f108427e0 = g.b.START_TO_START;
        this.O = obj;
        return this;
    }

    public a j() {
        this.f108427e0 = g.b.BASELINE_TO_BASELINE;
        return this;
    }

    public a j0() {
        if (this.S != null) {
            this.f108427e0 = g.b.TOP_TO_TOP;
            return this;
        }
        this.f108427e0 = g.b.TOP_TO_BOTTOM;
        return this;
    }

    public a k(Object obj) {
        this.f108427e0 = g.b.BASELINE_TO_BASELINE;
        this.Y = obj;
        return this;
    }

    a k0(Object obj) {
        this.f108427e0 = g.b.TOP_TO_BASELINE;
        this.U = obj;
        return this;
    }

    public a l(Object obj) {
        this.f108427e0 = g.b.BASELINE_TO_BOTTOM;
        this.f108419a0 = obj;
        return this;
    }

    public a l0(Object obj) {
        this.f108427e0 = g.b.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public a m(Object obj) {
        this.f108427e0 = g.b.BASELINE_TO_TOP;
        this.Z = obj;
        return this;
    }

    public a m0(Object obj) {
        this.f108427e0 = g.b.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public a n() {
        if (this.V != null) {
            this.f108427e0 = g.b.BOTTOM_TO_TOP;
            return this;
        }
        this.f108427e0 = g.b.BOTTOM_TO_BOTTOM;
        return this;
    }

    public a n0(float f15) {
        this.D = f15;
        return this;
    }

    a o(Object obj) {
        this.f108427e0 = g.b.BOTTOM_TO_BASELINE;
        this.X = obj;
        return this;
    }

    public a o0(float f15) {
        this.E = f15;
        return this;
    }

    public a p(Object obj) {
        this.f108427e0 = g.b.BOTTOM_TO_BOTTOM;
        this.W = obj;
        return this;
    }

    public a p0(float f15) {
        this.F = f15;
        return this;
    }

    public a q(Object obj) {
        this.f108427e0 = g.b.BOTTOM_TO_TOP;
        this.V = obj;
        return this;
    }

    public a q0(float f15) {
        this.f108436j = f15;
        return this;
    }

    public a r(Object obj, float f15, float f16) {
        this.f108421b0 = B(obj);
        this.f108423c0 = f15;
        this.f108425d0 = f16;
        this.f108427e0 = g.b.CIRCULAR_CONSTRAINT;
        return this;
    }

    public a r0(int i15) {
        this.J = i15;
        return this;
    }

    public a s() {
        g.b bVar = this.f108427e0;
        if (bVar == null) {
            t();
            return this;
        }
        switch (C2580a.f108456a[bVar.ordinal()]) {
            case 1:
            case 2:
                this.K = null;
                this.L = null;
                this.f108438k = 0;
                this.f108446q = 0;
                break;
            case 3:
            case 4:
                this.M = null;
                this.N = null;
                this.f108440l = 0;
                this.f108447r = 0;
                break;
            case 5:
            case 6:
                this.O = null;
                this.P = null;
                this.f108442m = 0;
                this.f108448s = 0;
                break;
            case 7:
            case 8:
                this.Q = null;
                this.R = null;
                this.f108443n = 0;
                this.f108449t = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.S = null;
                this.T = null;
                this.U = null;
                this.f108444o = 0;
                this.f108450u = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.V = null;
                this.W = null;
                this.X = null;
                this.f108445p = 0;
                this.f108451v = 0;
                break;
            case 17:
                this.Y = null;
                break;
            case 18:
                this.f108421b0 = null;
                break;
        }
        return this;
    }

    public a t() {
        this.K = null;
        this.L = null;
        this.f108438k = 0;
        this.M = null;
        this.N = null;
        this.f108440l = 0;
        this.O = null;
        this.P = null;
        this.f108442m = 0;
        this.Q = null;
        this.R = null;
        this.f108443n = 0;
        this.S = null;
        this.T = null;
        this.f108444o = 0;
        this.V = null;
        this.W = null;
        this.f108445p = 0;
        this.Y = null;
        this.f108421b0 = null;
        this.f108434i = 0.5f;
        this.f108436j = 0.5f;
        this.f108446q = 0;
        this.f108447r = 0;
        this.f108448s = 0;
        this.f108449t = 0;
        this.f108450u = 0;
        this.f108451v = 0;
        return this;
    }

    public a u() {
        g0().s();
        y().s();
        G().s();
        P().s();
        return this;
    }

    public a v() {
        j0().s();
        j().s();
        n().s();
        return this;
    }

    public n5.e w() {
        return new n5.e(E().k(), C().k());
    }

    public a y() {
        if (this.Q != null) {
            this.f108427e0 = g.b.END_TO_START;
            return this;
        }
        this.f108427e0 = g.b.END_TO_END;
        return this;
    }

    public a z(Object obj) {
        this.f108427e0 = g.b.END_TO_END;
        this.R = obj;
        return this;
    }
}
