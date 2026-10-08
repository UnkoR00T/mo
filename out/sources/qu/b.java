package qu;

import java.util.concurrent.Executor;
import ju.l0;
import ju.t1;
import lr.m;
import ou.f0;
import ou.h0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lqu/b;", "Lju/t1;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Loq/i0;", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lju/l0;", "S1", "(ILjava/lang/String;)Lju/l0;", "Ltq/i;", "context", "Lkotlinx/coroutines/Runnable;", "block", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "K1", "close", "toString", "()Ljava/lang/String;", "e", "Lju/l0;", "default", "d2", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends t1 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f168923d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final l0 default = l0.T1(k.f168941c, h0.e("kotlinx.coroutines.io.parallelism", m.e(64, f0.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        default.F1(context, block);
    }

    @Override // ju.l0
    public void K1(tq.i context, Runnable block) {
        default.K1(context, block);
    }

    @Override // ju.l0
    public l0 S1(int parallelism, String name) {
        return k.f168941c.S1(parallelism, name);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // ju.t1
    /* JADX INFO: renamed from: d2 */
    public Executor getExecutor() {
        return this;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        F1(tq.j.f191408a, command);
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }
}
