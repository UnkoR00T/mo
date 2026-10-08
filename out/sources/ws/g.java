package ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pq.v;
import us.o;
import us.r;
import us.s;
import us.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final r a(r rVar, h hVar) {
        if (rVar.q0()) {
            return rVar.X();
        }
        if (rVar.r0()) {
            return hVar.a(rVar.Y());
        }
        return null;
    }

    public static final List<r> b(us.c cVar, h hVar) {
        List<r> listH0 = cVar.H0();
        if (listH0.isEmpty()) {
            listH0 = null;
        }
        if (listH0 == null) {
            List<Integer> listG0 = cVar.G0();
            listH0 = new ArrayList<>(v.y(listG0, 10));
            Iterator<T> it = listG0.iterator();
            while (it.hasNext()) {
                listH0.add(hVar.a(((Integer) it.next()).intValue()));
            }
        }
        return listH0;
    }

    public static final List<r> c(us.j jVar, h hVar) {
        List<r> listV0 = jVar.v0();
        if (listV0.isEmpty()) {
            listV0 = null;
        }
        if (listV0 == null) {
            List<Integer> listU0 = jVar.u0();
            listV0 = new ArrayList<>(v.y(listU0, 10));
            Iterator<T> it = listU0.iterator();
            while (it.hasNext()) {
                listV0.add(hVar.a(((Integer) it.next()).intValue()));
            }
        }
        return listV0;
    }

    public static final List<r> d(o oVar, h hVar) {
        List<r> listF0 = oVar.F0();
        if (listF0.isEmpty()) {
            listF0 = null;
        }
        if (listF0 == null) {
            List<Integer> listE0 = oVar.E0();
            listF0 = new ArrayList<>(v.y(listE0, 10));
            Iterator<T> it = listE0.iterator();
            while (it.hasNext()) {
                listF0.add(hVar.a(((Integer) it.next()).intValue()));
            }
        }
        return listF0;
    }

    public static final r e(s sVar, h hVar) {
        if (sVar.o0()) {
            return sVar.e0();
        }
        if (sVar.p0()) {
            return hVar.a(sVar.f0());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final r f(r rVar, h hVar) {
        if (rVar.v0()) {
            return rVar.i0();
        }
        if (rVar.w0()) {
            return hVar.a(rVar.j0());
        }
        return null;
    }

    public static final boolean g(us.j jVar) {
        return jVar.V0() || jVar.W0();
    }

    public static final boolean h(o oVar) {
        return oVar.m1() || oVar.n1();
    }

    public static final r i(us.c cVar, h hVar) {
        if (cVar.r1()) {
            return cVar.T0();
        }
        if (cVar.s1()) {
            return hVar.a(cVar.U0());
        }
        return null;
    }

    public static final r j(us.i iVar, h hVar) {
        if (iVar.W()) {
            return iVar.M();
        }
        if (iVar.X()) {
            return hVar.a(iVar.N());
        }
        return null;
    }

    public static final r k(r rVar, h hVar) {
        if (rVar.y0()) {
            return rVar.l0();
        }
        if (rVar.z0()) {
            return hVar.a(rVar.m0());
        }
        return null;
    }

    public static final r l(us.j jVar, h hVar) {
        if (jVar.V0()) {
            return jVar.F0();
        }
        if (jVar.W0()) {
            return hVar.a(jVar.G0());
        }
        return null;
    }

    public static final r m(o oVar, h hVar) {
        if (oVar.m1()) {
            return oVar.V0();
        }
        if (oVar.n1()) {
            return hVar.a(oVar.W0());
        }
        return null;
    }

    public static final r n(us.j jVar, h hVar) {
        if (jVar.X0()) {
            return jVar.H0();
        }
        if (jVar.Y0()) {
            return hVar.a(jVar.I0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final r o(o oVar, h hVar) {
        if (oVar.o1()) {
            return oVar.X0();
        }
        if (oVar.p1()) {
            return hVar.a(oVar.Y0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List<r> p(us.c cVar, h hVar) {
        List<r> listD1 = cVar.d1();
        if (listD1.isEmpty()) {
            listD1 = null;
        }
        if (listD1 == null) {
            List<Integer> listC1 = cVar.c1();
            listD1 = new ArrayList<>(v.y(listC1, 10));
            Iterator<T> it = listC1.iterator();
            while (it.hasNext()) {
                listD1.add(hVar.a(((Integer) it.next()).intValue()));
            }
        }
        return listD1;
    }

    public static final r q(r.b bVar, h hVar) {
        if (bVar.F()) {
            return bVar.C();
        }
        if (bVar.G()) {
            return hVar.a(bVar.D());
        }
        return null;
    }

    public static final r r(us.v vVar, h hVar) {
        if (vVar.h0()) {
            return vVar.a0();
        }
        if (vVar.i0()) {
            return hVar.a(vVar.b0());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final r s(s sVar, h hVar) {
        if (sVar.s0()) {
            return sVar.l0();
        }
        if (sVar.t0()) {
            return hVar.a(sVar.m0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List<r> t(t tVar, h hVar) {
        List<r> listY = tVar.Y();
        if (listY.isEmpty()) {
            listY = null;
        }
        if (listY == null) {
            List<Integer> listX = tVar.X();
            listY = new ArrayList<>(v.y(listX, 10));
            Iterator<T> it = listX.iterator();
            while (it.hasNext()) {
                listY.add(hVar.a(((Integer) it.next()).intValue()));
            }
        }
        return listY;
    }

    public static final r u(us.v vVar, h hVar) {
        if (vVar.j0()) {
            return vVar.c0();
        }
        if (vVar.k0()) {
            return hVar.a(vVar.d0());
        }
        return null;
    }
}
