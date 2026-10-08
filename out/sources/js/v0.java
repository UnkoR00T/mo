package js;

import java.util.Iterator;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 {
    public static final wr.c a(ms.k kVar, qs.c0 c0Var) {
        wr.c next;
        if (c0Var.y() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<wr.c> it = new ms.g(kVar, c0Var, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            wr.c cVar = next;
            for (zs.c cVar2 : b0.e()) {
                if (fr.t.c(cVar.g(), cVar2)) {
                    return next;
                }
            }
        }
        next = null;
        return next;
    }

    public static final boolean b(vr.b bVar) {
        return (bVar instanceof vr.z) && fr.t.c(bVar.W(ls.e.L), Boolean.TRUE);
    }

    public static final boolean c(e0 e0Var) {
        return e0Var.b().b(b0.d()) == p0.STRICT;
    }

    public static final vr.u d(x1 x1Var) {
        return y.g(x1Var);
    }
}
