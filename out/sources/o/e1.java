package o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f139951a = 3;

    public static void a(String str, String str2) {
        i(n(str), 3);
    }

    public static void b(String str, String str2, Throwable th4) {
        i(n(str), 3);
    }

    public static void c(String str, String str2) {
        String strN = n(str);
        if (i(strN, 6)) {
            io.sentry.android.core.c2.e(strN, str2);
        }
    }

    public static void d(String str, String str2, Throwable th4) {
        String strN = n(str);
        if (i(strN, 6)) {
            io.sentry.android.core.c2.f(strN, str2, th4);
        }
    }

    public static void e(String str, String str2) {
        i(n(str), 4);
    }

    public static boolean f(String str) {
        return i(n(str), 3);
    }

    public static boolean g(String str) {
        return i(n(str), 6);
    }

    public static boolean h(String str) {
        return i(n(str), 4);
    }

    private static boolean i(String str, int i15) {
        return f139951a <= i15 || Log.isLoggable(str, i15);
    }

    public static boolean j(String str) {
        return i(n(str), 2);
    }

    public static boolean k(String str) {
        return i(n(str), 5);
    }

    static void l() {
        f139951a = 3;
    }

    static void m(int i15) {
        f139951a = i15;
    }

    private static String n(String str) {
        return str;
    }

    public static void o(String str, String str2) {
        String strN = n(str);
        if (i(strN, 5)) {
            io.sentry.android.core.c2.g(strN, str2);
        }
    }

    public static void p(String str, String str2, Throwable th4) {
        String strN = n(str);
        if (i(strN, 5)) {
            io.sentry.android.core.c2.h(strN, str2, th4);
        }
    }
}
