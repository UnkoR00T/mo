package org.bouncycastle.math.ec.rfc8032;

/* JADX INFO: loaded from: classes5.dex */
abstract class Wnaf {
    Wnaf() {
    }

    static void getSignedVar(int[] iArr, int i15, byte[] bArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i16 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i17 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i18 = iArr[length2];
            iArr2[i17 - 1] = (i16 << 16) | (i18 >>> 16);
            i17 -= 2;
            iArr2[i17] = i18;
            i16 = i18;
        }
        int i19 = 32 - i15;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i25 < length) {
            int i28 = iArr2[i25];
            while (i26 < 16) {
                int i29 = i28 >>> i26;
                if ((i29 & 1) == i27) {
                    i26++;
                } else {
                    int i35 = (i29 | 1) << i19;
                    bArr[(i25 << 4) + i26] = (byte) (i35 >> i19);
                    i26 += i15;
                    i27 = i35 >>> 31;
                }
            }
            i25++;
            i26 -= 16;
        }
    }
}
