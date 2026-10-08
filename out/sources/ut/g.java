package ut;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import pq.e1;
import pq.v;
import vr.g1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public class g implements lt.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f201263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f201264c;

    public g(h hVar, String... strArr) {
        this.f201263b = hVar;
        String strE = hVar.e();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f201264c = String.format(strE, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // lt.k
    public Set<zs.f> b() {
        return e1.e();
    }

    @Override // lt.k
    public Set<zs.f> d() {
        return e1.e();
    }

    @Override // lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        return new a(zs.f.p(String.format(b.ERROR_CLASS.e(), Arrays.copyOf(new Object[]{fVar}, 1))));
    }

    @Override // lt.n
    public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        return v.n();
    }

    @Override // lt.k
    public Set<zs.f> g() {
        return e1.e();
    }

    @Override // lt.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<g1> a(zs.f fVar, ds.b bVar) {
        return e1.d(new c(l.f201331a.h()));
    }

    @Override // lt.k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<z0> c(zs.f fVar, ds.b bVar) {
        return l.f201331a.j();
    }

    protected final String j() {
        return this.f201264c;
    }

    public String toString() {
        return "ErrorScope{" + this.f201264c + '}';
    }
}
