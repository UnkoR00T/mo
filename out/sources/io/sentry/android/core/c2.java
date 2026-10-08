package io.sentry.android.core;

import android.util.Log;
import io.sentry.b7;
import io.sentry.d5;
import io.sentry.g7;
import io.sentry.r4;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 {
    private static void a(String str, b7 b7Var, String str2) {
        b(str, b7Var, str2, null);
    }

    private static void b(String str, b7 b7Var, String str2, Throwable th4) {
        io.sentry.f fVar = new io.sentry.f();
        fVar.z("Logcat");
        fVar.D(str2);
        fVar.B(b7Var);
        if (str != null) {
            fVar.A("tag", str);
        }
        if (th4 != null && th4.getMessage() != null) {
            fVar.A("throwable", th4.getMessage());
        }
        d5.e(fVar);
    }

    private static void c(String str, b7 b7Var, Throwable th4) {
        b(str, b7Var, null, th4);
    }

    private static void d(g7 g7Var, String str, Throwable th4) {
        r4 r4VarB = r4.b();
        if (r4VarB.s().getLogs().b()) {
            String message = th4 != null ? th4.getMessage() : null;
            io.sentry.logger.h hVar = new io.sentry.logger.h();
            hVar.d("auto.log.logcat");
            if (th4 == null || message == null) {
                r4VarB.L().a(g7Var, hVar, str, new Object[0]);
                return;
            }
            io.sentry.logger.a aVarL = r4VarB.L();
            if (str != null) {
                message = str + "\n" + message;
            }
            aVarL.a(g7Var, hVar, message, new Object[0]);
        }
    }

    public static int e(String str, String str2) {
        a(str, b7.ERROR, str2);
        d(g7.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int f(String str, String str2, Throwable th4) {
        b(str, b7.ERROR, str2, th4);
        d(g7.ERROR, str2, th4);
        return Log.e(str, str2, th4);
    }

    public static int g(String str, String str2) {
        a(str, b7.WARNING, str2);
        d(g7.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static int h(String str, String str2, Throwable th4) {
        b(str, b7.WARNING, str2, th4);
        d(g7.WARN, str2, th4);
        return Log.w(str, str2, th4);
    }

    public static int i(String str, Throwable th4) {
        c(str, b7.WARNING, th4);
        d(g7.WARN, null, th4);
        return Log.w(str, th4);
    }

    public static int j(String str, String str2) {
        a(str, b7.ERROR, str2);
        d(g7.FATAL, str2, null);
        return Log.wtf(str, str2);
    }

    public static int k(String str, String str2, Throwable th4) {
        b(str, b7.ERROR, str2, th4);
        d(g7.FATAL, str2, th4);
        return Log.wtf(str, str2, th4);
    }

    public static int l(String str, Throwable th4) {
        c(str, b7.ERROR, th4);
        d(g7.FATAL, null, th4);
        return Log.wtf(str, th4);
    }
}
