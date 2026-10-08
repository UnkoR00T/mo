package cu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final <T> void a(Collection<T> collection, T t15) {
        if (t15 != null) {
            collection.add(t15);
        }
    }

    private static final int b(int i15) {
        if (i15 < 3) {
            return 3;
        }
        return i15 + (i15 / 3) + 1;
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return v.n();
        }
        if (size == 1) {
            return v.e(v.l0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i15));
            i15++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i15) {
        return new HashMap<>(b(i15));
    }

    public static final <E> HashSet<E> f(int i15) {
        return new HashSet<>(b(i15));
    }

    public static final <E> LinkedHashSet<E> g(int i15) {
        return new LinkedHashSet<>(b(i15));
    }
}
