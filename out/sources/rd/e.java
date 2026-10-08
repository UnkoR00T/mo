package rd;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173179a = sd.c.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173180b = sd.c.a.a("ty", "v");

    private static od.a a(sd.c cVar, fd.f fVar) {
        cVar.Y();
        od.a aVar = null;
        while (true) {
            boolean z15 = false;
            while (true) {
                if (!cVar.p()) {
                    cVar.h0();
                    return aVar;
                }
                int iE = cVar.E(f173180b);
                if (iE != 0) {
                    if (iE != 1) {
                        cVar.H();
                        cVar.G0();
                    } else if (z15) {
                        aVar = new od.a(d.e(cVar, fVar));
                    } else {
                        cVar.G0();
                    }
                } else if (cVar.nextInt() == 0) {
                    z15 = true;
                }
            }
        }
    }

    static od.a b(sd.c cVar, fd.f fVar) {
        od.a aVar = null;
        while (cVar.p()) {
            if (cVar.E(f173179a) != 0) {
                cVar.H();
                cVar.G0();
            } else {
                cVar.h();
                while (cVar.p()) {
                    od.a aVarA = a(cVar, fVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.m();
            }
        }
        return aVar;
    }
}
