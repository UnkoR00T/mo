package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import cc.WorkGenerationalId;
import cc.i0;
import cc.j0;
import dc.r;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.x509.DisplayText;
import ub.w;
import vb.e;
import vb.s;
import vb.u;
import xb.f;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13842a = w.i("Schedulers");

    public static /* synthetic */ void b(List list, WorkGenerationalId workGenerationalId, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((u) it.next()).b(workGenerationalId.getWorkSpecId());
        }
        f(aVar, workDatabase, list);
    }

    static u c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        f fVar = new f(context, workDatabase, aVar);
        r.c(context, SystemJobService.class, true);
        w.e().a(f13842a, "Created SystemJobScheduler and enabled SystemJobService");
        return fVar;
    }

    private static void d(j0 j0Var, ub.b bVar, List<i0> list) {
        if (list.size() > 0) {
            long jA = bVar.a();
            Iterator<i0> it = list.iterator();
            while (it.hasNext()) {
                j0Var.o(it.next().id, jA);
            }
        }
    }

    public static void e(final List<u> list, s sVar, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        sVar.e(new e() { // from class: vb.v
            @Override // vb.e
            public final void d(WorkGenerationalId workGenerationalId, boolean z15) {
                executor.execute(new Runnable() { // from class: vb.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.work.impl.a.b(list, workGenerationalId, aVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(androidx.work.a aVar, WorkDatabase workDatabase, List<u> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        j0 j0VarE0 = workDatabase.e0();
        workDatabase.i();
        try {
            List<i0> listV = j0VarE0.v();
            d(j0VarE0, aVar.getClock(), listV);
            List<i0> listR = j0VarE0.r(aVar.getMaxSchedulerLimit());
            d(j0VarE0, aVar.getClock(), listR);
            if (listV != null) {
                listR.addAll(listV);
            }
            List<i0> listL = j0VarE0.l(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            workDatabase.X();
            workDatabase.q();
            if (listR.size() > 0) {
                i0[] i0VarArr = (i0[]) listR.toArray(new i0[listR.size()]);
                for (u uVar : list) {
                    if (uVar.e()) {
                        uVar.c(i0VarArr);
                    }
                }
            }
            if (listL.size() > 0) {
                i0[] i0VarArr2 = (i0[]) listL.toArray(new i0[listL.size()]);
                for (u uVar2 : list) {
                    if (!uVar2.e()) {
                        uVar2.c(i0VarArr2);
                    }
                }
            }
        } catch (Throwable th4) {
            workDatabase.q();
            throw th4;
        }
    }
}
