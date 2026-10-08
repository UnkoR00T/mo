package st;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f184013a = new d();

    private d() {
    }

    private final boolean a(wt.s sVar, wt.j jVar, wt.j jVar2) {
        if (sVar.r0(jVar) != sVar.r0(jVar2) || sVar.A(jVar) != sVar.A(jVar2) || sVar.t(jVar) != sVar.t(jVar2) || !sVar.y0(sVar.d(jVar), sVar.d(jVar2))) {
            return false;
        }
        if (sVar.S(jVar, jVar2)) {
            return true;
        }
        int iR0 = sVar.r0(jVar);
        for (int i15 = 0; i15 < iR0; i15++) {
            wt.m mVarH = sVar.H(jVar, i15);
            wt.m mVarH2 = sVar.H(jVar2, i15);
            if (sVar.h(mVarH) != sVar.h(mVarH2)) {
                return false;
            }
            if (!sVar.h(mVarH) && (sVar.m(mVarH) != sVar.m(mVarH2) || !c(sVar, sVar.H0(mVarH), sVar.H0(mVarH2)))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(wt.s sVar, wt.i iVar, wt.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        wt.j jVarE = sVar.e(iVar);
        wt.j jVarE2 = sVar.e(iVar2);
        if (jVarE != null && jVarE2 != null) {
            return a(sVar, jVarE, jVarE2);
        }
        wt.g gVarN = sVar.N(iVar);
        wt.g gVarN2 = sVar.N(iVar2);
        return gVarN != null && gVarN2 != null && a(sVar, sVar.c(gVarN), sVar.c(gVarN2)) && a(sVar, sVar.g(gVarN), sVar.g(gVarN2));
    }

    public final boolean b(wt.s sVar, wt.i iVar, wt.i iVar2) {
        return c(sVar, iVar, iVar2);
    }
}
