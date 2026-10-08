package yk;

/* JADX INFO: loaded from: classes4.dex */
class b0<T> implements kl.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kl.a<Object> f227452c = new kl.a() { // from class: yk.z
        @Override // kl.a
        public final void a(kl.b bVar) {
            b0.b(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kl.b<Object> f227453d = new kl.b() { // from class: yk.a0
        @Override // kl.b
        public final Object get() {
            return b0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kl.a<T> f227454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile kl.b<T> f227455b;

    private b0(kl.a<T> aVar, kl.b<T> bVar) {
        this.f227454a = aVar;
        this.f227455b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(kl.b bVar) {
    }

    static <T> b0<T> c() {
        return new b0<>(f227452c, f227453d);
    }

    void d(kl.b<T> bVar) {
        kl.a<T> aVar;
        if (this.f227455b != f227453d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f227454a;
            this.f227454a = null;
            this.f227455b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // kl.b
    public T get() {
        return this.f227455b.get();
    }
}
