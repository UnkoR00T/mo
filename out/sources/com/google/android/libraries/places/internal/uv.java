package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum uv implements cz {
    PRICE_LEVEL_UNSPECIFIED(0),
    PRICE_LEVEL_FREE(1),
    PRICE_LEVEL_INEXPENSIVE(2),
    PRICE_LEVEL_MODERATE(3),
    PRICE_LEVEL_EXPENSIVE(4),
    PRICE_LEVEL_VERY_EXPENSIVE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33981a;

    uv(int i15) {
        this.f33981a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f33981a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this == UNRECOGNIZED ? jz.a() : this.f33981a;
    }
}
