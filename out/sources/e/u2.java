package e;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b \u0010\u0017R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\"\u0010,\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b#\u0010\u0013\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Le/u2;", "", "Lju/p0;", "scope", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Lju/l0;", "backgroundDispatcher", "<init>", "(Lju/p0;Ljava/util/concurrent/Executor;Lju/l0;)V", "", "g", "()Z", "Loq/i0;", "c", "()V", "a", "Lju/p0;", "d", "()Lju/p0;", "b", "Ljava/util/concurrent/Executor;", "getBackgroundExecutor", "()Ljava/util/concurrent/Executor;", "Lju/l0;", "getBackgroundDispatcher", "()Lju/l0;", "Landroid/os/Handler;", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler", "e", "sequentialExecutorDelegate", "Ljava/lang/ThreadLocal;", "f", "Ljava/lang/ThreadLocal;", "isSequentialThread", "sequentialExecutor", "h", "sequentialDispatcher", "i", "setSequentialScope", "(Lju/p0;)V", "sequentialScope", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Executor backgroundExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ju.l0 backgroundDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Executor sequentialExecutorDelegate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Executor sequentialExecutor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ju.l0 sequentialDispatcher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ju.p0 sequentialScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<Boolean> isSequentialThread = new ThreadLocal<>();

    public u2(ju.p0 p0Var, Executor executor, ju.l0 l0Var) {
        this.scope = p0Var;
        this.backgroundExecutor = executor;
        this.backgroundDispatcher = l0Var;
        this.sequentialExecutorDelegate = z.a.f(executor);
        Executor executor2 = new Executor() { // from class: e.s2
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                u2.h(this.f46300a, runnable);
            }
        };
        this.sequentialExecutor = executor2;
        ju.l0 l0VarB = ju.v1.b(executor2);
        this.sequentialDispatcher = l0VarB;
        this.sequentialScope = ju.q0.a(p0Var.getCoroutineContext().n0(z2.b(null, 1, null)).n0(l0VarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final u2 u2Var, final Runnable runnable) {
        u2Var.sequentialExecutorDelegate.execute(new Runnable() { // from class: e.t2
            @Override // java.lang.Runnable
            public final void run() {
                u2.i(this.f46353a, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(u2 u2Var, Runnable runnable) {
        u2Var.isSequentialThread.set(Boolean.TRUE);
        try {
            runnable.run();
        } finally {
            u2Var.isSequentialThread.remove();
        }
    }

    public final void c() {
        if (g()) {
            return;
        }
        throw new IllegalStateException(("Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: " + Thread.currentThread().getName()).toString());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ju.p0 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Executor getSequentialExecutor() {
        return this.sequentialExecutor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ju.p0 getSequentialScope() {
        return this.sequentialScope;
    }

    public final boolean g() {
        return fr.t.c(this.isSequentialThread.get(), Boolean.TRUE);
    }
}
