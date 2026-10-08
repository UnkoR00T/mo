package ig;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f92154c;

    public d1(s0 s0Var, vh.m mVar) {
        super(3, mVar);
        this.f92154c = s0Var;
    }

    @Override // ig.g1
    public final /* bridge */ /* synthetic */ void c(v vVar, boolean z15) {
    }

    @Override // ig.q0
    public final gg.c[] f(e0 e0Var) {
        return this.f92154c.f92276a.c();
    }

    @Override // ig.q0
    public final boolean g(e0 e0Var) {
        return this.f92154c.f92276a.e();
    }

    @Override // ig.b1
    public final void h(e0 e0Var) {
        s0 s0Var = this.f92154c;
        n nVar = s0Var.f92276a;
        nVar.d(e0Var.t(), this.f92145b);
        j.a aVarB = nVar.b();
        if (aVarB != null) {
            e0Var.u().put(aVarB, s0Var);
        }
    }
}
