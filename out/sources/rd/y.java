package rd;

/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173235a = sd.c.a.a("nm", "mm", "hd");

    static od.j a(sd.c cVar) {
        String strQ2 = null;
        boolean zR = false;
        od.j.a aVarE = null;
        while (cVar.p()) {
            int iE = cVar.E(f173235a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                aVarE = od.j.a.e(cVar.nextInt());
            } else if (iE != 2) {
                cVar.H();
                cVar.G0();
            } else {
                zR = cVar.r();
            }
        }
        return new od.j(strQ2, aVarE, zR);
    }
}
