package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f12092a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b15, byte b16, byte b17, byte b18, char[] cArr, int i15) throws a0 {
            if (m(b16) || (((b15 << 28) + (b16 + 112)) >> 30) != 0 || m(b17) || m(b18)) {
                throw a0.d();
            }
            int iR = ((b15 & 7) << 18) | (r(b16) << 12) | (r(b17) << 6) | r(b18);
            cArr[i15] = l(iR);
            cArr[i15 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b15, char[] cArr, int i15) {
            cArr[i15] = (char) b15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b15, byte b16, byte b17, char[] cArr, int i15) throws a0 {
            if (m(b16) || ((b15 == -32 && b16 < -96) || ((b15 == -19 && b16 >= -96) || m(b17)))) {
                throw a0.d();
            }
            cArr[i15] = (char) (((b15 & 15) << 12) | (r(b16) << 6) | r(b17));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b15, byte b16, char[] cArr, int i15) throws a0 {
            if (b15 < -62 || m(b16)) {
                throw a0.d();
            }
            cArr[i15] = (char) (((b15 & 31) << 6) | r(b16));
        }

        private static char l(int i15) {
            return (char) ((i15 >>> 10) + 55232);
        }

        private static boolean m(byte b15) {
            return b15 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b15) {
            return b15 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b15) {
            return b15 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b15) {
            return b15 < -32;
        }

        private static char q(int i15) {
            return (char) ((i15 & 1023) + 56320);
        }

        private static int r(byte b15) {
            return b15 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i15, int i16);

        abstract int b(String str, byte[] bArr, int i15, int i16);
    }

    static final class c extends b {
        c() {
        }

        @Override // androidx.datastore.preferences.protobuf.r1.b
        String a(byte[] bArr, int i15, int i16) throws a0 {
            if ((i15 | i16 | ((bArr.length - i15) - i16)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i16)));
            }
            int i17 = i15 + i16;
            char[] cArr = new char[i16];
            int i18 = 0;
            while (i15 < i17) {
                byte b15 = bArr[i15];
                if (!a.n(b15)) {
                    break;
                }
                i15++;
                a.i(b15, cArr, i18);
                i18++;
            }
            int i19 = i18;
            while (i15 < i17) {
                int i25 = i15 + 1;
                byte b16 = bArr[i15];
                if (a.n(b16)) {
                    int i26 = i19 + 1;
                    a.i(b16, cArr, i19);
                    int i27 = i25;
                    while (i27 < i17) {
                        byte b17 = bArr[i27];
                        if (!a.n(b17)) {
                            break;
                        }
                        i27++;
                        a.i(b17, cArr, i26);
                        i26++;
                    }
                    i19 = i26;
                    i15 = i27;
                } else if (a.p(b16)) {
                    if (i25 >= i17) {
                        throw a0.d();
                    }
                    i15 += 2;
                    a.k(b16, bArr[i25], cArr, i19);
                    i19++;
                } else if (a.o(b16)) {
                    if (i25 >= i17 - 1) {
                        throw a0.d();
                    }
                    int i28 = i15 + 2;
                    i15 += 3;
                    a.j(b16, bArr[i25], bArr[i28], cArr, i19);
                    i19++;
                } else {
                    if (i25 >= i17 - 2) {
                        throw a0.d();
                    }
                    byte b18 = bArr[i25];
                    int i29 = i15 + 3;
                    byte b19 = bArr[i15 + 2];
                    i15 += 4;
                    a.h(b16, b18, b19, bArr[i29], cArr, i19);
                    i19 += 2;
                }
            }
            return new String(cArr, 0, i19);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.b
        int b(String str, byte[] bArr, int i15, int i16) {
            int i17;
            int i18;
            char cCharAt;
            int length = str.length();
            int i19 = i16 + i15;
            int i25 = 0;
            while (i25 < length && (i18 = i25 + i15) < i19 && (cCharAt = str.charAt(i25)) < 128) {
                bArr[i18] = (byte) cCharAt;
                i25++;
            }
            if (i25 == length) {
                return i15 + length;
            }
            int i26 = i15 + i25;
            while (i25 < length) {
                char cCharAt2 = str.charAt(i25);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i17 = i25 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i17)))) {
                                throw new d(i25, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i26);
                        }
                        int i28 = i25 + 1;
                        if (i28 != str.length()) {
                            char cCharAt3 = str.charAt(i28);
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
                        throw new d(i25 - 1, length);
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
    }

    static class d extends IllegalArgumentException {
        d(int i15, int i16) {
            super("Unpaired surrogate at index " + i15 + " of " + i16);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean c() {
            return q1.B() && q1.C();
        }

        @Override // androidx.datastore.preferences.protobuf.r1.b
        String a(byte[] bArr, int i15, int i16) throws a0 {
            Charset charset = z.f12228b;
            String str = new String(bArr, i15, i16, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i15, i16 + i15))) {
                throw a0.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.r1.b
        int b(String str, byte[] bArr, int i15, int i16) {
            long j15;
            long j16;
            long j17;
            int i17;
            char cCharAt;
            long j18 = i15;
            long j19 = ((long) i16) + j18;
            int length = str.length();
            if (length > i16 || bArr.length - i16 < i15) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i15 + i16));
            }
            int i18 = 0;
            while (true) {
                j15 = 1;
                if (i18 >= length || (cCharAt = str.charAt(i18)) >= 128) {
                    break;
                }
                q1.H(bArr, j18, (byte) cCharAt);
                i18++;
                j18 = 1 + j18;
            }
            if (i18 == length) {
                return (int) j18;
            }
            while (i18 < length) {
                char cCharAt2 = str.charAt(i18);
                if (cCharAt2 < 128 && j18 < j19) {
                    q1.H(bArr, j18, (byte) cCharAt2);
                    j17 = j19;
                    j16 = j15;
                    j18 += j15;
                } else if (cCharAt2 >= 2048 || j18 > j19 - 2) {
                    j16 = j15;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j18 > j19 - 3) {
                        j17 = j19;
                        if (j18 > j17 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i17 = i18 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i17)))) {
                                throw new d(i18, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j18);
                        }
                        int i19 = i18 + 1;
                        if (i19 != length) {
                            char cCharAt3 = str.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                q1.H(bArr, j18, (byte) ((codePoint >>> 18) | 240));
                                q1.H(bArr, j18 + j16, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j25 = j18 + 3;
                                q1.H(bArr, j18 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j18 += 4;
                                q1.H(bArr, j25, (byte) ((codePoint & 63) | 128));
                                i18 = i19;
                            } else {
                                i18 = i19;
                            }
                        }
                        throw new d(i18 - 1, length);
                    }
                    q1.H(bArr, j18, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j26 = j18 + 2;
                    j17 = j19;
                    q1.H(bArr, j18 + j16, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j18 += 3;
                    q1.H(bArr, j26, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j16 = j15;
                    long j27 = j18 + j16;
                    q1.H(bArr, j18, (byte) ((cCharAt2 >>> 6) | 960));
                    j18 += 2;
                    q1.H(bArr, j27, (byte) ((cCharAt2 & '?') | 128));
                    j17 = j19;
                }
                i18++;
                j15 = j16;
                j19 = j17;
            }
            return (int) j18;
        }
    }

    static {
        f12092a = (!e.c() || androidx.datastore.preferences.protobuf.d.c()) ? new c() : new e();
    }

    static String a(byte[] bArr, int i15, int i16) {
        return f12092a.a(bArr, i15, i16);
    }

    static int b(String str, byte[] bArr, int i15, int i16) {
        return f12092a.b(str, bArr, i15, i16);
    }

    static int c(String str) {
        int length = str.length();
        int i15 = 0;
        while (i15 < length && str.charAt(i15) < 128) {
            i15++;
        }
        int iD = length;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt >= 2048) {
                iD += d(str, i15);
                break;
            }
            iD += (127 - cCharAt) >>> 31;
            i15++;
        }
        if (iD >= length) {
            return iD;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iD) + 4294967296L));
    }

    private static int d(String str, int i15) {
        int length = str.length();
        int i16 = 0;
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < 2048) {
                i16 += (127 - cCharAt) >>> 31;
            } else {
                i16 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i15) < 65536) {
                        throw new d(i15, length);
                    }
                    i15++;
                }
            }
            i15++;
        }
        return i16;
    }
}
