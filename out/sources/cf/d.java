package cf;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static <T> void a(T t15, Class<T> cls) {
        if (t15 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
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

    public static <T> T d(T t15) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
