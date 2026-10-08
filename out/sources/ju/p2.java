package ju;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0004\u001a\u0004\b%\u0010\u0007R\u001a\u0010(\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0004\u001a\u0004\b(\u0010\u0007R\u001a\u0010.\u001a\u00020*8VX\u0097\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0004\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lju/p2;", "Ltq/a;", "Lju/d2;", "<init>", "()V", "", "start", "()Z", "Loq/i0;", "T0", "(Ltq/e;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "N", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lju/i1;", "C0", "(Ler/l;)Lju/i1;", "onCancelling", "invokeImmediately", "J", "(ZZLer/l;)Lju/i1;", "cause", "u", "(Ljava/util/concurrent/CancellationException;)V", "Lju/w;", "child", "Lju/u;", "d1", "(Lju/w;)Lju/u;", "", "toString", "()Ljava/lang/String;", "h", "isActive$annotations", "isActive", "isCancelled", "isCancelled$annotations", "Lru/e;", "o1", "()Lru/e;", "getOnJoin$annotations", "onJoin", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 extends tq.a implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p2 f105770b = new p2();

    private p2() {
        super(d2.INSTANCE);
    }

    @Override // ju.d2
    @oq.a
    public i1 C0(er.l<? super Throwable, oq.i0> handler) {
        return q2.f105774a;
    }

    @Override // ju.d2
    @oq.a
    public i1 J(boolean onCancelling, boolean invokeImmediately, er.l<? super Throwable, oq.i0> handler) {
        return q2.f105774a;
    }

    @Override // ju.d2
    @oq.a
    public CancellationException N() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // ju.d2
    @oq.a
    public Object T0(tq.e<? super oq.i0> eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // ju.d2
    @oq.a
    public u d1(w child) {
        return q2.f105774a;
    }

    @Override // ju.d2
    public boolean h() {
        return true;
    }

    @Override // ju.d2
    public boolean isCancelled() {
        return false;
    }

    @Override // ju.d2
    public ru.e o1() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // ju.d2
    @oq.a
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // ju.d2
    @oq.a
    public void u(CancellationException cause) {
    }
}
