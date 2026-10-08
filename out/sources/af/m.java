package af;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
class m implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f6141a;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f6142a;

        a(Runnable runnable) {
            this.f6142a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6142a.run();
            } catch (Exception e15) {
                ef.a.c("Executor", "Background execution failure.", e15);
            }
        }
    }

    m(Executor executor) {
        this.f6141a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6141a.execute(new a(runnable));
    }
}
