package rd;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173183a = sd.c.a.a("nm", "r", "hd");

    static od.n a(sd.c cVar, fd.f fVar) {
        boolean zR = false;
        String strQ2 = null;
        nd.b bVarF = null;
        while (cVar.p()) {
            int iE = cVar.E(f173183a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                bVarF = d.f(cVar, fVar, true);
            } else if (iE != 2) {
                cVar.G0();
            } else {
                zR = cVar.r();
            }
        }
        if (zR) {
            return null;
        }
        return new od.n(strQ2, bVarF);
    }
}
