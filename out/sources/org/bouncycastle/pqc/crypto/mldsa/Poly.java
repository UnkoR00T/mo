package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes5.dex */
class Poly {
    private static final int DilithiumN = 256;
    private int[] coeffs = new int[256];
    private final MLDSAEngine engine;
    private final int polyUniformNBlocks;
    private final Symmetric symmetric;

    public Poly(MLDSAEngine mLDSAEngine) {
        this.engine = mLDSAEngine;
        Symmetric symmetricGetSymmetric = mLDSAEngine.GetSymmetric();
        this.symmetric = symmetricGetSymmetric;
        int i15 = symmetricGetSymmetric.stream128BlockBytes;
        this.polyUniformNBlocks = (i15 + 767) / i15;
    }

    private static int rejectEta(Poly poly, int i15, int i16, byte[] bArr, int i17, int i18) {
        int i19 = 0;
        int i25 = 0;
        while (i19 < i16 && i25 < i17) {
            byte b15 = bArr[i25];
            int i26 = b15 & 15;
            i25++;
            int i27 = (b15 & 255) >> 4;
            if (i18 == 2) {
                if (i26 < 15) {
                    poly.setCoeffIndex(i15 + i19, 2 - (i26 - (((i26 * 205) >> 10) * 5)));
                    i19++;
                }
                if (i27 < 15 && i19 < i16) {
                    poly.setCoeffIndex(i15 + i19, 2 - (i27 - (((i27 * 205) >> 10) * 5)));
                    i19++;
                }
            } else if (i18 == 4) {
                if (i26 < 9) {
                    poly.setCoeffIndex(i15 + i19, 4 - i26);
                    i19++;
                }
                if (i27 < 9 && i19 < i16) {
                    poly.setCoeffIndex(i15 + i19, 4 - i27);
                    i19++;
                }
            }
        }
        return i19;
    }

    private static int rejectUniform(Poly poly, int i15, int i16, byte[] bArr, int i17) {
        int i18 = 0;
        int i19 = 0;
        while (i18 < i16 && i19 + 3 <= i17) {
            int i25 = i19 + 2;
            int i26 = ((bArr[i19 + 1] & 255) << 8) | (bArr[i19] & 255);
            i19 += 3;
            int i27 = (i26 | ((bArr[i25] & 255) << 16)) & 8388607;
            if (i27 < 8380417) {
                poly.setCoeffIndex(i15 + i18, i27);
                i18++;
            }
        }
        return i18;
    }

    private void unpackZ(byte[] bArr) {
        int dilithiumGamma1 = this.engine.getDilithiumGamma1();
        int i15 = 0;
        if (dilithiumGamma1 != 131072) {
            if (dilithiumGamma1 != 524288) {
                throw new RuntimeException("Wrong Dilithiumn Gamma1!");
            }
            while (i15 < 128) {
                int i16 = i15 * 2;
                int i17 = i15 * 5;
                int i18 = i17 + 2;
                setCoeffIndex(i16, ((bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16)) & 1048575);
                int i19 = i16 + 1;
                setCoeffIndex(i19, (((bArr[i17 + 4] & 255) << 12) | ((bArr[i18] & 255) >> 4) | ((bArr[i17 + 3] & 255) << 4)) & 1048575);
                setCoeffIndex(i16, dilithiumGamma1 - getCoeffIndex(i16));
                setCoeffIndex(i19, dilithiumGamma1 - getCoeffIndex(i19));
                i15++;
            }
            return;
        }
        while (i15 < 64) {
            int i25 = i15 * 4;
            int i26 = i15 * 9;
            int i27 = i26 + 2;
            setCoeffIndex(i25, ((bArr[i26] & 255) | ((bArr[i26 + 1] & 255) << 8) | ((bArr[i27] & 255) << 16)) & 262143);
            int i28 = i25 + 1;
            int i29 = i26 + 4;
            setCoeffIndex(i28, (((bArr[i27] & 255) >> 2) | ((bArr[i26 + 3] & 255) << 6) | ((bArr[i29] & 255) << 14)) & 262143);
            int i35 = i25 + 2;
            int i36 = i26 + 6;
            setCoeffIndex(i35, (((bArr[i29] & 255) >> 4) | ((bArr[i26 + 5] & 255) << 4) | ((bArr[i36] & 255) << 12)) & 262143);
            int i37 = i25 + 3;
            setCoeffIndex(i37, (((bArr[i26 + 8] & 255) << 10) | ((bArr[i36] & 255) >> 6) | ((bArr[i26 + 7] & 255) << 2)) & 262143);
            setCoeffIndex(i25, dilithiumGamma1 - getCoeffIndex(i25));
            setCoeffIndex(i28, dilithiumGamma1 - getCoeffIndex(i28));
            setCoeffIndex(i35, dilithiumGamma1 - getCoeffIndex(i35));
            setCoeffIndex(i37, dilithiumGamma1 - getCoeffIndex(i37));
            i15++;
        }
    }

