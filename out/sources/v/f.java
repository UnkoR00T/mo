package v;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class f implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f202564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f202565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f202566c;

    public f(n0 n0Var, e eVar) {
        this.f202564a = n0Var;
        this.f202565b = eVar;
        this.f202566c = new c(n0Var.h(), eVar.e().F(null));
    }

    @Override // v.n0, o.i
    public o.j a() {
        return this.f202566c;
    }

    @Override // v.n0
    public com.google.common.util.concurrent.q<Void> b() {
        return this.f202564a.b();
    }

    @Override // v.n0, o.i
    public o.q c() {
        return this.f202565b;
    }

    @Override // v.n0
    public x2<n0.a> d() {
        return this.f202564a.d();
    }

    @Override // o.j2.c
    public void f(o.j2 j2Var) {
        this.f202564a.f(j2Var);
    }

    @Override // v.n0
    public void g(f0 f0Var) {
        this.f202564a.g(f0Var);
    }

    @Override // v.n0
    public j0 h() {
        return this.f202566c;
    }

    @Override // v.n0
    public f0 i() {
        return this.f202564a.i();
    }

    @Override // o.j2.c
    public void j(o.j2 j2Var) {
        this.f202564a.j(j2Var);
    }

    @Override // v.n0
    public void k(boolean z15) {
        this.f202564a.k(z15);
    }

    @Override // v.n0
    public void l(Collection<o.j2> collection) {
        this.f202564a.l(collection);
    }

    @Override // o.j2.c
    public void m(o.j2 j2Var) {
        this.f202564a.m(j2Var);
    }

    @Override // v.n0
    public void n(Collection<o.j2> collection) {
        this.f202564a.n(collection);
    }

    @Override // v.n0
    public m0 o() {
        return this.f202565b;
    }

    @Override // v.n0
    public boolean p() {
        return this.f202564a.p();
    }

    @Override // o.j2.c
    public void q(o.j2 j2Var) {
        this.f202564a.q(j2Var);
    }

    @Override // v.n0
    public boolean r() {
        return this.f202564a.r();
    }

    @Override // v.n0
    public boolean s() {
        return this.f202564a.s();
    }

    @Override // v.n0
    public void t(boolean z15) {
        this.f202564a.t(z15);
    }
}
