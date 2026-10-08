package be;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<zd.f, l<?>> f18808a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<zd.f, l<?>> f18809b = new HashMap();

    s() {
    }

    private Map<zd.f, l<?>> b(boolean z15) {
        return z15 ? this.f18809b : this.f18808a;
    }

    l<?> a(zd.f fVar, boolean z15) {
        return b(z15).get(fVar);
    }

    void c(zd.f fVar, l<?> lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    void d(zd.f fVar, l<?> lVar) {
        Map<zd.f, l<?>> mapB = b(lVar.p());
        if (lVar.equals(mapB.get(fVar))) {
            mapB.remove(fVar);
        }
    }
}
