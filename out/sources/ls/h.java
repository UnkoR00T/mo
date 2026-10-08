package ls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lt.k;
import ns.z0;
import oq.r;
import pq.v;
import st.t0;
import vr.t1;
import yr.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public static final List<t1> a(Collection<? extends t0> collection, Collection<? extends t1> collection2, vr.a aVar) {
        collection.size();
        collection2.size();
        List<r> listP1 = v.p1(collection, collection2);
        ArrayList arrayList = new ArrayList(v.y(listP1, 10));
        for (r rVar : listP1) {
            t0 t0Var = (t0) rVar.a();
            t1 t1Var = (t1) rVar.b();
            arrayList.add(new u0(aVar, null, t1Var.getIndex(), t1Var.getAnnotations(), t1Var.getName(), t0Var, t1Var.E0(), t1Var.v0(), t1Var.u0(), t1Var.y0() != null ? ht.e.s(aVar).i().k(t0Var) : null, t1Var.m()));
        }
        return arrayList;
    }

    public static final z0 b(vr.e eVar) {
        vr.e eVarX = ht.e.x(eVar);
        if (eVarX == null) {
            return null;
        }
        k kVarQ0 = eVarX.q0();
        z0 z0Var = kVarQ0 instanceof z0 ? (z0) kVarQ0 : null;
        return z0Var == null ? b(eVarX) : z0Var;
    }
}
