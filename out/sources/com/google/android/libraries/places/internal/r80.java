package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n90 f33497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b40 f33498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m80 f33499c;

    r80(n90 n90Var, b40 b40Var, m80 m80Var) {
        this.f33497a = n90Var;
        this.f33498b = (b40) zj.p.r(b40Var, "attributes");
        this.f33499c = m80Var;
    }

    public static q80 a() {
        return new q80();
    }

    public final n90 b() {
        return this.f33497a;
    }

    public final b40 c() {
        return this.f33498b;
    }

    public final m80 d() {
        return this.f33499c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj;
        return zj.l.a(this.f33497a, r80Var.f33497a) && zj.l.a(this.f33498b, r80Var.f33498b) && zj.l.a(this.f33499c, r80Var.f33499c);
    }

    public final int hashCode() {
        return zj.l.b(this.f33497a, this.f33498b, this.f33499c);
    }

    public final String toString() {
        zj.j.b bVarC = zj.j.c(this);
        bVarC.d("addressesOrError", this.f33497a.toString());
        bVarC.d("attributes", this.f33498b);
        bVarC.d("serviceConfigOrError", this.f33499c);
        return bVarC.toString();
    }
}
