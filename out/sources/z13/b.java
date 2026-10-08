package z13;

import java.util.List;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lz13/a;", "", "b", "(Ljava/util/List;)I", "", "addedItemsIds", "a", "(Ljava/util/List;Ljava/util/List;)I", "safetyguide_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final int a(List<? extends a> list, List<String> list2) {
        int iA;
        int i15 = 0;
        for (a aVar : list) {
            if (aVar instanceof a.Item) {
                iA = list2.contains(((a.Item) aVar).getItemId()) ? 1 : 0;
            } else {
                if (!(aVar instanceof a.Group)) {
                    throw new p();
                }
                iA = a(((a.Group) aVar).c(), list2);
            }
            i15 += iA;
        }
        return i15;
    }

    public static final int b(List<? extends a> list) {
        int iB;
        int i15 = 0;
        for (a aVar : list) {
            if (aVar instanceof a.Item) {
                iB = 1;
            } else {
                if (!(aVar instanceof a.Group)) {
                    throw new p();
                }
                iB = b(((a.Group) aVar).c());
            }
            i15 += iB;
        }
        return i15;
    }
}
