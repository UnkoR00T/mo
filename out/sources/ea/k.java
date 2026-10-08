package ea;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import p071kotlin.Metadata;
import r0.u0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "", "a", "(Ljava/util/List;)Ljava/util/List;", "navigation3-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {
    public static final <T> List<T> a(List<? extends T> list) {
        if (!(list instanceof RandomAccess)) {
            return pq.v.e0(list);
        }
        u0 u0Var = new u0(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            T t15 = list.get(i15);
            if (u0Var.i(t15)) {
                arrayList.add(t15);
            }
        }
        return arrayList;
    }
}
