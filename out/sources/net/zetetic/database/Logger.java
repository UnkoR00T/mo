package net.zetetic.database;

/* JADX INFO: loaded from: classes3.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LogTarget f135367a;

    static {
        g(new LogcatTarget());
    }

    public static void a(String str, String str2) {
        d().b(3, str, str2, null);
    }

    public static void b(String str, String str2) {
        d().b(6, str, str2, null);
    }

    public static void c(String str, String str2, Throwable th4) {
        d().b(6, str, str2, th4);
    }

    private static LogTarget d() {
        if (f135367a == null) {
            g(new NoopTarget());
        }
        return f135367a;
    }

    public static void e(String str, String str2) {
        d().b(4, str, str2, null);
    }

    public static boolean f(String str, int i15) {
        return d().a(str, i15);
    }

    public static void g(LogTarget logTarget) {
        f135367a = logTarget;
    }

    public static void h(String str, String str2) {
        d().b(5, str, str2, null);
    }

    public static void i(String str, String str2, Throwable th4) {
        d().b(5, str, str2, th4);
    }
}
