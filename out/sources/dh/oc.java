package dh;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oc implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient pc f42123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient pc f42124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient la f42125c;

    oc() {
    }

    public static oc c(Object obj, Object obj2) {
        i7.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return wc.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract la a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final la values() {
        la laVar = this.f42125c;
        if (laVar != null) {
            return laVar;
        }
        la laVarA = a();
        this.f42125c = laVarA;
        return laVarA;
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

    abstract pc d();

    abstract pc e();

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
    public final pc entrySet() {
        pc pcVar = this.f42123a;
        if (pcVar != null) {
            return pcVar;
        }
        pc pcVarD = d();
        this.f42123a = pcVarD;
        return pcVarD;
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
        return b.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        pc pcVar = this.f42124b;
        if (pcVar != null) {
            return pcVar;
        }
        pc pcVarE = e();
        this.f42124b = pcVarE;
        return pcVarE;
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
