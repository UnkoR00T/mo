package iq0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Liq0/p;", "Lrq0/c;", "serviceType", "", "a", "(Ljava/util/List;Lrq0/c;)Z", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final boolean a(List<DashboardServiceEntry> list, rq0.c cVar) {
        if (list != null) {
            List<DashboardServiceEntry> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((DashboardServiceEntry) it.next()).getType() == cVar) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
