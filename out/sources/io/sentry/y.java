package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Throwable, Object> f95969a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f95970b;

    public y(q7 q7Var) {
        this.f95970b = (q7) io.sentry.util.v.c(q7Var, "options are required");
    }

    private static List<Throwable> a(Throwable th4) {
        ArrayList arrayList = new ArrayList();
        while (th4.getCause() != null) {
            arrayList.add(th4.getCause());
            th4 = th4.getCause();
        }
        return arrayList;
    }

    private static <T> boolean c(Map<T, Object> map, List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, j0 j0Var) {
        if (!this.f95970b.isEnableDeduplication()) {
            this.f95970b.getLogger().c(b7.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return r6Var;
        }
        Throwable thO = r6Var.O();
        if (thO == null) {
            return r6Var;
        }
        if (this.f95969a.containsKey(thO) || c(this.f95969a, a(thO))) {
            this.f95970b.getLogger().c(b7.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", r6Var.G());
            return null;
        }
        this.f95969a.put(thO, null);
        return r6Var;
    }
}
