package vp;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class k {
    private static j a(d dVar, bp.d dVar2, n nVar) {
        int iY4 = dVar2.y4(bp.i.f20900v3, 0);
        if ((32768 & iY4) != 0) {
            return new p(dVar, dVar2, nVar);
        }
        return (iY4 & PKIFailureInfo.notAuthorized) != 0 ? new o(dVar, dVar2, nVar) : new f(dVar, dVar2, nVar);
    }

    private static j b(d dVar, bp.d dVar2, n nVar) {
        return (dVar2.y4(bp.i.f20900v3, 0) & PKIFailureInfo.unsupportedVersion) != 0 ? new h(dVar, dVar2, nVar) : new m(dVar, dVar2, nVar);
    }

    public static j c(d dVar, bp.d dVar2, n nVar) {
        bp.a aVar;
        bp.i iVar = bp.i.Q4;
        if (dVar2.J3(iVar) && (aVar = (bp.a) dVar2.p4(iVar)) != null && aVar.size() > 0) {
            for (int i15 = 0; i15 < aVar.size(); i15++) {
                bp.b bVarK4 = aVar.k4(i15);
                if ((bVarK4 instanceof bp.d) && ((bp.d) bVarK4).L4(bp.i.F8) != null) {
                    return new n(dVar, dVar2, nVar);
                }
            }
        }
        String strD = d(dVar2);
        if ("Ch".equals(strD)) {
            return b(dVar, dVar2, nVar);
        }
        if ("Tx".equals(strD)) {
            return new s(dVar, dVar2, nVar);
        }
        if ("Sig".equals(strD)) {
            return new q(dVar, dVar2, nVar);
        }
        if ("Btn".equals(strD)) {
            return a(dVar, dVar2, nVar);
        }
        return null;
    }

    private static String d(bp.d dVar) {
        String strH4 = dVar.H4(bp.i.V3);
        if (strH4 == null) {
            bp.b bVarQ4 = dVar.q4(bp.i.J6, bp.i.A6);
            if (bVarQ4 instanceof bp.d) {
                return d((bp.d) bVarQ4);
            }
        }
        return strH4;
    }
}
