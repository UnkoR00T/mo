package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class PolyVec {
    private MLKEMEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }

    static int checkModulus(MLKEMEngine mLKEMEngine, byte[] bArr) {
        int kyberK = mLKEMEngine.getKyberK();
        int iCheckModulus = -1;
        for (int i15 = 0; i15 < kyberK; i15++) {
            iCheckModulus &= Poly.checkModulus(bArr, i15 * MLKEMEngine.KyberPolyBytes);
        }
        return iCheckModulus;
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, MLKEMEngine mLKEMEngine) {
        Poly poly2 = new Poly(mLKEMEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i15 = 1; i15 < mLKEMEngine.getKyberK(); i15++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i15), polyVec2.getVectorIndex(i15));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            getVectorIndex(i15).addCoeffs(polyVec.getVectorIndex(i15));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        int i15 = 32;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            short[] sArr = new short[4];
            int i16 = 0;
            for (int i17 = 0; i17 < this.kyberK; i17++) {
                for (int i18 = 0; i18 < 64; i18++) {
                    for (int i19 = 0; i19 < 4; i19++) {
                        sArr[i19] = (short) (((((((long) getVectorIndex(i17).getCoeffIndex((i18 * 4) + i19)) << 10) + 1665) * 1290167) >> 32) & 1023);
                    }
                    short s15 = sArr[0];
                    bArr[i16] = (byte) s15;
                    short s16 = sArr[1];
                    bArr[i16 + 1] = (byte) ((s15 >> 8) | (s16 << 2));
                    int i25 = s16 >> 6;
                    short s17 = sArr[2];
                    bArr[i16 + 2] = (byte) (i25 | (s17 << 4));
                    int i26 = s17 >> 4;
                    short s18 = sArr[3];
                    bArr[i16 + 3] = (byte) (i26 | (s18 << 6));
                    bArr[i16 + 4] = (byte) (s18 >> 2);
                    i16 += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            short[] sArr2 = new short[8];
            int i27 = 0;
            int i28 = 0;
            while (i27 < this.kyberK) {
                int i29 = 0;
                while (i29 < i15) {
                    for (int i35 = 0; i35 < 8; i35++) {
                        sArr2[i35] = (short) (((((((long) getVectorIndex(i27).getCoeffIndex((i29 * 8) + i35)) << 11) + 1664) * 645084) >> 31) & 2047);
                    }
                    short s19 = sArr2[0];
                    bArr[i28] = (byte) s19;
                    short s25 = sArr2[1];
                    bArr[i28 + 1] = (byte) ((s19 >> 8) | (s25 << 3));
                    short s26 = sArr2[2];
                    bArr[i28 + 2] = (byte) ((s25 >> 5) | (s26 << 6));
                    bArr[i28 + 3] = (byte) (s26 >> 2);
                    int i36 = s26 >> 10;
                    short s27 = sArr2[3];
                    bArr[i28 + 4] = (byte) (i36 | (s27 << 1));
                    short s28 = sArr2[4];
                    bArr[i28 + 5] = (byte) ((s27 >> 7) | (s28 << 4));
                    short s29 = sArr2[5];
                    bArr[i28 + 6] = (byte) ((s28 >> 4) | (s29 << 7));
                    bArr[i28 + 7] = (byte) (s29 >> 1);
                    int i37 = s29 >> 9;
                    short s35 = sArr2[6];
                    bArr[i28 + 8] = (byte) (i37 | (s35 << 2));
                    int i38 = s35 >> 6;
                    short s36 = sArr2[7];
                    bArr[i28 + 9] = (byte) (i38 | (s36 << 5));
                    bArr[i28 + 10] = (byte) (s36 >> 3);
                    i28 += 11;
                    i29++;
                    i15 = 32;
                }
                i27++;
                i15 = 32;
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            getVectorIndex(i15).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i15 = 3;
        int i16 = 6;
        short s15 = 2;
        short s16 = 4;
        short s17 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * 320) {
            int i17 = 0;
            for (int i18 = 0; i18 < this.kyberK; i18++) {
                for (int i19 = 0; i19 < 64; i19++) {
                    int i25 = bArr[i17] & 255;
                    byte b15 = bArr[i17 + 1];
                    byte b16 = bArr[i17 + 2];
                    byte b17 = bArr[i17 + 3];
                    short[] sArr = {(short) (i25 | ((short) ((b15 & 255) << 8))), (short) (((b15 & 255) >> 2) | ((short) ((b16 & 255) << 6))), (short) (((b16 & 255) >> 4) | ((short) ((b17 & 255) << 4))), (short) (((b17 & 255) >> 6) | ((short) ((bArr[i17 + 4] & 255) << 2)))};
                    i17 += 5;
                    for (int i26 = 0; i26 < 4; i26++) {
                        this.vec[i18].setCoeffIndex((i19 * 4) + i26, (short) ((((sArr[i26] & 1023) * MLKEMEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.kyberK; i28++) {
            int i29 = 0;
            while (i29 < 32) {
                int i35 = bArr[i27] & 255;
                byte b18 = bArr[i27 + 1];
                short s18 = (short) (i35 | (((short) (b18 & 255)) << 8));
                byte b19 = bArr[i27 + 2];
                short s19 = (short) (((b18 & 255) >> i15) | (((short) (b19 & 255)) << 5));
                int i36 = ((b19 & 255) >> i16) | (((short) (bArr[i27 + 3] & 255)) << s15);
                byte b25 = bArr[i27 + 4];
                int i37 = i15;
                short s25 = (short) (((short) ((b25 & 255) << 10)) | i36);
                int i38 = (b25 & 255) >> s17;
                byte b26 = bArr[i27 + 5];
                int i39 = i16;
                short s26 = (short) ((((short) (b26 & 255)) << 7) | i38);
                int i45 = (b26 & 255) >> s16;
                byte b27 = bArr[i27 + 6];
                short s27 = s15;
                short s28 = (short) ((((short) (b27 & 255)) << s16) | i45);
                int i46 = ((b27 & 255) >> 7) | (((short) (bArr[i27 + 7] & 255)) << s17);
                byte b28 = bArr[i27 + 8];
                short s29 = s16;
                short s35 = (short) (((short) ((b28 & 255) << 9)) | i46);
                int i47 = (b28 & 255) >> 2;
                byte b29 = bArr[i27 + 9];
                short s36 = s17;
                short s37 = (short) ((((short) (b29 & 255)) << 6) | i47);
                short s38 = (short) (((b29 & 255) >> 5) | (((short) (bArr[i27 + 10] & 255)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s18;
                sArr2[s36] = s19;
                sArr2[s27] = s25;
                sArr2[i37] = s26;
                sArr2[s29] = s28;
                sArr2[5] = s35;
                sArr2[i39] = s37;
                sArr2[7] = s38;
                i27 += 11;
                for (int i48 = 0; i48 < 8; i48++) {
                    this.vec[i28].setCoeffIndex((i29 * 8) + i48, (short) ((((sArr2[i48] & 2047) * MLKEMEngine.KyberQ) + 1024) >> 11));
                }
                i29++;
                i15 = i37;
                i16 = i39;
                s15 = s27;
                s16 = s29;
                s17 = s36;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i15 = 0;
        while (i15 < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i15);
            int i16 = i15 * MLKEMEngine.KyberPolyBytes;
            i15++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i16, i15 * MLKEMEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i15) {
        return this.vec[i15];
    }

    public void polyVecInverseNttToMont() {
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            getVectorIndex(i15).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            getVectorIndex(i15).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            getVectorIndex(i15).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            System.arraycopy(this.vec[i15].toBytes(), 0, bArr, i15 * MLKEMEngine.KyberPolyBytes, MLKEMEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            sb5.append(this.vec[i15].toString());
            if (i15 != this.kyberK - 1) {
                sb5.append(", ");
            }
        }
        sb5.append("]");
        return sb5.toString();
    }

    public PolyVec(MLKEMEngine mLKEMEngine) {
        this.engine = mLKEMEngine;
        this.kyberK = mLKEMEngine.getKyberK();
        this.polyVecBytes = mLKEMEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            this.vec[i15] = new Poly(mLKEMEngine);
        }
    }
}
