package vh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f206808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e0 f206809b;

    d0(e0 e0Var, l lVar) {
        this.f206808a = lVar;
        Objects.requireNonNull(e0Var);
        this.f206809b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f206809b;
        synchronized (e0Var.a()) {
            try {
                if (e0Var.b() != null) {
                    e0Var.b().c((Exception) jg.s.l(this.f206808a.l()));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
