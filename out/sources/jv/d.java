package jv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\"\u0010$\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\"\u00101\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010 \u001a\u0004\b%\u0010\u0017\"\u0004\b0\u0010#¨\u00062"}, d2 = {"Ljv/d;", "", "Ljv/e;", "taskRunner", "", "name", "<init>", "(Ljv/e;Ljava/lang/String;)V", "Ljv/a;", "task", "", "delayNanos", "Loq/i0;", "i", "(Ljv/a;J)V", "", "recurrence", "k", "(Ljv/a;JZ)Z", "a", "()V", "n", "b", "()Z", "toString", "()Ljava/lang/String;", "Ljv/e;", "h", "()Ljv/e;", "Ljava/lang/String;", "f", "c", "Z", "g", "setShutdown$okhttp", "(Z)V", "shutdown", "d", "Ljv/a;", "()Ljv/a;", "l", "(Ljv/a;)V", "activeTask", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "futureTasks", "m", "cancelActiveTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e taskRunner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a activeTask;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<a> futureTasks = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cancelActiveTask;

    public d(e eVar, String str) {
        this.taskRunner = eVar;
        this.name = str;
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            j15 = 0;
        }
        dVar.i(aVar, j15);
    }

    public final void a() {
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                if (b()) {
                    this.taskRunner.h(this);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean b() {
        a aVar = this.activeTask;
        if (aVar != null && aVar.getCancelable()) {
            this.cancelActiveTask = true;
        }
        boolean z15 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                a aVar2 = this.futureTasks.get(size);
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z15 = true;
            }
        }
        return z15;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getActiveTask() {
        return this.activeTask;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    public final List<a> e() {
        return this.futureTasks;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e getTaskRunner() {
        return this.taskRunner;
    }

    public final void i(a task, long delayNanos) {
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (k(task, delayNanos, false)) {
                    this.taskRunner.h(this);
                }
                i0 i0Var = i0.f148189a;
            } else if (task.getCancelable()) {
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long delayNanos, boolean recurrence) {
        String str;
        task.e(this);
        long jC = this.taskRunner.getBackend().c();
        long j15 = jC + delayNanos;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j15) {
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.g(j15);
        if (e.INSTANCE.a().isLoggable(Level.FINE)) {
            if (recurrence) {
                str = "run again after " + b.b(j15 - jC);
            } else {
                str = "scheduled after " + b.b(j15 - jC);
            }
            b.c(task, this, str);
        }
        Iterator<a> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - jC > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.activeTask = aVar;
    }

    public final void m(boolean z15) {
        this.cancelActiveTask = z15;
    }

    public final void n() {
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                this.shutdown = true;
                if (b()) {
                    this.taskRunner.h(this);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String toString() {
        return this.name;
    }
}
