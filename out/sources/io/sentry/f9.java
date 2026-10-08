package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
interface f9 {

    public static final class a implements f9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f94957a = new a();

        private a() {
        }

        static f9 c() {
            return f94957a;
        }

        @Override // io.sentry.f9
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.f9
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
