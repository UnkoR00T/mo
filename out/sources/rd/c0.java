package rd;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173177a = sd.c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static od.k a(sd.c cVar, fd.f fVar, int i15) {
        boolean zR = false;
        boolean z15 = i15 == 3;
        String strQ2 = null;
        od.k.a aVarE = null;
        nd.b bVarF = null;
        nd.o<PointF, PointF> oVarB = null;
        nd.b bVarF2 = null;
        nd.b bVarE = null;
        nd.b bVarE2 = null;
        nd.b bVarF3 = null;
        nd.b bVarF4 = null;
        while (cVar.p()) {
            switch (cVar.E(f173177a)) {
                case 0:
                    strQ2 = cVar.q2();
                    break;
                case 1:
                    aVarE = od.k.a.e(cVar.nextInt());
                    break;
                case 2:
                    bVarF = d.f(cVar, fVar, false);
                    break;
                case 3:
                    oVarB = a.b(cVar, fVar);
                    break;
                case 4:
                    bVarF2 = d.f(cVar, fVar, false);
                    break;
                case 5:
                    bVarE2 = d.e(cVar, fVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, fVar, false);
                    break;
                case 7:
                    bVarE = d.e(cVar, fVar);
                    break;
                case 8:
                    bVarF3 = d.f(cVar, fVar, false);
                    break;
                case 9:
                    zR = cVar.r();
                    break;
                case 10:
                    z15 = cVar.nextInt() == 3;
                    break;
                default:
                    cVar.H();
                    cVar.G0();
                    break;
            }
        }
        return new od.k(strQ2, aVarE, bVarF, oVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zR, z15);
    }
}
