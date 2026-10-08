package yk;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {
    public static void a(boolean z15, String str) {
        if (!z15) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t15) {
        t15.getClass();
        return t15;
    }

    public static <T> T c(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z15, String str) {
        if (!z15) {
            throw new IllegalStateException(str);
        }
    }
}
