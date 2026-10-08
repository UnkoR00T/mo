package af;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements cf.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<lf.a> f6156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<lf.a> f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<gf.e> f6158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.a<hf.r> f6159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nq.a<hf.v> f6160e;

    public v(nq.a<lf.a> aVar, nq.a<lf.a> aVar2, nq.a<gf.e> aVar3, nq.a<hf.r> aVar4, nq.a<hf.v> aVar5) {
        this.f6156a = aVar;
        this.f6157b = aVar2;
        this.f6158c = aVar3;
        this.f6159d = aVar4;
        this.f6160e = aVar5;
    }

    public static v a(nq.a<lf.a> aVar, nq.a<lf.a> aVar2, nq.a<gf.e> aVar3, nq.a<hf.r> aVar4, nq.a<hf.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(lf.a aVar, lf.a aVar2, gf.e eVar, hf.r rVar, hf.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f6156a.get(), this.f6157b.get(), this.f6158c.get(), this.f6159d.get(), this.f6160e.get());
    }
}
