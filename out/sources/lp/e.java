package lp;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<g, SoftReference<mo.b>> f119087a = new ConcurrentHashMap();

    public void a(g gVar, mo.b bVar) {
        this.f119087a.put(gVar, new SoftReference<>(bVar));
    }

    public mo.b b(g gVar) {
        SoftReference<mo.b> softReference = this.f119087a.get(gVar);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }
}
