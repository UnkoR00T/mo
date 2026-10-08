package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class MLKEMIndCpa {
    public final int KyberGenerateMatrixNBlocks;
    private final MLKEMEngine engine;
    private final int indCpaBytes;
    private final int indCpaPublicKeyBytes;
    private final int kyberK;
    private final int polyCompressedBytes;
    private final int polyVecBytes;
    private final int polyVecCompressedBytes;
    private Symmetric symmetric;

    public MLKEMIndCpa(MLKEMEngine mLKEMEngine) {
        this.engine = mLKEMEngine;
        this.kyberK = mLKEMEngine.getKyberK();
        this.indCpaPublicKeyBytes = mLKEMEngine.getKyberPublicKeyBytes();
        this.polyVecBytes = mLKEMEngine.getKyberPolyVecBytes();
        this.indCpaBytes = mLKEMEngine.getKyberIndCpaBytes();
        this.polyVecCompressedBytes = mLKEMEngine.getKyberPolyVecCompressedBytes();
        this.polyCompressedBytes = mLKEMEngine.getKyberPolyCompressedBytes();
        Symmetric symmetric = mLKEMEngine.getSymmetric();
        this.symmetric = symmetric;
        int i15 = symmetric.xofBlockBytes;
        this.KyberGenerateMatrixNBlocks = (i15 + 472) / i15;
    }

    private byte[] packCipherText(PolyVec polyVec, Poly poly) {
        byte[] bArr = new byte[this.indCpaBytes];
        System.arraycopy(polyVec.compressPolyVec(), 0, bArr, 0, this.polyVecCompressedBytes);
        System.arraycopy(poly.compressPoly(), 0, bArr, this.polyVecCompressedBytes, this.polyCompressedBytes);
        return bArr;
    }

    private static int rejectionSampling(Poly poly, int i15, int i16, byte[] bArr, int i17) {
        int i18 = 0;
        int i19 = 0;
        while (i18 < i16) {
            int i25 = i19 + 3;
            if (i25 > i17) {
                break;
            }
            short s15 = (short) (bArr[i19] & 255);
            byte b15 = bArr[i19 + 1];
            short s16 = (short) ((s15 | (((short) (b15 & 255)) << 8)) & 4095);
            short s17 = (short) (((((short) (bArr[i19 + 2] & 255)) << 4) | (((short) (b15 & 255)) >> 4)) & 4095);
            if (s16 < 3329) {
                poly.setCoeffIndex(i15 + i18, s16);
                i18++;
            }
            if (i18 < i16 && s17 < 3329) {
                poly.setCoeffIndex(i15 + i18, s17);
                i18++;
            }
            i19 = i25;
        }
        return i18;
    }

    private void unpackCipherText(PolyVec polyVec, Poly poly, byte[] bArr) {
        polyVec.decompressPolyVec(Arrays.copyOfRange(bArr, 0, this.engine.getKyberPolyVecCompressedBytes()));
        poly.decompressPoly(Arrays.copyOfRange(bArr, this.engine.getKyberPolyVecCompressedBytes(), bArr.length));
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[MLKEMEngine.getKyberIndCpaMsgBytes()];
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        Poly poly = new Poly(this.engine);
        Poly poly2 = new Poly(this.engine);
        unpackCipherText(polyVec, poly, bArr2);
        unpackSecretKey(polyVec2, bArr);
        polyVec.polyVecNtt();
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        poly2.polyInverseNttToMont();
        poly2.polySubtract(poly);
        poly2.reduce();
        return poly2.toMsg();
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        PolyVec polyVec3 = new PolyVec(this.engine);
        PolyVec polyVec4 = new PolyVec(this.engine);
        PolyVec[] polyVecArr = new PolyVec[this.engine.getKyberK()];
        Poly poly = new Poly(this.engine);
        Poly poly2 = new Poly(this.engine);
        Poly poly3 = new Poly(this.engine);
        byte[] bArrUnpackPublicKey = unpackPublicKey(polyVec2, bArr);
        poly3.fromMsg(bArr2);
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            polyVecArr[i15] = new PolyVec(this.engine);
        }
        generateMatrix(polyVecArr, bArrUnpackPublicKey, true);
        byte b15 = 0;
        for (int i16 = 0; i16 < this.kyberK; i16++) {
            polyVec.getVectorIndex(i16).getEta1Noise(bArr3, b15);
            b15 = (byte) (b15 + 1);
        }
        for (int i17 = 0; i17 < this.kyberK; i17++) {
            polyVec3.getVectorIndex(i17).getEta2Noise(bArr3, b15);
            b15 = (byte) (b15 + 1);
        }
        poly.getEta2Noise(bArr3, b15);
        polyVec.polyVecNtt();
        for (int i18 = 0; i18 < this.kyberK; i18++) {
            PolyVec.pointwiseAccountMontgomery(polyVec4.getVectorIndex(i18), polyVecArr[i18], polyVec, this.engine);
        }
        PolyVec.pointwiseAccountMontgomery(poly2, polyVec2, polyVec, this.engine);
        polyVec4.polyVecInverseNttToMont();
        poly2.polyInverseNttToMont();
        polyVec4.addPoly(polyVec3);
        poly2.addCoeffs(poly);
        poly2.addCoeffs(poly3);
        polyVec4.reducePoly();
        poly2.reduce();
        return packCipherText(polyVec4, poly2);
    }

    byte[][] generateKeyPair(byte[] bArr) {
        PolyVec polyVec = new PolyVec(this.engine);
        PolyVec polyVec2 = new PolyVec(this.engine);
        PolyVec polyVec3 = new PolyVec(this.engine);
        byte[] bArr2 = new byte[64];
        this.symmetric.hash_g(bArr2, Arrays.append(bArr, (byte) this.kyberK));
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 32);
        PolyVec[] polyVecArr = new PolyVec[this.kyberK];
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            polyVecArr[i15] = new PolyVec(this.engine);
        }
        generateMatrix(polyVecArr, bArr3, false);
        byte b15 = 0;
        for (int i16 = 0; i16 < this.kyberK; i16++) {
            polyVec.getVectorIndex(i16).getEta1Noise(bArr4, b15);
            b15 = (byte) (b15 + 1);
        }
        for (int i17 = 0; i17 < this.kyberK; i17++) {
            polyVec3.getVectorIndex(i17).getEta1Noise(bArr4, b15);
            b15 = (byte) (b15 + 1);
        }
        polyVec.polyVecNtt();
        polyVec3.polyVecNtt();
        for (int i18 = 0; i18 < this.kyberK; i18++) {
            PolyVec.pointwiseAccountMontgomery(polyVec2.getVectorIndex(i18), polyVecArr[i18], polyVec, this.engine);
            polyVec2.getVectorIndex(i18).convertToMont();
        }
        polyVec2.addPoly(polyVec3);
        polyVec2.reducePoly();
        return new byte[][]{packPublicKey(polyVec2, bArr3), packSecretKey(polyVec)};
    }

    public void generateMatrix(PolyVec[] polyVecArr, byte[] bArr, boolean z15) {
        byte b15;
        byte b16;
        byte[] bArr2 = new byte[(this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes) + 2];
        for (int i15 = 0; i15 < this.kyberK; i15++) {
            for (int i16 = 0; i16 < this.kyberK; i16++) {
                Symmetric symmetric = this.symmetric;
                if (z15) {
                    b15 = (byte) i15;
                    b16 = (byte) i16;
                } else {
                    b15 = (byte) i16;
                    b16 = (byte) i15;
                }
                symmetric.xofAbsorb(bArr, b15, b16);
                Symmetric symmetric2 = this.symmetric;
                symmetric2.xofSqueezeBlocks(bArr2, 0, symmetric2.xofBlockBytes * this.KyberGenerateMatrixNBlocks);
                int i17 = this.KyberGenerateMatrixNBlocks * this.symmetric.xofBlockBytes;
                int iRejectionSampling = rejectionSampling(polyVecArr[i15].getVectorIndex(i16), 0, 256, bArr2, i17);
                while (iRejectionSampling < 256) {
                    int i18 = i17 % 3;
                    for (int i19 = 0; i19 < i18; i19++) {
                        bArr2[i19] = bArr2[(i17 - i18) + i19];
                    }
                    Symmetric symmetric3 = this.symmetric;
                    symmetric3.xofSqueezeBlocks(bArr2, i18, symmetric3.xofBlockBytes * 2);
                    i17 = this.symmetric.xofBlockBytes + i18;
                    iRejectionSampling += rejectionSampling(polyVecArr[i15].getVectorIndex(i16), iRejectionSampling, 256 - iRejectionSampling, bArr2, i17);
                }
            }
        }
    }

    public byte[] packPublicKey(PolyVec polyVec, byte[] bArr) {
        byte[] bArr2 = new byte[this.indCpaPublicKeyBytes];
        System.arraycopy(polyVec.toBytes(), 0, bArr2, 0, this.polyVecBytes);
        System.arraycopy(bArr, 0, bArr2, this.polyVecBytes, 32);
        return bArr2;
    }

    public byte[] packSecretKey(PolyVec polyVec) {
        return polyVec.toBytes();
    }

    public byte[] unpackPublicKey(PolyVec polyVec, byte[] bArr) {
        byte[] bArr2 = new byte[32];
        polyVec.fromBytes(bArr);
        System.arraycopy(bArr, this.polyVecBytes, bArr2, 0, 32);
        return bArr2;
    }

    public void unpackSecretKey(PolyVec polyVec, byte[] bArr) {
        polyVec.fromBytes(bArr);
    }
}
