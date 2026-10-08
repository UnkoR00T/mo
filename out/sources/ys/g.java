package ys;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final List<xs.a.e.c> a(List<xs.a.e.c> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (xs.a.e.c cVar : list) {
            int iJ = cVar.J();
            for (int i15 = 0; i15 < iJ; i15++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
