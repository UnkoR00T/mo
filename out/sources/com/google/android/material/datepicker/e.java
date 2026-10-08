package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class e {
    static String a(Context context, long j15, boolean z15, boolean z16, boolean z17) {
        String strD = d(j15);
        if (z15) {
            strD = String.format(context.getString(ri.j.f174062v), strD);
        }
        if (z16) {
            return String.format(context.getString(ri.j.f174061u), strD);
        }
        return z17 ? String.format(context.getString(ri.j.f174058r), strD) : strD;
    }

    static String b(long j15) {
        return c(j15, Locale.getDefault());
    }

    static String c(long j15, Locale locale) {
        return w.d(locale).format(new Date(j15));
    }

    static String d(long j15) {
        return i(j15) ? b(j15) : g(j15);
    }

    static String e(Context context, int i15) {
        return w.g().get(1) == i15 ? String.format(context.getString(ri.j.f174059s), Integer.valueOf(i15)) : String.format(context.getString(ri.j.f174060t), Integer.valueOf(i15));
    }

    static String f(long j15) {
        return w.k(Locale.getDefault()).format(new Date(j15));
    }

    static String g(long j15) {
        return h(j15, Locale.getDefault());
    }

    static String h(long j15, Locale locale) {
        return w.l(locale).format(new Date(j15));
    }

    private static boolean i(long j15) {
        Calendar calendarG = w.g();
        Calendar calendarI = w.i();
        calendarI.setTimeInMillis(j15);
        return calendarG.get(1) == calendarI.get(1);
    }
}
