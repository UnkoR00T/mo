package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class va1 {
    public static String a(String str, String str2, boolean z15) {
        if (str2.length() > 23) {
            int i15 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i15 = length;
                    break;
                }
            }
            str2 = str2.substring(i15 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }
}
