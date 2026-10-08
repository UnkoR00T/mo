package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m5 f31144a;

    static {
        f31144a = (i5.m() && i5.r() && !w0.b()) ? new r5() : new p5();
    }

    static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i15 = 0;
        int i16 = 0;
        while (i16 < length && charSequence.charAt(i16) < 128) {
            i16++;
        }
        int i17 = length;
        while (i16 < length) {
            char cCharAt = charSequence.charAt(i16);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i16 < length2) {
                    char cCharAt2 = charSequence.charAt(i16);
                    if (cCharAt2 < 2048) {
                        i15 += (127 - cCharAt2) >>> 31;
                    } else {
                        i15 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i16) < 65536) {
                                throw new o5(i16, length2);
                            }
                            i16++;
                        }
                    }
                    i16++;
                }
                i17 += i15;
                break;
            }
            i17 += (127 - cCharAt) >>> 31;
            i16++;
        }
        if (i17 >= length) {
            return i17;
        }
        StringBuilder sb5 = new StringBuilder(54);
        sb5.append("UTF-8 length does not fit in int: ");
        sb5.append(((long) i17) + 4294967296L);
        throw new IllegalArgumentException(sb5.toString());
    }

    static int e(CharSequence charSequence, byte[] bArr, int i15, int i16) {
        return f31144a.b(charSequence, bArr, i15, i16);
    }

    public static boolean f(byte[] bArr) {
        return f31144a.c(bArr, 0, bArr.length);
    }

    public static boolean g(byte[] bArr, int i15, int i16) {
        return f31144a.c(bArr, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int i15) {
        if (i15 > -12) {
            return -1;
        }
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i15, int i16) {
        if (i15 > -12 || i16 > -65) {
            return -1;
        }
        return i15 ^ (i16 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i15, int i16, int i17) {
        if (i15 > -12 || i16 > -65 || i17 > -65) {
            return -1;
        }
        return (i15 ^ (i16 << 8)) ^ (i17 << 16);
    }

    static String k(byte[] bArr, int i15, int i16) {
        return f31144a.d(bArr, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(byte[] bArr, int i15, int i16) {
        byte b15 = bArr[i15 - 1];
        int i17 = i16 - i15;
        if (i17 == 0) {
            return h(b15);
        }
        if (i17 == 1) {
            return i(b15, bArr[i15]);
        }
        if (i17 == 2) {
            return j(b15, bArr[i15], bArr[i15 + 1]);
        }
        throw new AssertionError();
    }
}
