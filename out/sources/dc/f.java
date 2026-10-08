package dc;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import cc.i0;
import cc.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ub.o0;
import ub.q0;
import vb.e1;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40759a = ub.w.i("EnqueueRunnable");

    public static boolean a(vb.e0 e0Var) {
        e1 e1VarH = e0Var.h();
        WorkDatabase workDatabaseU = e1VarH.u();
        workDatabaseU.i();
        try {
            g.a(workDatabaseU, e1VarH.n(), e0Var);
            boolean zE = e(e0Var);
            workDatabaseU.X();
            return zE;
        } finally {
            workDatabaseU.q();
        }
    }

    public static void b(vb.e0 e0Var) {
        if (!e0Var.i()) {
            if (a(e0Var)) {
                f(e0Var);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + e0Var + ")");
        }
    }

    private static boolean c(vb.e0 e0Var) {
        boolean zD = d(e0Var.h(), e0Var.g(), (String[]) vb.e0.m(e0Var).toArray(new String[0]), e0Var.e(), e0Var.c());
        e0Var.l();
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    private static boolean d(e1 e1Var, List<? extends q0> list, String[] strArr, String str, ub.j jVar) {
        boolean z15;
        boolean z16;
        boolean z17;
        e1 e1Var2;
        WorkDatabase workDatabase;
        boolean z18;
        String[] strArr2 = strArr;
        long jA = e1Var.n().getClock().a();
        WorkDatabase workDatabaseU = e1Var.u();
        boolean z19 = strArr2 != null && strArr2.length > 0;
        if (z19) {
            z15 = false;
            z16 = false;
            z17 = true;
            for (String str2 : strArr2) {
                i0 i0VarI = workDatabaseU.e0().i(str2);
                if (i0VarI == null) {
                    ub.w.e().c(f40759a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                o0.c cVar = i0VarI.state;
                z17 &= cVar == o0.c.SUCCEEDED;
                if (cVar == o0.c.FAILED) {
                    z16 = true;
                } else if (cVar == o0.c.CANCELLED) {
                    z15 = true;
                }
            }
        } else {
            z15 = false;
            z16 = false;
            z17 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z19) {
            e1Var2 = e1Var;
            workDatabase = workDatabaseU;
            z18 = false;
        } else {
            List<i0.IdAndState> listP = workDatabaseU.e0().p(str);
            if (listP.isEmpty()) {
                e1Var2 = e1Var;
                workDatabase = workDatabaseU;
            } else if (jVar == ub.j.APPEND || jVar == ub.j.APPEND_OR_REPLACE) {
                e1Var2 = e1Var;
                cc.b bVarZ = workDatabaseU.Z();
                List arrayList = new ArrayList();
                for (i0.IdAndState idAndState : listP) {
                    if (!bVarZ.d(idAndState.id)) {
                        o0.c cVar2 = idAndState.state;
                        boolean z25 = (cVar2 == o0.c.SUCCEEDED) & z17;
                        if (cVar2 == o0.c.FAILED) {
                            z16 = true;
                        } else if (cVar2 == o0.c.CANCELLED) {
                            z15 = true;
                        }
                        arrayList.add(idAndState.id);
                        z17 = z25;
                    }
                    workDatabaseU = workDatabaseU;
                }
                workDatabase = workDatabaseU;
                if (jVar == ub.j.APPEND_OR_REPLACE && (z15 || z16)) {
                    j0 j0VarE0 = workDatabase.e0();
                    Iterator<i0.IdAndState> it = j0VarE0.p(str).iterator();
                    while (it.hasNext()) {
                        j0VarE0.a(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z15 = false;
                    z16 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z19 = strArr2.length > 0;
            } else {
                if (jVar == ub.j.KEEP) {
                    Iterator<i0.IdAndState> it4 = listP.iterator();
                    while (it4.hasNext()) {
                        o0.c cVar3 = it4.next().state;
                        if (cVar3 == o0.c.ENQUEUED || cVar3 == o0.c.RUNNING) {
                            return false;
                        }
                    }
                }
                e1Var2 = e1Var;
                e.h(str, e1Var2);
                j0 j0VarE1 = workDatabaseU.e0();
                Iterator<i0.IdAndState> it5 = listP.iterator();
                while (it5.hasNext()) {
                    j0VarE1.a(it5.next().id);
                }
                workDatabase = workDatabaseU;
                z18 = true;
            }
            z18 = false;
        }
        Iterator<? extends q0> it6 = list.iterator();
        while (it6.hasNext()) {
            q0 next = it6.next();
            i0 workSpec = next.getWorkSpec();
            if (!z19 || z17) {
                workSpec.lastEnqueueTime = jA;
            } else if (z16) {
                workSpec.state = o0.c.FAILED;
            } else if (z15) {
                workSpec.state = o0.c.CANCELLED;
            } else {
                workSpec.state = o0.c.BLOCKED;
            }
            if (workSpec.state == o0.c.ENQUEUED) {
                z18 = true;
            }
            workDatabase.e0().e(g.c(e1Var2.s(), workSpec));
            if (z19) {
                int length = strArr2.length;
                int i15 = 0;
                while (i15 < length) {
                    workDatabase.Z().c(new cc.a(next.b(), strArr2[i15]));
                    i15++;
                    it6 = it6;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends q0> it7 = it6;
            workDatabase.f0().d(next.b(), next.c());
            if (!zIsEmpty) {
                workDatabase.c0().b(new cc.x(str, next.b()));
            }
            it6 = it7;
            strArr2 = strArr3;
        }
        return z18;
    }

    private static boolean e(vb.e0 e0Var) {
        List<vb.e0> listF = e0Var.f();
        boolean zE = false;
        if (listF != null) {
            for (vb.e0 e0Var2 : listF) {
                if (e0Var2.k()) {
                    ub.w.e().k(f40759a, "Already enqueued work ids (" + TextUtils.join(", ", e0Var2.d()) + ")");
                } else {
                    zE |= e(e0Var2);
                }
            }
        }
        return c(e0Var) | zE;
    }

    public static void f(vb.e0 e0Var) {
        e1 e1VarH = e0Var.h();
        androidx.work.impl.a.f(e1VarH.n(), e1VarH.u(), e1VarH.s());
    }
}
