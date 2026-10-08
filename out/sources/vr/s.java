package vr;

/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public static final h a(m mVar) {
        m mVarB = mVar.b();
        if (mVarB != null && !(mVar instanceof o0)) {
            if (!b(mVarB)) {
                return a(mVarB);
            }
            if (mVarB instanceof h) {
                return (h) mVarB;
            }
        }
        return null;
    }

    public static final boolean b(m mVar) {
        return mVar.b() instanceof o0;
    }

    public static final boolean c(z zVar) {
        st.e1 e1VarT;
        st.t0 t0VarD;
        st.t0 t0VarF;
        m mVarB = zVar.b();
        e eVar = mVarB instanceof e ? (e) mVarB : null;
        if (eVar != null) {
            e eVar2 = dt.k.g(eVar) ? eVar : null;
            if (eVar2 != null && (e1VarT = eVar2.t()) != null && (t0VarD = xt.d.D(e1VarT)) != null && (t0VarF = zVar.f()) != null && fr.t.c(zVar.getName(), zt.t.f237251e) && ((xt.d.s(t0VarF) || xt.d.t(t0VarF)) && zVar.l().size() == 1 && fr.t.c(xt.d.D(zVar.l().get(0).getType()), t0VarD) && zVar.B0().isEmpty() && zVar.R() == null)) {
                return true;
            }
        }
        return false;
    }

    public static final e d(i0 i0Var, zs.c cVar, ds.b bVar) {
        lt.k kVarX;
        if (cVar.c()) {
            return null;
        }
        h hVarE = i0Var.V(cVar.d()).r().e(cVar.f(), bVar);
        e eVar = hVarE instanceof e ? (e) hVarE : null;
        if (eVar != null) {
            return eVar;
        }
        e eVarD = d(i0Var, cVar.d(), bVar);
        h hVarE2 = (eVarD == null || (kVarX = eVarD.X()) == null) ? null : kVarX.e(cVar.f(), bVar);
        if (hVarE2 instanceof e) {
            return (e) hVarE2;
        }
        return null;
    }
}
