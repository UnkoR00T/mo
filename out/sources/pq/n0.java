package pq;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "K", "Lpq/l0;", "", "", "a", "(Lpq/l0;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
public class n0 {
    public static <T, K> Map<K, Integer> a(l0<T, ? extends K> l0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = l0Var.b();
        while (itB.hasNext()) {
            K kA = l0Var.a(itB.next());
            Object n0Var = linkedHashMap.get(kA);
            if (n0Var == null && !linkedHashMap.containsKey(kA)) {
                n0Var = new fr.n0();
            }
            fr.n0 n0Var2 = (fr.n0) n0Var;
            n0Var2.f66407a++;
            linkedHashMap.put(kA, n0Var2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            fr.w0.e(entry).setValue(Integer.valueOf(((fr.n0) entry.getValue()).f66407a));
        }
        return fr.w0.d(linkedHashMap);
    }
}
