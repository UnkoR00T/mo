package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class n5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static void f(byte b15, byte b16, byte b17, byte b18, char[] cArr, int i15) throws u2 {
        if (o(b16) || (((b15 << 28) + (b16 + 112)) >> 30) != 0 || o(b17) || o(b18)) {
            throw u2.f();
        }
        int i16 = ((b15 & 7) << 18) | ((b16 & 63) << 12) | ((b17 & 63) << 6) | (b18 & 63);
        cArr[i15] = (char) ((i16 >>> 10) + 55232);
        cArr[i15 + 1] = (char) ((i16 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(byte b15, byte b16, byte b17, char[] cArr, int i15) throws u2 {
        if (o(b16) || ((b15 == -32 && b16 < -96) || ((b15 == -19 && b16 >= -96) || o(b17)))) {
            throw u2.f();
        }
        cArr[i15] = (char) (((b15 & 15) << 12) | ((b16 & 63) << 6) | (b17 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(byte b15, byte b16, char[] cArr, int i15) throws u2 {
        if (b15 < -62 || o(b16)) {
            throw u2.f();
        }
        cArr[i15] = (char) (((b15 & 31) << 6) | (b16 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(byte b15, char[] cArr, int i15) {
        cArr[i15] = (char) b15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(byte b15) {
        return b15 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(byte b15) {
        return b15 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(byte b15) {
        return b15 < -16;
    }

    private static boolean o(byte b15) {
        return b15 > -65;
    }
}
