package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes4.dex */
class a0<V> extends f.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile o<?> f35947h;

    private final class a extends o<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<V> f35948c;

        a(Callable<V> callable) {
            this.f35948c = (Callable) zj.p.q(callable);
        }

        @Override // com.google.common.util.concurrent.o
        void a(Throwable th4) {
            a0.this.D(th4);
        }

        @Override // com.google.common.util.concurrent.o
        void b(V v15) {
            a0.this.C(v15);
        }

        @Override // com.google.common.util.concurrent.o
        final boolean d() {
            return a0.this.isDone();
        }

        @Override // com.google.common.util.concurrent.o
        V e() {
            return this.f35948c.call();
        }

        @Override // com.google.common.util.concurrent.o
        String f() {
            return this.f35948c.toString();
        }
    }

    a0(Callable<V> callable) {
        this.f35947h = new a(callable);
    }

    static <V> a0<V> J(Runnable runnable, V v15) {
        return new a0<>(Executors.callable(runnable, v15));
    }

    static <V> a0<V> K(Callable<V> callable) {
        return new a0<>(callable);
    }

    @Override // com.google.common.util.concurrent.a
    protected void n() {
        o<?> oVar;
        super.n();
        if (F() && (oVar = this.f35947h) != null) {
            oVar.c();
        }
        this.f35947h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        o<?> oVar = this.f35947h;
        if (oVar != null) {
            oVar.run();
        }
        this.f35947h = null;
    }

    @Override // com.google.common.util.concurrent.a
    protected String z() {
        o<?> oVar = this.f35947h;
        if (oVar == null) {
            return super.z();
        }
        return "task=[" + oVar + "]";
    }
}
