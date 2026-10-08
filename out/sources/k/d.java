package k;

import android.os.Process;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0013*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lk/d;", "", "<init>", "()V", "", "androidPriority", "d", "(I)I", "Ljava/util/concurrent/ThreadFactory;", "h", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ThreadFactory;", "", "namePrefix", "k", "(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;", "threads", "Ljava/util/concurrent/ExecutorService;", "e", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "f", "(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ScheduledExecutorService;", "", "b", "[I", "NICE_VALUES", "c", "Ljava/util/concurrent/ThreadFactory;", "g", "()Ljava/util/concurrent/ThreadFactory;", "factory", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f107032a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int[] NICE_VALUES = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ThreadFactory factory = Executors.defaultThreadFactory();

    private d() {
    }

    private final int d(int androidPriority) {
        int length = NICE_VALUES.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (androidPriority >= NICE_VALUES[i15]) {
                return i15 + 1;
            }
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread i(final int i15, ThreadFactory threadFactory, final Runnable runnable) {
        int iD = f107032a.d(i15);
        Thread threadNewThread = threadFactory.newThread(new Runnable() { // from class: k.c
            @Override // java.lang.Runnable
            public final void run() {
                d.j(i15, runnable);
            }
        });
        threadNewThread.setPriority(iD);
        return threadNewThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(int i15, Runnable runnable) {
        Process.setThreadPriority(i15);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread l(ThreadFactory threadFactory, String str, iu.c cVar, Runnable runnable) {
        Thread threadNewThread = threadFactory.newThread(runnable);
        threadNewThread.setName(str + fu.r.E0(String.valueOf(cVar.d()), 2, '0'));
        return threadNewThread;
    }

    public final ExecutorService e(ThreadFactory threadFactory, int i15) {
        if (i15 > 0) {
            return Executors.newFixedThreadPool(i15, threadFactory);
        }
        throw new IllegalArgumentException(("Threads (" + i15 + ") must be > 0").toString());
    }

    public final ScheduledExecutorService f(ThreadFactory threadFactory, int i15) {
        if (i15 > 0) {
            return Executors.newScheduledThreadPool(i15, threadFactory);
        }
        throw new IllegalArgumentException(("Threads (" + i15 + ") must be > 0").toString());
    }

    public final ThreadFactory g() {
        return factory;
    }

    public final ThreadFactory h(final ThreadFactory threadFactory, final int i15) {
        return new ThreadFactory() { // from class: k.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.i(i15, threadFactory, runnable);
            }
        };
    }

    public final ThreadFactory k(final ThreadFactory threadFactory, final String str) {
        final iu.c cVarC = iu.b.c(0);
        return new ThreadFactory() { // from class: k.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.l(threadFactory, str, cVarC, runnable);
            }
        };
    }
}
