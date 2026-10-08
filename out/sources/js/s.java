package js;

import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements dt.j {
    @Override // dt.j
    public dt.j.a v() {
        return dt.j.a.BOTH;
    }

    @Override // dt.j
    public dt.j.b w(vr.a aVar, vr.a aVar2, vr.e eVar) {
        if (!(aVar2 instanceof z0) || !(aVar instanceof z0)) {
            return dt.j.b.UNKNOWN;
        }
        z0 z0Var = (z0) aVar2;
        z0 z0Var2 = (z0) aVar;
        if (!fr.t.c(z0Var.getName(), z0Var2.getName())) {
            return dt.j.b.UNKNOWN;
        }
        if (ns.d.a(z0Var) && ns.d.a(z0Var2)) {
            return dt.j.b.OVERRIDABLE;
        }
        return (ns.d.a(z0Var) || ns.d.a(z0Var2)) ? dt.j.b.INCOMPATIBLE : dt.j.b.UNKNOWN;
    }
}
