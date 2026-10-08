package js;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f104728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<zs.b, zs.b> f104729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<zs.c, zs.c> f104730c;

    static {
        r rVar = new r();
        f104728a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f104729b = linkedHashMap;
        zs.i iVar = zs.i.f236674a;
        rVar.c(iVar.m(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.o(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.n(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        zs.b.a aVar = zs.b.f236634d;
        rVar.c(aVar.c(new zs.c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new zs.c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(oq.y.a(((zs.b) entry.getKey()).a(), ((zs.b) entry.getValue()).a()));
        }
        f104730c = pq.v0.s(arrayList);
    }

    private r() {
    }

    private final List<zs.b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(zs.b.f236634d.c(new zs.c(str)));
        }
        return arrayList;
    }

    private final void c(zs.b bVar, List<zs.b> list) {
        Map<zs.b, zs.b> map = f104729b;
        for (Object obj : list) {
            map.put((zs.b) obj, bVar);
        }
    }

    public final zs.c b(zs.c cVar) {
        return f104730c.get(cVar);
    }
}
