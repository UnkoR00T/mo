package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class r5 extends m5 {
    r5() {
    }

    private static int e(byte[] bArr, int i15, long j15, int i16) {
        if (i16 == 0) {
            return l5.h(i15);
        }
        if (i16 == 1) {
            return l5.i(i15, i5.a(bArr, j15));
        }
        if (i16 == 2) {
            return l5.j(i15, i5.a(bArr, j15), i5.a(bArr, j15 + 1));
        }
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.vision.m5
    final int a(int i15, byte[] bArr, int i16, int i17) {
        int i18;
        long j15;
        if ((i16 | i17 | (bArr.length - i17)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i16), Integer.valueOf(i17)));
        }
        long j16 = i16;
        int i19 = (int) (((long) i17) - j16);
        byte b15 = 0;
        long j17 = 1;
        if (i19 >= 16) {
            long j18 = j16;
            i18 = 0;
            while (true) {
                if (i18 >= i19) {
                    i18 = i19;
                    break;
                }
                long j19 = j18 + 1;
                if (i5.a(bArr, j18) < 0) {
                    break;
                }
                i18++;
                j18 = j19;
            }
        } else {
            i18 = 0;
        }
        int i25 = i19 - i18;
        long j25 = j16 + ((long) i18);
        while (true) {
            byte bA = b15;
            while (i25 > 0) {
                long j26 = j25 + j17;
                bA = i5.a(bArr, j25);
                if (bA < 0) {
                    j25 = j26;
                    break;
                }
                i25--;
                j25 = j26;
            }
            if (i25 == 0) {
                return b15;
            }
            int i26 = i25 - 1;
            if (bA >= -32) {
                if (bA >= -16) {
                    j15 = j17;
                    if (i26 >= 3) {
                        i25 -= 4;
                        long j27 = j25 + j15;
                        byte bA2 = i5.a(bArr, j25);
                        if (bA2 <= -65 && (((bA << 28) + (bA2 + 112)) >> 30) == 0) {
                            long j28 = 2 + j25;
                            if (i5.a(bArr, j27) > -65) {
                                break;
                            }
                            j25 += 3;
                            if (i5.a(bArr, j28) > -65) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        return e(bArr, bA, j25, i26);
                    }
                } else {
                    if (i26 < 2) {
                        return e(bArr, bA, j25, i26);
                    }
                    i25 -= 3;
                    j15 = j17;
                    long j29 = j25 + j15;
                    byte bA3 = i5.a(bArr, j25);
                    if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                        j25 += 2;
                        if (i5.a(bArr, j29) > -65) {
                        }
                    }
                    return -1;
                }
            } else {
                if (i26 == 0) {
                    return bA;
                }
                i25 -= 2;
                if (bA >= -62) {
                    long j35 = j25 + j17;
                    if (i5.a(bArr, j25) <= -65) {
                        j15 = j17;
                        j25 = j35;
                    }
                }
                return -1;
            }
            j17 = j15;
            b15 = 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.m5
    final int b(CharSequence charSequence, byte[] bArr, int i15, int i16) {
        long j15;
        long j16;
        long j17;
        int i17;
        char cCharAt;
        long j18 = i15;
        long j19 = ((long) i16) + j18;
        int length = charSequence.length();
        if (length > i16 || bArr.length - i16 < i15) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("Failed writing ");
            sb5.append(cCharAt2);
            sb5.append(" at index ");
            sb5.append(i15 + i16);
            throw new ArrayIndexOutOfBoundsException(sb5.toString());
        }
        int i18 = 0;
        while (true) {
            j15 = 1;
            if (i18 >= length || (cCharAt = charSequence.charAt(i18)) >= 128) {
                break;
            }
            i5.l(bArr, j18, (byte) cCharAt);
            i18++;
            j18 = 1 + j18;
        }
        if (i18 == length) {
            return (int) j18;
        }
        while (i18 < length) {
            char cCharAt3 = charSequence.charAt(i18);
            if (cCharAt3 < 128 && j18 < j19) {
                i5.l(bArr, j18, (byte) cCharAt3);
                j17 = j19;
                j16 = j15;
                j18 += j15;
            } else if (cCharAt3 >= 2048 || j18 > j19 - 2) {
                j16 = j15;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j18 > j19 - 3) {
                    j17 = j19;
                    if (j18 > j17 - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i17 = i18 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i17)))) {
                            throw new o5(i18, length);
                        }
                        StringBuilder sb6 = new StringBuilder(46);
                        sb6.append("Failed writing ");
                        sb6.append(cCharAt3);
                        sb6.append(" at index ");
                        sb6.append(j18);
                        throw new ArrayIndexOutOfBoundsException(sb6.toString());
                    }
                    int i19 = i18 + 1;
                    if (i19 != length) {
                        char cCharAt4 = charSequence.charAt(i19);
                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                            i5.l(bArr, j18, (byte) ((codePoint >>> 18) | 240));
                            i5.l(bArr, j18 + j16, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j25 = j18 + 3;
                            i5.l(bArr, j18 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j18 += 4;
                            i5.l(bArr, j25, (byte) ((codePoint & 63) | 128));
                            i18 = i19;
                        } else {
                            i18 = i19;
                        }
                    }
                    throw new o5(i18 - 1, length);
                }
                i5.l(bArr, j18, (byte) ((cCharAt3 >>> '\f') | 480));
                long j26 = j18 + 2;
                j17 = j19;
                i5.l(bArr, j18 + j16, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j18 += 3;
                i5.l(bArr, j26, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j16 = j15;
                long j27 = j18 + j16;
                i5.l(bArr, j18, (byte) ((cCharAt3 >>> 6) | 960));
                j18 += 2;
                i5.l(bArr, j27, (byte) ((cCharAt3 & '?') | 128));
                j17 = j19;
            }
            i18++;
            j15 = j16;
            j19 = j17;
        }
        return (int) j18;
    }

    @Override // com.google.android.gms.internal.vision.m5
    final String d(byte[] bArr, int i15, int i16) throws u2 {
        if ((i15 | i16 | ((bArr.length - i15) - i16)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i16)));
        }
        int i17 = i15 + i16;
        char[] cArr = new char[i16];
        int i18 = 0;
        while (i15 < i17) {
            byte bA = i5.a(bArr, i15);
            if (!n5.l(bA)) {
                break;
            }
            i15++;
            n5.i(bA, cArr, i18);
            i18++;
        }
        int i19 = i18;
        while (i15 < i17) {
            int i25 = i15 + 1;
            byte bA2 = i5.a(bArr, i15);
            if (n5.l(bA2)) {
                int i26 = i19 + 1;
                n5.i(bA2, cArr, i19);
                while (i25 < i17) {
                    byte bA3 = i5.a(bArr, i25);
                    if (!n5.l(bA3)) {
                        break;
                    }
                    i25++;
                    n5.i(bA3, cArr, i26);
                    i26++;
                }
                i19 = i26;
                i15 = i25;
            } else if (n5.m(bA2)) {
                if (i25 >= i17) {
                    throw u2.f();
                }
                i15 += 2;
                n5.h(bA2, i5.a(bArr, i25), cArr, i19);
                i19++;
            } else if (n5.n(bA2)) {
                if (i25 >= i17 - 1) {
                    throw u2.f();
                }
                int i27 = i15 + 2;
                i15 += 3;
                n5.g(bA2, i5.a(bArr, i25), i5.a(bArr, i27), cArr, i19);
                i19++;
            } else {
                if (i25 >= i17 - 2) {
                    throw u2.f();
                }
                byte bA4 = i5.a(bArr, i25);
                int i28 = i15 + 3;
                byte bA5 = i5.a(bArr, i15 + 2);
                i15 += 4;
                n5.f(bA2, bA4, bA5, i5.a(bArr, i28), cArr, i19);
                i19 += 2;
            }
        }
        return new String(cArr, 0, i19);
    }
}
