package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lju/t2;", "T", "Lju/i2;", "Lju/p;", "continuation", "<init>", "(Lju/p;)V", "", "cause", "Loq/i0;", "x", "(Ljava/lang/Throwable;)V", "e", "Lju/p;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t2<T> extends i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(p<? super T> pVar) {
        this.continuation = pVar;
    }

    @Override // ju.i2
    public boolean w() {
        return false;
    }

    @Override // ju.i2
    public void x(Throwable cause) {
        Object objS0 = v().s0();
        if (objS0 instanceof c0) {
            p<T> pVar = this.continuation;
            oq.t.Companion companion = oq.t.INSTANCE;
            pVar.i(oq.t.b(oq.u.a(((c0) objS0).cause)));
        } else {
            p<T> pVar2 = this.continuation;
            oq.t.Companion companion2 = oq.t.INSTANCE;
            pVar2.i(oq.t.b(k2.h(objS0)));
        }
    }
}
