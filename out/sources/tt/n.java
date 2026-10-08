package tt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import st.d2;
import st.o2;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements et.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f192132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private er.a<? extends List<? extends o2>> f192133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f192134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m1 f192135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oq.k f192136e;

    public n(d2 d2Var, er.a<? extends List<? extends o2>> aVar, n nVar, m1 m1Var) {
        this.f192132a = d2Var;
        this.f192133b = aVar;
        this.f192134c = nVar;
        this.f192135d = m1Var;
        this.f192136e = oq.l.b(oq.o.PUBLICATION, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(n nVar) {
        er.a<? extends List<? extends o2>> aVar = nVar.f192133b;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    private final List<o2> m() {
        return (List) this.f192136e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(n nVar, g gVar) {
        List<o2> listQ = nVar.q();
        ArrayList arrayList = new ArrayList(pq.v.y(listQ, 10));
        Iterator<T> it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((o2) it.next()).d1(gVar));
        }
        return arrayList;
    }

    @Override // st.x1
    public vr.h c() {
        return null;
    }

    @Override // st.x1
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fr.t.c(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        n nVar = (n) obj;
        n nVar2 = this.f192134c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f192134c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // st.x1
    public List<m1> getParameters() {
        return pq.v.n();
    }

    public int hashCode() {
        n nVar = this.f192134c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    @Override // st.x1
    public sr.j i() {
        return xt.d.n(v().getType());
    }

    @Override // st.x1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<o2> q() {
        List<o2> listM = m();
        return listM == null ? pq.v.n() : listM;
    }

    public final void n(List<? extends o2> list) {
        this.f192133b = new l(list);
    }

    @Override // st.x1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public n a(g gVar) {
        d2 d2VarA = v().a(gVar);
        m mVar = this.f192133b != null ? new m(this, gVar) : null;
        n nVar = this.f192134c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(d2VarA, mVar, nVar, this.f192135d);
    }

    public String toString() {
        return "CapturedType(" + v() + ')';
    }

    @Override // et.b
    public d2 v() {
        return this.f192132a;
    }

    public /* synthetic */ n(d2 d2Var, er.a aVar, n nVar, m1 m1Var, int i15, fr.k kVar) {
        this(d2Var, (i15 & 2) != 0 ? null : aVar, (i15 & 4) != 0 ? null : nVar, (i15 & 8) != 0 ? null : m1Var);
    }

    public /* synthetic */ n(d2 d2Var, List list, n nVar, int i15, fr.k kVar) {
        this(d2Var, list, (i15 & 4) != 0 ? null : nVar);
    }

    public n(d2 d2Var, List<? extends o2> list, n nVar) {
        this(d2Var, new k(list), nVar, null, 8, null);
    }
}
