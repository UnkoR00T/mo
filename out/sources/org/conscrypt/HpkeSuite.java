package org.conscrypt;

/* JADX INFO: loaded from: classes5.dex */
public final class HpkeSuite {
    public static final int AEAD_AES_128_GCM = 1;
    public static final int AEAD_AES_256_GCM = 2;
    public static final int AEAD_CHACHA20POLY1305 = 3;
    public static final int KDF_HKDF_SHA256 = 1;
    public static final int KEM_DHKEM_X25519_HKDF_SHA256 = 32;
    public static final int KEM_MLKEM_1024 = 66;
    public static final int KEM_MLKEM_768 = 65;
    public static final int KEM_XWING = 25722;
    private final AEAD mAead;
    private final KDF mKdf;
    private final KEM mKem;

    public enum AEAD {
        AES_128_GCM(1, 16, 12, 16),
        AES_256_GCM(2, 32, 12, 16),
        CHACHA20POLY1305(3, 32, 12, 16);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f149626id;

        /* JADX INFO: renamed from: nk, reason: collision with root package name */
        private final int f149627nk;

        /* JADX INFO: renamed from: nn, reason: collision with root package name */
        private final int f149628nn;

        /* JADX INFO: renamed from: nt, reason: collision with root package name */
        private final int f149629nt;

        AEAD(int i15, int i16, int i17, int i18) {
            this.f149626id = i15;
            this.f149627nk = i16;
            this.f149628nn = i17;
            this.f149629nt = i18;
        }

        public static AEAD forId(int i15) {
            for (AEAD aead : values()) {
                if (aead.getId() == i15) {
                    return aead;
                }
            }
            throw new IllegalArgumentException("Unknown AEAD " + i15);
        }

        public int getId() {
            return this.f149626id;
        }

        public int getKeyLength() {
            return this.f149627nk;
        }

        @Deprecated
        public int getNk() {
            return getKeyLength();
        }

        @Deprecated
        public int getNn() {
            return getNonceLength();
        }

        public int getNonceLength() {
            return this.f149628nn;
        }

        @Deprecated
        public int getNt() {
            return this.f149629nt;
        }

        public int getTagLength() {
            return this.f149629nt;
        }
    }

    public enum KDF {
        HKDF_SHA256(1, 32, "HmacSHA256");

        private final int hLength;
        private final String hName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f149630id;

        KDF(int i15, int i16, String str) {
            this.f149630id = i15;
            this.hLength = i16;
            this.hName = str;
        }

        public static KDF forId(int i15) {
            for (KDF kdf : values()) {
                if (kdf.getId() == i15) {
                    return kdf;
                }
            }
            throw new IllegalArgumentException("Unknown KDF " + i15);
        }

        @Deprecated
        public int getHLength() {
            return getMacLength();
        }

        public int getId() {
            return this.f149630id;
        }

        @Deprecated
        public String getMacAlgorithmName() {
            return getMacName();
        }

        public int getMacLength() {
            return this.hLength;
        }

        public String getMacName() {
            return this.hName;
        }

        public long maxExportLength() {
            return ((long) getMacLength()) * 255;
        }
    }

    public enum KEM {
        DHKEM_X25519_HKDF_SHA256(32, 32, 32, 32, 32),
        MLKEM_768(65, 32, 1088, 1184, 64),
        MLKEM_1024(66, 32, 1568, 1568, 64),
        XWING(HpkeSuite.KEM_XWING, 32, 1120, 1216, 32);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f149631id;
        private final int nEnc;
        private final int nPk;
        private final int nSecret;
        private final int nSk;

        KEM(int i15, int i16, int i17, int i18, int i19) {
            this.f149631id = i15;
            this.nSecret = i16;
            this.nEnc = i17;
            this.nPk = i18;
            this.nSk = i19;
        }

        public static KEM forId(int i15) {
            for (KEM kem : values()) {
                if (kem.getId() == i15) {
                    return kem;
                }
            }
            throw new IllegalArgumentException("Unknown KEM " + i15);
        }

        public int getEncapsulatedLength() {
            return this.nEnc;
        }

        public int getId() {
            return this.f149631id;
        }

        public int getPrivateKeyLength() {
            return this.nSk;
        }

        public int getPublicKeyLength() {
            return this.nPk;
        }

        public int getSecretLength() {
            return this.nSecret;
        }

        @Deprecated
        public int getnEnc() {
            return getEncapsulatedLength();
        }
    }

    public HpkeSuite(int i15, int i16, int i17) {
        this.mKem = KEM.forId(i15);
        this.mKdf = KDF.forId(i16);
        this.mAead = AEAD.forId(i17);
    }

    @Deprecated
    public AEAD convertAead(int i15) {
        return AEAD.forId(i15);
    }

    @Deprecated
    public KDF convertKdf(int i15) {
        return KDF.forId(i15);
    }

    @Deprecated
    public KEM convertKem(int i15) {
        return KEM.forId(i15);
    }

    public AEAD getAead() {
        return this.mAead;
    }

    public KDF getKdf() {
        return this.mKdf;
    }

    public KEM getKem() {
        return this.mKem;
    }

    public String name() {
        return String.format("%s/%s/%s", this.mKem.name(), this.mKdf.name(), this.mAead.name());
    }
}
