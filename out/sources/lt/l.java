package lt;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l implements k {
    @Override // lt.k
    public Collection<? extends g1> a(zs.f fVar, ds.b bVar) {
        return pq.v.n();
    }

    @Override // lt.k
    public Set<zs.f> b() {
        Collection<vr.m> collectionF = f(d.f120110v, cu.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof g1) {
                linkedHashSet.add(((g1) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // lt.k
    public Collection<? extends z0> c(zs.f fVar, ds.b bVar) {
        return pq.v.n();
    }

    @Override // lt.k
    public Set<zs.f> d() {
        Collection<vr.m> collectionF = f(d.f120111w, cu.i.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof g1) {
                linkedHashSet.add(((g1) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        return null;
    }

    @Override // lt.n
    public Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        return pq.v.n();
    }

    @Override // lt.k
    public Set<zs.f> g() {
        return null;
    }
}
