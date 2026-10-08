package rd;

/* JADX INFO: loaded from: classes3.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173212a = sd.c.a.a("fFamily", "fName", "fStyle", "ascent");

    static md.c a(sd.c cVar) {
        cVar.Y();
        String strQ2 = null;
        String strQ3 = null;
        float fNextDouble = 0.0f;
        String strQ4 = null;
        while (cVar.p()) {
            int iE = cVar.E(f173212a);
            if (iE == 0) {
                strQ2 = cVar.q2();
            } else if (iE == 1) {
                strQ4 = cVar.q2();
            } else if (iE == 2) {
                strQ3 = cVar.q2();
            } else if (iE != 3) {
                cVar.H();
                cVar.G0();
            } else {
                fNextDouble = (float) cVar.nextDouble();
            }
        }
        cVar.h0();
        return new md.c(strQ2, strQ4, strQ3, fNextDouble);
    }
}
