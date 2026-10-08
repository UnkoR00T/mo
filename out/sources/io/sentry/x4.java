package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class x4 implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u4 f95961a;

    public x4(u4 u4Var) {
        this.f95961a = (u4) io.sentry.util.v.c(u4Var, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.w4
    public t4 c(c1 c1Var, q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        io.sentry.util.v.c(q7Var, "SentryOptions is required");
        String strA = this.f95961a.a();
        if (strA != null && d(strA, q7Var.getLogger())) {
            return a(new d0(c1Var, q7Var.getSerializer(), q7Var.getLogger(), q7Var.getFlushTimeoutMillis(), q7Var.getMaxQueueSize()), strA, q7Var.getLogger());
        }
        q7Var.getLogger().c(b7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }
}
