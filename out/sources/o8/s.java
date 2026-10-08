package o8;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static void a(boolean z15, String str) throws t7.x {
        if (!z15) {
            throw t7.x.a(str, null);
        }
    }

    public static int b(int i15) {
        if (i15 == 20) {
            return 63750;
        }
        if (i15 == 30) {
            return 2250000;
        }
        switch (i15) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i15) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(q qVar, byte[] bArr, int i15, int i16, boolean z15) throws EOFException {
        try {
            return qVar.e(bArr, i15, i16, z15);
        } catch (EOFException e15) {
            if (z15) {
                return false;
            }
            throw e15;
        }
    }

    public static int d(q qVar, byte[] bArr, int i15, int i16) {
        int i17 = 0;
        while (i17 < i16) {
            int iL = qVar.l(bArr, i15 + i17, i16 - i17);
            if (iL == -1) {
                break;
            }
            i17 += iL;
        }
        return i17;
    }

    public static boolean e(q qVar, byte[] bArr, int i15, int i16) {
        try {
            qVar.readFully(bArr, i15, i16);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(q qVar, int i15) {
        try {
            qVar.n(i15);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
