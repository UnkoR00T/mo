package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public enum p0 implements o2 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final r2<p0> f31218r = new r2<p0>() { // from class: com.google.android.gms.internal.vision.s0
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31220a;

    p0(int i15) {
        this.f31220a = i15;
    }

    public static p0 b(int i15) {
        switch (i15) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }

    public static q2 e() {
        return r0.f31243a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + p0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31220a + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final int zza() {
        return this.f31220a;
    }
}
