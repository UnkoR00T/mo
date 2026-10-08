package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class wn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CyclicBarrier f34182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f34183b;

    wn0(ao0 ao0Var, CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
        this.f34182a = cyclicBarrier;
        this.f34183b = countDownLatch;
        Objects.requireNonNull(ao0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f34182a.await(1000L, TimeUnit.MILLISECONDS);
            this.f34183b.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
        }
    }
}
