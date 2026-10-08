package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class c50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b50 f31851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l90 f31852b;

    private c50(b50 b50Var, l90 l90Var) {
        this.f31851a = (b50) zj.p.r(b50Var, "state is null");
        this.f31852b = (l90) zj.p.r(l90Var, "status is null");
    }

    public static c50 a(b50 b50Var) {
        zj.p.e(b50Var != b50.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new c50(b50Var, l90.f32807e);
    }

    public static c50 b(l90 l90Var) {
        zj.p.e(!l90Var.j(), "The error status must not be OK");
        return new c50(b50.TRANSIENT_FAILURE, l90Var);
    }

    public final b50 c() {
        return this.f31851a;
    }

    public final l90 d() {
        return this.f31852b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c50)) {
            return false;
        }
        c50 c50Var = (c50) obj;
        return this.f31851a.equals(c50Var.f31851a) && this.f31852b.equals(c50Var.f31852b);
    }

    public final int hashCode() {
        l90 l90Var = this.f31852b;
        return l90Var.hashCode() ^ this.f31851a.hashCode();
    }

    public final String toString() {
        l90 l90Var = this.f31852b;
        if (l90Var.j()) {
            return this.f31851a.toString();
        }
        String strValueOf = String.valueOf(this.f31851a);
        String strValueOf2 = String.valueOf(l90Var);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length() + 1);
        sb5.append(strValueOf);
        sb5.append("(");
        sb5.append(strValueOf2);
        sb5.append(")");
        return sb5.toString();
    }
}
