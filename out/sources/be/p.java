package be;

/* JADX INFO: loaded from: classes3.dex */
class p<Z> implements v<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v<Z> f18794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f18795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zd.f f18796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18798g;

    interface a {
        void a(zd.f fVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z15, boolean z16, zd.f fVar, a aVar) {
        this.f18794c = (v) ve.k.d(vVar);
        this.f18792a = z15;
        this.f18793b = z16;
        this.f18796e = fVar;
        this.f18795d = (a) ve.k.d(aVar);
    }

    synchronized void a() {
        if (this.f18798g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f18797f++;
    }

    v<Z> b() {
        return this.f18794c;
    }

    @Override // be.v
    public synchronized void c() {
        if (this.f18797f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f18798g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f18798g = true;
        if (this.f18793b) {
            this.f18794c.c();
        }
    }

    @Override // be.v
    public Class<Z> d() {
        return this.f18794c.d();
    }

    boolean e() {
        return this.f18792a;
    }

    void f() {
        boolean z15;
        synchronized (this) {
            int i15 = this.f18797f;
            if (i15 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z15 = true;
            int i16 = i15 - 1;
            this.f18797f = i16;
            if (i16 != 0) {
                z15 = false;
            }
        }
        if (z15) {
            this.f18795d.a(this.f18796e, this);
        }
    }

    @Override // be.v
    public Z get() {
        return this.f18794c.get();
    }

    @Override // be.v
    public int getSize() {
        return this.f18794c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f18792a + ", listener=" + this.f18795d + ", key=" + this.f18796e + ", acquired=" + this.f18797f + ", isRecycled=" + this.f18798g + ", resource=" + this.f18794c + '}';
    }
}
