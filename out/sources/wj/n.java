package wj;

/* JADX INFO: loaded from: classes4.dex */
final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f213731b;

    n(t tVar) {
        this.f213731b = tVar;
    }

    @Override // wj.j
    public final void a() {
        synchronized (this.f213731b.f213742f) {
            try {
                if (this.f213731b.f213747k.get() > 0 && this.f213731b.f213747k.decrementAndGet() > 0) {
                    this.f213731b.f213738b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                t tVar = this.f213731b;
                if (tVar.f213749m != null) {
                    tVar.f213738b.c("Unbind from service.", new Object[0]);
                    t tVar2 = this.f213731b;
                    tVar2.f213737a.unbindService(tVar2.f213748l);
                    this.f213731b.f213743g = false;
                    this.f213731b.f213749m = null;
                    this.f213731b.f213748l = null;
                }
                this.f213731b.w();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
