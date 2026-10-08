package c8;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
final class y0 {
    public static boolean a(int i15) {
        if (i15 == 8 || i15 == 7) {
            return true;
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 < 31 || !(i15 == 26 || i15 == 27)) {
            return i16 >= 33 && i15 == 30;
        }
        return true;
    }

    public static boolean b(int i15) {
        return i15 == 1;
    }

    public static boolean c(int i15) {
        return i15 == 2;
    }

    public static boolean d(int i15) {
        return i15 == 10;
    }

    public static boolean e(int i15) {
        return Build.VERSION.SDK_INT >= 31 && i15 == 29;
    }

    public static boolean f(int i15) {
        if (i15 == 11 || i15 == 12) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && i15 == 22;
    }
}
