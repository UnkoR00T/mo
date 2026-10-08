package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class GF2PolynomialCalculator {
    private final int PARAM_N;
    private final long RED_MASK;
    private final int VEC_N_SIZE_64;

    GF2PolynomialCalculator(int i15, int i16, long j15) {
        this.VEC_N_SIZE_64 = i15;
        this.PARAM_N = i16;
        this.RED_MASK = j15;
    }

    private void karatsuba(long[] jArr, int i15, long[] jArr2, int i16, long[] jArr3, int i17, int i18, long[] jArr4, int i19) {
        if (i18 <= 16) {
            schoolbookMul(jArr, i15, jArr2, i16, jArr3, i17, i18);
            return;
        }
        int i25 = i18 >> 1;
        int i26 = i18 - i25;
        int i27 = i18 << 1;
        int i28 = i25 << 1;
        int i29 = i26 << 1;
        int i35 = i19 + i27;
        int i36 = i35 + i27;
        int i37 = i36 + i27;
        int i38 = i37 + i18;
        int i39 = i19 + (i18 << 3);
        karatsuba(jArr4, i19, jArr2, i16, jArr3, i17, i25, jArr4, i39);
        int i45 = i16 + i25;
        int i46 = i17 + i25;
        karatsuba(jArr4, i35, jArr2, i45, jArr3, i46, i26, jArr4, i39);
        int i47 = 0;
        while (true) {
            long j15 = 0;
            if (i47 >= i26) {
                break;
            }
            long j16 = i47 < i25 ? jArr2[i16 + i47] : 0L;
            if (i47 < i25) {
                j15 = jArr3[i17 + i47];
            }
            jArr4[i37 + i47] = j16 ^ jArr2[i45 + i47];
            jArr4[i38 + i47] = j15 ^ jArr3[i46 + i47];
            i47++;
        }
        karatsuba(jArr4, i36, jArr4, i37, jArr4, i38, i26, jArr4, i39);
        System.arraycopy(jArr4, i19, jArr, i15, i28);
        System.arraycopy(jArr4, i35, jArr, i15 + i28, i29);
        int i48 = 0;
        while (i48 < i26 * 2) {
            int i49 = i15 + i25 + i48;
            jArr[i49] = jArr[i49] ^ ((jArr4[i36 + i48] ^ (i48 < i28 ? jArr4[i19 + i48] : 0L)) ^ (i48 < i29 ? jArr4[i35 + i48] : 0L));
            i48++;
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i15 = 0;
        while (true) {
            int i16 = this.VEC_N_SIZE_64;
            if (i15 >= i16) {
                int i17 = i16 - 1;
                jArr[i17] = jArr[i17] & this.RED_MASK;
                return;
            } else {
                long j15 = jArr2[i15];
                long j16 = jArr2[(i15 + i16) - 1];
                int i18 = this.PARAM_N;
                jArr[i15] = (j15 ^ (j16 >>> (i18 & 63))) ^ (jArr2[i16 + i15] << ((int) (64 - (((long) i18) & 63))));
                i15++;
            }
        }
    }

    private void schoolbookMul(long[] jArr, int i15, long[] jArr2, int i16, long[] jArr3, int i17, int i18) {
        int i19 = i15;
        Arrays.fill(jArr, i19, (i18 << 1) + i19, 0L);
        int i25 = 0;
        while (i25 < i18) {
            long j15 = jArr2[i25 + i16];
            for (int i26 = 0; i26 < 64; i26++) {
                long j16 = -((j15 >> i26) & 1);
                if (i26 == 0) {
                    int i27 = i17;
                    int i28 = i19;
                    int i29 = 0;
                    while (i29 < i18) {
                        jArr[i28] = jArr[i28] ^ (jArr3[i27] & j16);
                        i29++;
                        i28++;
                        i27++;
                    }
                } else {
                    int i35 = 64 - i26;
                    int i36 = i17;
                    int i37 = i19;
                    int i38 = 0;
                    while (i38 < i18) {
                        int i39 = i37 + 1;
                        jArr[i37] = jArr[i37] ^ ((jArr3[i36] << i26) & j16);
                        jArr[i39] = jArr[i39] ^ ((jArr3[i36] >>> i35) & j16);
                        i38++;
                        i36++;
                        i37 = i39;
                    }
                }
            }
            i25++;
            i19++;
        }
    }

    public void vectMul(long[] jArr, long[] jArr2, long[] jArr3) {
        int i15 = this.VEC_N_SIZE_64;
        long[] jArr4 = new long[i15 << 1];
        karatsuba(jArr4, 0, jArr2, 0, jArr3, 0, i15, new long[i15 << 4], 0);
        reduce(jArr, jArr4);
    }
}
