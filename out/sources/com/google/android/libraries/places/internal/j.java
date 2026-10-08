package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void b(boolean z15, String str) {
        if (!z15) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String c(String str) {
        if (!d(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i15 = 1; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (!d(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        return str;
    }

    private static boolean d(char c15) {
        if (c15 < 'a' || c15 > 'z') {
            return c15 >= 'A' && c15 <= 'Z';
        }
        return true;
    }
}
