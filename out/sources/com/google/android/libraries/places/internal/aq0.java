package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class aq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31708c;

    /* synthetic */ aq0(zp0 zp0Var, byte[] bArr) {
        this.f31706a = zp0Var.f34533b;
        this.f31707b = zp0Var.d();
        this.f31708c = zp0Var.toString();
    }

    public static int c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static int d(char c15) {
        if (c15 >= '0' && c15 <= '9') {
            return c15 - '0';
        }
        if (c15 >= 'a' && c15 <= 'f') {
            return c15 - 'W';
        }
        if (c15 < 'A' || c15 > 'F') {
            return -1;
        }
        return c15 - '7';
    }

    public final String a() {
        return this.f31706a;
    }

    public final int b() {
        return this.f31707b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aq0) && ((aq0) obj).f31708c.equals(this.f31708c);
    }

    public final int hashCode() {
        return this.f31708c.hashCode();
    }

    public final String toString() {
        return this.f31708c;
    }
}
