package com.google.common.util.concurrent;

import ak.j0;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h<V> extends j0 implements Future<V> {
    protected h() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        return g().cancel(z15);
    }

    protected abstract Future<? extends V> g();

    @Override // java.util.concurrent.Future
    public V get() {
        return g().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return g().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return g().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j15, TimeUnit timeUnit) {
        return g().get(j15, timeUnit);
    }
}
