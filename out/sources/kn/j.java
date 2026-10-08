package kn;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static int a(CharSequence charSequence, int i15) {
        int length = charSequence.length();
        int i16 = i15;
        while (i16 < length && f(charSequence.charAt(i16))) {
            i16++;
        }
        return i16 - i15;
    }

    public static String b(String str, m mVar, en.b bVar, en.b bVar2, boolean z15) {
        c cVar = new c();
        int iE = 0;
        g[] gVarArr = {new a(), cVar, new n(), new o(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(mVar);
        hVar.l(bVar, bVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 236);
            hVar.m(2);
            hVar.f111469f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 237);
            hVar.m(2);
            hVar.f111469f += 7;
        }
        if (z15) {
            cVar.d(hVar);
            iE = hVar.e();
            hVar.j();
        }
        while (hVar.i()) {
            gVarArr[iE].a(hVar);
            if (hVar.e() >= 0) {
                iE = hVar.e();
                hVar.j();
            }
        }
        int iA = hVar.a();
        hVar.p();
        int iA2 = hVar.g().a();
        if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
            hVar.r((char) 254);
        }
        StringBuilder sbB = hVar.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(r(sbB.length() + 1));
        }
        return hVar.b().toString();
    }

    private static int c(float[] fArr, int[] iArr, int i15, byte[] bArr) {
        for (int i16 = 0; i16 < 6; i16++) {
            int iCeil = (int) Math.ceil(fArr[i16]);
            iArr[i16] = iCeil;
            if (i15 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i15 = iCeil;
            }
            if (i15 == iCeil) {
                bArr[i16] = (byte) (bArr[i16] + 1);
            }
        }
        return i15;
    }

    private static int d(byte[] bArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 6; i16++) {
            i15 += bArr[i16];
        }
        return i15;
    }

    static void e(char c15) {
        String hexString = Integer.toHexString(c15);
        throw new IllegalArgumentException("Illegal character: " + c15 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean f(char c15) {
        return c15 >= '0' && c15 <= '9';
    }

    static boolean g(char c15) {
        return c15 >= 128 && c15 <= 255;
    }

    static boolean h(char c15) {
        if (c15 == ' ') {
            return true;
        }
        if (c15 < '0' || c15 > '9') {
            return c15 >= 'A' && c15 <= 'Z';
        }
        return true;
    }

    static boolean i(char c15) {
        return c15 >= ' ' && c15 <= '^';
    }

    static boolean j(char c15) {
        if (c15 == ' ') {
            return true;
        }
        if (c15 < '0' || c15 > '9') {
            return c15 >= 'a' && c15 <= 'z';
        }
        return true;
    }

    static boolean k(char c15) {
        if (m(c15) || c15 == ' ') {
            return true;
        }
        if (c15 < '0' || c15 > '9') {
            return c15 >= 'A' && c15 <= 'Z';
        }
        return true;
    }

    private static boolean l(char c15) {
        return false;
    }

    private static boolean m(char c15) {
        return c15 == '\r' || c15 == '*' || c15 == '>';
    }

    static int n(CharSequence charSequence, int i15, int i16) {
        int iO = o(charSequence, i15, i16);
        if (i16 == 3 && iO == 3) {
            int iMin = Math.min(i15 + 3, charSequence.length());
            while (i15 < iMin) {
                if (!k(charSequence.charAt(i15))) {
                    return 0;
                }
                i15++;
            }
        } else if (i16 == 4 && iO == 4) {
            int iMin2 = Math.min(i15 + 4, charSequence.length());
            while (i15 < iMin2) {
                if (!i(charSequence.charAt(i15))) {
                    return 0;
                }
                i15++;
            }
        }
        return iO;
    }

    static int o(CharSequence charSequence, int i15, int i16) {
        float[] fArr;
        float f15;
        int i17;
        if (i15 >= charSequence.length()) {
            return i16;
        }
        float f16 = 2.0f;
        float f17 = 1.0f;
        int i18 = 5;
        int i19 = 2;
        if (i16 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i16] = 0.0f;
        }
        byte[] bArr = new byte[6];
        int[] iArr = new int[6];
        int i25 = 0;
        while (true) {
            int i26 = i15 + i25;
            float f18 = f16;
            if (i26 == charSequence.length()) {
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(iArr, 0);
                int iC = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iD = d(bArr);
                if (iArr[0] == iC) {
                    return 0;
                }
                if (iD == 1) {
                    if (bArr[i18] > 0) {
                        return i18;
                    }
                    if (bArr[4] > 0) {
                        return 4;
                    }
                    if (bArr[i19] > 0) {
                        return i19;
                    }
                    if (bArr[3] > 0) {
                        return 3;
                    }
                }
                return 1;
            }
            char cCharAt = charSequence.charAt(i26);
            i25++;
            if (f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f15 = f17;
            } else if (g(cCharAt)) {
                f15 = f17;
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f18;
            } else {
                f15 = f17;
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f15;
            }
            if (h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(cCharAt)) {
                fArr[i19] = fArr[i19] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[i19] = fArr[i19] + 2.6666667f;
            } else {
                fArr[i19] = fArr[i19] + 1.3333334f;
            }
            if (k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(cCharAt)) {
                fArr[i18] = fArr[i18] + 4.0f;
            } else {
                fArr[i18] = fArr[i18] + f15;
            }
            if (i25 >= 4) {
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(iArr, 0);
                c(fArr, iArr, Integer.MAX_VALUE, bArr);
                i17 = i19;
                if (iArr[0] < q(iArr[i18], iArr[1], iArr[i19], iArr[3], iArr[4])) {
                    return 0;
                }
                int i27 = iArr[i18];
                if (i27 < iArr[0] || i27 + 1 < p(iArr[1], iArr[i17], iArr[3], iArr[4])) {
                    return i18;
                }
                if (iArr[4] + 1 < q(iArr[i18], iArr[1], iArr[i17], iArr[3], iArr[0])) {
                    return 4;
                }
                if (iArr[i17] + 1 < q(iArr[i18], iArr[1], iArr[4], iArr[3], iArr[0])) {
                    return i17;
                }
                if (iArr[3] + 1 < q(iArr[i18], iArr[1], iArr[4], iArr[i17], iArr[0])) {
                    return 3;
                }
                if (iArr[1] + 1 >= p(iArr[0], iArr[i18], iArr[4], iArr[i17])) {
                    continue;
                } else {
                    int i28 = iArr[1];
                    int i29 = iArr[3];
                    if (i28 < i29) {
                        return 1;
                    }
                    if (i28 == i29) {
                        for (int i35 = i15 + i25 + 1; i35 < charSequence.length(); i35++) {
                            char cCharAt2 = charSequence.charAt(i35);
                            if (m(cCharAt2)) {
                                return 3;
                            }
                            if (!k(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            } else {
                i17 = i19;
            }
            f16 = f18;
            f17 = f15;
            i18 = i18;
            i19 = i17;
        }
    }

    private static int p(int i15, int i16, int i17, int i18) {
        return Math.min(i15, Math.min(i16, Math.min(i17, i18)));
    }

    private static int q(int i15, int i16, int i17, int i18, int i19) {
        return Math.min(p(i15, i16, i17, i18), i19);
    }

    private static char r(int i15) {
        int i16 = (i15 * 149) % 253;
        int i17 = i16 + 130;
        if (i17 > 254) {
            i17 = i16 - 124;
        }
        return (char) i17;
    }
}
