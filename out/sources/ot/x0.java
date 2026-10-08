package ot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import st.d2;
import st.e1;
import st.f2;
import st.i1;
import st.j1;
import st.l1;
import st.p2;
import st.s1;
import st.t1;
import st.x1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f149871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f149872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f149873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f149874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final er.l<Integer, vr.h> f149875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final er.l<Integer, vr.h> f149876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, m1> f149877g;

    public x0(p pVar, x0 x0Var, List<us.t> list, String str, String str2) {
        Map<Integer, m1> linkedHashMap;
        this.f149871a = pVar;
        this.f149872b = x0Var;
        this.f149873c = str;
        this.f149874d = str2;
        this.f149875e = pVar.h().a(new s0(this));
        this.f149876f = pVar.h().a(new t0(this));
        if (list.isEmpty()) {
            linkedHashMap = pq.v0.i();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i15 = 0;
            for (us.t tVar : list) {
                linkedHashMap.put(Integer.valueOf(tVar.R()), new qt.r0(this.f149871a, tVar, i15));
                i15++;
            }
        }
        this.f149877g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(us.r rVar) {
        return rVar.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.h f(x0 x0Var, int i15) {
        return x0Var.g(i15);
    }

    private final vr.h g(int i15) {
        zs.b bVarA = m0.a(this.f149871a.g(), i15);
        return bVarA.i() ? this.f149871a.c().b(bVarA) : vr.y.c(this.f149871a.c().q(), bVarA);
    }

    private final e1 h(int i15) {
        if (m0.a(this.f149871a.g(), i15).i()) {
            return this.f149871a.c().o().a();
        }
        return null;
    }

    private final vr.h i(int i15) {
        zs.b bVarA = m0.a(this.f149871a.g(), i15);
        if (bVarA.i()) {
            return null;
        }
        return vr.y.f(this.f149871a.c().q(), bVarA);
    }

    private final e1 j(st.t0 t0Var, st.t0 t0Var2) {
        sr.j jVarN = xt.d.n(t0Var);
        wr.h annotations = t0Var.getAnnotations();
        st.t0 t0VarK = sr.i.k(t0Var);
        List<st.t0> listE = sr.i.e(t0Var);
        List listG0 = pq.v.g0(sr.i.m(t0Var), 1);
        ArrayList arrayList = new ArrayList(pq.v.y(listG0, 10));
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(((d2) it.next()).getType());
        }
        return sr.i.b(jVarN, annotations, t0VarK, listE, arrayList, null, t0Var2, true).X0(t0Var.U0());
    }

    private final e1 k(t1 t1Var, x1 x1Var, List<? extends d2> list, boolean z15) {
        List<? extends d2> list2;
        e1 e1VarL;
        int size;
        int size2 = x1Var.getParameters().size() - list.size();
        if (size2 != 0) {
            e1VarL = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                list2 = list;
                e1VarL = st.w0.k(t1Var, x1Var.i().Y(size).o(), list2, z15, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            e1VarL = l(t1Var, x1Var, list2, z15);
        }
        return e1VarL == null ? ut.l.f201331a.f(ut.k.Z, list2, x1Var, new String[0]) : e1VarL;
    }

    private final e1 l(t1 t1Var, x1 x1Var, List<? extends d2> list, boolean z15) {
        e1 e1VarK = st.w0.k(t1Var, x1Var, list, z15, null, 16, null);
        if (sr.i.q(e1VarK)) {
            return t(e1VarK);
        }
        return null;
    }

    private final m1 n(int i15) {
        m1 m1Var = this.f149877g.get(Integer.valueOf(i15));
        if (m1Var != null) {
            return m1Var;
        }
        x0 x0Var = this.f149872b;
        if (x0Var != null) {
            return x0Var.n(i15);
        }
        return null;
    }

    private static final List<us.r.b> p(us.r rVar, x0 x0Var) {
        List<us.r.b> listC0 = rVar.c0();
        us.r rVarK = ws.g.k(rVar, x0Var.f149871a.j());
        List<us.r.b> listP = rVarK != null ? p(rVarK, x0Var) : null;
        if (listP == null) {
            listP = pq.v.n();
        }
        return pq.v.L0(listC0, listP);
    }

    public static /* synthetic */ e1 q(x0 x0Var, us.r rVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return x0Var.o(rVar, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(x0 x0Var, us.r rVar) {
        return x0Var.f149871a.c().d().c(rVar, x0Var.f149871a.g());
    }

    private final t1 s(List<? extends s1> list, wr.h hVar, x1 x1Var, vr.m mVar) {
        List<? extends s1> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((s1) it.next()).a(hVar, x1Var, mVar));
        }
        return t1.f184126b.j(pq.v.A(arrayList));
    }

    private final e1 t(st.t0 t0Var) {
        st.t0 type;
        d2 d2Var = (d2) pq.v.z0(sr.i.m(t0Var));
        if (d2Var == null || (type = d2Var.getType()) == null) {
            return null;
        }
        vr.h hVarC = type.T0().c();
        zs.c cVarO = hVarC != null ? ht.e.o(hVarC) : null;
        if (type.R0().size() != 1 || (!fr.t.c(cVarO, sr.p.f183625w) && !fr.t.c(cVarO, y0.f149884a))) {
            return (e1) t0Var;
        }
        st.t0 type2 = ((d2) pq.v.P0(type.R0())).getType();
        vr.m mVarE = this.f149871a.e();
        vr.a aVar = mVarE instanceof vr.a ? (vr.a) mVarE : null;
        return fr.t.c(aVar != null ? ht.e.k(aVar) : null, r0.f149852a) ? j(t0Var, type2) : j(t0Var, type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.h v(x0 x0Var, int i15) {
        return x0Var.i(i15);
    }

    private final d2 w(m1 m1Var, us.r.b bVar) {
        if (bVar.B() == us.r.b.c.STAR) {
            return m1Var == null ? new j1(this.f149871a.c().q().i()) : new l1(m1Var);
        }
        p2 p2VarC = p0.f149838a.c(bVar.B());
        us.r rVarQ = ws.g.q(bVar, this.f149871a.j());
        return rVarQ == null ? new f2(ut.l.d(ut.k.Y0, bVar.toString())) : new f2(p2VarC, u(rVarQ));
    }

    private final x1 x(us.r rVar) {
        vr.h hVarB;
        Object next;
        if (rVar.s0()) {
            hVarB = this.f149875e.b(Integer.valueOf(rVar.d0()));
            if (hVarB == null) {
                hVarB = y(this, rVar, rVar.d0());
            }
        } else if (rVar.B0()) {
            hVarB = n(rVar.o0());
            if (hVarB == null) {
                return ut.l.f201331a.e(ut.k.X, String.valueOf(rVar.o0()), this.f149874d);
            }
        } else if (rVar.C0()) {
            String string = this.f149871a.g().getString(rVar.p0());
            Iterator<T> it = m().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((m1) next).getName().e(), string));
            hVarB = (m1) next;
            if (hVarB == null) {
                return ut.l.f201331a.e(ut.k.Y, string, this.f149871a.e().toString());
            }
        } else {
            if (!rVar.A0()) {
                return ut.l.f201331a.e(ut.k.f201311q0, new String[0]);
            }
            hVarB = this.f149876f.b(Integer.valueOf(rVar.n0()));
            if (hVarB == null) {
                hVarB = y(this, rVar, rVar.n0());
            }
        }
        return hVarB.o();
    }

    private static final vr.e y(x0 x0Var, us.r rVar, int i15) {
        zs.b bVarA = m0.a(x0Var.f149871a.g(), i15);
        List<Integer> listQ = eu.k.Q(eu.k.H(eu.k.o(rVar, new v0(x0Var)), w0.f149869a));
        int iV = eu.k.v(eu.k.o(bVarA, new fr.h0() { // from class: ot.x0.a
            @Override // fr.h0, mr.n
            public Object get(Object obj) {
                return ((zs.b) obj).e();
            }
        }));
        while (listQ.size() < iV) {
            listQ.add(0);
        }
        return x0Var.f149871a.c().r().d(bVarA, listQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final us.r z(x0 x0Var, us.r rVar) {
        return ws.g.k(rVar, x0Var.f149871a.j());
    }

    public final List<m1> m() {
        return pq.v.f1(this.f149877g.values());
    }

    public final e1 o(us.r rVar, boolean z15) {
        e1 e1VarC;
        e1 e1VarJ;
        e1 e1VarH = rVar.s0() ? h(rVar.d0()) : rVar.A0() ? h(rVar.n0()) : null;
        if (e1VarH != null) {
            return e1VarH;
        }
        x1 x1VarX = x(rVar);
        if (ut.l.m(x1VarX.c())) {
            return ut.l.f201331a.c(ut.k.T0, x1VarX, x1VarX.toString());
        }
        qt.a aVar = new qt.a(this.f149871a.h(), new u0(this, rVar));
        t1 t1VarS = s(this.f149871a.c().v(), aVar, x1VarX, this.f149871a.e());
        List<us.r.b> listP = p(rVar, this);
        ArrayList arrayList = new ArrayList(pq.v.y(listP, 10));
        int i15 = 0;
        for (Object obj : listP) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            arrayList.add(w((m1) pq.v.o0(x1VarX.getParameters(), i15), (us.r.b) obj));
            i15 = i16;
        }
        List<? extends d2> listF1 = pq.v.f1(arrayList);
        vr.h hVarC = x1VarX.c();
        if (z15 && (hVarC instanceof vr.l1)) {
            e1 e1VarC2 = st.w0.c((vr.l1) hVarC, listF1);
            e1VarC = e1VarC2.X0(st.x0.b(e1VarC2) || rVar.k0()).Z0(s(this.f149871a.c().v(), wr.h.f214542p0.a(pq.v.J0(aVar, e1VarC2.getAnnotations())), x1VarX, this.f149871a.e()));
        } else if (ws.b.f214719a.d(rVar.g0()).booleanValue()) {
            e1VarC = k(t1VarS, x1VarX, listF1, rVar.k0());
        } else {
            e1 e1VarK = st.w0.k(t1VarS, x1VarX, listF1, rVar.k0(), null, 16, null);
            if (ws.b.f214720b.d(rVar.g0()).booleanValue()) {
                e1VarC = st.z.a.c(st.z.f184174d, e1VarK, true, false, 4, null);
                if (e1VarC == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + e1VarK + '\'').toString());
                }
            } else {
                e1VarC = e1VarK;
            }
        }
        us.r rVarA = ws.g.a(rVar, this.f149871a.j());
        return (rVarA == null || (e1VarJ = i1.j(e1VarC, o(rVarA, false))) == null) ? e1VarC : e1VarJ;
    }

    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f149873c);
        if (this.f149872b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f149872b.f149873c;
        }
        sb5.append(str);
        return sb5.toString();
    }

    public final st.t0 u(us.r rVar) {
        if (!rVar.u0()) {
            return o(rVar, true);
        }
        return this.f149871a.c().m().a(rVar, this.f149871a.g().getString(rVar.h0()), q(this, rVar, false, 2, null), q(this, ws.g.f(rVar, this.f149871a.j()), false, 2, null));
    }
}
