package io.sentry.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T c(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new IllegalArgumentException(str);
    }
}
