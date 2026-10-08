package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zx implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f30723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f30724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ gy f30725c;

    zx(gy gyVar, Comparable comparable, Object obj) {
        this.f30725c = gyVar;
        this.f30723a = comparable;
        this.f30724b = obj;
    }

    private static final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f30723a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f30723a.compareTo(((zx) obj).f30723a);
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
        return e(this.f30723a, entry.getKey()) && e(this.f30724b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f30723a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f30724b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f30723a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f30724b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f30725c.p();
        Object obj2 = this.f30724b;
        this.f30724b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f30723a) + "=" + String.valueOf(this.f30724b);
    }
}
