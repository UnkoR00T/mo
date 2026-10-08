package ak;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class c<K, V> extends d<K, V> implements z0<K, V> {
    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // ak.d
    <E> Collection<E> C(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // ak.d
    Collection<V> D(K k15, Collection<V> collection) {
        return E(k15, (List) collection, null);
    }

    @Override // ak.d, ak.d1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k15) {
        return (List) super.get(k15);
    }

    @Override // ak.g, ak.d1
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // ak.g
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ak.d, ak.d1
    public boolean put(K k15, V v15) {
        return super.put(k15, v15);
    }
}
