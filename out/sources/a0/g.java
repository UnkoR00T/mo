package a0;

import com.google.common.util.concurrent.q;
import i6.i;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.e1;

/* JADX INFO: loaded from: classes.dex */
abstract class g<V> implements q<V> {

    static class a<V> extends g<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f1072a;

        a(Throwable th4) {
            this.f1072a = th4;
        }

        @Override // a0.g, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f1072a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f1072a + "]]";
        }
    }

    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        b(Throwable th4) {
            super(th4);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    static final class c<V> extends g<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final g<Object> f1073b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V f1074a;

        c(V v15) {
            this.f1074a = v15;
        }

        @Override // a0.g, java.util.concurrent.Future
        public V get() {
            return this.f1074a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f1074a + "]]";
        }
    }

    g() {
    }

    public static <V> q<V> e() {
        return c.f1073b;
    }

    @Override // com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        i.g(runnable);
        i.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e15) {
            e1.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e15);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j15, TimeUnit timeUnit) {
        i.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
