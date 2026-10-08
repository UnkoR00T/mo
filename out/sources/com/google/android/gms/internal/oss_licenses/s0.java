package com.google.android.gms.internal.oss_licenses;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient t0 f30886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient t0 f30887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient m0 f30888c;

    s0() {
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t0 entrySet() {
        t0 t0Var = this.f30886a;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0VarB = b();
        this.f30886a = t0VarB;
        return t0VarB;
    }

    abstract t0 b();

    abstract t0 c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final m0 values() {
        m0 m0Var = this.f30888c;
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0VarE = e();
        this.f30888c = m0VarE;
        return m0VarE;
    }

    abstract m0 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c1.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        t0 t0Var = this.f30887b;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0VarC = c();
        this.f30887b = t0VarC;
        return t0VarC;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(size).length() + 33);
            sb5.append("size cannot be negative but was: ");
            sb5.append(size);
            throw new IllegalArgumentException(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb6.append('{');
        boolean z15 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z15) {
                sb6.append(", ");
            }
            sb6.append(entry.getKey());
            sb6.append('=');
            sb6.append(entry.getValue());
            z15 = false;
        }
        sb6.append('}');
        return sb6.toString();
    }
}
