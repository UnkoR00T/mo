package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
abstract class c<I, O, F, T> extends f.a<O> implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    q<? extends I> f35950h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    F f35951j;

    private static final class a<I, O> extends c<I, O, d<? super I, ? extends O>, q<? extends O>> {
        a(q<? extends I> qVar, d<? super I, ? extends O> dVar) {
            super(qVar, dVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public q<? extends O> L(d<? super I, ? extends O> dVar, I i15) {
            q<? extends O> qVarApply = dVar.apply(i15);
            zj.p.s(qVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dVar);
            return qVarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void M(q<? extends O> qVar) {
            E(qVar);
        }
    }

    private static final class b<I, O> extends c<I, O, zj.g<? super I, ? extends O>, O> {
        b(q<? extends I> qVar, zj.g<? super I, ? extends O> gVar) {
            super(qVar, gVar);
        }

        @Override // com.google.common.util.concurrent.c
        void M(O o15) {
            C(o15);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public O L(zj.g<? super I, ? extends O> gVar, I i15) {
            return gVar.apply(i15);
        }
    }

    c(q<? extends I> qVar, F f15) {
        this.f35950h = (q) zj.p.q(qVar);
        this.f35951j = (F) zj.p.q(f15);
    }

    static <I, O> q<O> J(q<I> qVar, zj.g<? super I, ? extends O> gVar, Executor executor) {
        zj.p.q(gVar);
        b bVar = new b(qVar, gVar);
        qVar.b(bVar, u.d(executor, bVar));
        return bVar;
    }

    static <I, O> q<O> K(q<I> qVar, d<? super I, ? extends O> dVar, Executor executor) {
        zj.p.q(executor);
        a aVar = new a(qVar, dVar);
        qVar.b(aVar, u.d(executor, aVar));
        return aVar;
    }

    abstract T L(F f15, I i15);

    abstract void M(T t15);

    @Override // com.google.common.util.concurrent.a
    protected final void n() {
        y(this.f35950h);
        this.f35950h = null;
        this.f35951j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        q<? extends I> qVar = this.f35950h;
        F f15 = this.f35951j;
        if ((isCancelled() | (qVar == null)) || (f15 == null)) {
            return;
        }
        this.f35950h = null;
        if (qVar.isCancelled()) {
            E(qVar);
            return;
        }
        try {
            try {
                Object objL = L(f15, k.b(qVar));
                this.f35951j = null;
                M(objL);
            } catch (Throwable th4) {
                try {
                    x.a(th4);
                    D(th4);
                } finally {
                    this.f35951j = null;
                }
            }
        } catch (Error e15) {
            D(e15);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e16) {
            D(e16.getCause());
        } catch (Exception e17) {
            D(e17);
        }
    }

    @Override // com.google.common.util.concurrent.a
    protected String z() {
        String str;
        q<? extends I> qVar = this.f35950h;
        F f15 = this.f35951j;
        String strZ = super.z();
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        } else {
            str = "";
        }
        if (f15 != null) {
            return str + "function=[" + f15 + "]";
        }
        if (strZ == null) {
            return null;
        }
        return str + strZ;
    }
}
