package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class kb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32728a = "unknown-authority";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b40 f32729b = b40.f31734c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y50 f32731d;

    public final String a() {
        return this.f32728a;
    }

    public final kb0 b(String str) {
        this.f32728a = (String) zj.p.r(str, "authority");
        return this;
    }

    public final b40 c() {
        return this.f32729b;
    }

    public final kb0 d(b40 b40Var) {
        zj.p.r(b40Var, "eagAttributes");
        this.f32729b = b40Var;
        return this;
    }

    public final String e() {
        return this.f32730c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        return this.f32728a.equals(kb0Var.f32728a) && this.f32729b.equals(kb0Var.f32729b) && zj.l.a(this.f32730c, kb0Var.f32730c) && zj.l.a(this.f32731d, kb0Var.f32731d);
    }

    public final kb0 f(String str) {
        this.f32730c = str;
        return this;
    }

    public final y50 g() {
        return this.f32731d;
    }

    public final kb0 h(y50 y50Var) {
        this.f32731d = y50Var;
        return this;
    }

    public final int hashCode() {
        return zj.l.b(this.f32728a, this.f32729b, this.f32730c, this.f32731d);
    }
}
