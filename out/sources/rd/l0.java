package rd;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173207a = sd.c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173208b = sd.c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    static od.s a(sd.c cVar, fd.f fVar) {
        ArrayList arrayList = new ArrayList();
        String strQ2 = null;
        od.s.b bVar = null;
        od.s.c cVar2 = null;
        Object obj = null;
        nd.a aVarC = null;
        nd.b bVarE = null;
        String str = null;
        float fNextDouble = 0.0f;
        boolean zR = false;
        nd.d dVar = null;
        while (cVar.p()) {
            switch (cVar.E(f173207a)) {
                case 0:
                    strQ2 = cVar.q2();
                    break;
                case 1:
                    aVarC = d.c(cVar, fVar);
                    break;
                case 2:
                    bVarE = d.e(cVar, fVar);
                    break;
                case 3:
                    dVar = d.h(cVar, fVar);
                    break;
                case 4:
                    bVar = od.s.b.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    cVar2 = od.s.c.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 7:
                    zR = cVar.r();
                    break;
                case 8:
                    cVar.h();
                    while (cVar.p()) {
                        cVar.Y();
                        String strQ3 = str;
                        Object objE = strQ3;
                        while (cVar.p()) {
                            int iE = cVar.E(f173208b);
                            if (iE == 0) {
                                strQ3 = cVar.q2();
                            } else if (iE != 1) {
                                cVar.H();
                                cVar.G0();
                            } else {
                                objE = d.e(cVar, fVar);
                            }
                        }
                        cVar.h0();
                        strQ3.getClass();
                        switch (strQ3) {
                            case "d":
                            case "g":
                                fVar.v(true);
                                arrayList.add(objE);
                                break;
                            case "o":
                                obj = objE;
                                break;
                        }
                        str = null;
                    }
                    cVar.m();
                    if (arrayList.size() == 1) {
                        arrayList.add((nd.b) arrayList.get(0));
                    }
                    break;
                default:
                    cVar.G0();
                    continue;
            }
            str = null;
        }
        if (dVar == null) {
            dVar = new nd.d(Collections.singletonList(new ud.a(100)));
        }
        if (bVar == null) {
            bVar = od.s.b.BUTT;
        }
        if (cVar2 == null) {
            cVar2 = od.s.c.MITER;
        }
        return new od.s(strQ2, obj, arrayList, aVarC, dVar, bVarE, bVar, cVar2, fNextDouble, zR);
    }
}
