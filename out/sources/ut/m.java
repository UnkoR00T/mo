package ut;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends g {
    public m(h hVar, String... strArr) {
        super(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // ut.g, lt.k
    public Set<zs.f> b() {
        throw new IllegalStateException();
    }

    @Override // ut.g, lt.k
    public Set<zs.f> d() {
        throw new IllegalStateException();
    }

    @Override // ut.g, lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // ut.g, lt.n
    public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        throw new IllegalStateException(j());
    }

    @Override // ut.g, lt.k
    public Set<zs.f> g() {
        throw new IllegalStateException();
    }

    @Override // ut.g, lt.k
    /* JADX INFO: renamed from: h */
    public Set<g1> a(zs.f fVar, ds.b bVar) {
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // ut.g, lt.k
    /* JADX INFO: renamed from: i */
    public Set<z0> c(zs.f fVar, ds.b bVar) {
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // ut.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
