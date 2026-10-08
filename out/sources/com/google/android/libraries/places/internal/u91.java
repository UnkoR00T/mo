package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public class u91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f33868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33871e;

    protected u91(String str, Class cls, boolean z15) {
        this(str, cls, z15, true);
    }

    public static u91 a(String str, Class cls) {
        return new u91(str, cls, false, false);
    }

    public final boolean b() {
        return this.f33869c;
    }

    public final String toString() {
        Class cls = this.f33868b;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f33867a;
        StringBuilder sb5 = new StringBuilder(length + 1 + str.length() + 1 + length2 + 1);
        sb5.append(name);
        sb5.append("/");
        sb5.append(str);
        sb5.append("[");
        sb5.append(name2);
        sb5.append("]");
        return sb5.toString();
    }

    private u91(String str, Class cls, boolean z15, boolean z16) {
        j.c(str);
        this.f33867a = str;
        this.f33868b = cls;
        this.f33869c = z15;
        this.f33870d = z16;
        int iIdentityHashCode = System.identityHashCode(this);
        long j15 = 0;
        for (int i15 = 0; i15 < 5; i15++) {
            j15 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f33871e = j15;
    }
}
