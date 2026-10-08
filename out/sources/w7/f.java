package w7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static <T> ak.n0<T> a(zj.g<Bundle, T> gVar, List<Bundle> list) {
        ak.n0.a aVarS = ak.n0.s();
        for (int i15 = 0; i15 < list.size(); i15++) {
            aVarS.a(gVar.apply((Bundle) zj.p.q(list.get(i15))));
        }
        return aVarS.k();
    }

    public static <T> ArrayList<Bundle> b(Collection<T> collection, zj.g<T, Bundle> gVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.apply(it.next()));
        }
        return arrayList;
    }
}
