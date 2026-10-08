package vp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends r {
    t(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }

    public String l() {
        bp.b bVarF = f(bp.i.X1);
        if (bVarF instanceof bp.p) {
            return ((bp.p) bVarF).J3();
        }
        return null;
    }

    i m() {
        bp.b bVarF = f(bp.i.X1);
        return new i(bVarF instanceof bp.p ? (bp.p) bVarF : null, b().b());
    }

    public int n() {
        bp.k kVar = (bp.k) f(bp.i.f20780j7);
        if (kVar != null) {
            return kVar.J3();
        }
        return 0;
    }

    protected final String o(bp.b bVar) {
        if (bVar == null) {
            return "";
        }
        if (bVar instanceof bp.p) {
            return ((bp.p) bVar).J3();
        }
        return bVar instanceof bp.o ? ((bp.o) bVar).v5() : "";
    }
}
