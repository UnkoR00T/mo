package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f95677a = Runtime.getRuntime();

    @Override // io.sentry.z0
    public void c() {
    }

    @Override // io.sentry.z0
    public void d(q3 q3Var) {
        q3Var.f(Long.valueOf(this.f95677a.totalMemory() - this.f95677a.freeMemory()));
    }
}
