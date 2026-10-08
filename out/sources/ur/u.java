package ur;

import fr.h0;
import fr.p0;
import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ot.m0;
import ss.b0;
import ss.c0;
import ss.f0;
import st.e1;
import st.i2;
import st.t0;
import st.z0;
import vr.g0;
import vr.g1;
import vr.h1;
import vr.i0;
import vr.n0;
import vr.t1;
import vr.z;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements xr.a, xr.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f200091i = {q0.j(new h0(u.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), q0.j(new h0(u.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), q0.j(new h0(u.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f200092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ur.d f200093b = ur.d.f200051a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.i f200094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0 f200095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.i f200096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rt.a<zs.c, vr.e> f200097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rt.i f200098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rt.g<oq.r<String, String>, wr.h> f200099h;

    private enum a {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f200106g = wq.b.a(b());
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200107a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f200107a = iArr;
        }
    }

    public static final class c extends yr.h0 {
        c(i0 i0Var, zs.c cVar) {
            super(i0Var, cVar);
        }

        @Override // vr.o0
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public lt.k.b r() {
            return lt.k.b.f120132b;
        }
    }

    public static final class d extends cu.b.AbstractC0805b<vr.e, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f200108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0<a> f200109b;

        d(String str, p0<a> p0Var) {
            this.f200108a = str;
            this.f200109b = p0Var;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, ur.u$a] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, ur.u$a] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, ur.u$a] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, ur.u$a] */
        @Override // cu.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(vr.e eVar) {
            String strA = b0.a(f0.f183849a, eVar, this.f200108a);
            x xVar = x.f200113a;
            if (xVar.f().contains(strA)) {
                this.f200109b.f66410a = a.HIDDEN;
            } else if (xVar.i().contains(strA)) {
                this.f200109b.f66410a = a.VISIBLE;
            } else if (xVar.c().contains(strA)) {
                this.f200109b.f66410a = a.DEPRECATED_LIST_METHODS;
            } else if (xVar.d().contains(strA)) {
                this.f200109b.f66410a = a.DROP;
            }
            return this.f200109b.f66410a == null;
        }

        @Override // cu.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = this.f200109b.f66410a;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    public u(i0 i0Var, rt.n nVar, er.a<k.b> aVar) {
        this.f200092a = i0Var;
        this.f200094c = nVar.d(aVar);
        this.f200095d = q(nVar);
        this.f200096e = nVar.d(new l(this, nVar));
        this.f200097f = nVar.b();
        this.f200098g = nVar.d(new m(this));
        this.f200099h = nVar.i(new n(this));
    }

    private final a A(z zVar) {
        return (a) cu.b.b(pq.v.e((vr.e) zVar.b()), new t(this), new d(c0.c(zVar, false, false, 3, null), new p0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable B(u uVar, vr.e eVar) {
        Collection<t0> collectionQ = eVar.o().q();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionQ.iterator();
        while (it.hasNext()) {
            vr.h hVarC = ((t0) it.next()).T0().c();
            vr.e eVarZ = null;
            vr.h hVarA = hVarC != null ? hVarC.Q0() : null;
            vr.e eVar2 = hVarA instanceof vr.e ? (vr.e) hVarA : null;
            if (eVar2 != null && (eVarZ = uVar.z(eVar2)) == null) {
                eVarZ = eVar2;
            }
            if (eVarZ != null) {
                arrayList.add(eVarZ);
            }
        }
        return arrayList;
    }

    private final wr.h C() {
        return (wr.h) rt.m.a(this.f200098g, this, f200091i[2]);
    }

    private final k.b D() {
        return (k.b) rt.m.a(this.f200094c, this, f200091i[0]);
    }

    private final boolean E(g1 g1Var, boolean z15) {
        if (z15 ^ x.f200113a.g().contains(b0.a(f0.f183849a, (vr.e) g1Var.b(), c0.c(g1Var, false, false, 3, null)))) {
            return true;
        }
        return cu.b.e(pq.v.e(g1Var), r.f200088a, new s(this)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(vr.b bVar) {
        return bVar.Q0().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean G(u uVar, vr.b bVar) {
        return Boolean.valueOf(bVar.k() == vr.b.a.DECLARATION && uVar.f200093b.c((vr.e) bVar.b()));
    }

    private final boolean H(vr.l lVar, vr.e eVar) {
        if (lVar.l().size() != 1) {
            return false;
        }
        vr.h hVarC = ((t1) pq.v.P0(lVar.l())).getType().T0().c();
        return fr.t.c(hVarC != null ? ht.e.p(hVarC) : null, ht.e.p(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wr.h I(u uVar) {
        return wr.h.f214542p0.a(pq.v.e(wr.g.c(uVar.f200092a.i(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 o(u uVar, rt.n nVar) {
        return vr.y.d(uVar.D().a(), g.f200055d.a(), new n0(nVar, uVar.D().a())).t();
    }

    private final g1 p(qt.m mVar, g1 g1Var) {
        z.a<? extends g1> aVarZ = g1Var.z();
        aVarZ.f(mVar);
        aVarZ.j(vr.t.f208080e);
        aVarZ.b(mVar.t());
        aVarZ.k(mVar.P0());
        return (g1) aVarZ.build();
    }

    private final t0 q(rt.n nVar) {
        yr.k kVar = new yr.k(new c(this.f200092a, new zs.c("java.io")), zs.f.l("Serializable"), vr.f0.ABSTRACT, vr.f.INTERFACE, pq.v.e(new z0(nVar, new o(this))), h1.f208052a, false, nVar);
        kVar.Q0(lt.k.b.f120132b, pq.e1.e(), null);
        return kVar.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 r(u uVar) {
        return uVar.f200092a.i().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wr.h s(u uVar, oq.r rVar) {
        String str = (String) rVar.a();
        String str2 = (String) rVar.b();
        return wr.h.f214542p0.a(pq.v.e(wr.g.b(uVar.f200092a.i(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection<g1> t(vr.e eVar, er.l<? super lt.k, ? extends Collection<? extends g1>> lVar) {
        ns.n nVarZ = z(eVar);
        if (nVarZ == null) {
            return pq.v.n();
        }
        Collection<vr.e> collectionG = this.f200093b.g(ht.e.o(nVarZ), ur.b.f200029h.a());
        vr.e eVar2 = (vr.e) pq.v.y0(collectionG);
        if (eVar2 == null) {
            return pq.v.n();
        }
        cu.k.b bVar = cu.k.f37890c;
        ArrayList arrayList = new ArrayList(pq.v.y(collectionG, 10));
        Iterator<T> it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(ht.e.o((vr.e) it.next()));
        }
        cu.k kVarB = bVar.b(arrayList);
        boolean zC = this.f200093b.c(eVar);
        Collection<? extends g1> collectionB = lVar.b(this.f200097f.c(ht.e.o(nVarZ), new q(nVarZ, eVar2)).a0());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionB) {
            g1 g1Var = (g1) obj;
            if (g1Var.k() == vr.b.a.DECLARATION && g1Var.h().d() && !sr.j.l0(g1Var)) {
                Collection<? extends z> collectionE = g1Var.e();
                if (!(collectionE instanceof Collection) || !collectionE.isEmpty()) {
                    Iterator<T> it4 = collectionE.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (kVarB.contains(ht.e.o(((z) it4.next()).b()))) {
                            }
                        }
                    }
                }
                if (!E(g1Var, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.e u(ns.n nVar, vr.e eVar) {
        return nVar.V0(ks.j.f112324a, eVar);
    }

    private final e1 v() {
        return (e1) rt.m.a(this.f200096e, this, f200091i[1]);
    }

    private static final boolean w(vr.l lVar, i2 i2Var, vr.l lVar2) {
        return dt.o.x(lVar, lVar2.c(i2Var)) == dt.o.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection x(zs.f fVar, lt.k kVar) {
        return kVar.a(fVar, ds.d.FROM_BUILTINS);
    }

    private final ns.n z(vr.e eVar) {
        zs.b bVarN;
        zs.c cVarA;
        if (sr.j.b0(eVar) || !sr.j.C0(eVar)) {
            return null;
        }
        zs.d dVarP = ht.e.p(eVar);
        if (dVarP.f() && (bVarN = ur.c.f200031a.n(dVarP)) != null && (cVarA = bVarN.a()) != null) {
            vr.e eVarD = vr.s.d(D().a(), cVarA, ds.d.FROM_BUILTINS);
            if (eVarD instanceof ns.n) {
                return (ns.n) eVarD;
            }
        }
        return null;
    }

    @Override // xr.a
    public Collection<vr.d> a(vr.e eVar) {
        vr.e eVarF;
        if (eVar.k() != vr.f.CLASS || !D().b()) {
            return pq.v.n();
        }
        ns.n nVarZ = z(eVar);
        if (nVarZ != null && (eVarF = ur.d.f(this.f200093b, ht.e.o(nVarZ), ur.b.f200029h.a(), null, 4, null)) != null) {
            i2 i2VarC = y.a(eVarF, nVarZ).c();
            List<vr.d> listX0 = nVarZ.p();
            ArrayList<vr.d> arrayList = new ArrayList();
            for (Object obj : listX0) {
                vr.d dVar = (vr.d) obj;
                if (dVar.h().d()) {
                    Collection<vr.d> collectionP = eVarF.p();
                    if (!(collectionP instanceof Collection) || !collectionP.isEmpty()) {
                        Iterator<T> it = collectionP.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (w((vr.d) it.next(), i2VarC, dVar)) {
                                }
                            }
                        }
                    }
                    if (!H(dVar, eVar) && !sr.j.l0(dVar) && !x.f200113a.e().contains(b0.a(f0.f183849a, nVarZ, c0.c(dVar, false, false, 3, null)))) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
            for (vr.d dVar2 : arrayList) {
                z.a<? extends z> aVarZ = dVar2.z();
                aVarZ.f(eVar);
                aVarZ.b(eVar.t());
                aVarZ.i();
                aVarZ.p(i2VarC.k());
                if (!x.f200113a.h().contains(b0.a(f0.f183849a, nVarZ, c0.c(dVar2, false, false, 3, null)))) {
                    aVarZ.d(C());
                }
                arrayList2.add((vr.d) aVarZ.build());
            }
            return arrayList2;
        }
        return pq.v.n();
    }

    @Override // xr.c
    public boolean b(vr.e eVar, g1 g1Var) {
        ns.n nVarZ = z(eVar);
        if (nVarZ == null || !g1Var.getAnnotations().d2(xr.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = c0.c(g1Var, false, false, 3, null);
        Collection<g1> collectionA = nVarZ.a0().a(g1Var.getName(), ds.d.FROM_BUILTINS);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            if (fr.t.c(c0.c((g1) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // xr.a
    public Collection<g1> c(zs.f fVar, vr.e eVar) {
        wr.h hVarB;
        if (fr.t.c(fVar, ur.a.f200027e.a()) && (eVar instanceof qt.m) && sr.j.f0(eVar)) {
            qt.m mVar = (qt.m) eVar;
            List<us.j> listR0 = mVar.k1().R0();
            if (!(listR0 instanceof Collection) || !listR0.isEmpty()) {
                Iterator<T> it = listR0.iterator();
                while (it.hasNext()) {
                    if (fr.t.c(m0.b(mVar.j1().g(), ((us.j) it.next()).D0()), ur.a.f200027e.a())) {
                        return pq.v.n();
                    }
                }
            }
            return pq.v.e(p(mVar, (g1) pq.v.O0(v().r().a(fVar, ds.d.FROM_BUILTINS))));
        }
        if (!D().b()) {
            return pq.v.n();
        }
        Collection<g1> collectionT = t(eVar, new p(fVar));
        ArrayList arrayList = new ArrayList();
        for (g1 g1Var : collectionT) {
            z.a<? extends g1> aVarZ = ((g1) g1Var.c(y.a((vr.e) g1Var.b(), eVar).c())).z();
            aVarZ.f(eVar);
            aVarZ.k(eVar.P0());
            aVarZ.i();
            int i15 = b.f200107a[A(g1Var).ordinal()];
            g1 g1Var2 = null;
            if (i15 != 1) {
                if (i15 == 2) {
                    zs.f name = g1Var.getName();
                    if (fr.t.c(name, v.f200110a)) {
                        hVarB = this.f200099h.b(oq.y.a(g1Var.getName().e(), "first"));
                    } else {
                        if (!fr.t.c(name, v.f200111b)) {
                            throw new IllegalStateException(("Unexpected name: " + g1Var.getName()).toString());
                        }
                        hVarB = this.f200099h.b(oq.y.a(g1Var.getName().e(), "last"));
                    }
                    aVarZ.d(hVarB);
                } else if (i15 == 3) {
                    aVarZ.d(C());
                } else if (i15 != 4) {
                    if (i15 != 5) {
                        throw new oq.p();
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                }
                g1Var2 = (g1) aVarZ.build();
            } else if (!g0.a(eVar)) {
                aVarZ.e();
                g1Var2 = (g1) aVarZ.build();
            }
            if (g1Var2 != null) {
                arrayList.add(g1Var2);
            }
        }
        return arrayList;
    }

    @Override // xr.a
    public Collection<t0> e(vr.e eVar) {
        zs.d dVarP = ht.e.p(eVar);
        x xVar = x.f200113a;
        if (xVar.j(dVarP)) {
            return pq.v.q(v(), this.f200095d);
        }
        return xVar.k(dVarP) ? pq.v.e(this.f200095d) : pq.v.n();
    }

    @Override // xr.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set<zs.f> d(vr.e eVar) {
        ns.z zVarA1;
        Set<zs.f> setB;
        if (!D().b()) {
            return pq.e1.e();
        }
        ns.n nVarZ = z(eVar);
        return (nVarZ == null || (zVarA1 = nVarZ.a0()) == null || (setB = zVarA1.b()) == null) ? pq.e1.e() : setB;
    }
}
