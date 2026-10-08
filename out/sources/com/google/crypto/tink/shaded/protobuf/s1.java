package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f36201a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b15, byte b16, byte b17, byte b18, char[] cArr, int i15) throws b0 {
            if (m(b16) || (((b15 << 28) + (b16 + 112)) >> 30) != 0 || m(b17) || m(b18)) {
                throw b0.d();
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
        public static void j(byte b15, byte b16, byte b17, char[] cArr, int i15) throws b0 {
            if (m(b16) || ((b15 == -32 && b16 < -96) || ((b15 == -19 && b16 >= -96) || m(b17)))) {
                throw b0.d();
            }
            cArr[i15] = (char) (((b15 & 15) << 12) | (r(b16) << 6) | r(b17));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b15, byte b16, char[] cArr, int i15) throws b0 {
            if (b15 < -62 || m(b16)) {
                throw b0.d();
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

        abstract int b(CharSequence charSequence, byte[] bArr, int i15, int i16);

        final boolean c(byte[] bArr, int i15, int i16) {
            return d(0, bArr, i15, i16) == 0;
        }

        abstract int d(int i15, byte[] bArr, int i16, int i17);
    }

    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i15, int i16) {
            while (i15 < i16 && bArr[i15] >= 0) {
                i15++;
            }
            if (i15 >= i16) {
                return 0;
            }
            return f(bArr, i15, i16);
        }

        private static int f(byte[] bArr, int i15, int i16) {
            while (i15 < i16) {
                int i17 = i15 + 1;
                byte b15 = bArr[i15];
                if (b15 < 0) {
                    if (b15 < -32) {
                        if (i17 >= i16) {
                            return b15;
                        }
                        if (b15 >= -62) {
                            i15 += 2;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b15 >= -16) {
                        if (i17 >= i16 - 2) {
                            return s1.l(bArr, i17, i16);
                        }
                        int i18 = i15 + 2;
                        byte b16 = bArr[i17];
                        if (b16 <= -65 && (((b15 << 28) + (b16 + 112)) >> 30) == 0) {
                            int i19 = i15 + 3;
                            if (bArr[i18] <= -65) {
                                i15 += 4;
                                if (bArr[i19] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i17 >= i16 - 1) {
                        return s1.l(bArr, i17, i16);
                    }
                    int i25 = i15 + 2;
                    byte b17 = bArr[i17];
                    if (b17 <= -65 && ((b15 != -32 || b17 >= -96) && (b15 != -19 || b17 < -96))) {
                        i15 += 3;
                        if (bArr[i25] > -65) {
                        }
                    }
                    return -1;
                }
                i15 = i17;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        String a(byte[] bArr, int i15, int i16) throws b0 {
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
                        throw b0.d();
                    }
                    i15 += 2;
                    a.k(b16, bArr[i25], cArr, i19);
                    i19++;
                } else if (a.o(b16)) {
                    if (i25 >= i17 - 1) {
                        throw b0.d();
                    }
                    int i28 = i15 + 2;
                    i15 += 3;
                    a.j(b16, bArr[i25], bArr[i28], cArr, i19);
                    i19++;
                } else {
                    if (i25 >= i17 - 2) {
                        throw b0.d();
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

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        int b(CharSequence charSequence, byte[] bArr, int i15, int i16) {
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
                                throw new d(i25, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i26);
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

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.s1.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.s1.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.s1.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s1.c.d(int, byte[], int, int):int");
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

        static boolean e() {
            return r1.E() && r1.F();
        }

        private static int f(byte[] bArr, long j15, int i15) {
            int iG = g(bArr, j15, i15);
            int i16 = i15 - iG;
            long j16 = j15 + ((long) iG);
            while (true) {
                byte bU = 0;
                while (i16 > 0) {
                    long j17 = j16 + 1;
                    bU = r1.u(bArr, j16);
                    if (bU < 0) {
                        j16 = j17;
                        break;
                    }
                    i16--;
                    j16 = j17;
                }
                if (i16 == 0) {
                    return 0;
                }
                int i17 = i16 - 1;
                if (bU < -32) {
                    if (i17 == 0) {
                        return bU;
                    }
                    i16 -= 2;
                    if (bU >= -62) {
                        long j18 = 1 + j16;
                        if (r1.u(bArr, j16) <= -65) {
                            j16 = j18;
                        }
                    }
                    return -1;
                }
                if (bU >= -16) {
                    if (i17 < 3) {
                        return h(bArr, bU, j16, i17);
                    }
                    i16 -= 4;
                    long j19 = 1 + j16;
                    byte bU2 = r1.u(bArr, j16);
                    if (bU2 <= -65 && (((bU << 28) + (bU2 + 112)) >> 30) == 0) {
                        long j25 = 2 + j16;
                        if (r1.u(bArr, j19) <= -65) {
                            j16 += 3;
                            if (r1.u(bArr, j25) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i17 < 2) {
                    return h(bArr, bU, j16, i17);
                }
                i16 -= 3;
                long j26 = 1 + j16;
                byte bU3 = r1.u(bArr, j16);
                if (bU3 <= -65 && ((bU != -32 || bU3 >= -96) && (bU != -19 || bU3 < -96))) {
                    j16 += 2;
                    if (r1.u(bArr, j26) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int g(byte[] bArr, long j15, int i15) {
            int i16 = 0;
            if (i15 < 16) {
                return 0;
            }
            int i17 = 8 - (((int) j15) & 7);
            while (i16 < i17) {
                long j16 = 1 + j15;
                if (r1.u(bArr, j15) < 0) {
                    return i16;
                }
                i16++;
                j15 = j16;
            }
            while (true) {
                int i18 = i16 + 8;
                if (i18 > i15 || (r1.A(bArr, r1.f36182h + j15) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j15 += 8;
                i16 = i18;
            }
            while (i16 < i15) {
                long j17 = j15 + 1;
                if (r1.u(bArr, j15) < 0) {
                    return i16;
                }
                i16++;
                j15 = j17;
            }
            return i15;
        }

        private static int h(byte[] bArr, int i15, long j15, int i16) {
            if (i16 == 0) {
                return s1.i(i15);
            }
            if (i16 == 1) {
                return s1.j(i15, r1.u(bArr, j15));
            }
            if (i16 == 2) {
                return s1.k(i15, r1.u(bArr, j15), r1.u(bArr, j15 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        String a(byte[] bArr, int i15, int i16) throws b0 {
            Charset charset = a0.f36000b;
            String str = new String(bArr, i15, i16, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i15, i16 + i15))) {
                throw b0.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        int b(CharSequence charSequence, byte[] bArr, int i15, int i16) {
            long j15;
            long j16;
            long j17;
            int i17;
            char cCharAt;
            long j18 = i15;
            long j19 = ((long) i16) + j18;
            int length = charSequence.length();
            if (length > i16 || bArr.length - i16 < i15) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i15 + i16));
            }
            int i18 = 0;
            while (true) {
                j15 = 1;
                if (i18 >= length || (cCharAt = charSequence.charAt(i18)) >= 128) {
                    break;
                }
                r1.K(bArr, j18, (byte) cCharAt);
                i18++;
                j18 = 1 + j18;
            }
            if (i18 == length) {
                return (int) j18;
            }
            while (i18 < length) {
                char cCharAt2 = charSequence.charAt(i18);
                if (cCharAt2 < 128 && j18 < j19) {
                    r1.K(bArr, j18, (byte) cCharAt2);
                    j17 = j19;
                    j16 = j15;
                    j18 += j15;
                } else if (cCharAt2 >= 2048 || j18 > j19 - 2) {
                    j16 = j15;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j18 > j19 - 3) {
                        j17 = j19;
                        if (j18 > j17 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i17 = i18 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i17)))) {
                                throw new d(i18, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j18);
                        }
                        int i19 = i18 + 1;
                        if (i19 != length) {
                            char cCharAt3 = charSequence.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                r1.K(bArr, j18, (byte) ((codePoint >>> 18) | 240));
                                r1.K(bArr, j18 + j16, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j25 = j18 + 3;
                                r1.K(bArr, j18 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j18 += 4;
                                r1.K(bArr, j25, (byte) ((codePoint & 63) | 128));
                                i18 = i19;
                            } else {
                                i18 = i19;
                            }
                        }
                        throw new d(i18 - 1, length);
                    }
                    r1.K(bArr, j18, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j26 = j18 + 2;
                    j17 = j19;
                    r1.K(bArr, j18 + j16, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j18 += 3;
                    r1.K(bArr, j26, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j16 = j15;
                    long j27 = j18 + j16;
                    r1.K(bArr, j18, (byte) ((cCharAt2 >>> 6) | 960));
                    j18 += 2;
                    r1.K(bArr, j27, (byte) ((cCharAt2 & '?') | 128));
                    j17 = j19;
                }
                i18++;
                j15 = j16;
                j19 = j17;
            }
            return (int) j18;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int d(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = com.google.crypto.tink.shaded.protobuf.s1.a(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = com.google.crypto.tink.shaded.protobuf.s1.a(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = com.google.crypto.tink.shaded.protobuf.s1.b(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.r1.u(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = f(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.s1.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f36201a = (!e.e() || com.google.crypto.tink.shaded.protobuf.d.c()) ? new c() : new e();
    }

    static String e(byte[] bArr, int i15, int i16) {
        return f36201a.a(bArr, i15, i16);
    }

    static int f(CharSequence charSequence, byte[] bArr, int i15, int i16) {
        return f36201a.b(charSequence, bArr, i15, i16);
    }

    static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i15 = 0;
        while (i15 < length && charSequence.charAt(i15) < 128) {
            i15++;
        }
        int iH = length;
        while (i15 < length) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt >= 2048) {
                iH += h(charSequence, i15);
                break;
            }
            iH += (127 - cCharAt) >>> 31;
            i15++;
        }
        if (iH >= length) {
            return iH;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iH) + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i15) {
        int length = charSequence.length();
        int i16 = 0;
        while (i15 < length) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt < 2048) {
                i16 += (127 - cCharAt) >>> 31;
            } else {
                i16 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i15) < 65536) {
                        throw new d(i15, length);
                    }
                    i15++;
                }
            }
            i15++;
        }
        return i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i15) {
        if (i15 > -12) {
            return -1;
        }
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i15, int i16) {
        if (i15 > -12 || i16 > -65) {
            return -1;
        }
        return i15 ^ (i16 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i15, int i16, int i17) {
        if (i15 > -12 || i16 > -65 || i17 > -65) {
            return -1;
        }
        return (i15 ^ (i16 << 8)) ^ (i17 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i15, int i16) {
        byte b15 = bArr[i15 - 1];
        int i17 = i16 - i15;
        if (i17 == 0) {
            return i(b15);
        }
        if (i17 == 1) {
            return j(b15, bArr[i15]);
        }
        if (i17 == 2) {
            return k(b15, bArr[i15], bArr[i15 + 1]);
        }
        throw new AssertionError();
    }

    static boolean m(byte[] bArr) {
        return f36201a.c(bArr, 0, bArr.length);
    }

    static boolean n(byte[] bArr, int i15, int i16) {
        return f36201a.c(bArr, i15, i16);
    }
}
