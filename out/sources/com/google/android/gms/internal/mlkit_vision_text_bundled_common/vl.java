package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class vl extends tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30653a;

    vl(Object obj) {
        this.f30653a = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final Object a() {
        return this.f30653a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final Object b(Object obj) {
        return this.f30653a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final boolean equals(Object obj) {
        if (obj instanceof vl) {
            return this.f30653a.equals(((vl) obj).f30653a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final int hashCode() {
        return this.f30653a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f30653a.toString() + ")";
    }
}
