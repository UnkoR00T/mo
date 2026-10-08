package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.h7;
import io.sentry.m;
import io.sentry.n5;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f94118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f94119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f94120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f94121d;

    public void A(String str, long j15, long j16, long j17) {
        this.f94118a = str;
        this.f94119b = j15;
        this.f94120c = j16;
        this.f94121d = j17;
    }

    public void B() {
        this.f94120c = SystemClock.uptimeMillis();
        this.f94119b = System.currentTimeMillis();
    }

    public void D() {
        this.f94121d = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return Long.compare(this.f94119b, iVar.f94119b);
    }

    public String e() {
        return this.f94118a;
    }

    public long g() {
        if (v()) {
            return this.f94121d - this.f94120c;
        }
        return 0L;
    }

    public n5 j() {
        if (v()) {
            return new h7(m.i(k()));
        }
        return null;
    }

    public long k() {
        if (t()) {
            return this.f94119b + g();
        }
        return 0L;
    }

    public double l() {
        return m.j(k());
    }

    public n5 n() {
        if (t()) {
            return new h7(m.i(o()));
        }
        return null;
    }

    public long o() {
        return this.f94119b;
    }

    public double p() {
        return m.j(this.f94119b);
    }

    public long q() {
        return this.f94120c;
    }

    public boolean r() {
        return this.f94120c == 0;
    }

    public boolean s() {
        return this.f94121d == 0;
    }

    public boolean t() {
        return this.f94120c != 0;
    }

    public boolean v() {
        return this.f94121d != 0;
    }

    public void w() {
        this.f94118a = null;
        this.f94120c = 0L;
        this.f94121d = 0L;
        this.f94119b = 0L;
    }

    public void x(String str) {
        this.f94118a = str;
    }

    public void y(long j15) {
        this.f94120c = j15;
        this.f94119b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f94120c);
    }

    public void z(long j15) {
        this.f94121d = j15;
    }
}
