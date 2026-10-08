package w7;

import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.c2;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f210771b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f210772c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f210770a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f210773d = a.f210774a;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f210774a = new C5537a();

        /* JADX INFO: renamed from: w7.t$a$a, reason: collision with other inner class name */
        class C5537a implements a {
            C5537a() {
            }

            @Override // w7.t.a
            public void a(String str, String str2, Throwable th4) {
                t.a(str2, th4);
            }

            @Override // w7.t.a
            public void b(String str, String str2, Throwable th4) {
                c2.g(str, t.a(str2, th4));
            }

            @Override // w7.t.a
            public void c(String str, String str2, Throwable th4) {
                c2.e(str, t.a(str2, th4));
            }

            @Override // w7.t.a
            public void d(String str, String str2, Throwable th4) {
                t.a(str2, th4);
            }
        }

        void a(String str, String str2, Throwable th4);

        void b(String str, String str2, Throwable th4);

        void c(String str, String str2, Throwable th4);

        void d(String str, String str2, Throwable th4);
    }

    public static String a(String str, Throwable th4) {
        String strE = e(th4);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f210770a) {
            try {
                if (f210771b == 0) {
                    f210773d.a(str, str2, null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f210770a) {
            try {
                if (f210771b <= 3) {
                    f210773d.c(str, str2, null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static void d(String str, String str2, Throwable th4) {
        synchronized (f210770a) {
            try {
                if (f210771b <= 3) {
                    f210773d.c(str, str2, th4);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public static String e(Throwable th4) {
        if (th4 == null) {
            return null;
        }
        synchronized (f210770a) {
            try {
                if (g(th4)) {
                    return "UnknownHostException (no network)";
                }
                if (f210772c) {
                    return Log.getStackTraceString(th4).trim().replace("\t", "    ");
                }
                return th4.getMessage();
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f210770a) {
            try {
                if (f210771b <= 1) {
                    f210773d.d(str, str2, null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static boolean g(Throwable th4) {
        while (th4 != null) {
            if (th4 instanceof UnknownHostException) {
                return true;
            }
            th4 = th4.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f210770a) {
            try {
                if (f210771b <= 2) {
                    f210773d.b(str, str2, null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static void i(String str, String str2, Throwable th4) {
        synchronized (f210770a) {
            try {
                if (f210771b <= 2) {
                    f210773d.b(str, str2, th4);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
