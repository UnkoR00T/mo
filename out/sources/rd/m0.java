package rd;

/* JADX INFO: loaded from: classes3.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173211a = sd.c.a.a("s", "e", "o", "nm", "m", "hd");

    static od.t a(sd.c cVar, fd.f fVar) {
        String strQ2 = null;
        od.t.a aVarE = null;
        nd.b bVarF = null;
        nd.b bVarF2 = null;
        nd.b bVarF3 = null;
        boolean zR = false;
        while (cVar.p()) {
            int iE = cVar.E(f173211a);
            if (iE == 0) {
                bVarF = d.f(cVar, fVar, false);
            } else if (iE == 1) {
                bVarF2 = d.f(cVar, fVar, false);
            } else if (iE == 2) {
                bVarF3 = d.f(cVar, fVar, false);
            } else if (iE == 3) {
                strQ2 = cVar.q2();
            } else if (iE == 4) {
                aVarE = od.t.a.e(cVar.nextInt());
            } else if (iE != 5) {
                cVar.G0();
            } else {
                zR = cVar.r();
            }
        }
        return new od.t(strQ2, aVarE, bVarF, bVarF2, bVarF3, zR);
    }
}
