package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class b90 implements g80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f31770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f31771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f31772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final List f31773d;

    protected b90(int i15, String str, String str2, String str3, List list, List list2, boolean z15) {
        this.f31770a = i15;
        this.f31771b = str;
        this.f31772c = ak.n0.v(list);
        this.f31773d = ak.n0.v(list2);
    }

    public final int a() {
        return this.f31770a;
    }

    public final String toString() {
        String name = getClass().getName();
        int length = name.length();
        String str = this.f31771b;
        StringBuilder sb5 = new StringBuilder(length + 1 + str.length() + 1);
        sb5.append(name);
        sb5.append("(");
        sb5.append(str);
        sb5.append(")");
        return sb5.toString();
    }
}
