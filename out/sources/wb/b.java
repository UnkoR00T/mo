package wb;

import ac.n;
import android.content.Context;
import android.text.TextUtils;
import cc.WorkGenerationalId;
import cc.i0;
import cc.r1;
import dc.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ju.d2;
import ub.j0;
import ub.o0;
import ub.w;
import vb.a1;
import vb.e;
import vb.s;
import vb.u;
import vb.x;
import vb.y;
import yb.i;
import yb.l;
import yb.m;

/* JADX INFO: loaded from: classes3.dex */
public class b implements u, i, e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f211781q = w.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f211782a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wb.a f211784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f211785d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s f211788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1 f211789h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.work.a f211790j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Boolean f211792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l f211793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ec.b f211794n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d f211795p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, d2> f211783b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f211786e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f211787f = y.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<WorkGenerationalId, C5578b> f211791k = new HashMap();

    /* JADX INFO: renamed from: wb.b$b, reason: collision with other inner class name */
    private static class C5578b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f211796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f211797b;

        private C5578b(int i15, long j15) {
            this.f211796a = i15;
            this.f211797b = j15;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, s sVar, a1 a1Var, ec.b bVar) {
        this.f211782a = context;
        j0 runnableScheduler = aVar.getRunnableScheduler();
        this.f211784c = new wb.a(this, runnableScheduler, aVar.getClock());
        this.f211795p = new d(runnableScheduler, a1Var);
        this.f211794n = bVar;
        this.f211793m = new l(nVar);
        this.f211790j = aVar;
        this.f211788g = sVar;
        this.f211789h = a1Var;
    }

    private void f() {
        this.f211792l = Boolean.valueOf(t.b(this.f211782a, this.f211790j));
    }

    private void g() {
        if (this.f211785d) {
            return;
        }
        this.f211788g.e(this);
        this.f211785d = true;
    }

    private void h(WorkGenerationalId workGenerationalId) {
        d2 d2VarRemove;
        synchronized (this.f211786e) {
            d2VarRemove = this.f211783b.remove(workGenerationalId);
        }
        if (d2VarRemove != null) {
            w.e().a(f211781q, "Stopping tracking for " + workGenerationalId);
            d2VarRemove.u(null);
        }
    }

    private long i(i0 i0Var) {
        long jMax;
        synchronized (this.f211786e) {
            try {
                WorkGenerationalId workGenerationalIdA = r1.a(i0Var);
                C5578b c5578b = this.f211791k.get(workGenerationalIdA);
                if (c5578b == null) {
                    c5578b = new C5578b(i0Var.runAttemptCount, this.f211790j.getClock().a());
                    this.f211791k.put(workGenerationalIdA, c5578b);
                }
                jMax = c5578b.f211797b + (((long) Math.max((i0Var.runAttemptCount - c5578b.f211796a) - 5, 0)) * 30000);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return jMax;
    }

    @Override // yb.i
    public void a(i0 i0Var, yb.b bVar) {
        WorkGenerationalId workGenerationalIdA = r1.a(i0Var);
        if (bVar instanceof yb.b.a) {
            if (this.f211787f.e(workGenerationalIdA)) {
                return;
            }
            w.e().a(f211781q, "Constraints met: Scheduling work ID " + workGenerationalIdA);
            x xVarF = this.f211787f.f(workGenerationalIdA);
            this.f211795p.c(xVarF);
            this.f211789h.d(xVarF);
            return;
        }
        w.e().a(f211781q, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        x xVarC = this.f211787f.c(workGenerationalIdA);
        if (xVarC != null) {
            this.f211795p.b(xVarC);
            this.f211789h.e(xVarC, ((yb.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    @Override // vb.u
    public void b(String str) {
        if (this.f211792l == null) {
            f();
        }
        if (!this.f211792l.booleanValue()) {
            w.e().f(f211781q, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        w.e().a(f211781q, "Cancelling work ID " + str);
        wb.a aVar = this.f211784c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (x xVar : this.f211787f.remove(str)) {
            this.f211795p.b(xVar);
            this.f211789h.b(xVar);
        }
    }

    @Override // vb.u
    public void c(i0... i0VarArr) {
        if (this.f211792l == null) {
            f();
        }
        if (!this.f211792l.booleanValue()) {
            w.e().f(f211781q, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<i0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i0 i0Var : i0VarArr) {
            if (!this.f211787f.e(r1.a(i0Var))) {
                long jMax = Math.max(i0Var.c(), i(i0Var));
                long jA = this.f211790j.getClock().a();
                if (i0Var.state == o0.c.ENQUEUED) {
                    if (jA < jMax) {
                        wb.a aVar = this.f211784c;
                        if (aVar != null) {
                            aVar.a(i0Var, jMax);
                        }
                    } else if (i0Var.m()) {
                        ub.d dVar = i0Var.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
                        if (dVar.getRequiresDeviceIdle()) {
                            w.e().a(f211781q, "Ignoring " + i0Var + ". Requires device idle.");
                        } else if (dVar.g()) {
                            w.e().a(f211781q, "Ignoring " + i0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(i0Var);
                            hashSet2.add(i0Var.id);
                        }
                    } else if (!this.f211787f.e(r1.a(i0Var))) {
                        w.e().a(f211781q, "Starting work for " + i0Var.id);
                        x xVarD = this.f211787f.d(i0Var);
                        this.f211795p.c(xVarD);
                        this.f211789h.d(xVarD);
                    }
                }
            }
        }
        synchronized (this.f211786e) {
            try {
                if (!hashSet.isEmpty()) {
                    w.e().a(f211781q, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (i0 i0Var2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = r1.a(i0Var2);
                        if (!this.f211783b.containsKey(workGenerationalIdA)) {
                            this.f211783b.put(workGenerationalIdA, m.e(this.f211793m, i0Var2, this.f211794n.b(), this));
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // vb.e
    public void d(WorkGenerationalId workGenerationalId, boolean z15) {
        x xVarC = this.f211787f.c(workGenerationalId);
        if (xVarC != null) {
            this.f211795p.b(xVarC);
        }
        h(workGenerationalId);
        if (z15) {
            return;
        }
        synchronized (this.f211786e) {
            this.f211791k.remove(workGenerationalId);
        }
    }

    @Override // vb.u
    public boolean e() {
        return false;
    }
}
