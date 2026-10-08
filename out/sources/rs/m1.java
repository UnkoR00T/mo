package rs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.l2;
import st.o2;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f175684a;

    public m1(h hVar) {
        this.f175684a = hVar;
    }

    private final boolean f(st.t0 t0Var) {
        return l2.c(t0Var, l1.f175679a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(o2 o2Var) {
        vr.h hVarC = o2Var.T0().c();
        if (hVarC == null) {
            return Boolean.FALSE;
        }
        zs.f name = hVarC.getName();
        ur.c cVar = ur.c.f200031a;
        return Boolean.valueOf(fr.t.c(name, cVar.h().f()) && fr.t.c(ht.e.k(hVarC), cVar.h()));
    }

    private final st.t0 h(o1 o1Var, st.t0 t0Var, List<? extends st.t0> list, r1 r1Var, boolean z15) {
        return this.f175684a.a(t0Var, o1Var.g(t0Var, list, r1Var, z15), o1Var.D());
    }

    private final st.t0 i(vr.b bVar, wr.a aVar, boolean z15, ms.k kVar, js.c cVar, r1 r1Var, boolean z16, er.l<? super vr.b, ? extends st.t0> lVar) {
        o1 o1Var = new o1(aVar, z15, kVar, cVar, false, 16, null);
        st.t0 t0VarB = lVar.b(bVar);
        Collection<? extends vr.b> collectionE = bVar.e();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionE, 10));
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.b((vr.b) it.next()));
        }
        return h(o1Var, t0VarB, arrayList, r1Var, z16);
    }

    static /* synthetic */ st.t0 j(m1 m1Var, o1 o1Var, st.t0 t0Var, List list, r1 r1Var, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            r1Var = null;
        }
        r1 r1Var2 = r1Var;
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        return m1Var.h(o1Var, t0Var, list, r1Var2, z15);
    }

    static /* synthetic */ st.t0 k(m1 m1Var, vr.b bVar, wr.a aVar, boolean z15, ms.k kVar, js.c cVar, r1 r1Var, boolean z16, er.l lVar, int i15, Object obj) {
        return m1Var.i(bVar, aVar, z15, kVar, cVar, r1Var, (i15 & 32) != 0 ? false : z16, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01cd  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0207, code lost:
    
        if (r3 == null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends vr.b> D l(D r18, ms.k r19) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rs.m1.l(vr.b, ms.k):vr.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st.t0 m(vr.b bVar) {
        return bVar.R().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st.t0 n(vr.t1 t1Var, vr.b bVar) {
        return bVar.l().get(t1Var.getIndex()).getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st.t0 o(vr.b bVar) {
        return bVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(o2 o2Var) {
        return o2Var instanceof st.d1;
    }

    private final st.t0 t(vr.b bVar, vr.t1 t1Var, ms.k kVar, r1 r1Var, boolean z15, er.l<? super vr.b, ? extends st.t0> lVar) {
        ms.k kVarK;
        return i(bVar, t1Var, false, (t1Var == null || (kVarK = ms.c.k(kVar, t1Var.getAnnotations())) == null) ? kVar : kVarK, js.c.VALUE_PARAMETER, r1Var, z15, lVar);
    }

    private final <D extends vr.b> wr.h u(D d15, ms.k kVar) {
        vr.h hVarA = vr.s.a(d15);
        if (hVarA == null) {
            return d15.getAnnotations();
        }
        ns.n nVar = hVarA instanceof ns.n ? (ns.n) hVarA : null;
        List<qs.a> listZ0 = nVar != null ? nVar.Z0() : null;
        List<qs.a> list = listZ0;
        if (list == null || list.isEmpty()) {
            return d15.getAnnotations();
        }
        List<qs.a> list2 = listZ0;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ns.j(kVar, (qs.a) it.next(), true));
        }
        return wr.h.f214542p0.a(pq.v.J0(d15.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends vr.b> Collection<D> p(ms.k kVar, Collection<? extends D> collection) {
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(pq.v.y(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(l((vr.b) it.next(), kVar));
        }
        return arrayList;
    }

    public final st.t0 q(st.t0 t0Var, ms.k kVar) {
        st.t0 t0VarJ = j(this, new o1(null, false, kVar, js.c.TYPE_USE, true), t0Var, pq.v.n(), null, false, 12, null);
        return t0VarJ == null ? t0Var : t0VarJ;
    }

    public final List<st.t0> r(vr.m1 m1Var, List<? extends st.t0> list, ms.k kVar) {
        List<? extends st.t0> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        for (st.t0 t0Var : list2) {
            if (!xt.d.e(t0Var, k1.f175672a)) {
                st.t0 t0VarJ = j(this, new o1(m1Var, false, kVar, js.c.TYPE_PARAMETER_BOUNDS, false, 16, null), t0Var, pq.v.n(), null, false, 12, null);
                if (t0VarJ != null) {
                    t0Var = t0VarJ;
                }
            }
            arrayList.add(t0Var);
        }
        return arrayList;
    }
}
