package js;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f104648o = new i();

    private i() {
    }

    private final boolean k(vr.b bVar) {
        return pq.v.c0(u0.f104736a.e(), ss.c0.d(bVar));
    }

    public static final vr.z l(vr.z zVar) {
        if (f104648o.n(zVar.getName())) {
            return (vr.z) ht.e.i(zVar, false, g.f104640a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(vr.b bVar) {
        return f104648o.k(bVar);
    }

    public static final u0.b o(vr.b bVar) {
        vr.b bVarI;
        String strD;
        u0.a aVar = u0.f104736a;
        if (!aVar.d().contains(bVar.getName()) || (bVarI = ht.e.i(bVar, false, h.f104642a, 1, null)) == null || (strD = ss.c0.d(bVarI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(vr.b bVar) {
        return (bVar instanceof vr.z) && f104648o.k(bVar);
    }

    public final boolean n(zs.f fVar) {
        return u0.f104736a.d().contains(fVar);
    }
}
