package pm;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
enum u implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.a().f160824a.post(runnable);
    }
}
