package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum d20 implements cz {
    WIDGET_TYPE_UNSPECIFIED(0),
    PLACE_DETAILS(1),
    PLACE_LIST(2),
    PLACE_AUTOCOMPLETE(3),
    ELEVATION(4),
    ADVANCED_PLACE_DETAILS(6),
    ADVANCED_PLACE_SEARCH(7),
    ADVANCED_PLACE_LIST(8),
    INTERNAL_PLACE_DETAILS(5),
    INTERNAL_PLACE_DETAILS_EMBED(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31961a;

    d20(int i15) {
        this.f31961a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f31961a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this == UNRECOGNIZED ? jz.a() : this.f31961a;
    }
}
