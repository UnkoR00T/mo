package qu;

import fr.p0;
import fr.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ju.t0;
import lr.m;
import oq.i0;
import oq.p;
import ou.e0;
import ou.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0003ADFB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020H8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u001e\u0010Q\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0011\u0010R\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bR\u0010\u001fR\u000b\u0010T\u001a\u00020S8\u0002X\u0082\u0004R\u000b\u0010U\u001a\u00020S8\u0002X\u0082\u0004R\u000b\u0010W\u001a\u00020V8\u0002X\u0082\u0004¨\u0006Y"}, d2 = {"Lqu/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lqu/h;", "task", "", "m", "(Lqu/h;)Z", "Lqu/a$c;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Lqu/a$c;", "worker", "K", "(Lqu/a$c;)I", "stateSnapshot", "Loq/i0;", "Z", "(J)V", "state", "n0", "(J)Z", "u0", "()Z", "p", "()I", "fair", "d0", "(Lqu/a$c;Lqu/h;Z)Lqu/h;", "u", "oldIndex", "newIndex", "N", "(Lqu/a$c;II)V", "M", "(Lqu/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "V", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "y", "(Ljava/lang/Runnable;ZZ)V", "r", "(Ljava/lang/Runnable;Z)Lqu/h;", "b0", "toString", "()Ljava/lang/String;", "O", "(Lqu/h;)V", "a", "I", "b", "c", "J", "d", "Ljava/lang/String;", "Lqu/d;", "e", "Lqu/d;", "globalCpuQueue", "f", "globalBlockingQueue", "Lou/z;", "g", "Lou/z;", "workers", "isTerminated", "Liu/d;", "parkedWorkersStack", "controlState", "Liu/a;", "_isTerminated", "h", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f168895j = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f168896k = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f168897l = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e0 f168898m = new e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long idleWorkerKeepAliveNs;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String schedulerName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final qu.d globalCpuQueue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final qu.d globalBlockingQueue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z<c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168906a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f168906a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lqu/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f168922g = wq.b.a(b());
    }

    public a(int i15, int i16, long j15, String str) {
        this.corePoolSize = i15;
        this.maxPoolSize = i16;
        this.idleWorkerKeepAliveNs = j15;
        this.schedulerName = str;
        if (i15 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i15 + " should be at least 1").toString());
        }
        if (i16 < i15) {
            throw new IllegalArgumentException(("Max pool size " + i16 + " should be greater than or equals to core pool size " + i15).toString());
        }
        if (i16 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i16 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j15 > 0) {
            this.globalCpuQueue = new qu.d();
            this.globalBlockingQueue = new qu.d();
            this.workers = new z<>((i15 + 1) * 2);
            this.controlState$volatile = ((long) i15) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j15 + " must be positive").toString());
    }

    public static /* synthetic */ void C(a aVar, Runnable runnable, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        aVar.y(runnable, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater E() {
        return f168896k;
    }

    private final int K(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f168898m) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    private final c L() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f168895j;
        while (true) {
            long j15 = atomicLongFieldUpdater.get(this);
            c cVarB = this.workers.b((int) (2097151 & j15));
            if (cVarB == null) {
                return null;
            }
            long j16 = (2097152 + j15) & (-2097152);
            int iK = K(cVarB);
            if (iK >= 0 && f168895j.compareAndSet(this, j15, ((long) iK) | j16)) {
                cVarB.o(f168898m);
                return cVarB;
            }
        }
    }

    private final void Z(long stateSnapshot) {
        if (u0() || n0(stateSnapshot)) {
            return;
        }
        u0();
    }

    private final h d0(c cVar, h hVar, boolean z15) {
        d dVar;
        if (cVar == null || (dVar = cVar.state) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.taskContext && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(hVar, z15);
    }

    private final boolean m(h task) {
        return task.taskContext ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final boolean n0(long state) {
        if (m.e(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iP = p();
            if (iP == 1 && this.corePoolSize > 1) {
                p();
            }
            if (iP > 0) {
                return true;
            }
        }
        return false;
    }

    private final int p() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j15 = f168896k.get(this);
                int i15 = (int) (j15 & 2097151);
                int iE = m.e(i15 - ((int) ((j15 & 4398044413952L) >> 21)), 0);
                if (iE >= this.corePoolSize) {
                    return 0;
                }
                if (i15 >= this.maxPoolSize) {
                    return 0;
                }
                int i16 = ((int) (E().get(this) & 2097151)) + 1;
                if (i16 <= 0 || this.workers.b(i16) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i16);
                this.workers.c(i16, cVar);
                if (i16 != ((int) (2097151 & f168896k.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i17 = iE + 1;
                cVar.start();
                return i17;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static /* synthetic */ boolean t0(a aVar, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = f168896k.get(aVar);
        }
        return aVar.n0(j15);
    }

    private final c u() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !t.c(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean u0() {
        c cVarL;
        do {
            cVarL = L();
            if (cVarL == null) {
                return false;
            }
        } while (!c.f168907j.compareAndSet(cVarL, -1, 0));
        LockSupport.unpark(cVarL);
        return true;
    }

    public final boolean M(c worker) {
        long j15;
        int indexInArray;
        if (worker.getNextParkedWorker() != f168898m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f168895j;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            indexInArray = worker.getIndexInArray();
            worker.o(this.workers.b((int) (2097151 & j15)));
        } while (!f168895j.compareAndSet(this, j15, ((2097152 + j15) & (-2097152)) | ((long) indexInArray)));
        return true;
    }

    public final void N(c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f168895j;
        while (true) {
            long j15 = atomicLongFieldUpdater.get(this);
            int iK = (int) (2097151 & j15);
            long j16 = (2097152 + j15) & (-2097152);
            if (iK == oldIndex) {
                iK = newIndex == 0 ? K(worker) : newIndex;
            }
            if (iK >= 0) {
                if (f168895j.compareAndSet(this, j15, j16 | ((long) iK))) {
                    return;
                }
            }
        }
    }

    public final void O(h task) {
        try {
            task.run();
            ju.c.a();
        } catch (Throwable th4) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th4);
            } finally {
                ju.c.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    public final void V(long timeout) throws InterruptedException {
        int i15;
        h hVarE;
        if (f168897l.compareAndSet(this, 0, 1)) {
            c cVarU = u();
            synchronized (this.workers) {
                i15 = (int) (E().get(this) & 2097151);
            }
            if (1 <= i15) {
                int i16 = 1;
                while (true) {
                    c cVarB = this.workers.b(i16);
                    if (cVarB != cVarU) {
                        while (cVarB.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVarB);
                            cVarB.join(timeout);
                        }
                        cVarB.localQueue.j(this.globalBlockingQueue);
                    }
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (cVarU == null) {
                    hVarE = this.globalCpuQueue.e();
                    if (hVarE == null && (hVarE = this.globalBlockingQueue.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarU.e(true);
                    if (hVarE == null) {
                        hVarE = this.globalCpuQueue.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                O(hVarE);
            }
            if (cVarU != null) {
                cVarU.r(d.TERMINATED);
            }
            f168895j.set(this, 0L);
            f168896k.set(this, 0L);
        }
    }

    public final void b0() {
        if (u0() || t0(this, 0L, 1, null)) {
            return;
        }
        u0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        V(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        C(this, command, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f168897l.get(this) == 1;
    }

    public final h r(Runnable block, boolean taskContext) {
        long jA = j.f168940f.a();
        if (!(block instanceof h)) {
            return j.b(block, jA, taskContext);
        }
        h hVar = (h) block;
        hVar.submissionTime = jA;
        hVar.taskContext = taskContext;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.workers.a();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i25 = 1; i25 < iA; i25++) {
            c cVarB = this.workers.b(i25);
            if (cVarB != null) {
                int i26 = cVarB.localQueue.i();
                int i27 = b.f168906a[cVarB.state.ordinal()];
                if (i27 == 1) {
                    i17++;
                } else if (i27 == 2) {
                    i16++;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i26);
                    sb5.append('b');
                    arrayList.add(sb5.toString());
                } else if (i27 == 3) {
                    i15++;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i26);
                    sb6.append('c');
                    arrayList.add(sb6.toString());
                } else if (i27 == 4) {
                    i18++;
                    if (i26 > 0) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(i26);
                        sb7.append('d');
                        arrayList.add(sb7.toString());
                    }
                } else {
                    if (i27 != 5) {
                        throw new p();
                    }
                    i19++;
                }
            }
        }
        long j15 = f168896k.get(this);
        return this.schedulerName + '@' + t0.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i15 + ", blocking = " + i16 + ", parked = " + i17 + ", dormant = " + i18 + ", terminated = " + i19 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (2097151 & j15)) + ", blocking tasks = " + ((int) ((4398044413952L & j15) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j15) >> 42))) + "}]";
    }

    public final void y(Runnable block, boolean taskContext, boolean fair) {
        ju.c.a();
        h hVarR = r(block, taskContext);
        boolean z15 = hVarR.taskContext;
        long jAddAndGet = z15 ? f168896k.addAndGet(this, 2097152L) : 0L;
        h hVarD0 = d0(u(), hVarR, fair);
        if (hVarD0 != null && !m(hVarD0)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z15) {
            Z(jAddAndGet);
        } else {
            b0();
        }
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\u0010\u001c\u001a\u00060\u0004j\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0019R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00107\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00109R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00109R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010DR\b\u0010F\u001a\u00020E8\u0006¨\u0006G"}, d2 = {"Lqu/a$c;", "Ljava/lang/Thread;", "<init>", "(Lqu/a;)V", "", "index", "(Lqu/a;I)V", "", "p", "()Z", "Loq/i0;", "m", "()V", "q", "i", "Lqu/h;", "task", "b", "(Lqu/h;)V", "k", "t", "d", "()Lqu/h;", "scanLocalQueue", "c", "(Z)Lqu/h;", "l", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "s", "(I)Lqu/h;", "Lqu/a$d;", "newState", "r", "(Lqu/a$d;)Z", "run", "upperBound", "j", "(I)I", "mayHaveLocalTasks", "e", "indexInArray", "I", "f", "()I", "n", "(I)V", "Lqu/l;", "a", "Lqu/l;", "localQueue", "Lfr/p0;", "Lfr/p0;", "stolenTask", "Lqu/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Liu/c;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c extends Thread {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f168907j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final l localQueue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p0<h> stolenTask;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public d state;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long terminationDeadline;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long minDelayUntilStealableTaskNs;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int rngState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.localQueue = new l();
            this.stolenTask = new p0<>();
            this.state = d.DORMANT;
            this.nextParkedWorker = a.f168898m;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h task) {
            this.terminationDeadline = 0L;
            if (this.state == d.PARKING) {
                this.state = d.BLOCKING;
            }
            if (!task.taskContext) {
                a.this.O(task);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.b0();
            }
            a.this.O(task);
            a.E().addAndGet(a.this, -2097152L);
            if (this.state != d.TERMINATED) {
                this.state = d.DORMANT;
            }
        }

        private final h c(boolean scanLocalQueue) {
            h hVarL;
            h hVarL2;
            if (scanLocalQueue) {
                boolean z15 = j(a.this.corePoolSize * 2) == 0;
                if (z15 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.localQueue.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z15 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.localQueue.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVarE = a.this.globalBlockingQueue.e();
            return hVarE == null ? s(1) : hVarE;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f168898m;
        }

        private final void k() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVarE = a.this.globalCpuQueue.e();
                return hVarE != null ? hVarE : a.this.globalBlockingQueue.e();
            }
            h hVarE2 = a.this.globalBlockingQueue.e();
            return hVarE2 != null ? hVarE2 : a.this.globalCpuQueue.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z15 = false;
                while (true) {
                    if (a.this.isTerminated() || this.state == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarE = e(this.mayHaveLocalTasks);
                    if (hVarE != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        b(hVarE);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        q();
                    } else {
                        if (z15) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z15 = true;
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j15;
            if (this.state == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterE = a.E();
            do {
                j15 = atomicLongFieldUpdaterE.get(aVar);
                if (((int) ((9223367638808264704L & j15) >> 42)) == 0) {
                    return false;
                }
            } while (!a.E().compareAndSet(aVar, j15, j15 - 4398046511104L));
            this.state = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.M(this);
                return;
            }
            f168907j.set(this, -1);
            while (i() && f168907j.get(this) == -1 && !a.this.isTerminated() && this.state != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int stealingMode) {
            int i15 = (int) (a.E().get(a.this) & 2097151);
            if (i15 < 2) {
                return null;
            }
            int iJ = j(i15);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i16 = 0; i16 < i15; i16++) {
                iJ++;
                if (iJ > i15) {
                    iJ = 1;
                }
                c cVarB = aVar.workers.b(iJ);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.localQueue.r(stealingMode, this.stolenTask);
                    if (jR == -1) {
                        p0<h> p0Var = this.stolenTask;
                        h hVar = p0Var.f66410a;
                        p0Var.f66410a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.workers) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.E().get(aVar) & 2097151)) <= aVar.corePoolSize) {
                        return;
                    }
                    if (f168907j.compareAndSet(this, -1, 1)) {
                        int i15 = this.indexInArray;
                        n(0);
                        aVar.N(this, i15, 0);
                        int andDecrement = (int) (a.E().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i15) {
                            c cVarB = aVar.workers.b(andDecrement);
                            aVar.workers.c(i15, cVarB);
                            cVarB.n(i15);
                            aVar.N(cVarB, andDecrement, i15);
                        }
                        aVar.workers.c(andDecrement, null);
                        i0 i0Var = i0.f148189a;
                        this.state = d.TERMINATED;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public final h e(boolean mayHaveLocalTasks) {
            return p() ? c(mayHaveLocalTasks) : d();
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int j(int upperBound) {
            int i15 = this.rngState;
            int i16 = i15 ^ (i15 << 13);
            int i17 = i16 ^ (i16 >> 17);
            int i18 = i17 ^ (i17 << 5);
            this.rngState = i18;
            int i19 = upperBound - 1;
            return (i19 & upperBound) == 0 ? i18 & i19 : (i18 & Integer.MAX_VALUE) % upperBound;
        }

        public final void n(int i15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a.this.schedulerName);
            sb5.append("-worker-");
            sb5.append(i15 == 0 ? "TERMINATED" : String.valueOf(i15));
            setName(sb5.toString());
            this.indexInArray = i15;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d newState) {
            d dVar = this.state;
            boolean z15 = dVar == d.CPU_ACQUIRED;
            if (z15) {
                a.E().addAndGet(a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z15;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i15) {
            this();
            n(i15);
        }
    }
}
