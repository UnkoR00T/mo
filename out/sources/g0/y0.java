package g0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.e1;
import o.h2;
import o.v1;
import o.w1;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f69155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f69156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i6.a<Throwable> f69157c;

    public y0(o.k kVar) {
        w1 w1VarF = kVar.f();
        Objects.requireNonNull(w1VarF);
        this.f69155a = w1VarF;
        this.f69156b = kVar.c();
        this.f69157c = kVar.b();
    }

    @Override // o.w1
    public void a(final h2 h2Var) {
        try {
            this.f69156b.execute(new Runnable() { // from class: g0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69145a.f69155a.a(h2Var);
                }
            });
        } catch (RejectedExecutionException unused) {
            e1.c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // g0.r0
    public void b() {
    }

    @Override // o.w1
    public void c(final v1 v1Var) {
        try {
            this.f69156b.execute(new Runnable() { // from class: g0.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69150a.f69155a.c(v1Var);
                }
            });
        } catch (RejectedExecutionException unused) {
            e1.c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // g0.r0
    public com.google.common.util.concurrent.q<Void> d(int i15, int i16) {
        return a0.f.f(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public String toString() {
        return "SurfaceProcessorWithExecutor(" + this.f69155a + ")";
    }
}
