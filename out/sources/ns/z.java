package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pq.e1;
import rs.m1;
import st.k2;
import st.l2;
import vr.c1;
import vr.g1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends t0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vr.e f138179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final qs.g f138180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f138181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final rt.i<List<vr.d>> f138182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final rt.i<Set<zs.f>> f138183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final rt.i<Set<zs.f>> f138184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rt.i<Map<zs.f, qs.n>> f138185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final rt.h<zs.f, vr.e> f138186u;

    static final /* synthetic */ class a extends fr.q implements er.l<zs.f, Collection<? extends g1>> {
        a(Object obj) {
            super(1, obj, z.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Collection<g1> b(zs.f fVar) {
            return ((z) this.f66391b).q1(fVar);
        }
    }

    static final /* synthetic */ class b extends fr.q implements er.l<zs.f, Collection<? extends g1>> {
        b(Object obj) {
            super(1, obj, z.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Collection<g1> b(zs.f fVar) {
            return ((z) this.f66391b).r1(fVar);
        }
    }

    public z(ms.k kVar, vr.e eVar, qs.g gVar, boolean z15, z zVar) {
        super(kVar, zVar);
        this.f138179n = eVar;
        this.f138180o = gVar;
        this.f138181p = z15;
        this.f138182q = kVar.e().d(new p(this, kVar));
        this.f138183r = kVar.e().d(new q(this));
        this.f138184s = kVar.e().d(new r(kVar, this));
        this.f138185t = kVar.e().d(new s(this));
        this.f138186u = kVar.e().a(new t(this, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A0(z zVar, zs.f fVar) {
        return zVar.q1(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection B0(z zVar, zs.f fVar) {
        return zVar.r1(fVar);
    }

    private final Collection<st.t0> C0() {
        return this.f138181p ? R().o().q() : L().a().k().d().g(R());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(z zVar, ms.k kVar) {
        Collection<qs.k> collectionP = zVar.f138180o.p();
        ArrayList arrayList = new ArrayList(collectionP.size());
        Iterator<qs.k> it = collectionP.iterator();
        while (it.hasNext()) {
            arrayList.add(zVar.o1(it.next()));
        }
        if (zVar.f138180o.u()) {
            vr.d dVarG0 = zVar.G0();
            String strC = ss.c0.c(dVarG0, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        arrayList.add(dVarG0);
                        kVar.a().h().c(zVar.f138180o, dVarG0);
                        break;
                    }
                } while (!fr.t.c(ss.c0.c((vr.d) it4.next(), false, false, 2, null), strC));
            } else {
                arrayList.add(dVarG0);
                kVar.a().h().c(zVar.f138180o, dVarG0);
                break;
            }
        }
        kVar.a().w().a(zVar.R(), arrayList, kVar);
        m1 m1VarR = kVar.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listR = arrayList;
        if (zIsEmpty) {
            listR = pq.v.r(zVar.F0());
        }
        return pq.v.f1(m1VarR.p(kVar, listR));
    }

    private final List<t1> E0(yr.i iVar) {
        yr.i iVar2;
        oq.r rVar;
        Collection<qs.r> collectionE = this.f138180o.E();
        ArrayList arrayList = new ArrayList(collectionE.size());
        os.a aVarB = os.b.b(k2.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionE) {
            if (fr.t.c(((qs.r) obj).getName(), js.j0.f104662c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        oq.r rVar2 = new oq.r(arrayList2, arrayList3);
        List list = (List) rVar2.a();
        List<qs.r> list2 = (List) rVar2.b();
        list.size();
        qs.r rVar3 = (qs.r) pq.v.n0(list);
        if (rVar3 != null) {
            qs.x xVarF = rVar3.f();
            if (xVarF instanceof qs.f) {
                qs.f fVar = (qs.f) xVarF;
                rVar = new oq.r(L().g().l(fVar, aVarB, true), L().g().p(fVar.m(), aVarB));
            } else {
                rVar = new oq.r(L().g().p(xVarF, aVarB), null);
            }
            st.t0 t0Var = (st.t0) rVar.a();
            st.t0 t0Var2 = (st.t0) rVar.b();
            iVar2 = iVar;
            s0(arrayList, iVar2, 0, rVar3, t0Var, t0Var2);
        } else {
            iVar2 = iVar;
        }
        int i15 = 0;
        int i16 = rVar3 == null ? 0 : 1;
        for (qs.r rVar4 : list2) {
            s0(arrayList, iVar2, i15 + i16, rVar4, L().g().p(rVar4.f(), aVarB), null);
            i15++;
        }
        return arrayList;
    }

    private final vr.d F0() {
        boolean zT = this.f138180o.t();
        if ((this.f138180o.N() || !this.f138180o.v()) && !zT) {
            return null;
        }
        vr.e eVarR = R();
        ls.b bVarZ1 = ls.b.z1(eVarR, wr.h.f214542p0.b(), true, L().a().t().a(this.f138180o));
        List<t1> listE0 = zT ? E0(bVarZ1) : Collections.EMPTY_LIST;
        bVarZ1.f1(false);
        bVarZ1.w1(listE0, Z0(eVarR));
        bVarZ1.e1(true);
        bVarZ1.m1(eVarR.t());
        L().a().h().c(this.f138180o, bVarZ1);
        return bVarZ1;
    }

    private final vr.d G0() {
        vr.e eVarR = R();
        ls.b bVarZ1 = ls.b.z1(eVarR, wr.h.f214542p0.b(), true, L().a().t().a(this.f138180o));
        List<t1> listM0 = M0(bVarZ1);
        bVarZ1.f1(false);
        bVarZ1.w1(listM0, Z0(eVarR));
        bVarZ1.e1(false);
        bVarZ1.m1(eVarR.t());
        return bVarZ1;
    }

    private final g1 H0(g1 g1Var, vr.a aVar, Collection<? extends g1> collection) {
        Collection<? extends g1> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return g1Var;
        }
        for (g1 g1Var2 : collection2) {
            if (!fr.t.c(g1Var, g1Var2) && g1Var2.w0() == null && Q0(g1Var2, aVar)) {
                return (g1) g1Var.z().g().build();
            }
        }
        return g1Var;
    }

    private final g1 I0(vr.z zVar, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        Object next;
        Iterator<T> it = lVar.b(zVar.getName()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!e1((g1) next, zVar));
        g1 g1Var = (g1) next;
        if (g1Var == null) {
            return null;
        }
        vr.z.a<? extends g1> aVarZ = g1Var.z();
        List<t1> listL = zVar.l();
        ArrayList arrayList = new ArrayList(pq.v.y(listL, 10));
        Iterator<T> it4 = listL.iterator();
        while (it4.hasNext()) {
            arrayList.add(((t1) it4.next()).getType());
        }
        aVarZ.c(ls.h.a(arrayList, g1Var.l(), zVar));
        aVarZ.t();
        aVarZ.i();
        aVarZ.q(ls.e.L, Boolean.TRUE);
        return (g1) aVarZ.build();
    }

    private final ls.f J0(vr.z0 z0Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        yr.m0 m0VarM = null;
        if (!P0(z0Var, lVar)) {
            return null;
        }
        g1 g1VarW0 = W0(z0Var, lVar);
        g1 g1VarX0 = z0Var.Q() ? X0(z0Var, lVar) : null;
        if (g1VarX0 != null) {
            g1VarX0.w();
            g1VarW0.w();
        }
        ls.d dVar = new ls.d(R(), g1VarW0, g1VarX0, z0Var);
        dVar.h1(g1VarW0.f(), pq.v.n(), O(), null, pq.v.n());
        yr.l0 l0VarK = dt.h.k(dVar, g1VarW0.getAnnotations(), false, false, false, g1VarW0.m());
        l0VarK.T0(g1VarW0);
        l0VarK.W0(dVar.getType());
        if (g1VarX0 != null) {
            t1 t1Var = (t1) pq.v.n0(g1VarX0.l());
            if (t1Var == null) {
                throw new AssertionError("No parameter found for " + g1VarX0);
            }
            m0VarM = dt.h.m(dVar, g1VarX0.getAnnotations(), t1Var.getAnnotations(), false, false, false, g1VarX0.h(), g1VarX0.m());
            m0VarM.T0(g1VarX0);
        }
        dVar.a1(l0VarK, m0VarM);
        return dVar;
    }

    private final ls.f K0(qs.r rVar, st.t0 t0Var, vr.f0 f0Var) {
        z zVar;
        st.t0 t0VarA;
        ls.f fVarL1 = ls.f.l1(R(), ms.h.a(L(), rVar), f0Var, js.v0.d(rVar.h()), false, rVar.getName(), L().a().t().a(rVar), false);
        yr.l0 l0VarD = dt.h.d(fVarL1, wr.h.f214542p0.b());
        fVarL1.a1(l0VarD, null);
        if (t0Var == null) {
            ms.k kVarI = ms.c.i(L(), fVarL1, rVar, 0, 4, null);
            zVar = this;
            t0VarA = zVar.A(rVar, kVarI);
        } else {
            zVar = this;
            t0VarA = t0Var;
        }
        fVarL1.h1(t0VarA, pq.v.n(), zVar.O(), null, pq.v.n());
        l0VarD.W0(t0VarA);
        return fVarL1;
    }

    static /* synthetic */ ls.f L0(z zVar, qs.r rVar, st.t0 t0Var, vr.f0 f0Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            t0Var = null;
        }
        return zVar.K0(rVar, t0Var, f0Var);
    }

    private final List<t1> M0(yr.i iVar) {
        Collection<qs.w> collectionS = this.f138180o.s();
        ArrayList arrayList = new ArrayList(collectionS.size());
        os.a aVarB = os.b.b(k2.COMMON, false, false, null, 6, null);
        Iterator<T> it = collectionS.iterator();
        int i15 = 0;
        while (true) {
            int i16 = i15;
            if (!it.hasNext()) {
                return arrayList;
            }
            i15 = i16 + 1;
            qs.w wVar = (qs.w) it.next();
            st.t0 t0VarP = L().g().p(wVar.getType(), aVarB);
            arrayList.add(new yr.u0(iVar, null, i16, wr.h.f214542p0.b(), wVar.getName(), t0VarP, false, false, false, wVar.a() ? L().a().m().i().k(t0VarP) : null, L().a().t().a(wVar)));
        }
    }

    private final g1 N0(g1 g1Var, zs.f fVar) {
        vr.z.a<? extends g1> aVarZ = g1Var.z();
        aVarZ.s(fVar);
        aVarZ.t();
        aVarZ.i();
        return (g1) aVarZ.build();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    private final g1 O0(g1 g1Var) {
        zs.c cVarM;
        zs.d dVarP;
        t1 t1Var = (t1) pq.v.z0(g1Var.l());
        if (t1Var != null) {
            vr.h hVarC = t1Var.getType().T0().c();
            if (hVarC == null || (dVarP = ht.e.p(hVarC)) == null) {
                cVarM = null;
            } else {
                if (!dVarP.f()) {
                    dVarP = null;
                }
                if (dVarP != null) {
                    cVarM = dVarP.m();
                } else {
                    cVarM = null;
                }
            }
            if (!fr.t.c(cVarM, sr.p.f183625w)) {
                t1Var = null;
            }
            if (t1Var != null) {
                g1 g1Var2 = (g1) g1Var.z().c(pq.v.g0(g1Var.l(), 1)).b(t1Var.getType().R0().get(0).getType()).build();
                yr.o0 o0Var = (yr.o0) g1Var2;
                if (o0Var != null) {
                    o0Var.n1(true);
                }
                return g1Var2;
            }
        }
        return null;
    }

    private final boolean P0(vr.z0 z0Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        if (d.a(z0Var)) {
            return false;
        }
        g1 g1VarW0 = W0(z0Var, lVar);
        g1 g1VarX0 = X0(z0Var, lVar);
        if (g1VarW0 == null) {
            return false;
        }
        if (z0Var.Q()) {
            return g1VarX0 != null && g1VarX0.w() == g1VarW0.w();
        }
        return true;
    }

    private final boolean Q0(vr.a aVar, vr.a aVar2) {
        return dt.o.f44494f.F(aVar2, aVar, true).c() == dt.o.i.a.OVERRIDABLE && !js.z.f104783a.a(aVar2, aVar);
    }

    private final boolean R0(g1 g1Var) {
        zs.f fVarB = js.u0.f104736a.b(g1Var.getName());
        if (fVarB == null) {
            return false;
        }
        Set<g1> setB1 = b1(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (js.t0.d((g1) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        g1 g1VarN0 = N0(g1Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((g1) it.next(), g1VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(g1 g1Var, vr.z zVar) {
        if (js.f.f104638o.m(g1Var)) {
            zVar = zVar.Q0();
        }
        return Q0(zVar, g1Var);
    }

    private final boolean T0(g1 g1Var) {
        g1 g1VarO0 = O0(g1Var);
        if (g1VarO0 == null) {
            return false;
        }
        Set<g1> setB1 = b1(g1Var.getName());
        if ((setB1 instanceof Collection) && setB1.isEmpty()) {
            return false;
        }
        for (g1 g1Var2 : setB1) {
            if (g1Var2.u() && Q0(g1VarO0, g1Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U0(z zVar) {
        Collection<qs.n> collectionZ = zVar.f138180o.z();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionZ) {
            if (((qs.n) obj).M()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((qs.n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final g1 V0(vr.z0 z0Var, String str, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        g1 g1Var;
        Iterator<T> it = lVar.b(zs.f.l(str)).iterator();
        do {
            g1Var = null;
            if (!it.hasNext()) {
                break;
            }
            g1 g1Var2 = (g1) it.next();
            if (g1Var2.l().size() == 0) {
                tt.e eVar = tt.e.f192117a;
                st.t0 t0VarF = g1Var2.f();
                if (t0VarF == null ? false : eVar.b(t0VarF, z0Var.getType())) {
                    g1Var = g1Var2;
                }
            }
        } while (g1Var == null);
        return g1Var;
    }

    private final g1 W0(vr.z0 z0Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        vr.a1 a1VarD = z0Var.d();
        vr.a1 a1Var = a1VarD != null ? (vr.a1) js.t0.g(a1VarD) : null;
        String strB = a1Var != null ? js.m.f104712a.b(a1Var) : null;
        return (strB == null || js.t0.l(R(), a1Var)) ? V0(z0Var, js.i0.b(z0Var.getName().e()), lVar) : V0(z0Var, strB, lVar);
    }

    private final g1 X0(vr.z0 z0Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        g1 g1Var;
        st.t0 t0VarF;
        Iterator<T> it = lVar.b(zs.f.l(js.i0.e(z0Var.getName().e()))).iterator();
        do {
            g1Var = null;
            if (!it.hasNext()) {
                break;
            }
            g1 g1Var2 = (g1) it.next();
            if (g1Var2.l().size() == 1 && (t0VarF = g1Var2.f()) != null && sr.j.D0(t0VarF) && tt.e.f192117a.c(((t1) pq.v.P0(g1Var2.l())).getType(), z0Var.getType())) {
                g1Var = g1Var2;
            }
        } while (g1Var == null);
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Y0(ms.k kVar, z zVar) {
        return pq.v.k1(kVar.a().w().g(zVar.R(), kVar));
    }

    private final vr.u Z0(vr.e eVar) {
        vr.u uVarH = eVar.h();
        return fr.t.c(uVarH, js.y.f104780b) ? js.y.f104781c : uVarH;
    }

    private final Set<g1> b1(zs.f fVar) {
        Collection<st.t0> collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionC0.iterator();
        while (it.hasNext()) {
            pq.v.D(linkedHashSet, ((st.t0) it.next()).r().a(fVar, ds.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<vr.z0> d1(zs.f fVar) {
        Collection<st.t0> collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection<? extends vr.z0> collectionC = ((st.t0) it.next()).r().c(fVar, ds.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(pq.v.y(collectionC, 10));
            Iterator<T> it4 = collectionC.iterator();
            while (it4.hasNext()) {
                arrayList2.add((vr.z0) it4.next());
            }
            pq.v.D(arrayList, arrayList2);
        }
        return pq.v.k1(arrayList);
    }

    private final boolean e1(g1 g1Var, vr.z zVar) {
        return fr.t.c(ss.c0.c(g1Var, false, false, 2, null), ss.c0.c(zVar.Q0(), false, false, 2, null)) && !Q0(g1Var, zVar);
    }

    private final boolean f1(g1 g1Var) {
        List<zs.f> listA = js.o0.a(g1Var.getName());
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Set<vr.z0> setD1 = d1((zs.f) it.next());
                if (!(setD1 instanceof Collection) || !setD1.isEmpty()) {
                    for (vr.z0 z0Var : setD1) {
                        if (P0(z0Var, new v(g1Var, this)) && (z0Var.Q() || !js.i0.d(g1Var.getName().e()))) {
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(g1Var) || s1(g1Var) || T0(g1Var)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g1(g1 g1Var, z zVar, zs.f fVar) {
        return fr.t.c(g1Var.getName(), fVar) ? pq.v.e(g1Var) : pq.v.L0(zVar.q1(fVar), zVar.r1(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h1(z zVar) {
        return pq.v.k1(zVar.f138180o.D());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.e i1(z zVar, ms.k kVar, zs.f fVar) {
        if (zVar.f138183r.a().contains(fVar)) {
            qs.g gVarB = kVar.a().d().b(new js.u.a(ht.e.n(zVar.R()).d(fVar), null, zVar.f138180o, 2, null));
            if (gVarB == null) {
                return null;
            }
            n nVar = new n(kVar, zVar.R(), gVarB, null, 8, null);
            kVar.a().e().a(nVar);
            return nVar;
        }
        if (!zVar.f138184s.a().contains(fVar)) {
            qs.n nVar2 = zVar.f138185t.a().get(fVar);
            if (nVar2 == null) {
                return null;
            }
            return yr.q.R0(kVar.e(), zVar.R(), fVar, kVar.e().d(new y(zVar)), ms.h.a(kVar, nVar2), kVar.a().t().a(nVar2));
        }
        List<vr.e> listC = pq.v.c();
        kVar.a().w().h(zVar.R(), fVar, listC, kVar);
        List listA = pq.v.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (vr.e) pq.v.P0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j1(z zVar) {
        return e1.l(zVar.b(), zVar.d());
    }

    private final g1 k1(g1 g1Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar, Collection<? extends g1> collection) {
        g1 g1VarI0;
        vr.z zVarL = js.i.l(g1Var);
        if (zVarL != null && (g1VarI0 = I0(zVarL, lVar)) != null) {
            if (!f1(g1VarI0)) {
                g1VarI0 = null;
            }
            if (g1VarI0 != null) {
                return H0(g1VarI0, zVarL, collection);
            }
        }
        return null;
    }

    private final g1 l1(g1 g1Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar, zs.f fVar, Collection<? extends g1> collection) {
        g1 g1Var2 = (g1) js.t0.g(g1Var);
        if (g1Var2 == null) {
            return null;
        }
        Iterator<? extends g1> it = lVar.b(zs.f.l(js.t0.e(g1Var2))).iterator();
        while (it.hasNext()) {
            g1 g1VarN0 = N0(it.next(), fVar);
            if (S0(g1Var2, g1VarN0)) {
                return H0(g1VarN0, g1Var2, collection);
            }
        }
        return null;
    }

    private final g1 m1(g1 g1Var, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        if (!g1Var.u()) {
            return null;
        }
        Iterator<T> it = lVar.b(g1Var.getName()).iterator();
        while (it.hasNext()) {
            g1 g1VarO0 = O0((g1) it.next());
            if (g1VarO0 == null || !Q0(g1VarO0, g1Var)) {
                g1VarO0 = null;
            }
            if (g1VarO0 != null) {
                return g1VarO0;
            }
        }
        return null;
    }

    private final ls.b o1(qs.k kVar) {
        vr.e eVarR = R();
        ls.b bVarZ1 = ls.b.z1(eVarR, ms.h.a(L(), kVar), false, L().a().t().a(kVar));
        ms.k kVarH = ms.c.h(L(), bVarZ1, kVar, eVarR.v().size());
        t0.b bVarD0 = d0(kVarH, bVarZ1, kVar.l());
        List<vr.m1> listV = eVarR.v();
        List<qs.y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(pq.v.y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(kVarH.f().a((qs.y) it.next()));
        }
        bVarZ1.x1(bVarD0.a(), js.v0.d(kVar.h()), pq.v.L0(listV, arrayList));
        bVarZ1.e1(false);
        bVarZ1.f1(bVarD0.b());
        bVarZ1.m1(eVarR.t());
        kVarH.a().h().c(kVar, bVarZ1);
        return bVarZ1;
    }

    private final ls.e p1(qs.w wVar) {
        ls.e eVarV1 = ls.e.v1(R(), ms.h.a(L(), wVar), wVar.getName(), L().a().t().a(wVar), true);
        eVarV1.u1(null, O(), pq.v.n(), pq.v.n(), pq.v.n(), L().g().p(wVar.getType(), os.b.b(k2.COMMON, false, false, null, 6, null)), vr.f0.f208038a.a(false, false, true), vr.t.f208080e, null);
        eVarV1.y1(false, false);
        L().a().h().e(wVar, eVarV1);
        return eVarV1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<g1> q1(zs.f fVar) {
        Collection<qs.r> collectionD = N().a().d(fVar);
        ArrayList arrayList = new ArrayList(pq.v.y(collectionD, 10));
        Iterator<T> it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((qs.r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<g1> r1(zs.f fVar) {
        Set<g1> setB1 = b1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            g1 g1Var = (g1) obj;
            if (!js.t0.d(g1Var) && js.i.l(g1Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void s0(List<t1> list, vr.l lVar, int i15, qs.r rVar, st.t0 t0Var, st.t0 t0Var2) {
        list.add(new yr.u0(lVar, null, i15, wr.h.f214542p0.b(), rVar.getName(), l2.n(t0Var), rVar.Q(), false, false, t0Var2 != null ? l2.n(t0Var2) : null, L().a().t().a(rVar)));
    }

    private final boolean s1(g1 g1Var) {
        if (!js.i.f104648o.n(g1Var.getName())) {
            return false;
        }
        Set<g1> setB1 = b1(g1Var.getName());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setB1.iterator();
        while (it.hasNext()) {
            vr.z zVarL = js.i.l((g1) it.next());
            if (zVarL != null) {
                arrayList.add(zVarL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            if (e1(g1Var, (vr.z) it4.next())) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection<g1> collection, zs.f fVar, Collection<? extends g1> collection2, boolean z15) {
        Collection<? extends g1> collectionD = ks.a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().a());
        if (!z15) {
            collection.addAll(collectionD);
            return;
        }
        Collection<? extends g1> collection3 = collectionD;
        List listL0 = pq.v.L0(collection, collection3);
        ArrayList arrayList = new ArrayList(pq.v.y(collection3, 10));
        for (g1 g1VarH0 : collection3) {
            g1 g1Var = (g1) js.t0.j(g1VarH0);
            if (g1Var != null) {
                g1VarH0 = H0(g1VarH0, g1Var, listL0);
            }
            arrayList.add(g1VarH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(zs.f fVar, Collection<? extends g1> collection, Collection<? extends g1> collection2, Collection<g1> collection3, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        for (g1 g1Var : collection2) {
            cu.a.a(collection3, l1(g1Var, lVar, fVar, collection));
            cu.a.a(collection3, k1(g1Var, lVar, collection));
            cu.a.a(collection3, m1(g1Var, lVar));
        }
    }

    private final void v0(Set<? extends vr.z0> set, Collection<vr.z0> collection, Set<vr.z0> set2, er.l<? super zs.f, ? extends Collection<? extends g1>> lVar) {
        for (vr.z0 z0Var : set) {
            ls.f fVarJ0 = J0(z0Var, lVar);
            if (fVarJ0 != null) {
                collection.add(fVarJ0);
                if (set2 != null) {
                    set2.add(z0Var);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(zs.f fVar, Collection<vr.z0> collection) {
        qs.r rVar = (qs.r) pq.v.Q0(N().a().d(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(L0(this, rVar, null, vr.f0.FINAL, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(qs.q qVar) {
        return !qVar.k();
    }

    @Override // ns.t0
    protected void B(Collection<g1> collection, zs.f fVar) {
        Set<g1> setB1 = b1(fVar);
        if (!js.u0.f104736a.k(fVar) && !js.i.f104648o.n(fVar)) {
            Set<g1> set = setB1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((vr.z) it.next()).u()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (f1((g1) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(collection, fVar, arrayList, false);
            return;
        }
        cu.k kVarA = cu.k.f37890c.a();
        Collection<? extends g1> collectionD = ks.a.d(fVar, setB1, pq.v.n(), R(), ot.w.f149868a, L().a().k().a());
        u0(fVar, collection, collectionD, collection, new a(this));
        u0(fVar, collection, collectionD, kVarA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((g1) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(collection, fVar, pq.v.L0(arrayList2, kVarA), true);
    }

    @Override // ns.t0
    protected void C(zs.f fVar, Collection<vr.z0> collection) {
        if (this.f138180o.t()) {
            w0(fVar, collection);
        }
        Set<vr.z0> setD1 = d1(fVar);
        if (setD1.isEmpty()) {
            return;
        }
        cu.k.b bVar = cu.k.f37890c;
        cu.k kVarA = bVar.a();
        cu.k kVarA2 = bVar.a();
        v0(setD1, collection, kVarA, new w(this));
        v0(e1.j(setD1, kVarA), kVarA2, null, new x(this));
        collection.addAll(ks.a.d(fVar, e1.l(setD1, kVarA2), collection, R(), L().a().c(), L().a().k().a()));
    }

    @Override // ns.t0
    protected Set<zs.f> D(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        if (this.f138180o.t()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(N().a().c());
        Iterator<T> it = R().o().q().iterator();
        while (it.hasNext()) {
            pq.v.D(linkedHashSet, ((st.t0) it.next()).r().d());
        }
        return linkedHashSet;
    }

    @Override // ns.t0
    protected c1 O() {
        return dt.i.l(R());
    }

    @Override // ns.t0
    protected boolean V(ls.e eVar) {
        if (this.f138180o.t()) {
            return false;
        }
        return f1(eVar);
    }

    @Override // ns.t0
    protected t0.a Y(qs.r rVar, List<? extends vr.m1> list, st.t0 t0Var, List<? extends t1> list2) {
        ks.o.b bVarB = L().a().s().b(rVar, R(), t0Var, null, list2, list);
        return new t0.a(bVarB.d(), bVarB.c(), bVarB.f(), bVarB.e(), bVarB.g(), bVarB.b());
    }

    @Override // ns.t0, lt.l, lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        n1(fVar, bVar);
        return super.a(fVar, bVar);
    }

    public final rt.i<List<vr.d>> a1() {
        return this.f138182q;
    }

    @Override // ns.t0, lt.l, lt.k
    public Collection<vr.z0> c(zs.f fVar, ds.b bVar) {
        n1(fVar, bVar);
        return super.c(fVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ns.t0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public vr.e R() {
        return this.f138179n;
    }

    @Override // lt.l, lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        rt.h<zs.f, vr.e> hVar;
        vr.e eVarB;
        n1(fVar, bVar);
        z zVar = (z) Q();
        return (zVar == null || (hVar = zVar.f138186u) == null || (eVarB = hVar.b(fVar)) == null) ? this.f138186u.b(fVar) : eVarB;
    }

    public void n1(zs.f fVar, ds.b bVar) {
        cs.a.a(L().a().l(), bVar, R(), fVar);
    }

    @Override // ns.t0
    public String toString() {
        return "Lazy Java member scope for " + this.f138180o.g();
    }

    @Override // ns.t0
    protected Set<zs.f> v(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        return e1.l(this.f138183r.a(), this.f138185t.a().keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ns.t0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<zs.f> x(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        Collection<st.t0> collectionQ = R().o().q();
        LinkedHashSet<zs.f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionQ.iterator();
        while (it.hasNext()) {
            pq.v.D(linkedHashSet, ((st.t0) it.next()).r().b());
        }
        linkedHashSet.addAll(N().a().a());
        linkedHashSet.addAll(N().a().b());
        linkedHashSet.addAll(v(dVar, lVar));
        linkedHashSet.addAll(L().a().w().d(R(), L()));
        return linkedHashSet;
    }

    @Override // ns.t0
    protected void y(Collection<g1> collection, zs.f fVar) {
        if (this.f138180o.u() && N().a().e(fVar) != null) {
            Collection<g1> collection2 = collection;
            if (collection2.isEmpty()) {
                collection.add(p1(N().a().e(fVar)));
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((g1) it.next()).l().isEmpty()) {
                    }
                }
                collection.add(p1(N().a().e(fVar)));
            }
        }
        L().a().w().e(R(), fVar, collection, L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ns.t0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ns.b z() {
        return new ns.b(this.f138180o, u.f138168a);
    }

    public /* synthetic */ z(ms.k kVar, vr.e eVar, qs.g gVar, boolean z15, z zVar, int i15, fr.k kVar2) {
        this(kVar, eVar, gVar, z15, (i15 & 16) != 0 ? null : zVar);
    }
}
