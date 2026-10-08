package qt;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends yr.i implements b {
    private final us.e I;
    private final ws.d K;
    private final ws.h L;
    private final ws.j O;
    private final s P;

    public /* synthetic */ c(vr.e eVar, vr.l lVar, wr.h hVar, boolean z15, vr.b.a aVar, us.e eVar2, ws.d dVar, ws.h hVar2, ws.j jVar, s sVar, h1 h1Var, int i15, fr.k kVar) {
        this(eVar, lVar, hVar, z15, aVar, eVar2, dVar, hVar2, jVar, sVar, (i15 & 1024) != 0 ? null : h1Var);
    }

    public ws.j A1() {
        return this.O;
    }

    @Override // yr.s, vr.z
    public boolean G() {
        return false;
    }

    @Override // qt.t
    public ws.h I() {
        return this.L;
    }

    @Override // qt.t
    public ws.d L() {
        return this.K;
    }

    @Override // qt.t
    public s M() {
        return this.P;
    }

    @Override // yr.s, vr.e0
    public boolean d0() {
        return false;
    }

    @Override // yr.s, vr.z
    public boolean n() {
        return false;
    }

    @Override // yr.s, vr.z
    public boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.i
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c u1(vr.m mVar, vr.z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        c cVar = new c((vr.e) mVar, (vr.l) zVar, hVar, this.H, aVar, k0(), L(), I(), A1(), M(), h1Var);
        cVar.e1(W0());
        return cVar;
    }

    @Override // qt.t
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public us.e k0() {
        return this.I;
    }

    public c(vr.e eVar, vr.l lVar, wr.h hVar, boolean z15, vr.b.a aVar, us.e eVar2, ws.d dVar, ws.h hVar2, ws.j jVar, s sVar, h1 h1Var) {
        super(eVar, lVar, hVar, z15, aVar, h1Var == null ? h1.f208052a : h1Var);
        this.I = eVar2;
        this.K = dVar;
        this.L = hVar2;
        this.O = jVar;
        this.P = sVar;
    }
}
