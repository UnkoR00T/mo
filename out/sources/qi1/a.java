package qi1;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\u001a5\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "", "from", "to", "a", "(Ljava/util/List;II)Ljava/util/List;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final <T> List<T> a(List<? extends T> list, int i15, int i16) {
        if (i15 < 0 || i15 >= list.size() || i16 < 0 || i16 >= list.size()) {
            return null;
        }
        List listI1 = v.i1(list);
        listI1.add(i16, listI1.remove(i15));
        return v.f1(listI1);
    }
}
