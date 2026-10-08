package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010,\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010\f¨\u0006-"}, d2 = {"Lju/m1;", "Lju/l0;", "<init>", "()V", "", "unconfined", "", "j2", "(Z)J", "P2", "()J", "Q2", "()Z", "R2", "Lju/d1;", "task", "Loq/i0;", "t2", "(Lju/d1;)V", "y2", "(Z)V", "d2", "", "parallelism", "", "name", "S1", "(ILjava/lang/String;)Lju/l0;", "shutdown", "c", "J", "useCount", "d", "Z", "shared", "Lpq/m;", "e", "Lpq/m;", "unconfinedQueue", "v2", "nextTime", "I2", "isUnconfinedLoopActive", "N2", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m1 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private pq.m<d1<?>> unconfinedQueue;

    public static /* synthetic */ void A2(m1 m1Var, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        m1Var.y2(z15);
    }

    public static /* synthetic */ void i2(m1 m1Var, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        m1Var.d2(z15);
    }

    private final long j2(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public final boolean I2() {
        return this.useCount >= j2(true);
    }

    public final boolean N2() {
        pq.m<d1<?>> mVar = this.unconfinedQueue;
        if (mVar != null) {
            return mVar.isEmpty();
        }
        return true;
    }

    public long P2() {
        return !Q2() ? Long.MAX_VALUE : 0L;
    }

    public final boolean Q2() {
        d1<?> d1VarA;
        pq.m<d1<?>> mVar = this.unconfinedQueue;
        if (mVar == null || (d1VarA = mVar.A()) == null) {
            return false;
        }
        d1VarA.run();
        return true;
    }

    public boolean R2() {
        return false;
    }

    @Override // ju.l0
    public final l0 S1(int parallelism, String name) {
        ou.m.a(parallelism);
        return ou.m.b(this, name);
    }

    public final void d2(boolean unconfined) {
        long jJ2 = this.useCount - j2(unconfined);
        this.useCount = jJ2;
        if (jJ2 <= 0 && this.shared) {
            shutdown();
        }
    }

    public void shutdown() {
    }

    public final void t2(d1<?> task) {
        pq.m<d1<?>> mVar = this.unconfinedQueue;
        if (mVar == null) {
            mVar = new pq.m<>();
            this.unconfinedQueue = mVar;
        }
        mVar.addLast(task);
    }

    protected long v2() {
        pq.m<d1<?>> mVar = this.unconfinedQueue;
        return (mVar == null || mVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void y2(boolean unconfined) {
        this.useCount += j2(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }
}
