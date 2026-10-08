package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pq.e1;
import vr.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements lt.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f138075f = {fr.q0.j(new fr.h0(f.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ms.k f138076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f138077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f138078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.i f138079e;

    public f(ms.k kVar, qs.u uVar, d0 d0Var) {
        this.f138076b = kVar;
        this.f138077c = d0Var;
        this.f138078d = new g0(kVar, uVar, d0Var);
        this.f138079e = kVar.e().d(new e(this));
    }

    private final lt.k[] j() {
        return (lt.k[]) rt.m.a(this.f138079e, this, f138075f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lt.k[] k(f fVar) {
        Collection<ss.x> collectionValues = fVar.f138077c.U0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            lt.k kVarC = fVar.f138076b.a().b().c(fVar.f138077c, (ss.x) it.next());
            if (kVarC != null) {
                arrayList.add(kVarC);
            }
        }
        return (lt.k[]) bu.a.b(arrayList).toArray(new lt.k[0]);
    }

    @Override // lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        l(fVar, bVar);
        g0 g0Var = this.f138078d;
        lt.k[] kVarArrJ = j();
        Collection<? extends g1> collectionA = g0Var.a(fVar, bVar);
        int length = kVarArrJ.length;
        int i15 = 0;
        Collection collection = collectionA;
        while (i15 < length) {
            Collection collectionA2 = bu.a.a(collection, kVarArrJ[i15].a(fVar, bVar));
            i15++;
            collection = collectionA2;
        }
        return collection == null ? e1.e() : collection;
    }

    @Override // lt.k
    public Set<zs.f> b() {
        lt.k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (lt.k kVar : kVarArrJ) {
            pq.v.D(linkedHashSet, kVar.b());
        }
        linkedHashSet.addAll(this.f138078d.b());
        return linkedHashSet;
    }

    @Override // lt.k
    public Collection<vr.z0> c(zs.f fVar, ds.b bVar) {
        l(fVar, bVar);
        g0 g0Var = this.f138078d;
        lt.k[] kVarArrJ = j();
        Collection<? extends vr.z0> collectionC = g0Var.c(fVar, bVar);
        int length = kVarArrJ.length;
        int i15 = 0;
        Collection collection = collectionC;
        while (i15 < length) {
            Collection collectionA = bu.a.a(collection, kVarArrJ[i15].c(fVar, bVar));
            i15++;
            collection = collectionA;
        }
        return collection == null ? e1.e() : collection;
    }

    @Override // lt.k
    public Set<zs.f> d() {
        lt.k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (lt.k kVar : kVarArrJ) {
            pq.v.D(linkedHashSet, kVar.d());
        }
        linkedHashSet.addAll(this.f138078d.d());
        return linkedHashSet;
    }

    @Override // lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        l(fVar, bVar);
        vr.e eVarL0 = this.f138078d.e(fVar, bVar);
        if (eVarL0 != null) {
            return eVarL0;
        }
        vr.h hVar = null;
        for (lt.k kVar : j()) {
            vr.h hVarE = kVar.e(fVar, bVar);
            if (hVarE != null) {
                if (!(hVarE instanceof vr.i) || !((vr.e0) hVarE).o0()) {
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
    public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        g0 g0Var = this.f138078d;
        lt.k[] kVarArrJ = j();
        Collection<vr.m> collectionF = g0Var.f(dVar, lVar);
        for (lt.k kVar : kVarArrJ) {
            collectionF = bu.a.a(collectionF, kVar.f(dVar, lVar));
        }
        return collectionF == null ? e1.e() : collectionF;
    }

    @Override // lt.k
    public Set<zs.f> g() {
        Set<zs.f> setA = lt.m.a(pq.n.Z(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f138078d.g());
        return setA;
    }

    public final g0 i() {
        return this.f138078d;
    }

    public void l(zs.f fVar, ds.b bVar) {
        cs.a.b(this.f138076b.a().l(), bVar, this.f138077c, fVar);
    }

    public String toString() {
        return "scope for " + this.f138077c;
    }
}
