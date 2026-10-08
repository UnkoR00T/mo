package fh;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient p0 f63418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient p0 f63419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient h0 f63420c;

    o0() {
    }

    public static o0 c(Object obj, Object obj2) {
        r.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return l1.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract h0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h0 values() {
        h0 h0Var = this.f63420c;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0VarA = a();
        this.f63420c = h0VarA;
        return h0VarA;
    }

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

    abstract p0 d();

    abstract p0 e();

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
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final p0 entrySet() {
        p0 p0Var = this.f63418a;
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0VarD = d();
        this.f63418a = p0VarD;
        return p0VarD;
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
        return n1.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        p0 p0Var = this.f63419b;
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0VarE = e();
        this.f63419b = p0VarE;
        return p0VarE;
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
        r.a(size, "size");
        StringBuilder sb5 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb5.append('{');
        boolean z15 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z15) {
                sb5.append(", ");
            }
            sb5.append(entry.getKey());
            sb5.append('=');
            sb5.append(entry.getValue());
            z15 = false;
        }
        sb5.append('}');
        return sb5.toString();
    }
}
