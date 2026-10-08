package vh;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f206823a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f206824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f206825c;

    k0() {
    }

    public final void a(j0 j0Var) {
        synchronized (this.f206823a) {
            try {
                if (this.f206824b == null) {
                    this.f206824b = new ArrayDeque();
                }
                this.f206824b.add(j0Var);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void b(l lVar) {
        j0 j0Var;
        synchronized (this.f206823a) {
            if (this.f206824b != null && !this.f206825c) {
                this.f206825c = true;
                while (true) {
                    synchronized (this.f206823a) {
                        try {
                            j0Var = (j0) this.f206824b.poll();
                            if (j0Var == null) {
                                this.f206825c = false;
                                return;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    j0Var.d(lVar);
                }
            }
        }
    }
}
