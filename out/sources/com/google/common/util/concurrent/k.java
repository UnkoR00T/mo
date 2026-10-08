package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends m {

    private static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f35956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j<? super V> f35957b;

        a(Future<V> future, j<? super V> jVar) {
            this.f35956a = future;
            this.f35957b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f35956a;
            if ((future instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) future)) != null) {
                this.f35957b.b(thA);
                return;
            }
            try {
                this.f35957b.a(k.b(this.f35956a));
            } catch (ExecutionException e15) {
                this.f35957b.b(e15.getCause());
            } catch (Throwable th4) {
                this.f35957b.b(th4);
            }
        }

        public String toString() {
            return zj.j.c(this).k(this.f35957b).toString();
        }
    }

    public static <V> void a(q<V> qVar, j<? super V> jVar, Executor executor) {
        zj.p.q(jVar);
        qVar.b(new a(qVar, jVar), executor);
    }

    public static <V> V b(Future<V> future) {
        zj.p.B(future.isDone(), "Future was expected to be done: %s", future);
        return (V) b0.a(future);
    }

    public static <V> q<V> c(V v15) {
        return v15 == null ? (q<V>) n.f35958b : new n(v15);
    }

    public static <I, O> q<O> d(q<I> qVar, zj.g<? super I, ? extends O> gVar, Executor executor) {
        return c.J(qVar, gVar, executor);
    }

    public static <I, O> q<O> e(q<I> qVar, d<? super I, ? extends O> dVar, Executor executor) {
        return c.K(qVar, dVar, executor);
    }
}
