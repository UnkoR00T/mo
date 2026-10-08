package sj;

/* JADX INFO: loaded from: classes4.dex */
final class u extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0 f181994b;

    u(a0 a0Var) {
        this.f181994b = a0Var;
    }

    @Override // sj.q
    public final void a() {
        synchronized (this.f181994b.f181963f) {
            try {
                if (this.f181994b.f181968k.get() > 0 && this.f181994b.f181968k.decrementAndGet() > 0) {
                    this.f181994b.f181959b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                a0 a0Var = this.f181994b;
                if (a0Var.f181970m != null) {
                    a0Var.f181959b.c("Unbind from service.", new Object[0]);
                    a0 a0Var2 = this.f181994b;
                    a0Var2.f181958a.unbindService(a0Var2.f181969l);
                    this.f181994b.f181964g = false;
                    this.f181994b.f181970m = null;
                    this.f181994b.f181969l = null;
                }
                this.f181994b.w();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
