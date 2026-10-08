package sj;

/* JADX INFO: loaded from: classes4.dex */
final class t extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ vh.m f181991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f181992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a0 f181993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(a0 a0Var, vh.m mVar, vh.m mVar2, q qVar) {
        super(mVar);
        this.f181993d = a0Var;
        this.f181991b = mVar2;
        this.f181992c = qVar;
    }

    @Override // sj.q
    public final void a() {
        synchronized (this.f181993d.f181963f) {
            try {
                a0.n(this.f181993d, this.f181991b);
                if (this.f181993d.f181968k.getAndIncrement() > 0) {
                    this.f181993d.f181959b.c("Already connected to the service.", new Object[0]);
                }
                a0.p(this.f181993d, this.f181992c);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
