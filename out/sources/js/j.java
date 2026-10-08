package js;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f104654a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<zs.c, zs.f> f104655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<zs.f, List<zs.f>> f104656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<zs.c> f104657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<zs.c> f104658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<zs.f> f104659f;

    static {
        zs.d dVar = sr.p.a.f183665s;
        oq.r rVarA = oq.y.a(k.d(dVar, "name"), sr.p.f183615m);
        oq.r rVarA2 = oq.y.a(k.d(dVar, "ordinal"), zs.f.l("ordinal"));
        oq.r rVarA3 = oq.y.a(k.c(sr.p.a.X, "size"), zs.f.l("size"));
        zs.c cVar = sr.p.a.f183632b0;
        Map<zs.c, zs.f> mapL = pq.v0.l(rVarA, rVarA2, rVarA3, oq.y.a(k.c(cVar, "size"), zs.f.l("size")), oq.y.a(k.d(sr.p.a.f183641g, "length"), zs.f.l("length")), oq.y.a(k.c(cVar, "keys"), zs.f.l("keySet")), oq.y.a(k.c(cVar, "values"), zs.f.l("values")), oq.y.a(k.c(cVar, "entries"), zs.f.l("entrySet")), oq.y.a(k.c(sr.p.a.P0, "size"), zs.f.l("length")), oq.y.a(k.c(sr.p.a.Q0, "size"), zs.f.l("length")), oq.y.a(k.c(sr.p.a.R0, "size"), zs.f.l("length")));
        f104655b = mapL;
        Set<Map.Entry<zs.c, zs.f>> setEntrySet = mapL.entrySet();
        ArrayList<oq.r> arrayList = new ArrayList(pq.v.y(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new oq.r(((zs.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (oq.r rVar : arrayList) {
            zs.f fVar = (zs.f) rVar.d();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((zs.f) rVar.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(pq.v0.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), pq.v.e0((Iterable) entry2.getValue()));
        }
        f104656c = linkedHashMap2;
        Map<zs.c, zs.f> map = f104655b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<zs.c, zs.f> entry3 : map.entrySet()) {
            linkedHashSet.add(ur.c.f200031a.n(entry3.getKey().d().i()).a().b(entry3.getValue()));
        }
        f104657d = linkedHashSet;
        Set<zs.c> setKeySet = f104655b.keySet();
        f104658e = setKeySet;
        Set<zs.c> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(pq.v.y(set, 10));
        Iterator<T> it4 = set.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((zs.c) it4.next()).f());
        }
        f104659f = pq.v.k1(arrayList3);
    }

    private j() {
    }

    public final Map<zs.c, zs.f> a() {
        return f104655b;
    }

    public final List<zs.f> b(zs.f fVar) {
        List<zs.f> list = f104656c.get(fVar);
        return list == null ? pq.v.n() : list;
    }

    public final Set<zs.c> c() {
        return f104658e;
    }

    public final Set<zs.f> d() {
        return f104659f;
    }
}
