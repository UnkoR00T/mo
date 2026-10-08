package n5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends l {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private e[] f131936x1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f131913a1 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f131914b1 = -1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f131915c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f131916d1 = -1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f131917e1 = -1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f131918f1 = -1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private float f131919g1 = 0.5f;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private float f131920h1 = 0.5f;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private float f131921i1 = 0.5f;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private float f131922j1 = 0.5f;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private float f131923k1 = 0.5f;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private float f131924l1 = 0.5f;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f131925m1 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f131926n1 = 0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f131927o1 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f131928p1 = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private int f131929q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f131930r1 = -1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f131931s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private ArrayList<a> f131932t1 = new ArrayList<>();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private e[] f131933u1 = null;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private e[] f131934v1 = null;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private int[] f131935w1 = null;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f131937y1 = 0;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f131938a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f131941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f131942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f131943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f131944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f131945h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f131946i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f131947j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f131948k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f131954q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f131939b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f131940c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f131949l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f131950m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f131951n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f131952o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f131953p = 0;

        a(int i15, d dVar, d dVar2, d dVar3, d dVar4, int i16) {
            this.f131945h = 0;
            this.f131946i = 0;
            this.f131947j = 0;
            this.f131948k = 0;
            this.f131954q = 0;
            this.f131938a = i15;
            this.f131941d = dVar;
            this.f131942e = dVar2;
            this.f131943f = dVar3;
            this.f131944g = dVar4;
            this.f131945h = g.this.C1();
            this.f131946i = g.this.E1();
            this.f131947j = g.this.D1();
            this.f131948k = g.this.B1();
            this.f131954q = i16;
        }

        private void h() {
            this.f131949l = 0;
            this.f131950m = 0;
            this.f131939b = null;
            this.f131940c = 0;
            int i15 = this.f131952o;
            for (int i16 = 0; i16 < i15 && this.f131951n + i16 < g.this.f131937y1; i16++) {
                e eVar = g.this.f131936x1[this.f131951n + i16];
                if (this.f131938a == 0) {
                    int iY = eVar.Y();
                    int i17 = g.this.f131925m1;
                    if (eVar.X() == 8) {
                        i17 = 0;
                    }
                    this.f131949l += iY + i17;
                    int iN2 = g.this.n2(eVar, this.f131954q);
                    if (this.f131939b == null || this.f131940c < iN2) {
                        this.f131939b = eVar;
                        this.f131940c = iN2;
                        this.f131950m = iN2;
                    }
                } else {
                    int iO2 = g.this.o2(eVar, this.f131954q);
                    int iN3 = g.this.n2(eVar, this.f131954q);
                    int i18 = g.this.f131926n1;
                    if (eVar.X() == 8) {
                        i18 = 0;
                    }
                    this.f131950m += iN3 + i18;
                    if (this.f131939b == null || this.f131940c < iO2) {
                        this.f131939b = eVar;
                        this.f131940c = iO2;
                        this.f131949l = iO2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f131938a == 0) {
                int iO2 = g.this.o2(eVar, this.f131954q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f131953p++;
                    iO2 = 0;
                }
                this.f131949l += iO2 + (eVar.X() != 8 ? g.this.f131925m1 : 0);
                int iN2 = g.this.n2(eVar, this.f131954q);
                if (this.f131939b == null || this.f131940c < iN2) {
                    this.f131939b = eVar;
                    this.f131940c = iN2;
                    this.f131950m = iN2;
                }
            } else {
                int iO3 = g.this.o2(eVar, this.f131954q);
                int iN3 = g.this.n2(eVar, this.f131954q);
                if (eVar.V() == e.b.MATCH_CONSTRAINT) {
                    this.f131953p++;
                    iN3 = 0;
                }
                this.f131950m += iN3 + (eVar.X() != 8 ? g.this.f131926n1 : 0);
                if (this.f131939b == null || this.f131940c < iO3) {
                    this.f131939b = eVar;
                    this.f131940c = iO3;
                    this.f131949l = iO3;
                }
            }
            this.f131952o++;
        }

        public void c() {
            this.f131940c = 0;
            this.f131939b = null;
            this.f131949l = 0;
            this.f131950m = 0;
            this.f131951n = 0;
            this.f131952o = 0;
            this.f131953p = 0;
        }

        public void d(boolean z15, int i15, boolean z16) {
            e eVar;
            int i16;
            char c15;
            float f15;
            float f16;
            int i17 = this.f131952o;
            for (int i18 = 0; i18 < i17 && this.f131951n + i18 < g.this.f131937y1; i18++) {
                e eVar2 = g.this.f131936x1[this.f131951n + i18];
                if (eVar2 != null) {
                    eVar2.w0();
                }
            }
            if (i17 == 0 || this.f131939b == null) {
                return;
            }
            boolean z17 = z16 && i15 == 0;
            int i19 = -1;
            int i25 = -1;
            for (int i26 = 0; i26 < i17; i26++) {
                int i27 = z15 ? (i17 - 1) - i26 : i26;
                if (this.f131951n + i27 >= g.this.f131937y1) {
                    break;
                }
                e eVar3 = g.this.f131936x1[this.f131951n + i27];
                if (eVar3 != null && eVar3.X() == 0) {
                    if (i19 == -1) {
                        i19 = i26;
                    }
                    i25 = i26;
                }
            }
            e eVar4 = null;
            if (this.f131938a != 0) {
                e eVar5 = this.f131939b;
                eVar5.Q0(g.this.f131913a1);
                int i28 = this.f131945h;
                if (i15 > 0) {
                    i28 += g.this.f131925m1;
                }
                if (z15) {
                    eVar5.Q.a(this.f131943f, i28);
                    if (z16) {
                        eVar5.O.a(this.f131941d, this.f131947j);
                    }
                    if (i15 > 0) {
                        this.f131943f.f131823d.O.a(eVar5.Q, 0);
                    }
                } else {
                    eVar5.O.a(this.f131941d, i28);
                    if (z16) {
                        eVar5.Q.a(this.f131943f, this.f131947j);
                    }
                    if (i15 > 0) {
                        this.f131941d.f131823d.Q.a(eVar5.O, 0);
                    }
                }
                for (int i29 = 0; i29 < i17 && this.f131951n + i29 < g.this.f131937y1; i29++) {
                    e eVar6 = g.this.f131936x1[this.f131951n + i29];
                    if (eVar6 != null) {
                        if (i29 == 0) {
                            eVar6.k(eVar6.P, this.f131942e, this.f131946i);
                            int i35 = g.this.f131914b1;
                            float f17 = g.this.f131920h1;
                            if (this.f131951n == 0 && g.this.f131916d1 != -1) {
                                i35 = g.this.f131916d1;
                                f17 = g.this.f131922j1;
                            } else if (z16 && g.this.f131918f1 != -1) {
                                i35 = g.this.f131918f1;
                                f17 = g.this.f131924l1;
                            }
                            eVar6.h1(i35);
                            eVar6.g1(f17);
                        }
                        if (i29 == i17 - 1) {
                            eVar6.k(eVar6.R, this.f131944g, this.f131948k);
                        }
                        if (eVar4 != null) {
                            eVar6.P.a(eVar4.R, g.this.f131926n1);
                            if (i29 == i19) {
                                eVar6.P.u(this.f131946i);
                            }
                            eVar4.R.a(eVar6.P, 0);
                            if (i29 == i25 + 1) {
                                eVar4.R.u(this.f131948k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z15) {
                                int i36 = g.this.f131927o1;
                                if (i36 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i36 == 1) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i36 == 2) {
                                    eVar6.O.a(eVar5.O, 0);
                                    eVar6.Q.a(eVar5.Q, 0);
                                }
                            } else {
                                int i37 = g.this.f131927o1;
                                if (i37 == 0) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i37 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i37 == 2) {
                                    if (z17) {
                                        eVar6.O.a(this.f131941d, this.f131945h);
                                        eVar6.Q.a(this.f131943f, this.f131947j);
                                    } else {
                                        eVar6.O.a(eVar5.O, 0);
                                        eVar6.Q.a(eVar5.Q, 0);
                                    }
                                }
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f131939b;
            eVar7.h1(g.this.f131914b1);
            int i38 = this.f131946i;
            if (i15 > 0) {
                i38 += g.this.f131926n1;
            }
            eVar7.P.a(this.f131942e, i38);
            if (z16) {
                eVar7.R.a(this.f131944g, this.f131948k);
            }
            if (i15 > 0) {
                this.f131942e.f131823d.R.a(eVar7.P, 0);
            }
            char c16 = 3;
            if (g.this.f131928p1 != 3 || eVar7.b0()) {
                eVar = eVar7;
                break;
            }
            int i39 = 0;
            while (true) {
                if (i39 < i17) {
                    int i45 = z15 ? (i17 - 1) - i39 : i39;
                    if (this.f131951n + i45 < g.this.f131937y1) {
                        eVar = g.this.f131936x1[this.f131951n + i45];
                        if (eVar.b0()) {
                            break;
                        } else {
                            i39++;
                        }
                    }
                }
                eVar = eVar7;
                break;
            }
            int i46 = 0;
            while (i46 < i17) {
                int i47 = z15 ? (i17 - 1) - i46 : i46;
                if (this.f131951n + i47 >= g.this.f131937y1) {
                    return;
                }
                e eVar8 = g.this.f131936x1[this.f131951n + i47];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c15 = c16;
                } else {
                    if (i46 == 0) {
                        i16 = 1;
                        eVar8.k(eVar8.O, this.f131941d, this.f131945h);
                    } else {
                        i16 = 1;
                    }
                    if (i47 == 0) {
                        int i48 = g.this.f131913a1;
                        float f18 = g.this.f131919g1;
                        if (z15) {
                            f18 = 1.0f - f18;
                        }
                        if (this.f131951n == 0 && g.this.f131915c1 != -1) {
                            i48 = g.this.f131915c1;
                            if (z15) {
                                f16 = g.this.f131921i1;
                                f15 = 1.0f - f16;
                            } else {
                                f15 = g.this.f131921i1;
                            }
                            f18 = f15;
                        } else if (z16 && g.this.f131917e1 != -1) {
                            i48 = g.this.f131917e1;
                            if (z15) {
                                f16 = g.this.f131923k1;
                                f15 = 1.0f - f16;
                            } else {
                                f15 = g.this.f131923k1;
                            }
                            f18 = f15;
                        }
                        eVar8.Q0(i48);
                        eVar8.P0(f18);
                    }
                    if (i46 == i17 - 1) {
                        eVar8.k(eVar8.Q, this.f131943f, this.f131947j);
                    }
                    if (eVar4 != null) {
                        eVar8.O.a(eVar4.Q, g.this.f131925m1);
                        if (i46 == i19) {
                            eVar8.O.u(this.f131945h);
                        }
                        eVar4.Q.a(eVar8.O, 0);
                        if (i46 == i25 + 1) {
                            eVar4.Q.u(this.f131947j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c15 = 3;
                        if (g.this.f131928p1 == 3 && eVar.b0() && eVar8 != eVar && eVar8.b0()) {
                            eVar8.S.a(eVar.S, 0);
                        } else {
                            int i49 = g.this.f131928p1;
                            if (i49 == 0) {
                                eVar8.P.a(eVar7.P, 0);
                            } else if (i49 == i16) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (z17) {
                                eVar8.P.a(this.f131942e, this.f131946i);
                                eVar8.R.a(this.f131944g, this.f131948k);
                            } else {
                                eVar8.P.a(eVar7.P, 0);
                                eVar8.R.a(eVar7.R, 0);
                            }
                        }
                    } else {
                        c15 = 3;
                    }
                }
                i46++;
                c16 = c15;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f131938a == 1 ? this.f131950m - g.this.f131926n1 : this.f131950m;
        }

        public int f() {
            return this.f131938a == 0 ? this.f131949l - g.this.f131925m1 : this.f131949l;
        }

        public void g(int i15) {
            int i16 = this.f131953p;
            if (i16 == 0) {
                return;
            }
            int i17 = this.f131952o;
            int i18 = i15 / i16;
            for (int i19 = 0; i19 < i17 && this.f131951n + i19 < g.this.f131937y1; i19++) {
                e eVar = g.this.f131936x1[this.f131951n + i19];
                if (this.f131938a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f131883w == 0) {
                        g.this.G1(eVar, e.b.FIXED, i18, eVar.V(), eVar.x());
                    }
                } else if (eVar != null && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.f131885x == 0) {
                    int i25 = i18;
                    g.this.G1(eVar, eVar.A(), eVar.Y(), e.b.FIXED, i25);
                    i18 = i25;
                }
            }
            h();
        }

        public void i(int i15) {
            this.f131951n = i15;
        }

        public void j(int i15, d dVar, d dVar2, d dVar3, d dVar4, int i16, int i17, int i18, int i19, int i25) {
            this.f131938a = i15;
            this.f131941d = dVar;
            this.f131942e = dVar2;
            this.f131943f = dVar3;
            this.f131944g = dVar4;
            this.f131945h = i16;
            this.f131946i = i17;
            this.f131947j = i18;
            this.f131948k = i19;
            this.f131954q = i25;
        }
    }

    private void m2(boolean z15) {
        e eVar;
        float f15;
        int i15;
        if (this.f131935w1 == null || this.f131934v1 == null || this.f131933u1 == null) {
            return;
        }
        for (int i16 = 0; i16 < this.f131937y1; i16++) {
            this.f131936x1[i16].w0();
        }
        int[] iArr = this.f131935w1;
        int i17 = iArr[0];
        int i18 = iArr[1];
        float f16 = this.f131919g1;
        e eVar2 = null;
        int i19 = 0;
        while (i19 < i17) {
            if (z15) {
                i15 = (i17 - i19) - 1;
                f15 = 1.0f - this.f131919g1;
            } else {
                f15 = f16;
                i15 = i19;
            }
            e eVar3 = this.f131934v1[i15];
            if (eVar3 != null && eVar3.X() != 8) {
                if (i19 == 0) {
                    eVar3.k(eVar3.O, this.O, C1());
                    eVar3.Q0(this.f131913a1);
                    eVar3.P0(f15);
                }
                if (i19 == i17 - 1) {
                    eVar3.k(eVar3.Q, this.Q, D1());
                }
                if (i19 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.O, eVar2.Q, this.f131925m1);
                    eVar2.k(eVar2.Q, eVar3.O, 0);
                }
                eVar2 = eVar3;
            }
            i19++;
            f16 = f15;
        }
        for (int i25 = 0; i25 < i18; i25++) {
            e eVar4 = this.f131933u1[i25];
            if (eVar4 != null && eVar4.X() != 8) {
                if (i25 == 0) {
                    eVar4.k(eVar4.P, this.P, E1());
                    eVar4.h1(this.f131914b1);
                    eVar4.g1(this.f131920h1);
                }
                if (i25 == i18 - 1) {
                    eVar4.k(eVar4.R, this.R, B1());
                }
                if (i25 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.P, eVar2.R, this.f131926n1);
                    eVar2.k(eVar2.R, eVar4.P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i26 = 0; i26 < i17; i26++) {
            for (int i27 = 0; i27 < i18; i27++) {
                int i28 = (i27 * i17) + i26;
                if (this.f131931s1 == 1) {
                    i28 = (i26 * i18) + i27;
                }
                e[] eVarArr = this.f131936x1;
                if (i28 < eVarArr.length && (eVar = eVarArr[i28]) != null && eVar.X() != 8) {
                    e eVar5 = this.f131934v1[i26];
                    e eVar6 = this.f131933u1[i27];
                    if (eVar != eVar5) {
                        eVar.k(eVar.O, eVar5.O, 0);
                        eVar.k(eVar.Q, eVar5.Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.P, eVar6.P, 0);
                        eVar.k(eVar.R, eVar6.R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n2(e eVar, int i15) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.V() == e.b.MATCH_CONSTRAINT) {
            int i16 = eVar.f131885x;
            if (i16 == 0) {
                return 0;
            }
            if (i16 == 2) {
                int i17 = (int) (eVar.E * i15);
                if (i17 != eVar.x()) {
                    eVar.b1(true);
                    G1(eVar, eVar.A(), eVar.Y(), e.b.FIXED, i17);
                }
                return i17;
            }
            eVar2 = eVar;
            if (i16 == 1) {
                return eVar2.x();
            }
            if (i16 == 3) {
                return (int) ((eVar2.Y() * eVar2.f131846d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o2(e eVar, int i15) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i16 = eVar.f131883w;
            if (i16 == 0) {
                return 0;
            }
            if (i16 == 2) {
                int i17 = (int) (eVar.B * i15);
                if (i17 != eVar.Y()) {
                    eVar.b1(true);
                    G1(eVar, e.b.FIXED, i17, eVar.V(), eVar.x());
                }
                return i17;
            }
            eVar2 = eVar;
            if (i16 == 1) {
                return eVar2.Y();
            }
            if (i16 == 3) {
                return (int) ((eVar2.x() * eVar2.f131846d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.Y();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void p2(n5.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.g.p2(n5.e[], int, int, int, int[]):void");
    }

    private void q2(e[] eVarArr, int i15, int i16, int i17, int[] iArr) {
        int i18;
        g gVar;
        int i19;
        d dVar;
        int i25;
        g gVar2 = this;
        if (i15 == 0) {
            return;
        }
        gVar2.f131932t1.clear();
        int i26 = i17;
        a aVar = gVar2.new a(i16, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i26);
        gVar2.f131932t1.add(aVar);
        if (i16 == 0) {
            i18 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < i15) {
                e eVar = eVarArr[i28];
                int iO2 = gVar2.o2(eVar, i26);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i18++;
                }
                int i29 = i18;
                boolean z15 = (i27 == i26 || (gVar2.f131925m1 + i27) + iO2 > i26) && aVar.f131939b != null;
                if (!z15 && i28 > 0 && (i25 = gVar2.f131930r1) > 0 && i28 % i25 == 0) {
                    z15 = true;
                }
                if (z15) {
                    aVar = gVar2.new a(i16, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i26);
                    aVar.i(i28);
                    gVar2.f131932t1.add(aVar);
                } else {
                    if (i28 > 0) {
                        i27 += gVar2.f131925m1 + iO2;
                    }
                    aVar.b(eVar);
                    i28++;
                    i18 = i29;
                }
                i27 = iO2;
                aVar.b(eVar);
                i28++;
                i18 = i29;
            }
        } else {
            i18 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i36 < i15) {
                e eVar2 = eVarArr[i36];
                int iN2 = gVar2.n2(eVar2, i26);
                if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                    i18++;
                }
                int i37 = i18;
                boolean z16 = (i35 == i26 || (gVar2.f131926n1 + i35) + iN2 > i26) && aVar.f131939b != null;
                if (!z16 && i36 > 0 && (i19 = gVar2.f131930r1) > 0 && i36 % i19 == 0) {
                    z16 = true;
                }
                if (z16) {
                    aVar = gVar2.new a(i16, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i26);
                    gVar = gVar2;
                    aVar.i(i36);
                    gVar.f131932t1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i36 > 0) {
                        i35 += gVar.f131926n1 + iN2;
                    }
                    aVar.b(eVar2);
                    i36++;
                    i26 = i17;
                    i18 = i37;
                    gVar2 = gVar;
                }
                i35 = iN2;
                aVar.b(eVar2);
                i36++;
                i26 = i17;
                i18 = i37;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f131932t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int iC1 = gVar3.C1();
        int iE1 = gVar3.E1();
        int iD1 = gVar3.D1();
        int iB1 = gVar3.B1();
        e.b bVarA = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z17 = bVarA == bVar || gVar3.V() == bVar;
        if (i18 > 0 && z17) {
            for (int i38 = 0; i38 < size; i38++) {
                a aVar2 = gVar3.f131932t1.get(i38);
                if (i16 == 0) {
                    aVar2.g(i17 - aVar2.f());
                } else {
                    aVar2.g(i17 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iB2 = iB1;
        int i39 = 0;
        int iD2 = iD1;
        int i45 = iE1;
        int i46 = iC1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i47 = 0;
        for (int i48 = 0; i48 < size; i48++) {
            a aVar3 = gVar3.f131932t1.get(i48);
            if (i16 == 0) {
                if (i48 < size - 1) {
                    dVar7 = gVar3.f131932t1.get(i48 + 1).f131939b.P;
                    iB2 = 0;
                } else {
                    dVar7 = gVar3.R;
                    iB2 = gVar3.B1();
                }
                d dVar10 = aVar3.f131939b.R;
                int i49 = i47;
                aVar3.j(i16, dVar6, dVar9, dVar8, dVar7, i46, i45, iD2, iB2, i17);
                int iMax = Math.max(i39, aVar3.f());
                int iE = aVar3.e() + i49;
                if (i48 > 0) {
                    iE += gVar3.f131926n1;
                }
                i47 = iE;
                i39 = iMax;
                dVar9 = dVar10;
                i45 = 0;
            } else {
                int i55 = i39;
                int i56 = i47;
                if (i48 < size - 1) {
                    dVar = gVar3.f131932t1.get(i48 + 1).f131939b.O;
                    iD2 = 0;
                } else {
                    dVar = gVar3.Q;
                    iD2 = gVar3.D1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f131939b.Q;
                aVar3.j(i16, dVar6, dVar9, dVar8, dVar7, i46, i45, iD2, iB2, i17);
                int iF = aVar3.f() + i55;
                int iMax2 = Math.max(i56, aVar3.e());
                if (i48 > 0) {
                    iF += gVar3.f131925m1;
                }
                int i57 = iF;
                i47 = iMax2;
                i39 = i57;
                i46 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i39;
        iArr[1] = i47;
    }

    private void r2(e[] eVarArr, int i15, int i16, int i17, int[] iArr) {
        int i18;
        g gVar;
        int i19;
        d dVar;
        int i25;
        g gVar2 = this;
        if (i15 == 0) {
            return;
        }
        gVar2.f131932t1.clear();
        int i26 = i17;
        a aVar = gVar2.new a(i16, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i26);
        gVar2.f131932t1.add(aVar);
        boolean z15 = true;
        if (i16 == 0) {
            int i27 = 0;
            i18 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < i15) {
                i27++;
                e eVar = eVarArr[i29];
                int iO2 = gVar2.o2(eVar, i26);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i18++;
                }
                int i35 = i18;
                boolean z16 = (i28 == i26 || (gVar2.f131925m1 + i28) + iO2 > i26) && aVar.f131939b != null;
                if (!z16 && i29 > 0 && (i25 = gVar2.f131930r1) > 0 && i27 > i25) {
                    z16 = true;
                }
                if (z16) {
                    aVar = gVar2.new a(i16, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i26);
                    aVar.i(i29);
                    gVar2.f131932t1.add(aVar);
                    i27 = 1;
                } else {
                    if (i29 > 0) {
                        i28 += gVar2.f131925m1 + iO2;
                    }
                    aVar.b(eVar);
                    i29++;
                    i18 = i35;
                }
                i28 = iO2;
                aVar.b(eVar);
                i29++;
                i18 = i35;
            }
        } else {
            int i36 = 0;
            i18 = 0;
            int i37 = 0;
            int i38 = 0;
            while (i38 < i15) {
                i36++;
                e eVar2 = eVarArr[i38];
                int iN2 = gVar2.n2(eVar2, i26);
                if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                    i18++;
                }
                int i39 = i18;
                boolean z17 = (i37 == i26 || (gVar2.f131926n1 + i37) + iN2 > i26) && aVar.f131939b != null;
                if (!z17 && i38 > 0 && (i19 = gVar2.f131930r1) > 0 && i36 > i19) {
                    z17 = true;
                }
                if (z17) {
                    aVar = gVar2.new a(i16, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i26);
                    gVar = gVar2;
                    aVar.i(i38);
                    gVar.f131932t1.add(aVar);
                    i36 = 1;
                } else {
                    gVar = gVar2;
                    if (i38 > 0) {
                        i37 += gVar.f131926n1 + iN2;
                    }
                    aVar.b(eVar2);
                    i38++;
                    i26 = i17;
                    i18 = i39;
                    gVar2 = gVar;
                }
                i37 = iN2;
                aVar.b(eVar2);
                i38++;
                i26 = i17;
                i18 = i39;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f131932t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int iC1 = gVar3.C1();
        int iE1 = gVar3.E1();
        int iD1 = gVar3.D1();
        int iB1 = gVar3.B1();
        e.b bVarA = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z18 = bVarA == bVar || gVar3.V() == bVar;
        if (i18 > 0 && z18) {
            for (int i45 = 0; i45 < size; i45++) {
                a aVar2 = gVar3.f131932t1.get(i45);
                if (i16 == 0) {
                    aVar2.g(i17 - aVar2.f());
                } else {
                    aVar2.g(i17 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int iB2 = iB1;
        int i46 = 0;
        int i47 = 0;
        int iD2 = iD1;
        int i48 = iE1;
        int i49 = iC1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i55 = 0;
        while (i47 < size) {
            a aVar3 = gVar3.f131932t1.get(i47);
            if (i16 == 0) {
                if (i47 < size - 1) {
                    dVar7 = gVar3.f131932t1.get(i47 + 1).f131939b.P;
                    iB2 = 0;
                } else {
                    dVar7 = gVar3.R;
                    iB2 = gVar3.B1();
                }
                d dVar10 = aVar3.f131939b.R;
                int i56 = i46;
                aVar3.j(i16, dVar9, dVar6, dVar8, dVar7, i49, i48, iD2, iB2, i17);
                int iMax = Math.max(i55, aVar3.f());
                int iE = aVar3.e() + i56;
                if (i47 > 0) {
                    iE += gVar3.f131926n1;
                }
                i46 = iE;
                i55 = iMax;
                dVar6 = dVar10;
                i48 = 0;
            } else {
                int i57 = i46;
                int i58 = i55;
                if (i47 < size - 1) {
                    dVar = gVar3.f131932t1.get(i47 + 1).f131939b.O;
                    iD2 = 0;
                } else {
                    dVar = gVar3.Q;
                    iD2 = gVar3.D1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f131939b.Q;
                aVar3.j(i16, dVar9, dVar6, dVar8, dVar7, i49, i48, iD2, iB2, i17);
                int iF = aVar3.f() + i58;
                int iMax2 = Math.max(i57, aVar3.e());
                if (i47 > 0) {
                    iF += gVar3.f131925m1;
                }
                int i59 = iF;
                i46 = iMax2;
                i55 = i59;
                i49 = 0;
                dVar9 = dVar11;
            }
            i47++;
            z15 = z15;
        }
        iArr[0] = i55;
        iArr[z15 ? 1 : 0] = i46;
    }

    private void s2(e[] eVarArr, int i15, int i16, int i17, int[] iArr) {
        a aVar;
        if (i15 == 0) {
            return;
        }
        if (this.f131932t1.size() == 0) {
            aVar = new a(i16, this.O, this.P, this.Q, this.R, i17);
            this.f131932t1.add(aVar);
        } else {
            a aVar2 = this.f131932t1.get(0);
            aVar2.c();
            aVar2.j(i16, this.O, this.P, this.Q, this.R, C1(), E1(), D1(), B1(), i17);
            aVar = aVar2;
        }
        for (int i18 = 0; i18 < i15; i18++) {
            aVar.b(eVarArr[i18]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i15) {
        this.f131913a1 = i15;
    }

    public void B2(float f15) {
        this.f131923k1 = f15;
    }

    public void C2(int i15) {
        this.f131917e1 = i15;
    }

    public void D2(float f15) {
        this.f131924l1 = f15;
    }

    public void E2(int i15) {
        this.f131918f1 = i15;
    }

    @Override // n5.l
    public void F1(int i15, int i16, int i17, int i18) {
        int i19;
        e[] eVarArr;
        if (this.M0 > 0 && !H1()) {
            K1(0, 0);
            J1(false);
            return;
        }
        int iC1 = C1();
        int iD1 = D1();
        int iE1 = E1();
        int iB1 = B1();
        int[] iArr = new int[2];
        int i25 = (i16 - iC1) - iD1;
        int i26 = this.f131931s1;
        if (i26 == 1) {
            i25 = (i18 - iE1) - iB1;
        }
        int i27 = i25;
        if (i26 == 0) {
            if (this.f131913a1 == -1) {
                this.f131913a1 = 0;
            }
            if (this.f131914b1 == -1) {
                this.f131914b1 = 0;
            }
        } else {
            if (this.f131913a1 == -1) {
                this.f131913a1 = 0;
            }
            if (this.f131914b1 == -1) {
                this.f131914b1 = 0;
            }
        }
        e[] eVarArr2 = this.L0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i19 = this.M0;
            if (i28 >= i19) {
                break;
            }
            if (this.L0[i28].X() == 8) {
                i29++;
            }
            i28++;
        }
        if (i29 > 0) {
            e[] eVarArr3 = new e[i19 - i29];
            int i35 = 0;
            i19 = 0;
            while (i35 < this.M0) {
                e eVar = this.L0[i35];
                e[] eVarArr4 = eVarArr3;
                if (eVar.X() != 8) {
                    eVarArr4[i19] = eVar;
                    i19++;
                }
                i35++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i36 = i19;
        this.f131936x1 = eVarArr;
        this.f131937y1 = i36;
        int i37 = this.f131929q1;
        if (i37 == 0) {
            s2(eVarArr, i36, this.f131931s1, i27, iArr);
        } else if (i37 == 1) {
            q2(eVarArr, i36, this.f131931s1, i27, iArr);
        } else if (i37 == 2) {
            p2(eVarArr, i36, this.f131931s1, i27, iArr);
        } else if (i37 == 3) {
            r2(eVarArr, i36, this.f131931s1, i27, iArr);
        }
        int iMin = iArr[0] + iC1 + iD1;
        int iMin2 = iArr[1] + iE1 + iB1;
        if (i15 == 1073741824) {
            iMin = i16;
        } else if (i15 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i16);
        } else if (i15 != 0) {
            iMin = 0;
        }
        if (i17 == 1073741824) {
            iMin2 = i18;
        } else if (i17 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i18);
        } else if (i17 != 0) {
            iMin2 = 0;
        }
        K1(iMin, iMin2);
        n1(iMin);
        O0(iMin2);
        J1(this.M0 > 0);
    }

    public void F2(int i15) {
        this.f131930r1 = i15;
    }

    public void G2(int i15) {
        this.f131931s1 = i15;
    }

    public void H2(int i15) {
        this.f131928p1 = i15;
    }

    public void I2(float f15) {
        this.f131920h1 = f15;
    }

    public void J2(int i15) {
        this.f131926n1 = i15;
    }

    public void K2(int i15) {
        this.f131914b1 = i15;
    }

    public void L2(int i15) {
        this.f131929q1 = i15;
    }

    @Override // n5.e
    public void g(g5.d dVar, boolean z15) {
        super.g(dVar, z15);
        boolean z16 = L() != null && ((f) L()).U1();
        int i15 = this.f131929q1;
        if (i15 != 0) {
            if (i15 == 1) {
                int size = this.f131932t1.size();
                int i16 = 0;
                while (i16 < size) {
                    this.f131932t1.get(i16).d(z16, i16, i16 == size + (-1));
                    i16++;
                }
            } else if (i15 == 2) {
                m2(z16);
            } else if (i15 == 3) {
                int size2 = this.f131932t1.size();
                int i17 = 0;
                while (i17 < size2) {
                    this.f131932t1.get(i17).d(z16, i17, i17 == size2 + (-1));
                    i17++;
                }
            }
        } else if (this.f131932t1.size() > 0) {
            this.f131932t1.get(0).d(z16, 0, true);
        }
        J1(false);
    }

    public void t2(float f15) {
        this.f131921i1 = f15;
    }

    public void u2(int i15) {
        this.f131915c1 = i15;
    }

    public void v2(float f15) {
        this.f131922j1 = f15;
    }

    public void w2(int i15) {
        this.f131916d1 = i15;
    }

    public void x2(int i15) {
        this.f131927o1 = i15;
    }

    public void y2(float f15) {
        this.f131919g1 = f15;
    }

    public void z2(int i15) {
        this.f131925m1 = i15;
    }
}
