package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pq.IndexedValue;
import st.k2;
import st.l2;
import vr.c1;
import vr.g1;
import vr.m1;
import vr.t1;
import vr.u1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t0 extends lt.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f138148m = {fr.q0.j(new fr.h0(t0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), fr.q0.j(new fr.h0(t0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), fr.q0.j(new fr.h0(t0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ms.k f138149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f138150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i<Collection<vr.m>> f138151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.i<c> f138152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rt.g<zs.f, Collection<g1>> f138153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rt.h<zs.f, vr.z0> f138154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rt.g<zs.f, Collection<g1>> f138155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final rt.i f138156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rt.i f138157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final rt.i f138158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final rt.g<zs.f, List<vr.z0>> f138159l;

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final st.t0 f138160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final st.t0 f138161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<t1> f138162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<m1> f138163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f138164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f138165f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(st.t0 t0Var, st.t0 t0Var2, List<? extends t1> list, List<? extends m1> list2, boolean z15, List<String> list3) {
            this.f138160a = t0Var;
            this.f138161b = t0Var2;
            this.f138162c = list;
            this.f138163d = list2;
            this.f138164e = z15;
            this.f138165f = list3;
        }

        public final List<String> a() {
            return this.f138165f;
        }

        public final boolean b() {
            return this.f138164e;
        }

        public final st.t0 c() {
            return this.f138161b;
        }

        public final st.t0 d() {
            return this.f138160a;
        }

        public final List<m1> e() {
            return this.f138163d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fr.t.c(this.f138160a, aVar.f138160a) && fr.t.c(this.f138161b, aVar.f138161b) && fr.t.c(this.f138162c, aVar.f138162c) && fr.t.c(this.f138163d, aVar.f138163d) && this.f138164e == aVar.f138164e && fr.t.c(this.f138165f, aVar.f138165f);
        }

        public final List<t1> f() {
            return this.f138162c;
        }

        public int hashCode() {
            int iHashCode = this.f138160a.hashCode() * 31;
            st.t0 t0Var = this.f138161b;
            return ((((((((iHashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31) + this.f138162c.hashCode()) * 31) + this.f138163d.hashCode()) * 31) + Boolean.hashCode(this.f138164e)) * 31) + this.f138165f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f138160a + ", receiverType=" + this.f138161b + ", valueParameters=" + this.f138162c + ", typeParameters=" + this.f138163d + ", hasStableParameterNames=" + this.f138164e + ", errors=" + this.f138165f + ')';
        }
    }

    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<t1> f138166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f138167b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends t1> list, boolean z15) {
            this.f138166a = list;
            this.f138167b = z15;
        }

        public final List<t1> a() {
            return this.f138166a;
        }

        public final boolean b() {
            return this.f138167b;
        }
    }

    public t0(ms.k kVar, t0 t0Var) {
        this.f138149b = kVar;
        this.f138150c = t0Var;
        this.f138151d = kVar.e().f(new h0(this), pq.v.n());
        this.f138152e = kVar.e().d(new k0(this));
        this.f138153f = kVar.e().i(new l0(this));
        this.f138154g = kVar.e().a(new m0(this));
        this.f138155h = kVar.e().i(new n0(this));
        this.f138156i = kVar.e().d(new o0(this));
        this.f138157j = kVar.e().d(new p0(this));
        this.f138158k = kVar.e().d(new q0(this));
        this.f138159l = kVar.e().i(new r0(this));
    }

    private final yr.k0 E(qs.n nVar) {
        return ls.f.l1(R(), ms.h.a(this.f138149b, nVar), vr.f0.FINAL, js.v0.d(nVar.h()), !nVar.G(), nVar.getName(), this.f138149b.a().t().a(nVar), U(nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.z0 F(t0 t0Var, zs.f fVar) {
        t0 t0Var2 = t0Var.f138150c;
        if (t0Var2 != null) {
            return t0Var2.f138154g.b(fVar);
        }
        qs.n nVarF = t0Var.f138152e.a().f(fVar);
        if (nVarF == null || nVarF.M()) {
            return null;
        }
        return t0Var.a0(nVarF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection G(t0 t0Var, zs.f fVar) {
        t0 t0Var2 = t0Var.f138150c;
        if (t0Var2 != null) {
            return t0Var2.f138153f.b(fVar);
        }
        ArrayList arrayList = new ArrayList();
        for (qs.r rVar : t0Var.f138152e.a().d(fVar)) {
            ls.e eVarZ = t0Var.Z(rVar);
            if (t0Var.V(eVarZ)) {
                t0Var.f138149b.a().h().e(rVar, eVarZ);
                arrayList.add(eVarZ);
            }
        }
        t0Var.y(arrayList, fVar);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c H(t0 t0Var) {
        return t0Var.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set I(t0 t0Var) {
        return t0Var.x(lt.d.f120110v, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection J(t0 t0Var, zs.f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0Var.f138153f.b(fVar));
        t0Var.e0(linkedHashSet);
        t0Var.B(linkedHashSet, fVar);
        return pq.v.f1(t0Var.f138149b.a().r().p(t0Var.f138149b, linkedHashSet));
    }

    private final Set<zs.f> M() {
        return (Set) rt.m.a(this.f138158k, this, f138148m[2]);
    }

    private final Set<zs.f> P() {
        return (Set) rt.m.a(this.f138156i, this, f138148m[0]);
    }

    private final Set<zs.f> S() {
        return (Set) rt.m.a(this.f138157j, this, f138148m[1]);
    }

    private final st.t0 T(qs.n nVar) {
        st.t0 t0VarP = this.f138149b.g().p(nVar.getType(), os.b.b(k2.COMMON, false, false, null, 7, null));
        return ((sr.j.t0(t0VarP) || sr.j.w0(t0VarP)) && U(nVar) && nVar.R()) ? l2.n(t0VarP) : t0VarP;
    }

    private final boolean U(qs.n nVar) {
        return nVar.G() && nVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(t0 t0Var, zs.f fVar) {
        ArrayList arrayList = new ArrayList();
        cu.a.a(arrayList, t0Var.f138154g.b(fVar));
        t0Var.C(fVar, arrayList);
        return dt.i.t(t0Var.R()) ? pq.v.f1(arrayList) : pq.v.f1(t0Var.f138149b.a().r().p(t0Var.f138149b, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set X(t0 t0Var) {
        return t0Var.D(lt.d.f120111w, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, yr.k0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, yr.k0] */
    private final vr.z0 a0(qs.n nVar) {
        fr.p0 p0Var = new fr.p0();
        ?? E = E(nVar);
        p0Var.f66410a = E;
        E.b1(null, null, null, null);
        ((yr.k0) p0Var.f66410a).h1(T(nVar), pq.v.n(), O(), null, pq.v.n());
        vr.m mVarR = R();
        vr.e eVar = mVarR instanceof vr.e ? (vr.e) mVarR : null;
        if (eVar != null) {
            p0Var.f66410a = this.f138149b.a().w().c(eVar, (yr.k0) p0Var.f66410a, this.f138149b);
        }
        T t15 = p0Var.f66410a;
        if (dt.i.K((u1) t15, ((yr.k0) t15).getType())) {
            ((yr.k0) p0Var.f66410a).R0(new i0(this, nVar, p0Var));
        }
        this.f138149b.a().h().b(nVar, (vr.z0) p0Var.f66410a);
        return (vr.z0) p0Var.f66410a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rt.j b0(t0 t0Var, qs.n nVar, fr.p0 p0Var) {
        return t0Var.f138149b.e().c(new j0(t0Var, nVar, p0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ft.g c0(t0 t0Var, qs.n nVar, fr.p0 p0Var) {
        return t0Var.f138149b.a().g().a(nVar, (vr.z0) p0Var.f66410a);
    }

    private final void e0(Set<g1> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = ss.c0.c((g1) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends g1> collectionB = dt.r.b(list2, s0.f138145a);
                set.removeAll(list2);
                set.addAll(collectionB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.a f0(g1 g1Var) {
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(t0 t0Var) {
        return t0Var.w(lt.d.f120103o, lt.k.f120129a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set u(t0 t0Var) {
        return t0Var.v(lt.d.f120108t, null);
    }

    protected final st.t0 A(qs.r rVar, ms.k kVar) {
        return kVar.g().p(rVar.f(), os.b.b(k2.COMMON, rVar.S().t(), false, null, 6, null));
    }

    protected abstract void B(Collection<g1> collection, zs.f fVar);

    protected abstract void C(zs.f fVar, Collection<vr.z0> collection);

    protected abstract Set<zs.f> D(lt.d dVar, er.l<? super zs.f, Boolean> lVar);

    protected final rt.i<Collection<vr.m>> K() {
        return this.f138151d;
    }

    protected final ms.k L() {
        return this.f138149b;
    }

    protected final rt.i<c> N() {
        return this.f138152e;
    }

    protected abstract c1 O();

    protected final t0 Q() {
        return this.f138150c;
    }

    protected abstract vr.m R();

    protected boolean V(ls.e eVar) {
        return true;
    }

    protected abstract a Y(qs.r rVar, List<? extends m1> list, st.t0 t0Var, List<? extends t1> list2);

    protected final ls.e Z(qs.r rVar) {
        ls.e eVarV1 = ls.e.v1(R(), ms.h.a(this.f138149b, rVar), rVar.getName(), this.f138149b.a().t().a(rVar), this.f138152e.a().e(rVar.getName()) != null && rVar.l().isEmpty());
        ms.k kVarI = ms.c.i(this.f138149b, eVarV1, rVar, 0, 4, null);
        List<qs.y> typeParameters = rVar.getTypeParameters();
        List<? extends m1> arrayList = new ArrayList<>(pq.v.y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(kVarI.f().a((qs.y) it.next()));
        }
        b bVarD0 = d0(kVarI, eVarV1, rVar.l());
        a aVarY = Y(rVar, arrayList, A(rVar, kVarI), bVarD0.a());
        st.t0 t0VarC = aVarY.c();
        eVarV1.u1(t0VarC != null ? dt.h.i(eVarV1, t0VarC, wr.h.f214542p0.b()) : null, O(), pq.v.n(), aVarY.e(), aVarY.f(), aVarY.d(), vr.f0.f208038a.a(false, rVar.C(), !rVar.G()), js.v0.d(rVar.h()), aVarY.c() != null ? pq.v0.f(oq.y.a(ls.e.K, pq.v.l0(bVarD0.a()))) : pq.v0.i());
        eVarV1.y1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            kVarI.a().s().a(eVarV1, aVarY.a());
        }
        return eVarV1;
    }

    @Override // lt.l, lt.k
    public Collection<g1> a(zs.f fVar, ds.b bVar) {
        return !b().contains(fVar) ? pq.v.n() : this.f138155h.b(fVar);
    }

    @Override // lt.l, lt.k
    public Set<zs.f> b() {
        return P();
    }

    @Override // lt.l, lt.k
    public Collection<vr.z0> c(zs.f fVar, ds.b bVar) {
        return !d().contains(fVar) ? pq.v.n() : this.f138159l.b(fVar);
    }

    @Override // lt.l, lt.k
    public Set<zs.f> d() {
        return S();
    }

    protected final b d0(ms.k kVar, vr.z zVar, List<? extends qs.b0> list) {
        oq.r rVarA;
        zs.f name;
        Iterable<IndexedValue> iterableN1 = pq.v.n1(list);
        ArrayList arrayList = new ArrayList(pq.v.y(iterableN1, 10));
        boolean z15 = false;
        for (IndexedValue indexedValue : iterableN1) {
            int index = indexedValue.getIndex();
            qs.b0 b0Var = (qs.b0) indexedValue.b();
            wr.h hVarA = ms.h.a(kVar, b0Var);
            os.a aVarB = os.b.b(k2.COMMON, false, false, null, 7, null);
            if (b0Var.a()) {
                qs.x type = b0Var.getType();
                qs.f fVar = type instanceof qs.f ? (qs.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
                st.t0 t0VarL = kVar.g().l(fVar, aVarB, true);
                rVarA = oq.y.a(t0VarL, kVar.d().i().k(t0VarL));
            } else {
                rVarA = oq.y.a(kVar.g().p(b0Var.getType(), aVarB), null);
            }
            st.t0 t0Var = (st.t0) rVarA.a();
            st.t0 t0Var2 = (st.t0) rVarA.b();
            if (fr.t.c(zVar.getName().e(), "equals") && list.size() == 1 && fr.t.c(kVar.d().i().J(), t0Var)) {
                name = zs.f.l("other");
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z15 = true;
                }
                if (name == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append('p');
                    sb5.append(index);
                    name = zs.f.l(sb5.toString());
                }
            }
            arrayList.add(new yr.u0(zVar, null, index, hVarA, name, t0Var, false, false, false, t0Var2, kVar.a().t().a(b0Var)));
        }
        return new b(pq.v.f1(arrayList), z15);
    }

    @Override // lt.l, lt.n
    public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        return this.f138151d.a();
    }

    @Override // lt.l, lt.k
    public Set<zs.f> g() {
        return M();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected abstract Set<zs.f> v(lt.d dVar, er.l<? super zs.f, Boolean> lVar);

    protected final List<vr.m> w(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        ds.d dVar2 = ds.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.a(lt.d.f120091c.c())) {
            for (zs.f fVar : v(dVar, lVar)) {
                if (lVar.b(fVar).booleanValue()) {
                    cu.a.a(linkedHashSet, e(fVar, dVar2));
                }
            }
        }
        if (dVar.a(lt.d.f120091c.d()) && !dVar.l().contains(lt.c.a.f120088a)) {
            for (zs.f fVar2 : x(dVar, lVar)) {
                if (lVar.b(fVar2).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar2));
                }
            }
        }
        if (dVar.a(lt.d.f120091c.i()) && !dVar.l().contains(lt.c.a.f120088a)) {
            for (zs.f fVar3 : D(dVar, lVar)) {
                if (lVar.b(fVar3).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, dVar2));
                }
            }
        }
        return pq.v.f1(linkedHashSet);
    }

    protected abstract Set<zs.f> x(lt.d dVar, er.l<? super zs.f, Boolean> lVar);

    protected void y(Collection<g1> collection, zs.f fVar) {
    }

    protected abstract c z();

    public /* synthetic */ t0(ms.k kVar, t0 t0Var, int i15, fr.k kVar2) {
        this(kVar, (i15 & 2) != 0 ? null : t0Var);
    }
}
