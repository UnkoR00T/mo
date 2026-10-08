package vp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    static List<String> a(bp.b bVar, int i15) {
        if (i15 < 0 || i15 > 1) {
            throw new IllegalArgumentException("Only 0 and 1 are allowed as an index into two-element arrays");
        }
        if (bVar instanceof bp.p) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((bp.p) bVar).J3());
            return arrayList;
        }
        if (!(bVar instanceof bp.a)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        for (bp.b bVar2 : (bp.a) bVar) {
            if (bVar2 instanceof bp.p) {
                arrayList2.add(((bp.p) bVar2).J3());
            } else if (bVar2 instanceof bp.a) {
                bp.a aVar = (bp.a) bVar2;
                if (aVar.size() >= i15 + 1 && (aVar.g4(i15) instanceof bp.p)) {
                    arrayList2.add(((bp.p) aVar.g4(i15)).J3());
                }
            }
        }
        return arrayList2;
    }
}
