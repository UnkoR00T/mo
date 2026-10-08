package jv;

import fr.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0003\u001a\u001f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,¨\u0006."}, d2 = {"Ljv/e;", "", "Ljv/e$a;", "backend", "<init>", "(Ljv/e$a;)V", "Ljv/a;", "task", "Loq/i0;", "e", "(Ljv/a;)V", "j", "", "delayNanos", "c", "(Ljv/a;J)V", "Ljv/d;", "taskQueue", "h", "(Ljv/d;)V", "d", "()Ljv/a;", "i", "()Ljv/d;", "f", "()V", "a", "Ljv/e$a;", "g", "()Ljv/e$a;", "", "b", "I", "nextQueueName", "", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f106031i = new e(new c(gv.d.M(gv.d.f77111i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f106032j = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a backend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatorWaiting;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long coordinatorWakeUpAt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nextQueueName = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<jv.d> busyQueues = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<jv.d> readyQueues = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable = new d();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljv/e$a;", "", "", "c", "()J", "Ljv/e;", "taskRunner", "Loq/i0;", "e", "(Ljv/e;)V", "nanos", "d", "(Ljv/e;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        long c();

        void d(e taskRunner, long nanos);

        void e(e taskRunner);

        void execute(Runnable runnable);
    }

    /* JADX INFO: renamed from: jv.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljv/e$b;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Ljv/e;", "INSTANCE", "Ljv/e;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Logger a() {
            return e.f106032j;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljv/e$c;", "Ljv/e$a;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "c", "()J", "Ljv/e;", "taskRunner", "Loq/i0;", "e", "(Ljv/e;)V", "nanos", "d", "(Ljv/e;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadPoolExecutor executor;

        public c(ThreadFactory threadFactory) {
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // jv.e.a
        public long c() {
            return System.nanoTime();
        }

        @Override // jv.e.a
        public void d(e taskRunner, long nanos) throws InterruptedException {
            long j15 = nanos / 1000000;
            long j16 = nanos - (1000000 * j15);
            if (j15 > 0 || nanos > 0) {
                taskRunner.wait(j15, (int) j16);
            }
        }

        @Override // jv.e.a
        public void e(e taskRunner) {
            taskRunner.notify();
        }

        @Override // jv.e.a
        public void execute(Runnable runnable) {
            this.executor.execute(runnable);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"jv/e$d", "Ljava/lang/Runnable;", "Loq/i0;", "run", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jv.a aVarD;
            long jC;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                jv.d queue = aVarD.getQueue();
                e eVar2 = e.this;
                boolean zIsLoggable = e.INSTANCE.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jC = queue.getTaskRunner().getBackend().c();
                    b.c(aVarD, queue, "starting");
                } else {
                    jC = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        i0 i0Var = i0.f148189a;
                        if (zIsLoggable) {
                            b.c(aVarD, queue, "finished run in " + b.b(queue.getTaskRunner().getBackend().c() - jC));
                        }
                    } catch (Throwable th4) {
                        if (zIsLoggable) {
                            b.c(aVarD, queue, "failed a run in " + b.b(queue.getTaskRunner().getBackend().c() - jC));
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    eVar2.getBackend().execute(this);
                    throw th5;
                }
            }
        }
    }

    public e(a aVar) {
        this.backend = aVar;
    }

    private final void c(jv.a task, long delayNanos) {
        if (gv.d.f77110h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        jv.d queue = task.getQueue();
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.m(false);
        queue.l(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.k(task, delayNanos, true);
        }
        if (queue.e().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
    }

    private final void e(jv.a task) {
        if (gv.d.f77110h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        jv.d queue = task.getQueue();
        queue.e().remove(task);
        this.readyQueues.remove(queue);
        queue.l(task);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(jv.a task) {
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jF = task.f();
            synchronized (this) {
                c(task, jF);
                i0 i0Var = i0.f148189a;
            }
        } finally {
            synchronized (this) {
                c(task, -1L);
                i0 i0Var2 = i0.f148189a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final jv.a d() {
        boolean z15;
        if (gv.d.f77110h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jC = this.backend.c();
            Iterator<jv.d> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            jv.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                jv.a aVar2 = it.next().e().get(0);
                long jMax = Math.max(0L, aVar2.getNextExecuteNanoTime() - jC);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z15 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z15 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return aVar;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jC) {
                    this.backend.e(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jC + jMin;
            try {
                try {
                    this.backend.d(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th4) {
                this.coordinatorWaiting = false;
                throw th4;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).b();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            jv.d dVar = this.readyQueues.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    public final void h(jv.d taskQueue) {
        if (gv.d.f77110h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.e().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                gv.d.c(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.e(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final jv.d i() {
        int i15;
        synchronized (this) {
            i15 = this.nextQueueName;
            this.nextQueueName = i15 + 1;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append('Q');
        sb5.append(i15);
        return new jv.d(this, sb5.toString());
    }
}
