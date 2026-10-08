package z;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class d implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Executor f230985b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f230986a = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    static Executor a() {
        if (f230985b != null) {
            return f230985b;
        }
        synchronized (d.class) {
            try {
                if (f230985b == null) {
                    f230985b = new d();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f230985b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f230986a.execute(runnable);
    }
}
