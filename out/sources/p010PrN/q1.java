package p010PrN;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class q1 {
    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, v1.f960a);
    }

    private static boolean b(Context context, String str, int i15) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i15)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i15) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i15)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i15) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i15)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, v1.f963d);
    }

    static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, v1.f964e);
    }

    static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, v1.f962c) || c(context, str2, v1.f961b);
    }
}
