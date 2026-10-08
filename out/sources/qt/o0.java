package qt;

import vr.g1;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends yr.o0 implements b {
    private final us.j H;
    private final ws.d I;
    private final ws.h K;
    private final ws.j L;
    private final s O;

    public /* synthetic */ o0(vr.m mVar, g1 g1Var, wr.h hVar, zs.f fVar, vr.b.a aVar, us.j jVar, ws.d dVar, ws.h hVar2, ws.j jVar2, s sVar, h1 h1Var, int i15, fr.k kVar) {
        this(mVar, g1Var, hVar, fVar, aVar, jVar, dVar, hVar2, jVar2, sVar, (i15 & 1024) != 0 ? null : h1Var);
    }

    @Override // qt.t
    public ws.h I() {
        return this.K;
    }

    @Override // qt.t
    public ws.d L() {
        return this.I;
    }

    @Override // qt.t
    public s M() {
        return this.O;
    }

    @Override // yr.o0, yr.s
    /* JADX INFO: renamed from: R0 */
    protected yr.s u1(vr.m mVar, vr.z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        o0 o0Var = new o0(mVar, (g1) zVar, hVar, fVar == null ? getName() : fVar, aVar, k0(), L(), I(), w1(), M(), h1Var);
        o0Var.e1(W0());
        return o0Var;
    }

    @Override // qt.t
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public us.j k0() {
        return this.H;
    }

    public ws.j w1() {
        return this.L;
    }

    public o0(vr.m mVar, g1 g1Var, wr.h hVar, zs.f fVar, vr.b.a aVar, us.j jVar, ws.d dVar, ws.h hVar2, ws.j jVar2, s sVar, h1 h1Var) {
        super(mVar, g1Var, hVar, fVar, aVar, h1Var == null ? h1.f208052a : h1Var);
        this.H = jVar;
        this.I = dVar;
        this.K = hVar2;
        this.L = jVar2;
        this.O = sVar;
    }
}
