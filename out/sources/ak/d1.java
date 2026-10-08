package ak;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface d1<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    boolean c(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k15);

    Set<K> keySet();

    boolean put(K k15, V v15);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
