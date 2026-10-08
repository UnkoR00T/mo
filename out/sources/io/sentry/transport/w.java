package io.sentry.transport;

import CON.k0;
import io.sentry.b7;
import io.sentry.n5;
import io.sentry.o5;
import io.sentry.v0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class w extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f95778f = io.sentry.m.i(2000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n5 f95780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f95781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o5 f95782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f95783e;

    static final class a<T> implements Future<T> {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z15) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j15, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public w(int i15, int i16, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, v0 v0Var, o5 o5Var) {
        super(i15, i15, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f95780b = null;
        this.f95783e = new b0();
        this.f95779a = i16;
        this.f95781c = v0Var;
        this.f95782d = o5Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th4) {
        try {
            super.afterExecute(runnable, th4);
        } finally {
            this.f95783e.a();
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    public boolean h() {
        n5 n5Var = this.f95780b;
        return n5Var != null && this.f95782d.a().e(n5Var) < f95778f;
    }

    public boolean m() {
        return this.f95783e.b() < this.f95779a;
    }

    void p(long j15) {
        try {
            this.f95783e.d(j15, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e15) {
            this.f95781c.b(b7.ERROR, "Failed to wait till idle", e15);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (m()) {
            this.f95783e.c();
            return super.submit(runnable);
        }
        this.f95780b = this.f95782d.a();
        this.f95781c.c(b7.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}
