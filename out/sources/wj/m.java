package wj;

/* JADX INFO: loaded from: classes4.dex */
final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ vh.m f213728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f213729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f213730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, vh.m mVar, vh.m mVar2, j jVar) {
        super(mVar);
        this.f213728b = mVar2;
        this.f213729c = jVar;
        this.f213730d = tVar;
    }

    @Override // wj.j
    public final void a() {
        synchronized (this.f213730d.f213742f) {
            try {
                t.n(this.f213730d, this.f213728b);
                if (this.f213730d.f213747k.getAndIncrement() > 0) {
                    this.f213730d.f213738b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f213730d, this.f213729c);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
