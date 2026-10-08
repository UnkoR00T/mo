package ek;

import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static int a(long j15) {
        int i15 = (int) j15;
        p.k(j15 == ((long) i15), "the total number of elements (%s) in the arrays must fit in an int", j15);
        return i15;
    }

    public static byte[] b(byte[]... bArr) {
        long length = 0;
        for (byte[] bArr2 : bArr) {
            length += (long) bArr2.length;
        }
        byte[] bArr3 = new byte[a(length)];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }
}
