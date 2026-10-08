package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class y00 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f34329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f34330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b10 f34331c;

    y00(b10 b10Var, Comparable comparable, Object obj) {
        Objects.requireNonNull(b10Var);
        this.f34331c = b10Var;
        this.f34329a = comparable;
        this.f34330b = obj;
    }

    private static final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f34329a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f34329a.compareTo(((y00) obj).f34329a);
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
        return e(this.f34329a, entry.getKey()) && e(this.f34330b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f34329a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34330b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f34329a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f34330b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f34331c.h();
        Object obj2 = this.f34330b;
        this.f34330b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f34329a);
        String strValueOf2 = String.valueOf(this.f34330b);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb5.append(strValueOf);
        sb5.append("=");
        sb5.append(strValueOf2);
        return sb5.toString();
    }
}
