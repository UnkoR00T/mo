package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i15) {
        boolean z15 = false;
        for (int i16 = i15; i16 != i15 + 8; i16++) {
            if (bArr[i16] != bArr[i16 + 8]) {
                z15 = true;
            }
        }
        return z15;
    }

    public static boolean isReal3Key(byte[] bArr, int i15) {
        int i16 = i15;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            boolean z18 = true;
            if (i16 == i15 + 8) {
                break;
            }
            byte b15 = bArr[i16];
            byte b16 = bArr[i16 + 8];
            z15 |= b15 != b16;
            byte b17 = bArr[i16 + 16];
            z16 |= b15 != b17;
            if (b16 == b17) {
                z18 = false;
            }
            z17 |= z18;
            i16++;
        }
        return z15 && z16 && z17;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i15) {
        return bArr.length == 16 ? isReal2Key(bArr, i15) : isReal3Key(bArr, i15);
    }

    public static boolean isWeakKey(byte[] bArr, int i15) {
        return isWeakKey(bArr, i15, bArr.length - i15);
    }

    public static boolean isWeakKey(byte[] bArr, int i15, int i16) {
        while (i15 < i16) {
            if (DESParameters.isWeakKey(bArr, i15)) {
                return true;
            }
            i15 += 8;
        }
        return false;
    }
}
