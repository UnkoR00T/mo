package i6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T c(T t15) {
        t15.getClass();
        return t15;
    }

    public static <T> T d(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    public static String e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
