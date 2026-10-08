package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
public enum n0 implements o2 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final r2<n0> f31193t = new r2<n0>() { // from class: com.google.android.gms.internal.vision.m0
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31195a;

    n0(int i15) {
        this.f31195a = i15;
    }

    public static n0 b(int i15) {
        switch (i15) {
            case 0:
                return UNRECOGNIZED;
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case 9:
                return QR_CODE;
            case 10:
                return UPC_A;
            case 11:
                return UPC_E;
            case 12:
                return PDF417;
            case 13:
                return AZTEC;
            case 14:
                return DATABAR;
            case 15:
            default:
                return null;
            case 16:
                return TEZ_CODE;
        }
    }

    public static q2 e() {
        return q0.f31241a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f31195a + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.vision.o2
    public final int zza() {
        return this.f31195a;
    }
}
