package tt;

import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import pq.v0;
import st.b1;
import st.d1;
import st.d2;
import st.e1;
import st.f0;
import st.h1;
import st.i2;
import st.j2;
import st.k0;
import st.l2;
import st.o2;
import st.p2;
import st.s0;
import st.t0;
import st.w0;
import st.w1;
import st.x0;
import st.x1;
import st.y1;
import vr.g0;
import vr.l1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends j2, wt.v {

    public static final class a {

        /* JADX INFO: renamed from: tt.b$a$a, reason: collision with other inner class name */
        public static final class C5017a extends w1.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f192107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i2 f192108b;

            C5017a(b bVar, i2 i2Var) {
                this.f192107a = bVar;
                this.f192108b = i2Var;
            }

            @Override // st.w1.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public wt.k a(w1 w1Var, wt.i iVar) {
                b bVar = this.f192107a;
                return bVar.e((wt.i) this.f192108b.o((t0) bVar.N0(iVar), p2.INVARIANT));
            }
        }

        public static wt.i A(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return dt.k.j((t0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static List<wt.i> B(b bVar, wt.q qVar) {
            if (qVar instanceof m1) {
                return ((m1) qVar).getUpperBounds();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + q0.c(qVar.getClass())).toString());
        }

        public static wt.y C(b bVar, wt.m mVar) {
            if (mVar instanceof d2) {
                return wt.u.a(((d2) mVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + q0.c(mVar.getClass())).toString());
        }

        public static wt.y D(b bVar, wt.q qVar) {
            if (qVar instanceof m1) {
                return wt.u.a(((m1) qVar).q());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + q0.c(qVar.getClass())).toString());
        }

        public static boolean E(b bVar, wt.i iVar, zs.c cVar) {
            if (iVar instanceof t0) {
                return ((t0) iVar).getAnnotations().d2(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static boolean F(b bVar, wt.q qVar, wt.p pVar) {
            if (!(qVar instanceof m1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + q0.c(qVar.getClass())).toString());
            }
            m1 m1Var = (m1) qVar;
            if (pVar == null ? true : pVar instanceof x1) {
                return xt.d.r(m1Var, (x1) pVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + m1Var + ", " + q0.c(m1Var.getClass())).toString());
        }

        public static boolean G(b bVar, wt.j jVar, wt.j jVar2) {
            if (!(jVar instanceof e1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
            }
            if (jVar2 instanceof e1) {
                return ((e1) jVar).R0() == ((e1) jVar2).R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + q0.c(jVar2.getClass())).toString());
        }

        public static wt.i H(b bVar, Collection<? extends wt.i> collection) {
            return d.a(collection);
        }

        public static boolean I(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return sr.j.x0((x1) pVar, sr.p.a.f183631b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean J(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return sr.j.d0((t0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static boolean K(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return ((x1) pVar).c() instanceof vr.e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean L(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                vr.h hVarC = ((x1) pVar).c();
                vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
                return (eVar == null || !g0.a(eVar) || eVar.k() == vr.f.ENUM_ENTRY || eVar.k() == vr.f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean M(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return ((x1) pVar).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean N(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return x0.a((t0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static boolean O(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                vr.h hVarC = ((x1) pVar).c();
                vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
                return (eVar != null ? eVar.Y() : null) instanceof vr.a0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean P(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return pVar instanceof ft.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean Q(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return pVar instanceof s0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean R(b bVar) {
            return false;
        }

        public static boolean S(b bVar, wt.i iVar) {
            return (iVar instanceof e1) && ((e1) iVar).U0();
        }

        public static boolean T(b bVar, wt.i iVar) {
            return iVar instanceof b1;
        }

        public static boolean U(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return sr.j.x0((x1) pVar, sr.p.a.f183633c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static boolean V(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return l2.l((t0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static boolean W(b bVar, wt.d dVar) {
            return dVar instanceof et.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean X(b bVar, wt.k kVar) {
            if (kVar instanceof t0) {
                return sr.j.t0((t0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + q0.c(kVar.getClass())).toString());
        }

        public static boolean Y(b bVar, wt.d dVar) {
            if (dVar instanceof i) {
                return ((i) dVar).f1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + q0.c(dVar.getClass())).toString());
        }

        public static boolean Z(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return iVar instanceof d1;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static boolean a(b bVar, wt.p pVar, wt.p pVar2) {
            if (!(pVar instanceof x1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
            }
            if (pVar2 instanceof x1) {
                return fr.t.c(pVar, pVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar2 + ", " + q0.c(pVar2.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a0(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                if (x0.a((t0) jVar)) {
                    return false;
                }
                e1 e1Var = (e1) jVar;
                if (e1Var.T0().c() instanceof l1) {
                    return false;
                }
                return e1Var.T0().c() != null || (jVar instanceof et.a) || (jVar instanceof i) || (jVar instanceof st.z) || (e1Var.T0() instanceof ft.q) || b0(bVar, (wt.k) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static int b(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return ((t0) iVar).R0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        private static boolean b0(b bVar, wt.k kVar) {
            return (kVar instanceof h1) && bVar.b(((h1) kVar).K0());
        }

        public static wt.k c(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return bVar.i().m(p2.INVARIANT, (t0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + q0.c(bVar.getClass())).toString());
        }

        public static boolean c0(b bVar, wt.m mVar) {
            if (mVar instanceof d2) {
                return ((d2) mVar).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + q0.c(mVar.getClass())).toString());
        }

        public static wt.l d(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                return (wt.l) jVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d0(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                return xt.d.u((t0) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static wt.d e(b bVar, wt.k kVar) {
            if (kVar instanceof e1) {
                if (kVar instanceof h1) {
                    return bVar.f(((h1) kVar).K0());
                }
                if (kVar instanceof i) {
                    return (i) kVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + q0.c(kVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean e0(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                return xt.d.v((t0) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static wt.e f(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                if (jVar instanceof st.z) {
                    return (st.z) jVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static boolean f0(b bVar, wt.i iVar) {
            return (iVar instanceof o2) && (((o2) iVar).T0() instanceof r);
        }

        public static wt.f g(b bVar, wt.g gVar) {
            if (gVar instanceof k0) {
                if (gVar instanceof f0) {
                    return (f0) gVar;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + q0.c(gVar.getClass())).toString());
        }

        public static boolean g0(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                vr.h hVarC = ((x1) pVar).c();
                return hVarC != null && sr.j.C0(hVarC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static wt.g h(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                o2 o2VarW0 = ((t0) iVar).W0();
                if (o2VarW0 instanceof k0) {
                    return (k0) o2VarW0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static wt.k h0(b bVar, wt.g gVar) {
            if (gVar instanceof k0) {
                return ((k0) gVar).b1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + q0.c(gVar.getClass())).toString());
        }

        public static wt.k i(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                o2 o2VarW0 = ((t0) iVar).W0();
                if (o2VarW0 instanceof e1) {
                    return (e1) o2VarW0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static wt.i i0(b bVar, wt.d dVar) {
            if (dVar instanceof i) {
                return ((i) dVar).e1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + q0.c(dVar.getClass())).toString());
        }

        public static wt.m j(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return xt.d.d((t0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static wt.i j0(b bVar, wt.i iVar, boolean z15) {
            if (iVar instanceof o2) {
                return c.b((o2) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static e1 k(b bVar, wt.j jVar, wt.b bVar2) {
            if (jVar instanceof e1) {
                return o.b((e1) jVar, bVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static w1 k0(b bVar, boolean z15, boolean z16, boolean z17) {
            return tt.a.b(z15, z16, bVar, null, null, 24, null);
        }

        public static wt.b l(b bVar, wt.d dVar) {
            if (dVar instanceof i) {
                return ((i) dVar).c1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + q0.c(dVar.getClass())).toString());
        }

        public static wt.k l0(b bVar) {
            return bVar.i().J();
        }

        public static wt.i m(b bVar, wt.j jVar, wt.j jVar2) {
            if (!(jVar instanceof e1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + q0.c(bVar.getClass())).toString());
            }
            if (jVar2 instanceof e1) {
                return w0.e((e1) jVar, (e1) jVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + q0.c(bVar.getClass())).toString());
        }

        public static wt.k m0(b bVar, wt.e eVar) {
            if (eVar instanceof st.z) {
                return ((st.z) eVar).f1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + q0.c(eVar.getClass())).toString());
        }

        public static wt.m n(b bVar, wt.i iVar, int i15) {
            if (iVar instanceof t0) {
                return ((t0) iVar).R0().get(i15);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static int n0(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return ((x1) pVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static List<wt.m> o(b bVar, wt.i iVar) {
            if (iVar instanceof t0) {
                return ((t0) iVar).R0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
        }

        public static Collection<wt.i> o0(b bVar, wt.j jVar) {
            wt.p pVarD = bVar.d(jVar);
            if (pVarD instanceof ft.q) {
                return ((ft.q) pVarD).j();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static sr.j p(b bVar) {
            throw new UnsupportedOperationException("Not supported");
        }

        public static wt.m p0(b bVar, wt.c cVar) {
            if (cVar instanceof n) {
                return ((n) cVar).v();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + q0.c(cVar.getClass())).toString());
        }

        public static zs.d q(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return ht.e.p((vr.e) ((x1) pVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static wt.i q0(b bVar, wt.r rVar, wt.i iVar) {
            if (!(iVar instanceof o2)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + q0.c(iVar.getClass())).toString());
            }
            if (rVar instanceof i2) {
                return ((i2) rVar).o((t0) iVar, p2.INVARIANT);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + rVar + ", " + q0.c(rVar.getClass())).toString());
        }

        public static wt.q r(b bVar, wt.p pVar, int i15) {
            if (pVar instanceof x1) {
                return ((x1) pVar).getParameters().get(i15);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static w1.c r0(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                return new C5017a(bVar, y1.f184171c.a((t0) jVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static List<wt.q> s(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return ((x1) pVar).getParameters();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static Collection<wt.i> s0(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return ((x1) pVar).q();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static sr.m t(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return sr.j.Q((vr.e) ((x1) pVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static wt.c t0(b bVar, wt.d dVar) {
            if (dVar instanceof i) {
                return ((i) dVar).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + q0.c(dVar.getClass())).toString());
        }

        public static sr.m u(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                return sr.j.T((vr.e) ((x1) pVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }

        public static wt.p u0(b bVar, wt.j jVar) {
            if (jVar instanceof e1) {
                return ((e1) jVar).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static wt.i v(b bVar, wt.q qVar) {
            if (qVar instanceof m1) {
                return xt.d.o((m1) qVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + q0.c(qVar.getClass())).toString());
        }

        public static wt.r v0(b bVar, Map<wt.p, ? extends wt.i> map) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<wt.p, ? extends wt.i> entry : map.entrySet()) {
                arrayList.add(oq.y.a((x1) entry.getKey(), xt.d.d((t0) entry.getValue())));
            }
            return i2.f(v0.s(arrayList));
        }

        public static wt.i w(b bVar, wt.m mVar) {
            if (bVar.h(mVar)) {
                return null;
            }
            if (mVar instanceof d2) {
                return ((d2) mVar).getType().W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + q0.c(mVar.getClass())).toString());
        }

        public static wt.k w0(b bVar, wt.g gVar) {
            if (gVar instanceof k0) {
                return ((k0) gVar).c1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + q0.c(gVar.getClass())).toString());
        }

        public static wt.p x(b bVar, wt.q qVar) {
            if (qVar instanceof m1) {
                return ((m1) qVar).o();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + qVar + ", " + q0.c(qVar.getClass())).toString());
        }

        public static wt.i x0(b bVar, wt.i iVar, boolean z15) {
            if (iVar instanceof wt.j) {
                return bVar.a((wt.j) iVar, z15);
            }
            if (!(iVar instanceof wt.g)) {
                throw new IllegalStateException("sealed");
            }
            wt.g gVar = (wt.g) iVar;
            return bVar.p0(bVar.a((wt.j) bVar.c(gVar), z15), bVar.a((wt.j) bVar.g(gVar), z15));
        }

        public static wt.q y(b bVar, wt.x xVar) {
            if (xVar instanceof r) {
                return ((r) xVar).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + xVar + ", " + q0.c(xVar.getClass())).toString());
        }

        public static wt.k y0(b bVar, wt.j jVar, boolean z15) {
            if (jVar instanceof e1) {
                return ((e1) jVar).X0(z15);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + q0.c(jVar.getClass())).toString());
        }

        public static wt.q z(b bVar, wt.p pVar) {
            if (pVar instanceof x1) {
                vr.h hVarC = ((x1) pVar).c();
                if (hVarC instanceof m1) {
                    return (m1) hVarC;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + pVar + ", " + q0.c(pVar.getClass())).toString());
        }
    }

    @Override // wt.s
    wt.k a(wt.j jVar, boolean z15);

    @Override // wt.s
    boolean b(wt.j jVar);

    @Override // wt.s
    wt.k c(wt.g gVar);

    @Override // wt.s
    wt.p d(wt.j jVar);

    @Override // wt.s
    wt.k e(wt.i iVar);

    @Override // wt.s
    wt.d f(wt.k kVar);

    @Override // wt.s
    wt.k g(wt.g gVar);

    @Override // wt.s
    boolean h(wt.m mVar);

    sr.j i();

    wt.i p0(wt.j jVar, wt.j jVar2);
}
