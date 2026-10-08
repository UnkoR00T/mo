package h8;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends h8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f81769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f81770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t7.s f81771j;

    public static final class b implements c0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f81772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s f81773d;

        public b(long j15, s sVar) {
            this.f81772c = j15;
            this.f81773d = sVar;
        }

        @Override // h8.c0.a
        public c0.a c(d8.w wVar) {
            return this;
        }

        @Override // h8.c0.a
        public c0.a e(k8.j jVar) {
            return this;
        }

        @Override // h8.c0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public u d(t7.s sVar) {
            return new u(sVar, this.f81772c, this.f81773d);
        }
    }

    @Override // h8.a
    protected void A() {
    }

    @Override // h8.c0
    public synchronized t7.s b() {
        return this.f81771j;
    }

    @Override // h8.c0
    public synchronized void c(t7.s sVar) {
        this.f81771j = sVar;
    }

    @Override // h8.c0
    public b0 e(c0.b bVar, k8.b bVar2, long j15) {
        t7.s sVarB = b();
        zj.p.q(sVarB.f188433b);
        zj.p.r(sVarB.f188433b.f188529b, "Externally loaded mediaItems require a MIME type.");
        t7.s.h hVar = sVarB.f188433b;
        return new t(hVar.f188528a, hVar.f188529b, this.f81769h);
    }

    @Override // h8.c0
    public void j() {
    }

    @Override // h8.c0
    public void p(b0 b0Var) {
        ((t) b0Var).m();
    }

    @Override // h8.a
    protected void y(y7.x xVar) {
        z(new c1(this.f81770i, true, false, false, null, b()));
    }

    private u(t7.s sVar, long j15, s sVar2) {
        this.f81771j = sVar;
        this.f81770i = j15;
        this.f81769h = sVar2;
    }
}
