package vr;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y {
    public static final e b(i0 i0Var, zs.b bVar) {
        h hVarC = c(i0Var, bVar);
        if (hVarC instanceof e) {
            return (e) hVarC;
        }
        return null;
    }

    public static final h c(i0 i0Var, zs.b bVar) {
        i0 i0VarA = dt.t.a(i0Var);
        if (i0VarA == null) {
            v0 v0VarV = i0Var.V(bVar.f());
            List<zs.f> listE = bVar.g().e();
            h hVarE = v0VarV.r().e((zs.f) pq.v.l0(listE), ds.d.FROM_DESERIALIZATION);
            if (hVarE == null) {
                return null;
            }
            for (zs.f fVar : listE.subList(1, listE.size())) {
                if (!(hVarE instanceof e)) {
                    return null;
                }
                h hVarE2 = ((e) hVarE).X().e(fVar, ds.d.FROM_DESERIALIZATION);
                hVarE = hVarE2 instanceof e ? (e) hVarE2 : null;
                if (hVarE == null) {
                    return null;
                }
            }
            return hVarE;
        }
        v0 v0VarV2 = i0VarA.V(bVar.f());
        List<zs.f> listE2 = bVar.g().e();
        h hVarE3 = v0VarV2.r().e((zs.f) pq.v.l0(listE2), ds.d.FROM_DESERIALIZATION);
        if (hVarE3 == null) {
            hVarE3 = null;
            break;
        }
        for (zs.f fVar2 : listE2.subList(1, listE2.size())) {
            if (hVarE3 instanceof e) {
                h hVarE4 = ((e) hVarE3).X().e(fVar2, ds.d.FROM_DESERIALIZATION);
                hVarE3 = hVarE4 instanceof e ? (e) hVarE4 : null;
                if (hVarE3 != null) {
                }
            }
            hVarE3 = null;
        }
        if (hVarE3 != null) {
            return hVarE3;
        }
        v0 v0VarV3 = i0Var.V(bVar.f());
        List<zs.f> listE3 = bVar.g().e();
        h hVarE5 = v0VarV3.r().e((zs.f) pq.v.l0(listE3), ds.d.FROM_DESERIALIZATION);
        if (hVarE5 == null) {
            return null;
        }
        for (zs.f fVar3 : listE3.subList(1, listE3.size())) {
            if (!(hVarE5 instanceof e)) {
                return null;
            }
            h hVarE6 = ((e) hVarE5).X().e(fVar3, ds.d.FROM_DESERIALIZATION);
            hVarE5 = hVarE6 instanceof e ? (e) hVarE6 : null;
            if (hVarE5 == null) {
                return null;
            }
        }
        return hVarE5;
    }

    public static final e d(i0 i0Var, zs.b bVar, n0 n0Var) {
        e eVarB = b(i0Var, bVar);
        return eVarB != null ? eVarB : n0Var.d(bVar, eu.k.P(eu.k.H(eu.k.o(bVar, new fr.h0() { // from class: vr.y.a
            @Override // fr.h0, mr.n
            public Object get(Object obj) {
                return ((zs.b) obj).e();
            }
        }), x.f208106a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(zs.b bVar) {
        return 0;
    }

    public static final l1 f(i0 i0Var, zs.b bVar) {
        h hVarC = c(i0Var, bVar);
        if (hVarC instanceof l1) {
            return (l1) hVarC;
        }
        return null;
    }
}
