package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
class n<V> implements q<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final q<?> f35958b = new n(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f35959c = new p(n.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f35960a;

    n(V v15) {
        this.f35960a = v15;
    }

    @Override // com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        zj.p.r(runnable, "Runnable was null.");
        zj.p.r(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e15) {
            f35959c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e15);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f35960a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f35960a + "]]";
    }

    @Override // java.util.concurrent.Future
    public V get(long j15, TimeUnit timeUnit) {
        zj.p.q(timeUnit);
        return get();
    }
}
