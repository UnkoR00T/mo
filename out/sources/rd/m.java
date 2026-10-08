package rd;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173209a = sd.c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173210b = sd.c.a.a("shapes");

    static md.d a(sd.c cVar, fd.f fVar) {
        ArrayList arrayList = new ArrayList();
        cVar.Y();
        double dNextDouble = 0.0d;
        String strQ2 = null;
        String strQ3 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (cVar.p()) {
            int iE = cVar.E(f173209a);
            if (iE == 0) {
                cCharAt = cVar.q2().charAt(0);
            } else if (iE == 1) {
                dNextDouble2 = cVar.nextDouble();
            } else if (iE == 2) {
                dNextDouble = cVar.nextDouble();
            } else if (iE == 3) {
                strQ2 = cVar.q2();
            } else if (iE == 4) {
                strQ3 = cVar.q2();
            } else if (iE != 5) {
                cVar.H();
                cVar.G0();
            } else {
                cVar.Y();
                while (cVar.p()) {
                    if (cVar.E(f173210b) != 0) {
                        cVar.H();
                        cVar.G0();
                    } else {
                        cVar.h();
                        while (cVar.p()) {
                            arrayList.add((od.q) h.a(cVar, fVar));
                        }
                        cVar.m();
                    }
                }
                cVar.h0();
            }
        }
        cVar.h0();
        return new md.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strQ2, strQ3);
    }
}
