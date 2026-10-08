package org.conscrypt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    static void checkOffsetAndCount(int i15, int i16, int i17) {
        if ((i16 | i17) < 0 || i16 > i15 || i15 - i16 < i17) {
            throw new ArrayIndexOutOfBoundsException("length=" + i15 + "; regionStart=" + i16 + "; regionLength=" + i17);
        }
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @SafeVarargs
    public static <T> T[] concatValues(T[] tArr, T... tArr2) {
        return (T[]) concat(tArr, tArr2);
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i15 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr2[i15] = bArr[length];
            i15++;
        }
        return bArr2;
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i15 = 0; i15 < bArr2.length; i15++) {
            if (bArr[i15] != bArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + bArr2.length);
        System.arraycopy(bArr2, 0, bArrCopyOf, bArr.length, bArr2.length);
        return bArrCopyOf;
    }
}
