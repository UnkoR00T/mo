package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes5.dex */
public class SLHDSAParameters {
    public static final int TYPE_PURE = 0;
    public static final int TYPE_SHA2_256 = 1;
    public static final int TYPE_SHA2_512 = 2;
    public static final int TYPE_SHAKE128 = 3;
    public static final int TYPE_SHAKE256 = 4;
    private final SLHDSAEngineProvider engineProvider;
    private final String name;
    private final int preHashDigest;
    public static final SLHDSAParameters sha2_128f = new SLHDSAParameters("sha2-128f", new Sha2EngineProvider(16, 16, 22, 6, 33, 66), 0);
    public static final SLHDSAParameters sha2_128s = new SLHDSAParameters("sha2-128s", new Sha2EngineProvider(16, 16, 7, 12, 14, 63), 0);
    public static final SLHDSAParameters sha2_192f = new SLHDSAParameters("sha2-192f", new Sha2EngineProvider(24, 16, 22, 8, 33, 66), 0);
    public static final SLHDSAParameters sha2_192s = new SLHDSAParameters("sha2-192s", new Sha2EngineProvider(24, 16, 7, 14, 17, 63), 0);
    public static final SLHDSAParameters sha2_256f = new SLHDSAParameters("sha2-256f", new Sha2EngineProvider(32, 16, 17, 9, 35, 68), 0);
    public static final SLHDSAParameters sha2_256s = new SLHDSAParameters("sha2-256s", new Sha2EngineProvider(32, 16, 8, 14, 22, 64), 0);
    public static final SLHDSAParameters shake_128f = new SLHDSAParameters("shake-128f", new Shake256EngineProvider(16, 16, 22, 6, 33, 66), 0);
    public static final SLHDSAParameters shake_128s = new SLHDSAParameters("shake-128s", new Shake256EngineProvider(16, 16, 7, 12, 14, 63), 0);
    public static final SLHDSAParameters shake_192f = new SLHDSAParameters("shake-192f", new Shake256EngineProvider(24, 16, 22, 8, 33, 66), 0);
    public static final SLHDSAParameters shake_192s = new SLHDSAParameters("shake-192s", new Shake256EngineProvider(24, 16, 7, 14, 17, 63), 0);
    public static final SLHDSAParameters shake_256f = new SLHDSAParameters("shake-256f", new Shake256EngineProvider(32, 16, 17, 9, 35, 68), 0);
    public static final SLHDSAParameters shake_256s = new SLHDSAParameters("shake-256s", new Shake256EngineProvider(32, 16, 8, 14, 22, 64), 0);
    public static final SLHDSAParameters sha2_128f_with_sha256 = new SLHDSAParameters("sha2-128f-with-sha256", new Sha2EngineProvider(16, 16, 22, 6, 33, 66), 1);
    public static final SLHDSAParameters sha2_128s_with_sha256 = new SLHDSAParameters("sha2-128s-with-sha256", new Sha2EngineProvider(16, 16, 7, 12, 14, 63), 1);
    public static final SLHDSAParameters sha2_192f_with_sha512 = new SLHDSAParameters("sha2-192f-with-sha512", new Sha2EngineProvider(24, 16, 22, 8, 33, 66), 2);
    public static final SLHDSAParameters sha2_192s_with_sha512 = new SLHDSAParameters("sha2-192s-with-sha512", new Sha2EngineProvider(24, 16, 7, 14, 17, 63), 2);
    public static final SLHDSAParameters sha2_256f_with_sha512 = new SLHDSAParameters("sha2-256f-with-sha512", new Sha2EngineProvider(32, 16, 17, 9, 35, 68), 2);
    public static final SLHDSAParameters sha2_256s_with_sha512 = new SLHDSAParameters("sha2-256s-with-sha512", new Sha2EngineProvider(32, 16, 8, 14, 22, 64), 2);
    public static final SLHDSAParameters shake_128f_with_shake128 = new SLHDSAParameters("shake-128f-with-shake128", new Shake256EngineProvider(16, 16, 22, 6, 33, 66), 3);
    public static final SLHDSAParameters shake_128s_with_shake128 = new SLHDSAParameters("shake-128s-with-shake128", new Shake256EngineProvider(16, 16, 7, 12, 14, 63), 3);
    public static final SLHDSAParameters shake_192f_with_shake256 = new SLHDSAParameters("shake-192f-with-shake256", new Shake256EngineProvider(24, 16, 22, 8, 33, 66), 4);
    public static final SLHDSAParameters shake_192s_with_shake256 = new SLHDSAParameters("shake-192s-with-shake256", new Shake256EngineProvider(24, 16, 7, 14, 17, 63), 4);
    public static final SLHDSAParameters shake_256f_with_shake256 = new SLHDSAParameters("shake-256f-with-shake256", new Shake256EngineProvider(32, 16, 17, 9, 35, 68), 4);
    public static final SLHDSAParameters shake_256s_with_shake256 = new SLHDSAParameters("shake-256s-with-shake256", new Shake256EngineProvider(32, 16, 8, 14, 22, 64), 4);

    private static class Sha2EngineProvider implements SLHDSAEngineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f149557a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f149558d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f149559h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f149560k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f149561n;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f149562w;

        public Sha2EngineProvider(int i15, int i16, int i17, int i18, int i19, int i25) {
            this.f149561n = i15;
            this.f149562w = i16;
            this.f149558d = i17;
            this.f149557a = i18;
            this.f149560k = i19;
            this.f149559h = i25;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public SLHDSAEngine get() {
            return new SLHDSAEngine.Sha2Engine(this.f149561n, this.f149562w, this.f149558d, this.f149557a, this.f149560k, this.f149559h);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public int getN() {
            return this.f149561n;
        }
    }

    private static class Shake256EngineProvider implements SLHDSAEngineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f149563a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f149564d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f149565h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f149566k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f149567n;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f149568w;

        public Shake256EngineProvider(int i15, int i16, int i17, int i18, int i19, int i25) {
            this.f149567n = i15;
            this.f149568w = i16;
            this.f149564d = i17;
            this.f149563a = i18;
            this.f149566k = i19;
            this.f149565h = i25;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public SLHDSAEngine get() {
            return new SLHDSAEngine.Shake256Engine(this.f149567n, this.f149568w, this.f149564d, this.f149563a, this.f149566k, this.f149565h);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public int getN() {
            return this.f149567n;
        }
    }

    private SLHDSAParameters(String str, SLHDSAEngineProvider sLHDSAEngineProvider, int i15) {
        this.name = str;
        this.engineProvider = sLHDSAEngineProvider;
        this.preHashDigest = i15;
    }

    SLHDSAEngine getEngine() {
        return this.engineProvider.get();
    }

    public int getN() {
        return this.engineProvider.getN();
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.preHashDigest;
    }

    public boolean isPreHash() {
        return this.preHashDigest != 0;
    }
}
