package ou;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ju.i1;
import ju.v0;
import ju.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0015\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010.\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u000b\u00105\u001a\u0002048\u0002X\u0082\u0004¨\u00067"}, d2 = {"Lou/l;", "Lju/l0;", "Lju/y0;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lju/l0;ILjava/lang/String;)V", "", "A2", "()Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "y2", "()Ljava/lang/Runnable;", "S1", "(ILjava/lang/String;)Lju/l0;", "Ltq/i;", "context", "block", "Loq/i0;", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "K1", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lju/n;", "continuation", "E", "(JLju/n;)V", "Lju/i1;", "O0", "(JLjava/lang/Runnable;Ltq/i;)Lju/i1;", "d", "Lju/l0;", "e", "I", "f", "Ljava/lang/String;", "Lou/q;", "g", "Lou/q;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "Liu/c;", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends ju.l0 implements y0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f150044j = AtomicIntegerFieldUpdater.newUpdater(l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y0 f150045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ju.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final q<Runnable> queue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lou/l$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lou/l;Ljava/lang/Runnable;)V", "Loq/i0;", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Runnable currentTask;

        public a(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i15 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th4) {
                    ju.n0.a(tq.j.f191408a, th4);
                }
                try {
                    Runnable runnableY2 = l.this.y2();
                    if (runnableY2 == null) {
                        return;
                    }
                    this.currentTask = runnableY2;
                    i15++;
                    if (i15 >= 16 && j.d(l.this.dispatcher, l.this)) {
                        j.c(l.this.dispatcher, l.this, this);
                        return;
                    }
                } catch (Throwable th5) {
                    Object obj = l.this.workerAllocationLock;
                    l lVar = l.this;
                    synchronized (obj) {
                        l.v2().decrementAndGet(lVar);
                        throw th5;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(ju.l0 l0Var, int i15, String str) {
        y0 y0Var = l0Var instanceof y0 ? (y0) l0Var : null;
        this.f150045c = y0Var == null ? v0.a() : y0Var;
        this.dispatcher = l0Var;
        this.parallelism = i15;
        this.name = str;
        this.queue = new q<>(false);
        this.workerAllocationLock = new Object();
    }

    private final boolean A2() {
        synchronized (this.workerAllocationLock) {
            if (f150044j.get(this) >= this.parallelism) {
                return false;
            }
            f150044j.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater v2() {
        return f150044j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable y2() {
        while (true) {
            Runnable runnableE = this.queue.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.workerAllocationLock) {
                f150044j.decrementAndGet(this);
                if (this.queue.c() == 0) {
                    return null;
                }
                f150044j.incrementAndGet(this);
            }
        }
    }

    @Override // ju.y0
    public void E(long timeMillis, ju.n<? super oq.i0> continuation) {
        this.f150045c.E(timeMillis, continuation);
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        Runnable runnableY2;
        this.queue.a(block);
        if (f150044j.get(this) >= this.parallelism || !A2() || (runnableY2 = y2()) == null) {
            return;
        }
        try {
            j.c(this.dispatcher, this, new a(runnableY2));
        } catch (Throwable th4) {
            f150044j.decrementAndGet(this);
            throw th4;
        }
    }

    @Override // ju.l0
    public void K1(tq.i context, Runnable block) {
        Runnable runnableY2;
        this.queue.a(block);
        if (f150044j.get(this) >= this.parallelism || !A2() || (runnableY2 = y2()) == null) {
            return;
        }
        try {
            this.dispatcher.K1(this, new a(runnableY2));
        } catch (Throwable th4) {
            f150044j.decrementAndGet(this);
            throw th4;
        }
    }

    @Override // ju.y0
    public i1 O0(long timeMillis, Runnable block, tq.i context) {
        return this.f150045c.O0(timeMillis, block, context);
    }

    @Override // ju.l0
    public ju.l0 S1(int parallelism, String name) {
        m.a(parallelism);
        return parallelism >= this.parallelism ? m.b(this, name) : super.S1(parallelism, name);
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }
}
