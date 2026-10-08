package i6;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {
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

    public static int c(int i15, int i16, int i17, String str) {
        if (i15 < i16) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i16), Integer.valueOf(i17)));
        }
        if (i15 <= i17) {
            return i15;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i16), Integer.valueOf(i17)));
    }

    public static int d(int i15) {
        if (i15 >= 0) {
            return i15;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i15, String str) {
        if (i15 >= 0) {
            return i15;
        }
        throw new IllegalArgumentException(str);
    }

    public static int f(int i15, int i16) {
        if ((i15 & i16) == i15) {
            return i15;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i15) + ", but only 0x" + Integer.toHexString(i16) + " are allowed");
    }

    public static <T> T g(T t15) {
        t15.getClass();
        return t15;
    }

    public static <T> T h(T t15, Object obj) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z15) {
        j(z15, null);
    }

    public static void j(boolean z15, String str) {
        if (!z15) {
            throw new IllegalStateException(str);
        }
    }
}
