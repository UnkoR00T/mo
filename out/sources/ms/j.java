package ms;

import java.util.Collection;
import java.util.List;
import js.t;
import ns.d0;
import pq.v;
import qs.u;
import vr.o0;
import vr.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f128049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rt.a<zs.c, d0> f128050b;

    public j(d dVar) {
        k kVar = new k(dVar, p.a.f128062a, oq.l.c(null));
        this.f128049a = kVar;
        this.f128050b = kVar.e().b();
    }

    private final d0 e(zs.c cVar) {
        u uVarA = t.a(this.f128049a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return this.f128050b.c(cVar, new i(this, uVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 f(j jVar, u uVar) {
        return new d0(jVar.f128049a, uVar);
    }

    @Override // vr.p0
    @oq.a
    public List<d0> a(zs.c cVar) {
        return v.r(e(cVar));
    }

    @Override // vr.u0
    public boolean b(zs.c cVar) {
        return t.a(this.f128049a.a().d(), cVar, false, 2, null) == null;
    }

    @Override // vr.u0
    public void c(zs.c cVar, Collection<o0> collection) {
        cu.a.a(collection, e(cVar));
    }

    @Override // vr.p0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar) {
        d0 d0VarE = e(cVar);
        List<zs.c> listW0 = d0VarE != null ? d0VarE.W0() : null;
        return listW0 == null ? v.n() : listW0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f128049a.a().m();
    }
}
