package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lju/v2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lju/l0;", "dispatcher", "Lju/n;", "Loq/i0;", "continuation", "<init>", "(Lju/l0;Lju/n;)V", "run", "()V", "a", "Lju/l0;", "b", "Lju/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l0 dispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n<oq.i0> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(l0 l0Var, n<? super oq.i0> nVar) {
        this.dispatcher = l0Var;
        this.continuation = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.R(this.dispatcher, oq.i0.f148189a);
    }
}
