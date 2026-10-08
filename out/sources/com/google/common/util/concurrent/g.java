package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class g<V> extends f<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q<V> f35954h;

    g(q<V> qVar) {
        this.f35954h = (q) zj.p.q(qVar);
    }

    @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        this.f35954h.b(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        return this.f35954h.cancel(z15);
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public V get() {
        return this.f35954h.get();
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f35954h.isCancelled();
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public boolean isDone() {
        return this.f35954h.isDone();
    }

    @Override // com.google.common.util.concurrent.a
    public String toString() {
        return this.f35954h.toString();
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public V get(long j15, TimeUnit timeUnit) {
        return this.f35954h.get(j15, timeUnit);
    }
}
