package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class XofUtils {
    static byte[] encode(byte b15) {
        return Arrays.concatenate(leftEncode(8L), new byte[]{b15});
    }

    public static byte[] leftEncode(long j15) {
        long j16 = j15;
        byte b15 = 1;
        while (true) {
            j16 >>= 8;
            if (j16 == 0) {
                break;
            }
            b15 = (byte) (b15 + 1);
        }
        byte[] bArr = new byte[b15 + 1];
        bArr[0] = b15;
        for (int i15 = 1; i15 <= b15; i15++) {
            bArr[i15] = (byte) (j15 >> ((b15 - i15) * 8));
        }
        return bArr;
    }

    public static byte[] rightEncode(long j15) {
        long j16 = j15;
        byte b15 = 1;
        while (true) {
            j16 >>= 8;
            if (j16 == 0) {
                break;
            }
            b15 = (byte) (b15 + 1);
        }
        byte[] bArr = new byte[b15 + 1];
        bArr[b15] = b15;
        for (int i15 = 0; i15 < b15; i15++) {
            bArr[i15] = (byte) (j15 >> (((b15 - i15) - 1) * 8));
        }
        return bArr;
    }

    static byte[] encode(byte[] bArr, int i15, int i16) {
        return bArr.length == i16 ? Arrays.concatenate(leftEncode(i16 * 8), bArr) : Arrays.concatenate(leftEncode(i16 * 8), Arrays.copyOfRange(bArr, i15, i16 + i15));
    }
}
