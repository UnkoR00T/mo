package ju;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u0014\u00100\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\rR\u0014\u00102\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\n¨\u00063"}, d2 = {"Lju/u0;", "Lju/n1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "Loq/i0;", "p4", "Ljava/lang/Thread;", "l4", "()Ljava/lang/Thread;", "", "o4", "()Z", "k4", "task", "A3", "(Ljava/lang/Runnable;)V", "", "now", "Lju/n1$c;", "delayedTask", "e3", "(JLju/n1$c;)V", "shutdown", "timeMillis", "block", "Ltq/i;", "context", "Lju/i1;", "O0", "(JLjava/lang/Runnable;Ltq/i;)Lju/i1;", "run", "", "toString", "()Ljava/lang/String;", "k", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "m4", "isShutDown", "n4", "isShutdownRequested", "d3", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 extends n1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u0 f105786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;

    static {
        Long l15;
        u0 u0Var = new u0();
        f105786j = u0Var;
        m1.A2(u0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l15 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l15 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l15.longValue());
    }

    private u0() {
    }

    private final synchronized void k4() {
        if (n4()) {
            debugStatus = 3;
            X3();
            notifyAll();
        }
    }

    private final synchronized Thread l4() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f105786j.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean m4() {
        return debugStatus == 4;
    }

    private final boolean n4() {
        int i15 = debugStatus;
        return i15 == 2 || i15 == 3;
    }

    private final synchronized boolean o4() {
        if (n4()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void p4() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // ju.n1
    public void A3(Runnable task) {
        if (m4()) {
            p4();
        }
        super.A3(task);
    }

    @Override // ju.n1, ju.y0
    public i1 O0(long timeMillis, Runnable block, tq.i context) {
        return h4(timeMillis, block);
    }

    @Override // ju.o1
    /* JADX INFO: renamed from: d3 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? l4() : thread;
    }

    @Override // ju.o1
    protected void e3(long now, n1.c delayedTask) {
        p4();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zQ3;
        c3.f105666a.d(this);
        c.a();
        try {
            if (!o4()) {
                if (zQ3) {
                    return;
                } else {
                    return;
                }
            }
            long j15 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jP2 = P2();
                if (jP2 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j15 == Long.MAX_VALUE) {
                        j15 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j16 = j15 - jNanoTime;
                    if (j16 <= 0) {
                        if (zQ3) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jP2 = lr.m.k(jP2, j16);
                } else {
                    j15 = Long.MAX_VALUE;
                }
                if (jP2 > 0) {
                    if (n4()) {
                        if (zQ3) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        c.a();
                        LockSupport.parkNanos(this, jP2);
                    }
                }
            }
        } finally {
            _thread = null;
            k4();
            c.a();
            if (!Q3()) {
                getThread();
            }
        }
    }

    @Override // ju.n1, ju.m1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }
}
