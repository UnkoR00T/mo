package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class uy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30651a = 0;

    static {
        if (ry.C() && ry.D()) {
            int i15 = hu.f30448a;
        }
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i15, int i16) {
        int i17 = i16 - i15;
        byte b15 = bArr[i15 - 1];
        if (i17 == 0) {
            if (b15 <= -12) {
                return b15;
            }
            return -1;
        }
        if (i17 == 1) {
            byte b16 = bArr[i15];
            if (b15 > -12 || b16 > -65) {
                return -1;
            }
            return (b16 << 8) ^ b15;
        }
        if (i17 != 2) {
            throw new AssertionError();
        }
        byte b17 = bArr[i15];
        byte b18 = bArr[i15 + 1];
        if (b15 > -12 || b17 > -65 || b18 > -65) {
            return -1;
        }
        return (b18 << 16) ^ ((b17 << 8) ^ b15);
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
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i18 = i25 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i18)))) {
                            throw new ty(i25, length);
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
                    throw new ty(i25 - 1, length);
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

    static int c(String str) {
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
                                throw new ty(i16, length2);
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

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    static boolean d(byte[] bArr, int i15, int i16) {
        while (i15 < i16 && bArr[i15] >= 0) {
            i15++;
        }
        if (i15 >= i16) {
            return true;
        }
        while (i15 < i16) {
            int i17 = i15 + 1;
            int iA = bArr[i15];
            if (iA >= 0) {
                i15 = i17;
            } else if (iA < -32) {
                if (i17 >= i16) {
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                if (iA < -62) {
                    return false;
                }
                i15 += 2;
                if (bArr[i17] > -65) {
                    return false;
                }
            } else if (iA < -16) {
                if (i17 >= i16 - 1) {
                    iA = a(bArr, i17, i16);
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                int i18 = i15 + 2;
                char c15 = bArr[i17];
                if (c15 > -65) {
                    return false;
                }
                if (iA == -32 && c15 < -96) {
                    return false;
                }
                if (iA == -19 && c15 >= -96) {
                    return false;
                }
                i15 += 3;
                if (bArr[i18] > -65) {
                    return false;
                }
            } else {
                if (i17 >= i16 - 2) {
                    iA = a(bArr, i17, i16);
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                int i19 = i15 + 2;
                int i25 = bArr[i17];
                if (i25 > -65 || (((iA << 28) + (i25 + 112)) >> 30) != 0) {
                    return false;
                }
                int i26 = i15 + 3;
                if (bArr[i19] > -65) {
                    return false;
                }
                i15 += 4;
                if (bArr[i26] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
