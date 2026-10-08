package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum zs implements cz {
    EV_CONNECTOR_TYPE_UNSPECIFIED(0),
    EV_CONNECTOR_TYPE_OTHER(1),
    EV_CONNECTOR_TYPE_J1772(2),
    EV_CONNECTOR_TYPE_TYPE_2(3),
    EV_CONNECTOR_TYPE_CHADEMO(4),
    EV_CONNECTOR_TYPE_CCS_COMBO_1(5),
    EV_CONNECTOR_TYPE_CCS_COMBO_2(6),
    EV_CONNECTOR_TYPE_TESLA(7),
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T(8),
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET(9),
    EV_CONNECTOR_TYPE_NACS(10),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34548a;

    zs(int i15) {
        this.f34548a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f34548a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this == UNRECOGNIZED ? jz.a() : this.f34548a;
    }
}
