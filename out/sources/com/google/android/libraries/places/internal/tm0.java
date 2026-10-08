package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class tm0 implements vm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y90 f33798a;

    @Override // com.google.android.libraries.places.internal.vm0
    public final t80 a(o80 o80Var, l80 l80Var) {
        return o80Var.b(this.f33798a, l80Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tm0) {
            return this.f33798a.equals(((tm0) obj).f33798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33798a.hashCode();
    }

    public final String toString() {
        return this.f33798a.toString();
    }
}
