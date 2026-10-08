package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class BENES13 extends BENES {
    public BENES13(int i15, int i16, int i17) {
        super(i15, i16, i17);
    }

    static void layer_ex(long[] jArr, long[] jArr2, int i15) {
        int i16 = 1 << i15;
        int i17 = 0;
        for (int i18 = 0; i18 < 128; i18 += i16 * 2) {
            int i19 = i18;
            while (i19 < i18 + i16) {
                long j15 = jArr[i19];
                int i25 = i19 + i16;
                long j16 = (jArr[i25] ^ j15) & jArr2[i17];
                jArr[i19] = j15 ^ j16;
                jArr[i25] = jArr[i25] ^ j16;
                i19++;
                i17++;
            }
        }
    }

    static void layer_in(long[] jArr, long[] jArr2, int i15) {
        int i16 = 1 << i15;
        int i17 = 0;
        for (int i18 = 0; i18 < 64; i18 += i16 * 2) {
            for (int i19 = i18; i19 < i18 + i16; i19++) {
                long j15 = jArr[i19];
                int i25 = i19 + i16;
                int i26 = i17 + 1;
                long j16 = (jArr[i25] ^ j15) & jArr2[i17];
                jArr[i19] = j15 ^ j16;
                jArr[i25] = jArr[i25] ^ j16;
                int i27 = i19 + 64;
                long j17 = jArr[i27];
                int i28 = i27 + i16;
                i17 += 2;
                long j18 = jArr2[i26] & (jArr[i28] ^ j17);
                jArr[i27] = j17 ^ j18;
                jArr[i28] = jArr[i28] ^ j18;
            }
        }
    }

    void apply_benes(byte[] bArr, byte[] bArr2, int i15) {
        int i16;
        int i17;
        int i18;
        long[] jArr = new long[128];
        long[] jArr2 = new long[128];
        long[] jArr3 = new long[64];
        long[] jArr4 = new long[64];
        if (i15 == 0) {
            i16 = (this.SYS_T * 2) + 40;
            i17 = 0;
        } else {
            i16 = (this.SYS_T * 2) + 12328;
            i17 = -1024;
        }
        for (int i19 = 0; i19 < 64; i19++) {
            int i25 = i19 * 16;
            jArr[i19] = Utils.load8(bArr, i25);
            jArr[i19 + 64] = Utils.load8(bArr, i25 + 8);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        int i26 = 0;
        while (true) {
            if (i26 > 6) {
                break;
            }
            for (int i27 = 0; i27 < 64; i27++) {
                jArr3[i27] = Utils.load8(bArr2, i16);
                i16 += 8;
            }
            i16 += i17;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i26);
            i26++;
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i28 = 0; i28 <= 5; i28++) {
            for (int i29 = 0; i29 < 64; i29++) {
                jArr3[i29] = Utils.load8(bArr2, i16);
                i16 += 8;
            }
            i16 += i17;
            layer_in(jArr, jArr3, i28);
        }
        for (int i35 = 4; i35 >= 0; i35--) {
            for (int i36 = 0; i36 < 64; i36++) {
                jArr3[i36] = Utils.load8(bArr2, i16);
                i16 += 8;
            }
            i16 += i17;
            layer_in(jArr, jArr3, i35);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        for (i18 = 6; i18 >= 0; i18--) {
            for (int i37 = 0; i37 < 64; i37++) {
                jArr3[i37] = Utils.load8(bArr2, i16);
                i16 += 8;
            }
            i16 += i17;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i18);
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i38 = 0; i38 < 64; i38++) {
            int i39 = i38 * 16;
            Utils.store8(bArr, i39, jArr[i38]);
            Utils.store8(bArr, i39 + 8, jArr[i38 + 64]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.BENES
    public void support_gen(short[] sArr, byte[] bArr) {
        int i15 = this.GFBITS;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i15, (1 << i15) / 8);
        for (int i16 = 0; i16 < this.GFBITS; i16++) {
            for (int i17 = 0; i17 < (1 << this.GFBITS) / 8; i17++) {
                bArr2[i16][i17] = 0;
            }
        }
        int i18 = 0;
        while (true) {
            int i19 = this.GFBITS;
            if (i18 >= (1 << i19)) {
                break;
            }
            short sBitrev = Utils.bitrev((short) i18, i19);
            for (int i25 = 0; i25 < this.GFBITS; i25++) {
                byte[] bArr3 = bArr2[i25];
                int i26 = i18 / 8;
                bArr3[i26] = (byte) (bArr3[i26] | (((sBitrev >> i25) & 1) << (i18 % 8)));
            }
            i18++;
        }
        for (int i27 = 0; i27 < this.GFBITS; i27++) {
            apply_benes(bArr2[i27], bArr, 0);
        }
        for (int i28 = 0; i28 < this.SYS_N; i28++) {
            sArr[i28] = 0;
            for (int i29 = this.GFBITS - 1; i29 >= 0; i29--) {
                short s15 = (short) (sArr[i28] << 1);
                sArr[i28] = s15;
                sArr[i28] = (short) (s15 | ((bArr2[i29][i28 / 8] >> (i28 % 8)) & 1));
            }
        }
    }
}
