package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class f4 extends e4 {
    f4() {
    }

    @Override // com.google.android.gms.internal.clearcut.e4
    final int a(int i15, byte[] bArr, int i16, int i17) {
        while (i16 < i17 && bArr[i16] >= 0) {
            i16++;
        }
        if (i16 >= i17) {
            return 0;
        }
        while (i16 < i17) {
            int i18 = i16 + 1;
            byte b15 = bArr[i16];
            if (b15 < 0) {
                if (b15 < -32) {
                    if (i18 >= i17) {
                        return b15;
                    }
                    if (b15 >= -62) {
                        i16 += 2;
                        if (bArr[i18] > -65) {
                        }
                    }
                    return -1;
                }
                if (b15 >= -16) {
                    if (i18 >= i17 - 2) {
                        return d4.j(bArr, i18, i17);
                    }
                    int i19 = i16 + 2;
                    byte b16 = bArr[i18];
                    if (b16 <= -65 && (((b15 << 28) + (b16 + 112)) >> 30) == 0) {
                        int i25 = i16 + 3;
                        if (bArr[i19] <= -65) {
                            i16 += 4;
                            if (bArr[i25] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i18 >= i17 - 1) {
                    return d4.j(bArr, i18, i17);
                }
                int i26 = i16 + 2;
                byte b17 = bArr[i18];
                if (b17 <= -65 && ((b15 != -32 || b17 >= -96) && (b15 != -19 || b17 < -96))) {
                    i16 += 3;
                    if (bArr[i26] > -65) {
                    }
                }
                return -1;
            }
            i16 = i18;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.e4
    final int b(CharSequence charSequence, byte[] bArr, int i15, int i16) {
        int i17;
        int i18;
        char cCharAt;
        int length = charSequence.length();
        int i19 = i16 + i15;
        int i25 = 0;
        while (i25 < length && (i18 = i25 + i15) < i19 && (cCharAt = charSequence.charAt(i25)) < 128) {
            bArr[i18] = (byte) cCharAt;
            i25++;
        }
        if (i25 == length) {
            return i15 + length;
        }
        int i26 = i15 + i25;
        while (i25 < length) {
            char cCharAt2 = charSequence.charAt(i25);
            if (cCharAt2 < 128 && i26 < i19) {
                bArr[i26] = (byte) cCharAt2;
                i26++;
            } else if (cCharAt2 < 2048 && i26 <= i19 - 2) {
                int i27 = i26 + 1;
                bArr[i26] = (byte) ((cCharAt2 >>> 6) | 960);
                i26 += 2;
                bArr[i27] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i26 > i19 - 3) {
                    if (i26 > i19 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i17 = i25 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i17)))) {
                            throw new g4(i25, length);
                        }
                        StringBuilder sb5 = new StringBuilder(37);
                        sb5.append("Failed writing ");
                        sb5.append(cCharAt2);
                        sb5.append(" at index ");
                        sb5.append(i26);
                        throw new ArrayIndexOutOfBoundsException(sb5.toString());
                    }
                    int i28 = i25 + 1;
                    if (i28 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i28);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i26] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i26 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i29 = i26 + 3;
                            bArr[i26 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i26 += 4;
                            bArr[i29] = (byte) ((codePoint & 63) | 128);
                            i25 = i28;
                        } else {
                            i25 = i28;
                        }
                    }
                    throw new g4(i25 - 1, length);
                }
                bArr[i26] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i35 = i26 + 2;
                bArr[i26 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i26 += 3;
                bArr[i35] = (byte) ((cCharAt2 & '?') | 128);
            }
            i25++;
        }
        return i26;
    }

    @Override // com.google.android.gms.internal.clearcut.e4
    final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        e4.d(charSequence, byteBuffer);
    }
}
