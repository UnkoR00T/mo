package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 extends n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f95044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f95045b;

    public i7() {
        this(m.d(), System.nanoTime());
    }

    private long n(i7 i7Var, i7 i7Var2) {
        return i7Var.l() + (i7Var2.f95045b - i7Var.f95045b);
    }

    @Override // io.sentry.n5, java.lang.Comparable
    /* JADX INFO: renamed from: b */
    public int compareTo(n5 n5Var) {
        if (!(n5Var instanceof i7)) {
            return super.compareTo(n5Var);
        }
        i7 i7Var = (i7) n5Var;
        long time = this.f95044a.getTime();
        long time2 = i7Var.f95044a.getTime();
        return time == time2 ? Long.valueOf(this.f95045b).compareTo(Long.valueOf(i7Var.f95045b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.n5
    public long e(n5 n5Var) {
        return n5Var instanceof i7 ? this.f95045b - ((i7) n5Var).f95045b : super.e(n5Var);
    }

    @Override // io.sentry.n5
    public long k(n5 n5Var) {
        if (n5Var == null || !(n5Var instanceof i7)) {
            return super.k(n5Var);
        }
        i7 i7Var = (i7) n5Var;
        return compareTo(n5Var) < 0 ? n(this, i7Var) : n(i7Var, this);
    }

    @Override // io.sentry.n5
    public long l() {
        return m.a(this.f95044a);
    }

    public i7(Date date, long j15) {
        this.f95044a = date;
        this.f95045b = j15;
    }
}
