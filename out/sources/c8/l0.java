package c8;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f24304a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f24304a.post(runnable);
    }
}
