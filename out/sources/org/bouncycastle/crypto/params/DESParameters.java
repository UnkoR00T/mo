package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};
    private static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    public static boolean isWeakKey(byte[] bArr, int i15) {
        if (bArr.length - i15 < 8) {
            throw new IllegalArgumentException("key material too short.");
        }
        for (int i16 = 0; i16 < 16; i16++) {
            for (int i17 = 0; i17 < 8; i17++) {
                if (bArr[i17 + i15] != DES_weak_keys[(i16 * 8) + i17]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void setOddParity(byte[] bArr) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            byte b15 = bArr[i15];
            bArr[i15] = (byte) (((((b15 >> 7) ^ ((((((b15 >> 1) ^ (b15 >> 2)) ^ (b15 >> 3)) ^ (b15 >> 4)) ^ (b15 >> 5)) ^ (b15 >> 6))) ^ 1) & 1) | (b15 & 254));
        }
    }
}
