package vd;

import android.os.SystemClock;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f206223a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f206224b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f206225c = v.class.getName();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f206226c = v.f206224b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C5388a> f206227a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f206228b = false;

        /* JADX INFO: renamed from: vd.v$a$a, reason: collision with other inner class name */
        private static class C5388a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f206229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f206230b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f206231c;

            public C5388a(String str, long j15, long j16) {
                this.f206229a = str;
                this.f206230b = j15;
                this.f206231c = j16;
            }
        }

        a() {
        }

        private long c() {
            if (this.f206227a.size() == 0) {
                return 0L;
            }
            long j15 = this.f206227a.get(0).f206231c;
            List<C5388a> list = this.f206227a;
            return list.get(list.size() - 1).f206231c - j15;
        }

        public synchronized void a(String str, long j15) {
            if (this.f206228b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f206227a.add(new C5388a(str, j15, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f206228b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j15 = this.f206227a.get(0).f206231c;
            v.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C5388a c5388a : this.f206227a) {
                long j16 = c5388a.f206231c;
                v.b("(+%-4d) [%2d] %s", Long.valueOf(j16 - j15), Long.valueOf(c5388a.f206230b), c5388a.f206229a);
                j15 = j16;
            }
        }

        protected void finalize() {
            if (this.f206228b) {
                return;
            }
            b("Request on the loose");
            v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i15 = 2; i15 < stackTrace.length; i15++) {
            if (!stackTrace[i15].getClassName().equals(f206225c)) {
                String className = stackTrace[i15].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i15].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        c2.e(f206223a, a(str, objArr));
    }

    public static void d(Throwable th4, String str, Object... objArr) {
        c2.f(f206223a, a(str, objArr), th4);
    }

    public static void e(String str, Object... objArr) {
        if (f206224b) {
            a(str, objArr);
        }
    }

    public static void f(String str, Object... objArr) {
        c2.j(f206223a, a(str, objArr));
    }
}
