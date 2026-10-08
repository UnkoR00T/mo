package k0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.i0;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static i0 a(List<i0> list) {
        if (list.isEmpty()) {
            return null;
        }
        i0 i0Var = list.get(0);
        Integer numValueOf = Integer.valueOf(i0Var.b());
        Integer numValueOf2 = Integer.valueOf(i0Var.a());
        for (int i15 = 1; i15 < list.size(); i15++) {
            i0 i0Var2 = list.get(i15);
            numValueOf = c(numValueOf, Integer.valueOf(i0Var2.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(i0Var2.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new i0(numValueOf.intValue(), numValueOf2.intValue());
    }

    private static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    public static i0 d(Set<w3<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<w3<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().J());
        }
        return a(arrayList);
    }
}
