package vh;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class p0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0 f206838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f206839b;

    p0(o0 o0Var, Callable callable) {
        this.f206838a = o0Var;
        this.f206839b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f206838a.t(this.f206839b.call());
        } catch (Exception e15) {
            this.f206838a.v(e15);
        } catch (Throwable th4) {
            this.f206838a.v(new RuntimeException(th4));
        }
    }
}
