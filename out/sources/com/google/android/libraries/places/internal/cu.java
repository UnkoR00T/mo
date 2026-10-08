package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum cu implements cz {
    BUSINESS_STATUS_UNSPECIFIED(0),
    OPERATIONAL(1),
    CLOSED_TEMPORARILY(2),
    CLOSED_PERMANENTLY(3),
    FUTURE_OPENING(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31934a;

    cu(int i15) {
        this.f31934a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f31934a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this == UNRECOGNIZED ? jz.a() : this.f31934a;
    }
}
