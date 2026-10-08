package eh;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient s0 f50989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient s0 f50990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient k0 f50991c;

    r0() {
    }

    public static r0 c(Object obj, Object obj2) {
        v.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return j1.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract k0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k0 values() {
        k0 k0Var = this.f50991c;
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0VarA = a();
        this.f50991c = k0VarA;
        return k0VarA;
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

    abstract s0 d();

    abstract s0 e();

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
    public final s0 entrySet() {
        s0 s0Var = this.f50989a;
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0VarD = d();
        this.f50989a = s0VarD;
        return s0VarD;
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
        return l1.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        s0 s0Var = this.f50990b;
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0VarE = e();
        this.f50990b = s0VarE;
        return s0VarE;
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
        v.a(size, "size");
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
