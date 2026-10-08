package lt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import vr.l1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f120125b;

    public g(k kVar) {
        this.f120125b = kVar;
    }

    @Override // lt.l, lt.k
    public Set<zs.f> b() {
        return this.f120125b.b();
    }

    @Override // lt.l, lt.k
    public Set<zs.f> d() {
        return this.f120125b.d();
    }

    @Override // lt.l, lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        vr.h hVarE = this.f120125b.e(fVar, bVar);
        if (hVarE != null) {
            vr.e eVar = hVarE instanceof vr.e ? (vr.e) hVarE : null;
            if (eVar != null) {
                return eVar;
            }
            if (hVarE instanceof l1) {
                return (l1) hVarE;
            }
        }
        return null;
    }

    @Override // lt.l, lt.k
    public Set<zs.f> g() {
        return this.f120125b.g();
    }

    @Override // lt.l, lt.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<vr.h> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        d dVarN = dVar.n(d.f120091c.c());
        if (dVarN == null) {
            return pq.v.n();
        }
        Collection<vr.m> collectionF = this.f120125b.f(dVarN, lVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionF) {
            if (obj instanceof vr.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f120125b;
    }
}
