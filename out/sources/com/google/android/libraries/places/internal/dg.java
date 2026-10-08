package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum dg implements cz {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    MAPS_LINK(7),
    DIRECTIONS_LINK(8),
    OPEN_NOW_STATUS(9),
    SUMMARY(10),
    OPENING_HOURS(11),
    WEBSITE(12),
    PHONE_NUMBER(13),
    TYPE_SPECIFIC_HIGHLIGHTS(14),
    REVIEWS(15),
    PLUS_CODE(16),
    FEATURES(17),
    GENERATIVE_SUMMARY(18);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32034a;

    dg(int i15) {
        this.f32034a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32034a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f32034a;
    }
}
