package org.bouncycastle.crypto.modes;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class GOST3413CipherUtil {
    GOST3413CipherUtil() {
    }

    public static byte[] LSB(byte[] bArr, int i15) {
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, bArr.length - i15, bArr2, 0, i15);
        return bArr2;
    }

    public static byte[] MSB(byte[] bArr, int i15) {
        return Arrays.copyOf(bArr, i15);
    }

    public static byte[] copyFromInput(byte[] bArr, int i15, int i16) {
        if (bArr.length < i15 + i16) {
            i15 = bArr.length - i16;
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i16, bArr2, 0, i15);
        return bArr2;
    }

    public static byte[] sum(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr3[i15] = (byte) (bArr[i15] ^ bArr2[i15]);
        }
        return bArr3;
    }
}