    public void addPoly(Poly poly) {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, getCoeffIndex(i15) + poly.getCoeffIndex(i15));
        }
    }

    public void challenge(byte[] bArr, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        byte[] bArr2 = new byte[this.symmetric.stream256BlockBytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, i15, i16);
        sHAKEDigest.doOutput(bArr2, 0, this.symmetric.stream256BlockBytes);
        long j15 = 0;
        int i25 = 0;
        while (true) {
            i17 = 8;
            if (i25 >= 8) {
                break;
            }
            j15 |= ((long) (bArr2[i25] & 255)) << (i25 * 8);
            i25++;
        }
        for (int i26 = 0; i26 < 256; i26++) {
            setCoeffIndex(i26, 0);
        }
        int dilithiumTau = 256 - this.engine.getDilithiumTau();
        while (dilithiumTau < 256) {
            while (true) {
                int i27 = this.symmetric.stream256BlockBytes;
                if (i17 >= i27) {
                    sHAKEDigest.doOutput(bArr2, 0, i27);
                    i17 = 0;
                }
                i18 = i17 + 1;
                i19 = bArr2[i17] & 255;
                if (i19 <= dilithiumTau) {
                    break;
                } else {
                    i17 = i18;
                }
            }
            setCoeffIndex(dilithiumTau, getCoeffIndex(i19));
            setCoeffIndex(i19, (int) (1 - ((j15 & 1) * 2)));
            j15 >>= 1;
            dilithiumTau++;
            i17 = i18;
        }
    }

    public boolean checkNorm(int i15) {
        if (i15 > 1047552) {
            return true;
        }
        for (int i16 = 0; i16 < 256; i16++) {
            if (getCoeffIndex(i16) - ((getCoeffIndex(i16) >> 31) & (getCoeffIndex(i16) * 2)) >= i15) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Reduce.conditionalAddQ(getCoeffIndex(i15)));
        }
    }

    void copyTo(Poly poly) {
        System.arraycopy(this.coeffs, 0, poly.coeffs, 0, 256);
    }

    public void decompose(Poly poly) {
        int dilithiumGamma2 = this.engine.getDilithiumGamma2();
        for (int i15 = 0; i15 < 256; i15++) {
            int[] iArrDecompose = Rounding.decompose(getCoeffIndex(i15), dilithiumGamma2);
            setCoeffIndex(i15, iArrDecompose[1]);
            poly.setCoeffIndex(i15, iArrDecompose[0]);
        }
    }

    public int getCoeffIndex(int i15) {
        return this.coeffs[i15];
    }

    public int[] getCoeffs() {
        return this.coeffs;
    }

    public void invNttToMont() {
        setCoeffs(Ntt.invNttToMont(getCoeffs()));
    }

    void packW1(byte[] bArr, int i15) {
        int i16 = 0;
        if (this.engine.getDilithiumGamma2() != 95232) {
            if (this.engine.getDilithiumGamma2() == 261888) {
                while (i16 < 128) {
                    int i17 = i16 * 2;
                    bArr[i15 + i16] = (byte) ((getCoeffIndex(i17 + 1) << 4) | getCoeffIndex(i17));
                    i16++;
                }
                return;
            }
            return;
        }
        while (i16 < 64) {
            int i18 = (i16 * 3) + i15;
            int i19 = i16 * 4;
            int i25 = i19 + 1;
            bArr[i18] = (byte) (((byte) getCoeffIndex(i19)) | (getCoeffIndex(i25) << 6));
            int i26 = i19 + 2;
            bArr[i18 + 1] = (byte) (((byte) (getCoeffIndex(i25) >> 2)) | (getCoeffIndex(i26) << 4));
            bArr[i18 + 2] = (byte) ((getCoeffIndex(i19 + 3) << 2) | ((byte) (getCoeffIndex(i26) >> 4)));
            i16++;
        }
    }

    public void pointwiseAccountMontgomery(PolyVecL polyVecL, PolyVecL polyVecL2) {
        Poly poly = new Poly(this.engine);
        pointwiseMontgomery(polyVecL.getVectorIndex(0), polyVecL2.getVectorIndex(0));
        for (int i15 = 1; i15 < this.engine.getDilithiumL(); i15++) {
            poly.pointwiseMontgomery(polyVecL.getVectorIndex(i15), polyVecL2.getVectorIndex(i15));
            addPoly(poly);
        }
    }

    public void pointwiseMontgomery(Poly poly, Poly poly2) {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Reduce.montgomeryReduce(((long) poly.getCoeffIndex(i15)) * ((long) poly2.getCoeffIndex(i15))));
        }
    }

    public byte[] polyEtaPack(byte[] bArr, int i15) {
        byte[] bArr2 = new byte[8];
        if (this.engine.getDilithiumEta() == 2) {
            for (int i16 = 0; i16 < 32; i16++) {
                int i17 = i16 * 8;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17));
                bArr2[1] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 1));
                bArr2[2] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 2));
                bArr2[3] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 3));
                bArr2[4] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 4));
                bArr2[5] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 5));
                bArr2[6] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 6));
                bArr2[7] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i17 + 7));
                int i18 = (i16 * 3) + i15;
                bArr[i18] = (byte) (bArr2[0] | (bArr2[1] << 3) | (bArr2[2] << 6));
                bArr[i18 + 1] = (byte) ((bArr2[3] << 1) | (bArr2[2] >> 2) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i18 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException("Eta needs to be 2 or 4!");
            }
            for (int i19 = 0; i19 < 128; i19++) {
                int i25 = i19 * 2;
                bArr2[0] = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i25));
                byte dilithiumEta = (byte) (this.engine.getDilithiumEta() - getCoeffIndex(i25 + 1));
                bArr2[1] = dilithiumEta;
                bArr[i15 + i19] = (byte) ((dilithiumEta << 4) | bArr2[0]);
            }
        }
        return bArr;
    }

    public void polyEtaUnpack(byte[] bArr, int i15) {
        int dilithiumEta = this.engine.getDilithiumEta();
        int i16 = 0;
        if (this.engine.getDilithiumEta() != 2) {
            if (this.engine.getDilithiumEta() == 4) {
                while (i16 < 128) {
                    int i17 = i16 * 2;
                    int i18 = i15 + i16;
                    setCoeffIndex(i17, bArr[i18] & 15);
                    int i19 = i17 + 1;
                    setCoeffIndex(i19, (bArr[i18] & 255) >> 4);
                    setCoeffIndex(i17, dilithiumEta - getCoeffIndex(i17));
                    setCoeffIndex(i19, dilithiumEta - getCoeffIndex(i19));
                    i16++;
                }
                return;
            }
            return;
        }
        while (i16 < 32) {
            int i25 = (i16 * 3) + i15;
            int i26 = i16 * 8;
            setCoeffIndex(i26, bArr[i25] & 7);
            int i27 = i26 + 1;
            setCoeffIndex(i27, ((bArr[i25] & 255) >> 3) & 7);
            int i28 = i26 + 2;
            int i29 = i25 + 1;
            setCoeffIndex(i28, ((bArr[i25] & 255) >> 6) | (((bArr[i29] & 255) << 2) & 7));
            int i35 = i26 + 3;
            setCoeffIndex(i35, ((bArr[i29] & 255) >> 1) & 7);
            int i36 = i26 + 4;
            setCoeffIndex(i36, ((bArr[i29] & 255) >> 4) & 7);
            int i37 = i26 + 5;
            int i38 = i25 + 2;
            setCoeffIndex(i37, ((bArr[i29] & 255) >> 7) | (((bArr[i38] & 255) << 1) & 7));
            int i39 = i26 + 6;
            setCoeffIndex(i39, ((bArr[i38] & 255) >> 2) & 7);
            int i45 = i26 + 7;
            setCoeffIndex(i45, ((bArr[i38] & 255) >> 5) & 7);
            setCoeffIndex(i26, dilithiumEta - getCoeffIndex(i26));
            setCoeffIndex(i27, dilithiumEta - getCoeffIndex(i27));
            setCoeffIndex(i28, dilithiumEta - getCoeffIndex(i28));
            setCoeffIndex(i35, dilithiumEta - getCoeffIndex(i35));
            setCoeffIndex(i36, dilithiumEta - getCoeffIndex(i36));
            setCoeffIndex(i37, dilithiumEta - getCoeffIndex(i37));
            setCoeffIndex(i39, dilithiumEta - getCoeffIndex(i39));
            setCoeffIndex(i45, dilithiumEta - getCoeffIndex(i45));
            i16++;
        }
    }

    public int polyMakeHint(Poly poly, Poly poly2) {
        int coeffIndex = 0;
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Rounding.makeHint(poly.getCoeffIndex(i15), poly2.getCoeffIndex(i15), this.engine));
            coeffIndex += getCoeffIndex(i15);
        }
        return coeffIndex;
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(this.coeffs));
    }

    public void polyUseHint(Poly poly, Poly poly2) {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Rounding.useHint(poly.getCoeffIndex(i15), poly2.getCoeffIndex(i15), this.engine.getDilithiumGamma2()));
        }
    }

    public byte[] polyt0Pack(byte[] bArr, int i15) {
        for (int i16 = 0; i16 < 32; i16++) {
            int i17 = i16 * 8;
            int[] iArr = {4096 - getCoeffIndex(i17), 4096 - getCoeffIndex(i17 + 1), 4096 - getCoeffIndex(i17 + 2), 4096 - getCoeffIndex(i17 + 3), 4096 - getCoeffIndex(i17 + 4), 4096 - getCoeffIndex(i17 + 5), 4096 - getCoeffIndex(i17 + 6), 4096 - getCoeffIndex(i17 + 7)};
            int i18 = (i16 * 13) + i15;
            int i19 = iArr[0];
            bArr[i18] = (byte) i19;
            int i25 = i18 + 1;
            byte b15 = (byte) (i19 >> 8);
            bArr[i25] = b15;
            int i26 = iArr[1];
            bArr[i25] = (byte) (b15 | ((byte) (i26 << 5)));
            bArr[i18 + 2] = (byte) (i26 >> 3);
            int i27 = i18 + 3;
            byte b16 = (byte) (i26 >> 11);
            bArr[i27] = b16;
            int i28 = iArr[2];
            bArr[i27] = (byte) (b16 | ((byte) (i28 << 2)));
            int i29 = i18 + 4;
            byte b17 = (byte) (i28 >> 6);
            bArr[i29] = b17;
            int i35 = iArr[3];
            bArr[i29] = (byte) (b17 | ((byte) (i35 << 7)));
            bArr[i18 + 5] = (byte) (i35 >> 1);
            int i36 = i18 + 6;
            byte b18 = (byte) (i35 >> 9);
            bArr[i36] = b18;
            int i37 = iArr[4];
            bArr[i36] = (byte) (b18 | ((byte) (i37 << 4)));
            bArr[i18 + 7] = (byte) (i37 >> 4);
            int i38 = i18 + 8;
            byte b19 = (byte) (i37 >> 12);
            bArr[i38] = b19;
            int i39 = iArr[5];
            bArr[i38] = (byte) (b19 | ((byte) (i39 << 1)));
            int i45 = i18 + 9;
            byte b25 = (byte) (i39 >> 7);
            bArr[i45] = b25;
            int i46 = iArr[6];
            bArr[i45] = (byte) (b25 | ((byte) (i46 << 6)));
            bArr[i18 + 10] = (byte) (i46 >> 2);
            int i47 = i18 + 11;
            byte b26 = (byte) (i46 >> 10);
            bArr[i47] = b26;
            int i48 = iArr[7];
            bArr[i47] = (byte) (((byte) (i48 << 3)) | b26);
            bArr[i18 + 12] = (byte) (i48 >> 5);
        }
        return bArr;
    }

    public void polyt0Unpack(byte[] bArr, int i15) {
        for (int i16 = 0; i16 < 32; i16++) {
            int i17 = (i16 * 13) + i15;
            int i18 = i16 * 8;
            int i19 = i17 + 1;
            setCoeffIndex(i18, ((bArr[i17] & 255) | ((bArr[i19] & 255) << 8)) & 8191);
            int i25 = i18 + 1;
            int i26 = i17 + 3;
            setCoeffIndex(i25, (((bArr[i19] & 255) >> 5) | ((bArr[i17 + 2] & 255) << 3) | ((bArr[i26] & 255) << 11)) & 8191);
            int i27 = i18 + 2;
            int i28 = i17 + 4;
            setCoeffIndex(i27, (((bArr[i26] & 255) >> 2) | ((bArr[i28] & 255) << 6)) & 8191);
            int i29 = i18 + 3;
            int i35 = i17 + 6;
            setCoeffIndex(i29, (((bArr[i28] & 255) >> 7) | ((bArr[i17 + 5] & 255) << 1) | ((bArr[i35] & 255) << 9)) & 8191);
            int i36 = i18 + 4;
            int i37 = i17 + 8;
            setCoeffIndex(i36, (((bArr[i35] & 255) >> 4) | ((bArr[i17 + 7] & 255) << 4) | ((bArr[i37] & 255) << 12)) & 8191);
            int i38 = i18 + 5;
            int i39 = i17 + 9;
            setCoeffIndex(i38, (((bArr[i37] & 255) >> 1) | ((bArr[i39] & 255) << 7)) & 8191);
            int i45 = i18 + 6;
            int i46 = i17 + 11;
            setCoeffIndex(i45, (((bArr[i39] & 255) >> 6) | ((bArr[i17 + 10] & 255) << 2) | ((bArr[i46] & 255) << 10)) & 8191);
            int i47 = i18 + 7;
            setCoeffIndex(i47, (((bArr[i17 + 12] & 255) << 5) | ((bArr[i46] & 255) >> 3)) & 8191);
            setCoeffIndex(i18, 4096 - getCoeffIndex(i18));
            setCoeffIndex(i25, 4096 - getCoeffIndex(i25));
            setCoeffIndex(i27, 4096 - getCoeffIndex(i27));
            setCoeffIndex(i29, 4096 - getCoeffIndex(i29));
            setCoeffIndex(i36, 4096 - getCoeffIndex(i36));
            setCoeffIndex(i38, 4096 - getCoeffIndex(i38));
            setCoeffIndex(i45, 4096 - getCoeffIndex(i45));
            setCoeffIndex(i47, 4096 - getCoeffIndex(i47));
        }
    }

    public byte[] polyt1Pack() {
        byte[] bArr = new byte[320];
        for (int i15 = 0; i15 < 64; i15++) {
            int i16 = i15 * 5;
            int[] iArr = this.coeffs;
            int i17 = i15 * 4;
            int i18 = iArr[i17];
            bArr[i16] = (byte) i18;
            int i19 = iArr[i17 + 1];
            bArr[i16 + 1] = (byte) ((i18 >> 8) | (i19 << 2));
            int i25 = i19 >> 6;
            int i26 = iArr[i17 + 2];
            bArr[i16 + 2] = (byte) (i25 | (i26 << 4));
            int i27 = iArr[i17 + 3];
            bArr[i16 + 3] = (byte) ((i27 << 6) | (i26 >> 4));
            bArr[i16 + 4] = (byte) (i27 >> 2);
        }
        return bArr;
    }

    public void polyt1Unpack(byte[] bArr) {
        for (int i15 = 0; i15 < 64; i15++) {
            int i16 = i15 * 4;
            int i17 = i15 * 5;
            int i18 = i17 + 1;
            setCoeffIndex(i16, ((bArr[i17] & 255) | ((bArr[i18] & 255) << 8)) & 1023);
            int i19 = i17 + 2;
            setCoeffIndex(i16 + 1, (((bArr[i18] & 255) >> 2) | ((bArr[i19] & 255) << 6)) & 1023);
            int i25 = (bArr[i19] & 255) >> 4;
            int i26 = i17 + 3;
            setCoeffIndex(i16 + 2, (i25 | ((bArr[i26] & 255) << 4)) & 1023);
            setCoeffIndex(i16 + 3, (((bArr[i17 + 4] & 255) << 2) | ((bArr[i26] & 255) >> 6)) & 1023);
        }
    }

    public void power2Round(Poly poly) {
        Rounding.power2RoundAll(this.coeffs, poly.coeffs);
    }

    public void reduce() {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, Reduce.reduce32(getCoeffIndex(i15)));
        }
    }

    public void setCoeffIndex(int i15, int i16) {
        this.coeffs[i15] = i16;
    }

    public void setCoeffs(int[] iArr) {
        this.coeffs = iArr;
    }

    public void shiftLeft() {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, getCoeffIndex(i15) << 13);
        }
    }

    public void subtract(Poly poly) {
        for (int i15 = 0; i15 < 256; i15++) {
            setCoeffIndex(i15, getCoeffIndex(i15) - poly.getCoeffIndex(i15));
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        int i15 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i15 >= iArr.length) {
                sb5.append("]");
                return sb5.toString();
            }
            sb5.append(iArr[i15]);
            if (i15 != this.coeffs.length - 1) {
                sb5.append(", ");
            }
            i15++;
        }
    }

    public void uniformBlocks(byte[] bArr, short s15) {
        int i15 = this.polyUniformNBlocks;
        Symmetric symmetric = this.symmetric;
        int i16 = i15 * symmetric.stream128BlockBytes;
        byte[] bArr2 = new byte[i16 + 2];
        symmetric.stream128init(bArr, s15);
        this.symmetric.stream128squeezeBlocks(bArr2, 0, i16);
        int iRejectUniform = rejectUniform(this, 0, 256, bArr2, i16);
        while (iRejectUniform < 256) {
            int i17 = i16 % 3;
            for (int i18 = 0; i18 < i17; i18++) {
                bArr2[i18] = bArr2[(i16 - i17) + i18];
            }
            Symmetric symmetric2 = this.symmetric;
            symmetric2.stream128squeezeBlocks(bArr2, i17, symmetric2.stream128BlockBytes);
            i16 = this.symmetric.stream128BlockBytes + i17;
            iRejectUniform += rejectUniform(this, iRejectUniform, 256 - iRejectUniform, bArr2, i16);
        }
    }

    public void uniformEta(byte[] bArr, short s15) {
        int i15;
        int i16;
        int dilithiumEta = this.engine.getDilithiumEta();
        if (this.engine.getDilithiumEta() == 2) {
            i15 = this.symmetric.stream256BlockBytes;
            i16 = i15 + 135;
        } else {
            if (this.engine.getDilithiumEta() != 4) {
                throw new RuntimeException("Wrong Dilithium Eta!");
            }
            i15 = this.symmetric.stream256BlockBytes;
            i16 = i15 + 226;
        }
        int i17 = i16 / i15;
        Symmetric symmetric = this.symmetric;
        int i18 = i17 * symmetric.stream256BlockBytes;
        byte[] bArr2 = new byte[i18];
        symmetric.stream256init(bArr, s15);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, i18);
        Poly poly = this;
        int iRejectEta = rejectEta(poly, 0, 256, bArr2, i18, dilithiumEta);
        while (iRejectEta < 256) {
            Symmetric symmetric2 = poly.symmetric;
            symmetric2.stream256squeezeBlocks(bArr2, 0, symmetric2.stream256BlockBytes);
            iRejectEta += rejectEta(poly, iRejectEta, 256 - iRejectEta, bArr2, poly.symmetric.stream256BlockBytes, dilithiumEta);
            poly = this;
        }
    }

    public void uniformGamma1(byte[] bArr, short s15) {
        int polyUniformGamma1NBlocks = this.engine.getPolyUniformGamma1NBlocks();
        Symmetric symmetric = this.symmetric;
        byte[] bArr2 = new byte[polyUniformGamma1NBlocks * symmetric.stream256BlockBytes];
        symmetric.stream256init(bArr, s15);
        this.symmetric.stream256squeezeBlocks(bArr2, 0, this.engine.getPolyUniformGamma1NBlocks() * this.symmetric.stream256BlockBytes);
        unpackZ(bArr2);
    }

    public void zPack(byte[] bArr, int i15) {
        int dilithiumGamma1 = this.engine.getDilithiumGamma1();
        int i16 = 0;
        if (dilithiumGamma1 != 131072) {
            if (dilithiumGamma1 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            while (i16 < 128) {
                int i17 = i16 * 2;
                int coeffIndex = dilithiumGamma1 - getCoeffIndex(i17);
                int coeffIndex2 = dilithiumGamma1 - getCoeffIndex(i17 + 1);
                int i18 = (i16 * 5) + i15;
                bArr[i18] = (byte) coeffIndex;
                bArr[i18 + 1] = (byte) (coeffIndex >> 8);
                bArr[i18 + 2] = (byte) (((byte) (coeffIndex >> 16)) | (coeffIndex2 << 4));
                bArr[i18 + 3] = (byte) (coeffIndex2 >> 4);
                bArr[i18 + 4] = (byte) (coeffIndex2 >> 12);
                i16++;
            }
            return;
        }
        while (i16 < 64) {
            int i19 = i16 * 4;
            int coeffIndex3 = dilithiumGamma1 - getCoeffIndex(i19);
            int coeffIndex4 = dilithiumGamma1 - getCoeffIndex(i19 + 1);
            int coeffIndex5 = dilithiumGamma1 - getCoeffIndex(i19 + 2);
            int coeffIndex6 = dilithiumGamma1 - getCoeffIndex(i19 + 3);
            int i25 = (i16 * 9) + i15;
            bArr[i25] = (byte) coeffIndex3;
            bArr[i25 + 1] = (byte) (coeffIndex3 >> 8);
            bArr[i25 + 2] = (byte) (((byte) (coeffIndex3 >> 16)) | (coeffIndex4 << 2));
            bArr[i25 + 3] = (byte) (coeffIndex4 >> 6);
            bArr[i25 + 4] = (byte) (((byte) (coeffIndex4 >> 14)) | (coeffIndex5 << 4));
            bArr[i25 + 5] = (byte) (coeffIndex5 >> 4);
            bArr[i25 + 6] = (byte) (((byte) (coeffIndex5 >> 12)) | (coeffIndex6 << 6));
            bArr[i25 + 7] = (byte) (coeffIndex6 >> 2);
            bArr[i25 + 8] = (byte) (coeffIndex6 >> 10);
            i16++;
        }
    }

    void zUnpack(byte[] bArr) {
        int i15 = 0;
        if (this.engine.getDilithiumGamma1() != 131072) {
            if (this.engine.getDilithiumGamma1() != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            while (i15 < 128) {
                int i16 = i15 * 2;
                int i17 = i15 * 5;
                int i18 = i17 + 2;
                setCoeffIndex(i16, ((bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16)) & 1048575);
                int i19 = i16 + 1;
                setCoeffIndex(i19, (((bArr[i17 + 4] & 255) << 12) | ((bArr[i18] & 255) >>> 4) | ((bArr[i17 + 3] & 255) << 4)) & 1048575);
                setCoeffIndex(i16, this.engine.getDilithiumGamma1() - getCoeffIndex(i16));
                setCoeffIndex(i19, this.engine.getDilithiumGamma1() - getCoeffIndex(i19));
                i15++;
            }
            return;
        }
        while (i15 < 64) {
            int i25 = i15 * 4;
            int i26 = i15 * 9;
            int i27 = i26 + 2;
            setCoeffIndex(i25, ((bArr[i26] & 255) | ((bArr[i26 + 1] & 255) << 8) | ((bArr[i27] & 255) << 16)) & 262143);
            int i28 = i25 + 1;
            int i29 = i26 + 4;
            setCoeffIndex(i28, (((bArr[i27] & 255) >>> 2) | ((bArr[i26 + 3] & 255) << 6) | ((bArr[i29] & 255) << 14)) & 262143);
            int i35 = i25 + 2;
            int i36 = i26 + 6;
            setCoeffIndex(i35, (((bArr[i29] & 255) >>> 4) | ((bArr[i26 + 5] & 255) << 4) | ((bArr[i36] & 255) << 12)) & 262143);
            int i37 = i25 + 3;
            setCoeffIndex(i37, (((bArr[i26 + 8] & 255) << 10) | ((bArr[i36] & 255) >>> 6) | ((bArr[i26 + 7] & 255) << 2)) & 262143);
            setCoeffIndex(i25, this.engine.getDilithiumGamma1() - getCoeffIndex(i25));
            setCoeffIndex(i28, this.engine.getDilithiumGamma1() - getCoeffIndex(i28));
            setCoeffIndex(i35, this.engine.getDilithiumGamma1() - getCoeffIndex(i35));
            setCoeffIndex(i37, this.engine.getDilithiumGamma1() - getCoeffIndex(i37));
            i15++;
        }
    }
}
