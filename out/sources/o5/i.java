package o5;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(n5.e eVar, int i15, ArrayList<o> arrayList, o oVar) {
        int iV1;
        int i16 = i15 == 0 ? eVar.I0 : eVar.J0;
        if (i16 != -1 && (oVar == null || i16 != oVar.c())) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                o oVar2 = arrayList.get(i17);
                if (oVar2.c() == i16) {
                    if (oVar != null) {
                        oVar.g(i15, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i16 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof n5.j) && (iV1 = ((n5.j) eVar).v1(i15)) != -1) {
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    o oVar3 = arrayList.get(i18);
                    if (oVar3.c() == iV1) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i15);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof n5.h) {
                n5.h hVar = (n5.h) eVar;
                hVar.u1().c(hVar.v1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i15 == 0) {
                eVar.I0 = oVar.c();
                eVar.O.c(i15, arrayList, oVar);
                eVar.Q.c(i15, arrayList, oVar);
            } else {
                eVar.J0 = oVar.c();
                eVar.P.c(i15, arrayList, oVar);
                eVar.S.c(i15, arrayList, oVar);
                eVar.R.c(i15, arrayList, oVar);
            }
            eVar.V.c(i15, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i15) {
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            o oVar = arrayList.get(i16);
            if (i15 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0349  */
    public static boolean c(n5.f fVar, b.InterfaceC3522b interfaceC3522b) {
        o oVar;
        boolean z15;
        o oVar2;
        ArrayList<n5.e> arrayListV1 = fVar.v1();
        int size = arrayListV1.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            n5.e eVar = arrayListV1.get(i16);
            if (!d(fVar.A(), fVar.V(), eVar.A(), eVar.V()) || (eVar instanceof n5.g)) {
                return false;
            }
        }
        int i17 = 0;
        ArrayList arrayList = null;
        ArrayList<n5.j> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<n5.j> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i17 < size) {
            n5.e eVar2 = arrayListV1.get(i17);
            if (!d(fVar.A(), fVar.V(), eVar2.A(), eVar2.V())) {
                n5.f.X1(i15, eVar2, interfaceC3522b, fVar.f131912p1, b.a.f142365k);
            }
            boolean z16 = eVar2 instanceof n5.h;
            if (z16) {
                n5.h hVar = (n5.h) eVar2;
                if (hVar.v1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(hVar);
                }
                if (hVar.v1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hVar);
                }
            }
            if (eVar2 instanceof n5.j) {
                if (eVar2 instanceof n5.a) {
                    n5.a aVar = (n5.a) eVar2;
                    if (aVar.A1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.A1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    n5.j jVar = (n5.j) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jVar);
                }
            }
            if (eVar2.O.f131825f == null && eVar2.Q.f131825f == null && !z16 && !(eVar2 instanceof n5.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.P.f131825f == null && eVar2.R.f131825f == null && eVar2.S.f131825f == null && !z16 && !(eVar2 instanceof n5.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i17++;
            i15 = 0;
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((n5.h) it.next(), 0, arrayList7, null);
            }
        }
        o oVar3 = null;
        int i18 = 0;
        if (arrayList2 != null) {
            for (n5.j jVar2 : arrayList2) {
                o oVarA = a(jVar2, i18, arrayList7, oVar3);
                jVar2.u1(arrayList7, i18, oVarA);
                oVarA.b(arrayList7);
                oVar3 = null;
                i18 = 0;
            }
        }
        n5.d dVarO = fVar.o(n5.d.a.LEFT);
        if (dVarO.d() != null) {
            Iterator<n5.d> it4 = dVarO.d().iterator();
            while (it4.hasNext()) {
                a(it4.next().f131823d, 0, arrayList7, null);
            }
        }
        n5.d dVarO2 = fVar.o(n5.d.a.RIGHT);
        if (dVarO2.d() != null) {
            Iterator<n5.d> it5 = dVarO2.d().iterator();
            while (it5.hasNext()) {
                a(it5.next().f131823d, 0, arrayList7, null);
            }
        }
        n5.d dVarO3 = fVar.o(n5.d.a.CENTER);
        if (dVarO3.d() != null) {
            Iterator<n5.d> it6 = dVarO3.d().iterator();
            while (it6.hasNext()) {
                a(it6.next().f131823d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it7 = arrayList5.iterator();
            while (it7.hasNext()) {
                a((n5.e) it7.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                a((n5.h) it8.next(), 1, arrayList7, null);
            }
        }
        int i19 = 1;
        if (arrayList4 != null) {
            for (n5.j jVar3 : arrayList4) {
                o oVarA2 = a(jVar3, i19, arrayList7, oVar4);
                jVar3.u1(arrayList7, i19, oVarA2);
                oVarA2.b(arrayList7);
                oVar4 = null;
                i19 = 1;
            }
        }
        n5.d dVarO4 = fVar.o(n5.d.a.TOP);
        if (dVarO4.d() != null) {
            Iterator<n5.d> it9 = dVarO4.d().iterator();
            while (it9.hasNext()) {
                a(it9.next().f131823d, 1, arrayList7, null);
            }
        }
        n5.d dVarO5 = fVar.o(n5.d.a.BASELINE);
        if (dVarO5.d() != null) {
            Iterator<n5.d> it10 = dVarO5.d().iterator();
            while (it10.hasNext()) {
                a(it10.next().f131823d, 1, arrayList7, null);
            }
        }
        n5.d dVarO6 = fVar.o(n5.d.a.BOTTOM);
        if (dVarO6.d() != null) {
            Iterator<n5.d> it11 = dVarO6.d().iterator();
            while (it11.hasNext()) {
                a(it11.next().f131823d, 1, arrayList7, null);
            }
        }
        n5.d dVarO7 = fVar.o(n5.d.a.CENTER);
        if (dVarO7.d() != null) {
            Iterator<n5.d> it12 = dVarO7.d().iterator();
            while (it12.hasNext()) {
                a(it12.next().f131823d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                a((n5.e) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i25 = 0; i25 < size; i25++) {
            n5.e eVar3 = arrayListV1.get(i25);
            if (eVar3.u0()) {
                o oVarB = b(arrayList7, eVar3.I0);
                o oVarB2 = b(arrayList7, eVar3.J0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.A() == n5.e.b.WRAP_CONTENT) {
            oVar = null;
            int i26 = 0;
            for (o oVar5 : arrayList7) {
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int iF = oVar5.f(fVar.P1(), 0);
                    if (iF > i26) {
                        oVar = oVar5;
                        i26 = iF;
                    }
                }
            }
            if (oVar != null) {
                fVar.S0(n5.e.b.FIXED);
                fVar.n1(i26);
                oVar.h(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.V() == n5.e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i27 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.d() != 0) {
                    oVar7.h(false);
                    int iF2 = oVar7.f(fVar.P1(), 1);
                    if (iF2 > i27) {
                        oVar6 = oVar7;
                        i27 = iF2;
                    }
                }
            }
            z15 = true;
            if (oVar6 != null) {
                fVar.j1(n5.e.b.FIXED);
                fVar.O0(i27);
                oVar6.h(true);
                oVar2 = oVar6;
            }
            if (oVar == null || oVar2 != null) {
                return z15;
            }
            return false;
        }
        z15 = true;
        oVar2 = null;
        if (oVar == null) {
        }
        return z15;
    }

    public static boolean d(n5.e.b bVar, n5.e.b bVar2, n5.e.b bVar3, n5.e.b bVar4) {
        n5.e.b bVar5;
        n5.e.b bVar6;
        n5.e.b bVar7 = n5.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = n5.e.b.WRAP_CONTENT) || (bVar3 == n5.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = n5.e.b.WRAP_CONTENT) || (bVar4 == n5.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
