package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pq.e1;
import st.f2;
import st.k2;
import st.p2;
import st.t1;
import vr.f1;
import vr.k1;
import vr.m1;
import vr.q1;
import vr.r1;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends yr.j implements ls.c {
    public static final a B = new a(null);
    private static final Set<String> C = e1.i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    private final rt.i<List<m1>> A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ms.k f138116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qs.g f138117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final vr.e f138118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ms.k f138119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oq.k f138120n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final vr.f f138121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final vr.f0 f138122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final x1 f138123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f138124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f138125t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final z f138126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f1<z> f138127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final lt.g f138128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final z0 f138129y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final wr.h f138130z;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends st.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final rt.i<List<m1>> f138131d;

        public b() {
            super(n.this.f138119m.e());
            this.f138131d = n.this.f138119m.e().d(new o(n.this));
        }

        private final st.t0 L() {
            zs.c cVarB;
            ArrayList arrayList;
            zs.c cVarM = M();
            if (cVarM == null || cVarM.c() || !cVarM.h(sr.p.A)) {
                cVarM = null;
            }
            if (cVarM == null) {
                cVarB = js.r.f104728a.b(ht.e.o(n.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarM;
            }
            vr.e eVarB = ht.e.B(n.this.f138119m.d(), cVarB, ds.d.FROM_JAVA_LOADER);
            if (eVarB == null) {
                return null;
            }
            int size = eVarB.o().getParameters().size();
            List<m1> parameters = n.this.o().getParameters();
            int size2 = parameters.size();
            if (size2 == size) {
                List<m1> list = parameters;
                arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new f2(p2.INVARIANT, ((m1) it.next()).t()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarM != null) {
                    return null;
                }
                f2 f2Var = new f2(p2.INVARIANT, ((m1) pq.v.P0(parameters)).t());
                lr.i iVar = new lr.i(1, size);
                ArrayList arrayList2 = new ArrayList(pq.v.y(iVar, 10));
                Iterator<Integer> it4 = iVar.iterator();
                while (it4.hasNext()) {
                    ((pq.s0) it4).nextInt();
                    arrayList2.add(f2Var);
                }
                arrayList = arrayList2;
            }
            return st.w0.h(t1.f184126b.k(), eVarB, arrayList);
        }

        private final zs.c M() {
            String strB;
            wr.c cVarH = n.this.getAnnotations().H(js.j0.f104677r);
            if (cVarH == null) {
                return null;
            }
            Object objQ0 = pq.v.Q0(cVarH.a().values());
            ft.y yVar = objQ0 instanceof ft.y ? (ft.y) objQ0 : null;
            if (yVar == null || (strB = yVar.b()) == null || !zs.e.e(strB)) {
                return null;
            }
            return new zs.c(strB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List N(n nVar) {
            return q1.g(nVar);
        }

        @Override // st.w, st.x1
        /* JADX INFO: renamed from: J */
        public vr.e c() {
            return n.this;
        }

        @Override // st.x1
        public boolean d() {
            return true;
        }

        @Override // st.x1
        public List<m1> getParameters() {
            return this.f138131d.a();
        }

        @Override // st.q
        protected Collection<st.t0> r() {
            Collection<qs.j> collectionQ = n.this.Y0().q();
            ArrayList arrayList = new ArrayList(collectionQ.size());
            ArrayList arrayList2 = new ArrayList(0);
            st.t0 t0VarL = L();
            Iterator<qs.j> it = collectionQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qs.j next = it.next();
                st.t0 t0VarQ = n.this.f138119m.a().r().q(n.this.f138119m.g().p(next, os.b.b(k2.SUPERTYPE, false, false, null, 7, null)), n.this.f138119m);
                if (t0VarQ.T0().c() instanceof vr.n0.b) {
                    arrayList2.add(next);
                }
                if (!fr.t.c(t0VarQ.T0(), t0VarL != null ? t0VarL.T0() : null) && !sr.j.c0(t0VarQ)) {
                    arrayList.add(t0VarQ);
                }
            }
            vr.e eVar = n.this.f138118l;
            cu.a.a(arrayList, eVar != null ? ur.y.a(eVar, n.this).c().q(eVar.t(), p2.INVARIANT) : null);
            cu.a.a(arrayList, t0VarL);
            if (!arrayList2.isEmpty()) {
                ot.w wVarC = n.this.f138119m.a().c();
                vr.e eVarC = c();
                ArrayList arrayList3 = new ArrayList(pq.v.y(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((qs.j) ((qs.x) it4.next())).I());
                }
                wVarC.b(eVarC, arrayList3);
            }
            return !arrayList.isEmpty() ? pq.v.f1(arrayList) : pq.v.e(n.this.f138119m.d().i().i());
        }

        public String toString() {
            return n.this.getName().e();
        }

        @Override // st.q
        protected k1 w() {
            return n.this.f138119m.a().v();
        }
    }

    public /* synthetic */ n(ms.k kVar, vr.m mVar, qs.g gVar, vr.e eVar, int i15, fr.k kVar2) {
        this(kVar, mVar, gVar, (i15 & 8) != 0 ? null : eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W0(n nVar) {
        List<qs.y> typeParameters = nVar.f138117k.getTypeParameters();
        ArrayList arrayList = new ArrayList(pq.v.y(typeParameters, 10));
        for (qs.y yVar : typeParameters) {
            m1 m1VarA = nVar.f138119m.f().a(yVar);
            if (m1VarA == null) {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + nVar.f138117k + ", so it must be resolved");
            }
            arrayList.add(m1VarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c1(n nVar) {
        zs.b bVarN = ht.e.n(nVar);
        if (bVarN != null) {
            return nVar.f138116j.a().f().a(bVarN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z d1(n nVar, tt.g gVar) {
        return new z(nVar.f138119m, nVar, nVar.f138117k, nVar.f138118l != null, nVar.f138126v);
    }

    @Override // vr.i
    public boolean E() {
        return this.f138124s;
    }

    @Override // vr.e
    public vr.d H() {
        return null;
    }

    @Override // vr.e
    public boolean O0() {
        return false;
    }

    public final n V0(ks.j jVar, vr.e eVar) {
        ms.k kVar = this.f138119m;
        return new n(ms.c.m(kVar, kVar.a().x(jVar)), b(), this.f138117k, eVar);
    }

    @Override // yr.a, vr.e
    public lt.k X() {
        return this.f138128x;
    }

    @Override // vr.e
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public List<vr.d> p() {
        return this.f138126v.a1().a();
    }

    @Override // vr.e
    public r1<st.e1> Y() {
        return null;
    }

    public final qs.g Y0() {
        return this.f138117k;
    }

    public final List<qs.a> Z0() {
        return (List) this.f138120n.getValue();
    }

    @Override // yr.a, vr.e
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public z a0() {
        return (z) super.a0();
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.z
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public z I0(tt.g gVar) {
        return (z) this.f138127w.c(gVar);
    }

    @Override // vr.e
    public boolean e0() {
        return false;
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        return this.f138130z;
    }

    @Override // vr.e, vr.e0, vr.q
    public vr.u h() {
        return (fr.t.c(this.f138123r, vr.t.f208076a) && this.f138117k.r() == null) ? js.y.f104779a : js.v0.d(this.f138123r);
    }

    @Override // vr.e
    public boolean j0() {
        return false;
    }

    @Override // vr.e
    public vr.f k() {
        return this.f138121p;
    }

    @Override // vr.e
    public boolean n() {
        return false;
    }

    @Override // vr.h
    public st.x1 o() {
        return this.f138125t;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // vr.e
    public lt.k q0() {
        return this.f138129y;
    }

    @Override // vr.e
    public vr.e r0() {
        return null;
    }

    public String toString() {
        return "Lazy Java class " + ht.e.p(this);
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        return this.A.a();
    }

    @Override // vr.e, vr.e0
    public vr.f0 w() {
        return this.f138122q;
    }

    @Override // vr.e
    public boolean x() {
        return false;
    }

    public n(ms.k kVar, vr.m mVar, qs.g gVar, vr.e eVar) {
        vr.f fVar;
        vr.f0 f0VarA;
        super(kVar.e(), mVar, gVar.getName(), kVar.a().t().a(gVar), false);
        this.f138116j = kVar;
        this.f138117k = gVar;
        this.f138118l = eVar;
        ms.k kVarF = ms.c.f(kVar, this, gVar, 0, 4, null);
        this.f138119m = kVarF;
        kVarF.a().h().a(gVar, this);
        gVar.O();
        this.f138120n = oq.l.a(new k(this));
        if (gVar.t()) {
            fVar = vr.f.ANNOTATION_CLASS;
        } else if (gVar.N()) {
            fVar = vr.f.INTERFACE;
        } else {
            fVar = gVar.x() ? vr.f.ENUM_CLASS : vr.f.CLASS;
        }
        this.f138121p = fVar;
        if (gVar.t() || gVar.x()) {
            f0VarA = vr.f0.FINAL;
        } else {
            f0VarA = vr.f0.f208038a.a(gVar.A(), gVar.A() || gVar.C() || gVar.N(), !gVar.G());
        }
        this.f138122q = f0VarA;
        this.f138123r = gVar.h();
        this.f138124s = (gVar.r() == null || gVar.k()) ? false : true;
        this.f138125t = new b();
        z zVar = new z(kVarF, this, gVar, eVar != null, null, 16, null);
        this.f138126v = zVar;
        this.f138127w = f1.f208045e.a(this, kVarF.e(), kVarF.a().k().d(), new l(this));
        this.f138128x = new lt.g(zVar);
        this.f138129y = new z0(kVarF, gVar, this);
        this.f138130z = ms.h.a(kVarF, gVar);
        this.A = kVarF.e().d(new m(this));
    }
}
