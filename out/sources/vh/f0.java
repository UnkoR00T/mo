package vh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f206813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g0 f206814b;

    f0(g0 g0Var, l lVar) {
        this.f206813a = lVar;
        Objects.requireNonNull(g0Var);
        this.f206814b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var = this.f206814b;
        synchronized (g0Var.a()) {
            try {
                if (g0Var.b() != null) {
                    g0Var.b().a(this.f206813a.m());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
