package gs;

import es.s;
import es.t;
import es.v;
import es.x;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final b a(es.g gVar, f fVar) {
        return (b) g(gVar.h(), fVar);
    }

    public static final c b(es.j jVar, f fVar) {
        return (c) g(jVar.b(), fVar);
    }

    public static final g c(s sVar, f fVar) {
        return (g) g(sVar.d(), fVar);
    }

    public static final h d(t tVar, f fVar) {
        return (h) g(tVar.f(), fVar);
    }

    public static final j e(v vVar, f fVar) {
        return (j) g(vVar.c(), fVar);
    }

    public static final k f(x xVar, f fVar) {
        return (k) g(xVar.a(), fVar);
    }

    private static final <N extends e> N g(Collection<? extends N> collection, f fVar) {
        N n15 = null;
        for (N n16 : collection) {
            if (fr.t.c(n16.getType(), fVar)) {
                if (n15 != null) {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + fVar);
                }
                n15 = n16;
            }
        }
        if (n15 != null) {
            return n15;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + fVar);
    }
}
