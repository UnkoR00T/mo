package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class ye0 implements v70 {
    ye0() {
    }

    @Override // com.google.android.libraries.places.internal.v70
    public final /* bridge */ /* synthetic */ Object a(String str) {
        zj.p.e(str.length() > 0, "empty timeout");
        zj.p.e(str.length() <= 9, "bad timeout format");
        long j15 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j15));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j15));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j15));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j15));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j15));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j15);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
    }

    @Override // com.google.android.libraries.places.internal.v70
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        long jMax = Math.max(1L, ((Long) obj).longValue());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (jMax < 100000000) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(jMax).length() + 1);
            sb5.append(jMax);
            sb5.append("n");
            return sb5.toString();
        }
        if (jMax < 100000000000L) {
            long micros = timeUnit.toMicros(jMax);
            StringBuilder sb6 = new StringBuilder(String.valueOf(micros).length() + 1);
            sb6.append(micros);
            sb6.append("u");
            return sb6.toString();
        }
        if (jMax < 100000000000000L) {
            long millis = timeUnit.toMillis(jMax);
            StringBuilder sb7 = new StringBuilder(String.valueOf(millis).length() + 1);
            sb7.append(millis);
            sb7.append("m");
            return sb7.toString();
        }
        if (jMax < 100000000000000000L) {
            long seconds = timeUnit.toSeconds(jMax);
            StringBuilder sb8 = new StringBuilder(String.valueOf(seconds).length() + 1);
            sb8.append(seconds);
            sb8.append(ip.a.f96137b);
            return sb8.toString();
        }
        if (jMax < 6000000000000000000L) {
            long minutes = timeUnit.toMinutes(jMax);
            StringBuilder sb9 = new StringBuilder(String.valueOf(minutes).length() + 1);
            sb9.append(minutes);
            sb9.append("M");
            return sb9.toString();
        }
        long hours = timeUnit.toHours(jMax);
        StringBuilder sb10 = new StringBuilder(String.valueOf(hours).length() + 1);
        sb10.append(hours);
        sb10.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n);
        return sb10.toString();
    }
}
