package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class mp0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rr0 f32978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rr0 f32979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rr0 f32980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rr0 f32981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rr0 f32982h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr0 f32983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr0 f32984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f32985c;

    static {
        rr0 rr0Var = rr0.f33593d;
        f32978d = qr0.a(":status");
        f32979e = qr0.a(":method");
        f32980f = qr0.a(":path");
        f32981g = qr0.a(":scheme");
        f32982h = qr0.a(":authority");
        qr0.a(":host");
        qr0.a(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mp0(String str, String str2) {
        this(qr0.a(str), qr0.a(str2));
        rr0 rr0Var = rr0.f33593d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp0) {
            mp0 mp0Var = (mp0) obj;
            if (this.f32983a.equals(mp0Var.f32983a) && this.f32984b.equals(mp0Var.f32984b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32983a.hashCode() + 527) * 31) + this.f32984b.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f32983a.k(), this.f32984b.k());
    }

    public mp0(rr0 rr0Var, rr0 rr0Var2) {
        this.f32983a = rr0Var;
        this.f32984b = rr0Var2;
        this.f32985c = rr0Var.s() + 32 + rr0Var2.s();
    }
}
