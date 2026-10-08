package re;

/* JADX INFO: loaded from: classes3.dex */
public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f173317a;

        a(boolean z15) {
            this.f173317a = z15;
        }

        boolean e() {
            return this.f173317a;
        }
    }

    boolean b();

    void c(d dVar);

    boolean d(d dVar);

    void e(d dVar);

    e getRoot();

    boolean h(d dVar);

    boolean k(d dVar);
}
