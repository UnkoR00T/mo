package dt;

import fr.q0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import st.e1;
import st.t0;
import st.w1;
import st.x1;
import wt.y;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements tt.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<x1, x1> f44514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tt.e.a f44515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tt.g f44516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tt.f f44517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final er.p<t0, t0, Boolean> f44518e;

    public static final class a extends w1 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p f44519l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, boolean z16, boolean z17, p pVar, tt.f fVar, tt.g gVar) {
            super(z15, z16, z17, true, pVar, fVar, gVar);
            this.f44519l = pVar;
        }

        @Override // st.w1
        public boolean f(wt.i iVar, wt.i iVar2) {
            if (!(iVar instanceof t0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iVar2 instanceof t0) {
                return ((Boolean) this.f44519l.f44518e.B(iVar, iVar2)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(Map<x1, ? extends x1> map, tt.e.a aVar, tt.g gVar, tt.f fVar, er.p<? super t0, ? super t0, Boolean> pVar) {
        this.f44514a = map;
        this.f44515b = aVar;
        this.f44516c = gVar;
        this.f44517d = fVar;
        this.f44518e = pVar;
    }

    private final boolean U0(x1 x1Var, x1 x1Var2) {
        if (this.f44515b.a(x1Var, x1Var2)) {
            return true;
        }
        Map<x1, x1> map = this.f44514a;
        if (map == null) {
            return false;
        }
        x1 x1Var3 = map.get(x1Var);
        x1 x1Var4 = this.f44514a.get(x1Var2);
        return (x1Var3 != null && fr.t.c(x1Var3, x1Var2)) || (x1Var4 != null && fr.t.c(x1Var4, x1Var));
    }

    @Override // wt.s
    public /* bridge */ boolean A(wt.i iVar) {
        return tt.b.a.S(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean A0(wt.p pVar) {
        return tt.b.a.P(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ boolean B(wt.i iVar) {
        return tt.b.a.N(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ wt.m B0(wt.c cVar) {
        return tt.b.a.p0(this, cVar);
    }

    @Override // st.j2
    public /* bridge */ zs.d C(wt.p pVar) {
        return tt.b.a.q(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ boolean C0(wt.j jVar) {
        return tt.b.a.d0(this, jVar);
    }

    @Override // wt.s
    public /* bridge */ wt.m D(wt.i iVar) {
        return tt.b.a.j(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean D0(wt.p pVar) {
        return tt.b.a.M(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ boolean E(wt.i iVar) {
        return tt.b.a.f0(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean E0(wt.j jVar) {
        return tt.b.a.e0(this, jVar);
    }

    @Override // wt.s
    public /* bridge */ wt.j F(wt.i iVar) {
        return q1(iVar);
    }

    @Override // st.j2
    public /* bridge */ boolean F0(wt.i iVar) {
        return tt.b.a.J(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ wt.i G(Collection<? extends wt.i> collection) {
        return tt.b.a.H(this, collection);
    }

    @Override // wt.s
    public /* bridge */ boolean G0(wt.p pVar) {
        return tt.b.a.I(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ wt.m H(wt.i iVar, int i15) {
        return tt.b.a.n(this, iVar, i15);
    }

    @Override // wt.s
    public /* bridge */ wt.i H0(wt.m mVar) {
        return tt.b.a.w(this, mVar);
    }

    @Override // st.j2
    public /* bridge */ wt.i I(wt.i iVar) {
        return tt.b.a.A(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ Collection<wt.i> I0(wt.p pVar) {
        return tt.b.a.s0(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ wt.p J(wt.q qVar) {
        return tt.b.a.x(this, qVar);
    }

    @Override // st.j2
    public /* bridge */ sr.m J0(wt.p pVar) {
        return tt.b.a.t(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ boolean K(wt.k kVar) {
        return tt.b.a.X(this, kVar);
    }

    @Override // wt.s
    public /* bridge */ wt.l K0(wt.j jVar) {
        return tt.b.a.d(this, jVar);
    }

    @Override // wt.v
    public /* bridge */ boolean L() {
        return tt.b.a.R(this);
    }

    @Override // wt.s
    public /* bridge */ boolean L0(wt.i iVar) {
        return j1(iVar);
    }

    @Override // wt.s
    public /* bridge */ List<wt.i> M(wt.q qVar) {
        return tt.b.a.B(this, qVar);
    }

    @Override // wt.s
    public /* bridge */ boolean M0(wt.i iVar) {
        return a1(iVar);
    }

    @Override // wt.s
    public /* bridge */ wt.g N(wt.i iVar) {
        return tt.b.a.h(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ wt.j N0(wt.i iVar) {
        return k1(iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean O(wt.p pVar) {
        return tt.b.a.K(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ wt.k O0(wt.e eVar) {
        return tt.b.a.m0(this, eVar);
    }

    @Override // wt.s
    public /* bridge */ wt.q P(wt.x xVar) {
        return tt.b.a.y(this, xVar);
    }

    @Override // wt.o
    public w1 P0(boolean z15, boolean z16, boolean z17) {
        if (this.f44518e != null) {
            return new a(z15, z16, z17, this, this.f44517d, this.f44516c);
        }
        return tt.a.a(z15, z16, this, this.f44517d, this.f44516c);
    }

    @Override // st.j2
    public /* bridge */ boolean Q(wt.i iVar, zs.c cVar) {
        return tt.b.a.E(this, iVar, cVar);
    }

    @Override // wt.s
    public /* bridge */ wt.k Q0(wt.j jVar) {
        return n1(jVar);
    }

    @Override // st.j2
    public /* bridge */ wt.r R(Map<wt.p, ? extends wt.i> map) {
        return tt.b.a.v0(this, map);
    }

    @Override // st.j2
    public /* bridge */ boolean R0(wt.p pVar) {
        return tt.b.a.O(this, pVar);
    }

    @Override // wt.w
    public /* bridge */ boolean S(wt.j jVar, wt.j jVar2) {
        return tt.b.a.G(this, jVar, jVar2);
    }

    @Override // st.j2
    public /* bridge */ boolean T(wt.p pVar) {
        return tt.b.a.g0(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ boolean U(wt.d dVar) {
        return tt.b.a.W(this, dVar);
    }

    @Override // wt.s
    public /* bridge */ List<wt.k> V(wt.j jVar, wt.p pVar) {
        return X0(jVar, pVar);
    }

    @Override // wt.s
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public /* bridge */ e1 S0(wt.j jVar, wt.b bVar) {
        return tt.b.a.k(this, jVar, bVar);
    }

    @Override // wt.s
    public /* bridge */ wt.d W(wt.j jVar) {
        return W0(jVar);
    }

    public wt.d W0(wt.j jVar) {
        return f(Q0(jVar));
    }

    @Override // wt.s
    public /* bridge */ wt.q X(wt.p pVar) {
        return tt.b.a.z(this, pVar);
    }

    public List<wt.k> X0(wt.j jVar, wt.p pVar) {
        return null;
    }

    @Override // wt.s
    public /* bridge */ wt.i Y(wt.i iVar, boolean z15) {
        return tt.b.a.j0(this, iVar, z15);
    }

    public wt.m Y0(wt.l lVar, int i15) {
        if (lVar instanceof wt.k) {
            return H((wt.i) lVar, i15);
        }
        if (lVar instanceof wt.a) {
            return ((wt.a) lVar).get(i15);
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + q0.c(lVar.getClass())).toString());
    }

    @Override // wt.s
    public /* bridge */ boolean Z(wt.i iVar) {
        return b1(iVar);
    }

    public wt.m Z0(wt.j jVar, int i15) {
        if (i15 < 0 || i15 >= r0(jVar)) {
            return null;
        }
        return H(jVar, i15);
    }

    @Override // wt.s
    public /* bridge */ wt.c a0(wt.d dVar) {
        return tt.b.a.t0(this, dVar);
    }

    public boolean a1(wt.i iVar) {
        return A(N0(iVar)) != A(F(iVar));
    }

    @Override // tt.b, wt.s
    public /* bridge */ boolean b(wt.j jVar) {
        return tt.b.a.a0(this, jVar);
    }

    @Override // st.j2
    public /* bridge */ wt.i b0(wt.q qVar) {
        return tt.b.a.v(this, qVar);
    }

    public boolean b1(wt.i iVar) {
        wt.j jVarE = e(iVar);
        return (jVarE != null ? W(jVarE) : null) != null;
    }

    @Override // wt.s
    public /* bridge */ wt.e c0(wt.j jVar) {
        return tt.b.a.f(this, jVar);
    }

    public boolean c1(wt.j jVar) {
        return O(d(jVar));
    }

    @Override // tt.b, wt.s
    public /* bridge */ wt.p d(wt.j jVar) {
        return tt.b.a.u0(this, jVar);
    }

    @Override // wt.s
    public /* bridge */ boolean d0(wt.i iVar) {
        return d1(iVar);
    }

    public boolean d1(wt.i iVar) {
        wt.j jVarE = e(iVar);
        return (jVarE != null ? c0(jVarE) : null) != null;
    }

    @Override // wt.s
    public /* bridge */ List<wt.m> e0(wt.i iVar) {
        return tt.b.a.o(this, iVar);
    }

    public boolean e1(wt.j jVar) {
        return c0(jVar) != null;
    }

    @Override // tt.b, wt.s
    public /* bridge */ wt.d f(wt.k kVar) {
        return tt.b.a.e(this, kVar);
    }

    @Override // wt.s
    public /* bridge */ boolean f0(wt.i iVar) {
        return tt.b.a.Z(this, iVar);
    }

    public boolean f1(wt.i iVar) {
        wt.g gVarN = N(iVar);
        return (gVarN != null ? p(gVarN) : null) != null;
    }

    @Override // wt.s
    public /* bridge */ wt.i g0(wt.d dVar) {
        return tt.b.a.i0(this, dVar);
    }

    public boolean g1(wt.i iVar) {
        return N(iVar) != null;
    }

    @Override // tt.b, wt.s
    public /* bridge */ boolean h(wt.m mVar) {
        return tt.b.a.c0(this, mVar);
    }

    @Override // wt.s
    public /* bridge */ Collection<wt.i> h0(wt.j jVar) {
        return tt.b.a.o0(this, jVar);
    }

    public boolean h1(wt.i iVar) {
        return !fr.t.c(d(N0(iVar)), d(F(iVar)));
    }

    @Override // tt.b
    public /* bridge */ sr.j i() {
        return tt.b.a.p(this);
    }

    @Override // wt.s
    public /* bridge */ boolean i0(wt.q qVar, wt.p pVar) {
        return tt.b.a.F(this, qVar, pVar);
    }

    public boolean i1(wt.j jVar) {
        return A0(d(jVar));
    }

    @Override // wt.s
    public /* bridge */ wt.m j(wt.j jVar, int i15) {
        return Z0(jVar, i15);
    }

    @Override // wt.s
    public /* bridge */ wt.b j0(wt.d dVar) {
        return tt.b.a.l(this, dVar);
    }

    public boolean j1(wt.i iVar) {
        return z0(n(iVar)) && !q(iVar);
    }

    @Override // wt.s
    public /* bridge */ wt.i k(wt.i iVar, boolean z15) {
        return tt.b.a.x0(this, iVar, z15);
    }

    @Override // st.j2
    public /* bridge */ wt.k k0() {
        return tt.b.a.l0(this);
    }

    public wt.j k1(wt.i iVar) {
        wt.j jVarC;
        wt.g gVarN = N(iVar);
        return (gVarN == null || (jVarC = c(gVarN)) == null) ? e(iVar) : jVarC;
    }

    @Override // wt.s
    public /* bridge */ boolean l(wt.i iVar) {
        return f1(iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean l0(wt.i iVar) {
        return tt.b.a.T(this, iVar);
    }

    public wt.i l1(wt.i iVar) {
        return Y(iVar, false);
    }

    @Override // wt.s
    public /* bridge */ y m(wt.m mVar) {
        return tt.b.a.C(this, mVar);
    }

    @Override // wt.s
    public /* bridge */ boolean m0(wt.i iVar) {
        return h1(iVar);
    }

    public wt.i m1(wt.i iVar) {
        wt.j jVarA;
        wt.j jVarE = e(iVar);
        return (jVarE == null || (jVarA = a(jVarE, true)) == null) ? iVar : jVarA;
    }

    @Override // wt.s
    public /* bridge */ wt.p n(wt.i iVar) {
        return p1(iVar);
    }

    @Override // st.j2
    public /* bridge */ wt.k n0(wt.i iVar) {
        return tt.b.a.c(this, iVar);
    }

    public wt.k n1(wt.j jVar) {
        wt.k kVarO0;
        wt.e eVarC0 = c0(jVar);
        return (eVarC0 == null || (kVarO0 = O0(eVarC0)) == null) ? (wt.k) jVar : kVarO0;
    }

    @Override // wt.s
    public /* bridge */ boolean o(wt.j jVar) {
        return c1(jVar);
    }

    @Override // wt.s
    public /* bridge */ boolean o0(wt.p pVar) {
        return tt.b.a.Q(this, pVar);
    }

    public int o1(wt.l lVar) {
        if (lVar instanceof wt.j) {
            return r0((wt.i) lVar);
        }
        if (lVar instanceof wt.a) {
            return ((wt.a) lVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + q0.c(lVar.getClass())).toString());
    }

    @Override // wt.s
    public /* bridge */ wt.f p(wt.g gVar) {
        return tt.b.a.g(this, gVar);
    }

    @Override // tt.b
    public /* bridge */ wt.i p0(wt.j jVar, wt.j jVar2) {
        return tt.b.a.m(this, jVar, jVar2);
    }

    public wt.p p1(wt.i iVar) {
        wt.j jVarE = e(iVar);
        if (jVarE == null) {
            jVarE = N0(iVar);
        }
        return d(jVarE);
    }

    @Override // wt.s
    public /* bridge */ boolean q(wt.i iVar) {
        return tt.b.a.V(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ int q0(wt.p pVar) {
        return tt.b.a.n0(this, pVar);
    }

    public wt.j q1(wt.i iVar) {
        wt.j jVarG;
        wt.g gVarN = N(iVar);
        return (gVarN == null || (jVarG = g(gVarN)) == null) ? e(iVar) : jVarG;
    }

    @Override // wt.s
    public /* bridge */ wt.q r(wt.p pVar, int i15) {
        return tt.b.a.r(this, pVar, i15);
    }

    @Override // wt.s
    public /* bridge */ int r0(wt.i iVar) {
        return tt.b.a.b(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean s(wt.i iVar) {
        return g1(iVar);
    }

    @Override // wt.s
    public /* bridge */ boolean s0(wt.j jVar) {
        return i1(jVar);
    }

    @Override // wt.s
    public /* bridge */ boolean t(wt.j jVar) {
        return e1(jVar);
    }

    @Override // st.j2
    public /* bridge */ wt.i t0(wt.i iVar) {
        return m1(iVar);
    }

    @Override // st.j2
    public /* bridge */ sr.m u(wt.p pVar) {
        return tt.b.a.u(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ wt.m u0(wt.l lVar, int i15) {
        return Y0(lVar, i15);
    }

    @Override // wt.s
    public /* bridge */ boolean v(wt.d dVar) {
        return tt.b.a.Y(this, dVar);
    }

    @Override // wt.s
    public /* bridge */ w1.c v0(wt.j jVar) {
        return tt.b.a.r0(this, jVar);
    }

    @Override // wt.s
    public /* bridge */ wt.i w(wt.r rVar, wt.i iVar) {
        return tt.b.a.q0(this, rVar, iVar);
    }

    @Override // wt.s
    public /* bridge */ int w0(wt.l lVar) {
        return o1(lVar);
    }

    @Override // wt.s
    public /* bridge */ y x(wt.q qVar) {
        return tt.b.a.D(this, qVar);
    }

    @Override // wt.s
    public /* bridge */ wt.i x0(wt.i iVar) {
        return l1(iVar);
    }

    @Override // wt.s
    public /* bridge */ List<wt.q> y(wt.p pVar) {
        return tt.b.a.s(this, pVar);
    }

    @Override // wt.s
    public boolean y0(wt.p pVar, wt.p pVar2) {
        if (!(pVar instanceof x1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (pVar2 instanceof x1) {
            return tt.b.a.a(this, pVar, pVar2) || U0((x1) pVar, (x1) pVar2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // wt.s
    public /* bridge */ boolean z(wt.p pVar) {
        return tt.b.a.L(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ boolean z0(wt.p pVar) {
        return tt.b.a.U(this, pVar);
    }

    @Override // wt.s
    public /* bridge */ wt.k a(wt.j jVar, boolean z15) {
        return tt.b.a.y0(this, jVar, z15);
    }

    @Override // wt.s
    public /* bridge */ wt.k c(wt.g gVar) {
        return tt.b.a.h0(this, gVar);
    }

    @Override // wt.s
    public /* bridge */ wt.k e(wt.i iVar) {
        return tt.b.a.i(this, iVar);
    }

    @Override // wt.s
    public /* bridge */ wt.k g(wt.g gVar) {
        return tt.b.a.w0(this, gVar);
    }
}
