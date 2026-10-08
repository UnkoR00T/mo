package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class t7 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95722b;

    public t7(String str, String str2) {
        this.f95721a = str;
        this.f95722b = str2;
    }

    private <T extends i5> T a(T t15) {
        if (t15.C().h() == null) {
            t15.C().v(new io.sentry.protocol.x());
        }
        io.sentry.protocol.x xVarH = t15.C().h();
        if (xVarH != null && xVarH.d() == null && xVarH.e() == null) {
            xVarH.f(this.f95722b);
            xVarH.h(this.f95721a);
        }
        return t15;
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, j0 j0Var) {
        return (r6) a(r6Var);
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, j0 j0Var) {
        return (io.sentry.protocol.c0) a(c0Var);
    }

    public t7() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
