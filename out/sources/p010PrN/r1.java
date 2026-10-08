package p010PrN;

import android.content.Context;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes.dex */
class r1 {
    static String a(Context context, int i15) {
        if (context == null) {
            return "";
        }
        if (i15 == 1) {
            return context.getString(a2.f863d);
        }
        if (i15 != 7) {
            switch (i15) {
                case 9:
                    break;
                case 10:
                    return context.getString(a2.f867h);
                case 11:
                    return context.getString(a2.f866g);
                case 12:
                    return context.getString(a2.f864e);
                default:
                    c2.e("BiometricUtils", "Unknown error code: " + i15);
                    return context.getString(a2.f861b);
            }
        }
        return context.getString(a2.f865f);
    }

    static boolean b(int i15) {
        switch (i15) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    static boolean c(int i15) {
        return i15 == 7 || i15 == 9;
    }
}
