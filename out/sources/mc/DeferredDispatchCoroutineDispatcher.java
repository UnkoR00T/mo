package mc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ju.g1;
import ju.l0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mc.g, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000b\u0010%\u001a\u00020$8\u0002X\u0082\u0004¨\u0006&"}, d2 = {"Lmc/g;", "Lju/l0;", "delegate", "<init>", "(Lju/l0;)V", "Ltq/i;", "context", "", "P1", "(Ltq/i;)Z", "", "parallelism", "", "name", "S1", "(ILjava/lang/String;)Lju/l0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "K1", "toString", "()Ljava/lang/String;", "c", "Lju/l0;", "d2", "()Lju/l0;", "currentDispatcher", "<set-?>", "getUnconfined", "()Z", "j2", "(Z)V", "unconfined", "Liu/a;", "_unconfined", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DeferredDispatchCoroutineDispatcher extends l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f125356e = AtomicIntegerFieldUpdater.newUpdater(DeferredDispatchCoroutineDispatcher.class, "d");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l0 delegate;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile /* synthetic */ int f125358d = 1;

    public DeferredDispatchCoroutineDispatcher(l0 l0Var) {
        this.delegate = l0Var;
    }

    private final l0 d2() {
        return f125356e.get(this) == 1 ? g1.d() : this.delegate;
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        d2().F1(context, block);
    }

    @Override // ju.l0
    public void K1(tq.i context, Runnable block) {
        d2().K1(context, block);
    }

    @Override // ju.l0
    public boolean P1(tq.i context) {
        return d2().P1(context);
    }

    @Override // ju.l0
    public l0 S1(int parallelism, String name) {
        return d2().S1(parallelism, name);
    }

    public final void j2(boolean z15) {
        this.f125358d = z15 ? 1 : 0;
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.delegate + ")";
    }
}
