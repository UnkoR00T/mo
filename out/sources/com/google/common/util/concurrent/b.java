package com.google.common.util.concurrent;

import CON.k0;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends AbstractExecutorService implements s, AutoCloseable {
    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public q<?> submit(Runnable runnable) {
        return (q) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public <T> q<T> submit(Runnable runnable, T t15) {
        return (q) super.submit(runnable, t15);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t15) {
        return a0.J(runnable, t15);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return a0.K(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> q<T> submit(Callable<T> callable) {
        return (q) super.submit((Callable) callable);
    }
}
