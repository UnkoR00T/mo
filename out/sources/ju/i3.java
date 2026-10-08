package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lju/i3;", "T", "Lou/a0;", "Ltq/i;", "context", "Ltq/e;", "uCont", "<init>", "(Ltq/i;Ltq/e;)V", "Loq/i0;", "r1", "()V", "", "oldValue", "t1", "(Ltq/i;Ljava/lang/Object;)V", "", "q1", "()Z", "p1", "state", "k1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Loq/r;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i3<T> extends ou.a0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<oq.r<tq.i, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public i3(tq.i iVar, tq.e<? super T> eVar) {
        j3 j3Var = j3.f105732a;
        super(iVar.m(j3Var) == null ? iVar.n0(j3Var) : iVar, eVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (eVar.getContext().m(tq.f.INSTANCE) instanceof l0) {
            return;
        }
        Object objI = ou.l0.i(iVar, null);
        ou.l0.f(iVar, objI);
        t1(iVar, objI);
    }

    private final void r1() {
        if (this.threadLocalIsSet) {
            oq.r<tq.i, Object> rVar = this.threadStateToRecover.get();
            if (rVar != null) {
                ou.l0.f(rVar.a(), rVar.b());
            }
            this.threadStateToRecover.remove();
        }
    }

    @Override // ou.a0, ju.a
    protected void k1(Object state) {
        r1();
        Object objA = e0.a(state, this.uCont);
        tq.e<T> eVar = this.uCont;
        tq.i context = eVar.getContext();
        Object objI = ou.l0.i(context, null);
        i3<?> i3VarM = objI != ou.l0.f150053a ? j0.m(eVar, context, objI) : null;
        try {
            this.uCont.i(objA);
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            if (i3VarM == null || i3VarM.q1()) {
                ou.l0.f(context, objI);
            }
        }
    }

    @Override // ou.a0
    public void p1() {
        r1();
    }

    public final boolean q1() {
        boolean z15 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z15;
    }

    public final void t1(tq.i context, Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(oq.y.a(context, oldValue));
    }
}
