package yr;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 extends n implements vr.o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zs.c f228795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f228796f;

    public h0(vr.i0 i0Var, zs.c cVar) {
        super(i0Var, wr.h.f214542p0.b(), cVar.g(), h1.f208052a);
        this.f228795e = cVar;
        this.f228796f = "package " + cVar + " of " + i0Var;
    }

    @Override // vr.o0
    public final zs.c g() {
        return this.f228795e;
    }

    @Override // yr.n, vr.p
    public h1 m() {
        return h1.f208052a;
    }

    @Override // yr.m
    public String toString() {
        return this.f228796f;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.e(this, d15);
    }

    @Override // yr.n, vr.m
    public vr.i0 b() {
        return (vr.i0) super.b();
    }
}
