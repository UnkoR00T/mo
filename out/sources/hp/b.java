package hp;

import bp.i;
import bp.p;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class b<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f86141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<K, V> f86142b;

    public b(Map<K, V> map, bp.d dVar) {
        this.f86142b = map;
        this.f86141a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b<String, Object> a(bp.d dVar) throws IOException {
        Object objValueOf;
        if (dVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (i iVar : dVar.O4()) {
            bp.b bVarP4 = dVar.p4(iVar);
            if (bVarP4 instanceof p) {
                objValueOf = ((p) bVarP4).J3();
            } else if (bVarP4 instanceof bp.h) {
                objValueOf = Integer.valueOf(((bp.h) bVarP4).J3());
            } else if (bVarP4 instanceof i) {
                objValueOf = ((i) bVarP4).A3();
            } else if (bVarP4 instanceof bp.f) {
                objValueOf = Float.valueOf(((bp.f) bVarP4).i3());
            } else {
                if (!(bVarP4 instanceof bp.c)) {
                    throw new IOException("Error:unknown type of object to convert:" + bVarP4);
                }
                objValueOf = ((bp.c) bVarP4).A3() ? Boolean.TRUE : Boolean.FALSE;
            }
            map.put(iVar.A3(), objValueOf);
        }
        return new b<>(map, dVar);
    }

    @Override // java.util.Map
    public void clear() {
        this.f86141a.clear();
        this.f86142b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f86142b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f86142b.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return Collections.unmodifiableSet(this.f86142b.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f86141a.equals(this.f86141a);
        }
        return false;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f86142b.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f86141a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f86142b.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V put(K k15, V v15) {
        this.f86141a.Y4(i.J3((String) k15), ((c) v15).D1());
        return this.f86142b.put(k15, v15);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        this.f86141a.P4(i.J3((String) obj));
        return this.f86142b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f86141a.size();
    }

    public String toString() {
        return this.f86142b.toString();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f86142b.values();
    }
}
