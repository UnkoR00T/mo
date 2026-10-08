package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes5.dex */
class BIKEEngine {
    private int L_BYTE;
    private int R2_BYTE;
    private int R_BYTE;
    private final BIKERing bikeRing;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    private int f149423hw;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f149424r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f149425t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f149426w;

    public BIKEEngine(int i15, int i16, int i17, int i18, int i19, int i25) {
        this.f149424r = i15;
        this.f149426w = i16;
        this.f149425t = i17;
        this.nbIter = i19;
        this.tau = i25;
        this.f149423hw = i16 / 2;
        this.L_BYTE = i18 / 8;
        this.R_BYTE = (i15 + 7) >>> 3;
        this.R2_BYTE = ((i15 * 2) + 7) >>> 3;
        this.bikeRing = new BIKERing(i15);
    }

    private void BFIter(byte[] bArr, byte[] bArr2, int i15, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ctrAll(iArr3, bArr, bArr5);
        int i16 = bArr5[0] & 255;
        int i17 = ((i16 - i15) >> 31) + 1;
        int i18 = ((i16 - (i15 - this.tau)) >> 31) + 1;
        byte b15 = (byte) i17;
        bArr2[0] = (byte) (bArr2[0] ^ b15);
        bArr3[0] = b15;
        bArr4[0] = (byte) i18;
        int i19 = 1;
        while (true) {
            int i25 = this.f149424r;
            if (i19 >= i25) {
                break;
            }
            int i26 = bArr5[i19] & 255;
            int i27 = ((i26 - i15) >> 31) + 1;
            int i28 = ((i26 - (i15 - this.tau)) >> 31) + 1;
            int i29 = i25 - i19;
            byte b16 = (byte) i27;
            bArr2[i29] = (byte) (bArr2[i29] ^ b16);
            bArr3[i19] = b16;
            bArr4[i19] = (byte) i28;
            i19++;
        }
        ctrAll(iArr4, bArr, bArr5);
        int i35 = bArr5[0] & 255;
        int i36 = ((i35 - i15) >> 31) + 1;
        int i37 = ((i35 - (i15 - this.tau)) >> 31) + 1;
        int i38 = this.f149424r;
        byte b17 = (byte) i36;
        bArr2[i38] = (byte) (bArr2[i38] ^ b17);
        bArr3[i38] = b17;
        bArr4[i38] = (byte) i37;
        int i39 = 1;
        while (true) {
            int i45 = this.f149424r;
            if (i39 >= i45) {
                break;
            }
            int i46 = bArr5[i39] & 255;
            int i47 = ((i46 - i15) >> 31) + 1;
            int i48 = ((i46 - (i15 - this.tau)) >> 31) + 1;
            int i49 = (i45 + i45) - i39;
            byte b18 = (byte) i47;
            bArr2[i49] = (byte) (bArr2[i49] ^ b18);
            bArr3[i45 + i39] = b18;
            bArr4[i45 + i39] = (byte) i48;
            i39++;
        }
        for (int i55 = 0; i55 < this.f149424r * 2; i55++) {
            recomputeSyndrome(bArr, i55, iArr, iArr2, bArr3[i55] != 0);
        }
    }

