package sk;

/* JADX INFO: loaded from: classes4.dex */
public enum u implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.google.crypto.tink.shaded.protobuf.a0.d<u> f182096j = new com.google.crypto.tink.shaded.protobuf.a0.d<u>() { // from class: sk.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(int i15) {
            return u.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f182098a;

    u(int i15) {
        this.f182098a = i15;
    }

    public static u b(int i15) {
        if (i15 == 0) {
            return UNKNOWN_HASH;
        }
        if (i15 == 1) {
            return SHA1;
        }
        if (i15 == 2) {
            return SHA384;
        }
        if (i15 == 3) {
            return SHA256;
        }
        if (i15 == 4) {
            return SHA512;
        }
        if (i15 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int h() {
        if (this != UNRECOGNIZED) {
            return this.f182098a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
