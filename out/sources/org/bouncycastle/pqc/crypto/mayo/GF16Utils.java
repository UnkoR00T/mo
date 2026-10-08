package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes5.dex */
class GF16Utils {
    static final long MASK_LSB = 1229782938247303441L;
    static final long MASK_MSB = -8608480567731124088L;
    static final long NIBBLE_MASK_LSB = -1229782938247303442L;
    static final long NIBBLE_MASK_MSB = 8608480567731124087L;

    GF16Utils() {
    }

    static void mVecMulAdd(int i15, long[] jArr, int i16, int i17, long[] jArr2, int i18) {
        long j15 = i17;
        long j16 = BodyPartID.bodyIdMax & j15;
        long j17 = j15 & 1;
        char c15 = 1;
        long j18 = (j16 >>> 1) & 1;
        long j19 = (j16 >>> 2) & 1;
        char c16 = 3;
        long j25 = (j16 >>> 3) & 1;
        int i19 = i18;
        int i25 = 0;
        int i26 = i16;
        while (i25 < i15) {
            long j26 = jArr[i26];
            char c17 = c16;
            long j27 = (-j17) & j26;
            long j28 = (j26 & MASK_MSB) >>> c17;
            long j29 = ((j26 & NIBBLE_MASK_MSB) << c15) ^ (j28 + (j28 << c15));
            long j35 = j17;
            long j36 = ((-j18) & j29) ^ j27;
            long j37 = (j29 & MASK_MSB) >>> c17;
            long j38 = (j37 + (j37 << c15)) ^ ((j29 & NIBBLE_MASK_MSB) << c15);
            char c18 = c15;
            long j39 = (j38 & MASK_MSB) >>> c17;
            jArr2[i19] = ((j36 ^ ((-j19) & j38)) ^ ((-j25) & ((j39 + (j39 << c18)) ^ ((j38 & NIBBLE_MASK_MSB) << c18)))) ^ jArr2[i19];
            i25++;
            c16 = c17;
            i19++;
            i26++;
            c15 = c18;
            j17 = j35;
            j18 = j18;
        }
    }

    static void matMul(byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, int i16, int i17) {
        int i18 = 0;
        int i19 = 0;
        int i25 = 0;
        while (i18 < i17) {
            int i26 = 0;
            byte bMul = 0;
            while (i26 < i16) {
                bMul = (byte) (GF16.mul(bArr[i19], bArr2[i15 + i26]) ^ bMul);
                i26++;
                i19++;
            }
            bArr3[i25] = bMul;
            i18++;
            i25++;
        }
    }

    static void mulAddMUpperTriangularMatXMat(int i15, long[] jArr, byte[] bArr, long[] jArr2, int i16, int i17, int i18) {
        int i19 = i18 * i15;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i25 < i17) {
            int i29 = i26;
            int i35 = i28;
            int i36 = i25;
            while (i36 < i17) {
                int i37 = 0;
                int i38 = 0;
                while (i37 < i18) {
                    mVecMulAdd(i15, jArr, i35, bArr[i29 + i37], jArr2, i16 + i27 + i38);
                    i37++;
                    i38 += i15;
                }
                i35 += i15;
                i36++;
                i29 += i18;
            }
            i25++;
            i26 += i18;
            i27 += i19;
            i28 = i35;
        }
    }

    static void mulAddMUpperTriangularMatXMatTrans(int i15, long[] jArr, byte[] bArr, long[] jArr2, int i16, int i17) {
        int i18 = i15 * i17;
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i19 < i16) {
            int i27 = i26;
            for (int i28 = i19; i28 < i16; i28++) {
                int i29 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i29 < i17) {
                    mVecMulAdd(i15, jArr, i27, bArr[i35 + i28], jArr2, i25 + i36);
                    i29++;
                    i35 += i16;
                    i36 += i15;
                }
                i27 += i15;
            }
            i19++;
            i25 += i18;
            i26 = i27;
        }
    }

    static void mulAddMatTransXMMat(int i15, byte[] bArr, long[] jArr, int i16, long[] jArr2, int i17, int i18) {
        int i19 = i18 * i15;
        int i25 = 0;
        int i26 = 0;
        while (i25 < i18) {
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i27 < i17) {
                byte b15 = bArr[i28 + i25];
                int i35 = 0;
                int i36 = 0;
                while (i35 < i18) {
                    mVecMulAdd(i15, jArr, i16 + i29 + i36, b15, jArr2, i26 + i36);
                    i35++;
                    i36 += i15;
                }
                i27++;
                i28 += i18;
                i29 += i19;
            }
            i25++;
            i26 += i19;
        }
    }

    static void mulAddMatXMMat(int i15, byte[] bArr, long[] jArr, int i16, long[] jArr2, int i17, int i18, int i19) {
        int i25 = i15 * i19;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < i17) {
            int i29 = 0;
            int i35 = 0;
            while (i29 < i18) {
                byte b15 = bArr[i28 + i29];
                int i36 = 0;
                int i37 = 0;
                while (i36 < i19) {
                    mVecMulAdd(i15, jArr, i35 + i37 + i16, b15, jArr2, i27 + i37);
                    i36++;
                    i37 += i15;
                }
                i29++;
                i35 += i25;
            }
            i26++;
            i27 += i25;
            i28 += i18;
        }
    }

    static long mulFx8(byte b15, long j15) {
        int i15 = b15 & 255;
        long j16 = ((j15 << 3) & ((long) (-((i15 >> 3) & 1)))) ^ (((((long) (-(b15 & 1))) & j15) ^ (((long) (-((i15 >> 1) & 1))) & (j15 << 1))) ^ (((long) (-((i15 >> 2) & 1))) & (j15 << 2)));
        long j17 = (-1085102592571150096L) & j16;
        return ((j16 ^ (j17 >>> 4)) ^ (j17 >>> 3)) & 1085102592571150095L;
    }

    static void mulAddMatXMMat(int i15, byte[] bArr, long[] jArr, long[] jArr2, int i16, int i17) {
        int i18 = i15 * i16;
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i19 < i16) {
            int i27 = 0;
            int i28 = 0;
            while (i27 < i17) {
                byte b15 = bArr[i25 + i27];
                int i29 = 0;
                int i35 = 0;
                while (i29 < i16) {
                    mVecMulAdd(i15, jArr, i28 + i35, b15, jArr2, i26 + i35);
                    i29++;
                    i35 += i15;
                }
                i27++;
                i28 += i18;
            }
            i19++;
            i25 += i17;
            i26 += i18;
        }
    }
}
