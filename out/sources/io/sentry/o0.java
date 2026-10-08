package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f95233a;

    public o0(c1 c1Var) {
        this.f95233a = c1Var;
    }

    @Override // io.sentry.c1
    public io.sentry.transport.a0 F() {
        return this.f95233a.F();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v H(p5 p5Var, j0 j0Var) {
        return this.f95233a.H(p5Var, j0Var);
    }

    @Override // io.sentry.c1
    public void K(j4 j4Var, h4 h4Var) {
        this.f95233a.K(j4Var, h4Var);
    }

    @Override // io.sentry.c1
    public io.sentry.logger.a L() {
        return this.f95233a.L();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v M(r7 r7Var, j0 j0Var) {
        return this.f95233a.M(r7Var, j0Var);
    }

    @Override // io.sentry.c1
    public a1 N() {
        return d5.s();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v O(String str, b7 b7Var) {
        return this.f95233a.O(str, b7Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v P(s3 s3Var) {
        return this.f95233a.P(s3Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v R(r6 r6Var, j0 j0Var) {
        return this.f95233a.R(r6Var, j0Var);
    }

    @Override // io.sentry.c1
    public l1 S(c9 c9Var, e9 e9Var) {
        return this.f95233a.S(c9Var, e9Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v U(Throwable th4, j0 j0Var) {
        return this.f95233a.U(th4, j0Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v V(io.sentry.protocol.c0 c0Var, z8 z8Var, j0 j0Var, w3 w3Var) {
        return this.f95233a.V(c0Var, z8Var, j0Var, w3Var);
    }

    @Override // io.sentry.c1
    public c1 W(String str) {
        return this.f95233a.W(str);
    }

    @Override // io.sentry.c1
    public j1 a() {
        return this.f95233a.a();
    }

    @Override // io.sentry.c1
    public void c(f fVar) {
        this.f95233a.c(fVar);
    }

    @Override // io.sentry.c1
    public boolean isEnabled() {
        return this.f95233a.isEnabled();
    }

    @Override // io.sentry.c1
    public void n(boolean z15) {
        this.f95233a.n(z15);
    }

    @Override // io.sentry.c1
    public void p(String str, String str2) {
        this.f95233a.p(str, str2);
    }

    @Override // io.sentry.c1
    public void q(f fVar, j0 j0Var) {
        this.f95233a.q(fVar, j0Var);
    }

    @Override // io.sentry.c1
    public void r(Throwable th4, j1 j1Var, String str) {
        this.f95233a.r(th4, j1Var, str);
    }

    @Override // io.sentry.c1
    public q7 s() {
        return this.f95233a.s();
    }

    @Override // io.sentry.c1
    public void t(long j15) {
        this.f95233a.t(j15);
    }

    @Override // io.sentry.c1
    public l1 u() {
        return this.f95233a.u();
    }

    @Override // io.sentry.c1
    public void v() {
        this.f95233a.v();
    }

    @Override // io.sentry.c1
    public boolean w() {
        return this.f95233a.w();
    }

    @Override // io.sentry.c1
    public void x() {
        this.f95233a.x();
    }

    @Override // io.sentry.c1
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public u0 m43clone() {
        return this.f95233a.m45clone();
    }
}
