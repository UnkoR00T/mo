package io.sentry.hints;

import io.sentry.b7;
import io.sentry.v0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f95016a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f95017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f95018c;

    public d(long j15, v0 v0Var) {
        this.f95017b = j15;
        this.f95018c = v0Var;
    }

    @Override // io.sentry.hints.f
    public void d() {
        this.f95016a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean g() {
        try {
            return this.f95016a.await(this.f95017b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e15) {
            Thread.currentThread().interrupt();
            this.f95018c.b(b7.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e15);
            return false;
        }
    }
}
