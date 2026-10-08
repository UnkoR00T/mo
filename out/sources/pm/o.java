package pm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f160877b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f160876a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f160878c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f160879d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f160876a) {
            try {
                if (this.f160878c.isEmpty()) {
                    this.f160877b = false;
                } else {
                    i0 i0Var = (i0) this.f160878c.remove();
                    e(i0Var.f160830a, i0Var.f160831b);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: pm.g0
                @Override // java.lang.Runnable
                public final void run() {
                    k0 k0Var = new k0(this.f160825a, null);
                    try {
                        runnable.run();
                        k0Var.close();
                    } catch (Throwable th4) {
                        try {
                            k0Var.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f160876a) {
            try {
                if (this.f160877b) {
                    this.f160878c.add(new i0(executor, runnable, null));
                } else {
                    this.f160877b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
