package rd;

/* JADX INFO: loaded from: classes3.dex */
class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static sd.c.a f173205a = sd.c.a.a("nm", "ind", "ks", "hd");

    static od.r a(sd.c cVar, fd.f fVar) {
        String strQ2 = null;
        int iNextInt = 0;
        boolean zR = false;
        nd.h hVarK = null;
        while (cVar.p()) {
            int iE = cVar.E(f173205a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                iNextInt = cVar.nextInt();
            } else if (iE == 2) {
                hVarK = d.k(cVar, fVar);
            } else if (iE != 3) {
                cVar.G0();
            } else {
                zR = cVar.r();
            }
        }
        return new od.r(strQ2, iNextInt, hVarK, zR);
    }
}
