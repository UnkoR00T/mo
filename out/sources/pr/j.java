package pr;

import java.util.concurrent.ConcurrentHashMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lpr/j;", "V", "Lpr/b;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Ler/l;)V", "key", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ler/l;", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class j<V> extends b<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Class<?>, V> compute;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<Class<?>, V> cache = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public j(er.l<? super Class<?>, ? extends V> lVar) {
        this.compute = lVar;
    }

    @Override // pr.b
    public V a(Class<?> key) {
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v15 = (V) concurrentHashMap.get(key);
        if (v15 != null) {
            return v15;
        }
        V vB = this.compute.b(key);
        V v16 = (V) concurrentHashMap.putIfAbsent(key, vB);
        return v16 == null ? vB : v16;
    }
}
