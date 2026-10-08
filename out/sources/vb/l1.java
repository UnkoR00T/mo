package vb;

import androidx.work.impl.WorkDatabase;
import cc.t1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvb/s;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Lvb/u;", "schedulers", "Lcc/i0;", "newWorkSpec", "", "", "tags", "Lub/p0$b;", "h", "(Lvb/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lcc/i0;Ljava/util/Set;)Lub/p0$b;", "Lvb/e1;", "name", "Lub/q0;", "workRequest", "Lub/a0;", "e", "(Lvb/e1;Ljava/lang/String;Lub/q0;)Lub/a0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {
    public static final ub.a0 e(final e1 e1Var, final String str, final ub.q0 q0Var) {
        return ub.e0.c(e1Var.n().getTracer(), "enqueueUniquePeriodic_" + str, e1Var.v().c(), new er.a() { // from class: vb.h1
            @Override // er.a
            public final Object a() {
                return l1.f(e1Var, str, q0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(final e1 e1Var, final String str, final ub.q0 q0Var) {
        er.a aVar = new er.a() { // from class: vb.i1
            @Override // er.a
            public final Object a() {
                return l1.g(q0Var, e1Var, str);
            }
        };
        cc.j0 j0VarE0 = e1Var.u().e0();
        List<cc.i0.IdAndState> listP = j0VarE0.p(str);
        if (listP.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        cc.i0.IdAndState idAndState = (cc.i0.IdAndState) pq.v.n0(listP);
        if (idAndState == null) {
            aVar.a();
            return oq.i0.f148189a;
        }
        cc.i0 i0VarI = j0VarE0.i(idAndState.id);
        if (i0VarI == null) {
            throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + str + "\", wasn't found");
        }
        if (!i0VarI.o()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (idAndState.state == ub.o0.c.CANCELLED) {
            j0VarE0.a(idAndState.id);
            aVar.a();
            return oq.i0.f148189a;
        }
        h(e1Var.r(), e1Var.u(), e1Var.n(), e1Var.s(), cc.i0.e(q0Var.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null), q0Var.c());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(ub.q0 q0Var, e1 e1Var, String str) {
        dc.f.b(new e0(e1Var, str, ub.j.KEEP, pq.v.e(q0Var)));
        return oq.i0.f148189a;
    }

    private static final ub.p0.b h(s sVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List<? extends u> list, final cc.i0 i0Var, final Set<String> set) {
        final String str = i0Var.id;
        final cc.i0 i0VarI = workDatabase.e0().i(str);
        if (i0VarI == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (i0VarI.state.e()) {
            return ub.p0.b.NOT_APPLIED;
        }
        if (i0VarI.o() ^ i0Var.o()) {
            er.l lVar = new er.l() { // from class: vb.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return l1.i((cc.i0) obj);
                }
            };
            throw new UnsupportedOperationException("Can't update " + ((String) lVar.b(i0VarI)) + " Worker to " + ((String) lVar.b(i0Var)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = sVar.k(str);
        if (!zK) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((u) it.next()).b(str);
            }
        }
        workDatabase.T(new Runnable() { // from class: vb.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.j(workDatabase, i0VarI, i0Var, list, str, set, zK);
            }
        });
        if (!zK) {
            androidx.work.impl.a.f(aVar, workDatabase, list);
        }
        return zK ? ub.p0.b.APPLIED_FOR_NEXT_RUN : ub.p0.b.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(cc.i0 i0Var) {
        return i0Var.o() ? "Periodic" : "OneTime";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WorkDatabase workDatabase, cc.i0 i0Var, cc.i0 i0Var2, List list, String str, Set set, boolean z15) {
        cc.j0 j0VarE0 = workDatabase.e0();
        t1 t1VarF0 = workDatabase.f0();
        cc.i0 i0VarE = cc.i0.e(i0Var2, null, i0Var.state, null, null, null, null, 0L, 0L, 0L, null, i0Var.runAttemptCount, null, 0L, i0Var.lastEnqueueTime, 0L, 0L, false, null, i0Var.getPeriodCount(), i0Var.getGeneration() + 1, i0Var.getNextScheduleTimeOverride(), i0Var.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
        if (i0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
            i0VarE.p(i0Var2.getNextScheduleTimeOverride());
            i0VarE.q(i0VarE.getNextScheduleTimeOverrideGeneration() + 1);
        }
        j0VarE0.z(dc.g.c(list, i0VarE));
        t1VarF0.b(str);
        t1VarF0.d(str, set);
        if (z15) {
            return;
        }
        j0VarE0.o(str, -1L);
        workDatabase.d0().a(str);
    }
}
