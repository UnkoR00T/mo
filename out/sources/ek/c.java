package ek;

import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static char a(long j15) {
        char c15 = (char) j15;
        p.k(((long) c15) == j15, "Out of range: %s", j15);
        return c15;
    }

    public static boolean b(char[] cArr, char c15) {
        for (char c16 : cArr) {
            if (c16 == c15) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b15, byte b16) {
        return (char) ((b15 << 8) | (b16 & 255));
    }
}
