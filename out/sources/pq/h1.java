package pq;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"T", "", "element", "k", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "j", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "m", "l", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class h1 extends g1 {
    public static <T> Set<T> j(Set<? extends T> set, Iterable<? extends T> iterable) {
        Collection<?> collectionF = c0.F(iterable);
        if (collectionF.isEmpty()) {
            return g0.k1(set);
        }
        if (!(collectionF instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionF);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t15 : set) {
            if (!((Set) collectionF).contains(t15)) {
                linkedHashSet2.add(t15);
            }
        }
        return linkedHashSet2;
    }

    public static <T> Set<T> k(Set<? extends T> set, T t15) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(x0.e(set.size()));
        boolean z15 = false;
        for (T t16 : set) {
            boolean z16 = true;
            if (!z15 && fr.t.c(t16, t15)) {
                z15 = true;
                z16 = false;
            }
            if (z16) {
                linkedHashSet.add(t16);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> l(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        Integer numZ = y.z(iterable);
        if (numZ != null) {
            size = set.size() + numZ.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x0.e(size));
        linkedHashSet.addAll(set);
        c0.D(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <T> Set<T> m(Set<? extends T> set, T t15) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(x0.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t15);
        return linkedHashSet;
    }
}
