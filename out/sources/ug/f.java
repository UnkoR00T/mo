package ug;

import android.content.SharedPreferences;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l15) {
        try {
            return (Long) yg.d.a(new g(sharedPreferences, str, l15));
        } catch (Exception e15) {
            String strValueOf = String.valueOf(e15.getMessage());
            c2.g("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return l15;
        }
    }
}
