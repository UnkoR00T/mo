package c3;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lc3/e;", "Lc3/d;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "Lkotlin/Function1;", "", "Loq/i0;", "readObserver", "writeObserver", "parent", "<init>", "(JLc3/q;Ler/l;Ler/l;Lc3/d;)V", "U", "()V", "d", "Lc3/n;", "C", "()Lc3/n;", "s", "Lc3/d;", "getParent", "()Lc3/d;", "", "t", "Z", "deactivated", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final d parent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean deactivated;

    public e(long j15, q qVar, er.l<Object, oq.i0> lVar, er.l<Object, oq.i0> lVar2, d dVar) {
        super(j15, qVar, lVar, lVar2);
        this.parent = dVar;
        dVar.m(this);
    }

    private final void U() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.n(this);
    }

    @Override // c3.d
    public n C() throws Throwable {
        e eVar;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new n.a(this);
        }
        r0.u0<u0> u0VarE = E();
        long snapshotId = getSnapshotId();
        Map<w0, ? extends w0> mapW = u0VarE != null ? w.W(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (w.M()) {
            try {
                w.m0(this);
                try {
                    if (u0VarE == null || u0VarE.get_size() == 0) {
                        eVar = this;
                        b();
                        oq.i0 i0Var = oq.i0.f148189a;
                    } else {
                        eVar = this;
                        n nVarJ = eVar.J(this.parent.getSnapshotId(), u0VarE, mapW, this.parent.getInvalid());
                        if (!fr.t.c(nVarJ, n.b.f22864a)) {
                            return nVarJ;
                        }
                        r0.u0<u0> u0VarE2 = eVar.parent.E();
                        if (u0VarE2 != null) {
                            u0VarE2.k(u0VarE);
                        } else {
                            eVar.parent.Q(u0VarE);
                            Q(null);
                        }
                    }
                    if (fr.t.e(eVar.parent.getSnapshotId(), snapshotId) < 0) {
                        eVar.parent.B();
                    }
                    d dVar = eVar.parent;
                    dVar.u(dVar.getInvalid().l(snapshotId).k(getPreviousIds()));
                    eVar.parent.K(snapshotId);
                    eVar.parent.M(y());
                    eVar.parent.L(getPreviousIds());
                    eVar.parent.N(getPreviousPinnedSnapshots());
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    P(true);
                    U();
                    d3.d.d(this, u0VarE);
                    return n.b.f22864a;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // c3.d, c3.l
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        U();
    }
}
