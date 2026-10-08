package c3;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001d¨\u0006'"}, d2 = {"Lc3/i;", "Lc3/l;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "Lkotlin/Function1;", "", "Loq/i0;", "readObserver", "<init>", "(JLc3/q;Ler/l;)V", "x", "(Ler/l;)Lc3/l;", "o", "()V", "d", "snapshot", "m", "(Lc3/l;)V", "n", "Lc3/u0;", "state", "p", "(Lc3/u0;)V", "g", "Ler/l;", "A", "()Ler/l;", "", "h", "I", "snapshots", "", "()Z", "readOnly", "k", "writeObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> readObserver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    public i(long j15, q qVar, er.l<Object, oq.i0> lVar) {
        super(j15, qVar, null);
        this.readObserver = lVar;
        this.snapshots = 1;
    }

    @Override // c3.l
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public er.l<Object, oq.i0> g() {
        return this.readObserver;
    }

    @Override // c3.l
    public void d() {
        if (getDisposed()) {
            return;
        }
        n(this);
        super.d();
        d3.d.e(this);
    }

    @Override // c3.l
    public boolean h() {
        return true;
    }

    @Override // c3.l
    public er.l<Object, oq.i0> k() {
        return null;
    }

    @Override // c3.l
    public void m(l snapshot) {
        this.snapshots++;
    }

    @Override // c3.l
    public void n(l snapshot) {
        int i15 = this.snapshots - 1;
        this.snapshots = i15;
        if (i15 == 0) {
            b();
        }
    }

    @Override // c3.l
    public void o() {
    }

    @Override // c3.l
    public void p(u0 state) {
        w.e0();
        throw new oq.g();
    }

    @Override // c3.l
    public l x(er.l<Object, oq.i0> readObserver) {
        Map<d3.b, d3.a> mapD;
        w.m0(this);
        t2.e eVar = d3.d.f39530a;
        if (eVar != null) {
            oq.r<d3.a, Map<d3.b, d3.a>> rVarG = d3.d.g(eVar, this, true, readObserver, null);
            d3.a aVarC = rVarG.c();
            er.l<Object, oq.i0> lVarA = aVarC.a();
            aVarC.b();
            mapD = rVarG.d();
            readObserver = lVarA;
        } else {
            mapD = null;
        }
        f fVar = new f(getSnapshotId(), getInvalid(), w.O(readObserver, g(), false, 4, null), this);
        if (eVar != null) {
            d3.d.c(eVar, this, fVar, mapD);
        }
        return fVar;
    }
}
