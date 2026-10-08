package sr;

import java.util.Set;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static final boolean a(d dVar, vr.e eVar) {
        if (!dt.i.x(eVar)) {
            return false;
        }
        Set<zs.b> setB = dVar.b();
        zs.b bVarN = ht.e.n(eVar);
        return v.c0(setB, bVarN != null ? bVarN.e() : null);
    }
}
