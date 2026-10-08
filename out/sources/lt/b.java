package lt;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pq.e1;
import vr.e0;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f120085d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k[] f120087c;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final k a(String str, Iterable<? extends k> iterable) {
            cu.j jVar = new cu.j();
            for (k kVar : iterable) {
                if (kVar != k.b.f120132b) {
                    if (kVar instanceof b) {
                        pq.v.E(jVar, ((b) kVar).f120087c);
                    } else {
                        jVar.add(kVar);
                    }
                }
            }
            return b(str, jVar);
        }

        public final k b(String str, List<? extends k> list) {
            int size = list.size();
            if (size != 0) {
                return size != 1 ? new b(str, (k[]) list.toArray(new k[0]), null) : list.get(0);
            }
            return k.b.f120132b;
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, k[] kVarArr, fr.k kVar) {
        this(str, kVarArr);
    }

    @Override // lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        k[] kVarArr = this.f120087c;
        int length = kVarArr.length;
        if (length == 0) {
            return pq.v.n();
        }
        if (length == 1) {
            return kVarArr[0].a(fVar, bVar);
        }
        Collection<g1> collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = bu.a.a(collectionA, kVar.a(fVar, bVar));
        }
        return collectionA == null ? e1.e() : collectionA;
    }

    @Override // lt.k
    public Set<zs.f> b() {
        k[] kVarArr = this.f120087c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            pq.v.D(linkedHashSet, kVar.b());
        }
        return linkedHashSet;
    }

    @Override // lt.k
    public Collection<z0> c(zs.f fVar, ds.b bVar) {
        k[] kVarArr = this.f120087c;
        int length = kVarArr.length;
        if (length == 0) {
            return pq.v.n();
        }
        if (length == 1) {
            return kVarArr[0].c(fVar, bVar);
        }
        Collection<z0> collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = bu.a.a(collectionA, kVar.c(fVar, bVar));
        }
        return collectionA == null ? e1.e() : collectionA;
    }

    @Override // lt.k
    public Set<zs.f> d() {
        k[] kVarArr = this.f120087c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            pq.v.D(linkedHashSet, kVar.d());
        }
        return linkedHashSet;
    }

    @Override // lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        vr.h hVar = null;
        for (k kVar : this.f120087c) {
            vr.h hVarE = kVar.e(fVar, bVar);
            if (hVarE != null) {
                if (!(hVarE instanceof vr.i) || !((e0) hVarE).o0()) {
                    return hVarE;
                }
                if (hVar == null) {
                    hVar = hVarE;
                }
            }
        }
        return hVar;
    }

    @Override // lt.n
    public Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        k[] kVarArr = this.f120087c;
        int length = kVarArr.length;
        if (length == 0) {
            return pq.v.n();
        }
        if (length == 1) {
            return kVarArr[0].f(dVar, lVar);
        }
        Collection<vr.m> collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = bu.a.a(collectionA, kVar.f(dVar, lVar));
        }
        return collectionA == null ? e1.e() : collectionA;
    }

    @Override // lt.k
    public Set<zs.f> g() {
        return m.a(pq.n.Z(this.f120087c));
    }

    public String toString() {
        return this.f120086b;
    }

    private b(String str, k[] kVarArr) {
        this.f120086b = str;
        this.f120087c = kVarArr;
    }
}
