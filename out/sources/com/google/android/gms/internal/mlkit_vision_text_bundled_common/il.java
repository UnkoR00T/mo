package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class il extends tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final il f30452a = new il();

    private il() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final Object b(Object obj) {
        return "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
