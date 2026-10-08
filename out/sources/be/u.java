package be;

/* JADX INFO: loaded from: classes3.dex */
final class u<Z> implements v<Z>, we.a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i6.f<u<?>> f18814e = we.a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final we.c f18815a = we.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v<Z> f18816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18818d;

    class a implements we.a.d<u<?>> {
        a() {
        }

        @Override // we.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    private void a(v<Z> vVar) {
        this.f18818d = false;
        this.f18817c = true;
        this.f18816b = vVar;
    }

    static <Z> u<Z> e(v<Z> vVar) {
        u<Z> uVar = (u) ve.k.d(f18814e.z());
        uVar.a(vVar);
        return uVar;
    }

    private void f() {
        this.f18816b = null;
        f18814e.A(this);
    }

    @Override // we.a.f
    public we.c b() {
        return this.f18815a;
    }

    @Override // be.v
    public synchronized void c() {
        this.f18815a.c();
        this.f18818d = true;
        if (!this.f18817c) {
            this.f18816b.c();
            f();
        }
    }

    @Override // be.v
    public Class<Z> d() {
        return this.f18816b.d();
    }

    synchronized void g() {
        this.f18815a.c();
        if (!this.f18817c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f18817c = false;
        if (this.f18818d) {
            c();
        }
    }

    @Override // be.v
    public Z get() {
        return this.f18816b.get();
    }

    @Override // be.v
    public int getSize() {
        return this.f18816b.getSize();
    }
}
