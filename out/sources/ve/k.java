package ve;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static void a(boolean z15, String str) {
        if (!z15) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T extends Collection<Y>, Y> T c(T t15) {
        if (t15.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t15;
    }

    public static <T> T d(T t15) {
        return (T) e(t15, "Argument must not be null");
    }

    public static <T> T e(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }
}
