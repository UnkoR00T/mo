package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RestrictedApi"})
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f36395h;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th4) {
            p.this.y(th4);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v15) {
            p.this.x(v15);
        }
    }

    interface b<T> {
        void a(Throwable th4);

        void set(T t15);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f36395h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f36395h.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.a
    protected void g() {
        this.f36395h.cancel(A());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f36395h.getDelay(timeUnit);
    }
}
