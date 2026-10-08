package jg;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static void a(boolean z15) {
        if (!z15) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z15, Object obj) {
        if (!z15) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z15, String str, Object... objArr) {
        if (!z15) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb5 = new StringBuilder(String.valueOf(name2).length() + 35 + String.valueOf(name).length() + 1);
            sb5.append("Must be called on ");
            sb5.append(name2);
            sb5.append(" thread, but got ");
            sb5.append(name);
            sb5.append(".");
            throw new IllegalStateException(sb5.toString());
        }
    }

    public static void e(String str) {
        if (!com.google.android.gms.common.util.q.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void h() {
        i("Must not be called on GoogleApiHandler thread.");
    }

    public static void i(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    public static void j() {
        k("Must not be called on the main application thread");
    }

    public static void k(String str) {
        if (com.google.android.gms.common.util.q.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T l(T t15) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T m(T t15, Object obj) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static long n(long j15) {
        if (j15 != 0) {
            return j15;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void o(boolean z15) {
        if (!z15) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z15, Object obj) {
        if (!z15) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
