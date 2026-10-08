package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l0<?, ?> f12046b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12047a;

    static {
        l0<?, ?> l0Var = new l0<>();
        f12046b = l0Var;
        l0Var.p();
    }

    private l0() {
        this.f12047a = true;
    }

    static <K, V> int b(Map<K, V> map) {
        int iC = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return z.d((byte[]) obj);
        }
        if (obj instanceof z.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void e(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            z.a(obj);
            z.a(map.get(obj));
        }
    }

    public static <K, V> l0<K, V> g() {
        return (l0<K, V>) f12046b;
    }

    private void i() {
        if (!o()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean m(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean n(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && n(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean o() {
        return this.f12047a;
    }

    public void p() {
        this.f12047a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k15, V v15) {
        i();
        z.a(k15);
        z.a(v15);
        return (V) super.put(k15, v15);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        i();
        e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    public void s(l0<K, V> l0Var) {
        i();
        if (l0Var.isEmpty()) {
            return;
        }
        putAll(l0Var);
    }

    public l0<K, V> t() {
        return isEmpty() ? new l0<>() : new l0<>(this);
    }

    private l0(Map<K, V> map) {
        super(map);
        this.f12047a = true;
    }
}
