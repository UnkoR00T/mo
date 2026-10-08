package pq;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0015\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\t\u001aa\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001aS\u0010\u001d\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001b*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00162\u0006\u0010\u001c\u001a\u00028\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aU\u0010\u001f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001b*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u001c\u001a\u00028\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b!\u0010\"\u001a9\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b#\u0010\"\u001aN\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b%\u0010&\u001aP\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010'\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002¢\u0006\u0004\b(\u0010)\u001a7\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b*\u0010\"¨\u0006+"}, d2 = {"K", "V", "", "i", "()Ljava/util/Map;", "", "Loq/r;", "pairs", "l", "([Loq/r;)Ljava/util/Map;", "", "m", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "k", "([Loq/r;)Ljava/util/HashMap;", "key", "j", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Loq/i0;", "r", "(Ljava/util/Map;[Loq/r;)V", "", "q", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "s", "(Ljava/lang/Iterable;)Ljava/util/Map;", "M", "destination", "t", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "v", "([Loq/r;Ljava/util/Map;)Ljava/util/Map;", "u", "(Ljava/util/Map;)Ljava/util/Map;", "w", "pair", "p", "(Ljava/util/Map;Loq/r;)Ljava/util/Map;", "map", "o", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "n", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class y0 extends x0 {
    public static <K, V> Map<K, V> i() {
        return j0.f161718a;
    }

    public static <K, V> V j(Map<K, ? extends V> map, K k15) {
        return (V) w0.a(map, k15);
    }

    public static <K, V> HashMap<K, V> k(oq.r<? extends K, ? extends V>... rVarArr) {
        HashMap<K, V> map = new HashMap<>(x0.e(rVarArr.length));
        r(map, rVarArr);
        return map;
    }

    public static <K, V> Map<K, V> l(oq.r<? extends K, ? extends V>... rVarArr) {
        return rVarArr.length > 0 ? v(rVarArr, new LinkedHashMap(x0.e(rVarArr.length))) : i();
    }

    public static <K, V> Map<K, V> m(oq.r<? extends K, ? extends V>... rVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(x0.e(rVarArr.length));
        r(linkedHashMap, rVarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> n(Map<K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : x0.g(map);
        }
        return i();
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map, oq.r<? extends K, ? extends V> rVar) {
        if (map.isEmpty()) {
            return x0.f(rVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(rVar.c(), rVar.d());
        return linkedHashMap;
    }

    public static final <K, V> void q(Map<? super K, ? super V> map, Iterable<? extends oq.r<? extends K, ? extends V>> iterable) {
        for (oq.r<? extends K, ? extends V> rVar : iterable) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static final <K, V> void r(Map<? super K, ? super V> map, oq.r<? extends K, ? extends V>[] rVarArr) {
        for (oq.r<? extends K, ? extends V> rVar : rVarArr) {
            map.put(rVar.a(), rVar.b());
        }
    }

    public static <K, V> Map<K, V> s(Iterable<? extends oq.r<? extends K, ? extends V>> iterable) {
        if (!(iterable instanceof Collection)) {
            return n(t(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return t(iterable, new LinkedHashMap(x0.e(collection.size())));
        }
        return x0.f((oq.r) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M t(Iterable<? extends oq.r<? extends K, ? extends V>> iterable, M m15) {
        q(m15, iterable);
        return m15;
    }

    public static <K, V> Map<K, V> u(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            return size != 1 ? w(map) : x0.g(map);
        }
        return i();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M v(oq.r<? extends K, ? extends V>[] rVarArr, M m15) {
        r(m15, rVarArr);
        return m15;
    }

    public static <K, V> Map<K, V> w(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap(map);
    }
}
