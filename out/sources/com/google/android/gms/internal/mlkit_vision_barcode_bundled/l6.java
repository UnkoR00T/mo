package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i6 f29757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29758b = 0;

    static {
        if (f6.C() && f6.D()) {
            int i15 = w1.f30287a;
        }
        f29757a = new j6();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i15, int i16) {
        int i17 = i16 - i15;
        byte b15 = bArr[i15 - 1];
        if (i17 == 0) {
            if (b15 > -12) {
                return -1;
            }
            return b15;
        }
        if (i17 == 1) {
            return h(b15, bArr[i15]);
        }
        if (i17 == 2) {
            return i(b15, bArr[i15], bArr[i15 + 1]);
        }
        throw new AssertionError();
    }

    static int d(String str, byte[] bArr, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        char cCharAt;
        int length = str.length();
        int i25 = 0;
        while (true) {
            i17 = i15 + i16;
            if (i25 >= length || (i19 = i25 + i15) >= i17 || (cCharAt = str.charAt(i25)) >= 128) {
                break;
            }
            bArr[i19] = (byte) cCharAt;
            i25++;
        }
        if (i25 == length) {
            return i15 + length;
        }
        int i26 = i15 + i25;
        while (i25 < length) {
            char cCharAt2 = str.charAt(i25);
            if (cCharAt2 < 128 && i26 < i17) {
                bArr[i26] = (byte) cCharAt2;
                i26++;
            } else if (cCharAt2 < 2048 && i26 <= i17 - 2) {
                bArr[i26] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i26 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i26 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i26 > i17 - 3) {
                    if (i26 > i17 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i18 = i25 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i18)))) {
                            throw new k6(i25, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i26);
                    }
                    int i27 = i25 + 1;
                    if (i27 != str.length()) {
                        char cCharAt3 = str.charAt(i27);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i28 = i26 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i26] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i26 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i26 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i26 += 4;
                            bArr[i28] = (byte) ((codePoint & 63) | 128);
                            i25 = i27;
                        } else {
                            i25 = i27;
                        }
                    }
                    throw new k6(i25 - 1, length);
                }
                bArr[i26] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i26 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i26 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i26 += 3;
            }
            i25++;
        }
        return i26;
    }

    static int e(String str) {
        int length = str.length();
        int i15 = 0;
        int i16 = 0;
        while (i16 < length && str.charAt(i16) < 128) {
            i16++;
        }
        int i17 = length;
        while (i16 < length) {
            char cCharAt = str.charAt(i16);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i16 < length2) {
                    char cCharAt2 = str.charAt(i16);
                    if (cCharAt2 < 2048) {
                        i15 += (127 - cCharAt2) >>> 31;
                    } else {
                        i15 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i16) < 65536) {
                                throw new k6(i16, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i17) + 4294967296L));
    }

    static int f(int i15, byte[] bArr, int i16, int i17) {
        return f29757a.a(i15, bArr, i16, i17);
    }

    static boolean g(byte[] bArr, int i15, int i16) {
        return f29757a.a(0, bArr, i15, i16) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int i15, int i16) {
        if (i15 > -12 || i16 > -65) {
            return -1;
        }
        return i15 ^ (i16 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i15, int i16, int i17) {
        if (i15 > -12 || i16 > -65 || i17 > -65) {
            return -1;
        }
        return (i15 ^ (i16 << 8)) ^ (i17 << 16);
    }
}
