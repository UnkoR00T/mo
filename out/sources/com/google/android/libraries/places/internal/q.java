package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f33370b = new q("about:invalid#zGuavaz");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33371a;

    q(String str) {
        str.getClass();
        this.f33371a = str;
    }

    public final String a() {
        return this.f33371a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f33371a.equals(((q) obj).f33371a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33371a.hashCode() ^ 18288376;
    }

    public final String toString() {
        String str = this.f33371a;
        StringBuilder sb5 = new StringBuilder(str.length() + 9);
        sb5.append("SafeUrl{");
        sb5.append(str);
        sb5.append("}");
        return sb5.toString();
    }
}
