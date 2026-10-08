package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30280b;

    v2(Object obj, int i15) {
        this.f30279a = obj;
        this.f30280b = i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f30279a == v2Var.f30279a && this.f30280b == v2Var.f30280b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f30279a) * 65535) + this.f30280b;
    }
}
