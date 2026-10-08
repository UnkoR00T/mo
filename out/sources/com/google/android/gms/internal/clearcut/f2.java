package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f2<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f2 f29334b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29335a;

    static {
        f2 f2Var = new f2();
        f29334b = f2Var;
        f2Var.f29335a = false;
    }

    private f2() {
        this.f29335a = true;
    }

    public static <K, V> f2<K, V> e() {
        return f29334b;
    }

    private final void i() {
        if (!this.f29335a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int m(Object obj) {
        if (obj instanceof byte[]) {
            return h1.b((byte[]) obj);
        }
        if (obj instanceof i1) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final boolean b() {
        return this.f29335a;
    }

    public final void c(f2<K, V> f2Var) {
        i();
        if (f2Var.isEmpty()) {
            return;
        }
        putAll(f2Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z15;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z15 = true;
            } else {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<K, V> next = it.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                Object obj2 = map.get(next.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z15 = true;
                        }
                    }
                }
                z15 = false;
            }
            if (z15) {
                return true;
            }
        }
        return false;
    }

    public final f2<K, V> g() {
        return isEmpty() ? new f2<>() : new f2<>(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM += m(entry.getValue()) ^ m(entry.getKey());
        }
        return iM;
    }

    public final void n() {
        this.f29335a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k15, V v15) {
        i();
        h1.a(k15);
        h1.a(v15);
        return (V) super.put(k15, v15);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (K k15 : map.keySet()) {
            h1.a(k15);
            h1.a(map.get(k15));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    private f2(Map<K, V> map) {
        super(map);
        this.f29335a = true;
    }
}
