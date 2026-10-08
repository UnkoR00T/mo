package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum gh implements cz {
    UNDEFINED(0),
    SEARCH_BY_TEXT_REQUEST(1),
    SEARCH_NEARBY_REQUEST(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32391a;

    gh(int i15) {
        this.f32391a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32391a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f32391a;
    }
}
