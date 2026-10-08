package io.sentry.clientreport;

import io.sentry.l;
import io.sentry.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r<Map<d, AtomicLong>> f94777a = new r<>(new r.a() { // from class: io.sentry.clientreport.a
        @Override // io.sentry.util.r.a
        public final Object a() {
            return b.c();
        }
    });

    public static /* synthetic */ Map c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : f.values()) {
            for (l lVar : l.values()) {
                concurrentHashMap.put(new d(fVar.getReason(), lVar.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.i
    public void a(d dVar, Long l15) {
        AtomicLong atomicLong = this.f94777a.a().get(dVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l15.longValue());
        }
    }

    @Override // io.sentry.clientreport.i
    public List<g> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<d, AtomicLong> entry : this.f94777a.a().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new g(entry.getKey().b(), entry.getKey().a(), lValueOf));
            }
        }
        return arrayList;
    }
}
