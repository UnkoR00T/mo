package lt;

import java.util.Collection;
import java.util.Set;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements k {
    @Override // lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        return i().a(fVar, bVar);
    }

    @Override // lt.k
    public Set<zs.f> b() {
        return i().b();
    }

    @Override // lt.k
    public Collection<z0> c(zs.f fVar, ds.b bVar) {
        return i().c(fVar, bVar);
    }

    @Override // lt.k
    public Set<zs.f> d() {
        return i().d();
    }

    @Override // lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        return i().e(fVar, bVar);
    }

    @Override // lt.n
    public Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        return i().f(dVar, lVar);
    }

    @Override // lt.k
    public Set<zs.f> g() {
        return i().g();
    }

    public final k h() {
        return i() instanceof a ? ((a) i()).h() : i();
    }

    protected abstract k i();
}
