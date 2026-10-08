package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<c1> f95539a = new ThreadLocal<>();

    static final class a implements g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c1 f95540a;

        a(c1 c1Var) {
            this.f95540a = c1Var;
        }

        @Override // io.sentry.g1, java.lang.AutoCloseable
        public void close() {
            q.f95539a.set(this.f95540a);
        }
    }

    @Override // io.sentry.d1
    public g1 a(c1 c1Var) {
        c1 c1Var2 = get();
        f95539a.set(c1Var);
        return new a(c1Var2);
    }

    @Override // io.sentry.d1
    public void close() {
        f95539a.remove();
    }

    @Override // io.sentry.d1
    public c1 get() {
        return f95539a.get();
    }

    @Override // io.sentry.d1
    public void init() {
    }
}
