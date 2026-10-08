package pq;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0000\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"", "", "index", "U", "(Ljava/util/List;I)I", "W", "V", "T", ip.a.f96137b, "(Ljava/util/List;)Ljava/util/List;", "", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class d0 extends c0 {
    public static <T> List<T> S(List<? extends T> list) {
        return new c1(list);
    }

    public static <T> List<T> T(List<T> list) {
        return new b1(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(List<?> list, int i15) {
        if (i15 >= 0 && i15 <= x.p(list)) {
            return x.p(list) - i15;
        }
        throw new IndexOutOfBoundsException("Element index " + i15 + " must be in range [" + new lr.i(0, x.p(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(List<?> list, int i15) {
        return x.p(list) - i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(List<?> list, int i15) {
        if (i15 >= 0 && i15 <= list.size()) {
            return list.size() - i15;
        }
        throw new IndexOutOfBoundsException("Position index " + i15 + " must be in range [" + new lr.i(0, list.size()) + "].");
    }
}
