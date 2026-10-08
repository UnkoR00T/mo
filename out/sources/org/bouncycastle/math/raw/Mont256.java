package org.bouncycastle.math.raw;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i15) {
        int i16 = (2 - (i15 * i15)) * i15;
        int i17 = i16 * (2 - (i15 * i16));
        int i18 = i17 * (2 - (i15 * i17));
        return i18 * (2 - (i15 * i18));
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i15) {
        char c15 = 0;
        long j15 = 4294967295L;
        long j16 = ((long) iArr2[0]) & 4294967295L;
        int i16 = 0;
        int i17 = 0;
        while (i16 < 8) {
            long j17 = ((long) iArr3[c15]) & j15;
            long j18 = ((long) iArr[i16]) & j15;
            long j19 = j18 * j16;
            long j25 = (j19 & j15) + j17;
            char c16 = c15;
            long j26 = j15;
            long j27 = ((long) (((int) j25) * i15)) & j26;
            long j28 = (((long) iArr4[c16]) & j26) * j27;
            char c17 = ' ';
            long j29 = ((j25 + (j28 & j26)) >>> 32) + (j19 >>> 32) + (j28 >>> 32);
            int i18 = 1;
            while (i18 < 8) {
                long j35 = (((long) iArr2[i18]) & j26) * j18;
                char c18 = c17;
                long j36 = (((long) iArr4[i18]) & j26) * j27;
                long j37 = j29 + (j35 & j26) + (j36 & j26) + (((long) iArr3[i18]) & j26);
                iArr3[i18 - 1] = (int) j37;
                j29 = (j37 >>> c18) + (j35 >>> c18) + (j36 >>> c18);
                i18++;
                c17 = c18;
                j16 = j16;
                j27 = j27;
            }
            char c19 = c17;
            long j38 = j29 + (((long) i17) & j26);
            iArr3[7] = (int) j38;
            i17 = (int) (j38 >>> c19);
            i16++;
            c15 = c16;
            j15 = j26;
            j16 = j16;
        }
        if (i17 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c15 = 0;
        long j15 = 4294967295L;
        long j16 = ((long) iArr2[0]) & 4294967295L;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= 8) {
                break;
            }
            long j17 = ((long) iArr[i15]) & j15;
            long j18 = (j17 * j16) + (((long) iArr3[c15]) & j15);
            long j19 = j18 & j15;
            long j25 = (j18 >>> 32) + j19;
            int i17 = 1;
            for (int i18 = 8; i17 < i18; i18 = 8) {
                long j26 = j15;
                long j27 = (((long) iArr2[i17]) & j26) * j17;
                int i19 = i17;
                long j28 = (((long) iArr4[i17]) & j26) * j19;
                long j29 = j25 + (j27 & j26) + (j28 & j26) + (((long) iArr3[i19]) & j26);
                iArr3[i19 - 1] = (int) j29;
                j25 = (j29 >>> 32) + (j27 >>> 32) + (j28 >>> 32);
                i17 = i19 + 1;
                j15 = j26;
                j16 = j16;
            }
            long j35 = j25 + (((long) i16) & j15);
            iArr3[7] = (int) j35;
            i16 = (int) (j35 >>> 32);
            i15++;
            j16 = j16;
            c15 = 0;
        }
        if (i16 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i15) {
        char c15 = 0;
        int i16 = 0;
        while (i16 < 8) {
            int i17 = iArr[c15];
            long j15 = ((long) (i17 * i15)) & 4294967295L;
            long j16 = (((((long) iArr2[c15]) & 4294967295L) * j15) + (((long) i17) & 4294967295L)) >>> 32;
            int i18 = 1;
            while (i18 < 8) {
                long j17 = j16 + ((((long) iArr2[i18]) & 4294967295L) * j15) + (((long) iArr[i18]) & 4294967295L);
                iArr[i18 - 1] = (int) j17;
                j16 = j17 >>> 32;
                i18++;
                i16 = i16;
            }
            iArr[7] = (int) j16;
            i16++;
            c15 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i15 = 0; i15 < 8; i15++) {
            long j15 = ((long) iArr[0]) & 4294967295L;
            long j16 = j15;
            for (int i16 = 1; i16 < 8; i16++) {
                long j17 = j16 + ((((long) iArr2[i16]) & 4294967295L) * j15) + (((long) iArr[i16]) & 4294967295L);
                iArr[i16 - 1] = (int) j17;
                j16 = j17 >>> 32;
            }
            iArr[7] = (int) j16;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
