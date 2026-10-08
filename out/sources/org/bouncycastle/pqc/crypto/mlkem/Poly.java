package org.bouncycastle.pqc.crypto.mlkem;

/* JADX INFO: loaded from: classes5.dex */
class Poly {
    private MLKEMEngine engine;
    private int eta1;
    private int polyCompressedBytes;
    private Symmetric symmetric;
    private short[] coeffs = new short[256];
    private int eta2 = MLKEMEngine.getKyberEta2();

    public Poly(MLKEMEngine mLKEMEngine) {
        this.engine = mLKEMEngine;
        this.polyCompressedBytes = mLKEMEngine.getKyberPolyCompressedBytes();
        this.eta1 = mLKEMEngine.getKyberEta1();
        this.symmetric = mLKEMEngine.getSymmetric();
    }

    public static void baseMultMontgomery(Poly poly, Poly poly2, Poly poly3) {
        for (int i15 = 0; i15 < 64; i15++) {
            int i16 = i15 * 4;
            short coeffIndex = poly2.getCoeffIndex(i16);
            int i17 = i16 + 1;
            short coeffIndex2 = poly2.getCoeffIndex(i17);
            short coeffIndex3 = poly3.getCoeffIndex(i16);
            short coeffIndex4 = poly3.getCoeffIndex(i17);
            short[] sArr = Ntt.nttZetas;
            int i18 = i15 + 64;
            Ntt.baseMult(poly, i16, coeffIndex, coeffIndex2, coeffIndex3, coeffIndex4, sArr[i18]);
            int i19 = i16 + 2;
            int i25 = i16 + 3;
            Ntt.baseMult(poly, i19, poly2.getCoeffIndex(i19), poly2.getCoeffIndex(i25), poly3.getCoeffIndex(i19), poly3.getCoeffIndex(i25), (short) (sArr[i18] * (-1)));
        }
    }

    static int checkModulus(byte[] bArr, int i15) {
        int iCheckModulus = -1;
        for (int i16 = 0; i16 < 128; i16++) {
            int i17 = (i16 * 3) + i15;
            int i18 = bArr[i17] & 255;
            int i19 = bArr[i17 + 1] & 255;
            iCheckModulus = iCheckModulus & Reduce.checkModulus((short) ((i18 | (i19 << 8)) & 4095)) & Reduce.checkModulus((short) ((((bArr[i17 + 2] & 255) << 4) | (i19 >> 4)) & 4095));
        }
        return iCheckModulus;
    }

