package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface e1 {
    io.sentry.transport.a0 F();

    io.sentry.protocol.v H(p5 p5Var, j0 j0Var);

    io.sentry.protocol.v a(r7 r7Var, a1 a1Var, j0 j0Var);

    void b(d7 d7Var, a1 a1Var);

    io.sentry.protocol.v c(io.sentry.protocol.c0 c0Var, z8 z8Var, a1 a1Var, j0 j0Var, w3 w3Var);

    default io.sentry.protocol.v d(r6 r6Var, a1 a1Var) {
        return i(r6Var, a1Var, null);
    }

    void e(i8 i8Var, j0 j0Var);

    void f(f7 f7Var);

    default io.sentry.protocol.v g(String str, b7 b7Var, a1 a1Var) {
        r6 r6Var = new r6();
        io.sentry.protocol.k kVar = new io.sentry.protocol.k();
        kVar.f(str);
        r6Var.D0(kVar);
        r6Var.C0(b7Var);
        return d(r6Var, a1Var);
    }

    io.sentry.protocol.v h(s3 s3Var, a1 a1Var);

    io.sentry.protocol.v i(r6 r6Var, a1 a1Var, j0 j0Var);

    boolean isEnabled();

    void n(boolean z15);

    void t(long j15);

    default boolean w() {
        return true;
    }
}
