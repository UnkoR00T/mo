package rd;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173216a = sd.c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173217b = sd.c.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final sd.c.a f173218c = sd.c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    static od.f a(sd.c cVar, fd.f fVar) {
        nd.d dVar;
        ArrayList arrayList = new ArrayList();
        od.g gVar = null;
        String strQ2 = null;
        nd.c cVarG = null;
        nd.f fVarI = null;
        nd.f fVarI2 = null;
        nd.b bVarE = null;
        od.s.b bVar = null;
        od.s.c cVar2 = null;
        nd.b bVar2 = null;
        float fNextDouble = 0.0f;
        boolean zR = false;
        nd.d dVarH = null;
        while (cVar.p()) {
            od.g gVar2 = gVar;
            switch (cVar.E(f173216a)) {
                case 0:
                    strQ2 = cVar.q2();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVarH;
                    cVar.Y();
                    int iNextInt = -1;
                    while (cVar.p()) {
                        int iE = cVar.E(f173217b);
                        if (iE == 0) {
                            iNextInt = cVar.nextInt();
                        } else if (iE != 1) {
                            cVar.H();
                            cVar.G0();
                        } else {
                            cVarG = d.g(cVar, fVar, iNextInt);
                        }
                    }
                    cVar.h0();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 2:
                    dVarH = d.h(cVar, fVar);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVarH;
                    gVar = cVar.nextInt() == 1 ? od.g.LINEAR : od.g.RADIAL;
                    dVarH = dVar;
                    break;
                case 4:
                    fVarI = d.i(cVar, fVar);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = d.i(cVar, fVar);
                    gVar = gVar2;
                    break;
                case 6:
                    bVarE = d.e(cVar, fVar);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVarH;
                    bVar = od.s.b.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 8:
                    dVar = dVarH;
                    cVar2 = od.s.c.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 9:
                    dVar = dVarH;
                    fNextDouble = (float) cVar.nextDouble();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 10:
                    zR = cVar.r();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.h();
                    while (cVar.p()) {
                        cVar.Y();
                        String strQ3 = null;
                        nd.b bVarE2 = null;
                        while (cVar.p()) {
                            int iE2 = cVar.E(f173218c);
                            if (iE2 != 0) {
                                nd.d dVar2 = dVarH;
                                if (iE2 != 1) {
                                    cVar.H();
                                    cVar.G0();
                                } else {
                                    bVarE2 = d.e(cVar, fVar);
                                }
                                dVarH = dVar2;
                            } else {
                                strQ3 = cVar.q2();
                            }
                        }
                        nd.d dVar3 = dVarH;
                        cVar.h0();
                        if (strQ3.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strQ3.equals("d") || strQ3.equals("g")) {
                                fVar.v(true);
                                arrayList.add(bVarE2);
                            }
                            dVarH = dVar3;
                        }
                        dVarH = dVar3;
                    }
                    dVar = dVarH;
                    cVar.m();
                    if (arrayList.size() == 1) {
                        arrayList.add((nd.b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    gVar = gVar2;
                    break;
            }
        }
        nd.d dVar4 = dVarH;
        return new od.f(strQ2, gVar, cVarG, dVar4 == null ? new nd.d(Collections.singletonList(new ud.a(100))) : dVar4, fVarI, fVarI2, bVarE, bVar, cVar2, fNextDouble, arrayList, bVar2, zR);
    }
}
