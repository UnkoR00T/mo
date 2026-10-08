package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class j50 implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i50 f32637d = new h50(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f32638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f32639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f32640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f32641h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i50 f32642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f32644c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f32638e = nanos;
        f32639f = -nanos;
        f32640g = TimeUnit.SECONDS.toNanos(1L);
    }

    private j50(i50 i50Var, long j15, long j16, boolean z15) {
        this.f32642a = i50Var;
        long jMin = Math.min(f32638e, Math.max(f32639f, j16));
        this.f32643b = j15 + jMin;
        this.f32644c = jMin <= 0;
    }

    public static j50 b(long j15, TimeUnit timeUnit) {
        i50 i50Var = f32637d;
        Objects.requireNonNull(timeUnit, "units");
        return new j50(i50Var, System.nanoTime(), timeUnit.toNanos(j15), true);
    }

    public final boolean e() {
        if (!this.f32644c) {
            if (this.f32643b - System.nanoTime() > 0) {
                return false;
            }
            this.f32644c = true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j50)) {
            return false;
        }
        j50 j50Var = (j50) obj;
        return this.f32642a == j50Var.f32642a && this.f32643b == j50Var.f32643b;
    }

    public final long g(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.f32644c && this.f32643b - jNanoTime <= 0) {
            this.f32644c = true;
        }
        return timeUnit.convert(this.f32643b - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final int hashCode() {
        return Objects.hash(this.f32642a, Long.valueOf(this.f32643b));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j50 j50Var) {
        i50 i50Var = this.f32642a;
        i50 i50Var2 = j50Var.f32642a;
        if (i50Var == i50Var2) {
            return Long.compare(this.f32643b, j50Var.f32643b);
        }
        String string = i50Var.toString();
        String string2 = i50Var2.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 14 + string2.length() + 58);
        sb5.append("Tickers (");
        sb5.append(string);
        sb5.append(" and ");
        sb5.append(string2);
        sb5.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb5.toString());
    }

    public final String toString() {
        long jG = g(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jG);
        long j15 = f32640g;
        long j16 = jAbs / j15;
        long jAbs2 = Math.abs(jG) % j15;
        StringBuilder sb5 = new StringBuilder();
        if (jG < 0) {
            sb5.append('-');
        }
        sb5.append(j16);
        if (jAbs2 > 0) {
            sb5.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb5.append("s from now");
        i50 i50Var = this.f32642a;
        if (i50Var != f32637d) {
            String string = i50Var.toString();
            StringBuilder sb6 = new StringBuilder(string.length() + 10);
            sb6.append(" (ticker=");
            sb6.append(string);
            sb6.append(")");
            sb5.append(sb6.toString());
        }
        return sb5.toString();
    }
}
