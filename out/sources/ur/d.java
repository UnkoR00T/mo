package ur;

import java.util.Collection;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f200051a = new d();

    private d() {
    }

    public static /* synthetic */ vr.e f(d dVar, zs.c cVar, sr.j jVar, Integer num, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, jVar, num);
    }

    public final vr.e a(vr.e eVar) {
        zs.c cVarO = c.f200031a.o(dt.i.m(eVar));
        if (cVarO != null) {
            return ht.e.m(eVar).p(cVarO);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a mutable collection");
    }

    public final vr.e b(vr.e eVar) {
        zs.c cVarP = c.f200031a.p(dt.i.m(eVar));
        if (cVarP != null) {
            return ht.e.m(eVar).p(cVarP);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public final boolean c(vr.e eVar) {
        return c.f200031a.k(dt.i.m(eVar));
    }

    public final boolean d(vr.e eVar) {
        return c.f200031a.l(dt.i.m(eVar));
    }

    public final vr.e e(zs.c cVar, sr.j jVar, Integer num) {
        zs.b bVarM = (num == null || !fr.t.c(cVar, c.f200031a.h())) ? c.f200031a.m(cVar) : sr.p.a(num.intValue());
        if (bVarM != null) {
            return jVar.p(bVarM.a());
        }
        return null;
    }

    public final Collection<vr.e> g(zs.c cVar, sr.j jVar) {
        vr.e eVarF = f(this, cVar, jVar, null, 4, null);
        if (eVarF == null) {
            return e1.e();
        }
        zs.c cVarP = c.f200031a.p(ht.e.p(eVarF));
        return cVarP == null ? e1.d(eVarF) : pq.v.q(eVarF, jVar.p(cVarP));
    }
}
