package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f95714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f95715b;

    public t(q7 q7Var, v0 v0Var) {
        this.f95714a = (q7) io.sentry.util.v.c(q7Var, "SentryOptions is required.");
        this.f95715b = v0Var;
    }

    @Override // io.sentry.v0
    public void a(b7 b7Var, Throwable th4, String str, Object... objArr) {
        if (this.f95715b == null || !d(b7Var)) {
            return;
        }
        this.f95715b.a(b7Var, th4, str, objArr);
    }

    @Override // io.sentry.v0
    public void b(b7 b7Var, String str, Throwable th4) {
        if (this.f95715b == null || !d(b7Var)) {
            return;
        }
        this.f95715b.b(b7Var, str, th4);
    }

    @Override // io.sentry.v0
    public void c(b7 b7Var, String str, Object... objArr) {
        if (this.f95715b == null || !d(b7Var)) {
            return;
        }
        this.f95715b.c(b7Var, str, objArr);
    }

    @Override // io.sentry.v0
    public boolean d(b7 b7Var) {
        return b7Var != null && this.f95714a.isDebug() && b7Var.ordinal() >= this.f95714a.getDiagnosticLevel().ordinal();
    }
}
