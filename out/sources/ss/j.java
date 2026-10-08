package ss;

import fr.q0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import st.d2;
import st.e1;
import st.l2;
import st.p2;
import st.s0;
import st.t0;
import st.w1;
import st.x1;
import vr.a1;
import vr.l1;
import vr.m1;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    public static final class a implements tt.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0<T> f183903a;

        /* JADX WARN: Multi-variable type inference failed */
        a(g0<? extends T> g0Var) {
            this.f183903a = g0Var;
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
        public wt.j F(wt.i iVar) {
            wt.j jVarG;
            wt.g gVarN = N(iVar);
            return (gVarN == null || (jVarG = g(gVarN)) == null) ? e(iVar) : jVarG;
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
        public boolean L0(wt.i iVar) {
            return z0(n(iVar)) && !q(iVar);
        }

        @Override // wt.s
        public /* bridge */ List<wt.i> M(wt.q qVar) {
            return tt.b.a.B(this, qVar);
        }

        @Override // wt.s
        public boolean M0(wt.i iVar) {
            return A(N0(iVar)) != A(F(iVar));
        }

        @Override // wt.s
        public /* bridge */ wt.g N(wt.i iVar) {
            return tt.b.a.h(this, iVar);
        }

        @Override // wt.s
        public wt.j N0(wt.i iVar) {
            wt.j jVarC;
            wt.g gVarN = N(iVar);
            return (gVarN == null || (jVarC = c(gVarN)) == null) ? e(iVar) : jVarC;
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
        public /* bridge */ w1 P0(boolean z15, boolean z16, boolean z17) {
            return tt.b.a.k0(this, z15, z16, z17);
        }

        @Override // st.j2
        public /* bridge */ boolean Q(wt.i iVar, zs.c cVar) {
            return tt.b.a.E(this, iVar, cVar);
        }

        @Override // wt.s
        public wt.k Q0(wt.j jVar) {
            wt.k kVarO0;
            wt.e eVarC0 = c0(jVar);
            return (eVarC0 == null || (kVarO0 = O0(eVarC0)) == null) ? (wt.k) jVar : kVarO0;
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
        /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
        public /* bridge */ e1 S0(wt.j jVar, wt.b bVar) {
            return tt.b.a.k(this, jVar, bVar);
        }

        @Override // wt.s
        public /* bridge */ boolean U(wt.d dVar) {
            return tt.b.a.W(this, dVar);
        }

        @Override // wt.s
        public List<wt.k> V(wt.j jVar, wt.p pVar) {
            return null;
        }

        @Override // wt.s
        public wt.d W(wt.j jVar) {
            return f(Q0(jVar));
        }

        @Override // wt.s
        public /* bridge */ wt.q X(wt.p pVar) {
            return tt.b.a.z(this, pVar);
        }

        @Override // wt.s
        public /* bridge */ wt.i Y(wt.i iVar, boolean z15) {
            return tt.b.a.j0(this, iVar, z15);
        }

        @Override // wt.s
        public boolean Z(wt.i iVar) {
            wt.j jVarE = e(iVar);
            return (jVarE != null ? W(jVarE) : null) != null;
        }

        @Override // wt.s
        public /* bridge */ wt.c a0(wt.d dVar) {
            return tt.b.a.t0(this, dVar);
        }

        @Override // tt.b, wt.s
        public /* bridge */ boolean b(wt.j jVar) {
            return tt.b.a.a0(this, jVar);
        }

        @Override // st.j2
        public /* bridge */ wt.i b0(wt.q qVar) {
            return tt.b.a.v(this, qVar);
        }

        @Override // wt.s
        public /* bridge */ wt.e c0(wt.j jVar) {
            return tt.b.a.f(this, jVar);
        }

        @Override // tt.b, wt.s
        public /* bridge */ wt.p d(wt.j jVar) {
            return tt.b.a.u0(this, jVar);
        }

        @Override // wt.s
        public boolean d0(wt.i iVar) {
            wt.j jVarE = e(iVar);
            return (jVarE != null ? c0(jVarE) : null) != null;
        }

        @Override // wt.s
        public /* bridge */ List<wt.m> e0(wt.i iVar) {
            return tt.b.a.o(this, iVar);
        }

        @Override // tt.b, wt.s
        public /* bridge */ wt.d f(wt.k kVar) {
            return tt.b.a.e(this, kVar);
        }

        @Override // wt.s
        public /* bridge */ boolean f0(wt.i iVar) {
            return tt.b.a.Z(this, iVar);
        }

        @Override // wt.s
        public /* bridge */ wt.i g0(wt.d dVar) {
            return tt.b.a.i0(this, dVar);
        }

        @Override // tt.b, wt.s
        public /* bridge */ boolean h(wt.m mVar) {
            return tt.b.a.c0(this, mVar);
        }

        @Override // wt.s
        public /* bridge */ Collection<wt.i> h0(wt.j jVar) {
            return tt.b.a.o0(this, jVar);
        }

        @Override // tt.b
        public sr.j i() {
            sr.j jVarI = this.f183903a.i();
            return jVarI == null ? tt.b.a.p(this) : jVarI;
        }

        @Override // wt.s
        public /* bridge */ boolean i0(wt.q qVar, wt.p pVar) {
            return tt.b.a.F(this, qVar, pVar);
        }

        @Override // wt.s
        public wt.m j(wt.j jVar, int i15) {
            if (i15 < 0 || i15 >= r0(jVar)) {
                return null;
            }
            return H(jVar, i15);
        }

        @Override // wt.s
        public /* bridge */ wt.b j0(wt.d dVar) {
            return tt.b.a.l(this, dVar);
        }

        @Override // wt.s
        public /* bridge */ wt.i k(wt.i iVar, boolean z15) {
            return tt.b.a.x0(this, iVar, z15);
        }

        @Override // st.j2
        public /* bridge */ wt.k k0() {
            return tt.b.a.l0(this);
        }

        @Override // wt.s
        public boolean l(wt.i iVar) {
            wt.g gVarN = N(iVar);
            return (gVarN != null ? p(gVarN) : null) != null;
        }

        @Override // wt.s
        public /* bridge */ boolean l0(wt.i iVar) {
            return tt.b.a.T(this, iVar);
        }

        @Override // wt.s
        public /* bridge */ wt.y m(wt.m mVar) {
            return tt.b.a.C(this, mVar);
        }

        @Override // wt.s
        public boolean m0(wt.i iVar) {
            return !fr.t.c(d(N0(iVar)), d(F(iVar)));
        }

        @Override // wt.s
        public wt.p n(wt.i iVar) {
            wt.j jVarE = e(iVar);
            if (jVarE == null) {
                jVarE = N0(iVar);
            }
            return d(jVarE);
        }

        @Override // st.j2
        public /* bridge */ wt.k n0(wt.i iVar) {
            return tt.b.a.c(this, iVar);
        }

        @Override // wt.s
        public boolean o(wt.j jVar) {
            return O(d(jVar));
        }

        @Override // wt.s
        public /* bridge */ boolean o0(wt.p pVar) {
            return tt.b.a.Q(this, pVar);
        }

        @Override // wt.s
        public /* bridge */ wt.f p(wt.g gVar) {
            return tt.b.a.g(this, gVar);
        }

        @Override // tt.b
        public /* bridge */ wt.i p0(wt.j jVar, wt.j jVar2) {
            return tt.b.a.m(this, jVar, jVar2);
        }

        @Override // wt.s
        public /* bridge */ boolean q(wt.i iVar) {
            return tt.b.a.V(this, iVar);
        }

        @Override // wt.s
        public /* bridge */ int q0(wt.p pVar) {
            return tt.b.a.n0(this, pVar);
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
        public boolean s(wt.i iVar) {
            return N(iVar) != null;
        }

        @Override // wt.s
        public boolean s0(wt.j jVar) {
            return A0(d(jVar));
        }

        @Override // wt.s
        public boolean t(wt.j jVar) {
            return c0(jVar) != null;
        }

        @Override // st.j2
        public wt.i t0(wt.i iVar) {
            wt.j jVarA;
            wt.j jVarE = e(iVar);
            return (jVarE == null || (jVarA = a(jVarE, true)) == null) ? iVar : jVarA;
        }

        @Override // st.j2
        public /* bridge */ sr.m u(wt.p pVar) {
            return tt.b.a.u(this, pVar);
        }

        @Override // wt.s
        public wt.m u0(wt.l lVar, int i15) {
            if (lVar instanceof wt.k) {
                return H((wt.i) lVar, i15);
            }
            if (lVar instanceof wt.a) {
                return ((wt.a) lVar).get(i15);
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + q0.c(lVar.getClass())).toString());
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
        public int w0(wt.l lVar) {
            if (lVar instanceof wt.j) {
                return r0((wt.i) lVar);
            }
            if (lVar instanceof wt.a) {
                return ((wt.a) lVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + q0.c(lVar.getClass())).toString());
        }

        @Override // wt.s
        public /* bridge */ wt.y x(wt.q qVar) {
            return tt.b.a.D(this, qVar);
        }

        @Override // wt.s
        public wt.i x0(wt.i iVar) {
            return Y(iVar, false);
        }

        @Override // wt.s
        public /* bridge */ List<wt.q> y(wt.p pVar) {
            return tt.b.a.s(this, pVar);
        }

        @Override // wt.s
        public /* bridge */ boolean y0(wt.p pVar, wt.p pVar2) {
            return tt.b.a.a(this, pVar, pVar2);
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

    public static final String a(vr.e eVar, g0<?> g0Var) {
        String strK = g0Var.k(eVar);
        if (strK != null) {
            return strK;
        }
        vr.m mVarB = eVar.b();
        String strJ = zs.h.b(eVar.getName()).j();
        if (mVarB instanceof o0) {
            zs.c cVarG = ((o0) mVarB).g();
            if (cVarG.c()) {
                return strJ;
            }
            return fu.r.O(cVarG.a(), '.', '/', false, 4, null) + '/' + strJ;
        }
        vr.e eVar2 = mVarB instanceof vr.e ? (vr.e) mVarB : null;
        if (eVar2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + mVarB + " for " + eVar);
        }
        String strO = g0Var.o(eVar2);
        if (strO == null) {
            strO = a(eVar2, g0Var);
        }
        return strO + '$' + strJ;
    }

    public static /* synthetic */ String b(vr.e eVar, g0 g0Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            g0Var = h0.f183877a;
        }
        return a(eVar, g0Var);
    }

    public static final boolean c(vr.a aVar) {
        if (aVar instanceof vr.l) {
            return true;
        }
        return (!sr.j.D0(aVar.f()) || l2.l(aVar.f()) || (aVar instanceof a1)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v31, types: [T, java.lang.Object] */
    public static final <T> T d(t0 t0Var, t<T> tVar, i0 i0Var, g0<? extends T> g0Var, q<T> qVar, er.q<? super t0, ? super T, ? super i0, oq.i0> qVar2) {
        T t15;
        t0 t0Var2;
        t0 t0VarN = g0Var.n(t0Var);
        if (t0VarN != null) {
            return (T) d(t0VarN, tVar, i0Var, g0Var, qVar, qVar2);
        }
        if (sr.i.s(t0Var)) {
            return (T) d(sr.q.a(t0Var), tVar, i0Var, g0Var, qVar, qVar2);
        }
        Object objB = j0.b(tt.u.f192145a, t0Var, tVar, i0Var);
        if (objB != null) {
            ?? r15 = (Object) j0.a(tVar, objB, i0Var.d());
            qVar2.w(t0Var, r15, i0Var);
            return r15;
        }
        x1 x1VarT0 = t0Var.T0();
        if (x1VarT0 instanceof s0) {
            s0 s0Var = (s0) x1VarT0;
            t0 t0VarL = s0Var.l();
            if (t0VarL == null) {
                t0VarL = g0Var.m(s0Var.q());
            }
            return (T) d(xt.d.D(t0VarL), tVar, i0Var, g0Var, qVar, qVar2);
        }
        vr.h hVarC = x1VarT0.c();
        if (hVarC == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + t0Var);
        }
        if (ut.l.m(hVarC)) {
            T t16 = (T) tVar.e("error/NonExistentClass");
            g0Var.j(t0Var, (vr.e) hVarC);
            return t16;
        }
        boolean z15 = hVarC instanceof vr.e;
        if (z15 && sr.j.d0(t0Var)) {
            if (t0Var.R0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            d2 d2Var = t0Var.R0().get(0);
            return (T) tVar.a('[' + tVar.c(d2Var.c() == p2.IN_VARIANCE ? tVar.e("java/lang/Object") : d(d2Var.getType(), tVar, i0Var.f(d2Var.c(), true), g0Var, qVar, qVar2)));
        }
        if (!z15) {
            if (hVarC instanceof m1) {
                t0 t0VarO = xt.d.o((m1) hVarC);
                if (t0Var.U0()) {
                    t0VarO = xt.d.B(t0VarO);
                }
                return (T) d(t0VarO, tVar, i0Var, g0Var, null, cu.i.l());
            }
            if ((hVarC instanceof l1) && i0Var.b()) {
                return (T) d(((l1) hVarC).K(), tVar, i0Var, g0Var, qVar, qVar2);
            }
            throw new UnsupportedOperationException("Unknown type " + t0Var);
        }
        if (dt.k.b(hVarC) && !i0Var.c() && (t0Var2 = (t0) st.j0.c(new a(g0Var), t0Var)) != null) {
            return (T) d(t0Var2, tVar, i0Var.g(), g0Var, qVar, qVar2);
        }
        if (i0Var.e() && sr.j.m0((vr.e) hVarC)) {
            t15 = (Object) tVar.f();
        } else {
            vr.e eVar = (vr.e) hVarC;
            T tL = g0Var.l(eVar.Q0());
            if (tL == null) {
                if (eVar.k() == vr.f.ENUM_ENTRY) {
                    eVar = (vr.e) eVar.b();
                }
                t15 = (Object) tVar.e(a(eVar.Q0(), g0Var));
            } else {
                t15 = (Object) tL;
            }
        }
        qVar2.w(t0Var, t15, i0Var);
        return t15;
    }

    public static /* synthetic */ Object e(t0 t0Var, t tVar, i0 i0Var, g0 g0Var, q qVar, er.q qVar2, int i15, Object obj) {
        if ((i15 & 32) != 0) {
            qVar2 = cu.i.l();
        }
        return d(t0Var, tVar, i0Var, g0Var, qVar, qVar2);
    }
}
