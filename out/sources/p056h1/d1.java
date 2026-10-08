package p056h1;

import fr.t;
import java.util.Comparator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00000\nj\b\u0012\u0004\u0012\u00020\u0000`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lh1/b1;", "T", "", "firstVisibleIndex", "lastVisibleIndex", "", "positionedItems", "stickingItems", "c", "(IILjava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "a", "Ljava/util/Comparator;", "LazyLayoutMeasuredItemIndexComparator", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<b1> f79350a = new Comparator() { // from class: h1.c1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d1.b((b1) obj, (b1) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(b1 b1Var, b1 b1Var2) {
        return t.d(b1Var.getIndex(), b1Var2.getIndex());
    }

    public static final <T extends b1> List<T> c(int i15, int i16, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return v.n();
        }
        List<T> listI1 = v.i1(list2);
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            T t15 = list.get(i17);
            int index = t15.getIndex();
            if (i15 <= index && index <= i16) {
                listI1.add(t15);
            }
        }
        v.C(listI1, f79350a);
        return listI1;
    }
}
