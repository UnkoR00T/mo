package ak;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i0<K, V> extends j0 implements Map<K, V> {
    protected i0() {
    }

    @Override // java.util.Map
    public void clear() {
        g().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return g().containsKey(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return g().entrySet();
    }

    protected abstract Map<K, V> g();

    @Override // java.util.Map
    public V get(Object obj) {
        return g().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return g().isEmpty();
    }

    protected boolean k(Object obj) {
        return b1.f(this, obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return g().keySet();
    }

    protected boolean l(Object obj) {
        return b1.g(this, obj);
    }

    protected int n() {
        return b2.d(entrySet());
    }

    @Override // java.util.Map
    public V put(K k15, V v15) {
        return g().put(k15, v15);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        g().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return g().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return g().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return g().values();
    }
}
