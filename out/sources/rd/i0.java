package rd;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173191a = sd.c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static od.p a(sd.c cVar, fd.f fVar) {
        nd.d dVar = null;
        String strQ2 = null;
        nd.a aVarC = null;
        boolean zR = false;
        boolean zR2 = false;
        int iNextInt = 1;
        while (cVar.p()) {
            int iE = cVar.E(f173191a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                aVarC = d.c(cVar, fVar);
            } else if (iE == 2) {
                dVar = d.h(cVar, fVar);
            } else if (iE == 3) {
                zR = cVar.r();
            } else if (iE == 4) {
                iNextInt = cVar.nextInt();
            } else if (iE != 5) {
                cVar.H();
                cVar.G0();
            } else {
                zR2 = cVar.r();
            }
        }
        if (dVar == null) {
            dVar = new nd.d(Collections.singletonList(new ud.a(100)));
        }
        return new od.p(strQ2, zR, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zR2);
    }
}
