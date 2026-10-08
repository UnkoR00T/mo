package i6;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f89697a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f89698b = new char[24];

    private static int a(int i15, int i16, boolean z15, int i17) {
        if (i15 > 99 || (z15 && i17 >= 3)) {
            return i16 + 3;
        }
        if (i15 > 9 || (z15 && i17 >= 2)) {
            return i16 + 2;
        }
        if (z15 || i15 > 0) {
            return i16 + 1;
        }
        return 0;
    }

    public static void b(long j15, long j16, PrintWriter printWriter) {
        if (j15 == 0) {
            printWriter.print("--");
        } else {
            d(j15 - j16, printWriter, 0);
        }
    }

    public static void c(long j15, PrintWriter printWriter) {
        d(j15, printWriter, 0);
    }

    public static void d(long j15, PrintWriter printWriter, int i15) {
        synchronized (f89697a) {
            printWriter.print(new String(f89698b, 0, e(j15, i15)));
        }
    }

    private static int e(long j15, int i15) {
        char c15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j16 = j15;
        if (f89698b.length < i15) {
            f89698b = new char[i15];
        }
        char[] cArr = f89698b;
        if (j16 == 0) {
            int i25 = i15 - 1;
            while (i25 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j16 > 0) {
            c15 = '+';
        } else {
            j16 = -j16;
            c15 = '-';
        }
        int i26 = (int) (j16 % 1000);
        int iFloor = (int) Math.floor(j16 / 1000);
        if (iFloor > 86400) {
            i16 = iFloor / 86400;
            iFloor -= 86400 * i16;
        } else {
            i16 = 0;
        }
        if (iFloor > 3600) {
            i17 = iFloor / 3600;
            iFloor -= i17 * 3600;
        } else {
            i17 = 0;
        }
        if (iFloor > 60) {
            int i27 = iFloor / 60;
            iFloor -= i27 * 60;
            i18 = i27;
        } else {
            i18 = 0;
        }
        if (i15 != 0) {
            int iA = a(i16, 1, false, 0);
            int iA2 = iA + a(i17, 1, iA > 0, 2);
            int iA3 = iA2 + a(i18, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(iFloor, 1, iA3 > 0, 2);
            i19 = 0;
            for (int iA5 = iA4 + a(i26, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i15; iA5++) {
                cArr[i19] = ' ';
                i19++;
            }
        } else {
            i19 = 0;
        }
        cArr[i19] = c15;
        int i28 = i19 + 1;
        boolean z15 = i15 != 0;
        int iF = f(cArr, i16, 'd', i28, false, 0);
        int iF2 = f(cArr, i17, 'h', iF, iF != i28, z15 ? 2 : 0);
        int iF3 = f(cArr, i18, 'm', iF2, iF2 != i28, z15 ? 2 : 0);
        int iF4 = f(cArr, iFloor, 's', iF3, iF3 != i28, z15 ? 2 : 0);
        int iF5 = f(cArr, i26, 'm', iF4, true, (!z15 || iF4 == i28) ? 0 : 3);
        cArr[iF5] = 's';
        return iF5 + 1;
    }

    private static int f(char[] cArr, int i15, char c15, int i16, boolean z15, int i17) {
        int i18;
        if (!z15 && i15 <= 0) {
            return i16;
        }
        if ((!z15 || i17 < 3) && i15 <= 99) {
            i18 = i16;
        } else {
            int i19 = i15 / 100;
            cArr[i16] = (char) (i19 + 48);
            i18 = i16 + 1;
            i15 -= i19 * 100;
        }
        if ((z15 && i17 >= 2) || i15 > 9 || i16 != i18) {
            int i25 = i15 / 10;
            cArr[i18] = (char) (i25 + 48);
            i18++;
            i15 -= i25 * 10;
        }
        cArr[i18] = (char) (i15 + 48);
        cArr[i18 + 1] = c15;
        return i18 + 2;
    }
}
