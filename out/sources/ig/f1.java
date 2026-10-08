package ig;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a f92193c;

    public f1(j.a aVar, vh.m mVar) {
        super(4, mVar);
        this.f92193c = aVar;
    }

    @Override // ig.g1
    public final /* bridge */ /* synthetic */ void c(v vVar, boolean z15) {
    }

    @Override // ig.q0
    public final gg.c[] f(e0 e0Var) {
        s0 s0Var = (s0) e0Var.u().get(this.f92193c);
        if (s0Var == null) {
            return null;
        }
        return s0Var.f92276a.c();
    }

    @Override // ig.q0
    public final boolean g(e0 e0Var) {
        s0 s0Var = (s0) e0Var.u().get(this.f92193c);
        return s0Var != null && s0Var.f92276a.e();
    }

    @Override // ig.b1
    public final void h(e0 e0Var) {
        s0 s0Var = (s0) e0Var.u().remove(this.f92193c);
        if (s0Var == null) {
            this.f92145b.e(Boolean.FALSE);
            return;
        }
        s0Var.f92277b.b(e0Var.t(), this.f92145b);
        s0Var.f92276a.a();
    }
}
