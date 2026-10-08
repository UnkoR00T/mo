package qt;

import java.util.List;
import st.e1;
import st.h2;
import st.i2;
import st.p2;
import st.x0;
import vr.h1;
import vr.l1;
import vr.m1;
import vr.q1;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends yr.g implements t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final us.s f168373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ws.d f168374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ws.h f168375n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ws.j f168376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s f168377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e1 f168378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e1 f168379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<? extends m1> f168380t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e1 f168381v;

    public p0(rt.n nVar, vr.m mVar, wr.h hVar, zs.f fVar, vr.u uVar, us.s sVar, ws.d dVar, ws.h hVar2, ws.j jVar, s sVar2) {
        super(nVar, mVar, hVar, fVar, h1.f208052a, uVar);
        this.f168373l = sVar;
        this.f168374m = dVar;
        this.f168375n = hVar2;
        this.f168376p = jVar;
        this.f168377q = sVar2;
    }

    @Override // qt.t
    public ws.h I() {
        return this.f168375n;
    }

    @Override // vr.l1
    public e1 K() {
        e1 e1Var = this.f168379s;
        if (e1Var != null) {
            return e1Var;
        }
        return null;
    }

    @Override // qt.t
    public ws.d L() {
        return this.f168374m;
    }

    @Override // qt.t
    public s M() {
        return this.f168377q;
    }

    @Override // yr.g
    protected List<m1> X0() {
        List list = this.f168380t;
        if (list == null) {
            return null;
        }
        return list;
    }

    @Override // qt.t
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public us.s k0() {
        return this.f168373l;
    }

    public ws.j b1() {
        return this.f168376p;
    }

    public final void c1(List<? extends m1> list, e1 e1Var, e1 e1Var2) {
        Y0(list);
        this.f168378r = e1Var;
        this.f168379s = e1Var2;
        this.f168380t = q1.g(this);
        this.f168381v = S0();
    }

    @Override // vr.j1
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public l1 c(i2 i2Var) {
        if (i2Var.l()) {
            return this;
        }
        p0 p0Var = new p0(P(), b(), getAnnotations(), getName(), h(), k0(), L(), I(), b1(), M());
        List<m1> listV = v();
        e1 e1VarX0 = x0();
        p2 p2Var = p2.INVARIANT;
        p0Var.c1(listV, h2.a(i2Var.o(e1VarX0, p2Var)), h2.a(i2Var.o(K(), p2Var)));
        return p0Var;
    }

    @Override // vr.h
    public e1 t() {
        e1 e1Var = this.f168381v;
        if (e1Var == null) {
            return null;
        }
        return e1Var;
    }

    @Override // vr.l1
    public e1 x0() {
        e1 e1Var = this.f168378r;
        if (e1Var != null) {
            return e1Var;
        }
        return null;
    }

    @Override // vr.l1
    public vr.e y() {
        if (x0.a(K())) {
            return null;
        }
        vr.h hVarC = K().T0().c();
        if (hVarC instanceof vr.e) {
            return (vr.e) hVarC;
        }
        return null;
    }
}
