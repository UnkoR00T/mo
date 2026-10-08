package ek;

import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static byte a(long j15) {
        p.k((j15 >> 8) == 0, "out of range: %s", j15);
        return (byte) j15;
    }

    public static int b(byte b15) {
        return b15 & 255;
    }
}
