package k0;

import java.util.Collection;
import o.j2;
import v.j0;
import v.m0;
import v.n0;
import v.x2;
import y.w;

/* JADX INFO: loaded from: classes.dex */
class j implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f107156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f107157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f107158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j2.c f107159d;

    j(n0 n0Var, j2.c cVar, g.a aVar) {
        this.f107156a = n0Var;
        this.f107159d = cVar;
        this.f107157b = new p(n0Var.h(), aVar);
        this.f107158c = new q(n0Var.o());
    }

    @Override // v.n0
    public com.google.common.util.concurrent.q<Void> b() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // v.n0
    public x2<n0.a> d() {
        return this.f107156a.d();
    }

    @Override // o.j2.c
    public void f(j2 j2Var) {
        w.b();
        this.f107159d.f(j2Var);
    }

    @Override // v.n0
    public j0 h() {
        return this.f107157b;
    }

    @Override // o.j2.c
    public void j(j2 j2Var) {
        w.b();
        this.f107159d.j(j2Var);
    }

    @Override // v.n0
    public void l(Collection<j2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // o.j2.c
    public void m(j2 j2Var) {
        w.b();
        this.f107159d.m(j2Var);
    }

    @Override // v.n0
    public void n(Collection<j2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // v.n0
    public m0 o() {
        return this.f107158c;
    }

    @Override // o.j2.c
    public void q(j2 j2Var) {
        w.b();
        this.f107159d.q(j2Var);
    }

    @Override // v.n0
    public boolean s() {
        return false;
    }

    void u(int i15) {
        this.f107158c.b(i15);
    }
}
