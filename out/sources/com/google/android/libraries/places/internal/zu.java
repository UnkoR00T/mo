package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum zu implements cz {
    SECONDARY_HOURS_TYPE_UNSPECIFIED(0),
    DRIVE_THROUGH(1),
    HAPPY_HOUR(2),
    DELIVERY(3),
    TAKEOUT(4),
    KITCHEN(5),
    BREAKFAST(6),
    LUNCH(7),
    DINNER(8),
    BRUNCH(9),
    PICKUP(10),
    ACCESS(11),
    SENIOR_HOURS(12),
    ONLINE_SERVICE_HOURS(13),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34565a;

    zu(int i15) {
        this.f34565a = i15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f34565a);
    }

    @Override // com.google.android.libraries.places.internal.cz
    public final int zza() {
        return this == UNRECOGNIZED ? jz.a() : this.f34565a;
    }
}
