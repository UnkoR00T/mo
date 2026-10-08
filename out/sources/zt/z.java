package zt;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f237286a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f237287b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(z zVar, String str) {
        return zVar.f237287b.getAndIncrement();
    }

    public final Map<String, Integer> b() {
        return this.f237286a;
    }

    public abstract int c(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, er.l<? super String, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> n<K, V, T> d(mr.c<KK> cVar) {
        return new n<>(f(cVar));
    }

    public final int e(String str) {
        return c(this.f237286a, str, new y(this));
    }

    public final <T extends K> int f(mr.c<T> cVar) {
        return e(cVar.C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Collection<Integer> h() {
        return this.f237286a.values();
    }
}
