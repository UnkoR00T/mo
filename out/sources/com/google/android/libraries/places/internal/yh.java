package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum yh implements cz {
    PLACE_WIDGET_ORIENTATION_UNSPECIFIED(0),
    VERTICAL(1),
    HORIZONTAL(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34406a;

    yh(int i15) {
        this.f34406a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f34406a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f34406a;
    }
}
