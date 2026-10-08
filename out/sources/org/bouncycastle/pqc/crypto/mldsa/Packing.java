package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class Packing {
    Packing() {
    }

    static byte[] packPublicKey(PolyVecK polyVecK, MLDSAEngine mLDSAEngine) {
        byte[] bArr = new byte[mLDSAEngine.getCryptoPublicKeyBytes() - 32];
        for (int i15 = 0; i15 < mLDSAEngine.getDilithiumK(); i15++) {
            System.arraycopy(polyVecK.getVectorIndex(i15).polyt1Pack(), 0, bArr, i15 * 320, 320);
        }
        return bArr;
    }

    static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, MLDSAEngine mLDSAEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[mLDSAEngine.getDilithiumL() * mLDSAEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i15 = 0; i15 < mLDSAEngine.getDilithiumL(); i15++) {
            polyVecL.getVectorIndex(i15).polyEtaPack(bArr4[3], mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i15);
        }
        bArr4[4] = new byte[mLDSAEngine.getDilithiumK() * mLDSAEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i16 = 0; i16 < mLDSAEngine.getDilithiumK(); i16++) {
            polyVecK2.getVectorIndex(i16).polyEtaPack(bArr4[4], mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i16);
        }
        bArr4[5] = new byte[mLDSAEngine.getDilithiumK() * 416];
        for (int i17 = 0; i17 < mLDSAEngine.getDilithiumK(); i17++) {
            polyVecK.getVectorIndex(i17).polyt0Pack(bArr4[5], i17 * 416);
        }
        return bArr4;
    }

    static void packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, MLDSAEngine mLDSAEngine) {
        int dilithiumCTilde = mLDSAEngine.getDilithiumCTilde();
        for (int i15 = 0; i15 < mLDSAEngine.getDilithiumL(); i15++) {
            polyVecL.getVectorIndex(i15).zPack(bArr, dilithiumCTilde);
            dilithiumCTilde += mLDSAEngine.getDilithiumPolyZPackedBytes();
        }
        for (int i16 = 0; i16 < mLDSAEngine.getDilithiumOmega() + mLDSAEngine.getDilithiumK(); i16++) {
            bArr[dilithiumCTilde + i16] = 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < mLDSAEngine.getDilithiumK(); i18++) {
            for (int i19 = 0; i19 < 256; i19++) {
                if (polyVecK.getVectorIndex(i18).getCoeffIndex(i19) != 0) {
                    bArr[i17 + dilithiumCTilde] = (byte) i19;
                    i17++;
                }
            }
            bArr[mLDSAEngine.getDilithiumOmega() + dilithiumCTilde + i18] = (byte) i17;
        }
    }

    static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, MLDSAEngine mLDSAEngine) {
        int i15 = 0;
        while (i15 < mLDSAEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i15);
            int i16 = i15 * 320;
            i15++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i16, i15 * 320));
        }
        return polyVecK;
    }

    static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, MLDSAEngine mLDSAEngine) {
        for (int i15 = 0; i15 < mLDSAEngine.getDilithiumL(); i15++) {
            polyVecL.getVectorIndex(i15).polyEtaUnpack(bArr2, mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i15);
        }
        for (int i16 = 0; i16 < mLDSAEngine.getDilithiumK(); i16++) {
            polyVecK2.getVectorIndex(i16).polyEtaUnpack(bArr3, mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i16);
        }
        for (int i17 = 0; i17 < mLDSAEngine.getDilithiumK(); i17++) {
            polyVecK.getVectorIndex(i17).polyt0Unpack(bArr, i17 * 416);
        }
    }

    static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, MLDSAEngine mLDSAEngine) {
        int dilithiumCTilde = mLDSAEngine.getDilithiumCTilde();
        int i15 = 0;
        while (i15 < mLDSAEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i15);
            int dilithiumPolyZPackedBytes = (mLDSAEngine.getDilithiumPolyZPackedBytes() * i15) + dilithiumCTilde;
            i15++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (mLDSAEngine.getDilithiumPolyZPackedBytes() * i15) + dilithiumCTilde));
        }
        int dilithiumL = dilithiumCTilde + (mLDSAEngine.getDilithiumL() * mLDSAEngine.getDilithiumPolyZPackedBytes());
        int i16 = 0;
        for (int i17 = 0; i17 < mLDSAEngine.getDilithiumK(); i17++) {
            for (int i18 = 0; i18 < 256; i18++) {
                polyVecK.getVectorIndex(i17).setCoeffIndex(i18, 0);
            }
            if ((bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i17] & GF2Field.MASK) < i16 || (bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i17] & GF2Field.MASK) > mLDSAEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i19 = i16; i19 < (bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i17] & GF2Field.MASK); i19++) {
                if (i19 > i16) {
                    int i25 = dilithiumL + i19;
                    if ((bArr[i25] & 255) <= (bArr[i25 - 1] & 255)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i17).setCoeffIndex(bArr[dilithiumL + i19] & 255, 1);
            }
            i16 = bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i17];
        }
        while (i16 < mLDSAEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i16] & 255) != 0) {
                return false;
            }
            i16++;
        }
        return true;
    }
}
