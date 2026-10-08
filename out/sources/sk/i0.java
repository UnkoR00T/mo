package sk;

/* JADX INFO: loaded from: classes4.dex */
public enum i0 implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.crypto.tink.shaded.protobuf.a0.d<i0> f182072h = new com.google.crypto.tink.shaded.protobuf.a0.d<i0>() { // from class: sk.i0.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(int i15) {
            return i0.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f182074a;

    i0(int i15) {
        this.f182074a = i15;
    }

    public static i0 b(int i15) {
        if (i15 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i15 == 1) {
            return TINK;
        }
        if (i15 == 2) {
            return LEGACY;
        }
        if (i15 == 3) {
            return RAW;
        }
        if (i15 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int h() {
        if (this != UNRECOGNIZED) {
            return this.f182074a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
