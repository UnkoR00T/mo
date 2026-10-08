package sk;

/* JADX INFO: loaded from: classes4.dex */
public enum z implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.crypto.tink.shaded.protobuf.a0.d<z> f182117g = new com.google.crypto.tink.shaded.protobuf.a0.d<z>() { // from class: sk.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(int i15) {
            return z.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f182119a;

    z(int i15) {
        this.f182119a = i15;
    }

    public static z b(int i15) {
        if (i15 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i15 == 1) {
            return ENABLED;
        }
        if (i15 == 2) {
            return DISABLED;
        }
        if (i15 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int h() {
        if (this != UNRECOGNIZED) {
            return this.f182119a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
