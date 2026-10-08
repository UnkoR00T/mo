package io;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static byte[] a(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i15 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i15 = 0;
        }
        int i16 = iBitLength / 8;
        int i17 = i16 - length;
        byte[] bArr = new byte[i16];
        System.arraycopy(byteArray, i15, bArr, i17, length);
        return bArr;
    }
}
