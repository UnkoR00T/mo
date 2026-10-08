package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes5.dex */
abstract class BENES {
    private static final long[] TRANSPOSE_MASKS = {6148914691236517205L, 3689348814741910323L, 1085102592571150095L, 71777214294589695L, 281470681808895L, BodyPartID.bodyIdMax};
    protected final int GFBITS;
    protected final int SYS_N;
    protected final int SYS_T;

    public BENES(int i15, int i16, int i17) {
        this.SYS_N = i15;
        this.SYS_T = i16;
        this.GFBITS = i17;
    }

    static void transpose_64x64(long[] jArr, long[] jArr2) {
        transpose_64x64(jArr, jArr2, 0);
    }

    protected abstract void support_gen(short[] sArr, byte[] bArr);

    static void transpose_64x64(long[] jArr, long[] jArr2, int i15) {
        int i16;
        System.arraycopy(jArr2, i15, jArr, i15, 64);
        int i17 = 5;
        do {
            long j15 = TRANSPOSE_MASKS[i17];
            int i18 = 1 << i17;
            int i19 = i15;
            while (true) {
                i16 = i15 + 64;
                if (i19 >= i16) {
                    break;
                }
                for (int i25 = i19; i25 < i19 + i18; i25 += 4) {
                    long j16 = jArr[i25];
                    int i26 = i25 + 1;
                    long j17 = jArr[i26];
                    int i27 = i25 + 2;
                    long j18 = jArr[i27];
                    int i28 = i25 + 3;
                    long j19 = jArr[i28];
                    int i29 = i25 + i18;
                    long j25 = jArr[i29];
                    int i35 = i29 + 1;
                    long j26 = jArr[i35];
                    int i36 = i29 + 2;
                    long j27 = jArr[i36];
                    int i37 = i29 + 3;
                    long j28 = jArr[i37];
                    long j29 = ((j16 >>> i18) ^ j25) & j15;
                    long j35 = ((j17 >>> i18) ^ j26) & j15;
                    long j36 = ((j18 >>> i18) ^ j27) & j15;
                    long j37 = ((j19 >>> i18) ^ j28) & j15;
                    jArr[i25] = j16 ^ (j29 << i18);
                    jArr[i26] = (j35 << i18) ^ j17;
                    jArr[i27] = (j36 << i18) ^ j18;
                    jArr[i28] = j19 ^ (j37 << i18);
                    jArr[i29] = j25 ^ j29;
                    jArr[i35] = j26 ^ j35;
                    jArr[i36] = j27 ^ j36;
                    jArr[i37] = j28 ^ j37;
                }
                i19 += i18 * 2;
            }
            i17--;
        } while (i17 >= 2);
        do {
            long j38 = TRANSPOSE_MASKS[i17];
            int i38 = 1 << i17;
            for (int i39 = i15; i39 < i16; i39 += i38 * 2) {
                for (int i45 = i39; i45 < i39 + i38; i45++) {
                    long j39 = jArr[i45];
                    int i46 = i45 + i38;
                    long j45 = jArr[i46];
                    long j46 = ((j39 >>> i38) ^ j45) & j38;
                    jArr[i45] = j39 ^ (j46 << i38);
                    jArr[i46] = j45 ^ j46;
                }
            }
            i17--;
        } while (i17 >= 0);
    }
}
