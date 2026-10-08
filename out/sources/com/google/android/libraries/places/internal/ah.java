package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum ah implements cz {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    OPEN_NOW_STATUS(7);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31630a;

    ah(int i15) {
        this.f31630a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f31630a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f31630a;
    }
}
