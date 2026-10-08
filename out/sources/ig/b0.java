package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f92143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e0 f92144b;

    b0(e0 e0Var, int i15) {
        this.f92143a = i15;
        Objects.requireNonNull(e0Var);
        this.f92144b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92144b.I(this.f92143a);
    }
}
