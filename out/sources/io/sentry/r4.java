package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r4 f95588a = new r4();

    private r4() {
    }

    public static r4 b() {
        return f95588a;
    }

    @Override // io.sentry.c1
    public io.sentry.transport.a0 F() {
        return d5.r().F();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v H(p5 p5Var, j0 j0Var) {
        return d5.r().H(p5Var, j0Var);
    }

    @Override // io.sentry.c1
    public void K(j4 j4Var, h4 h4Var) {
        d5.m(j4Var, h4Var);
    }

    @Override // io.sentry.c1
    public io.sentry.logger.a L() {
        return d5.r().L();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v M(r7 r7Var, j0 j0Var) {
        return d5.r().M(r7Var, j0Var);
    }

    @Override // io.sentry.c1
    public a1 N() {
        return d5.s();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v O(String str, b7 b7Var) {
        return d5.k(str, b7Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v P(s3 s3Var) {
        return d5.r().P(s3Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v R(r6 r6Var, j0 j0Var) {
        return d5.h(r6Var, j0Var);
    }

    @Override // io.sentry.c1
    public l1 S(c9 c9Var, e9 e9Var) {
        return d5.K(c9Var, e9Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v U(Throwable th4, j0 j0Var) {
        return d5.j(th4, j0Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v V(io.sentry.protocol.c0 c0Var, z8 z8Var, j0 j0Var, w3 w3Var) {
        return d5.r().V(c0Var, z8Var, j0Var, w3Var);
    }

    @Override // io.sentry.c1
    public c1 W(String str) {
        return d5.q(str);
    }

    @Override // io.sentry.c1
    public j1 a() {
        return d5.r().a();
    }

    @Override // io.sentry.c1
    public void c(f fVar) {
        q(fVar, new j0());
    }

    @Override // io.sentry.c1
    public boolean isEnabled() {
        return d5.C();
    }

    @Override // io.sentry.c1
    public void n(boolean z15) {
        d5.l();
    }

    @Override // io.sentry.c1
    public void p(String str, String str2) {
        d5.I(str, str2);
    }

    @Override // io.sentry.c1
    public void q(f fVar, j0 j0Var) {
        d5.f(fVar, j0Var);
    }

    @Override // io.sentry.c1
    public void r(Throwable th4, j1 j1Var, String str) {
        d5.r().r(th4, j1Var, str);
    }

    @Override // io.sentry.c1
    public q7 s() {
        return d5.r().s();
    }

    @Override // io.sentry.c1
    public void t(long j15) {
        d5.p(j15);
    }

    @Override // io.sentry.c1
    public l1 u() {
        return d5.r().u();
    }

    @Override // io.sentry.c1
    public void v() {
        d5.n();
    }

    @Override // io.sentry.c1
    public boolean w() {
        return d5.D();
    }

    @Override // io.sentry.c1
    public void x() {
        d5.J();
    }

    @Override // io.sentry.c1
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public u0 m46clone() {
        return d5.r().m45clone();
    }
}
