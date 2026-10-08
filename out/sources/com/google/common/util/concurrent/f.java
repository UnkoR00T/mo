package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f<V> extends l<V> {

    static abstract class a<V> extends f<V> implements com.google.common.util.concurrent.a.i<V> {
        a() {
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.q
        public final void b(Runnable runnable, Executor executor) {
            super.b(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z15) {
            return super.cancel(z15);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j15, TimeUnit timeUnit) {
            return (V) super.get(j15, timeUnit);
        }
    }

    f() {
    }

    public static <V> f<V> G(q<V> qVar) {
        return qVar instanceof f ? (f) qVar : new g(qVar);
    }

    public final <T> f<T> H(zj.g<? super V, T> gVar, Executor executor) {
        return (f) k.d(this, gVar, executor);
    }

    public final <T> f<T> I(d<? super V, T> dVar, Executor executor) {
        return (f) k.e(this, dVar, executor);
    }
}
