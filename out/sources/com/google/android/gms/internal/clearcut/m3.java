package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class m3 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f29431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f29432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ f3 f29433c;

    m3(f3 f3Var, Comparable comparable, Object obj) {
        this.f29433c = f3Var;
        this.f29431a = comparable;
        this.f29432b = obj;
    }

    private static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((m3) obj).getKey());
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
        return b(this.f29431a, entry.getKey()) && b(this.f29432b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f29431a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29432b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f29431a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f29432b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f29433c.p();
        Object obj2 = this.f29432b;
        this.f29432b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f29431a);
        String strValueOf2 = String.valueOf(this.f29432b);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb5.append(strValueOf);
        sb5.append("=");
        sb5.append(strValueOf2);
        return sb5.toString();
    }

    m3(f3 f3Var, Map.Entry entry) {
        this(f3Var, (Comparable) entry.getKey(), entry.getValue());
    }
}
