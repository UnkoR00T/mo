package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e4 f29293a;

    static {
        f29293a = (b4.x() && b4.y()) ? new h4() : new f4();
    }

    static int a(CharSequence charSequence) {
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
                                throw new g4(i16, length2);
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

    static int b(CharSequence charSequence, byte[] bArr, int i15, int i16) {
        return f29293a.b(charSequence, bArr, i15, i16);
    }

    static void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        e4 e4Var = f29293a;
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            e4Var.c(charSequence, byteBuffer);
        } else {
            e4.d(charSequence, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i15) {
        if (i15 > -12) {
            return -1;
        }
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i15, int i16, int i17) {
        if (i15 > -12 || i16 > -65 || i17 > -65) {
            return -1;
        }
        return (i15 ^ (i16 << 8)) ^ (i17 << 16);
    }

    public static boolean h(byte[] bArr) {
        return f29293a.e(bArr, 0, bArr.length);
    }

    public static boolean i(byte[] bArr, int i15, int i16) {
        return f29293a.e(bArr, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(byte[] bArr, int i15, int i16) {
        byte b15 = bArr[i15 - 1];
        int i17 = i16 - i15;
        if (i17 == 0) {
            return d(b15);
        }
        if (i17 == 1) {
            return l(b15, bArr[i15]);
        }
        if (i17 == 2) {
            return f(b15, bArr[i15], bArr[i15 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i15, int i16) {
        if (i15 > -12 || i16 > -65) {
            return -1;
        }
        return i15 ^ (i16 << 8);
    }
}
