package io.sentry.util;

import io.sentry.b9;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {
    public static b9 a(b9 b9Var) {
        if (b9Var.c() != null) {
            return b9Var;
        }
        return new b9(b9Var.e(), b9Var.d(), b(null, b9Var.d(), b9Var.e()), b9Var.b(), b9Var.a());
    }

    public static Double b(Double d15, Double d16, Boolean bool) {
        if (d15 != null) {
            return d15;
        }
        double dC = b0.a().c();
        if (d16 == null || bool == null) {
            return Double.valueOf(dC);
        }
        return bool.booleanValue() ? Double.valueOf(dC * d16.doubleValue()) : Double.valueOf(d16.doubleValue() + (dC * (1.0d - d16.doubleValue())));
    }

    public static boolean c(Double d15) {
        return e(d15, true);
    }

    public static boolean d(Double d15) {
        return e(d15, true);
    }

    private static boolean e(Double d15, boolean z15) {
        if (d15 == null) {
            return z15;
        }
        return !d15.isNaN() && d15.doubleValue() >= 0.0d && d15.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d15) {
        return e(d15, true);
    }

    public static boolean g(Double d15) {
        return h(d15, true);
    }

    public static boolean h(Double d15, boolean z15) {
        return e(d15, z15);
    }
}
