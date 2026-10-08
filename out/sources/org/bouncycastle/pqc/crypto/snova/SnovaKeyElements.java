package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class SnovaKeyElements {
    public final byte[][][] T12;
    public final MapGroup1 map1;
    public final MapGroup2 map2;

    public SnovaKeyElements(SnovaParameters snovaParameters) {
        int o15 = snovaParameters.getO();
        int v15 = snovaParameters.getV();
        int lsq = snovaParameters.getLsq();
        this.map1 = new MapGroup1(snovaParameters);
        this.T12 = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, v15, o15, lsq);
        this.map2 = new MapGroup2(snovaParameters);
    }

    static int copy3d(byte[] bArr, int i15, byte[][][] bArr2) {
        for (int i16 = 0; i16 < bArr2.length; i16++) {
            int i17 = 0;
            while (true) {
                byte[][] bArr3 = bArr2[i16];
                if (i17 < bArr3.length) {
                    byte[] bArr4 = bArr3[i17];
                    System.arraycopy(bArr, i15, bArr4, 0, bArr4.length);
                    i15 += bArr2[i16][i17].length;
                    i17++;
                }
            }
        }
        return i15;
    }

    static int copy4d(byte[] bArr, int i15, byte[][][][] bArr2) {
        for (int i16 = 0; i16 < bArr2.length; i16++) {
            for (int i17 = 0; i17 < bArr2[i16].length; i17++) {
                int i18 = 0;
                while (true) {
                    byte[][] bArr3 = bArr2[i16][i17];
                    if (i18 < bArr3.length) {
                        byte[] bArr4 = bArr3[i18];
                        System.arraycopy(bArr, i15, bArr4, 0, bArr4.length);
                        i15 += bArr2[i16][i17][i18].length;
                        i18++;
                    }
                }
            }
        }
        return i15;
    }

    static int copy3d(byte[][][] bArr, byte[] bArr2, int i15) {
        for (int i16 = 0; i16 < bArr.length; i16++) {
            int i17 = 0;
            while (true) {
                byte[][] bArr3 = bArr[i16];
                if (i17 < bArr3.length) {
                    byte[] bArr4 = bArr3[i17];
                    System.arraycopy(bArr4, 0, bArr2, i15, bArr4.length);
                    i15 += bArr[i16][i17].length;
                    i17++;
                }
            }
        }
        return i15;
    }

    static int copy4d(byte[][][][] bArr, byte[] bArr2, int i15) {
        for (byte[][][] bArr3 : bArr) {
            i15 = copy3d(bArr3, bArr2, i15);
        }
        return i15;
    }
}
