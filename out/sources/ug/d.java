package ug;

import android.content.SharedPreferences;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) yg.d.a(new e(sharedPreferences, str, num));
        } catch (Exception e15) {
            String strValueOf = String.valueOf(e15.getMessage());
            c2.g("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
