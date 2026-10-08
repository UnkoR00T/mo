package js;

import st.e1;
import vr.g1;
import vr.y0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {
    public static final boolean d(vr.b bVar) {
        return g(bVar) != null;
    }

    public static final String e(vr.b bVar) {
        vr.b bVarW;
        zs.f fVarJ;
        vr.b bVarF = f(bVar);
        if (bVarF != null && (bVarW = ht.e.w(bVarF)) != null) {
            if (bVarW instanceof z0) {
                return m.f104712a.b(bVarW);
            }
            if ((bVarW instanceof g1) && (fVarJ = f.f104638o.j((g1) bVarW)) != null) {
                return fVarJ.e();
            }
        }
        return null;
    }

    private static final vr.b f(vr.b bVar) {
        if (sr.j.h0(bVar)) {
            return g(bVar);
        }
        return null;
    }

    public static final <T extends vr.b> T g(T t15) {
        if (!u0.f104736a.g().contains(t15.getName()) && !j.f104654a.d().contains(ht.e.w(t15).getName())) {
            return null;
        }
        if ((t15 instanceof z0) || (t15 instanceof y0)) {
            return (T) ht.e.i(t15, false, q0.f104727a, 1, null);
        }
        if (t15 instanceof g1) {
            return (T) ht.e.i(t15, false, r0.f104731a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(vr.b bVar) {
        return m.f104712a.d(ht.e.w(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(vr.b bVar) {
        return f.f104638o.k((g1) bVar);
    }

    public static final <T extends vr.b> T j(T t15) {
        T t16 = (T) g(t15);
        if (t16 != null) {
            return t16;
        }
        if (i.f104648o.n(t15.getName())) {
            return (T) ht.e.i(t15, false, s0.f104732a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(vr.b bVar) {
        return sr.j.h0(bVar) && i.o(bVar) != null;
    }

    public static final boolean l(vr.e eVar, vr.a aVar) {
        e1 e1VarT = ((vr.e) aVar.b()).t();
        for (vr.e eVarS = dt.i.s(eVar); eVarS != null; eVarS = dt.i.s(eVarS)) {
            if (!(eVarS instanceof ls.c) && tt.y.b(eVarS.t(), e1VarT) != null) {
                return !sr.j.h0(eVarS);
            }
        }
        return false;
    }

    public static final boolean m(vr.b bVar) {
        return ht.e.w(bVar).b() instanceof ls.c;
    }

    public static final boolean n(vr.b bVar) {
        return m(bVar) || sr.j.h0(bVar);
    }
}
