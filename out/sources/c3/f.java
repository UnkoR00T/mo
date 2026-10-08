package c3;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001aR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006)"}, d2 = {"Lc3/f;", "Lc3/l;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "Lkotlin/Function1;", "", "Loq/i0;", "readObserver", "parent", "<init>", "(JLc3/q;Ler/l;Lc3/l;)V", "F", "(Ler/l;)Lc3/f;", "o", "()V", "d", "Lc3/u0;", "state", "", "E", "(Lc3/u0;)Ljava/lang/Void;", "snapshot", ip.a.f96138c, "(Lc3/l;)Ljava/lang/Void;", "C", "g", "Ler/l;", "B", "()Ler/l;", "h", "Lc3/l;", "A", "()Lc3/l;", "", "()Z", "readOnly", "k", "writeObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> readObserver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l parent;

    public f(long j15, q qVar, er.l<Object, oq.i0> lVar, l lVar2) {
        super(j15, qVar, null);
        this.readObserver = lVar;
        this.parent = lVar2;
        lVar2.m(this);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final l getParent() {
        return this.parent;
    }

    @Override // c3.l
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public er.l<Object, oq.i0> g() {
        return this.readObserver;
    }

    @Override // c3.l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void m(l snapshot) {
        i0.b();
        throw new oq.g();
    }

    @Override // c3.l
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void n(l snapshot) {
        i0.b();
        throw new oq.g();
    }

    @Override // c3.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void p(u0 state) {
        w.e0();
        throw new oq.g();
    }

    @Override // c3.l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public f x(er.l<Object, oq.i0> readObserver) {
        Map<d3.b, d3.a> mapD;
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
        f fVar = new f(getSnapshotId(), getInvalid(), w.O(readObserver, g(), false, 4, null), getParent());
        if (eVar != null) {
            d3.d.c(eVar, this, fVar, mapD);
        }
        return fVar;
    }

    @Override // c3.l
    public void d() {
        if (getDisposed()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            b();
        }
        this.parent.n(this);
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
    public void o() {
    }
}
