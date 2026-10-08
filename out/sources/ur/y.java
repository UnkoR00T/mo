package ur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pq.v0;
import st.y1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class y {
    public static final y1 a(vr.e eVar, vr.e eVar2) {
        eVar.v().size();
        eVar2.v().size();
        y1.a aVar = y1.f184171c;
        List<m1> listV = eVar.v();
        ArrayList arrayList = new ArrayList(pq.v.y(listV, 10));
        Iterator<T> it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(((m1) it.next()).o());
        }
        List<m1> listV2 = eVar2.v();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listV2, 10));
        Iterator<T> it4 = listV2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(xt.d.d(((m1) it4.next()).t()));
        }
        return y1.a.e(aVar, v0.s(pq.v.p1(arrayList, arrayList2)), false, 2, null);
    }
}
