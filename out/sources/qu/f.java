package qu;

import java.util.concurrent.Executor;
import ju.t1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001a\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u000f\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lqu/f;", "Lju/t1;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lqu/a;", "i2", "()Lqu/a;", "Ltq/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "K1", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "j2", "(Ljava/lang/Runnable;ZZ)V", "d", "I", "e", "f", "J", "g", "Ljava/lang/String;", "h", "Lqu/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "d2", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f extends t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int corePoolSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int maxPoolSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String schedulerName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a coroutineScheduler = i2();

    public f(int i15, int i16, long j15, String str) {
        this.corePoolSize = i15;
        this.maxPoolSize = i16;
        this.idleWorkerKeepAliveNs = j15;
        this.schedulerName = str;
    }

    private final a i2() {
        return new a(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        a.C(this.coroutineScheduler, block, false, false, 6, null);
    }

    @Override // ju.l0
    public void K1(tq.i context, Runnable block) {
        a.C(this.coroutineScheduler, block, false, true, 2, null);
    }

    @Override // ju.t1
    /* JADX INFO: renamed from: d2 */
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void j2(Runnable block, boolean context, boolean fair) {
        this.coroutineScheduler.y(block, context, fair);
    }
}
