package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l90 f33047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33048b;

    private n90(l90 l90Var, Object obj) {
        this.f33047a = l90Var;
        this.f33048b = obj;
    }

    public static n90 a(Object obj) {
        return new n90(null, obj);
    }

    public static n90 b(l90 l90Var) {
        n90 n90Var = new n90((l90) zj.p.r(l90Var, "status"), null);
        zj.p.l(!l90Var.j(), "cannot use OK status: %s", l90Var);
        return n90Var;
    }

    public final boolean c() {
        return this.f33047a == null;
    }

    public final Object d() {
        if (this.f33047a == null) {
            return this.f33048b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final l90 e() {
        l90 l90Var = this.f33047a;
        return l90Var == null ? l90.f32807e : l90Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        if (c() == n90Var.c()) {
            return c() ? zj.l.a(this.f33048b, n90Var.f33048b) : zj.l.a(this.f33047a, n90Var.f33047a);
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f33047a, this.f33048b);
    }

    public final String toString() {
        l90 l90Var = this.f33047a;
        zj.j.b bVarC = zj.j.c(this);
        if (l90Var == null) {
            bVarC.d("value", this.f33048b);
        } else {
            bVarC.d("error", l90Var);
        }
        return bVarC.toString();
    }
}
