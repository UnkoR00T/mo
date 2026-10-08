package dc;

import androidx.work.impl.WorkDatabase;
import cc.j0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import oq.i0;
import p071kotlin.Metadata;
import ub.o0;
import vb.e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvb/e1;", "workManagerImpl", "", "workSpecId", "Loq/i0;", "d", "(Lvb/e1;Ljava/lang/String;)V", "k", "(Lvb/e1;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "j", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Lub/a0;", "e", "(Ljava/util/UUID;Lvb/e1;)Lub/a0;", "name", "h", "(Ljava/lang/String;Lvb/e1;)V", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    private static final void d(e1 e1Var, String str) {
        j(e1Var.u(), str);
        e1Var.r().p(str, 1);
        Iterator<vb.u> it = e1Var.s().iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    public static final ub.a0 e(final UUID uuid, final e1 e1Var) {
        return ub.e0.c(e1Var.n().getTracer(), "CancelWorkById", e1Var.v().c(), new er.a() { // from class: dc.b
            @Override // er.a
            public final Object a() {
                return e.f(e1Var, uuid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final e1 e1Var, final UUID uuid) {
        e1Var.u().T(new Runnable() { // from class: dc.d
            @Override // java.lang.Runnable
            public final void run() {
                e.g(e1Var, uuid);
            }
        });
        k(e1Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e1 e1Var, UUID uuid) {
        d(e1Var, uuid.toString());
    }

    public static final void h(final String str, final e1 e1Var) {
        final WorkDatabase workDatabaseU = e1Var.u();
        workDatabaseU.T(new Runnable() { // from class: dc.c
            @Override // java.lang.Runnable
            public final void run() {
                e.i(workDatabaseU, str, e1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WorkDatabase workDatabase, String str, e1 e1Var) {
        Iterator<String> it = workDatabase.e0().g(str).iterator();
        while (it.hasNext()) {
            d(e1Var, it.next());
        }
    }

    private static final void j(WorkDatabase workDatabase, String str) {
        j0 j0VarE0 = workDatabase.e0();
        cc.b bVarZ = workDatabase.Z();
        List listT = pq.v.t(str);
        while (!listT.isEmpty()) {
            String str2 = (String) pq.v.M(listT);
            o0.c cVarH = j0VarE0.h(str2);
            if (cVarH != o0.c.SUCCEEDED && cVarH != o0.c.FAILED) {
                j0VarE0.j(str2);
            }
            listT.addAll(bVarZ.a(str2));
        }
    }

    private static final void k(e1 e1Var) {
        androidx.work.impl.a.f(e1Var.n(), e1Var.u(), e1Var.s());
    }
}
