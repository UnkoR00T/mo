package vr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import st.d2;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 {
    public static final x0 d(st.t0 t0Var) {
        h hVarC = t0Var.T0().c();
        return e(t0Var, hVarC instanceof i ? (i) hVarC : null, 0);
    }

    private static final x0 e(st.t0 t0Var, i iVar, int i15) {
        if (iVar == null || ut.l.m(iVar)) {
            return null;
        }
        int size = iVar.v().size() + i15;
        if (iVar.E()) {
            List<d2> listSubList = t0Var.R0().subList(i15, size);
            m mVarB = iVar.b();
            return new x0(iVar, listSubList, e(t0Var, mVarB instanceof i ? (i) mVarB : null, size));
        }
        if (size != t0Var.R0().size()) {
            dt.i.E(iVar);
        }
        return new x0(iVar, t0Var.R0().subList(i15, t0Var.R0().size()), null);
    }

    private static final c f(m1 m1Var, m mVar, int i15) {
        return new c(m1Var, mVar, i15);
    }

    public static final List<m1> g(i iVar) {
        List<m1> listN;
        m next;
        st.x1 x1VarO;
        List<m1> listV = iVar.v();
        if (!iVar.E() && !(iVar.b() instanceof a)) {
            return listV;
        }
        List listP = eu.k.P(eu.k.C(eu.k.x(eu.k.N(ht.e.u(iVar), n1.f208069a), o1.f208070a), p1.f208071a));
        Iterator<m> it = ht.e.u(iVar).iterator();
        do {
            listN = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof e));
        e eVar = (e) next;
        if (eVar != null && (x1VarO = eVar.o()) != null) {
            listN = x1VarO.getParameters();
        }
        if (listN == null) {
            listN = pq.v.n();
        }
        if (listP.isEmpty() && listN.isEmpty()) {
            return iVar.v();
        }
        List listL0 = pq.v.L0(listP, listN);
        ArrayList arrayList = new ArrayList(pq.v.y(listL0, 10));
        Iterator it4 = listL0.iterator();
        while (it4.hasNext()) {
            arrayList.add(f((m1) it4.next(), iVar, listV.size()));
        }
        return pq.v.L0(listV, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(m mVar) {
        return mVar instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(m mVar) {
        return !(mVar instanceof l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eu.h j(m mVar) {
        return pq.v.a0(((a) mVar).getTypeParameters());
    }
}
