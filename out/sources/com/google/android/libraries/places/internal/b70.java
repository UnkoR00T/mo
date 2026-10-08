package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b70 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b70 f31757e = new b70(null, null, l90.f32807e, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f70 f31758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p40 f31759b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l90 f31760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31761d;

    private b70(f70 f70Var, p40 p40Var, l90 l90Var, boolean z15) {
        this.f31758a = f70Var;
        this.f31760c = (l90) zj.p.r(l90Var, "status");
        this.f31761d = z15;
    }

    public static b70 a(f70 f70Var, p40 p40Var) {
        return new b70((f70) zj.p.r(f70Var, "subchannel"), null, l90.f32807e, false);
    }

    public static b70 b(l90 l90Var) {
        zj.p.e(!l90Var.j(), "error status shouldn't be OK");
        return new b70(null, null, l90Var, false);
    }

    public static b70 c(l90 l90Var) {
        zj.p.e(!l90Var.j(), "drop status shouldn't be OK");
        return new b70(null, null, l90Var, true);
    }

    public static b70 d() {
        return f31757e;
    }

    public final f70 e() {
        return this.f31758a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        return zj.l.a(this.f31758a, b70Var.f31758a) && zj.l.a(this.f31760c, b70Var.f31760c) && zj.l.a(null, null) && this.f31761d == b70Var.f31761d;
    }

    public final l90 f() {
        return this.f31760c;
    }

    public final boolean g() {
        return this.f31761d;
    }

    public final boolean h() {
        return (this.f31758a == null && this.f31760c.j()) ? false : true;
    }

    public final int hashCode() {
        return zj.l.b(this.f31758a, this.f31760c, null, Boolean.valueOf(this.f31761d));
    }

    public final String toString() {
        return zj.j.c(this).d("subchannel", this.f31758a).d("streamTracerFactory", null).d("status", this.f31760c).e("drop", this.f31761d).d("authority-override", null).toString();
    }
}
