package sr;

import ft.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pq.v;
import pq.v0;
import st.d2;
import st.e1;
import st.t0;
import st.u1;
import st.w0;

/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public static final int a(t0 t0Var) {
        wr.c cVarH = t0Var.getAnnotations().H(p.a.D);
        if (cVarH == null) {
            return 0;
        }
        return ((ft.n) ((ft.g) v0.j(cVarH.a(), p.f183619q))).b().intValue();
    }

    public static final e1 b(j jVar, wr.h hVar, t0 t0Var, List<? extends t0> list, List<? extends t0> list2, List<zs.f> list3, t0 t0Var2, boolean z15) {
        List<d2> listG = g(t0Var, list, list2, list3, t0Var2, jVar);
        vr.e eVarF = f(jVar, list2.size() + list.size() + (t0Var == null ? 0 : 1), z15);
        if (t0Var != null) {
            hVar = v(hVar, jVar);
        }
        if (!list.isEmpty()) {
            hVar = u(hVar, jVar, list.size());
        }
        return w0.h(u1.b(hVar), eVarF, listG);
    }

    public static final zs.f d(t0 t0Var) {
        String strB;
        wr.c cVarH = t0Var.getAnnotations().H(p.a.E);
        if (cVarH == null) {
            return null;
        }
        Object objQ0 = v.Q0(cVarH.a().values());
        y yVar = objQ0 instanceof y ? (y) objQ0 : null;
        if (yVar != null && (strB = yVar.b()) != null) {
            if (!zs.f.o(strB)) {
                strB = null;
            }
            if (strB != null) {
                return zs.f.l(strB);
            }
        }
        return null;
    }

    public static final List<t0> e(t0 t0Var) {
        p(t0Var);
        int iA = a(t0Var);
        if (iA == 0) {
            return v.n();
        }
        List<d2> listSubList = t0Var.R0().subList(0, iA);
        ArrayList arrayList = new ArrayList(v.y(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((d2) it.next()).getType());
        }
        return arrayList;
    }

    public static final vr.e f(j jVar, int i15, boolean z15) {
        return z15 ? jVar.Y(i15) : jVar.D(i15);
    }

    public static final List<d2> g(t0 t0Var, List<? extends t0> list, List<? extends t0> list2, List<zs.f> list3, t0 t0Var2, j jVar) {
        zs.f fVar;
        j jVar2;
        int i15 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (t0Var != null ? 1 : 0) + 1);
        List<? extends t0> list4 = list;
        ArrayList arrayList2 = new ArrayList(v.y(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(xt.d.d((t0) it.next()));
        }
        arrayList.addAll(arrayList2);
        cu.a.a(arrayList, t0Var != null ? xt.d.d(t0Var) : null);
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            t0 t0VarC = (t0) obj;
            if (list3 == null || (fVar = list3.get(i15)) == null || fVar.n()) {
                fVar = null;
            }
            if (fVar != null) {
                jVar2 = jVar;
                t0VarC = xt.d.C(t0VarC, wr.h.f214542p0.a(v.K0(t0VarC.getAnnotations(), new wr.l(jVar2, p.a.E, v0.f(oq.y.a(p.f183615m, new y(fVar.e()))), false, 8, null))));
            } else {
                jVar2 = jVar;
            }
            arrayList.add(xt.d.d(t0VarC));
            i15 = i16;
            jVar = jVar2;
        }
        arrayList.add(xt.d.d(t0Var2));
        return arrayList;
    }

    public static final tr.f h(t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        if (hVarC != null) {
            return i(hVarC);
        }
        return null;
    }

    public static final tr.f i(vr.m mVar) {
        if ((mVar instanceof vr.e) && j.C0(mVar)) {
            return j(ht.e.p(mVar));
        }
        return null;
    }

    private static final tr.f j(zs.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        return tr.g.f191729c.a().b(dVar.m().d(), dVar.j().e());
    }

    public static final t0 k(t0 t0Var) {
        p(t0Var);
        if (!t(t0Var)) {
            return null;
        }
        return t0Var.R0().get(a(t0Var)).getType();
    }

    public static final t0 l(t0 t0Var) {
        p(t0Var);
        return ((d2) v.x0(t0Var.R0())).getType();
    }

    public static final List<d2> m(t0 t0Var) {
        p(t0Var);
        List<d2> listR0 = t0Var.R0();
        return listR0.subList(a(t0Var) + (n(t0Var) ? 1 : 0), listR0.size() - 1);
    }

    public static final boolean n(t0 t0Var) {
        return p(t0Var) && t(t0Var);
    }

    public static final boolean o(vr.m mVar) {
        tr.f fVarI = i(mVar);
        return fr.t.c(fVarI, tr.f.a.f191725f) || fr.t.c(fVarI, tr.f.d.f191728f);
    }

    public static final boolean p(t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        return hVarC != null && o(hVarC);
    }

    public static final boolean q(t0 t0Var) {
        return fr.t.c(h(t0Var), tr.f.a.f191725f);
    }

    public static final boolean r(zs.d dVar) {
        return dVar.l(p.A) && fr.t.c(j(dVar), tr.f.a.f191725f);
    }

    public static final boolean s(t0 t0Var) {
        return fr.t.c(h(t0Var), tr.f.d.f191728f);
    }

    private static final boolean t(t0 t0Var) {
        return t0Var.getAnnotations().H(p.a.C) != null;
    }

    public static final wr.h u(wr.h hVar, j jVar, int i15) {
        zs.c cVar = p.a.D;
        return hVar.d2(cVar) ? hVar : wr.h.f214542p0.a(v.K0(hVar, new wr.l(jVar, cVar, v0.f(oq.y.a(p.f183619q, new ft.n(i15))), false, 8, null)));
    }

    public static final wr.h v(wr.h hVar, j jVar) {
        zs.c cVar = p.a.C;
        return hVar.d2(cVar) ? hVar : wr.h.f214542p0.a(v.K0(hVar, new wr.l(jVar, cVar, v0.i(), false, 8, null)));
    }
}
