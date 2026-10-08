package yk;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class u implements hl.d, hl.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<hl.b<Object>, Executor>> f227517a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<hl.a<?>> f227518b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f227519c;

    u(Executor executor) {
        this.f227519c = executor;
    }

    private synchronized Set<Map.Entry<hl.b<Object>, Executor>> d(hl.a<?> aVar) {
        ConcurrentHashMap<hl.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f227517a.get(aVar.a());
        } catch (Throwable th4) {
            throw th4;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // hl.d
    public <T> void a(Class<T> cls, hl.b<? super T> bVar) {
        f(cls, this.f227519c, bVar);
    }

    void c() {
        Queue<hl.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f227518b;
                if (queue != null) {
                    this.f227518b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (queue != null) {
            Iterator<hl.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    public void e(final hl.a<?> aVar) {
        c0.b(aVar);
        synchronized (this) {
            try {
                Queue<hl.a<?>> queue = this.f227518b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<hl.b<Object>, Executor> entry : d(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: yk.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((hl.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public synchronized <T> void f(Class<T> cls, Executor executor, hl.b<? super T> bVar) {
        try {
            c0.b(cls);
            c0.b(bVar);
            c0.b(executor);
            if (!this.f227517a.containsKey(cls)) {
                this.f227517a.put(cls, new ConcurrentHashMap<>());
            }
            this.f227517a.get(cls).put(bVar, executor);
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
