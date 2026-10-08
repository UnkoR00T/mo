package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f30827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30828c;

    protected m1(String str, Class cls, boolean z15) {
        this(str, cls, z15, true);
    }

    public static m1 a(String str, Class cls) {
        return new m1(str, cls, false, false);
    }

    public final boolean b() {
        return this.f30828c;
    }

    public final String toString() {
        Class cls = this.f30827b;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f30826a;
        StringBuilder sb5 = new StringBuilder(length + 1 + str.length() + 1 + length2 + 1);
        sb5.append(name);
        sb5.append("/");
        sb5.append(str);
        sb5.append("[");
        sb5.append(name2);
        sb5.append("]");
        return sb5.toString();
    }

    private m1(String str, Class cls, boolean z15, boolean z16) {
        z2.b(str);
        this.f30826a = str;
        this.f30827b = cls;
        this.f30828c = z15;
        System.identityHashCode(this);
        for (int i15 = 0; i15 < 5; i15++) {
        }
    }
}
