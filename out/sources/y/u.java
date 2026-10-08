package y;

import java.util.ArrayList;
import v.l3;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static boolean a(l3 l3Var, int... iArr) {
        if (l3Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i15 : iArr) {
            arrayList.add(Integer.valueOf(i15));
        }
        return l3Var.b().containsAll(arrayList);
    }
}
