package io;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    private static int a(long j15) {
        int i15 = (int) j15;
        if (i15 == j15) {
            return i15;
        }
        throw new IllegalArgumentException(j15 + " cannot be cast to int without changing its value.");
    }

    static int b(int i15, boolean z15) {
        if (i15 == 0) {
            return 0;
        }
        if (!z15) {
            return (((i15 - 1) / 3) + 1) << 2;
        }
        int i16 = (i15 / 3) << 2;
        int i17 = i15 % 3;
        return i17 == 0 ? i16 : i16 + i17 + 1;
    }

    public static byte[] c(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(m.f93605a);
        int length = bytes.length;
        byte[] bArr = new byte[a((((long) length) * 6) >> 3)];
        int i15 = 0;
        int i16 = 0;
        while (i15 < bytes.length) {
            int i17 = 0;
            int i18 = 0;
            while (i17 < 4 && i15 < length) {
                int i19 = i15 + 1;
                int iD = d(bytes[i15]);
                if (iD >= 0) {
                    i18 |= iD << (18 - (i17 * 6));
                    i17++;
                }
                i15 = i19;
            }
            if (i17 >= 2) {
                int i25 = i16 + 1;
                bArr[i16] = (byte) (i18 >> 16);
                if (i17 >= 3) {
                    int i26 = i16 + 2;
                    bArr[i25] = (byte) (i18 >> 8);
                    if (i17 >= 4) {
                        i16 += 3;
                        bArr[i26] = (byte) i18;
                    } else {
                        i16 = i26;
                    }
                } else {
                    i16 = i25;
                }
            }
        }
        return Arrays.copyOf(bArr, i16);
    }

    static int d(byte b15) {
        int i15 = i(b15, 64) & j(b15, 91);
        int i16 = i(b15, 96) & j(b15, 123);
        int i17 = i(b15, 47) & j(b15, 58);
        int iH = h(b15, 45) | h(b15, 43);
        int iH2 = h(b15, 47) | h(b15, 95);
        return k(i17, b15 + 4, 0) | k(i15, b15 - 65, 0) | k(i16, b15 - 71, 0) | k(iH, 62, 0) | k(iH2, 63, 0) | k(i15 | i16 | i17 | iH | iH2, 0, -1);
    }

    static byte e(int i15) {
        int iJ = j(i15, 26);
        int i16 = i(i15, 25) & j(i15, 52);
        return (byte) (k(i(i15, 51) & j(i15, 62), i15 - 4, 0) | k(iJ, i15 + 65, 0) | k(i16, i15 + 71, 0) | k(h(i15, 62), 43, 0) | k(h(i15, 63), 47, 0));
    }

    static byte f(int i15) {
        int iJ = j(i15, 26);
        int i16 = i(i15, 25) & j(i15, 52);
        return (byte) (k(i(i15, 51) & j(i15, 62), i15 - 4, 0) | k(iJ, i15 + 65, 0) | k(i16, i15 + 71, 0) | k(h(i15, 62), 45, 0) | k(h(i15, 63), 95, 0));
    }

    public static String g(byte[] bArr, boolean z15) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i15 = (length / 3) * 3;
        int iB = b(length, z15);
        byte[] bArr2 = new byte[iB];
        int i16 = 0;
        int i17 = 0;
        while (i16 < i15) {
            int i18 = i16 + 2;
            int i19 = ((bArr[i16 + 1] & 255) << 8) | ((bArr[i16] & 255) << 16);
            i16 += 3;
            int i25 = i19 | (bArr[i18] & 255);
            if (z15) {
                bArr2[i17] = f((i25 >>> 18) & 63);
                bArr2[i17 + 1] = f((i25 >>> 12) & 63);
                int i26 = i17 + 3;
                bArr2[i17 + 2] = f((i25 >>> 6) & 63);
                i17 += 4;
                bArr2[i26] = f(i25 & 63);
            } else {
                bArr2[i17] = e((i25 >>> 18) & 63);
                bArr2[i17 + 1] = e((i25 >>> 12) & 63);
                int i27 = i17 + 3;
                bArr2[i17 + 2] = e((i25 >>> 6) & 63);
                i17 += 4;
                bArr2[i27] = e(i25 & 63);
            }
        }
        int i28 = length - i15;
        if (i28 > 0) {
            int i29 = ((bArr[i15] & 255) << 10) | (i28 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z15) {
                bArr2[iB - 4] = e(i29 >> 12);
                bArr2[iB - 3] = e((i29 >>> 6) & 63);
                bArr2[iB - 2] = i28 == 2 ? e(i29 & 63) : (byte) 61;
                bArr2[iB - 1] = 61;
            } else if (i28 == 2) {
                bArr2[iB - 3] = f(i29 >> 12);
                bArr2[iB - 2] = f((i29 >>> 6) & 63);
                bArr2[iB - 1] = f(i29 & 63);
            } else {
                bArr2[iB - 2] = f(i29 >> 12);
                bArr2[iB - 1] = f((i29 >>> 6) & 63);
            }
        }
        return new String(bArr2, m.f93605a);
    }

    static int h(int i15, int i16) {
        int i17 = i15 ^ i16;
        return ((~i17) & (i17 - 1)) >>> 63;
    }

    static int i(int i15, int i16) {
        return (int) ((((long) i16) - ((long) i15)) >>> 63);
    }

    static int j(int i15, int i16) {
        return (int) ((((long) i15) - ((long) i16)) >>> 63);
    }

    static int k(int i15, int i16, int i17) {
        return ((i15 - 1) & (i17 ^ i16)) ^ i16;
    }
}
