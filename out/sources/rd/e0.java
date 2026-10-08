package rd;

/* JADX INFO: loaded from: classes3.dex */
class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173181a = sd.c.a.a("nm", "c", "o", "tr", "hd");

    static od.m a(sd.c cVar, fd.f fVar) {
        String strQ2 = null;
        nd.b bVarF = null;
        nd.b bVarF2 = null;
        nd.n nVarH = null;
        boolean zR = false;
        while (cVar.p()) {
            int iE = cVar.E(f173181a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                bVarF = d.f(cVar, fVar, false);
            } else if (iE == 2) {
                bVarF2 = d.f(cVar, fVar, false);
            } else if (iE == 3) {
                nVarH = c.h(cVar, fVar);
            } else if (iE != 4) {
                cVar.G0();
            } else {
                zR = cVar.r();
            }
        }
        return new od.m(strQ2, bVarF, bVarF2, nVarH, zR);
    }
}
