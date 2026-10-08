package dt;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public static final vr.b a(Collection<? extends vr.b> collection) {
        Integer numD;
        collection.isEmpty();
        vr.b bVar = null;
        for (vr.b bVar2 : collection) {
            if (bVar == null || ((numD = vr.t.d(bVar.h(), bVar2.h())) != null && numD.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        return bVar;
    }
}
