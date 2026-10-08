package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d0 f92151a;

    c0(d0 d0Var) {
        Objects.requireNonNull(d0Var);
        this.f92151a = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f92151a.f92153a;
        e0Var.N().b(e0Var.N().getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
