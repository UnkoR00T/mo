package p056h1;

import java.util.ArrayList;
import java.util.List;
import lr.i;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh1/o0;", "Lh1/k1;", "pinnedItemList", "Lh1/r;", "beyondBoundsInfo", "", "", "a", "(Lh1/o0;Lh1/k1;Lh1/r;)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final List<Integer> a(o0 o0Var, k1 k1Var, r rVar) {
        if (!rVar.d() && k1Var.isEmpty()) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList();
        i iVar = rVar.d() ? new i(rVar.c(), Math.min(rVar.b(), o0Var.a() - 1)) : i.INSTANCE.a();
        int size = k1Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            k1.a aVar = k1Var.get(i15);
            int iA = p0.a(o0Var, aVar.getKey(), aVar.getIndex());
            int first = iVar.getFirst();
            if ((iA > iVar.getLast() || first > iA) && iA >= 0 && iA < o0Var.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int first2 = iVar.getFirst();
        int last = iVar.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
