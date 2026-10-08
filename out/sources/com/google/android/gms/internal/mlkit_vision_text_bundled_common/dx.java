package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dx extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dx f30404b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30405a;

    static {
        dx dxVar = new dx();
        f30404b = dxVar;
        dxVar.f30405a = false;
    }

    private dx() {
        this.f30405a = true;
    }

    public static dx b() {
        return f30404b;
    }

    private static int m(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof dw) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iB = kw.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void n() {
        if (!this.f30405a) {
            throw new UnsupportedOperationException();
        }
    }

    public final dx c() {
        return isEmpty() ? new dx() : new dx(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        super.clear();
    }

    public final void e() {
        this.f30405a = false;
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

    public final void g(dx dxVar) {
        n();
        if (dxVar.isEmpty()) {
            return;
        }
        putAll(dxVar);
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
        return this.f30405a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        n();
        byte[] bArr = kw.f30477b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        n();
        for (Object obj : map.keySet()) {
            byte[] bArr = kw.f30477b;
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

    private dx(Map map) {
        super(map);
        this.f30405a = true;
    }
}
