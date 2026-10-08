package js;

import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements dt.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104783a = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private final boolean b(vr.z zVar) {
            if (zVar.l().size() != 1) {
                return false;
            }
            vr.m mVarB = zVar.b();
            vr.e eVar = mVarB instanceof vr.e ? (vr.e) mVarB : null;
            if (eVar == null) {
                return false;
            }
            vr.h hVarC = ((t1) pq.v.P0(zVar.l())).getType().T0().c();
            vr.e eVar2 = hVarC instanceof vr.e ? (vr.e) hVarC : null;
            return eVar2 != null && sr.j.s0(eVar) && fr.t.c(ht.e.o(eVar), ht.e.o(eVar2));
        }

        private final ss.s c(vr.z zVar, t1 t1Var) {
            return (ss.c0.e(zVar) || b(zVar)) ? ss.c0.g(xt.d.B(t1Var.getType())) : ss.c0.g(t1Var.getType());
        }

        public final boolean a(vr.a aVar, vr.a aVar2) {
            if ((aVar2 instanceof ls.e) && (aVar instanceof vr.z)) {
                ls.e eVar = (ls.e) aVar2;
                eVar.l().size();
                vr.z zVar = (vr.z) aVar;
                zVar.l().size();
                for (oq.r rVar : pq.v.p1(eVar.Q0().l(), zVar.Q0().l())) {
                    if ((c((vr.z) aVar2, (t1) rVar.a()) instanceof ss.s.d) != (c(zVar, (t1) rVar.b()) instanceof ss.s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean a(vr.a aVar, vr.a aVar2, vr.e eVar) {
        if ((aVar instanceof vr.b) && (aVar2 instanceof vr.z) && !sr.j.h0(aVar2)) {
            vr.z zVar = (vr.z) aVar2;
            if (!i.f104648o.n(zVar.getName()) && !u0.f104736a.k(zVar.getName())) {
                return false;
            }
            vr.b bVarJ = t0.j((vr.b) aVar);
            boolean z15 = aVar instanceof vr.z;
            vr.z zVar2 = z15 ? (vr.z) aVar : null;
            if (!(zVar2 != null && zVar.G0() == zVar2.G0()) && (bVarJ == null || !zVar.G0())) {
                return true;
            }
            if ((eVar instanceof ls.c) && zVar.w0() == null && bVarJ != null && !t0.l(eVar, bVarJ)) {
                return ((bVarJ instanceof vr.z) && z15 && i.l((vr.z) bVarJ) != null && fr.t.c(ss.c0.c(zVar, false, false, 2, null), ss.c0.c(((vr.z) aVar).Q0(), false, false, 2, null))) ? false : true;
            }
        }
        return false;
    }

    @Override // dt.j
    public dt.j.a v() {
        return dt.j.a.CONFLICTS_ONLY;
    }

    @Override // dt.j
    public dt.j.b w(vr.a aVar, vr.a aVar2, vr.e eVar) {
        if (!a(aVar, aVar2, eVar) && !f104783a.a(aVar, aVar2)) {
            return dt.j.b.UNKNOWN;
        }
        return dt.j.b.INCOMPATIBLE;
    }
}
