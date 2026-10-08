package c3;

import java.util.Set;
import p071kotlin.Metadata;
import p076m2.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 22\u00020\u0001:\u0001$B\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH ¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0010¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010*\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00109\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u00107\u0012\u0004\b8\u0010\u000bR$\u0010=\u001a\u00020!2\u0006\u0010*\u001a\u00020!8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b:\u0010#\"\u0004\b;\u0010<R\u0014\u0010?\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u00103R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X¡\u0004¢\u0006\f\u0012\u0004\bB\u0010\u000b\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X \u0004¢\u0006\u0006\u001a\u0004\bC\u0010A\u0082\u0001\u0004EFGH¨\u0006I"}, d2 = {"Lc3/l;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "<init>", "(JLc3/q;)V", "Loq/i0;", "d", "()V", "Lkotlin/Function1;", "readObserver", "x", "(Ler/l;)Lc3/l;", "l", "()Lc3/l;", "snapshot", "s", "(Lc3/l;)V", "m", "n", "Lc3/u0;", "state", "p", "(Lc3/u0;)V", "o", "b", "c", "r", "z", "q", "", "y", "()I", "a", "Lc3/q;", "f", "()Lc3/q;", "u", "(Lc3/q;)V", "value", "J", "i", "()J", "v", "(J)V", "", "Z", "e", "()Z", "t", "(Z)V", "disposed", "I", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "j", "w", "(I)V", "writeCount", "h", "readOnly", "g", "()Ler/l;", "getReadObserver$annotations", "k", "writeObserver", "Lc3/d;", "Lc3/f;", "Lc3/i;", "Lc3/z0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22830f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private q invalid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long snapshotId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinningTrackingHandle;

    /* JADX INFO: renamed from: c3.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001c2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Lc3/l$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Loq/i0;", "readObserver", "Lc3/l;", "p", "(Ler/l;)Lc3/l;", "writeObserver", "Lc3/d;", "n", "(Ler/l;Ler/l;)Lc3/d;", "T", "Lkotlin/Function0;", "block", "g", "(Ler/l;Ler/l;Ler/a;)Ljava/lang/Object;", "previous", "e", "(Lc3/l;)Lc3/l;", "nonObservable", "observer", "l", "(Lc3/l;Lc3/l;Ler/l;)V", "Lkotlin/Function2;", "", "Lc3/g;", "h", "(Ler/p;)Lc3/g;", "j", "(Ler/l;)Lc3/g;", "f", "m", "c", "()Lc3/l;", "current", "d", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(er.p pVar) {
            synchronized (w.M()) {
                w.f22915i = pq.v.I0(w.f22915i, pVar);
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(er.l lVar) {
            synchronized (w.M()) {
                w.f22916j = pq.v.I0(w.f22916j, lVar);
                oq.i0 i0Var = oq.i0.f148189a;
            }
            w.E();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d o(Companion companion, er.l lVar, er.l lVar2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                lVar = null;
            }
            if ((i15 & 2) != 0) {
                lVar2 = null;
            }
            return companion.n(lVar, lVar2);
        }

        public final l c() {
            return w.K();
        }

        public final l d() {
            return (l) w.f22909c.a();
        }

        public final l e(l previous) {
            if (previous instanceof y0) {
                y0 y0Var = (y0) previous;
                if (y0Var.getThreadId() == y2.a0.a()) {
                    y0Var.Y(null);
                    return previous;
                }
            }
            if (previous instanceof z0) {
                z0 z0Var = (z0) previous;
                if (z0Var.C() == y2.a0.a()) {
                    z0Var.F(null);
                    return previous;
                }
            }
            l lVarH = w.H(previous, null, false, 6, null);
            lVarH.l();
            return lVarH;
        }

        public final void f() {
            w.K().o();
        }

        public final <T> T g(er.l<Object, oq.i0> readObserver, er.l<Object, oq.i0> writeObserver, er.a<? extends T> block) {
            l y0Var;
            if (readObserver == null && writeObserver == null) {
                return block.a();
            }
            l lVar = (l) w.f22909c.a();
            if (lVar instanceof y0) {
                y0 y0Var2 = (y0) lVar;
                if (y0Var2.getThreadId() == y2.a0.a()) {
                    er.l<Object, oq.i0> lVarH = y0Var2.g();
                    er.l<Object, oq.i0> lVarK = y0Var2.k();
                    try {
                        ((y0) lVar).Y(w.O(readObserver, lVarH, false, 4, null));
                        ((y0) lVar).Z(w.Q(writeObserver, lVarK));
                        return block.a();
                    } finally {
                        y0Var2.Y(lVarH);
                        y0Var2.Z(lVarK);
                    }
                }
            }
            if (lVar == null || (lVar instanceof d)) {
                y0Var = new y0(lVar instanceof d ? (d) lVar : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.a();
                }
                y0Var = lVar.x(readObserver);
            }
            try {
                l lVarL = y0Var.l();
                try {
                    T tA = block.a();
                    y0Var.s(lVarL);
                    y0Var.d();
                    return tA;
                } catch (Throwable th4) {
                    y0Var.s(lVarL);
                    throw th4;
                }
            } catch (Throwable th5) {
                y0Var.d();
                throw th5;
            }
        }

        public final g h(final er.p<? super Set<? extends Object>, ? super l, oq.i0> observer) {
            w.D(w.f22907a);
            synchronized (w.M()) {
                w.f22915i = pq.v.M0(w.f22915i, observer);
                oq.i0 i0Var = oq.i0.f148189a;
            }
            return new g() { // from class: c3.k
                @Override // c3.g
                public final void j() {
                    l.Companion.i(observer);
                }
            };
        }

        public final g j(final er.l<Object, oq.i0> observer) {
            synchronized (w.M()) {
                w.f22916j = pq.v.M0(w.f22916j, observer);
                oq.i0 i0Var = oq.i0.f148189a;
            }
            w.E();
            return new g() { // from class: c3.j
                @Override // c3.g
                public final void j() {
                    l.Companion.k(observer);
                }
            };
        }

        public final void l(l previous, l nonObservable, er.l<Object, oq.i0> observer) {
            if (previous != nonObservable) {
                nonObservable.s(previous);
                nonObservable.d();
            } else if (previous instanceof y0) {
                ((y0) previous).Y(observer);
            } else {
                if (previous instanceof z0) {
                    ((z0) previous).F(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        public final void m() {
            boolean zI;
            synchronized (w.M()) {
                zI = w.f22917k.I();
            }
            if (zI) {
                w.E();
            }
        }

        public final d n(er.l<Object, oq.i0> readObserver, er.l<Object, oq.i0> writeObserver) {
            d dVarR;
            l lVarK = w.K();
            d dVar = lVarK instanceof d ? (d) lVarK : null;
            if (dVar == null || (dVarR = dVar.R(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return dVarR;
        }

        public final l p(er.l<Object, oq.i0> readObserver) {
            return w.K().x(readObserver);
        }

        private Companion() {
        }
    }

    public /* synthetic */ l(long j15, q qVar, fr.k kVar) {
        this(j15, qVar);
    }

    public final void b() {
        synchronized (w.M()) {
            c();
            r();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public void c() {
        w.f22911e = w.f22911e.l(getSnapshotId());
    }

    public void d() {
        this.disposed = true;
        synchronized (w.M()) {
            q();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public q getInvalid() {
        return this.invalid;
    }

    public abstract er.l<Object, oq.i0> g();

    public abstract boolean h();

    /* JADX INFO: renamed from: i, reason: from getter */
    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int j() {
        return 0;
    }

    public abstract er.l<Object, oq.i0> k();

    public l l() {
        l lVar = (l) w.f22909c.a();
        w.f22909c.b(this);
        return lVar;
    }

    public abstract void m(l snapshot);

    public abstract void n(l snapshot);

    public abstract void o();

    public abstract void p(u0 state);

    public final void q() {
        int i15 = this.pinningTrackingHandle;
        if (i15 >= 0) {
            w.d0(i15);
            this.pinningTrackingHandle = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(l snapshot) {
        w.f22909c.b(snapshot);
    }

    public final void t(boolean z15) {
        this.disposed = z15;
    }

    public void u(q qVar) {
        this.invalid = qVar;
    }

    public void v(long j15) {
        this.snapshotId = j15;
    }

    public void w(int i15) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract l x(er.l<Object, oq.i0> readObserver);

    public final int y() {
        int i15 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i15;
    }

    public final void z() {
        if (this.disposed) {
            w3.a("Cannot use a disposed snapshot");
        }
    }

    private l(long j15, q qVar) {
        this.invalid = qVar;
        this.snapshotId = j15;
        this.pinningTrackingHandle = j15 != w.f22908b ? w.i0(j15, getInvalid()) : -1;
    }
}
