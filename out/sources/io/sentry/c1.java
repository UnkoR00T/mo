package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface c1 {
    io.sentry.transport.a0 F();

    default boolean G() {
        return false;
    }

    io.sentry.protocol.v H(p5 p5Var, j0 j0Var);

    default io.sentry.protocol.v I(io.sentry.protocol.c0 c0Var, z8 z8Var, j0 j0Var) {
        return V(c0Var, z8Var, j0Var, null);
    }

    default void J(h4 h4Var) {
        K(null, h4Var);
    }

    void K(j4 j4Var, h4 h4Var);

    io.sentry.logger.a L();

    io.sentry.protocol.v M(r7 r7Var, j0 j0Var);

    a1 N();

    io.sentry.protocol.v O(String str, b7 b7Var);

    io.sentry.protocol.v P(s3 s3Var);

    default io.sentry.protocol.v Q(p5 p5Var) {
        return H(p5Var, new j0());
    }

    io.sentry.protocol.v R(r6 r6Var, j0 j0Var);

    l1 S(c9 c9Var, e9 e9Var);

    default io.sentry.protocol.v T(Throwable th4) {
        return U(th4, new j0());
    }

    io.sentry.protocol.v U(Throwable th4, j0 j0Var);

    io.sentry.protocol.v V(io.sentry.protocol.c0 c0Var, z8 z8Var, j0 j0Var, w3 w3Var);

    c1 W(String str);

    j1 a();

    void c(f fVar);

    @Deprecated
    /* JADX INFO: renamed from: clone */
    u0 m46clone();

    boolean isEnabled();

    void n(boolean z15);

    void p(String str, String str2);

    void q(f fVar, j0 j0Var);

    void r(Throwable th4, j1 j1Var, String str);

    q7 s();

    void t(long j15);

    l1 u();

    void v();

    boolean w();

    void x();
}
