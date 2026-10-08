package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f95829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f95830b;

    static {
        try {
            f95829a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f95829a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f95830b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f95830b = false;
            }
        } catch (Throwable unused2) {
            f95830b = false;
        }
    }

    public static boolean a() {
        return f95829a;
    }

    public static boolean b() {
        return f95830b;
    }

    public static boolean c() {
        return !f95829a;
    }
}
