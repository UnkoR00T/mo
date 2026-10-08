package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z0 f92287a;

    w0(z0 z0Var) {
        Objects.requireNonNull(z0Var);
        this.f92287a = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92287a.p3().b(new gg.a(4));
    }
}
