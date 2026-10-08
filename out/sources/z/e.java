package z;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class e implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Executor f230988b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f230989a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f230990a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f230990a.getAndIncrement())));
            return thread;
        }
    }

    e() {
    }

    static Executor a() {
        if (f230988b != null) {
            return f230988b;
        }
        synchronized (e.class) {
            try {
                if (f230988b == null) {
                    f230988b = new e();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f230988b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f230989a.execute(runnable);
    }
}
