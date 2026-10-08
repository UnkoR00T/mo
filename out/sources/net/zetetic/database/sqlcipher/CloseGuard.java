package net.zetetic.database.sqlcipher;

import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class CloseGuard {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CloseGuard f135372b = new CloseGuard();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f135373c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Reporter f135374d = new DefaultReporter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f135375a;

    private static final class DefaultReporter implements Reporter {
        @Override // net.zetetic.database.sqlcipher.CloseGuard.Reporter
        public void a(String str, Throwable th4) {
            c2.i(str, th4);
        }

        private DefaultReporter() {
        }
    }

    public interface Reporter {
        void a(String str, Throwable th4);
    }

    private CloseGuard() {
    }

    public static CloseGuard b() {
        return !f135373c ? f135372b : new CloseGuard();
    }

    public void a() {
        this.f135375a = null;
    }

    public void c(String str) {
        if (str == null) {
            throw new NullPointerException("closer == null");
        }
        if (this == f135372b || !f135373c) {
            return;
        }
        this.f135375a = new Throwable("Explicit termination method '" + str + "' not called");
    }

    public void d() {
        if (this.f135375a == null || !f135373c) {
            return;
        }
        f135374d.a("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.f135375a);
    }
}
