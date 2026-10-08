package li2;

import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static byte[] a(int i15) {
        return b(i15, b.a());
    }

    public static byte[] b(int i15, Random random) {
        byte[] bArr = new byte[i15];
        random.nextBytes(bArr);
        return bArr;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        int length;
        int length2;
        Objects.requireNonNull(bArr, "Argument must not be null.");
        Objects.requireNonNull(bArr2, "Argument must not be null.");
        if (bArr.length < bArr2.length) {
            length = bArr2.length;
            length2 = bArr.length;
            bArr2 = bArr;
            bArr = bArr2;
        } else {
            length = bArr.length;
            length2 = bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            bArr3[i15] = (byte) (bArr[i15] ^ bArr2[i15 % length2]);
        }
        return bArr3;
    }
}
