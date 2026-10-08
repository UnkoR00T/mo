package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class m80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l90 f32926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f32927b;

    private m80(l90 l90Var) {
        this.f32927b = null;
        this.f32926a = (l90) zj.p.r(l90Var, "status");
        zj.p.l(!l90Var.j(), "cannot use OK status: %s", l90Var);
    }

    public static m80 a(Object obj) {
        return new m80(obj);
    }

    public static m80 b(l90 l90Var) {
        return new m80(l90Var);
    }

    public final Object c() {
        return this.f32927b;
    }

    public final l90 d() {
        return this.f32926a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m80.class == obj.getClass()) {
            m80 m80Var = (m80) obj;
            if (zj.l.a(this.f32926a, m80Var.f32926a) && zj.l.a(this.f32927b, m80Var.f32927b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f32926a, this.f32927b);
    }

    public final String toString() {
        Object obj = this.f32927b;
        return obj != null ? zj.j.c(this).d("config", obj).toString() : zj.j.c(this).d("error", this.f32926a).toString();
    }

    private m80(Object obj) {
        this.f32927b = zj.p.r(obj, "config");
        this.f32926a = null;
    }
}
