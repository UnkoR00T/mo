package ef;

import android.util.Log;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(d(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (Log.isLoggable(d(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void c(String str, String str2, Throwable th4) {
        String strD = d(str);
        if (Log.isLoggable(strD, 6)) {
            c2.f(strD, str2, th4);
        }
    }

    private static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        if (Log.isLoggable(d(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void f(String str, String str2, Object obj) {
        String strD = d(str);
        if (Log.isLoggable(strD, 5)) {
            c2.g(strD, String.format(str2, obj));
        }
    }
}
