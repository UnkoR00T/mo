package pk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static byte[] a(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i15 = 0; i15 < 16; i15++) {
            byte b15 = (byte) ((bArr[i15] << 1) & 254);
            bArr2[i15] = b15;
            if (i15 < 15) {
                bArr2[i15] = (byte) (((byte) ((bArr[i15 + 1] >> 7) & 1)) | b15);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
