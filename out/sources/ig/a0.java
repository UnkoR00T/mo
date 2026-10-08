package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e0 f92137a;

    a0(e0 e0Var) {
        Objects.requireNonNull(e0Var);
        this.f92137a = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92137a.H();
    }
}
