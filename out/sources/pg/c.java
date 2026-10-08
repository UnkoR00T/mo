package pg;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f157305a;

    public c(Runnable runnable, int i15) {
        this.f157305a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f157305a.run();
    }
}
