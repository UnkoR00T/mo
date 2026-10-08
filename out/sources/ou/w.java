package ou;

import ju.i1;
import ju.v0;
import ju.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lou/w;", "Lju/l0;", "Lju/y0;", "dispatcher", "", "name", "<init>", "(Lju/l0;Ljava/lang/String;)V", "Ltq/i;", "context", "", "P1", "(Ltq/i;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "K1", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lju/n;", "continuation", "E", "(JLju/n;)V", "Lju/i1;", "O0", "(JLjava/lang/Runnable;Ltq/i;)Lju/i1;", "d", "Lju/l0;", "e", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends ju.l0 implements y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y0 f150083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ju.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public w(ju.l0 l0Var, String str) {
        y0 y0Var = l0Var instanceof y0 ? (y0) l0Var : null;
        this.f150083c = y0Var == null ? v0.a() : y0Var;
        this.dispatcher = l0Var;
        this.name = str;
    }

    @Override // ju.y0
    public void E(long timeMillis, ju.n<? super oq.i0> continuation) {
        this.f150083c.E(timeMillis, continuation);
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        this.dispatcher.F1(context, block);
    }

    @Override // ju.l0
    public void K1(tq.i context, Runnable block) {
        this.dispatcher.K1(context, block);
    }

    @Override // ju.y0
    public i1 O0(long timeMillis, Runnable block, tq.i context) {
        return this.f150083c.O0(timeMillis, block, context);
    }

    @Override // ju.l0
    public boolean P1(tq.i context) {
        return this.dispatcher.P1(context);
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }
}
