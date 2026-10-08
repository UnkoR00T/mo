package c3;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0011\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lc3/b;", "Lc3/d;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "<init>", "(JLc3/q;)V", "Lkotlin/Function1;", "", "Loq/i0;", "readObserver", "Lc3/l;", "x", "(Ler/l;)Lc3/l;", "writeObserver", "R", "(Ler/l;Ler/l;)Lc3/d;", "o", "()V", "snapshot", "", "X", "(Lc3/l;)Ljava/lang/Void;", "W", "Lc3/n;", "C", "()Lc3/n;", "d", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.l<q, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<Object, oq.i0> f22788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Object, oq.i0> f22789b;

        a(er.l<Object, oq.i0> lVar, er.l<Object, oq.i0> lVar2) {
            this.f22788a = lVar;
            this.f22789b = lVar2;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d b(q qVar) {
            long j15;
            synchronized (w.M()) {
                j15 = w.f22912f;
                w.f22912f += (long) 1;
            }
            return new d(j15, qVar, this.f22788a, this.f22789b);
        }
    }

    /* JADX INFO: renamed from: c3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C0603b implements er.l<q, i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<Object, oq.i0> f22790a;

        C0603b(er.l<Object, oq.i0> lVar) {
            this.f22790a = lVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final i b(q qVar) {
            long j15;
            synchronized (w.M()) {
                j15 = w.f22912f;
                w.f22912f += (long) 1;
            }
            return new i(j15, qVar, this.f22790a);
        }
    }

    public b(long j15, q qVar) {
        super(j15, qVar, null, new er.l() { // from class: c3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.V(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(Object obj) {
        synchronized (w.M()) {
            List list = w.f22916j;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((er.l) list.get(i15)).b(obj);
            }
        }
        return oq.i0.f148189a;
    }

    @Override // c3.d
    public n C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // c3.d
    public d R(er.l<Object, oq.i0> readObserver, er.l<Object, oq.i0> writeObserver) {
        er.l<Object, oq.i0> lVar;
        Map<d3.b, d3.a> mapD;
        t2.e eVar = d3.d.f39530a;
        if (eVar != null) {
            oq.r<d3.a, Map<d3.b, d3.a>> rVarG = d3.d.g(eVar, null, false, readObserver, writeObserver);
            d3.a aVarC = rVarG.c();
            er.l<Object, oq.i0> lVarA = aVarC.a();
            er.l<Object, oq.i0> lVarB = aVarC.b();
            mapD = rVarG.d();
            readObserver = lVarA;
            lVar = lVarB;
        } else {
            lVar = writeObserver;
            mapD = null;
        }
        d dVar = (d) w.g0(new a(readObserver, lVar));
        if (eVar != null) {
            d3.d.c(eVar, null, dVar, mapD);
        }
        return dVar;
    }

    @Override // c3.d, c3.l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void m(l snapshot) {
        i0.b();
        throw new oq.g();
    }

    @Override // c3.d, c3.l
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void n(l snapshot) {
        i0.b();
        throw new oq.g();
    }

    @Override // c3.d, c3.l
    public void d() {
        synchronized (w.M()) {
            q();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // c3.d, c3.l
    public void o() {
        w.E();
    }

    @Override // c3.d, c3.l
    public l x(er.l<Object, oq.i0> readObserver) {
        Map<d3.b, d3.a> mapD;
        t2.e eVar = d3.d.f39530a;
        if (eVar != null) {
            oq.r<d3.a, Map<d3.b, d3.a>> rVarG = d3.d.g(eVar, null, true, readObserver, null);
            d3.a aVarC = rVarG.c();
            er.l<Object, oq.i0> lVarA = aVarC.a();
            aVarC.b();
            mapD = rVarG.d();
            readObserver = lVarA;
        } else {
            mapD = null;
        }
        i iVar = (i) w.g0(new C0603b(readObserver));
        if (eVar != null) {
            d3.d.c(eVar, null, iVar, mapD);
        }
        return iVar;
    }
}
