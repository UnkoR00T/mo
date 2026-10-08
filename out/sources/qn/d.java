package qn;

/* JADX INFO: loaded from: classes4.dex */
final class d {
    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z15) {
        int iD = z15 ? bVar.d() : bVar.e();
        int iE = z15 ? bVar.e() : bVar.d();
        byte[][] bArrC = bVar.c();
        int i15 = 0;
        for (int i16 = 0; i16 < iD; i16++) {
            byte b15 = -1;
            int i17 = 0;
            for (int i18 = 0; i18 < iE; i18++) {
                byte b16 = z15 ? bArrC[i16][i18] : bArrC[i18][i16];
                if (b16 == b15) {
                    i17++;
                } else {
                    if (i17 >= 5) {
                        i15 += i17 - 2;
                    }
                    i17 = 1;
                    b15 = b16;
                }
            }
            if (i17 >= 5) {
                i15 += i17 - 2;
            }
        }
        return i15;
    }

    static int c(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i15 = 0;
        for (int i16 = 0; i16 < iD - 1; i16++) {
            byte[] bArr = bArrC[i16];
            int i17 = 0;
            while (i17 < iE - 1) {
                byte b15 = bArr[i17];
                int i18 = i17 + 1;
                if (b15 == bArr[i18]) {
                    byte[] bArr2 = bArrC[i16 + 1];
                    if (b15 == bArr2[i17] && b15 == bArr2[i18]) {
                        i15++;
                    }
                }
                i17 = i18;
            }
        }
        return i15 * 3;
    }

    static int d(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i15 = 0;
        for (int i16 = 0; i16 < iD; i16++) {
            for (int i17 = 0; i17 < iE; i17++) {
                byte[] bArr = bArrC[i16];
                int i18 = i17 + 6;
                if (i18 < iE && bArr[i17] == 1 && bArr[i17 + 1] == 0 && bArr[i17 + 2] == 1 && bArr[i17 + 3] == 1 && bArr[i17 + 4] == 1 && bArr[i17 + 5] == 0 && bArr[i18] == 1 && (g(bArr, i17 - 4, i17) || g(bArr, i17 + 7, i17 + 11))) {
                    i15++;
                }
                int i19 = i16 + 6;
                if (i19 < iD && bArrC[i16][i17] == 1 && bArrC[i16 + 1][i17] == 0 && bArrC[i16 + 2][i17] == 1 && bArrC[i16 + 3][i17] == 1 && bArrC[i16 + 4][i17] == 1 && bArrC[i16 + 5][i17] == 0 && bArrC[i19][i17] == 1 && (h(bArrC, i17, i16 - 4, i16) || h(bArrC, i17, i16 + 7, i16 + 11))) {
                    i15++;
                }
            }
        }
        return i15 * 40;
    }

    static int e(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i15 = 0;
        for (int i16 = 0; i16 < iD; i16++) {
            byte[] bArr = bArrC[i16];
            for (int i17 = 0; i17 < iE; i17++) {
                if (bArr[i17] == 1) {
                    i15++;
                }
            }
        }
        int iD2 = bVar.d() * bVar.e();
        return ((Math.abs((i15 * 2) - iD2) * 10) / iD2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    static boolean f(int i15, int i16, int i17) {
        int i18;
        int i19;
        switch (i15) {
            case 0:
                i17 += i16;
                i18 = i17 & 1;
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 1:
                i18 = i17 & 1;
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 2:
                i18 = i16 % 3;
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 3:
                i18 = (i17 + i16) % 3;
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 4:
                i17 /= 2;
                i16 /= 3;
                i17 += i16;
                i18 = i17 & 1;
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i25 = i17 * i16;
                i18 = (i25 & 1) + (i25 % 3);
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i26 = i17 * i16;
                i19 = (i26 & 1) + (i26 % 3);
                i18 = i19 & 1;
                if (i18 == 0) {
                    return true;
                }
                return false;
            case 7:
                i19 = ((i17 * i16) % 3) + ((i17 + i16) & 1);
                i18 = i19 & 1;
                if (i18 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i15);
        }
    }

    private static boolean g(byte[] bArr, int i15, int i16) {
        if (i15 < 0 || bArr.length < i16) {
            return false;
        }
        while (i15 < i16) {
            if (bArr[i15] == 1) {
                return false;
            }
            i15++;
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i15, int i16, int i17) {
        if (i16 < 0 || bArr.length < i17) {
            return false;
        }
        while (i16 < i17) {
            if (bArr[i16][i15] == 1) {
                return false;
            }
            i16++;
        }
        return true;
    }
}
