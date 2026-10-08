package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import st.e1;
import st.g0;
import st.k0;
import st.n0;
import st.o2;
import st.w0;
import st.x0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final o2 a(Collection<? extends o2> collection) {
        e1 e1VarB1;
        int size = collection.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (o2) pq.v.O0(collection);
        }
        Collection<? extends o2> collection2 = collection;
        ArrayList arrayList = new ArrayList(pq.v.y(collection2, 10));
        boolean z15 = false;
        boolean z16 = false;
        for (o2 o2Var : collection2) {
            z15 = z15 || x0.a(o2Var);
            if (o2Var instanceof e1) {
                e1VarB1 = (e1) o2Var;
            } else {
                if (!(o2Var instanceof k0)) {
                    throw new oq.p();
                }
                if (g0.a(o2Var)) {
                    return o2Var;
                }
                e1VarB1 = ((k0) o2Var).b1();
                z16 = true;
            }
            arrayList.add(e1VarB1);
        }
        if (z15) {
            return ut.l.d(ut.k.U0, collection.toString());
        }
        if (!z16) {
            return b0.f192109a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList2.add(n0.d((o2) it.next()));
        }
        b0 b0Var = b0.f192109a;
        return w0.e(b0Var.d(arrayList), b0Var.d(arrayList2));
    }
}
