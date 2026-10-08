package da;

import er.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "Lkotlin/Function1;", "", "predicate", "a", "(Ljava/util/List;Ler/l;)Z", "navigation3-ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final <T> boolean a(List<? extends T> list, l<? super T, Boolean> lVar) {
        if (list instanceof RandomAccess) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (lVar.b(list.get(i15)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        List<? extends T> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (lVar.b(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
