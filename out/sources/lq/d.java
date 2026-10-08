package lq;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static <T> T a(T t15) {
        t15.getClass();
        return t15;
    }

    public static <T> T b(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    public static void c(boolean z15, String str, Object... objArr) {
        if (!z15) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
