package vh;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f206818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i0 f206819b;

    h0(i0 i0Var, l lVar) {
        this.f206818a = lVar;
        Objects.requireNonNull(i0Var);
        this.f206819b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            l lVarA = this.f206819b.e().a(this.f206818a.m());
            if (lVarA == null) {
                this.f206819b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            i0 i0Var = this.f206819b;
            Executor executor = n.f206829b;
            lVarA.f(executor, i0Var);
            lVarA.d(executor, i0Var);
            lVarA.a(executor, i0Var);
        } catch (CancellationException unused) {
            this.f206819b.b();
        } catch (j e15) {
            if (e15.getCause() instanceof Exception) {
                this.f206819b.c((Exception) e15.getCause());
            } else {
                this.f206819b.c(e15);
            }
        } catch (Exception e16) {
            this.f206819b.c(e16);
        }
    }
}
