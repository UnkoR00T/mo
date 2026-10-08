package pm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class j extends bh.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f160832b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f160833a;

    public j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: pm.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: pm.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.r(runnable);
                    }
                });
            }
        });
        this.f160833a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void r(Runnable runnable) {
        f160832b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Deque deque, Runnable runnable) {
        jg.s.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f160832b.get();
        if (deque == null || deque.size() > 1) {
            this.f160833a.execute(new Runnable() { // from class: pm.v
                @Override // java.lang.Runnable
                public final void run() {
                    j.u((Deque) j.f160832b.get(), runnable);
                }
            });
        } else {
            u(deque, runnable);
        }
    }

    @Override // bh.b1
    protected final /* synthetic */ Object h() {
        return this.f160833a;
    }

    @Override // bh.u
    protected final ExecutorService m() {
        return this.f160833a;
    }
}
