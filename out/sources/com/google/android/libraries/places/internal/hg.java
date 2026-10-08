package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum hg implements cz {
    VARIANT_UNDEFINED(0),
    VARIANT_COMPACT(1),
    VARIANT_FULL(2),
    VARIANT_COMPACT_ADVANCED(3),
    VARIANT_FULL_ADVANCED(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32474a;

    hg(int i15) {
        this.f32474a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32474a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f32474a;
    }
}
