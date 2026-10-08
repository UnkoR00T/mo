package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30874c;

    q0(Object obj, Object obj2, Object obj3) {
        this.f30872a = obj;
        this.f30873b = obj2;
        this.f30874c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f30874c;
        Object obj2 = this.f30873b;
        Object obj3 = this.f30872a;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb5 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        sb5.append("Multiple entries with same key: ");
        sb5.append(strValueOf);
        sb5.append("=");
        sb5.append(strValueOf2);
        sb5.append(" and ");
        sb5.append(strValueOf3);
        sb5.append("=");
        sb5.append(strValueOf4);
        return new IllegalArgumentException(sb5.toString());
    }
}
