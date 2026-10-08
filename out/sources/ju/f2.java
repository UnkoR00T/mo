package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lju/f2;", "Lju/j2;", "Lju/a0;", "Lju/d2;", "parent", "<init>", "(Lju/d2;)V", "", "k1", "()Z", "y", "", "exception", "p", "(Ljava/lang/Throwable;)Z", "c", "Z", "l0", "handlesException", "o0", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f2 extends j2 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesException;

    public f2(d2 d2Var) {
        super(true);
        y0(d2Var);
        this.handlesException = k1();
    }

    private final boolean k1() {
        j2 j2VarV;
        u uVarR0 = r0();
        v vVar = uVarR0 instanceof v ? (v) uVarR0 : null;
        if (vVar != null && (j2VarV = vVar.v()) != null) {
            while (!j2VarV.getHandlesException()) {
                u uVarR1 = j2VarV.r0();
                v vVar2 = uVarR1 instanceof v ? (v) uVarR1 : null;
                if (vVar2 == null || (j2VarV = vVar2.v()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ju.j2
    /* JADX INFO: renamed from: l0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // ju.j2
    public boolean o0() {
        return true;
    }

    @Override // ju.a0
    public boolean p(Throwable exception) {
        return F0(new c0(exception, false, 2, null));
    }

    @Override // ju.a0
    public boolean y() {
        return F0(oq.i0.f148189a);
    }
}
