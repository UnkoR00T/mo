package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.d2;
import st.e1;
import st.i2;
import st.o2;
import st.p2;
import st.t0;
import st.w0;
import st.y1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    private static final List<d2> a(o2 o2Var, wt.b bVar) {
        if (o2Var.R0().size() != o2Var.T0().getParameters().size()) {
            return null;
        }
        List<d2> listR0 = o2Var.R0();
        List<d2> list = listR0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((d2) it.next()).c() != p2.INVARIANT) {
                    List<oq.r> listP1 = pq.v.p1(list, o2Var.T0().getParameters());
                    ArrayList arrayList = new ArrayList(pq.v.y(listP1, 10));
                    for (oq.r rVar : listP1) {
                        d2 d2VarD = (d2) rVar.a();
                        m1 m1Var = (m1) rVar.b();
                        if (d2VarD.c() != p2.INVARIANT) {
                            d2VarD = xt.d.d(new i(bVar, (d2VarD.b() || d2VarD.c() != p2.IN_VARIANCE) ? null : d2VarD.getType().W0(), d2VarD, m1Var));
                        }
                        arrayList.add(d2VarD);
                    }
                    i2 i2VarC = y1.f184171c.b(o2Var.T0(), arrayList).c();
                    int size = listR0.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        d2 d2Var = listR0.get(i15);
                        d2 d2Var2 = (d2) arrayList.get(i15);
                        if (d2Var.c() != p2.INVARIANT) {
                            List<t0> upperBounds = o2Var.T0().getParameters().get(i15).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it4 = upperBounds.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(f.a.f192118a.a(i2VarC.o((t0) it4.next(), p2.INVARIANT).W0()));
                            }
                            if (!d2Var.b() && d2Var.c() == p2.OUT_VARIANCE) {
                                arrayList2.add(f.a.f192118a.a(d2Var.getType().W0()));
                            }
                            ((i) d2Var2.getType()).T0().n(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final e1 b(e1 e1Var, wt.b bVar) {
        List<d2> listA = a(e1Var, bVar);
        if (listA != null) {
            return c(e1Var, listA);
        }
        return null;
    }

    private static final e1 c(o2 o2Var, List<? extends d2> list) {
        return w0.k(o2Var.S0(), o2Var.T0(), list, o2Var.U0(), null, 16, null);
    }
}
