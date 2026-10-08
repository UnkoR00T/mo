package oo;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q {
    public abstract List<Number> a(List<Number> list, p pVar);

    public List<Number> b(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof p) {
                List<Number> listA = a(arrayList, (p) obj);
                arrayList.clear();
                if (listA != null) {
                    arrayList.addAll(listA);
                }
            } else {
                arrayList.add((Number) obj);
            }
        }
        return arrayList;
    }
}
