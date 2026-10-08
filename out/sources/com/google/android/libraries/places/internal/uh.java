package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum uh implements cz {
    POSITION_UNDEFINED(0),
    POSITION_TOP(1),
    POSITION_BOTTOM(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33900a;

    uh(int i15) {
        this.f33900a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f33900a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f33900a;
    }
}
