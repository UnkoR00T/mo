package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class n60 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLong f33041d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33044c;

    n60(String str, String str2, long j15) {
        zj.p.r(str, "typeName");
        zj.p.e(!str.isEmpty(), "empty type");
        this.f33042a = str;
        this.f33043b = str2;
        this.f33044c = j15;
    }

    public static n60 a(Class cls, String str) {
        String simpleName = ((Class) zj.p.r(cls, "type")).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static n60 b(String str, String str2) {
        return new n60(str, str2, f33041d.incrementAndGet());
    }

    public final long c() {
        return this.f33044c;
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        String str = this.f33042a;
        int length = String.valueOf(str).length();
        long j15 = this.f33044c;
        StringBuilder sb6 = new StringBuilder(length + 1 + String.valueOf(j15).length() + 1);
        sb6.append(str);
        sb6.append("<");
        sb6.append(j15);
        sb6.append(">");
        sb5.append(sb6.toString());
        String str2 = this.f33043b;
        if (str2 != null) {
            sb5.append(": (");
            sb5.append(str2);
            sb5.append(')');
        }
        return sb5.toString();
    }
}
