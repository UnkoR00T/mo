package lt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.t0;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends lt.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f120150d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f120152c;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final k a(String str, Collection<? extends t0> collection) {
            Collection<? extends t0> collection2 = collection;
            ArrayList arrayList = new ArrayList(pq.v.y(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((t0) it.next()).r());
            }
            cu.j<k> jVarB = bu.a.b(arrayList);
            k kVarB = b.f120085d.b(str, jVarB);
            return jVarB.size() <= 1 ? kVarB : new x(str, kVarB, null);
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, k kVar, fr.k kVar2) {
        this(str, kVar);
    }

    public static final k m(String str, Collection<? extends t0> collection) {
        return f120150d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.a n(vr.a aVar) {
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.a o(g1 g1Var) {
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.a p(z0 z0Var) {
        return z0Var;
    }

    @Override // lt.a, lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        return dt.r.b(super.a(fVar, bVar), u.f120147a);
    }

    @Override // lt.a, lt.k
    public Collection<z0> c(zs.f fVar, ds.b bVar) {
        return dt.r.b(super.c(fVar, bVar), v.f120148a);
    }

    @Override // lt.a, lt.n
    public Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        Collection<vr.m> collectionF = super.f(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionF) {
            if (((vr.m) obj) instanceof vr.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        oq.r rVar = new oq.r(arrayList, arrayList2);
        List list = (List) rVar.a();
        return pq.v.L0(dt.r.b(list, w.f120149a), (List) rVar.b());
    }

    @Override // lt.a
    protected k i() {
        return this.f120152c;
    }

    private x(String str, k kVar) {
        this.f120151b = str;
        this.f120152c = kVar;
    }
}
