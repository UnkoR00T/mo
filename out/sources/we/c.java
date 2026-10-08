package we;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    private static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f212548a;

        b() {
            super();
        }

        @Override // we.c
        public void b(boolean z15) {
            this.f212548a = z15;
        }

        @Override // we.c
        public void c() {
            if (this.f212548a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z15);

    public abstract void c();

    private c() {
    }
}
