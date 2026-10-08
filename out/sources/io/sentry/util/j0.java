package io.sentry.util;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    public static long a() {
        byte[] bArr = new byte[8];
        b0.a().b(bArr);
        byte b15 = (byte) (bArr[6] & 15);
        bArr[6] = b15;
        bArr[6] = (byte) (b15 | 64);
        long j15 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            j15 = (j15 << 8) | ((long) (bArr[i15] & 255));
        }
        return j15;
    }

    public static UUID b() {
        byte[] bArr = new byte[16];
        b0.a().b(bArr);
        byte b15 = (byte) (bArr[6] & 15);
        bArr[6] = b15;
        bArr[6] = (byte) (b15 | 64);
        byte b16 = (byte) (bArr[8] & 63);
        bArr[8] = b16;
        bArr[8] = (byte) (b16 | 128);
        long j15 = 0;
        long j16 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            j16 = (j16 << 8) | ((long) (bArr[i15] & 255));
        }
        for (int i16 = 8; i16 < 16; i16++) {
            j15 = (j15 << 8) | ((long) (bArr[i16] & 255));
        }
        return new UUID(j16, j15);
    }
}
