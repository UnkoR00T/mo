package ve;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f206281a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f206282b = new b();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.u(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f206282b;
    }

    public static Executor b() {
        return f206281a;
    }
}
