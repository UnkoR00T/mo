package o8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Long, g> f143095a = new LinkedHashMap();

    public void a(g gVar) {
        long[] jArr = gVar.f143092e;
        if (jArr.length <= 0 || this.f143095a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f143095a.put(Long.valueOf(gVar.f143092e[0]), gVar);
    }

    public g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (g gVar : this.f143095a.values()) {
            arrayList.add(gVar.f143089b);
            arrayList2.add(gVar.f143090c);
            arrayList3.add(gVar.f143091d);
            arrayList4.add(gVar.f143092e);
        }
        return new g(ek.g.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), ek.i.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), ek.i.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), ek.i.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.f143095a.size();
    }
}
