package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class yl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k70 f34411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f34412b;

    public yl0(k70 k70Var, Object obj) {
        this.f34411a = (k70) zj.p.r(k70Var, "provider");
        this.f34412b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yl0.class == obj.getClass()) {
            yl0 yl0Var = (yl0) obj;
            if (zj.l.a(this.f34411a, yl0Var.f34411a) && zj.l.a(this.f34412b, yl0Var.f34412b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zj.l.b(this.f34411a, this.f34412b);
    }

    public final String toString() {
        return zj.j.c(this).d("provider", this.f34411a).d("config", this.f34412b).toString();
    }
}
