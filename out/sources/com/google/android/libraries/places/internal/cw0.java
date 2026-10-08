package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31935a;

    private cw0(String str) {
        this.f31935a = str;
    }

    public static cw0 a(String str) {
        return new cw0((String) zj.p.q(str));
    }

    public static cw0 b(cw0 cw0Var, cw0 cw0Var2) {
        return new cw0(String.valueOf(cw0Var.f31935a).concat(String.valueOf(cw0Var2.f31935a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cw0) {
            return this.f31935a.equals(((cw0) obj).f31935a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31935a.hashCode();
    }

    public final String toString() {
        return this.f31935a;
    }
}
