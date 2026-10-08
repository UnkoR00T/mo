package vh;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f206851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f206852b;

    x(y yVar, l lVar) {
        this.f206851a = lVar;
        Objects.requireNonNull(yVar);
        this.f206852b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            l lVar = (l) this.f206852b.e().a(this.f206851a);
            if (lVar == null) {
                this.f206852b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            y yVar = this.f206852b;
            Executor executor = n.f206829b;
            lVar.f(executor, yVar);
            lVar.d(executor, yVar);
            lVar.a(executor, yVar);
        } catch (j e15) {
            if (!(e15.getCause() instanceof Exception)) {
                this.f206852b.f().v(e15);
                return;
            }
            y yVar2 = this.f206852b;
            yVar2.f().v((Exception) e15.getCause());
        } catch (Exception e16) {
            this.f206852b.f().v(e16);
        }
    }
}
