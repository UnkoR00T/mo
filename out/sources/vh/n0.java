package vh;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class n0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f206830a = new ih.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f206830a.post(runnable);
    }
}
