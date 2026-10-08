package ju;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lju/u1;", "Lju/t1;", "Lju/y0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltq/i;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "j2", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Ltq/i;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Loq/i0;", "i2", "(Ltq/i;Ljava/util/concurrent/RejectedExecutionException;)V", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "Lju/n;", "continuation", "E", "(JLju/n;)V", "Lju/i1;", "O0", "(JLjava/lang/Runnable;Ltq/i;)Lju/i1;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/util/concurrent/Executor;", "d2", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 extends t1 implements y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    public u1(Executor executor) {
        this.executor = executor;
        ou.a.a(getExecutor());
    }

    private final void i2(tq.i context, RejectedExecutionException exception) {
        g2.d(context, r1.a("The task was rejected", exception));
    }

    private final ScheduledFuture<?> j2(ScheduledExecutorService scheduledExecutorService, Runnable runnable, tq.i iVar, long j15) {
        try {
            return scheduledExecutorService.schedule(runnable, j15, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e15) {
            i2(iVar, e15);
            return null;
        }
    }

    @Override // ju.y0
    public void E(long timeMillis, n<? super oq.i0> continuation) {
        long j15;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureJ2 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j15 = timeMillis;
            scheduledFutureJ2 = j2(scheduledExecutorService, new v2(this, continuation), continuation.getContext(), j15);
        } else {
            j15 = timeMillis;
        }
        if (scheduledFutureJ2 != null) {
            r.c(continuation, new l(scheduledFutureJ2));
        } else {
            u0.f105786j.E(j15, continuation);
        }
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        try {
            Executor executor = getExecutor();
            c.a();
            executor.execute(block);
        } catch (RejectedExecutionException e15) {
            c.a();
            i2(context, e15);
            g1.b().F1(context, block);
        }
    }

    @Override // ju.y0
    public i1 O0(long timeMillis, Runnable block, tq.i context) {
        long j15;
        Runnable runnable;
        tq.i iVar;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureJ2 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j15 = timeMillis;
            runnable = block;
            iVar = context;
            scheduledFutureJ2 = j2(scheduledExecutorService, runnable, iVar, j15);
        } else {
            j15 = timeMillis;
            runnable = block;
            iVar = context;
        }
        return scheduledFutureJ2 != null ? new h1(scheduledFutureJ2) : u0.f105786j.O0(j15, runnable, iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // ju.t1
    /* JADX INFO: renamed from: d2, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    public boolean equals(Object other) {
        return (other instanceof u1) && ((u1) other).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return getExecutor().toString();
    }
}
