package ot;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends yr.h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rt.n f149851g;

    public r(zs.c cVar, rt.n nVar, vr.i0 i0Var) {
        super(i0Var, cVar);
        this.f149851g = nVar;
    }

    public abstract j M0();

    public boolean Q0(zs.f fVar) {
        lt.k kVarR = r();
        return (kVarR instanceof qt.w) && ((qt.w) kVarR).t().contains(fVar);
    }

    public abstract void R0(n nVar);
}
