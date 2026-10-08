package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class o5 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f30184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f30185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u5 f30186c;

    o5(u5 u5Var, Comparable comparable, Object obj) {
        this.f30186c = u5Var;
        this.f30184a = comparable;
        this.f30185b = obj;
    }

    private static final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f30184a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f30184a.compareTo(((o5) obj).f30184a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return e(this.f30184a, entry.getKey()) && e(this.f30185b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f30184a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f30185b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f30184a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f30185b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f30186c.p();
        Object obj2 = this.f30185b;
        this.f30185b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f30184a) + "=" + String.valueOf(this.f30185b);
    }
}
