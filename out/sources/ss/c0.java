package ss;

import java.util.Iterator;
import st.t0;
import vr.c1;
import vr.g1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {
    private static final void a(StringBuilder sb5, t0 t0Var) {
        sb5.append(g(t0Var));
    }

    public static final String b(vr.z zVar, boolean z15, boolean z16) {
        StringBuilder sb5 = new StringBuilder();
        if (z16) {
            sb5.append(zVar instanceof vr.l ? "<init>" : zVar.getName().e());
        }
        sb5.append("(");
        c1 c1VarR = zVar.R();
        if (c1VarR != null) {
            a(sb5, c1VarR.getType());
        }
        Iterator<t1> it = zVar.l().iterator();
        while (it.hasNext()) {
            a(sb5, it.next().getType());
        }
        sb5.append(")");
        if (z15) {
            if (j.c(zVar)) {
                sb5.append("V");
            } else {
                a(sb5, zVar.f());
            }
        }
        return sb5.toString();
    }

    public static /* synthetic */ String c(vr.z zVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        return b(zVar, z15, z16);
    }

    public static final String d(vr.a aVar) {
        f0 f0Var = f0.f183849a;
        if (dt.i.E(aVar)) {
            return null;
        }
        vr.m mVarB = aVar.b();
        vr.e eVar = mVarB instanceof vr.e ? (vr.e) mVarB : null;
        if (eVar == null || eVar.getName().n()) {
            return null;
        }
        vr.a aVarA = aVar.a();
        g1 g1Var = aVarA instanceof g1 ? (g1) aVarA : null;
        if (g1Var == null) {
            return null;
        }
        return b0.a(f0Var, eVar, c(g1Var, false, false, 3, null));
    }

    public static final boolean e(vr.a aVar) {
        vr.z zVarL;
        if (!(aVar instanceof vr.z)) {
            return false;
        }
        vr.z zVar = (vr.z) aVar;
        if (fr.t.c(zVar.getName().e(), "remove") && zVar.l().size() == 1 && !js.t0.n((vr.b) aVar)) {
            s sVarG = g(((t1) pq.v.P0(zVar.a().l())).getType());
            s.d dVar = sVarG instanceof s.d ? (s.d) sVarG : null;
            if ((dVar != null ? dVar.i() : null) != jt.e.INT || (zVarL = js.i.l(zVar)) == null) {
                return false;
            }
            s sVarG2 = g(((t1) pq.v.P0(zVarL.a().l())).getType());
            if (fr.t.c(ht.e.p(zVarL.b()), sr.p.a.f183640f0.i()) && (sVarG2 instanceof s.c) && fr.t.c(((s.c) sVarG2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(vr.e eVar) {
        zs.b bVarN = ur.c.f200031a.n(ht.e.o(eVar).i());
        return bVarN != null ? jt.d.h(bVarN) : j.b(eVar, null, 2, null);
    }

    public static final s g(t0 t0Var) {
        return (s) j.e(t0Var, u.f183939a, i0.f183883q, h0.f183877a, null, null, 32, null);
    }
}
