package vb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class d implements ub.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f205752a = e6.g.a(Looper.getMainLooper());

    @Override // ub.j0
    public void a(Runnable runnable) {
        this.f205752a.removeCallbacks(runnable);
    }

    @Override // ub.j0
    public void b(long j15, Runnable runnable) {
        this.f205752a.postDelayed(runnable, j15);
    }
}
