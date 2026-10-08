package ug;

import android.content.SharedPreferences;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) yg.d.a(new c(sharedPreferences, str, bool));
        } catch (Exception e15) {
            String strValueOf = String.valueOf(e15.getMessage());
            c2.g("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
