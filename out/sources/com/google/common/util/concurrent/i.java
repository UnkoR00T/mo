package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i<V> extends h<V> implements q<V> {

    public static abstract class a<V> extends i<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q<V> f35955a;

        protected a(q<V> qVar) {
            this.f35955a = (q) zj.p.q(qVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final q<V> g() {
            return this.f35955a;
        }
    }

    protected i() {
    }

    @Override // com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        e().b(runnable, executor);
    }

    /* JADX INFO: renamed from: k */
    protected abstract q<? extends V> e();
}