    public void addCoeffs(Poly poly) {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, (short) (getCoeffIndex(i15) + poly.getCoeffIndex(i15)));
        }
    }

    public byte[] compressPoly() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[this.polyCompressedBytes];
        conditionalSubQ();
        int i15 = this.polyCompressedBytes;
        if (i15 == 128) {
            int i16 = 0;
            for (int i17 = 0; i17 < 32; i17++) {
                for (int i18 = 0; i18 < 8; i18++) {
                    bArr[i18] = (byte) (((((getCoeffIndex((i17 * 8) + i18) << 4) + 1665) * 80635) >> 28) & 15);
                }
                bArr2[i16] = (byte) (bArr[0] | (bArr[1] << 4));
                bArr2[i16 + 1] = (byte) (bArr[2] | (bArr[3] << 4));
                bArr2[i16 + 2] = (byte) (bArr[4] | (bArr[5] << 4));
                bArr2[i16 + 3] = (byte) (bArr[6] | (bArr[7] << 4));
                i16 += 4;
            }
        } else {
            if (i15 != 160) {
                throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
            }
            int i19 = 0;
            for (int i25 = 0; i25 < 32; i25++) {
                for (int i26 = 0; i26 < 8; i26++) {
                    bArr[i26] = (byte) (((((getCoeffIndex((i25 * 8) + i26) << 5) + 1664) * 40318) >> 27) & 31);
                }
                bArr2[i19] = (byte) (bArr[0] | (bArr[1] << 5));
                bArr2[i19 + 1] = (byte) ((bArr[1] >> 3) | (bArr[2] << 2) | (bArr[3] << 7));
                bArr2[i19 + 2] = (byte) ((bArr[3] >> 1) | (bArr[4] << 4));
                bArr2[i19 + 3] = (byte) ((bArr[4] >> 4) | (bArr[5] << 1) | (bArr[6] << 6));
                bArr2[i19 + 4] = (byte) ((bArr[6] >> 2) | (bArr[7] << 3));
                i19 += 5;
            }
        }
        return bArr2;
    }

    public void conditionalSubQ() {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Reduce.conditionalSubQ(getCoeffIndex(i15)));
        }
    }

    public void convertToMont() {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Reduce.montgomeryReduce(getCoeffIndex(i15) * 1353));
        }
    }

    public void decompressPoly(byte[] bArr) {
        char c15 = 4;
        int i15 = 1;
        if (this.engine.getKyberPolyCompressedBytes() == 128) {
            int i16 = 0;
            for (int i17 = 0; i17 < 128; i17++) {
                int i18 = i17 * 2;
                setCoeffIndex(i18, (short) (((((short) (bArr[i16] & 15)) * 3329) + 8) >> 4));
                setCoeffIndex(i18 + 1, (short) (((((short) ((bArr[i16] & 255) >> 4)) * 3329) + 8) >> 4));
                i16++;
            }
            return;
        }
        if (this.engine.getKyberPolyCompressedBytes() != 160) {
            throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
        }
        int i19 = 0;
        int i25 = 0;
        while (i19 < 32) {
            byte b15 = bArr[i25];
            byte b16 = (byte) (b15 & 255);
            byte b17 = bArr[i25 + 1];
            byte b18 = (byte) (((b15 & 255) >> 5) | ((b17 & 255) << 3));
            byte b19 = (byte) ((b17 & 255) >> 2);
            byte b25 = bArr[i25 + 2];
            char c16 = c15;
            byte b26 = (byte) (((b25 & 255) << i15) | ((b17 & 255) >> 7));
            int i26 = (b25 & 255) >> 4;
            byte b27 = bArr[i25 + 3];
            int i27 = i15;
            byte b28 = (byte) (((b27 & 255) << 4) | i26);
            byte b29 = (byte) ((b27 & 255) >> 1);
            byte b35 = bArr[i25 + 4];
            byte b36 = (byte) (((b35 & 255) << 2) | ((b27 & 255) >> 6));
            byte[] bArr2 = new byte[8];
            bArr2[0] = b16;
            bArr2[i27] = b18;
            bArr2[2] = b19;
            bArr2[3] = b26;
            bArr2[c16] = b28;
            bArr2[5] = b29;
            bArr2[6] = b36;
            bArr2[7] = (byte) ((b35 & 255) >> 3);
            i25 += 5;
            for (int i28 = 0; i28 < 8; i28++) {
                setCoeffIndex((i19 * 8) + i28, (short) ((((bArr2[i28] & 31) * MLKEMEngine.KyberQ) + 16) >> 5));
            }
            i19++;
            c15 = c16;
            i15 = i27;
        }
    }

    public void fromBytes(byte[] bArr) {
        for (int i15 = 0; i15 < 128; i15++) {
            int i16 = i15 * 3;
            int i17 = bArr[i16] & 255;
            int i18 = bArr[i16 + 1] & 255;
            int i19 = bArr[i16 + 2] & 255;
            short[] sArr = this.coeffs;
            int i25 = i15 * 2;
            sArr[i25] = (short) ((i17 | (i18 << 8)) & 4095);
            sArr[i25 + 1] = (short) (((i19 << 4) | (i18 >> 4)) & 4095);
        }
    }

    public void fromMsg(byte[] bArr) {
        if (bArr.length != 32) {
            throw new RuntimeException("KYBER_INDCPA_MSGBYTES must be equal to KYBER_N/8 bytes!");
        }
        for (int i15 = 0; i15 < 32; i15++) {
            for (int i16 = 0; i16 < 8; i16++) {
                setCoeffIndex((i15 * 8) + i16, (short) (((short) (((short) (((bArr[i15] & 255) >> i16) & 1)) * (-1))) & 1665));
            }
        }
    }

    public short getCoeffIndex(int i15) {
        return this.coeffs[i15];
    }

    public short[] getCoeffs() {
        return this.coeffs;
    }

    public void getEta1Noise(byte[] bArr, byte b15) {
        byte[] bArr2 = new byte[(this.eta1 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b15);
        CBD.mlkemCBD(this, bArr2, this.eta1);
    }

    public void getEta2Noise(byte[] bArr, byte b15) {
        byte[] bArr2 = new byte[(this.eta2 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b15);
        CBD.mlkemCBD(this, bArr2, this.eta2);
    }

    public void polyInverseNttToMont() {
        setCoeffs(Ntt.invNtt(getCoeffs()));
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(getCoeffs()));
        reduce();
    }

    public void polySubtract(Poly poly) {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, (short) (poly.getCoeffIndex(i15) - getCoeffIndex(i15)));
        }
    }

    public void reduce() {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Reduce.barretReduce(getCoeffIndex(i15)));
        }
    }

    public void setCoeffIndex(int i15, short s15) {
        this.coeffs[i15] = s15;
    }

    public void setCoeffs(short[] sArr) {
        this.coeffs = sArr;
    }

    public byte[] toBytes() {
        conditionalSubQ();
        byte[] bArr = new byte[MLKEMEngine.KyberPolyBytes];
        for (int i15 = 0; i15 < 128; i15++) {
            short[] sArr = this.coeffs;
            int i16 = i15 * 2;
            short s15 = sArr[i16];
            short s16 = sArr[i16 + 1];
            int i17 = i15 * 3;
            bArr[i17] = (byte) s15;
            bArr[i17 + 1] = (byte) ((s15 >> 8) | (s16 << 4));
            bArr[i17 + 2] = (byte) (s16 >> 4);
        }
        return bArr;
    }

    public byte[] toMsg() {
        byte[] bArr = new byte[MLKEMEngine.getKyberIndCpaMsgBytes()];
        conditionalSubQ();
        for (int i15 = 0; i15 < 32; i15++) {
            bArr[i15] = 0;
            for (int i16 = 0; i16 < 8; i16++) {
                short coeffIndex = getCoeffIndex((i15 * 8) + i16);
                bArr[i15] = (byte) (((byte) ((((coeffIndex - 2497) & (832 - coeffIndex)) >>> 31) << i16)) | bArr[i15]);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        int i15 = 0;
        while (true) {
            short[] sArr = this.coeffs;
            if (i15 >= sArr.length) {
                sb5.append("]");
                return sb5.toString();
            }
            sb5.append((int) sArr[i15]);
            if (i15 != this.coeffs.length - 1) {
                sb5.append(", ");
            }
            i15++;
        }
    }
}
