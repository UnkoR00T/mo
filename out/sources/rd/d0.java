package rd;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173178a = sd.c.a.a("nm", "p", "s", "r", "hd");

    static od.l a(sd.c cVar, fd.f fVar) {
        String strQ2 = null;
        nd.o<PointF, PointF> oVarB = null;
        nd.f fVarI = null;
        nd.b bVarE = null;
        boolean zR = false;
        while (cVar.p()) {
            int iE = cVar.E(f173178a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                oVarB = a.b(cVar, fVar);
            } else if (iE == 2) {
                fVarI = d.i(cVar, fVar);
            } else if (iE == 3) {
                bVarE = d.e(cVar, fVar);
            } else if (iE != 4) {
                cVar.G0();
            } else {
                zR = cVar.r();
            }
        }
        return new od.l(strQ2, oVarB, fVarI, bVarE, zR);
    }
}
