package js;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b<wr.c> {
    public d(e0 e0Var) {
        super(e0Var);
    }

    private final List<String> B(ft.g<?> gVar) {
        if (!(gVar instanceof ft.b)) {
            return gVar instanceof ft.k ? pq.v.e(((ft.k) gVar).c().j()) : pq.v.n();
        }
        List<? extends ft.g<?>> listB = ((ft.b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, B((ft.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // js.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable<wr.c> m(wr.c cVar) {
        wr.h annotations;
        vr.e eVarL = ht.e.l(cVar);
        return (eVarL == null || (annotations = eVarL.getAnnotations()) == null) ? pq.v.n() : annotations;
    }

    @Override // js.b
    public boolean o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // js.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<String> c(wr.c cVar, boolean z15) {
        Map<zs.f, ft.g<?>> mapA = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<zs.f, ft.g<?>> entry : mapA.entrySet()) {
            pq.v.D(arrayList, (!z15 || fr.t.c(entry.getKey(), j0.f104662c)) ? B(entry.getValue()) : pq.v.n());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // js.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public zs.c k(wr.c cVar) {
        return cVar.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // js.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(wr.c cVar) {
        return ht.e.l(cVar);
    }
}
