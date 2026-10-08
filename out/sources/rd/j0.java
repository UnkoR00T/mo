package rd;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173197a = sd.c.a.a("nm", "hd", "it");

    static od.q a(sd.c cVar, fd.f fVar) {
        ArrayList arrayList = new ArrayList();
        String strQ2 = null;
        boolean zR = false;
        while (cVar.p()) {
            int iE = cVar.E(f173197a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                zR = cVar.r();
            } else if (iE != 2) {
                cVar.G0();
            } else {
                cVar.h();
                while (cVar.p()) {
                    od.c cVarA = h.a(cVar, fVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.m();
            }
        }
        return new od.q(strQ2, arrayList, zR);
    }
}
