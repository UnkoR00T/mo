package vh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f206803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c0 f206804b;

    b0(c0 c0Var, l lVar) {
        this.f206803a = lVar;
        Objects.requireNonNull(c0Var);
        this.f206804b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.f206804b;
        synchronized (c0Var.a()) {
            try {
                if (c0Var.b() != null) {
                    c0Var.b().a(this.f206803a);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
