package com.google.android.libraries.places.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class sl0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f33694c = Logger.getLogger(sl0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayDeque f33696b;

    sl0() {
    }

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f33696b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th4) {
                f33694c.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th4);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zj.p.r(runnable, "'task' must not be null.");
        if (this.f33695a) {
            if (this.f33696b == null) {
                this.f33696b = new ArrayDeque(4);
            }
            this.f33696b.add(runnable);
            return;
        }
        this.f33695a = true;
        try {
            runnable.run();
            if (this.f33696b != null) {
                a();
            }
            this.f33695a = false;
        } catch (Throwable th4) {
            try {
                Logger logger = f33694c;
                Level level = Level.SEVERE;
                String strValueOf = String.valueOf(runnable);
                StringBuilder sb5 = new StringBuilder(strValueOf.length() + 35);
                sb5.append("Exception while executing runnable ");
                sb5.append(strValueOf);
                logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb5.toString(), th4);
                if (this.f33696b != null) {
                }
            } finally {
                if (this.f33696b != null) {
                    a();
                }
                this.f33695a = false;
            }
        }
    }
}
