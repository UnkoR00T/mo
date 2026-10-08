package com.google.android.libraries.places.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class wl0 implements Executor, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f34175d = Logger.getLogger(wl0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final tl0 f34176e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f34177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f34178b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f34179c = 0;

    static {
        tl0 vl0Var;
        byte[] bArr = null;
        try {
            vl0Var = new ul0(AtomicIntegerFieldUpdater.newUpdater(wl0.class, "c"), bArr);
        } catch (Throwable th4) {
            f34175d.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th4);
            vl0Var = new vl0(bArr);
        }
        f34176e = vl0Var;
    }

    public wl0(Executor executor) {
        zj.p.r(executor, "'executor' must not be null.");
        this.f34177a = executor;
    }

    private final void d(Runnable runnable) {
        if (f34176e.a(this, 0, -1)) {
            try {
                this.f34177a.execute(this);
            } catch (Throwable th4) {
                if (runnable != null) {
                    this.f34178b.remove(runnable);
                }
                f34176e.b(this, 0);
                throw th4;
            }
        }
    }

    final /* synthetic */ int a() {
        return this.f34179c;
    }

    final /* synthetic */ void c(int i15) {
        this.f34179c = i15;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34178b.add((Runnable) zj.p.r(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.f34178b.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e15) {
                    Logger logger = f34175d;
                    Level level = Level.SEVERE;
                    String string = runnable.toString();
                    StringBuilder sb5 = new StringBuilder(string.length() + 35);
                    sb5.append("Exception while executing runnable ");
                    sb5.append(string);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb5.toString(), (Throwable) e15);
                }
            } catch (Throwable th4) {
                f34176e.b(this, 0);
                throw th4;
            }
        }
        f34176e.b(this, 0);
        if (this.f34178b.isEmpty()) {
            return;
        }
        d(null);
    }
}
