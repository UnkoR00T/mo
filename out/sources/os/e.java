package os;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js.v0;
import ms.p;
import pq.IndexedValue;
import pq.v;
import qs.a0;
import qs.c0;
import qs.x;
import qs.y;
import sr.m;
import st.c2;
import st.d2;
import st.e1;
import st.f2;
import st.k2;
import st.l2;
import st.p2;
import st.t0;
import st.t1;
import st.u1;
import st.w0;
import st.x1;
import st.z0;
import ut.l;
import vr.m1;
import wr.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms.k f149656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f149657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f149658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c2 f149659d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(ms.k kVar, p pVar) {
        this.f149656a = kVar;
        this.f149657b = pVar;
        g gVar = new g();
        this.f149658c = gVar;
        this.f149659d = new c2(gVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(qs.j jVar, vr.e eVar) {
        m1 m1Var;
        p2 p2VarQ;
        return (!a0.a((x) v.z0(jVar.B())) || (m1Var = (m1) v.z0(ur.d.f200051a.b(eVar).o().getParameters())) == null || (p2VarQ = m1Var.q()) == null || p2VarQ == p2.OUT_VARIANCE) ? false : true;
    }

    private final List<d2> c(qs.j jVar, a aVar, x1 x1Var) {
        boolean z15 = jVar.o() || (jVar.B().isEmpty() && !x1Var.getParameters().isEmpty());
        List<m1> parameters = x1Var.getParameters();
        if (z15) {
            return d(jVar, parameters, x1Var, aVar);
        }
        if (parameters.size() != jVar.B().size()) {
            List<m1> list = parameters;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new f2(l.d(ut.k.f201320v0, ((m1) it.next()).getName().e())));
            }
            return v.f1(arrayList);
        }
        Iterable<IndexedValue> iterableN1 = v.n1(jVar.B());
        ArrayList arrayList2 = new ArrayList(v.y(iterableN1, 10));
        for (IndexedValue indexedValue : iterableN1) {
            int index = indexedValue.getIndex();
            x xVar = (x) indexedValue.b();
            parameters.size();
            arrayList2.add(q(xVar, b.b(k2.COMMON, false, false, null, 7, null), parameters.get(index)));
        }
        return v.f1(arrayList2);
    }

    private final List<d2> d(qs.j jVar, List<? extends m1> list, x1 x1Var, a aVar) {
        qs.j jVar2;
        x1 x1Var2;
        a aVar2;
        d2 d2VarA;
        List<? extends m1> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (m1 m1Var : list2) {
            if (xt.d.q(m1Var, null, aVar.c())) {
                d2VarA = l2.t(m1Var, aVar);
                jVar2 = jVar;
                x1Var2 = x1Var;
                aVar2 = aVar;
            } else {
                jVar2 = jVar;
                x1Var2 = x1Var;
                aVar2 = aVar;
                d2VarA = this.f149658c.a(m1Var, aVar2.j(jVar2.o()), this.f149659d, new z0(this.f149656a.e(), new d(this, m1Var, aVar2, x1Var2, jVar2)));
            }
            arrayList.add(d2VarA);
            aVar = aVar2;
            x1Var = x1Var2;
            jVar = jVar2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 e(e eVar, m1 m1Var, a aVar, x1 x1Var, qs.j jVar) {
        c2 c2Var = eVar.f149659d;
        vr.h hVarC = x1Var.c();
        return c2Var.e(m1Var, aVar.k(hVarC != null ? hVarC.t() : null).j(jVar.o()));
    }

    private final e1 f(qs.j jVar, a aVar, e1 e1Var) {
        qs.j jVar2;
        t1 t1VarB;
        if (e1Var == null || (t1VarB = e1Var.S0()) == null) {
            jVar2 = jVar;
            t1VarB = u1.b(new ms.g(this.f149656a, jVar2, false, 4, null));
        } else {
            jVar2 = jVar;
        }
        t1 t1Var = t1VarB;
        x1 x1VarG = g(jVar2, aVar);
        if (x1VarG == null) {
            return null;
        }
        boolean zJ = j(aVar);
        return (t.c(e1Var != null ? e1Var.T0() : null, x1VarG) && !jVar2.o() && zJ) ? e1Var.X0(true) : w0.k(t1Var, x1VarG, c(jVar2, aVar, x1VarG), zJ, null, 16, null);
    }

    private final x1 g(qs.j jVar, a aVar) {
        x1 x1VarO;
        qs.i iVarD = jVar.d();
        if (iVarD == null) {
            return h(jVar);
        }
        if (!(iVarD instanceof qs.g)) {
            if (iVarD instanceof y) {
                m1 m1VarA = this.f149657b.a((y) iVarD);
                if (m1VarA != null) {
                    return m1VarA.o();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + iVarD);
        }
        qs.g gVar = (qs.g) iVarD;
        zs.c cVarG = gVar.g();
        if (cVarG != null) {
            vr.e eVarK = k(jVar, aVar, cVarG);
            if (eVarK == null) {
                eVarK = this.f149656a.a().n().a(gVar);
            }
            return (eVarK == null || (x1VarO = eVarK.o()) == null) ? h(jVar) : x1VarO;
        }
        throw new AssertionError("Class type should have a FQ name: " + iVarD);
    }

    private final x1 h(qs.j jVar) {
        return this.f149656a.a().b().f().r().d(zs.b.f236634d.c(new zs.c(jVar.L())), v.e(0)).o();
    }

    private final boolean i(p2 p2Var, m1 m1Var) {
        return (m1Var.q() == p2.INVARIANT || p2Var == m1Var.q()) ? false : true;
    }

    private final boolean j(a aVar) {
        return (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == k2.SUPERTYPE) ? false : true;
    }

    private final vr.e k(qs.j jVar, a aVar, zs.c cVar) {
        if (aVar.h() && t.c(cVar, f.f149660a)) {
            return this.f149656a.a().p().d();
        }
        ur.d dVar = ur.d.f200051a;
        vr.e eVarF = ur.d.f(dVar, cVar, this.f149656a.d().i(), null, 4, null);
        if (eVarF == null) {
            return null;
        }
        return (dVar.d(eVarF) && (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.b() == k2.SUPERTYPE || b(jVar, eVarF))) ? dVar.b(eVarF) : eVarF;
    }

    public static /* synthetic */ t0 m(e eVar, qs.f fVar, a aVar, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return eVar.l(fVar, aVar, z15);
    }

    private final t0 n(qs.j jVar, a aVar) {
        e1 e1VarF;
        boolean z15 = (aVar.h() || aVar.b() == k2.SUPERTYPE) ? false : true;
        boolean zO = jVar.o();
        if (!zO && !z15) {
            e1 e1VarF2 = f(jVar, aVar, null);
            return e1VarF2 != null ? e1VarF2 : o(jVar);
        }
        e1 e1VarF3 = f(jVar, aVar.l(c.FLEXIBLE_LOWER_BOUND), null);
        if (e1VarF3 != null && (e1VarF = f(jVar, aVar.l(c.FLEXIBLE_UPPER_BOUND), e1VarF3)) != null) {
            return zO ? new k(e1VarF3, e1VarF) : w0.e(e1VarF3, e1VarF);
        }
        return o(jVar);
    }

    private static final ut.i o(qs.j jVar) {
        return l.d(ut.k.f201296f, jVar.I());
    }

    private final d2 q(x xVar, a aVar, m1 m1Var) {
        if (!(xVar instanceof c0)) {
            return new f2(p2.INVARIANT, p(xVar, aVar));
        }
        c0 c0Var = (c0) xVar;
        x xVarY = c0Var.y();
        p2 p2Var = c0Var.P() ? p2.OUT_VARIANCE : p2.IN_VARIANCE;
        if (xVarY == null || i(p2Var, m1Var)) {
            return l2.t(m1Var, aVar);
        }
        wr.c cVarA = v0.a(this.f149656a, c0Var);
        t0 t0VarP = p(xVarY, b.b(k2.COMMON, false, false, null, 7, null));
        if (cVarA != null) {
            t0VarP = xt.d.C(t0VarP, wr.h.f214542p0.a(v.K0(t0VarP.getAnnotations(), cVarA)));
        }
        return xt.d.k(t0VarP, p2Var, m1Var);
    }

    public final t0 l(qs.f fVar, a aVar, boolean z15) {
        x xVarM = fVar.m();
        qs.v vVar = xVarM instanceof qs.v ? (qs.v) xVarM : null;
        m type = vVar != null ? vVar.getType() : null;
        ms.g gVar = new ms.g(this.f149656a, fVar, true);
        if (type != null) {
            e1 e1VarP = this.f149656a.d().i().P(type);
            e1 e1Var = (e1) xt.d.C(e1VarP, new o(e1VarP.getAnnotations(), gVar));
            return aVar.h() ? e1Var : w0.e(e1Var, e1Var.X0(true));
        }
        t0 t0VarP = p(xVarM, b.b(k2.COMMON, aVar.h(), false, null, 6, null));
        if (aVar.h()) {
            return this.f149656a.d().i().n(z15 ? p2.OUT_VARIANCE : p2.INVARIANT, t0VarP, gVar);
        }
        return w0.e(this.f149656a.d().i().n(p2.INVARIANT, t0VarP, gVar), this.f149656a.d().i().n(p2.OUT_VARIANCE, t0VarP, gVar).X0(true));
    }

    public final t0 p(x xVar, a aVar) {
        t0 t0VarP;
        if (xVar instanceof qs.v) {
            m type = ((qs.v) xVar).getType();
            return type != null ? this.f149656a.d().i().S(type) : this.f149656a.d().i().a0();
        }
        if (xVar instanceof qs.j) {
            return n((qs.j) xVar, aVar);
        }
        if (xVar instanceof qs.f) {
            return m(this, (qs.f) xVar, aVar, false, 4, null);
        }
        if (xVar instanceof c0) {
            x xVarY = ((c0) xVar).y();
            return (xVarY == null || (t0VarP = p(xVarY, aVar)) == null) ? this.f149656a.d().i().z() : t0VarP;
        }
        if (xVar == null) {
            return this.f149656a.d().i().z();
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
