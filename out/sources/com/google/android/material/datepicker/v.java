package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f35212c = new v(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f35213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f35214b;

    private v(Long l15, TimeZone timeZone) {
        this.f35213a = l15;
        this.f35214b = timeZone;
    }

    static v c() {
        return f35212c;
    }

    Calendar a() {
        return b(this.f35214b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l15 = this.f35213a;
        if (l15 != null) {
            calendar.setTimeInMillis(l15.longValue());
        }
        return calendar;
    }
}
