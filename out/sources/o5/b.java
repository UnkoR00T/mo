package o5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<n5.e> f142362a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f142363b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n5.f f142364c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f142365k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f142366l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f142367m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n5.e.b f142368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n5.e.b f142369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f142372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f142373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f142374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f142375h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f142376i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f142377j;
    }

    /* JADX INFO: renamed from: o5.b$b, reason: collision with other inner class name */
    public interface InterfaceC3522b {
        void a();

        void b(n5.e eVar, a aVar);
    }

    public b(n5.f fVar) {
        this.f142364c = fVar;
    }

    private boolean a(InterfaceC3522b interfaceC3522b, n5.e eVar, int i15) {
        this.f142363b.f142368a = eVar.A();
        this.f142363b.f142369b = eVar.V();
        this.f142363b.f142370c = eVar.Y();
        this.f142363b.f142371d = eVar.x();
        a aVar = this.f142363b;
        aVar.f142376i = false;
        aVar.f142377j = i15;
        n5.e.b bVar = aVar.f142368a;
        n5.e.b bVar2 = n5.e.b.MATCH_CONSTRAINT;
        boolean z15 = bVar == bVar2;
        boolean z16 = aVar.f142369b == bVar2;
        boolean z17 = z15 && eVar.f131846d0 > 0.0f;
        boolean z18 = z16 && eVar.f131846d0 > 0.0f;
        if (z17 && eVar.f131887y[0] == 4) {
            aVar.f142368a = n5.e.b.FIXED;
        }
        if (z18 && eVar.f131887y[1] == 4) {
            aVar.f142369b = n5.e.b.FIXED;
        }
        interfaceC3522b.b(eVar, aVar);
        eVar.n1(this.f142363b.f142372e);
        eVar.O0(this.f142363b.f142373f);
        eVar.N0(this.f142363b.f142375h);
        eVar.D0(this.f142363b.f142374g);
        a aVar2 = this.f142363b;
        aVar2.f142377j = a.f142365k;
        return aVar2.f142376i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(n5.f fVar) {
        boolean z15;
        l lVar;
        n nVar;
        int size = fVar.L0.size();
        boolean zY1 = fVar.Y1(64);
        InterfaceC3522b interfaceC3522bN1 = fVar.N1();
        for (int i15 = 0; i15 < size; i15++) {
            n5.e eVar = fVar.L0.get(i15);
            if (!(eVar instanceof n5.h) && !(eVar instanceof n5.a) && !eVar.n0() && (!zY1 || (lVar = eVar.f131847e) == null || (nVar = eVar.f131849f) == null || !lVar.f142445e.f142398j || !nVar.f142445e.f142398j)) {
                n5.e.b bVarU = eVar.u(0);
                n5.e.b bVarU2 = eVar.u(1);
                n5.e.b bVar = n5.e.b.MATCH_CONSTRAINT;
                boolean z16 = bVarU == bVar && eVar.f131883w != 1 && bVarU2 == bVar && eVar.f131885x != 1;
                if (!z16 && fVar.Y1(1) && !(eVar instanceof n5.l)) {
                    if (bVarU == bVar && eVar.f131883w == 0 && bVarU2 != bVar && !eVar.k0()) {
                        z16 = true;
                    }
                    if (bVarU2 == bVar && eVar.f131885x == 0 && bVarU != bVar && !eVar.k0()) {
                        z16 = true;
                    }
                    z15 = (!(bVarU == bVar || bVarU2 == bVar) || eVar.f131846d0 <= 0.0f) ? z16 : true;
                }
                if (!z15) {
                    a(interfaceC3522bN1, eVar, a.f142365k);
                }
            }
        }
        interfaceC3522bN1.a();
    }

    private void c(n5.f fVar, String str, int i15, int i16, int i17) {
        fVar.getClass();
        int iJ = fVar.J();
        int I = fVar.I();
        fVar.d1(0);
        fVar.c1(0);
        fVar.n1(i16);
        fVar.O0(i17);
        fVar.d1(iJ);
        fVar.c1(I);
        this.f142364c.c2(i15);
        this.f142364c.w1();
    }

    public long d(n5.f fVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
        boolean zL1;
        int i29;
        int i35;
        int i36;
        boolean z15;
        int i37;
        boolean z16;
        b bVar = this;
        InterfaceC3522b interfaceC3522bN1 = fVar.N1();
        int size = fVar.L0.size();
        int iY = fVar.Y();
        int iX = fVar.x();
        boolean zB = n5.k.b(i15, 128);
        boolean z17 = zB || n5.k.b(i15, 64);
        if (z17) {
            for (int i38 = 0; i38 < size; i38++) {
                n5.e eVar = fVar.L0.get(i38);
                n5.e.b bVarA = eVar.A();
                n5.e.b bVar2 = n5.e.b.MATCH_CONSTRAINT;
                boolean z18 = (bVarA == bVar2) && (eVar.V() == bVar2) && eVar.v() > 0.0f;
                if ((eVar.k0() && z18) || ((eVar.m0() && z18) || (eVar instanceof n5.l) || eVar.k0() || eVar.m0())) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            boolean z19 = g5.d.f70636s;
        }
        boolean z25 = z17 & ((i18 == 1073741824 && i25 == 1073741824) || zB);
        int i39 = 2;
        if (z25) {
            int iMin = Math.min(fVar.H(), i19);
            int iMin2 = Math.min(fVar.G(), i26);
            if (i18 == 1073741824 && fVar.Y() != iMin) {
                fVar.n1(iMin);
                fVar.R1();
            }
            if (i25 == 1073741824 && fVar.x() != iMin2) {
                fVar.O0(iMin2);
                fVar.R1();
            }
            if (i18 == 1073741824 && i25 == 1073741824) {
                zL1 = fVar.J1(zB);
                i29 = 2;
            } else {
                boolean zK1 = fVar.K1(zB);
                if (i18 == 1073741824) {
                    zK1 &= fVar.L1(zB, 0);
                    i29 = 1;
                } else {
                    i29 = 0;
                }
                if (i25 == 1073741824) {
                    zL1 = fVar.L1(zB, 1) & zK1;
                    i29++;
                } else {
                    zL1 = zK1;
                }
            }
            if (zL1) {
                fVar.s1(i18 == 1073741824, i25 == 1073741824);
            }
        } else {
            zL1 = false;
            i29 = 0;
        }
        if (zL1 && i29 == 2) {
            return 0L;
        }
        int iO1 = fVar.O1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f142362a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, iY, iX);
            i35 = iY;
            i36 = iX;
        } else {
            i35 = iY;
            i36 = iX;
        }
        if (size2 > 0) {
            n5.e.b bVarA2 = fVar.A();
            n5.e.b bVar3 = n5.e.b.WRAP_CONTENT;
            boolean z26 = bVarA2 == bVar3;
            boolean z27 = fVar.V() == bVar3;
            int iMax = Math.max(fVar.Y(), bVar.f142364c.J());
            int iMax2 = Math.max(fVar.x(), bVar.f142364c.I());
            int i45 = 0;
            boolean zI1 = false;
            while (i45 < size2) {
                n5.e eVar2 = bVar.f142362a.get(i45);
                if (eVar2 instanceof n5.l) {
                    int iY2 = eVar2.Y();
                    int iX2 = eVar2.x();
                    boolean zA = bVar.a(interfaceC3522bN1, eVar2, a.f142366l) | zI1;
                    int iY3 = eVar2.Y();
                    int iX3 = eVar2.x();
                    if (iY3 != iY2) {
                        eVar2.n1(iY3);
                        if (z26 && eVar2.N() > iMax) {
                            iMax = Math.max(iMax, eVar2.N() + eVar2.o(n5.d.a.RIGHT).f());
                        }
                        z16 = true;
                    } else {
                        z16 = zA;
                    }
                    if (iX3 != iX2) {
                        eVar2.O0(iX3);
                        if (z27 && eVar2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.r() + eVar2.o(n5.d.a.BOTTOM).f());
                        }
                        z16 = true;
                    }
                    zI1 = z16 | ((n5.l) eVar2).I1();
                }
                i45++;
                i35 = i35;
                i39 = 2;
            }
            int i46 = i35;
            int i47 = i39;
            int i48 = 0;
            while (i48 < i47) {
                int i49 = 0;
                while (i49 < size2) {
                    n5.e eVar3 = bVar.f142362a.get(i49);
                    if (((eVar3 instanceof n5.i) && !(eVar3 instanceof n5.l)) || (eVar3 instanceof n5.h) || eVar3.X() == 8 || ((z25 && eVar3.f131847e.f142445e.f142398j && eVar3.f131849f.f142445e.f142398j) || (eVar3 instanceof n5.l))) {
                        z15 = z25;
                        i37 = size2;
                    } else {
                        int iY4 = eVar3.Y();
                        int iX4 = eVar3.x();
                        z15 = z25;
                        int iP = eVar3.p();
                        int i55 = a.f142366l;
                        i37 = size2;
                        if (i48 == 1) {
                            i55 = a.f142367m;
                        }
                        boolean zA2 = bVar.a(interfaceC3522bN1, eVar3, i55) | zI1;
                        int iY5 = eVar3.Y();
                        int iX5 = eVar3.x();
                        if (iY5 != iY4) {
                            eVar3.n1(iY5);
                            if (z26 && eVar3.N() > iMax) {
                                iMax = Math.max(iMax, eVar3.N() + eVar3.o(n5.d.a.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iX5 != iX4) {
                            eVar3.O0(iX5);
                            if (z27 && eVar3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.r() + eVar3.o(n5.d.a.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zI1 = (!eVar3.b0() || iP == eVar3.p()) ? zA2 : true;
                    }
                    i49++;
                    bVar = this;
                    size2 = i37;
                    z25 = z15;
                }
                boolean z28 = z25;
                int i56 = size2;
                if (!zI1) {
                    break;
                }
                i48++;
                c(fVar, "intermediate pass", i48, i46, i36);
                bVar = this;
                size2 = i56;
                z25 = z28;
                i47 = 2;
                zI1 = false;
            }
        }
        fVar.b2(iO1);
        return 0L;
    }

    public void e(n5.f fVar) {
        this.f142362a.clear();
        int size = fVar.L0.size();
        for (int i15 = 0; i15 < size; i15++) {
            n5.e eVar = fVar.L0.get(i15);
            n5.e.b bVarA = eVar.A();
            n5.e.b bVar = n5.e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || eVar.V() == bVar) {
                this.f142362a.add(eVar);
            }
        }
        fVar.R1();
    }
}
