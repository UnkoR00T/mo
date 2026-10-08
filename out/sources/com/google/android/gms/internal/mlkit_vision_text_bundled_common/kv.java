package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class kv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30475b;

    kv(Object obj, int i15) {
        this.f30474a = obj;
        this.f30475b = i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        return this.f30474a == kvVar.f30474a && this.f30475b == kvVar.f30475b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f30474a) * 65535) + this.f30475b;
    }
}
