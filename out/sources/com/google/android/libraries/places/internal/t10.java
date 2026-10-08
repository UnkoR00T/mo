package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
final class t10 {
    static {
        int i15 = kx.f32765a;
    }

    static int a(String str) {
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
                try {
                    int length2 = str.length();
                    while (i16 < length2) {
                        char cCharAt2 = str.charAt(i16);
                        if (cCharAt2 < 2048) {
                            i15 += (127 - cCharAt2) >>> 31;
                        } else {
                            i15 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i16) < 65536) {
                                    throw new s10(i16, length2);
                                }
                                i16++;
                            }
                        }
                        i16++;
                    }
                    i17 += i15;
                    break;
                } catch (s10 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i17 += (127 - cCharAt) >>> 31;
            i16++;
        }
        if (i17 >= length) {
            return i17;
        }
        long j15 = ((long) i17) + 4294967296L;
        StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 34);
        sb5.append("UTF-8 length does not fit in int: ");
        sb5.append(j15);
        throw new IllegalArgumentException(sb5.toString());
    }

    static int b(String str, byte[] bArr, int i15, int i16) {
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
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i18 = i25 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i18)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return r10.a(str, bArr, i15, i16);
                    }
                    i25++;
                    if (i25 != str.length()) {
                        char cCharAt3 = str.charAt(i25);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i27 = i26 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i26] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i26 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i26 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i26 += 4;
                            bArr[i27] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return r10.a(str, bArr, i15, i16);
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

    static String c(byte[] bArr, int i15, int i16) throws lz {
        int i17;
        if (i16 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i15) - i16) | i15 | i16) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i15), Integer.valueOf(i16)));
        }
        int i18 = i15 + i16;
        char[] cArr = new char[i16];
        int i19 = 0;
        while (i15 < i18) {
            byte b15 = bArr[i15];
            if (!q10.a(b15)) {
                break;
            }
            i15++;
            cArr[i19] = (char) b15;
            i19++;
        }
        int i25 = i19;
        while (i15 < i18) {
            int i26 = i15 + 1;
            byte b16 = bArr[i15];
            if (q10.a(b16)) {
                cArr[i25] = (char) b16;
                i25++;
                i15 = i26;
                while (i15 < i18) {
                    byte b17 = bArr[i15];
                    if (!q10.a(b17)) {
                        break;
                    }
                    i15++;
                    cArr[i25] = (char) b17;
                    i25++;
                }
            } else {
                if (b16 < -32) {
                    if (i26 >= i18) {
                        throw new lz("Protocol message had invalid UTF-8.");
                    }
                    i17 = i25 + 1;
                    i15 += 2;
                    q10.b(b16, bArr[i26], cArr, i25);
                } else if (b16 < -16) {
                    if (i26 >= i18 - 1) {
                        throw new lz("Protocol message had invalid UTF-8.");
                    }
                    i17 = i25 + 1;
                    int i27 = i15 + 2;
                    i15 += 3;
                    q10.c(b16, bArr[i26], bArr[i27], cArr, i25);
                } else {
                    if (i26 >= i18 - 2) {
                        throw new lz("Protocol message had invalid UTF-8.");
                    }
                    byte b18 = bArr[i26];
                    int i28 = i15 + 3;
                    byte b19 = bArr[i15 + 2];
                    i15 += 4;
                    q10.d(b16, b18, b19, bArr[i28], cArr, i25);
                    i25 += 2;
                }
                i25 = i17;
            }
        }
        return new String(cArr, 0, i25);
    }
}
