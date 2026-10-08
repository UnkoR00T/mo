package io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static int a(int i15) {
        return i15 / 8;
    }

    public static byte[] b(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e15) {
            throw new IllegalStateException(e15.getMessage(), e15);
        }
    }

    public static int c(int i15) throws h {
        long j15 = ((long) i15) * 8;
        int i16 = (int) j15;
        if (i16 == j15) {
            return i16;
        }
        throw new h();
    }

    public static int d(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return c(bArr.length);
    }

    public static byte[] e(byte[] bArr, int i15, int i16) {
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        return bArr2;
    }
}
