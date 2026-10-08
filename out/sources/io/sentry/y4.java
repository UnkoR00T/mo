package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class y4 implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u4 f95983a;

    public y4(u4 u4Var) {
        this.f95983a = (u4) io.sentry.util.v.c(u4Var, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.w4
    public t4 c(c1 c1Var, q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        io.sentry.util.v.c(q7Var, "SentryOptions is required");
        String strA = this.f95983a.a();
        if (strA != null && d(strA, q7Var.getLogger())) {
            return a(new p3(c1Var, q7Var.getEnvelopeReader(), q7Var.getSerializer(), q7Var.getLogger(), q7Var.getFlushTimeoutMillis(), q7Var.getMaxQueueSize()), strA, q7Var.getLogger());
        }
        q7Var.getLogger().c(b7.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    }
}
