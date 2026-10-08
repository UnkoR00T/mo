package g5;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f70636s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f70637t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f70638u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f70639v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f70640w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f70641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f70642y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f70647e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final c f70657o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f70660r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70643a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f70644b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f70645c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, i> f70646d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70648f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f70649g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f70651i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f70652j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f70653k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f70654l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f70655m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70656n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i[] f70658p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f70659q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g5.b[] f70650h = new g5.b[32];

    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    static class b extends g5.b {
        b(c cVar) {
            this.f70630e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f70657o = cVar;
        this.f70647e = new h(cVar);
        if (f70640w) {
            this.f70660r = new b(cVar);
        } else {
            this.f70660r = new g5.b(cVar);
        }
    }

    private int C(a aVar, boolean z15) {
        for (int i15 = 0; i15 < this.f70654l; i15++) {
            this.f70653k[i15] = false;
        }
        boolean z16 = false;
        int i16 = 0;
        while (!z16) {
            i16++;
            if (i16 < this.f70654l * 2) {
                if (aVar.getKey() != null) {
                    this.f70653k[aVar.getKey().f70676c] = true;
                }
                i iVarC = aVar.c(this, this.f70653k);
                if (iVarC != null) {
                    boolean[] zArr = this.f70653k;
                    int i17 = iVarC.f70676c;
                    if (!zArr[i17]) {
                        zArr[i17] = true;
                    }
                }
                if (iVarC != null) {
                    float f15 = Float.MAX_VALUE;
                    int i18 = -1;
                    for (int i19 = 0; i19 < this.f70655m; i19++) {
                        g5.b bVar = this.f70650h[i19];
                        if (bVar.f70626a.f70683k != i.a.UNRESTRICTED && !bVar.f70631f && bVar.t(iVarC)) {
                            float fJ = bVar.f70630e.j(iVarC);
                            if (fJ < 0.0f) {
                                float f16 = (-bVar.f70627b) / fJ;
                                if (f16 < f15) {
                                    i18 = i19;
                                    f15 = f16;
                                }
                            }
                        }
                    }
                    if (i18 > -1) {
                        g5.b bVar2 = this.f70650h[i18];
                        bVar2.f70626a.f70677d = -1;
                        bVar2.x(iVarC);
                        i iVar = bVar2.f70626a;
                        iVar.f70677d = i18;
                        iVar.o(this, bVar2);
                    }
                } else {
                    z16 = true;
                }
            }
            return i16;
        }
        return i16;
    }

    private void D() {
        int i15 = 0;
        if (f70640w) {
            while (i15 < this.f70655m) {
                g5.b bVar = this.f70650h[i15];
                if (bVar != null) {
                    this.f70657o.f70632a.A(bVar);
                }
                this.f70650h[i15] = null;
                i15++;
            }
            return;
        }
        while (i15 < this.f70655m) {
            g5.b bVar2 = this.f70650h[i15];
            if (bVar2 != null) {
                this.f70657o.f70633b.A(bVar2);
            }
            this.f70650h[i15] = null;
            i15++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarZ = this.f70657o.f70634c.z();
        if (iVarZ == null) {
            iVarZ = new i(aVar, str);
            iVarZ.n(aVar, str);
        } else {
            iVarZ.k();
            iVarZ.n(aVar, str);
        }
        int i15 = this.f70659q;
        int i16 = this.f70643a;
        if (i15 >= i16) {
            int i17 = i16 * 2;
            this.f70643a = i17;
            this.f70658p = (i[]) Arrays.copyOf(this.f70658p, i17);
        }
        i[] iVarArr = this.f70658p;
        int i18 = this.f70659q;
        this.f70659q = i18 + 1;
        iVarArr[i18] = iVarZ;
        return iVarZ;
    }

    private void l(g5.b bVar) {
        int i15;
        if (f70638u && bVar.f70631f) {
            bVar.f70626a.l(this, bVar.f70627b);
        } else {
            g5.b[] bVarArr = this.f70650h;
            int i16 = this.f70655m;
            bVarArr[i16] = bVar;
            i iVar = bVar.f70626a;
            iVar.f70677d = i16;
            this.f70655m = i16 + 1;
            iVar.o(this, bVar);
        }
        if (f70638u && this.f70644b) {
            int i17 = 0;
            while (i17 < this.f70655m) {
                if (this.f70650h[i17] == null) {
                    System.out.println("WTF");
                }
                g5.b bVar2 = this.f70650h[i17];
                if (bVar2 != null && bVar2.f70631f) {
                    bVar2.f70626a.l(this, bVar2.f70627b);
                    if (f70640w) {
                        this.f70657o.f70632a.A(bVar2);
                    } else {
                        this.f70657o.f70633b.A(bVar2);
                    }
                    this.f70650h[i17] = null;
                    int i18 = i17 + 1;
                    int i19 = i18;
                    while (true) {
                        i15 = this.f70655m;
                        if (i18 >= i15) {
                            break;
                        }
                        g5.b[] bVarArr2 = this.f70650h;
                        int i25 = i18 - 1;
                        g5.b bVar3 = bVarArr2[i18];
                        bVarArr2[i25] = bVar3;
                        i iVar2 = bVar3.f70626a;
                        if (iVar2.f70677d == i18) {
                            iVar2.f70677d = i25;
                        }
                        i19 = i18;
                        i18++;
                    }
                    if (i19 < i15) {
                        this.f70650h[i19] = null;
                    }
                    this.f70655m = i15 - 1;
                    i17--;
                }
                i17++;
            }
            this.f70644b = false;
        }
    }

    private void n() {
        for (int i15 = 0; i15 < this.f70655m; i15++) {
            g5.b bVar = this.f70650h[i15];
            bVar.f70626a.f70679f = bVar.f70627b;
        }
    }

    public static g5.b s(d dVar, i iVar, i iVar2, float f15) {
        return dVar.r().j(iVar, iVar2, f15);
    }

    private int u(a aVar) {
        float f15;
        for (int i15 = 0; i15 < this.f70655m; i15++) {
            g5.b bVar = this.f70650h[i15];
            if (bVar.f70626a.f70683k != i.a.UNRESTRICTED) {
                float f16 = 0.0f;
                if (bVar.f70627b < 0.0f) {
                    boolean z15 = false;
                    int i16 = 0;
                    while (!z15) {
                        i16++;
                        float f17 = Float.MAX_VALUE;
                        int i17 = 0;
                        int i18 = -1;
                        int i19 = -1;
                        int i25 = 0;
                        while (true) {
                            if (i17 >= this.f70655m) {
                                break;
                            }
                            g5.b bVar2 = this.f70650h[i17];
                            if (bVar2.f70626a.f70683k == i.a.UNRESTRICTED || bVar2.f70631f || bVar2.f70627b >= f16) {
                                f15 = f16;
                            } else if (f70639v) {
                                int iF = bVar2.f70630e.f();
                                int i26 = 0;
                                while (i26 < iF) {
                                    i iVarA = bVar2.f70630e.a(i26);
                                    float fJ = bVar2.f70630e.j(iVarA);
                                    if (fJ > f16) {
                                        for (int i27 = 0; i27 < 9; i27++) {
                                            float f18 = iVarA.f70681h[i27] / fJ;
                                            if ((f18 < f17 && i27 == i25) || i27 > i25) {
                                                i25 = i27;
                                                i19 = iVarA.f70676c;
                                                i18 = i17;
                                                f17 = f18;
                                            }
                                        }
                                    }
                                    i26++;
                                    f16 = f16;
                                }
                                f15 = f16;
                            } else {
                                f15 = f16;
                                for (int i28 = 1; i28 < this.f70654l; i28++) {
                                    i iVar = this.f70657o.f70635d[i28];
                                    float fJ2 = bVar2.f70630e.j(iVar);
                                    if (fJ2 > f15) {
                                        for (int i29 = 0; i29 < 9; i29++) {
                                            float f19 = iVar.f70681h[i29] / fJ2;
                                            if ((f19 < f17 && i29 == i25) || i29 > i25) {
                                                i25 = i29;
                                                i18 = i17;
                                                i19 = i28;
                                                f17 = f19;
                                            }
                                        }
                                    }
                                }
                            }
                            i17++;
                            f16 = f15;
                        }
                        float f25 = f16;
                        if (i18 != -1) {
                            g5.b bVar3 = this.f70650h[i18];
                            bVar3.f70626a.f70677d = -1;
                            bVar3.x(this.f70657o.f70635d[i19]);
                            i iVar2 = bVar3.f70626a;
                            iVar2.f70677d = i18;
                            iVar2.o(this, bVar3);
                        } else {
                            z15 = true;
                        }
                        if (i16 > this.f70654l / 2) {
                            z15 = true;
                        }
                        f16 = f25;
                    }
                    return i16;
                }
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i15 = this.f70648f * 2;
        this.f70648f = i15;
        this.f70650h = (g5.b[]) Arrays.copyOf(this.f70650h, i15);
        c cVar = this.f70657o;
        cVar.f70635d = (i[]) Arrays.copyOf(cVar.f70635d, this.f70648f);
        int i16 = this.f70648f;
        this.f70653k = new boolean[i16];
        this.f70649g = i16;
        this.f70656n = i16;
    }

    public void A() {
        if (this.f70647e.isEmpty()) {
            n();
            return;
        }
        if (!this.f70651i && !this.f70652j) {
            B(this.f70647e);
            return;
        }
        for (int i15 = 0; i15 < this.f70655m; i15++) {
            if (!this.f70650h[i15].f70631f) {
                B(this.f70647e);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i15 = 0;
        while (true) {
            cVar = this.f70657o;
            i[] iVarArr = cVar.f70635d;
            if (i15 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i15];
            if (iVar != null) {
                iVar.k();
            }
            i15++;
        }
        cVar.f70634c.B(this.f70658p, this.f70659q);
        this.f70659q = 0;
        Arrays.fill(this.f70657o.f70635d, (Object) null);
        HashMap<String, i> map = this.f70646d;
        if (map != null) {
            map.clear();
        }
        this.f70645c = 0;
        this.f70647e.clear();
        this.f70654l = 1;
        for (int i16 = 0; i16 < this.f70655m; i16++) {
            g5.b bVar = this.f70650h[i16];
            if (bVar != null) {
                bVar.f70628c = false;
            }
        }
        D();
        this.f70655m = 0;
        if (f70640w) {
            this.f70660r = new b(this.f70657o);
        } else {
            this.f70660r = new g5.b(this.f70657o);
        }
    }

    public void b(n5.e eVar, n5.e eVar2, float f15, int i15) {
        n5.d.a aVar = n5.d.a.LEFT;
        i iVarQ = q(eVar.o(aVar));
        n5.d.a aVar2 = n5.d.a.TOP;
        i iVarQ2 = q(eVar.o(aVar2));
        n5.d.a aVar3 = n5.d.a.RIGHT;
        i iVarQ3 = q(eVar.o(aVar3));
        n5.d.a aVar4 = n5.d.a.BOTTOM;
        i iVarQ4 = q(eVar.o(aVar4));
        i iVarQ5 = q(eVar2.o(aVar));
        i iVarQ6 = q(eVar2.o(aVar2));
        i iVarQ7 = q(eVar2.o(aVar3));
        i iVarQ8 = q(eVar2.o(aVar4));
        g5.b bVarR = r();
        double d15 = f15;
        double d16 = i15;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d15) * d16));
        d(bVarR);
        g5.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d15) * d16));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i15, float f15, i iVar3, i iVar4, int i16, int i17) {
        g5.b bVarR = r();
        bVarR.h(iVar, iVar2, i15, f15, iVar3, iVar4, i16);
        if (i17 != 8) {
            bVarR.d(this, i17);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public void d(g5.b bVar) {
        i iVarV;
        if (bVar == null) {
            return;
        }
        boolean z15 = true;
        if (this.f70655m + 1 >= this.f70656n || this.f70654l + 1 >= this.f70649g) {
            z();
        }
        boolean z16 = false;
        if (!bVar.f70631f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f70626a = iVarP;
                int i15 = this.f70655m;
                l(bVar);
                if (this.f70655m == i15 + 1) {
                    this.f70660r.a(bVar);
                    C(this.f70660r, true);
                    if (iVarP.f70677d == -1) {
                        if (bVar.f70626a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f70631f) {
                            bVar.f70626a.o(this, bVar);
                        }
                        if (f70640w) {
                            this.f70657o.f70632a.A(bVar);
                        } else {
                            this.f70657o.f70633b.A(bVar);
                        }
                        this.f70655m--;
                    }
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z16 = z15;
            }
        }
        if (z16) {
            return;
        }
        l(bVar);
    }

    public g5.b e(i iVar, i iVar2, int i15, int i16) {
        if (f70637t && i16 == 8 && iVar2.f70680g && iVar.f70677d == -1) {
            iVar.l(this, iVar2.f70679f + i15);
            return null;
        }
        g5.b bVarR = r();
        bVarR.n(iVar, iVar2, i15);
        if (i16 != 8) {
            bVarR.d(this, i16);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i15) {
        if (f70637t && iVar.f70677d == -1) {
            float f15 = i15;
            iVar.l(this, f15);
            for (int i16 = 0; i16 < this.f70645c + 1; i16++) {
                i iVar2 = this.f70657o.f70635d[i16];
                if (iVar2 != null && iVar2.f70687p && iVar2.f70688q == iVar.f70676c) {
                    iVar2.l(this, iVar2.f70689r + f15);
                }
            }
            return;
        }
        int i17 = iVar.f70677d;
        if (i17 == -1) {
            g5.b bVarR = r();
            bVarR.i(iVar, i15);
            d(bVarR);
            return;
        }
        g5.b bVar = this.f70650h[i17];
        if (bVar.f70631f) {
            bVar.f70627b = i15;
            return;
        }
        if (bVar.f70630e.f() == 0) {
            bVar.f70631f = true;
            bVar.f70627b = i15;
        } else {
            g5.b bVarR2 = r();
            bVarR2.m(iVar, i15);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i15, boolean z15) {
        g5.b bVarR = r();
        i iVarT = t();
        iVarT.f70678e = 0;
        bVarR.o(iVar, iVar2, iVarT, i15);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i15, int i16) {
        g5.b bVarR = r();
        i iVarT = t();
        iVarT.f70678e = 0;
        bVarR.o(iVar, iVar2, iVarT, i15);
        if (i16 != 8) {
            m(bVarR, (int) (bVarR.f70630e.j(iVarT) * (-1.0f)), i16);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i15, boolean z15) {
        g5.b bVarR = r();
        i iVarT = t();
        iVarT.f70678e = 0;
        bVarR.p(iVar, iVar2, iVarT, i15);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i15, int i16) {
        g5.b bVarR = r();
        i iVarT = t();
        iVarT.f70678e = 0;
        bVarR.p(iVar, iVar2, iVarT, i15);
        if (i16 != 8) {
            m(bVarR, (int) (bVarR.f70630e.j(iVarT) * (-1.0f)), i16);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f15, int i15) {
        g5.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f15);
        if (i15 != 8) {
            bVarR.d(this, i15);
        }
        d(bVarR);
    }

    void m(g5.b bVar, int i15, int i16) {
        bVar.e(o(i16, null), i15);
    }

    public i o(int i15, String str) {
        if (this.f70654l + 1 >= this.f70649g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i16 = this.f70645c + 1;
        this.f70645c = i16;
        this.f70654l++;
        iVarA.f70676c = i16;
        iVarA.f70678e = i15;
        this.f70657o.f70635d[i16] = iVarA;
        this.f70647e.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f70654l + 1 >= this.f70649g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i15 = this.f70645c + 1;
        this.f70645c = i15;
        this.f70654l++;
        iVarA.f70676c = i15;
        this.f70657o.f70635d[i15] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f70654l + 1 >= this.f70649g) {
            z();
        }
        if (obj instanceof n5.d) {
            n5.d dVar = (n5.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f70657o);
                iVarI = dVar.i();
            }
            int i15 = iVarI.f70676c;
            if (i15 != -1 && i15 <= this.f70645c && this.f70657o.f70635d[i15] != null) {
                return iVarI;
            }
            if (i15 != -1) {
                iVarI.k();
            }
            int i16 = this.f70645c + 1;
            this.f70645c = i16;
            this.f70654l++;
            iVarI.f70676c = i16;
            iVarI.f70683k = i.a.UNRESTRICTED;
            this.f70657o.f70635d[i16] = iVarI;
        }
        return iVarI;
    }

    public g5.b r() {
        g5.b bVarZ;
        if (f70640w) {
            bVarZ = this.f70657o.f70632a.z();
            if (bVarZ == null) {
                bVarZ = new b(this.f70657o);
                f70642y++;
            } else {
                bVarZ.y();
            }
        } else {
            bVarZ = this.f70657o.f70633b.z();
            if (bVarZ == null) {
                bVarZ = new g5.b(this.f70657o);
                f70641x++;
            } else {
                bVarZ.y();
            }
        }
        i.g();
        return bVarZ;
    }

    public i t() {
        if (this.f70654l + 1 >= this.f70649g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i15 = this.f70645c + 1;
        this.f70645c = i15;
        this.f70654l++;
        iVarA.f70676c = i15;
        this.f70657o.f70635d[i15] = iVarA;
        return iVarA;
    }

    public void v(e eVar) {
    }

    public c w() {
        return this.f70657o;
    }

    public int y(Object obj) {
        i iVarI = ((n5.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f70679f + 0.5f);
        }
        return 0;
    }
}
