package bu;

import cu.j;
import java.util.Collection;
import java.util.LinkedHashSet;
import lt.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final j<k> b(Iterable<? extends k> iterable) {
        j<k> jVar = new j<>();
        for (k kVar : iterable) {
            k kVar2 = kVar;
            if (kVar2 != null && kVar2 != k.b.f120132b) {
                jVar.add(kVar);
            }
        }
        return jVar;
    }
}
