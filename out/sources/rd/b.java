package rd;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173171a = sd.c.a.a("s", "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final sd.c.a f173172b = sd.c.a.a("s", "e", "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final sd.c.a f173173c = sd.c.a.a("fc", "sc", "sw", "t", "o");

    public static nd.k a(sd.c cVar, fd.f fVar) {
        cVar.Y();
        nd.m mVarC = null;
        nd.l lVarB = null;
        while (cVar.p()) {
            int iE = cVar.E(f173171a);
            if (iE == 0) {
                lVarB = b(cVar, fVar);
            } else if (iE != 1) {
                cVar.H();
                cVar.G0();
            } else {
                mVarC = c(cVar, fVar);
            }
        }
        cVar.h0();
        return new nd.k(mVarC, lVarB);
    }

    private static nd.l b(sd.c cVar, fd.f fVar) {
        cVar.Y();
        nd.d dVar = null;
        nd.d dVarH = null;
        nd.d dVarH2 = null;
        od.u uVar = null;
        while (cVar.p()) {
            int iE = cVar.E(f173172b);
            if (iE == 0) {
                dVar = d.h(cVar, fVar);
            } else if (iE == 1) {
                dVarH = d.h(cVar, fVar);
            } else if (iE == 2) {
                dVarH2 = d.h(cVar, fVar);
            } else if (iE != 3) {
                cVar.H();
                cVar.G0();
            } else {
                int iNextInt = cVar.nextInt();
                if (iNextInt == 1 || iNextInt == 2) {
                    uVar = iNextInt == 1 ? od.u.PERCENT : od.u.INDEX;
                } else {
                    fVar.a("Unsupported text range units: " + iNextInt);
                    uVar = od.u.INDEX;
                }
            }
        }
        cVar.h0();
        if (dVar == null && dVarH != null) {
            dVar = new nd.d(Collections.singletonList(new ud.a(0)));
        }
        return new nd.l(dVar, dVarH, dVarH2, uVar);
    }

    private static nd.m c(sd.c cVar, fd.f fVar) {
        cVar.Y();
        nd.a aVarC = null;
        nd.a aVarC2 = null;
        nd.b bVarE = null;
        nd.b bVarE2 = null;
        nd.d dVarH = null;
        while (cVar.p()) {
            int iE = cVar.E(f173173c);
            if (iE == 0) {
                aVarC = d.c(cVar, fVar);
            } else if (iE == 1) {
                aVarC2 = d.c(cVar, fVar);
            } else if (iE == 2) {
                bVarE = d.e(cVar, fVar);
            } else if (iE == 3) {
                bVarE2 = d.e(cVar, fVar);
            } else if (iE != 4) {
                cVar.H();
                cVar.G0();
            } else {
                dVarH = d.h(cVar, fVar);
            }
        }
        cVar.h0();
        return new nd.m(aVarC, aVarC2, bVarE, bVarE2, dVarH);
    }
}
