package androidx.p016lifecycle;

import ju.g1;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/j;", "Landroidx/lifecycle/k;", "a", "(Landroidx/lifecycle/j;)Landroidx/lifecycle/k;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {
    public static final k a(j jVar) {
        l lVar;
        do {
            l lVar2 = (l) jVar.c().b();
            if (lVar2 != null) {
                return lVar2;
            }
            lVar = new l(jVar, z2.b(null, 1, null).n0(g1.c().d2()));
        } while (!jVar.c().a(null, lVar));
        lVar.b();
        return lVar;
    }
}
