package com.google.android.libraries.places.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class ml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f32955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f32956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f32957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final double f32958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Long f32959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f32960f;

    ml0(int i15, long j15, long j16, double d15, Long l15, Set set) {
        this.f32955a = i15;
        this.f32956b = j15;
        this.f32957c = j16;
        this.f32958d = d15;
        this.f32959e = l15;
        this.f32960f = ak.u0.v(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        return this.f32955a == ml0Var.f32955a && this.f32956b == ml0Var.f32956b && this.f32957c == ml0Var.f32957c && Double.compare(this.f32958d, ml0Var.f32958d) == 0 && zj.l.a(this.f32959e, ml0Var.f32959e) && zj.l.a(this.f32960f, ml0Var.f32960f);
    }

    public final int hashCode() {
        return zj.l.b(Integer.valueOf(this.f32955a), Long.valueOf(this.f32956b), Long.valueOf(this.f32957c), Double.valueOf(this.f32958d), this.f32959e, this.f32960f);
    }

    public final String toString() {
        return zj.j.c(this).b("maxAttempts", this.f32955a).c("initialBackoffNanos", this.f32956b).c("maxBackoffNanos", this.f32957c).a("backoffMultiplier", this.f32958d).d("perAttemptRecvTimeoutNanos", this.f32959e).d("retryableStatusCodes", this.f32960f).toString();
    }
}
