package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a00 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a00 f31548b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31549a;

    static {
        a00 a00Var = new a00();
        f31548b = a00Var;
        a00Var.f31549a = false;
    }

    private a00() {
        this.f31549a = true;
    }

    public static a00 b() {
        return f31548b;
    }

    private static int m(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof cz) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iC = jz.c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    private final void n() {
        if (!this.f31549a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(a00 a00Var) {
        n();
        if (a00Var.isEmpty()) {
            return;
        }
        putAll(a00Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        super.clear();
    }

    public final a00 e() {
        return isEmpty() ? new a00() : new a00(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        this.f31549a = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iM = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM += m(entry.getValue()) ^ m(entry.getKey());
        }
        return iM;
    }

    public final boolean i() {
        return this.f31549a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        n();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        n();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        return super.remove(obj);
    }

    private a00(Map map) {
        super(map);
        this.f31549a = true;
    }
}
