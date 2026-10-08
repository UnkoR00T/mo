package ug;

import android.content.SharedPreferences;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) yg.d.a(new i(sharedPreferences, str, str2));
        } catch (Exception e15) {
            String strValueOf = String.valueOf(e15.getMessage());
            c2.g("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
