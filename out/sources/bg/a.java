package bg;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class a {
    public static void a(boolean z15) {
        if (!z15) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t15) {
        t15.getClass();
        return t15;
    }

    public static void c(boolean z15) {
        if (!z15) {
            throw new IllegalStateException();
        }
    }
}
