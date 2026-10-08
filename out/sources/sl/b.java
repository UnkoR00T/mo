package sl;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sl.a f182157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile sl.a f182158b;

    /* JADX INFO: renamed from: sl.b$b, reason: collision with other inner class name */
    private static class C4687b implements sl.a {
        private C4687b() {
        }

        @Override // sl.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i15, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i15, i15, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C4687b c4687b = new C4687b();
        f182157a = c4687b;
        f182158b = c4687b;
    }

    public static sl.a a() {
        return f182158b;
    }
}
