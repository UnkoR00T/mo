package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qs.g f138051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<qs.q, Boolean> f138052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final er.l<qs.r, Boolean> f138053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<zs.f, List<qs.r>> f138054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<zs.f, qs.n> f138055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<zs.f, qs.w> f138056f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(qs.g gVar, er.l<? super qs.q, Boolean> lVar) {
        this.f138051a = gVar;
        this.f138052b = lVar;
        a aVar = new a(this);
        this.f138053c = aVar;
        eu.h hVarX = eu.k.x(pq.v.a0(gVar.E()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hVarX) {
            zs.f name = ((qs.r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f138054d = linkedHashMap;
        eu.h hVarX2 = eu.k.x(pq.v.a0(this.f138051a.z()), this.f138052b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : hVarX2) {
            linkedHashMap2.put(((qs.n) obj2).getName(), obj2);
        }
        this.f138055e = linkedHashMap2;
        Collection<qs.w> collectionS = this.f138051a.s();
        er.l<qs.q, Boolean> lVar2 = this.f138052b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionS) {
            if (lVar2.b((qs.q) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((qs.w) obj4).getName(), obj4);
        }
        this.f138056f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(b bVar, qs.r rVar) {
        return bVar.f138052b.b(rVar).booleanValue() && !qs.p.c(rVar);
    }

    @Override // ns.c
    public Set<zs.f> a() {
        eu.h hVarX = eu.k.x(pq.v.a0(this.f138051a.E()), this.f138053c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarX.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((qs.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // ns.c
    public Set<zs.f> b() {
        return this.f138056f.keySet();
    }

    @Override // ns.c
    public Set<zs.f> c() {
        eu.h hVarX = eu.k.x(pq.v.a0(this.f138051a.z()), this.f138052b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarX.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((qs.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // ns.c
    public Collection<qs.r> d(zs.f fVar) {
        List<qs.r> list = this.f138054d.get(fVar);
        return list != null ? list : pq.v.n();
    }

    @Override // ns.c
    public qs.w e(zs.f fVar) {
        return this.f138056f.get(fVar);
    }

    @Override // ns.c
    public qs.n f(zs.f fVar) {
        return this.f138055e.get(fVar);
    }
}
