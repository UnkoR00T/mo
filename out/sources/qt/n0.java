package qt;

import vr.h1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends yr.k0 implements b {
    private final us.o F;
    private final ws.d G;
    private final ws.h H;
    private final ws.j I;
    private final s K;

    public n0(vr.m mVar, z0 z0Var, wr.h hVar, vr.f0 f0Var, vr.u uVar, boolean z15, zs.f fVar, vr.b.a aVar, boolean z16, boolean z17, boolean z18, boolean z19, boolean z25, us.o oVar, ws.d dVar, ws.h hVar2, ws.j jVar, s sVar) {
        super(mVar, z0Var, hVar, f0Var, uVar, z15, fVar, aVar, h1.f208052a, z16, z17, z25, false, z18, z19);
        this.F = oVar;
        this.G = dVar;
        this.H = hVar2;
        this.I = jVar;
        this.K = sVar;
    }

    @Override // qt.t
    public ws.h I() {
        return this.H;
    }

    @Override // qt.t
    public ws.d L() {
        return this.G;
    }

    @Override // qt.t
    public s M() {
        return this.K;
    }

    @Override // yr.k0
    protected yr.k0 V0(vr.m mVar, vr.f0 f0Var, vr.u uVar, z0 z0Var, vr.b.a aVar, zs.f fVar, h1 h1Var) {
        return new n0(mVar, z0Var, getAnnotations(), f0Var, uVar, Q(), fVar, aVar, C0(), f0(), d0(), F(), o0(), k0(), L(), I(), m1(), M());
    }

    @Override // yr.k0, vr.e0
    public boolean d0() {
        return ws.b.G.d(k0().O0()).booleanValue();
    }

    @Override // qt.t
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public us.o k0() {
        return this.F;
    }

    public ws.j m1() {
        return this.I;
    }
}
