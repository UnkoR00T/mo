package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class BENES12 extends BENES {
    public BENES12(int i15, int i16, int i17) {
        super(i15, i16, i17);
    }

    private void apply_benes(byte[] bArr, byte[] bArr2, int i15) {
        int i16;
        int i17;
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        for (int i18 = 0; i18 < 64; i18++) {
            jArr[i18] = Utils.load8(bArr, i18 * 8);
        }
        int i19 = 256;
        if (i15 == 0) {
            i16 = (this.SYS_T * 2) + 40;
        } else {
            i16 = (this.SYS_T * 2) + 40 + (((this.GFBITS * 2) - 2) * 256);
            i19 = -256;
        }
        BENES.transpose_64x64(jArr, jArr);
        int i25 = 0;
        while (true) {
            if (i25 > 5) {
                break;
            }
            for (int i26 = 0; i26 < 64; i26++) {
                jArr2[i26] = Utils.load4(bArr2, (i26 * 4) + i16);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i25);
            i16 += i19;
            i25++;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i27 = 0; i27 <= 5; i27++) {
            for (int i28 = 0; i28 < 32; i28++) {
                jArr2[i28] = Utils.load8(bArr2, (i28 * 8) + i16);
            }
            layerBenes(jArr, jArr2, i27);
            i16 += i19;
        }
        for (int i29 = 4; i29 >= 0; i29--) {
            for (int i35 = 0; i35 < 32; i35++) {
                jArr2[i35] = Utils.load8(bArr2, (i35 * 8) + i16);
            }
            layerBenes(jArr, jArr2, i29);
            i16 += i19;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (i17 = 5; i17 >= 0; i17--) {
            for (int i36 = 0; i36 < 64; i36++) {
                jArr2[i36] = Utils.load4(bArr2, (i36 * 4) + i16);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i17);
            i16 += i19;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i37 = 0; i37 < 64; i37++) {
            Utils.store8(bArr, i37 * 8, jArr[i37]);
        }
    }

    static void layerBenes(long[] jArr, long[] jArr2, int i15) {
        int i16 = 1 << i15;
        int i17 = 0;
        for (int i18 = 0; i18 < 64; i18 += i16 * 2) {
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
