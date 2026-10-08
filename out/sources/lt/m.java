package lt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m {
    public static final Set<zs.f> a(Iterable<? extends k> iterable) {
        HashSet hashSet = new HashSet();
        Iterator<? extends k> it = iterable.iterator();
        while (it.hasNext()) {
            Set<zs.f> setG = it.next().g();
            if (setG == null) {
                return null;
            }
            pq.v.D(hashSet, setG);
        }
        return hashSet;
    }
}
