package jf;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements cf.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<lf.a> f102348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nq.a<lf.a> f102349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.a<e> f102350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.a<u0> f102351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nq.a<String> f102352e;

    public n0(nq.a<lf.a> aVar, nq.a<lf.a> aVar2, nq.a<e> aVar3, nq.a<u0> aVar4, nq.a<String> aVar5) {
        this.f102348a = aVar;
        this.f102349b = aVar2;
        this.f102350c = aVar3;
        this.f102351d = aVar4;
        this.f102352e = aVar5;
    }

    public static n0 a(nq.a<lf.a> aVar, nq.a<lf.a> aVar2, nq.a<e> aVar3, nq.a<u0> aVar4, nq.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(lf.a aVar, lf.a aVar2, Object obj, Object obj2, nq.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (u0) obj2, aVar3);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f102348a.get(), this.f102349b.get(), this.f102350c.get(), this.f102351d.get(), this.f102352e);
    }
}
