package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o3<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o3 f31202b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31203a;

    static {
        o3 o3Var = new o3();
        f31202b = o3Var;
        o3Var.f31203a = false;
    }

    private o3() {
        this.f31203a = true;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return p2.j((byte[]) obj);
        }
        if (obj instanceof o2) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> o3<K, V> c() {
        return f31202b;
    }

    private final void n() {
        if (!this.f31203a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        super.clear();
    }

    public final void e(o3<K, V> o3Var) {
        n();
        if (o3Var.isEmpty()) {
            return;
        }
        putAll(o3Var);
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

    public final o3<K, V> g() {
        return isEmpty() ? new o3<>() : new o3<>(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public final void i() {
        this.f31203a = false;
    }

    public final boolean m() {
        return this.f31203a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k15, V v15) {
        n();
        p2.d(k15);
        p2.d(v15);
        return (V) super.put(k15, v15);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        n();
        for (K k15 : map.keySet()) {
            p2.d(k15);
            p2.d(map.get(k15));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        n();
        return (V) super.remove(obj);
    }

    private o3(Map<K, V> map) {
        super(map);
        this.f31203a = true;
    }
}
