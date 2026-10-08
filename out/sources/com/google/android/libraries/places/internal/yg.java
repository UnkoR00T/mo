package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum yg implements cz {
    SIZE_UNDEFINED(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34399a;

    yg(int i15) {
        this.f34399a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f34399a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this.f34399a;
    }
}
