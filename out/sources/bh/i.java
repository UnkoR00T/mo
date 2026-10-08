package bh;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient j f19434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient j f19435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient c f19436c;

    i() {
    }

    public static i c(Object obj, Object obj2) {
        a1.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return q.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract c a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c values() {
        c cVar = this.f19436c;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = a();
        this.f19436c = cVarA;
        return cVarA;
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

    abstract j d();

    abstract j e();

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
    public final j entrySet() {
        j jVar = this.f19434a;
        if (jVar != null) {
            return jVar;
        }
        j jVarD = d();
        this.f19434a = jVarD;
        return jVarD;
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
        return r.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        j jVar = this.f19435b;
        if (jVar != null) {
            return jVar;
        }
        j jVarE = e();
        this.f19435b = jVarE;
        return jVarE;
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
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
