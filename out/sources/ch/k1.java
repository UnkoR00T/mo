package ch;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient l1 f25997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient l1 f25998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient d1 f25999c;

    k1() {
    }

    public static k1 c(Object obj, Object obj2) {
        n0.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return c2.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract d1 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d1 values() {
        d1 d1Var = this.f25999c;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = a();
        this.f25999c = d1VarA;
        return d1VarA;
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

    abstract l1 d();

    abstract l1 e();

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
    public final l1 entrySet() {
        l1 l1Var = this.f25997a;
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarD = d();
        this.f25997a = l1VarD;
        return l1VarD;
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
        return e2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        l1 l1Var = this.f25998b;
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarE = e();
        this.f25998b = l1VarE;
        return l1VarE;
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
        n0.a(size, "size");
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
