package ut;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import pq.e1;
import pq.v;
import vr.h0;
import vr.i0;
import vr.o;
import vr.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f201256a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zs.f f201257b = zs.f.p(b.ERROR_MODULE.e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<i0> f201258c = v.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<i0> f201259d = v.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<i0> f201260e = e1.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final oq.k f201261f = oq.l.a(d.f201255a);

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sr.g I0() {
        return sr.g.f183554h.a();
    }

    @Override // vr.i0
    public boolean C(i0 i0Var) {
        return false;
    }

    @Override // vr.i0
    public List<i0> D0() {
        return f201259d;
    }

    public zs.f K0() {
        return f201257b;
    }

    @Override // vr.i0
    public <T> T L0(h0<T> h0Var) {
        return null;
    }

    @Override // vr.i0
    public v0 V(zs.c cVar) {
        throw new IllegalStateException("Should not be called!");
    }

    @Override // vr.m
    public vr.m a() {
        return this;
    }

    @Override // vr.m
    public vr.m b() {
        return null;
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        return wr.h.f214542p0.b();
    }

    @Override // vr.k0
    public zs.f getName() {
        return K0();
    }

    @Override // vr.i0
    public sr.j i() {
        return (sr.j) f201261f.getValue();
    }

    @Override // vr.i0
    public Collection<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar) {
        return v.n();
    }

    @Override // vr.m
    public <R, D> R z0(o<R, D> oVar, D d15) {
        return null;
    }
}
