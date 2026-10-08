package com.google.android.gms.internal.vision;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class u4 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparable f31290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f31291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p4 f31292c;

    u4(p4 p4Var, Map.Entry entry) {
        this(p4Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((u4) obj).getKey());
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
        return b(this.f31290a, entry.getKey()) && b(this.f31291b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f31290a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f31291b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f31290a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f31291b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f31292c.q();
        Object obj2 = this.f31291b;
        this.f31291b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f31290a);
        String strValueOf2 = String.valueOf(this.f31291b);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb5.append(strValueOf);
        sb5.append("=");
        sb5.append(strValueOf2);
        return sb5.toString();
    }

    u4(p4 p4Var, Comparable comparable, Object obj) {
        this.f31292c = p4Var;
        this.f31290a = comparable;
        this.f31291b = obj;
    }
}
