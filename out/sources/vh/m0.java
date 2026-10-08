package vh;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class m0 implements Executor {
    m0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
