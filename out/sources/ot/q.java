package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr.p0 f149847a;

    public q(vr.p0 p0Var) {
        this.f149847a = p0Var;
    }

    @Override // ot.j
    public i a(zs.b bVar) {
        i iVarA;
        for (vr.o0 o0Var : vr.t0.c(this.f149847a, bVar.f())) {
            if ((o0Var instanceof r) && (iVarA = ((r) o0Var).M0().a(bVar)) != null) {
                return iVarA;
            }
        }
        return null;
    }
}
