package z;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f230972a;

    b() {
    }

    static Executor a() {
        if (f230972a != null) {
            return f230972a;
        }
        synchronized (b.class) {
            try {
                if (f230972a == null) {
                    f230972a = new b();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f230972a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
