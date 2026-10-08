package rd;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173214a = sd.c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173215b = sd.c.a.a("p", "k");

    static od.e a(sd.c cVar, fd.f fVar) {
        nd.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strQ2 = null;
        od.g gVar = null;
        nd.c cVarG = null;
        nd.f fVarI = null;
        nd.f fVarI2 = null;
        boolean zR = false;
        while (cVar.p()) {
            switch (cVar.E(f173214a)) {
                case 0:
                    strQ2 = cVar.q2();
                    break;
                case 1:
                    cVar.Y();
                    int iNextInt = -1;
                    while (cVar.p()) {
                        int iE = cVar.E(f173215b);
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
                    break;
                case 2:
                    dVar = d.h(cVar, fVar);
                    break;
                case 3:
                    gVar = cVar.nextInt() == 1 ? od.g.LINEAR : od.g.RADIAL;
                    break;
                case 4:
                    fVarI = d.i(cVar, fVar);
                    break;
                case 5:
                    fVarI2 = d.i(cVar, fVar);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zR = cVar.r();
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new nd.d(Collections.singletonList(new ud.a(100)));
        }
        return new od.e(strQ2, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zR);
    }
}
