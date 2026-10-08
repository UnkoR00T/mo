package vh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a0 f206856a;

    z(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        this.f206856a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f206856a;
        synchronized (a0Var.a()) {
            try {
                if (a0Var.b() != null) {
                    a0Var.b().b();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
