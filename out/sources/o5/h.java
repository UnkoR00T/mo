package o5;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f142411a = new b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f142412b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f142413c = 0;

    private static boolean a(int i15, n5.e eVar) {
        n5.e.b bVar;
        n5.e.b bVar2;
        n5.e.b bVarA = eVar.A();
        n5.e.b bVarV = eVar.V();
        n5.f fVar = eVar.L() != null ? (n5.f) eVar.L() : null;
        if (fVar != null) {
            fVar.A();
            n5.e.b bVar3 = n5.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.V();
            n5.e.b bVar4 = n5.e.b.FIXED;
        }
        n5.e.b bVar5 = n5.e.b.FIXED;
        boolean z15 = bVarA == bVar5 || eVar.p0() || bVarA == n5.e.b.WRAP_CONTENT || (bVarA == (bVar2 = n5.e.b.MATCH_CONSTRAINT) && eVar.f131883w == 0 && eVar.f131846d0 == 0.0f && eVar.c0(0)) || (bVarA == bVar2 && eVar.f131883w == 1 && eVar.f0(0, eVar.Y()));
        boolean z16 = bVarV == bVar5 || eVar.q0() || bVarV == n5.e.b.WRAP_CONTENT || (bVarV == (bVar = n5.e.b.MATCH_CONSTRAINT) && eVar.f131885x == 0 && eVar.f131846d0 == 0.0f && eVar.c0(1)) || (bVarV == bVar && eVar.f131885x == 1 && eVar.f0(1, eVar.x()));
        if (eVar.f131846d0 <= 0.0f || !(z15 || z16)) {
            return z15 && z16;
        }
        return true;
    }

    private static void b(int i15, n5.e eVar, b.InterfaceC3522b interfaceC3522b, boolean z15) {
        n5.d dVar;
        n5.d dVar2;
        n5.d dVar3;
        n5.d dVar4;
        if (eVar.i0()) {
            return;
        }
        boolean z16 = true;
        f142412b++;
        if (!(eVar instanceof n5.f) && eVar.o0()) {
            int i16 = i15 + 1;
            if (a(i16, eVar)) {
                n5.f.X1(i16, eVar, interfaceC3522b, new b.a(), b.a.f142365k);
            }
        }
        n5.d dVarO = eVar.o(n5.d.a.LEFT);
        n5.d dVarO2 = eVar.o(n5.d.a.RIGHT);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<n5.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                n5.d next = it.next();
                n5.e eVar2 = next.f131823d;
                int i17 = i15 + 1;
                boolean zA = a(i17, eVar2);
                if (eVar2.o0() && zA) {
                    n5.f.X1(i17, eVar2, interfaceC3522b, new b.a(), b.a.f142365k);
                }
                boolean z17 = ((next == eVar2.O && (dVar4 = eVar2.Q.f131825f) != null && dVar4.n()) || (next == eVar2.Q && (dVar3 = eVar2.O.f131825f) != null && dVar3.n())) ? z16 : false;
                n5.e.b bVarA = eVar2.A();
                n5.e.b bVar = n5.e.b.MATCH_CONSTRAINT;
                if (bVarA != bVar || zA) {
                    if (!eVar2.o0()) {
                        n5.d dVar5 = eVar2.O;
                        if (next == dVar5 && eVar2.Q.f131825f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.I0(iF, eVar2.Y() + iF);
                            b(i17, eVar2, interfaceC3522b, z15);
                        } else {
                            n5.d dVar6 = eVar2.Q;
                            if (next == dVar6 && dVar5.f131825f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.I0(iF2 - eVar2.Y(), iF2);
                                b(i17, eVar2, interfaceC3522b, z15);
                            } else if (z17 && !eVar2.k0()) {
                                d(i17, interfaceC3522b, eVar2, z15);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.A >= 0 && eVar2.f131889z >= 0 && ((eVar2.X() == 8 || (eVar2.f131883w == 0 && eVar2.v() == 0.0f)) && !eVar2.k0() && !eVar2.n0() && z17 && !eVar2.k0())) {
                    e(i17, eVar, interfaceC3522b, eVar2, z15);
                }
                z16 = z16;
            }
        }
        boolean z18 = z16;
        if (eVar instanceof n5.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<n5.d> it4 = dVarO2.d().iterator();
            while (it4.hasNext()) {
                n5.d next2 = it4.next();
                n5.e eVar3 = next2.f131823d;
                int i18 = i15 + 1;
                boolean zA2 = a(i18, eVar3);
                if (eVar3.o0() && zA2) {
                    n5.f.X1(i18, eVar3, interfaceC3522b, new b.a(), b.a.f142365k);
                }
                boolean z19 = ((next2 == eVar3.O && (dVar2 = eVar3.Q.f131825f) != null && dVar2.n()) || (next2 == eVar3.Q && (dVar = eVar3.O.f131825f) != null && dVar.n())) ? z18 : false;
                n5.e.b bVarA2 = eVar3.A();
                n5.e.b bVar2 = n5.e.b.MATCH_CONSTRAINT;
                if (bVarA2 != bVar2 || zA2) {
                    if (!eVar3.o0()) {
                        n5.d dVar7 = eVar3.O;
                        if (next2 == dVar7 && eVar3.Q.f131825f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.I0(iF3, eVar3.Y() + iF3);
                            b(i18, eVar3, interfaceC3522b, z15);
                        } else {
                            n5.d dVar8 = eVar3.Q;
                            if (next2 == dVar8 && dVar7.f131825f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.I0(iF4 - eVar3.Y(), iF4);
                                b(i18, eVar3, interfaceC3522b, z15);
                            } else if (z19 && !eVar3.k0()) {
                                d(i18, interfaceC3522b, eVar3, z15);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.A >= 0 && eVar3.f131889z >= 0 && (eVar3.X() == 8 || (eVar3.f131883w == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.n0() && z19 && !eVar3.k0()) {
                        e(i18, eVar, interfaceC3522b, eVar3, z15);
                    }
                }
            }
        }
        eVar.s0();
    }

    private static void c(int i15, n5.a aVar, b.InterfaceC3522b interfaceC3522b, int i16, boolean z15) {
        if (aVar.w1()) {
            if (i16 == 0) {
                b(i15 + 1, aVar, interfaceC3522b, z15);
            } else {
                i(i15 + 1, aVar, interfaceC3522b);
            }
        }
    }

    private static void d(int i15, b.InterfaceC3522b interfaceC3522b, n5.e eVar, boolean z15) {
        float fY = eVar.y();
        int iE = eVar.O.f131825f.e();
        int iE2 = eVar.Q.f131825f.e();
        int iF = eVar.O.f() + iE;
        int iF2 = iE2 - eVar.Q.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iY = eVar.Y();
        int i16 = (iE2 - iE) - iY;
        if (iE > iE2) {
            i16 = (iE - iE2) - iY;
        }
        int i17 = ((int) (i16 > 0 ? (fY * i16) + 0.5f : fY * i16)) + iE;
        int i18 = i17 + iY;
        if (iE > iE2) {
            i18 = i17 - iY;
        }
        eVar.I0(i17, i18);
        b(i15 + 1, eVar, interfaceC3522b, z15);
    }

    private static void e(int i15, n5.e eVar, b.InterfaceC3522b interfaceC3522b, n5.e eVar2, boolean z15) {
        float fY = eVar2.y();
        int iE = eVar2.O.f131825f.e() + eVar2.O.f();
        int iE2 = eVar2.Q.f131825f.e() - eVar2.Q.f();
        if (iE2 >= iE) {
            int iY = eVar2.Y();
            if (eVar2.X() != 8) {
                int i16 = eVar2.f131883w;
                if (i16 == 2) {
                    iY = (int) (eVar2.y() * 0.5f * (eVar instanceof n5.f ? eVar.Y() : eVar.L().Y()));
                } else if (i16 == 0) {
                    iY = iE2 - iE;
                }
                iY = Math.max(eVar2.f131889z, iY);
                int i17 = eVar2.A;
                if (i17 > 0) {
                    iY = Math.min(i17, iY);
                }
            }
            int i18 = iE + ((int) ((fY * ((iE2 - iE) - iY)) + 0.5f));
            eVar2.I0(i18, iY + i18);
            b(i15 + 1, eVar2, interfaceC3522b, z15);
        }
    }

    private static void f(int i15, b.InterfaceC3522b interfaceC3522b, n5.e eVar) {
        float fT = eVar.T();
        int iE = eVar.P.f131825f.e();
        int iE2 = eVar.R.f131825f.e();
        int iF = eVar.P.f() + iE;
        int iF2 = iE2 - eVar.R.f();
        if (iE == iE2) {
            fT = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = eVar.x();
        int i16 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i16 = (iE - iE2) - iX;
        }
        int i17 = (int) (i16 > 0 ? (fT * i16) + 0.5f : fT * i16);
        int i18 = iE + i17;
        int i19 = i18 + iX;
        if (iE > iE2) {
            i18 = iE - i17;
            i19 = i18 - iX;
        }
        eVar.L0(i18, i19);
        i(i15 + 1, eVar, interfaceC3522b);
    }

    private static void g(int i15, n5.e eVar, b.InterfaceC3522b interfaceC3522b, n5.e eVar2) {
        float fT = eVar2.T();
        int iE = eVar2.P.f131825f.e() + eVar2.P.f();
        int iE2 = eVar2.R.f131825f.e() - eVar2.R.f();
        if (iE2 >= iE) {
            int iX = eVar2.x();
            if (eVar2.X() != 8) {
                int i16 = eVar2.f131885x;
                if (i16 == 2) {
                    iX = (int) (fT * 0.5f * (eVar instanceof n5.f ? eVar.x() : eVar.L().x()));
                } else if (i16 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(eVar2.C, iX);
                int i17 = eVar2.D;
                if (i17 > 0) {
                    iX = Math.min(i17, iX);
                }
            }
            int i18 = iE + ((int) ((fT * ((iE2 - iE) - iX)) + 0.5f));
            eVar2.L0(i18, iX + i18);
            i(i15 + 1, eVar2, interfaceC3522b);
        }
    }

    public static void h(n5.f fVar, b.InterfaceC3522b interfaceC3522b) {
        n5.e.b bVarA = fVar.A();
        n5.e.b bVarV = fVar.V();
        f142412b = 0;
        f142413c = 0;
        fVar.x0();
        ArrayList<n5.e> arrayListV1 = fVar.v1();
        int size = arrayListV1.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayListV1.get(i15).x0();
        }
        boolean zU1 = fVar.U1();
        if (bVarA == n5.e.b.FIXED) {
            fVar.I0(0, fVar.Y());
        } else {
            fVar.J0(0);
        }
        boolean z15 = false;
        boolean z16 = false;
        for (int i16 = 0; i16 < size; i16++) {
            n5.e eVar = arrayListV1.get(i16);
            if (eVar instanceof n5.h) {
                n5.h hVar = (n5.h) eVar;
                if (hVar.v1() == 1) {
                    if (hVar.w1() != -1) {
                        hVar.z1(hVar.w1());
                    } else if (hVar.x1() != -1 && fVar.p0()) {
                        hVar.z1(fVar.Y() - hVar.x1());
                    } else if (fVar.p0()) {
                        hVar.z1((int) ((hVar.y1() * fVar.Y()) + 0.5f));
                    }
                    z15 = true;
                }
            } else if ((eVar instanceof n5.a) && ((n5.a) eVar).A1() == 0) {
                z16 = true;
            }
        }
        if (z15) {
            for (int i17 = 0; i17 < size; i17++) {
                n5.e eVar2 = arrayListV1.get(i17);
                if (eVar2 instanceof n5.h) {
                    n5.h hVar2 = (n5.h) eVar2;
                    if (hVar2.v1() == 1) {
                        b(0, hVar2, interfaceC3522b, zU1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC3522b, zU1);
        if (z16) {
            for (int i18 = 0; i18 < size; i18++) {
                n5.e eVar3 = arrayListV1.get(i18);
                if (eVar3 instanceof n5.a) {
                    n5.a aVar = (n5.a) eVar3;
                    if (aVar.A1() == 0) {
                        c(0, aVar, interfaceC3522b, 0, zU1);
                    }
                }
            }
        }
        if (bVarV == n5.e.b.FIXED) {
            fVar.L0(0, fVar.x());
        } else {
            fVar.K0(0);
        }
        boolean z17 = false;
        boolean z18 = false;
        for (int i19 = 0; i19 < size; i19++) {
            n5.e eVar4 = arrayListV1.get(i19);
            if (eVar4 instanceof n5.h) {
                n5.h hVar3 = (n5.h) eVar4;
                if (hVar3.v1() == 0) {
                    if (hVar3.w1() != -1) {
                        hVar3.z1(hVar3.w1());
                    } else if (hVar3.x1() != -1 && fVar.q0()) {
                        hVar3.z1(fVar.x() - hVar3.x1());
                    } else if (fVar.q0()) {
                        hVar3.z1((int) ((hVar3.y1() * fVar.x()) + 0.5f));
                    }
                    z17 = true;
                }
            } else if ((eVar4 instanceof n5.a) && ((n5.a) eVar4).A1() == 1) {
                z18 = true;
            }
        }
        if (z17) {
            for (int i25 = 0; i25 < size; i25++) {
                n5.e eVar5 = arrayListV1.get(i25);
                if (eVar5 instanceof n5.h) {
                    n5.h hVar4 = (n5.h) eVar5;
                    if (hVar4.v1() == 0) {
                        i(1, hVar4, interfaceC3522b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC3522b);
        if (z18) {
            for (int i26 = 0; i26 < size; i26++) {
                n5.e eVar6 = arrayListV1.get(i26);
                if (eVar6 instanceof n5.a) {
                    n5.a aVar2 = (n5.a) eVar6;
                    if (aVar2.A1() == 1) {
                        c(0, aVar2, interfaceC3522b, 1, zU1);
                    }
                }
            }
        }
        for (int i27 = 0; i27 < size; i27++) {
            n5.e eVar7 = arrayListV1.get(i27);
            if (eVar7.o0() && a(0, eVar7)) {
                n5.f.X1(0, eVar7, interfaceC3522b, f142411a, b.a.f142365k);
                if (!(eVar7 instanceof n5.h)) {
                    b(0, eVar7, interfaceC3522b, zU1);
                    i(0, eVar7, interfaceC3522b);
                } else if (((n5.h) eVar7).v1() == 0) {
                    i(0, eVar7, interfaceC3522b);
                } else {
                    b(0, eVar7, interfaceC3522b, zU1);
                }
            }
        }
    }

    private static void i(int i15, n5.e eVar, b.InterfaceC3522b interfaceC3522b) {
        n5.d dVar;
        n5.d dVar2;
        n5.d dVar3;
        n5.d dVar4;
        if (eVar.r0()) {
            return;
        }
        boolean z15 = true;
        f142413c++;
        if (!(eVar instanceof n5.f) && eVar.o0()) {
            int i16 = i15 + 1;
            if (a(i16, eVar)) {
                n5.f.X1(i16, eVar, interfaceC3522b, new b.a(), b.a.f142365k);
            }
        }
        n5.d dVarO = eVar.o(n5.d.a.TOP);
        n5.d dVarO2 = eVar.o(n5.d.a.BOTTOM);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<n5.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                n5.d next = it.next();
                n5.e eVar2 = next.f131823d;
                int i17 = i15 + 1;
                boolean zA = a(i17, eVar2);
                if (eVar2.o0() && zA) {
                    n5.f.X1(i17, eVar2, interfaceC3522b, new b.a(), b.a.f142365k);
                }
                boolean z16 = ((next == eVar2.P && (dVar4 = eVar2.R.f131825f) != null && dVar4.n()) || (next == eVar2.R && (dVar3 = eVar2.P.f131825f) != null && dVar3.n())) ? z15 : false;
                n5.e.b bVarV = eVar2.V();
                boolean z17 = z15;
                n5.e.b bVar = n5.e.b.MATCH_CONSTRAINT;
                if (bVarV != bVar || zA) {
                    if (!eVar2.o0()) {
                        n5.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f131825f == null) {
                            int iF = dVar5.f() + iE;
                            eVar2.L0(iF, eVar2.x() + iF);
                            i(i17, eVar2, interfaceC3522b);
                        } else {
                            n5.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f131825f == null) {
                                int iF2 = iE - dVar6.f();
                                eVar2.L0(iF2 - eVar2.x(), iF2);
                                i(i17, eVar2, interfaceC3522b);
                            } else if (z16 && !eVar2.m0()) {
                                f(i17, interfaceC3522b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.V() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.X() == 8 || (eVar2.f131885x == 0 && eVar2.v() == 0.0f)) && !eVar2.m0() && !eVar2.n0() && z16 && !eVar2.m0())) {
                    g(i17, eVar, interfaceC3522b, eVar2);
                }
                z15 = z17;
            }
        }
        boolean z18 = z15;
        if (eVar instanceof n5.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<n5.d> it4 = dVarO2.d().iterator();
            while (it4.hasNext()) {
                n5.d next2 = it4.next();
                n5.e eVar3 = next2.f131823d;
                int i18 = i15 + 1;
                boolean zA2 = a(i18, eVar3);
                if (eVar3.o0() && zA2) {
                    n5.f.X1(i18, eVar3, interfaceC3522b, new b.a(), b.a.f142365k);
                }
                boolean z19 = ((next2 == eVar3.P && (dVar2 = eVar3.R.f131825f) != null && dVar2.n()) || (next2 == eVar3.R && (dVar = eVar3.P.f131825f) != null && dVar.n())) ? z18 : false;
                n5.e.b bVarV2 = eVar3.V();
                n5.e.b bVar2 = n5.e.b.MATCH_CONSTRAINT;
                if (bVarV2 != bVar2 || zA2) {
                    if (!eVar3.o0()) {
                        n5.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f131825f == null) {
                            int iF3 = dVar7.f() + iE2;
                            eVar3.L0(iF3, eVar3.x() + iF3);
                            i(i18, eVar3, interfaceC3522b);
                        } else {
                            n5.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f131825f == null) {
                                int iF4 = iE2 - dVar8.f();
                                eVar3.L0(iF4 - eVar3.x(), iF4);
                                i(i18, eVar3, interfaceC3522b);
                            } else if (z19 && !eVar3.m0()) {
                                f(i18, interfaceC3522b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.V() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.X() == 8 || (eVar3.f131885x == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.m0() && !eVar3.n0() && z19 && !eVar3.m0()) {
                        g(i18, eVar, interfaceC3522b, eVar3);
                    }
                }
            }
        }
        n5.d dVarO3 = eVar.o(n5.d.a.BASELINE);
        if (dVarO3.d() != null && dVarO3.n()) {
            int iE3 = dVarO3.e();
            for (n5.d dVar9 : dVarO3.d()) {
                n5.e eVar4 = dVar9.f131823d;
                int i19 = i15 + 1;
                boolean zA3 = a(i19, eVar4);
                if (eVar4.o0() && zA3) {
                    n5.f.X1(i19, eVar4, interfaceC3522b, new b.a(), b.a.f142365k);
                }
                if (eVar4.V() != n5.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.o0() && dVar9 == eVar4.S) {
                        eVar4.H0(dVar9.f() + iE3);
                        i(i19, eVar4, interfaceC3522b);
                    }
                }
            }
        }
        eVar.t0();
    }
}
