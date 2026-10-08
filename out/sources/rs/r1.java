package rs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, i> f175714a;

    public r1(Map<Integer, i> map) {
        this.f175714a = map;
    }

    public final r1 a() {
        Map<Integer, i> map = this.f175714a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), i.c((i) entry.getValue(), null, null, false, true, 7, null));
        }
        return new r1(linkedHashMap);
    }

    public final Map<Integer, i> b() {
        return this.f175714a;
    }
}
