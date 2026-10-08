package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pq.e1;
import vr.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qs.u f138083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f138084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final rt.j<Set<String>> f138085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final rt.h<a, vr.e> f138086q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zs.f f138087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qs.g f138088b;

        public a(zs.f fVar, qs.g gVar) {
            this.f138087a = fVar;
            this.f138088b = gVar;
        }

        public final qs.g a() {
            return this.f138088b;
        }

        public final zs.f b() {
            return this.f138087a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && fr.t.c(this.f138087a, ((a) obj).f138087a);
        }

        public int hashCode() {
            return this.f138087a.hashCode();
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final vr.e f138089a;

            public a(vr.e eVar) {
                super(null);
                this.f138089a = eVar;
            }

            public final vr.e a() {
                return this.f138089a;
            }
        }

        /* JADX INFO: renamed from: ns.g0$b$b, reason: collision with other inner class name */
        public static final class C3407b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3407b f138090a = new C3407b();

            private C3407b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f138091a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    public g0(ms.k kVar, qs.u uVar, d0 d0Var) {
        super(kVar);
        this.f138083n = uVar;
        this.f138084o = d0Var;
        this.f138085p = kVar.e().c(new e0(kVar, this));
        this.f138086q = kVar.e().a(new f0(this, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.e i0(g0 g0Var, ms.k kVar, a aVar) {
        zs.b bVar = new zs.b(g0Var.R().g(), aVar.b());
        ss.v.a aVarC = aVar.a() != null ? kVar.a().j().c(aVar.a(), g0Var.m0()) : kVar.a().j().b(bVar, g0Var.m0());
        ss.x xVarA = aVarC != null ? aVarC.a() : null;
        zs.b bVarI = xVarA != null ? xVarA.i() : null;
        if (bVarI != null && (bVarI.j() || bVarI.i())) {
            return null;
        }
        b bVarP0 = g0Var.p0(xVarA);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C3407b)) {
            throw new oq.p();
        }
        qs.g gVarA = aVar.a();
        if (gVarA == null) {
            gVarA = kVar.a().d().b(new js.u.a(bVar, null, null, 4, null));
        }
        qs.g gVar = gVarA;
        if ((gVar != null ? gVar.O() : null) != qs.d0.BINARY) {
            zs.c cVarG = gVar != null ? gVar.g() : null;
            if (cVarG == null || cVarG.c() || !fr.t.c(cVarG.d(), g0Var.R().g())) {
                return null;
            }
            n nVar = new n(kVar, g0Var.R(), gVar, null, 8, null);
            kVar.a().e().a(nVar);
            return nVar;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + ss.w.a(kVar.a().j(), gVar, g0Var.m0()) + "\nfindKotlinClass(ClassId) = " + ss.w.b(kVar.a().j(), bVar, g0Var.m0()) + '\n');
    }

    private final vr.e j0(zs.f fVar, qs.g gVar) {
        if (!zs.h.f236655a.a(fVar)) {
            return null;
        }
        Set<String> setA = this.f138085p.a();
        if (gVar != null || setA == null || setA.contains(fVar.e())) {
            return this.f138086q.b(new a(fVar, gVar));
        }
        return null;
    }

    private final ws.c m0() {
        return L().a().b().f().g().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o0(ms.k kVar, g0 g0Var) {
        return kVar.a().d().a(g0Var.R().g());
    }

    private final b p0(ss.x xVar) {
        if (xVar == null) {
            return b.C3407b.f138090a;
        }
        if (xVar.d().c() != ts.a.EnumC5006a.CLASS) {
            return b.c.f138091a;
        }
        vr.e eVarN = L().a().b().n(xVar);
        return eVarN != null ? new b.a(eVarN) : b.C3407b.f138090a;
    }

    @Override // ns.t0
    protected void B(Collection<g1> collection, zs.f fVar) {
    }

    @Override // ns.t0
    protected Set<zs.f> D(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        return e1.e();
    }

    @Override // ns.t0, lt.l, lt.k
    public Collection<vr.z0> c(zs.f fVar, ds.b bVar) {
        return pq.v.n();
    }

    @Override // ns.t0, lt.l, lt.n
    public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        lt.d.a aVar = lt.d.f120091c;
        if (!dVar.a(aVar.e() | aVar.c())) {
            return pq.v.n();
        }
        Collection<vr.m> collectionA = K().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            vr.m mVar = (vr.m) obj;
            if ((mVar instanceof vr.e) && lVar.b(((vr.e) mVar).getName()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final vr.e k0(qs.g gVar) {
        return j0(gVar.getName(), gVar);
    }

    @Override // lt.l, lt.n
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public vr.e e(zs.f fVar, ds.b bVar) {
        return j0(fVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ns.t0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public d0 R() {
        return this.f138084o;
    }

    @Override // ns.t0
    protected Set<zs.f> v(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        if (!dVar.a(lt.d.f120091c.e())) {
            return e1.e();
        }
        Set<String> setA = this.f138085p.a();
        if (setA != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setA.iterator();
            while (it.hasNext()) {
                hashSet.add(zs.f.l((String) it.next()));
            }
            return hashSet;
        }
        qs.u uVar = this.f138083n;
        if (lVar == null) {
            lVar = cu.i.k();
        }
        Collection<qs.g> collectionJ = uVar.J(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (qs.g gVar : collectionJ) {
            zs.f name = gVar.O() == qs.d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ns.t0
    protected Set<zs.f> x(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        return e1.e();
    }

    @Override // ns.t0
    protected c z() {
        return c.a.f138060a;
    }
}
