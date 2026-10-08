package f6;

import android.os.Handler;
import android.os.Process;
import i6.i;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f59402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59403b;

        /* JADX INFO: renamed from: f6.h$a$a, reason: collision with other inner class name */
        private static class C1333a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f59404a;

            C1333a(Runnable runnable, String str, int i15) {
                super(runnable, str);
                this.f59404a = i15;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f59404a);
                super.run();
            }
        }

        a(String str, int i15) {
            this.f59402a = str;
            this.f59403b = i15;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1333a(runnable, this.f59402a, this.f59403b);
        }
    }

    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f59405a;

        b(Handler handler) {
            this.f59405a = (Handler) i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f59405a.post((Runnable) i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f59405a + " is shutting down");
        }
    }

    private static class c<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable<T> f59406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i6.a<T> f59407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f59408c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i6.a f59409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f59410b;

            a(i6.a aVar, Object obj) {
                this.f59409a = aVar;
                this.f59410b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f59409a.accept(this.f59410b);
            }
        }

        c(Handler handler, Callable<T> callable, i6.a<T> aVar) {
            this.f59406a = callable;
            this.f59407b = aVar;
            this.f59408c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f59406a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f59408c.post(new a(this.f59407b, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i15, int i16) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i16, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i15));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, i6.a<T> aVar) {
        executor.execute(new c(f6.b.a(), callable, aVar));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i15) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i15, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e15) {
            throw e15;
        } catch (ExecutionException e16) {
            throw new RuntimeException(e16);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
