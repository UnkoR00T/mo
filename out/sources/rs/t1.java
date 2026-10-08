package rs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import st.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 {
    public static final i a(i iVar, Collection<i> collection, boolean z15, boolean z16, boolean z17) {
        l lVarF;
        Collection<i> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            l lVarB = b((i) it.next());
            if (lVarB != null) {
                arrayList.add(lVarB);
            }
        }
        l lVarF2 = f(pq.v.k1(arrayList), b(iVar), z15);
        if (lVarF2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = collection2.iterator();
            while (it4.hasNext()) {
                l lVarF3 = ((i) it4.next()).f();
                if (lVarF3 != null) {
                    arrayList2.add(lVarF3);
                }
            }
            lVarF = f(pq.v.k1(arrayList2), iVar.f(), z15);
        } else {
            lVarF = lVarF2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it5 = collection2.iterator();
        while (it5.hasNext()) {
            j jVarE = ((i) it5.next()).e();
            if (jVarE != null) {
                arrayList3.add(jVarE);
            }
        }
        j jVar = (j) e(pq.v.k1(arrayList3), j.MUTABLE, j.READ_ONLY, iVar.e(), z15);
        if (lVarF == null || z17 || (z16 && lVarF == l.NULLABLE)) {
            lVarF = null;
        }
        boolean z18 = false;
        boolean z19 = lVarF != null && lVarF2 == null;
        if (lVarF == l.NOT_NULL) {
            if (d(iVar, z19)) {
                z18 = true;
                break;
            }
            if (!collection2.isEmpty()) {
                Iterator<T> it6 = collection2.iterator();
                while (it6.hasNext()) {
                    if (d((i) it6.next(), z19)) {
                        z18 = true;
                        break;
                    }
                }
            }
        }
        return new i(lVarF, jVar, z18, z19);
    }

    private static final l b(i iVar) {
        if (iVar.g()) {
            return null;
        }
        return iVar.f();
    }

    public static final boolean c(j2 j2Var, wt.i iVar) {
        return j2Var.Q(iVar, js.j0.f104681v);
    }

    private static final boolean d(i iVar, boolean z15) {
        return iVar.g() == z15 && iVar.d();
    }

    private static final <T> T e(Set<? extends T> set, T t15, T t16, T t17, boolean z15) {
        Set<? extends T> setK1;
        T t18;
        if (!z15) {
            if (t17 != null && (setK1 = pq.v.k1(pq.e1.m(set, t17))) != null) {
                set = setK1;
            }
            return (T) pq.v.Q0(set);
        }
        if (set.contains(t15)) {
            t18 = t15;
        } else {
            t18 = set.contains(t16) ? t16 : null;
        }
        if (fr.t.c(t18, t15) && fr.t.c(t17, t16)) {
            return null;
        }
        return t17 == null ? t18 : t17;
    }

    private static final l f(Set<? extends l> set, l lVar, boolean z15) {
        l lVar2 = l.FORCE_FLEXIBILITY;
        return lVar == lVar2 ? lVar2 : (l) e(set, l.NOT_NULL, l.NULLABLE, lVar, z15);
    }
}
