package a0;

import com.google.common.util.concurrent.q;
import i6.i;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class b<I, O> extends d<O> implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a0.a<? super I, ? extends O> f1054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Boolean> f1055d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CountDownLatch f1056e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q<? extends I> f1057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile q<? extends O> f1058g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f1059a;

        a(q qVar) {
            this.f1059a = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.c(f.e(this.f1059a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e15) {
                    b.this.d(e15.getCause());
                }
            } finally {
                b.this.f1058g = null;
            }
        }
    }

    b(a0.a<? super I, ? extends O> aVar, q<? extends I> qVar) {
        this.f1054c = (a0.a) i.g(aVar);
        this.f1057f = (q) i.g(qVar);
    }

    private void g(Future<?> future, boolean z15) {
        if (future != null) {
            future.cancel(z15);
        }
    }

    private <E> void h(BlockingQueue<E> blockingQueue, E e15) {
        boolean z15 = false;
        while (true) {
            try {
                blockingQueue.put(e15);
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E i(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z15 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // a0.d, java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        if (!super.cancel(z15)) {
            return false;
        }
        h(this.f1055d, Boolean.valueOf(z15));
        g(this.f1057f, z15);
        g(this.f1058g, z15);
        return true;
    }

    @Override // a0.d, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            q<? extends I> qVar = this.f1057f;
            if (qVar != null) {
                qVar.get();
            }
            this.f1056e.await();
            q<? extends O> qVar2 = this.f1058g;
            if (qVar2 != null) {
                qVar2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a0.a<? super I, ? extends O>, com.google.common.util.concurrent.q<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a0.a<? super I, ? extends O>, com.google.common.util.concurrent.q<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a0.a<? super I, ? extends O>, com.google.common.util.concurrent.q<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r15;
        ?? r16 = (a0.a<? super I, ? extends O>) null;
        try {
            try {
                q<? extends O> qVarApply = this.f1054c.apply(f.e(this.f1057f));
                this.f1058g = qVarApply;
                if (isCancelled()) {
                    qVarApply.cancel(((Boolean) i(this.f1055d)).booleanValue());
                    this.f1058g = null;
                } else {
                    qVarApply.b(new a(qVarApply), z.a.a());
                }
            } catch (UndeclaredThrowableException e15) {
                d(e15.getCause());
                r15 = r16;
            } catch (Exception e16) {
                d(e16);
                r15 = r16;
            } catch (Error e17) {
                d(e17);
                r15 = r16;
            } finally {
                this.f1054c = (a0.a<? super I, ? extends O>) r16;
                this.f1057f = (q<? extends I>) r16;
                this.f1056e.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e18) {
            d(e18.getCause());
        }
    }

    @Override // a0.d, java.util.concurrent.Future
    public O get(long j15, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j15 = timeUnit2.convert(j15, timeUnit);
                timeUnit = timeUnit2;
            }
            q<? extends I> qVar = this.f1057f;
            if (qVar != null) {
                long jNanoTime = System.nanoTime();
                qVar.get(j15, timeUnit);
                j15 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f1056e.await(j15, timeUnit)) {
                j15 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                q<? extends O> qVar2 = this.f1058g;
                if (qVar2 != null) {
                    qVar2.get(j15, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j15, timeUnit);
    }
}