    private void BFIter2(byte[] bArr, byte[] bArr2, int i15, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3) {
        int[] iArr5 = new int[this.f149424r * 2];
        ctrAll(iArr3, bArr, bArr3);
        int i16 = (((bArr3[0] & 255) - i15) >> 31) + 1;
        bArr2[0] = (byte) (bArr2[0] ^ ((byte) i16));
        iArr5[0] = i16;
        int i17 = 1;
        while (true) {
            int i18 = this.f149424r;
            if (i17 >= i18) {
                break;
            }
            int i19 = (((bArr3[i17] & 255) - i15) >> 31) + 1;
            int i25 = i18 - i17;
            bArr2[i25] = (byte) (bArr2[i25] ^ ((byte) i19));
            iArr5[i17] = i19;
            i17++;
        }
        ctrAll(iArr4, bArr, bArr3);
        int i26 = (((bArr3[0] & 255) - i15) >> 31) + 1;
        int i27 = this.f149424r;
        bArr2[i27] = (byte) (bArr2[i27] ^ ((byte) i26));
        iArr5[i27] = i26;
        int i28 = 1;
        while (true) {
            int i29 = this.f149424r;
            if (i28 >= i29) {
                break;
            }
            int i35 = (((bArr3[i28] & 255) - i15) >> 31) + 1;
            int i36 = (i29 + i29) - i28;
            bArr2[i36] = (byte) (bArr2[i36] ^ ((byte) i35));
            iArr5[i29 + i28] = i35;
            i28++;
        }
        for (int i37 = 0; i37 < this.f149424r * 2; i37++) {
            recomputeSyndrome(bArr, i37, iArr, iArr2, iArr5[i37] == 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private void BFMaskedIter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[this.f149424r * 2];
        int i16 = 0;
        while (true) {
            if (i16 >= this.f149424r) {
                break;
            }
            if (bArr3[i16] == 1) {
                ?? r15 = ctr(iArr3, bArr, i16) < i15 ? 0 : 1;
                updateNewErrorIndex(bArr2, i16, r15);
                iArr5[i16] = r15;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            int i18 = this.f149424r;
            if (i17 >= i18) {
                break;
            }
            if (bArr3[i18 + i17] == 1) {
                ?? r16 = ctr(iArr4, bArr, i17) >= i15 ? 1 : 0;
                updateNewErrorIndex(bArr2, this.f149424r + i17, r16);
                iArr5[this.f149424r + i17] = r16;
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < this.f149424r * 2) {
            int[] iArr6 = iArr;
            int[] iArr7 = iArr2;
            byte[] bArr4 = bArr;
            recomputeSyndrome(bArr4, i19, iArr6, iArr7, iArr5[i19] == 1);
            i19++;
            bArr = bArr4;
            iArr2 = iArr7;
            iArr = iArr6;
        }
    }

    private byte[] BGFDecoder(byte[] bArr, int[] iArr, int[] iArr2) {
        byte[] bArr2 = new byte[this.f149424r * 2];
        int[] columnFromCompactVersion = getColumnFromCompactVersion(iArr);
        int[] columnFromCompactVersion2 = getColumnFromCompactVersion(iArr2);
        int i15 = this.f149424r;
        byte[] bArr3 = new byte[i15 * 2];
        byte[] bArr4 = new byte[i15];
        byte[] bArr5 = new byte[i15 * 2];
        BIKEEngine bIKEEngine = this;
        bIKEEngine.BFIter(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), this.f149424r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr3, bArr5, bArr4);
        int i16 = 1;
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr3, ((bIKEEngine.f149423hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr5, ((bIKEEngine.f149423hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        while (i16 < bIKEEngine.nbIter) {
            Arrays.fill(bArr3, (byte) 0);
            bIKEEngine.BFIter2(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), bIKEEngine.f149424r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr4);
            i16++;
            bIKEEngine = this;
        }
        if (BIKEUtils.getHammingWeight(bArr) == 0) {
            return bArr2;
        }
        return null;
    }

    private byte[] computeSyndrome(byte[] bArr, byte[] bArr2) {
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        this.bikeRing.multiply(jArrCreate, jArrCreate2, jArrCreate);
        return this.bikeRing.encodeBitsTransposed(jArrCreate);
    }

    private void convertToCompact(int[] iArr, byte[] bArr) {
        int i15;
        int i16 = 0;
        for (int i17 = 0; i17 < this.R_BYTE; i17++) {
            for (int i18 = 0; i18 < 8 && (i15 = (i17 * 8) + i18) != this.f149424r; i18++) {
                int i19 = (bArr[i17] >> i18) & 1;
                int i25 = -i19;
                iArr[i16] = (i15 & i25) | ((~i25) & iArr[i16]);
                i16 = (i16 + i19) % this.f149423hw;
            }
        }
    }

    private int ctr(int[] iArr, byte[] bArr, int i15) {
        int i16 = this.f149423hw - 4;
        int i17 = 0;
        int i18 = 0;
        while (i17 <= i16) {
            int i19 = iArr[i17] + i15;
            int i25 = this.f149424r;
            int i26 = i19 - i25;
            int i27 = (iArr[i17 + 1] + i15) - i25;
            int i28 = (iArr[i17 + 2] + i15) - i25;
            int i29 = (iArr[i17 + 3] + i15) - i25;
            i18 = i18 + (bArr[i26 + ((i26 >> 31) & i25)] & 255) + (bArr[i27 + ((i27 >> 31) & i25)] & 255) + (bArr[i28 + ((i28 >> 31) & i25)] & 255) + (bArr[i29 + (i25 & (i29 >> 31))] & 255);
            i17 += 4;
        }
        while (i17 < this.f149423hw) {
            int i35 = iArr[i17] + i15;
            int i36 = this.f149424r;
            int i37 = i35 - i36;
            i18 += bArr[i37 + (i36 & (i37 >> 31))] & 255;
            i17++;
        }
        return i18;
    }

    private void ctrAll(int[] iArr, byte[] bArr, byte[] bArr2) {
        int i15 = iArr[0];
        int i16 = this.f149424r - i15;
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        System.arraycopy(bArr, 0, bArr2, i16, i15);
        for (int i17 = 1; i17 < this.f149423hw; i17++) {
            int i18 = iArr[i17];
            int i19 = this.f149424r - i18;
            int i25 = i19 - 4;
            int i26 = 0;
            while (i26 <= i25) {
                int i27 = i18 + i26;
                bArr2[i26] = (byte) (bArr2[i26] + (bArr[i27] & 255));
                int i28 = i26 + 1;
                bArr2[i28] = (byte) (bArr2[i28] + (bArr[i27 + 1] & 255));
                int i29 = i26 + 2;
                bArr2[i29] = (byte) (bArr2[i29] + (bArr[i27 + 2] & 255));
                int i35 = i26 + 3;
                bArr2[i35] = (byte) (bArr2[i35] + (bArr[i27 + 3] & 255));
                i26 += 4;
            }
            while (i26 < i19) {
                bArr2[i26] = (byte) (bArr2[i26] + (bArr[i18 + i26] & 255));
                i26++;
            }
            int i36 = this.f149424r - 4;
            int i37 = i19;
            while (i37 <= i36) {
                bArr2[i37] = (byte) (bArr2[i37] + (bArr[i37 - i19] & 255));
                int i38 = i37 + 1;
                bArr2[i38] = (byte) (bArr2[i38] + (bArr[i38 - i19] & 255));
                int i39 = i37 + 2;
                bArr2[i39] = (byte) (bArr2[i39] + (bArr[i39 - i19] & 255));
                int i45 = i37 + 3;
                bArr2[i45] = (byte) (bArr2[i45] + (bArr[i45 - i19] & 255));
                i37 += 4;
            }
            while (i37 < this.f149424r) {
                bArr2[i37] = (byte) (bArr2[i37] + (bArr[i37 - i19] & 255));
                i37++;
            }
        }
    }

    private byte[] functionH(byte[] bArr) {
        byte[] bArr2 = new byte[this.R_BYTE * 2];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        BIKEUtils.generateRandomByteArray(bArr2, this.f149424r * 2, this.f149425t, sHAKEDigest);
        return bArr2;
    }

    private void functionK(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(MLKEMEngine.KyberPolyBytes);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, 0, bArr3.length);
        sHA3Digest.doFinal(bArr5, 0);
        System.arraycopy(bArr5, 0, bArr4, 0, this.L_BYTE);
    }

    private void functionL(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(MLKEMEngine.KyberPolyBytes);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr3, 0, this.L_BYTE);
    }

    private int[] getColumnFromCompactVersion(int[] iArr) {
        int[] iArr2 = new int[this.f149423hw];
        int i15 = 0;
        if (iArr[0] != 0) {
            while (true) {
                int i16 = this.f149423hw;
                if (i15 >= i16) {
                    break;
                }
                iArr2[i15] = this.f149424r - iArr[(i16 - 1) - i15];
                i15++;
            }
        } else {
            iArr2[0] = 0;
            int i17 = 1;
            while (true) {
                int i18 = this.f149423hw;
                if (i17 >= i18) {
                    break;
                }
                iArr2[i17] = this.f149424r - iArr[i18 - i17];
                i17++;
            }
        }
        return iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void recomputeSyndrome(byte[] bArr, int i15, int[] iArr, int[] iArr2, boolean z15) {
        int i16 = 0;
        if (i15 < this.f149424r) {
            while (i16 < this.f149423hw) {
                int i17 = iArr[i16];
                if (i17 <= i15) {
                    int i18 = i15 - i17;
                    bArr[i18] = bArr[i18] ^ (z15 ? 1 : 0) ? (byte) 1 : (byte) 0;
                } else {
                    int i19 = (this.f149424r + i15) - i17;
                    bArr[i19] = bArr[i19] ^ (z15 ? 1 : 0) ? (byte) 1 : (byte) 0;
                }
                i16++;
            }
            return;
        }
        while (i16 < this.f149423hw) {
            int i25 = iArr2[i16];
            int i26 = this.f149424r;
            if (i25 <= i15 - i26) {
                int i27 = (i15 - i26) - i25;
                bArr[i27] = bArr[i27] ^ (z15 ? 1 : 0) ? (byte) 1 : (byte) 0;
            } else {
                int i28 = (i26 - i25) + (i15 - i26);
                bArr[i28] = bArr[i28] ^ (z15 ? 1 : 0) ? (byte) 1 : (byte) 0;
            }
            i16++;
        }
    }

    private void splitEBytes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15 = this.f149424r & 7;
        int i16 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, this.R_BYTE - 1);
        int i17 = this.R_BYTE;
        byte b15 = bArr[i17 - 1];
        byte b16 = (byte) ((-1) << i15);
        bArr2[i17 - 1] = (byte) ((~b16) & b15);
        byte b17 = (byte) (b15 & b16);
        while (true) {
            int i18 = this.R_BYTE;
            if (i16 >= i18) {
                return;
            }
            byte b18 = bArr[i18 + i16];
            bArr3[i16] = (byte) (((b17 & 255) >>> i15) | (b18 << (8 - i15)));
            i16++;
            b17 = b18;
        }
    }

    private int threshold(int i15, int i16) {
        if (i16 == 12323) {
            return thresholdFromParameters(i15, 0.0069722d, 13.53d, 36);
        }
        if (i16 == 24659) {
            return thresholdFromParameters(i15, 0.005265d, 15.2588d, 52);
        }
        if (i16 == 40973) {
            return thresholdFromParameters(i15, 0.00402312d, 17.8785d, 69);
        }
        throw new IllegalArgumentException();
    }

    private static int thresholdFromParameters(int i15, double d15, double d16, int i16) {
        return Math.max(i16, (int) Math.floor((d15 * ((double) i15)) + d16));
    }

    private void updateNewErrorIndex(byte[] bArr, int i15, boolean z15) {
        int i16;
        if (i15 != 0 && i15 != (i16 = this.f149424r)) {
            i15 = i15 > i16 ? ((i16 * 2) - i15) + i16 : i16 - i15;
        }
        bArr[i15] = (byte) ((z15 ? 1 : 0) ^ bArr[i15]);
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i15 = this.f149423hw;
        int[] iArr = new int[i15];
        int[] iArr2 = new int[i15];
        convertToCompact(iArr, bArr2);
        convertToCompact(iArr2, bArr3);
        byte[] bArrBGFDecoder = BGFDecoder(computeSyndrome(bArr5, bArr2), iArr, iArr2);
        byte[] bArr7 = new byte[this.R_BYTE * 2];
        BIKEUtils.fromBitArrayToByteArray(bArr7, bArrBGFDecoder, 0, this.f149424r * 2);
        int i16 = this.R_BYTE;
        byte[] bArr8 = new byte[i16];
        byte[] bArr9 = new byte[i16];
        splitEBytes(bArr7, bArr8, bArr9);
        byte[] bArr10 = new byte[this.L_BYTE];
        functionL(bArr8, bArr9, bArr10);
        Bytes.xorTo(this.L_BYTE, bArr6, bArr10);
        byte[] bArrFunctionH = functionH(bArr10);
        int i17 = this.R2_BYTE;
        if (Arrays.areEqual(bArr7, 0, i17, bArrFunctionH, 0, i17)) {
            functionK(bArr10, bArr5, bArr6, bArr);
        } else {
            functionK(bArr4, bArr5, bArr6, bArr);
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[this.L_BYTE];
        secureRandom.nextBytes(bArr5);
        byte[] bArrFunctionH = functionH(bArr5);
        int i15 = this.R_BYTE;
        byte[] bArr6 = new byte[i15];
        byte[] bArr7 = new byte[i15];
        splitEBytes(bArrFunctionH, bArr6, bArr7);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr6, jArrCreate);
        this.bikeRing.decodeBytes(bArr7, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr4, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.add(jArrCreate3, jArrCreate, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr);
        functionL(bArr6, bArr7, bArr2);
        Bytes.xorTo(this.L_BYTE, bArr5, bArr2);
        functionK(bArr5, bArr, bArr2, bArr3);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[64];
        secureRandom.nextBytes(bArr5);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, this.L_BYTE);
        BIKEUtils.generateRandomByteArray(bArr, this.f149424r, this.f149423hw, sHAKEDigest);
        BIKEUtils.generateRandomByteArray(bArr2, this.f149424r, this.f149423hw, sHAKEDigest);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.inv(jArrCreate, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr4);
        System.arraycopy(bArr5, this.L_BYTE, bArr3, 0, bArr3.length);
    }

    public int getSessionKeySize() {
        return this.L_BYTE;
    }
}
