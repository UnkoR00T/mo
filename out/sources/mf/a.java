package mf;

import android.util.SparseArray;
import java.util.HashMap;
import ye.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<e> f126121a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<e, Integer> f126122b;

    static {
        HashMap<e, Integer> map = new HashMap<>();
        f126122b = map;
        map.put(e.DEFAULT, 0);
        f126122b.put(e.VERY_LOW, 1);
        f126122b.put(e.HIGHEST, 2);
        for (e eVar : f126122b.keySet()) {
            f126121a.append(f126122b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = f126122b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i15) {
        e eVar = f126121a.get(i15);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i15);
    }
}
