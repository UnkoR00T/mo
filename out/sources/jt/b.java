package jt;

import dt.i;
import dt.k;
import fr.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sr.p;
import st.t0;
import vr.h;
import vr.m;
import vr.m1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final boolean a(vr.e eVar) {
        return t.c(ht.e.o(eVar), p.f183626x);
    }

    private static final boolean b(t0 t0Var, boolean z15) {
        h hVarC = t0Var.T0().c();
        m1 m1Var = hVarC instanceof m1 ? (m1) hVarC : null;
        if (m1Var == null) {
            return false;
        }
        return (z15 || !k.d(m1Var)) && e(xt.d.o(m1Var));
    }

    public static final boolean c(t0 t0Var) {
        h hVarC = t0Var.T0().c();
        return hVarC != null && ((k.b(hVarC) && d(hVarC)) || k.i(t0Var));
    }

    public static final boolean d(m mVar) {
        return k.g(mVar) && !a((vr.e) mVar);
    }

    private static final boolean e(t0 t0Var) {
        return c(t0Var) || b(t0Var, true);
    }

    public static final boolean f(vr.b bVar) {
        vr.d dVar = bVar instanceof vr.d ? (vr.d) bVar : null;
        if (dVar == null || vr.t.g(dVar.h()) || k.g(dVar.i0()) || i.G(dVar.i0())) {
            return false;
        }
        List<t1> listL = dVar.l();
        if ((listL instanceof Collection) && listL.isEmpty()) {
            return false;
        }
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            if (e(((t1) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }
}
