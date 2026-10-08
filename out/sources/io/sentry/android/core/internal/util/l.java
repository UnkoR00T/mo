package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f93996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.p f93997b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f93999d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f93998c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f94000e = new AtomicLong(0);

    public l(io.sentry.transport.p pVar, long j15, int i15) {
        this.f93997b = pVar;
        this.f93996a = j15;
        this.f93999d = i15 <= 0 ? 1 : i15;
    }

    public boolean a() {
        long jA = this.f93997b.a();
        if (this.f94000e.get() == 0 || this.f94000e.get() + this.f93996a <= jA) {
            this.f93998c.set(0);
            this.f94000e.set(jA);
            return false;
        }
        if (this.f93998c.incrementAndGet() < this.f93999d) {
            return false;
        }
        this.f93998c.set(0);
        return true;
    }
}
