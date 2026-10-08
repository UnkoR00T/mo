package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ th.l f92290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z0 f92291b;

    x0(z0 z0Var, th.l lVar) {
        this.f92290a = lVar;
        Objects.requireNonNull(z0Var);
        this.f92291b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92291b.o3(this.f92290a);
    }
}
