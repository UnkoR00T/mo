package zj;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public static void A(boolean z15, String str, long j15, long j16) {
        if (!z15) {
            throw new IllegalStateException(v.c(str, Long.valueOf(j15), Long.valueOf(j16)));
        }
    }

    public static void B(boolean z15, String str, Object obj) {
        if (!z15) {
            throw new IllegalStateException(v.c(str, obj));
        }
    }

    public static void C(boolean z15, String str, Object obj, Object obj2) {
        if (!z15) {
            throw new IllegalStateException(v.c(str, obj, obj2));
        }
    }

    private static String a(int i15, int i16, String str) {
        if (i15 < 0) {
            return v.c("%s (%s) must not be negative", str, Integer.valueOf(i15));
        }
        if (i16 >= 0) {
            return v.c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IllegalArgumentException("negative size: " + i16);
    }

    private static String b(int i15, int i16, String str) {
        if (i15 < 0) {
            return v.c("%s (%s) must not be negative", str, Integer.valueOf(i15));
        }
        if (i16 >= 0) {
            return v.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IllegalArgumentException("negative size: " + i16);
    }

    private static String c(int i15, int i16, int i17) {
        if (i15 < 0 || i15 > i17) {
            return b(i15, i17, "start index");
        }
        return (i16 < 0 || i16 > i17) ? b(i16, i17, "end index") : v.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i16), Integer.valueOf(i15));
    }

    public static void d(boolean z15) {
        if (!z15) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z15, Object obj) {
        if (!z15) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z15, String str, char c15) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, Character.valueOf(c15)));
        }
    }

    public static void g(boolean z15, String str, char c15, Object obj) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, Character.valueOf(c15), obj));
        }
    }

    public static void h(boolean z15, String str, int i15) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, Integer.valueOf(i15)));
        }
    }

    public static void i(boolean z15, String str, int i15, int i16) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, Integer.valueOf(i15), Integer.valueOf(i16)));
        }
    }

    public static void j(boolean z15, String str, int i15, Object obj) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, Integer.valueOf(i15), obj));
        }
    }

    public static void k(boolean z15, String str, long j15) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, Long.valueOf(j15)));
        }
    }

    public static void l(boolean z15, String str, Object obj) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, obj));
        }
    }

    public static void m(boolean z15, String str, Object obj, Object obj2) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, obj, obj2));
        }
    }

    public static void n(boolean z15, String str, Object obj, Object obj2, Object obj3) {
        if (!z15) {
            throw new IllegalArgumentException(v.c(str, obj, obj2, obj3));
        }
    }

    public static int o(int i15, int i16) {
        return p(i15, i16, "index");
    }

    public static int p(int i15, int i16, String str) {
        if (i15 < 0 || i15 >= i16) {
            throw new IndexOutOfBoundsException(a(i15, i16, str));
        }
        return i15;
    }

    public static <T> T q(T t15) {
        t15.getClass();
        return t15;
    }

    public static <T> T r(T t15, Object obj) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T s(T t15, String str, Object obj) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(v.c(str, obj));
    }

    public static int t(int i15, int i16) {
        return u(i15, i16, "index");
    }

    public static int u(int i15, int i16, String str) {
        if (i15 < 0 || i15 > i16) {
            throw new IndexOutOfBoundsException(b(i15, i16, str));
        }
        return i15;
    }

    public static void v(int i15, int i16, int i17) {
        if (i15 < 0 || i16 < i15 || i16 > i17) {
            throw new IndexOutOfBoundsException(c(i15, i16, i17));
        }
    }

    public static void w(boolean z15) {
        if (!z15) {
            throw new IllegalStateException();
        }
    }

    public static void x(boolean z15, Object obj) {
        if (!z15) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void y(boolean z15, String str, char c15, char c16) {
        if (!z15) {
            throw new IllegalStateException(v.c(str, Character.valueOf(c15), Character.valueOf(c16)));
        }
    }

    public static void z(boolean z15, String str, int i15) {
        if (!z15) {
            throw new IllegalStateException(v.c(str, Integer.valueOf(i15)));
        }
    }
}
