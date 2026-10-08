package pr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00000\u00000\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016\"<\u0010#\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 j\u0002`!\u0012\u0004\u0012\u00020\u000f0\u001f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016*0\b\u0002\u0010$\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 ¨\u0006%"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lpr/f0;", "m", "(Ljava/lang/Class;)Lpr/f0;", "Lmr/f;", "n", "(Ljava/lang/Class;)Lmr/f;", "", "Lmr/r;", "arguments", "", "isMarkedNullable", "Lmr/p;", "k", "(Ljava/lang/Class;Ljava/util/List;Z)Lmr/p;", "l", "Lpr/b;", "kotlin.jvm.PlatformType", "a", "Lpr/b;", "K_CLASS_CACHE", "Lpr/b2;", "b", "K_PACKAGE_CACHE", "c", "CACHE_FOR_BASE_CLASSIFIERS", "d", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Loq/r;", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b<f0<? extends Object>> f161858a = c.a(d.f161777a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b<b2> f161859b = c.a(e.f161788a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b<mr.p> f161860c = c.a(f.f161800a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b<mr.p> f161861d = c.a(g.f161831a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b<ConcurrentHashMap<oq.r<List<mr.r>, Boolean>, mr.p>> f161862e = c.a(h.f161851a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr.p a(Class cls) {
        return nr.e.b(m(cls), pq.v.n(), false, pq.v.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class cls) {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr.p c(Class cls) {
        return nr.e.b(m(cls), pq.v.n(), true, pq.v.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 d(Class cls) {
        return new f0(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b2 e(Class cls) {
        return new b2(cls);
    }

    public static final <T> mr.p k(Class<T> cls, List<mr.r> list, boolean z15) {
        if (list.isEmpty()) {
            return z15 ? f161861d.a(cls) : f161860c.a(cls);
        }
        return l(cls, list, z15);
    }

    private static final <T> mr.p l(Class<T> cls, List<mr.r> list, boolean z15) {
        ConcurrentHashMap<oq.r<List<mr.r>, Boolean>, mr.p> concurrentHashMapA = f161862e.a(cls);
        oq.r<List<mr.r>, Boolean> rVarA = oq.y.a(list, Boolean.valueOf(z15));
        mr.p pVar = concurrentHashMapA.get(rVarA);
        if (pVar == null) {
            mr.p pVarB = nr.e.b(m(cls), list, z15, pq.v.n());
            mr.p pVarPutIfAbsent = concurrentHashMapA.putIfAbsent(rVarA, pVarB);
            pVar = pVarPutIfAbsent == null ? pVarB : pVarPutIfAbsent;
        }
        return pVar;
    }

    public static final <T> f0<T> m(Class<T> cls) {
        return (f0) f161858a.a(cls);
    }

    public static final <T> mr.f n(Class<T> cls) {
        return f161859b.a(cls);
    }
}
