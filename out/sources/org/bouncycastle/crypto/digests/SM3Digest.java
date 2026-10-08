package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i15;
        int i16 = 0;
        while (true) {
            if (i16 >= 16) {
                break;
            }
            T[i16] = (2043430169 >>> (32 - i16)) | (2043430169 << i16);
            i16++;
        }
        for (i15 = 16; i15 < 64; i15++) {
            int i17 = i15 % 32;
            T[i15] = (2055708042 >>> (32 - i17)) | (2055708042 << i17);
        }
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int FF0(int i15, int i16, int i17) {
        return (i15 ^ i16) ^ i17;
    }

    private int FF1(int i15, int i16, int i17) {
        return (i15 & (i16 | i17)) | (i16 & i17);
    }

    private int GG0(int i15, int i16, int i17) {
        return (i15 ^ i16) ^ i17;
    }

    private int GG1(int i15, int i16, int i17) {
        return ((~i15) & i17) | (i16 & i15);
    }

    private int P0(int i15) {
        return (i15 ^ ((i15 << 9) | (i15 >>> 23))) ^ ((i15 << 17) | (i15 >>> 15));
    }

    private int P1(int i15) {
        return (i15 ^ ((i15 << 15) | (i15 >>> 17))) ^ ((i15 << 23) | (i15 >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i15);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i15;
        int i16 = 0;
        while (true) {
            if (i16 >= 16) {
                break;
            }
            this.W[i16] = this.inwords[i16];
            i16++;
        }
        for (int i17 = 16; i17 < 68; i17++) {
            int[] iArr = this.W;
            int i18 = iArr[i17 - 3];
            int i19 = iArr[i17 - 13];
            iArr[i17] = (P1(((i18 >>> 17) | (i18 << 15)) ^ (iArr[i17 - 16] ^ iArr[i17 - 9])) ^ ((i19 >>> 25) | (i19 << 7))) ^ this.W[i17 - 6];
        }
        int[] iArr2 = this.V;
        int i25 = iArr2[0];
        int i26 = iArr2[1];
        int i27 = iArr2[2];
        char c15 = 3;
        int i28 = iArr2[3];
        int iP0 = iArr2[4];
        int i29 = iArr2[5];
        int i35 = iArr2[6];
        int i36 = iArr2[7];
        int i37 = i35;
        int i38 = 0;
        for (i15 = 16; i38 < i15; i15 = 16) {
            int i39 = (i25 << 12) | (i25 >>> 20);
            int i45 = i39 + iP0 + T[i38];
            int i46 = (i45 << 7) | (i45 >>> 25);
            int[] iArr3 = this.W;
            int i47 = iArr3[i38];
            int i48 = i47 ^ iArr3[i38 + 4];
            int iFF0 = FF0(i25, i26, i27) + i28;
            int iGG0 = GG0(iP0, i29, i37) + i36 + i46 + i47;
            int i49 = (i26 << 9) | (i26 >>> 23);
            int i55 = (i29 << 19) | (i29 >>> 13);
            i38++;
            i29 = iP0;
            iP0 = P0(iGG0);
            i28 = i27;
            i27 = i49;
            i36 = i37;
            i37 = i55;
            i26 = i25;
            i25 = iFF0 + (i46 ^ i39) + i48;
        }
        int i56 = i36;
        int i57 = i37;
        int i58 = i25;
        int i59 = 16;
        while (i59 < 64) {
            int i65 = (i58 << 12) | (i58 >>> 20);
            int i66 = i65 + iP0 + T[i59];
            int i67 = (i66 << 7) | (i66 >>> 25);
            char c16 = c15;
            int[] iArr4 = this.W;
            int i68 = iArr4[i59];
            int iFF1 = FF1(i58, i26, i27) + i28 + (i67 ^ i65) + (i68 ^ iArr4[i59 + 4]);
            int iGG1 = GG1(iP0, i29, i57) + i56 + i67 + i68;
            int i69 = (i26 << 9) | (i26 >>> 23);
            int i75 = (i29 << 19) | (i29 >>> 13);
            i59++;
            i28 = i27;
            i29 = iP0;
            i27 = i69;
            iP0 = P0(iGG1);
            c15 = c16;
            i56 = i57;
            i57 = i75;
            i26 = i58;
            i58 = iFF1;
        }
        char c17 = c15;
        int[] iArr5 = this.V;
        iArr5[0] = i58 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i26;
        iArr5[2] = iArr5[2] ^ i27;
        iArr5[c17] = iArr5[c17] ^ i28;
        iArr5[4] = iArr5[4] ^ iP0;
        iArr5[5] = iArr5[5] ^ i29;
        iArr5[6] = i57 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i56;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j15) {
        int i15 = this.xOff;
        if (i15 > 14) {
            this.inwords[i15] = 0;
            this.xOff = i15 + 1;
            processBlock();
        }
        while (true) {
            int i16 = this.xOff;
            if (i16 >= 14) {
                int[] iArr = this.inwords;
                int i17 = i16 + 1;
                this.xOff = i17;
                iArr[i16] = (int) (j15 >>> 32);
                this.xOff = i16 + 2;
                iArr[i17] = (int) j15;
                return;
            }
            this.inwords[i16] = 0;
            this.xOff = i16 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i15) {
        int[] iArr = this.inwords;
        int i16 = this.xOff;
        this.xOff = i16 + 1;
        iArr[i16] = Pack.bigEndianToInt(bArr, i15);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }
}
