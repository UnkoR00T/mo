package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum dt implements cz {
    FUEL_TYPE_UNSPECIFIED(0),
    DIESEL(1),
    DIESEL_PLUS(19),
    REGULAR_UNLEADED(2),
    MIDGRADE(3),
    PREMIUM(4),
    SP91(5),
    SP91_E10(6),
    SP92(7),
    SP95(8),
    SP95_E10(9),
    SP98(10),
    SP99(11),
    SP100(12),
    LPG(13),
    E80(14),
    E85(15),
    E100(20),
    METHANE(16),
    BIO_DIESEL(17),
    TRUCK_DIESEL(18),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32100a;

    dt(int i15) {
        this.f32100a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32100a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this == UNRECOGNIZED ? jz.a() : this.f32100a;
    }
}
