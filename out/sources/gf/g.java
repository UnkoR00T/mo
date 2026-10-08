package gf;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cf.b<hf.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nq.a<lf.a> f72513a;

    public g(nq.a<lf.a> aVar) {
        this.f72513a = aVar;
    }

    public static hf.f a(lf.a aVar) {
        return (hf.f) cf.d.d(f.a(aVar));
    }

    public static g b(nq.a<lf.a> aVar) {
        return new g(aVar);
    }

    @Override // nq.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public hf.f get() {
        return a(this.f72513a.get());
    }
}
