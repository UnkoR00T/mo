package org.bouncycastle.pqc.crypto.mayo;

/* JADX INFO: loaded from: classes5.dex */
public class MayoParameters {
    public static final MayoParameters mayo1 = new MayoParameters("MAYO_1", 86, 78, 5, 8, 78, 81, 10, 39, 312, 39, 40, 120159, 24336, 24, 1420, 454, new int[]{8, 1, 1, 0}, 24, 32, 24);
    public static final MayoParameters mayo2 = new MayoParameters("MAYO_2", 81, 64, 4, 17, 64, 69, 4, 32, 544, 32, 34, 66560, 34816, 24, 4912, 186, new int[]{8, 0, 2, 8}, 24, 32, 24);
    public static final MayoParameters mayo3 = new MayoParameters("MAYO_3", 118, 108, 7, 10, 108, 111, 11, 54, 540, 54, 55, 317844, 58320, 32, 2986, 681, new int[]{8, 0, 1, 7}, 32, 48, 32);
    public static final MayoParameters mayo5 = new MayoParameters("MAYO_5", 154, 142, 9, 12, 142, 145, 12, 71, 852, 71, 72, 720863, 120984, 40, 5554, 964, new int[]{4, 0, 8, 1}, 40, 64, 40);
    private static final int pkSeedBytes = 16;
    private final int ACols;
    private final int OBytes;
    private final int P1Bytes;
    private final int P2Bytes;
    private final int cpkBytes;
    private final int cskBytes;
    private final int digestBytes;
    private final int[] fTail;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f149495k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f149496m;
    private final int mBytes;
    private final int mVecLimbs;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149497n;
    private final String name;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f149498o;
    private final int rBytes;
    private final int saltBytes;
    private final int sigBytes;
    private final int skSeedBytes;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f149499v;
    private final int vBytes;

    private MayoParameters(String str, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35, int i36, int i37, int i38, int i39, int i45, int[] iArr, int i46, int i47, int i48) {
        this.name = str;
        this.f149497n = i15;
        this.f149496m = i16;
        this.mVecLimbs = i17;
        this.f149498o = i18;
        this.f149499v = i19;
        this.ACols = i25;
        this.f149495k = i26;
        this.mBytes = i27;
        this.OBytes = i28;
        this.vBytes = i29;
        this.rBytes = i35;
        this.P1Bytes = i36;
        this.P2Bytes = i37;
        this.cskBytes = i38;
        this.cpkBytes = i39;
        this.sigBytes = i45;
        this.fTail = iArr;
        this.saltBytes = i46;
        this.digestBytes = i47;
        this.skSeedBytes = i48;
    }

    public int getACols() {
        return this.ACols;
    }

    public int getCpkBytes() {
        return this.cpkBytes;
    }

    public int getCskBytes() {
        return this.cskBytes;
    }

    public int getDigestBytes() {
        return this.digestBytes;
    }

    public int[] getFTail() {
        return this.fTail;
    }

    public int getK() {
        return this.f149495k;
    }

    public int getM() {
        return this.f149496m;
    }

    public int getMBytes() {
        return this.mBytes;
    }

    public int getMVecLimbs() {
        return this.mVecLimbs;
    }

    public int getN() {
        return this.f149497n;
    }

    public String getName() {
        return this.name;
    }

    public int getO() {
        return this.f149498o;
    }

    public int getOBytes() {
        return this.OBytes;
    }

    public int getP1Bytes() {
        return this.P1Bytes;
    }

    public int getP1Limbs() {
        int i15 = this.f149499v;
        return ((i15 * (i15 + 1)) >> 1) * this.mVecLimbs;
    }

    public int getP2Bytes() {
        return this.P2Bytes;
    }

    public int getP2Limbs() {
        return this.f149499v * this.f149498o * this.mVecLimbs;
    }

    public int getP3Limbs() {
        int i15 = this.f149498o;
        return ((i15 * (i15 + 1)) >> 1) * this.mVecLimbs;
    }

    public int getPkSeedBytes() {
        return 16;
    }

    public int getRBytes() {
        return this.rBytes;
    }

    public int getSaltBytes() {
        return this.saltBytes;
    }

    public int getSigBytes() {
        return this.sigBytes;
    }

    public int getSkSeedBytes() {
        return this.skSeedBytes;
    }

    public int getV() {
        return this.f149499v;
    }

    public int getVBytes() {
        return this.vBytes;
    }
}
