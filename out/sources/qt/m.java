package qt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ot.x0;
import pq.v0;
import st.e1;
import st.x1;
import vr.c1;
import vr.f1;
import vr.g1;
import vr.h1;
import vr.k1;
import vr.m1;
import vr.q1;
import vr.r1;
import vr.t1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends yr.a implements vr.m {
    private final rt.j<r1<e1>> A;
    private final ot.o0.a B;
    private final wr.h C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final us.c f168337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ws.a f168338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h1 f168339h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zs.b f168340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final vr.f0 f168341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final vr.u f168342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final vr.f f168343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ot.p f168344n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f168345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final lt.l f168346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f168347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f1<a> f168348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c f168349t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final vr.m f168350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final rt.j<vr.d> f168351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final rt.i<Collection<vr.d>> f168352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final rt.j<vr.e> f168353y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final rt.i<Collection<vr.e>> f168354z;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final tt.g f168355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final rt.i<Collection<vr.m>> f168356h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final rt.i<Collection<st.t0>> f168357i;

        /* JADX INFO: renamed from: qt.m$a$a, reason: collision with other inner class name */
        public static final class C4254a extends dt.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<D> f168359a;

            C4254a(List<D> list) {
                this.f168359a = list;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // dt.n
            public void a(vr.b bVar) {
                dt.o.K(bVar, null);
                this.f168359a.add((D) bVar);
            }

            @Override // dt.m
            protected void e(vr.b bVar, vr.b bVar2) {
                if (bVar2 instanceof yr.s) {
                    ((yr.s) bVar2).a1(vr.v.f208093a, bVar);
                }
            }
        }

        public a(tt.g gVar) {
            ot.p pVarJ1 = m.this.j1();
            List<us.j> listR0 = m.this.k1().R0();
            List<us.o> listY0 = m.this.k1().Y0();
            List<us.s> listG1 = m.this.k1().g1();
            List<Integer> listV0 = m.this.k1().V0();
            ws.d dVarG = m.this.j1().g();
            ArrayList arrayList = new ArrayList(pq.v.y(listV0, 10));
            Iterator<T> it = listV0.iterator();
            while (it.hasNext()) {
                arrayList.add(ot.m0.b(dVarG, ((Number) it.next()).intValue()));
            }
            super(pVarJ1, listR0, listY0, listG1, new j(arrayList));
            this.f168355g = gVar;
            this.f168356h = s().h().d(new k(this));
            this.f168357i = s().h().d(new l(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(lt.d.f120103o, lt.k.f120129a.c(), ds.d.WHEN_GET_ALL_DESCRIPTORS);
        }

        private final <D extends vr.b> void G(zs.f fVar, Collection<? extends D> collection, List<D> list) {
            s().c().n().a().v(fVar, collection, new ArrayList(list), H(), new C4254a(list));
        }

        private final m H() {
            return m.this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f168355g.g(aVar.H());
        }

        @Override // qt.w
        protected boolean A(g1 g1Var) {
            return s().c().t().b(m.this, g1Var);
        }

        public void I(zs.f fVar, ds.b bVar) {
            cs.a.a(s().c().p(), bVar, H(), fVar);
        }

        @Override // qt.w, lt.l, lt.k
        public Collection<g1> a(zs.f fVar, ds.b bVar) {
            I(fVar, bVar);
            return super.a(fVar, bVar);
        }

        @Override // qt.w, lt.l, lt.k
        public Collection<z0> c(zs.f fVar, ds.b bVar) {
            I(fVar, bVar);
            return super.c(fVar, bVar);
        }

        @Override // qt.w, lt.l, lt.n
        public vr.h e(zs.f fVar, ds.b bVar) {
            vr.e eVarI;
            I(fVar, bVar);
            c cVar = H().f168349t;
            return (cVar == null || (eVarI = cVar.i(fVar)) == null) ? super.e(fVar, bVar) : eVarI;
        }

        @Override // lt.l, lt.n
        public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
            return this.f168356h.a();
        }

        @Override // qt.w
        protected void j(Collection<vr.m> collection, er.l<? super zs.f, Boolean> lVar) {
            c cVar = H().f168349t;
            List listD = cVar != null ? cVar.d() : null;
            if (listD == null) {
                listD = pq.v.n();
            }
            collection.addAll(listD);
        }

        @Override // qt.w
        protected void n(zs.f fVar, List<g1> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<st.t0> it = this.f168357i.a().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().r().a(fVar, ds.d.FOR_ALREADY_TRACKED));
            }
            list.addAll(s().c().c().c(fVar, m.this));
            G(fVar, arrayList, list);
        }

        @Override // qt.w
        protected void o(zs.f fVar, List<z0> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<st.t0> it = this.f168357i.a().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().r().c(fVar, ds.d.FOR_ALREADY_TRACKED));
            }
            G(fVar, arrayList, list);
        }

        @Override // qt.w
        protected zs.b p(zs.f fVar) {
            return m.this.f168340j.d(fVar);
        }

        @Override // qt.w
        protected Set<zs.f> v() {
            List<st.t0> listQ = H().f168347r.q();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listQ.iterator();
            while (it.hasNext()) {
                Set<zs.f> setG = ((st.t0) it.next()).r().g();
                if (setG == null) {
                    return null;
                }
                pq.v.D(linkedHashSet, setG);
            }
            return linkedHashSet;
        }

        @Override // qt.w
        protected Set<zs.f> w() {
            List<st.t0> listQ = H().f168347r.q();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listQ.iterator();
            while (it.hasNext()) {
                pq.v.D(linkedHashSet, ((st.t0) it.next()).r().b());
            }
            linkedHashSet.addAll(s().c().c().d(m.this));
            return linkedHashSet;
        }

        @Override // qt.w
        protected Set<zs.f> x() {
            List<st.t0> listQ = H().f168347r.q();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listQ.iterator();
            while (it.hasNext()) {
                pq.v.D(linkedHashSet, ((st.t0) it.next()).r().d());
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends st.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final rt.i<List<m1>> f168360d;

        public b() {
            super(m.this.j1().h());
            this.f168360d = m.this.j1().h().d(new n(m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M(m mVar) {
            return q1.g(mVar);
        }

        @Override // st.w, st.x1
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public m c() {
            return m.this;
        }

        @Override // st.x1
        public boolean d() {
            return true;
        }

        @Override // st.x1
        public List<m1> getParameters() {
            return this.f168360d.a();
        }

        @Override // st.q
        protected Collection<st.t0> r() {
            String strE;
            zs.c cVarA;
            List<us.r> listP = ws.g.p(m.this.k1(), m.this.j1().j());
            m mVar = m.this;
            ArrayList arrayList = new ArrayList(pq.v.y(listP, 10));
            Iterator<T> it = listP.iterator();
            while (it.hasNext()) {
                arrayList.add(mVar.j1().i().u((us.r) it.next()));
            }
            List listL0 = pq.v.L0(arrayList, m.this.j1().c().c().e(m.this));
            ArrayList<vr.n0.b> arrayList2 = new ArrayList();
            Iterator it4 = listL0.iterator();
            while (it4.hasNext()) {
                vr.h hVarC = ((st.t0) it4.next()).T0().c();
                vr.n0.b bVar = hVarC instanceof vr.n0.b ? (vr.n0.b) hVarC : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                ot.w wVarJ = m.this.j1().c().j();
                m mVar2 = m.this;
                ArrayList arrayList3 = new ArrayList(pq.v.y(arrayList2, 10));
                for (vr.n0.b bVar2 : arrayList2) {
                    zs.b bVarN = ht.e.n(bVar2);
                    if (bVarN == null || (cVarA = bVarN.a()) == null || (strE = cVarA.a()) == null) {
                        strE = bVar2.getName().e();
                    }
                    arrayList3.add(strE);
                }
                wVarJ.b(mVar2, arrayList3);
            }
            return pq.v.f1(listL0);
        }

        public String toString() {
            return m.this.getName().toString();
        }

        @Override // st.q
        protected k1 w() {
            return k1.a.f208057a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<zs.f, us.h> f168362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final rt.h<zs.f, vr.e> f168363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final rt.i<Set<zs.f>> f168364c;

        public c() {
            List<us.h> listM0 = m.this.k1().M0();
            LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listM0, 10)), 16));
            for (Object obj : listM0) {
                linkedHashMap.put(ot.m0.b(m.this.j1().g(), ((us.h) obj).O()), obj);
            }
            this.f168362a = linkedHashMap;
            this.f168363b = m.this.j1().h().a(new o(this, m.this));
            this.f168364c = m.this.j1().h().d(new p(this));
        }

        private final Set<zs.f> e() {
            HashSet hashSet = new HashSet();
            Iterator<st.t0> it = m.this.o().q().iterator();
            while (it.hasNext()) {
                for (vr.m mVar : lt.n.a.a(it.next().r(), null, null, 3, null)) {
                    if ((mVar instanceof g1) || (mVar instanceof z0)) {
                        hashSet.add(((vr.b) mVar).getName());
                    }
                }
            }
            List<us.j> listR0 = m.this.k1().R0();
            m mVar2 = m.this;
            Iterator<T> it4 = listR0.iterator();
            while (it4.hasNext()) {
                hashSet.add(ot.m0.b(mVar2.j1().g(), ((us.j) it4.next()).D0()));
            }
            List<us.o> listY0 = m.this.k1().Y0();
            m mVar3 = m.this;
            Iterator<T> it5 = listY0.iterator();
            while (it5.hasNext()) {
                hashSet.add(ot.m0.b(mVar3.j1().g(), ((us.o) it5.next()).T0()));
            }
            return pq.e1.l(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vr.e f(c cVar, m mVar, zs.f fVar) {
            us.h hVar = cVar.f168362a.get(fVar);
            if (hVar != null) {
                return yr.q.R0(mVar.j1().h(), mVar, fVar, cVar.f168364c, new qt.a(mVar.j1().h(), new q(mVar, hVar)), h1.f208052a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(m mVar, us.h hVar) {
            return pq.v.f1(mVar.j1().c().d().e(mVar.o1(), hVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection<vr.e> d() {
            Set<zs.f> setKeySet = this.f168362a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                vr.e eVarI = i((zs.f) it.next());
                if (eVarI != null) {
                    arrayList.add(eVarI);
                }
            }
            return arrayList;
        }

        public final vr.e i(zs.f fVar) {
            return this.f168363b.b(fVar);
        }
    }

    static final /* synthetic */ class d extends fr.a implements er.l<us.r, e1> {
        d(Object obj) {
            super(1, obj, x0.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final e1 b(us.r rVar) {
            return x0.q((x0) this.f66376a, rVar, false, 2, null);
        }
    }

    static final /* synthetic */ class e extends fr.q implements er.l<zs.f, e1> {
        e(Object obj) {
            super(1, obj, m.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final e1 b(zs.f fVar) {
            return ((m) this.f66391b).p1(fVar);
        }
    }

    static final /* synthetic */ class f extends fr.q implements er.l<tt.g, a> {
        f(Object obj) {
            super(1, obj, a.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final a b(tt.g gVar) {
            return ((m) this.f66391b).new a(gVar);
        }
    }

    public m(ot.p pVar, us.c cVar, ws.d dVar, ws.a aVar, h1 h1Var) {
        lt.l qVar;
        super(pVar.h(), ot.m0.a(dVar, cVar.O0()).h());
        this.f168337f = cVar;
        this.f168338g = aVar;
        this.f168339h = h1Var;
        this.f168340j = ot.m0.a(dVar, cVar.O0());
        ot.p0 p0Var = ot.p0.f149838a;
        this.f168341k = p0Var.b(ws.b.f214723e.d(cVar.N0()));
        this.f168342l = ot.q0.a(p0Var, ws.b.f214722d.d(cVar.N0()));
        vr.f fVarA = p0Var.a(ws.b.f214724f.d(cVar.N0()));
        this.f168343m = fVarA;
        ot.p pVarA = pVar.a(this, cVar.j1(), dVar, new ws.h(cVar.k1()), ws.j.f214769b.a(cVar.m1()), aVar);
        this.f168344n = pVarA;
        boolean zBooleanValue = ws.b.f214731m.d(cVar.N0()).booleanValue();
        this.f168345p = zBooleanValue;
        vr.f fVar = vr.f.ENUM_CLASS;
        if (fVarA == fVar) {
            qVar = new lt.q(pVarA.h(), this, zBooleanValue || fr.t.c(pVarA.c().i().a(), Boolean.TRUE));
        } else {
            qVar = lt.k.b.f120132b;
        }
        this.f168346q = qVar;
        this.f168347r = new b();
        this.f168348s = f1.f208045e.a(this, pVarA.h(), pVarA.c().n().d(), new f(this));
        this.f168349t = fVarA == fVar ? new c() : null;
        vr.m mVarE = pVar.e();
        this.f168350v = mVarE;
        this.f168351w = pVarA.h().c(new qt.d(this));
        this.f168352x = pVarA.h().d(new qt.e(this));
        this.f168353y = pVarA.h().c(new qt.f(this));
        this.f168354z = pVarA.h().d(new g(this));
        this.A = pVarA.h().c(new h(this));
        ws.d dVarG = pVarA.g();
        ws.h hVarJ = pVarA.j();
        m mVar = mVarE instanceof m ? (m) mVarE : null;
        this.B = new ot.o0.a(cVar, dVarG, hVarJ, h1Var, mVar != null ? mVar.B : null);
        this.C = !ws.b.f214721c.d(cVar.N0()).booleanValue() ? wr.h.f214542p0.b() : new s0(pVarA.h(), new i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a1(m mVar) {
        return pq.v.f1(mVar.f168344n.c().d().h(mVar.B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.e b1(m mVar) {
        return mVar.c1();
    }

    private final vr.e c1() {
        if (!this.f168337f.n1()) {
            return null;
        }
        vr.h hVarE = l1().e(ot.m0.b(this.f168344n.g(), this.f168337f.y0()), ds.d.FROM_DESERIALIZATION);
        if (hVarE instanceof vr.e) {
            return (vr.e) hVarE;
        }
        return null;
    }

    private final Collection<vr.d> d1() {
        return pq.v.L0(pq.v.L0(f1(), pq.v.r(H())), this.f168344n.c().c().a(this));
    }

    private final vr.d e1() {
        Object next;
        if (this.f168343m.e()) {
            yr.i iVarL = dt.h.l(this, h1.f208052a);
            iVarL.m1(t());
            return iVarL;
        }
        Iterator<T> it = this.f168337f.D0().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (ws.b.f214732n.d(((us.e) next).Y()).booleanValue());
        us.e eVar = (us.e) next;
        if (eVar != null) {
            return this.f168344n.f().u(eVar, true);
        }
        return null;
    }

    private final List<vr.d> f1() {
        List<us.e> listD0 = this.f168337f.D0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD0) {
            if (ws.b.f214732n.d(((us.e) obj).Y()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.f168344n.f().u((us.e) it.next(), false));
        }
        return arrayList2;
    }

    private final Collection<vr.e> g1() {
        if (this.f168341k != vr.f0.SEALED) {
            return pq.v.n();
        }
        List<Integer> listZ0 = this.f168337f.Z0();
        if (listZ0.isEmpty()) {
            return dt.a.f44470a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listZ0.iterator();
        while (it.hasNext()) {
            vr.e eVarB = this.f168344n.c().b(ot.m0.a(this.f168344n.g(), ((Integer) it.next()).intValue()));
            if (eVarB != null) {
                arrayList.add(eVarB);
            }
        }
        return arrayList;
    }

    private final r1<e1> h1() {
        if (!n() && !x()) {
            return null;
        }
        boolean zC = this.f168338g.c(1, 5, 1);
        r1<e1> r1VarA = ot.z0.a(this.f168337f, zC, this.f168344n.g(), this.f168344n.j(), new d(this.f168344n.i()), new e(this));
        if (r1VarA != null) {
            return r1VarA;
        }
        if (zC) {
            return null;
        }
        vr.d dVarH = H();
        if (dVarH == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        zs.f name = ((t1) pq.v.l0(dVarH.l())).getName();
        e1 e1VarP1 = p1(name);
        if (e1VarP1 != null) {
            return new vr.a0(name, e1VarP1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection i1(m mVar) {
        return mVar.d1();
    }

    private final a l1() {
        return (a) this.f168348s.c(this.f168344n.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e1 p1(zs.f fVar) {
        Iterator<T> it = l1().c(fVar, ds.d.FROM_DESERIALIZATION).iterator();
        boolean z15 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z15) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((z0) next).R() == null) {
                if (!z15) {
                    z15 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        z0 z0Var = (z0) obj;
        return (e1) (z0Var != null ? z0Var.getType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.d r1(m mVar) {
        return mVar.e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection s1(m mVar) {
        return mVar.g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 t1(m mVar) {
        return mVar.h1();
    }

    @Override // vr.i
    public boolean E() {
        return ws.b.f214725g.d(this.f168337f.N0()).booleanValue();
    }

    @Override // vr.e
    public vr.d H() {
        return this.f168351w.a();
    }

    @Override // yr.z
    protected lt.k I0(tt.g gVar) {
        return this.f168348s.c(gVar);
    }

    @Override // vr.e
    public boolean O0() {
        return ws.b.f214726h.d(this.f168337f.N0()).booleanValue();
    }

    @Override // vr.e
    public r1<e1> Y() {
        return this.A.a();
    }

    @Override // vr.e, vr.n, vr.m
    public vr.m b() {
        return this.f168350v;
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    @Override // yr.a, vr.e
    public List<c1> c0() {
        List<us.r> listB = ws.g.b(this.f168337f, this.f168344n.j());
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new yr.n0(P0(), new mt.b(this, this.f168344n.i().u((us.r) it.next()), null, null), wr.h.f214542p0.b()));
        }
        return arrayList;
    }

    @Override // vr.e0
    public boolean d0() {
        return ws.b.f214727i.d(this.f168337f.N0()).booleanValue();
    }

    @Override // vr.e
    public boolean e0() {
        return ws.b.f214724f.d(this.f168337f.N0()) == us.c.EnumC5226c.COMPANION_OBJECT;
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        return this.C;
    }

    @Override // vr.e, vr.e0, vr.q
    public vr.u h() {
        return this.f168342l;
    }

    @Override // vr.e
    public boolean j0() {
        return ws.b.f214730l.d(this.f168337f.N0()).booleanValue();
    }

    public final ot.p j1() {
        return this.f168344n;
    }

    @Override // vr.e
    public vr.f k() {
        return this.f168343m;
    }

    public final us.c k1() {
        return this.f168337f;
    }

    @Override // vr.p
    public h1 m() {
        return this.f168339h;
    }

    public final ws.a m1() {
        return this.f168338g;
    }

    @Override // vr.e
    public boolean n() {
        return ws.b.f214729k.d(this.f168337f.N0()).booleanValue() && this.f168338g.e(1, 4, 1);
    }

    @Override // vr.e
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public lt.l q0() {
        return this.f168346q;
    }

    @Override // vr.h
    public x1 o() {
        return this.f168347r;
    }

    @Override // vr.e0
    public boolean o0() {
        return ws.b.f214728j.d(this.f168337f.N0()).booleanValue();
    }

    public final ot.o0.a o1() {
        return this.B;
    }

    @Override // vr.e
    public Collection<vr.d> p() {
        return this.f168352x.a();
    }

    public final boolean q1(zs.f fVar) {
        return l1().t().contains(fVar);
    }

    @Override // vr.e
    public vr.e r0() {
        return this.f168353y.a();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("deserialized ");
        sb5.append(o0() ? "expect " : "");
        sb5.append("class ");
        sb5.append(getName());
        return sb5.toString();
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        return this.f168344n.i().m();
    }

    @Override // vr.e, vr.e0
    public vr.f0 w() {
        return this.f168341k;
    }

    @Override // vr.e
    public boolean x() {
        return ws.b.f214729k.d(this.f168337f.N0()).booleanValue() && this.f168338g.c(1, 4, 2);
    }
}
