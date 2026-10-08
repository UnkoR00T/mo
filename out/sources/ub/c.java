package ub;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ju.v1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "e", "(Z)Ljava/util/concurrent/Executor;", "Lub/l0;", "f", "()Lub/l0;", "Ltq/i;", "d", "(Ltq/i;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"ub/c$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicInteger threadCount = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f197068b;

        a(boolean z15) {
            this.f197068b = z15;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f197068b ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"ub/c$b", "Lub/l0;", "", "isEnabled", "()Z", "", AnnotatedPrivateKey.LABEL, "Loq/i0;", "a", "(Ljava/lang/String;)V", "d", "()V", "methodName", "", "cookie", "c", "(Ljava/lang/String;I)V", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements l0 {
        b() {
        }

        @Override // ub.l0
        public void a(String label) {
            eb.a.c(label);
        }

        @Override // ub.l0
        public void b(String methodName, int cookie) throws Throwable {
            eb.a.d(methodName, cookie);
        }

        @Override // ub.l0
        public void c(String methodName, int cookie) throws Throwable {
            eb.a.a(methodName, cookie);
        }

        @Override // ub.l0
        public void d() {
            eb.a.f();
        }

        @Override // ub.l0
        public boolean isEnabled() {
            return eb.a.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor d(tq.i iVar) {
        tq.f fVar = iVar != null ? (tq.f) iVar.m(tq.f.INSTANCE) : null;
        ju.l0 l0Var = fVar instanceof ju.l0 ? (ju.l0) fVar : null;
        if (l0Var != null) {
            return v1.a(l0Var);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor e(boolean z15) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 f() {
        return new b();
    }
}
