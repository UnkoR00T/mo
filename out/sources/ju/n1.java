package ju;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004@ABCB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:098\u0002X\u0082\u0004R\u0013\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<098\u0002X\u0082\u0004R\u000b\u0010?\u001a\u00020>8\u0002X\u0082\u0004¨\u0006D"}, d2 = {"Lju/n1;", "Lju/o1;", "Lju/y0;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "D3", "(Ljava/lang/Runnable;)Z", "s3", "()Ljava/lang/Runnable;", "Loq/i0;", "C3", "o3", "Lju/n1$c;", "j4", "(Lju/n1$c;)Z", "", "now", "delayedTask", "", "g4", "(JLju/n1$c;)I", "U3", "shutdown", "timeMillis", "Lju/n;", "continuation", "E", "(JLju/n;)V", "block", "Lju/i1;", "h4", "(JLjava/lang/Runnable;)Lju/i1;", "P2", "()J", "Ltq/i;", "context", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "A3", "(Ljava/lang/Runnable;)V", "Z3", "(JLju/n1$c;)V", "X3", "value", "r", "()Z", "i4", "(Z)V", "isCompleted", "Q3", "isEmpty", "v2", "nextTime", "Liu/e;", "", "_queue", "Lju/n1$d;", "_delayed", "Liu/a;", "_isCompleted", "c", "a", "b", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n1 extends o1 implements y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105753f = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105754g = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105755h = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lju/n1$a;", "Lju/n1$c;", "", "nanoTime", "Lju/n;", "Loq/i0;", "cont", "<init>", "(Lju/n1;JLju/n;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Lju/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final n<oq.i0> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j15, n<? super oq.i0> nVar) {
            super(j15);
            this.cont = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.R(n1.this, oq.i0.f148189a);
        }

        @Override // ju.n1.c
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lju/n1$b;", "Lju/n1$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "Loq/i0;", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Runnable block;

        public b(long j15, Runnable runnable) {
            super(j15);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // ju.n1.c
        public String toString() {
            return super.toString() + this.block;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lju/n1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lju/i1;", "Lou/q0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "k", "(Lju/n1$c;)I", "now", "", "n", "(J)Z", "Lju/n1$d;", "delayed", "Lju/n1;", "eventLoop", "l", "(JLju/n1$d;Lju/n1;)I", "Loq/i0;", "j", "()V", "", "toString", "()Ljava/lang/String;", "a", "J", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lou/p0;", "value", "e", "()Lou/p0;", "g", "(Lou/p0;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements Runnable, Comparable<c>, i1, ou.q0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public long nanoTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        public c(long j15) {
            this.nanoTime = j15;
        }

        @Override // ou.q0
        public ou.p0<?> e() {
            Object obj = this._heap;
            if (obj instanceof ou.p0) {
                return (ou.p0) obj;
            }
            return null;
        }

        @Override // ou.q0
        public void g(ou.p0<?> p0Var) {
            if (this._heap == q1.f105772a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = p0Var;
        }

        @Override // ou.q0
        public int getIndex() {
            return this.index;
        }

        @Override // ju.i1
        public final void j() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == q1.f105772a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = q1.f105772a;
                    oq.i0 i0Var = oq.i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            long j15 = this.nanoTime - other.nanoTime;
            if (j15 > 0) {
                return 1;
            }
            return j15 < 0 ? -1 : 0;
        }

        public final int l(long now, d delayed, n1 eventLoop) {
            synchronized (this) {
                if (this._heap == q1.f105772a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarB = delayed.b();
                        if (eventLoop.r()) {
                            return 1;
                        }
                        if (cVarB == null) {
                            delayed.timeNow = now;
                        } else {
                            long j15 = cVarB.nanoTime;
                            if (j15 - now < 0) {
                                now = j15;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j16 = this.nanoTime;
                        long j17 = delayed.timeNow;
                        if (j16 - j17 < 0) {
                            this.nanoTime = j17;
                        }
                        delayed.a(this);
                        return 0;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }

        public final boolean n(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // ou.q0
        public void setIndex(int i15) {
            this.index = i15;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lju/n1$d;", "Lou/p0;", "Lju/n1$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends ou.p0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long timeNow;

        public d(long j15) {
            this.timeNow = j15;
        }
    }

    private final void C3() {
        c cVarI;
        d dVar = (d) f105754g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        ju.c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c cVarB = dVar.b();
                    cVarI = null;
                    if (cVarB != null) {
                        c cVar = cVarB;
                        cVarI = cVar.n(jNanoTime) ? D3(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } while (cVarI != null);
    }

    private final boolean D3(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105753f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (r()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f105753f, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof ou.r) {
                ou.r rVar = (ou.r) obj;
                int iA = rVar.a(task);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f105753f, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == q1.f105773b) {
                    return false;
                }
                ou.r rVar2 = new ou.r(8, true);
                rVar2.a((Runnable) obj);
                rVar2.a(task);
                if (androidx.concurrent.futures.b.a(f105753f, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    private final void U3() {
        c cVarJ;
        ju.c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f105754g.get(this);
            if (dVar == null || (cVarJ = dVar.j()) == null) {
                return;
            } else {
                e3(jNanoTime, cVarJ);
            }
        }
    }

    private final int g4(long now, c delayedTask) {
        if (r()) {
            return 1;
        }
        d dVar = (d) f105754g.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f105754g, this, null, new d(now));
            dVar = (d) f105754g.get(this);
        }
        return delayedTask.l(now, dVar, this);
    }

    private final void i4(boolean z15) {
        f105755h.set(this, z15 ? 1 : 0);
    }

    private final boolean j4(c task) {
        d dVar = (d) f105754g.get(this);
        return (dVar != null ? dVar.f() : null) == task;
    }

    private final void o3() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105753f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f105753f, this, null, q1.f105773b)) {
                    return;
                }
            } else if (obj instanceof ou.r) {
                ((ou.r) obj).d();
                return;
            } else {
                if (obj == q1.f105773b) {
                    return;
                }
                ou.r rVar = new ou.r(8, true);
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f105753f, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return f105755h.get(this) == 1;
    }

    private final Runnable s3() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105753f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof ou.r) {
                ou.r rVar = (ou.r) obj;
                Object objM = rVar.m();
                if (objM != ou.r.f150071h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f105753f, this, obj, rVar.l());
            } else {
                if (obj == q1.f105773b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f105753f, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void A3(Runnable task) {
        C3();
        if (D3(task)) {
            i3();
        } else {
            u0.f105786j.A3(task);
        }
    }

    @Override // ju.y0
    public void E(long timeMillis, n<? super oq.i0> continuation) {
        long jC = q1.c(timeMillis);
        if (jC < 4611686018427387903L) {
            ju.c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, continuation);
            Z3(jNanoTime, aVar);
            r.a(continuation, aVar);
        }
    }

    @Override // ju.l0
    public final void F1(tq.i context, Runnable block) {
        A3(block);
    }

    @Override // ju.y0
    public i1 O0(long j15, Runnable runnable, tq.i iVar) {
        return y0.a.a(this, j15, runnable, iVar);
    }

    @Override // ju.m1
    public long P2() {
        if (Q2()) {
            return 0L;
        }
        C3();
        Runnable runnableS3 = s3();
        if (runnableS3 == null) {
            return v2();
        }
        runnableS3.run();
        return 0L;
    }

    protected boolean Q3() {
        if (!N2()) {
            return false;
        }
        d dVar = (d) f105754g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f105753f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof ou.r) {
            return ((ou.r) obj).j();
        }
        return obj == q1.f105773b;
    }

    protected final void X3() {
        f105753f.set(this, null);
        f105754g.set(this, null);
    }

    public final void Z3(long now, c delayedTask) {
        int iG4 = g4(now, delayedTask);
        if (iG4 == 0) {
            if (j4(delayedTask)) {
                i3();
            }
        } else if (iG4 == 1) {
            e3(now, delayedTask);
        } else if (iG4 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final i1 h4(long timeMillis, Runnable block) {
        long jC = q1.c(timeMillis);
        if (jC >= 4611686018427387903L) {
            return q2.f105774a;
        }
        ju.c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, block);
        Z3(jNanoTime, bVar);
        return bVar;
    }

    @Override // ju.m1
    public void shutdown() {
        c3.f105666a.c();
        i4(true);
        o3();
        while (P2() <= 0) {
        }
        U3();
    }

    @Override // ju.m1
    protected long v2() {
        c cVarF;
        if (super.v2() == 0) {
            return 0L;
        }
        Object obj = f105753f.get(this);
        if (obj != null) {
            if (!(obj instanceof ou.r)) {
                return obj == q1.f105773b ? Long.MAX_VALUE : 0L;
            }
            if (!((ou.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f105754g.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j15 = cVarF.nanoTime;
        ju.c.a();
        return lr.m.f(j15 - System.nanoTime(), 0L);
    }
}
