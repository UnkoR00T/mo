package pg;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import xg.p;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f157302a;

    public a(Looper looper) {
        this.f157302a = new p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f157302a.post(runnable);
    }
}
