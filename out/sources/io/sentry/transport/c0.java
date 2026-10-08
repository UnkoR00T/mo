package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 {

    private static final class b extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f95740a;

        b(int i15) {
            super();
            this.f95740a = i15;
        }

        @Override // io.sentry.transport.c0
        public int c() {
            return this.f95740a;
        }

        @Override // io.sentry.transport.c0
        public boolean d() {
            return false;
        }
    }

    private static final class c extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f95741a = new c();

        private c() {
            super();
        }

        @Override // io.sentry.transport.c0
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.c0
        public boolean d() {
            return true;
        }
    }

    public static c0 a() {
        return b(-1);
    }

    public static c0 b(int i15) {
        return new b(i15);
    }

    public static c0 e() {
        return c.f95741a;
    }

    public abstract int c();

    public abstract boolean d();

    private c0() {
    }
}
