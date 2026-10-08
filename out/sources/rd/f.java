package rd;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173182a = sd.c.a.a("nm", "p", "s", "hd", "d");

    static od.b a(sd.c cVar, fd.f fVar, int i15) {
        boolean z15 = i15 == 3;
        boolean zR = false;
        String strQ2 = null;
        nd.o<PointF, PointF> oVarB = null;
        nd.f fVarI = null;
        while (cVar.p()) {
            int iE = cVar.E(f173182a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                oVarB = a.b(cVar, fVar);
            } else if (iE == 2) {
                fVarI = d.i(cVar, fVar);
            } else if (iE == 3) {
                zR = cVar.r();
            } else if (iE != 4) {
                cVar.H();
                cVar.G0();
            } else {
                z15 = cVar.nextInt() == 3;
            }
        }
        return new od.b(strQ2, oVarB, fVarI, z15, zR);
    }
}
