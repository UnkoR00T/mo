package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static String b(String str) {
        if (!c(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i15 = 1; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (!c(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        return str;
    }

    private static boolean c(char c15) {
        if (c15 < 'a' || c15 > 'z') {
            return c15 >= 'A' && c15 <= 'Z';
        }
        return true;
    }
}
