package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pq.e1;
import vr.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qs.g f138187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ls.c f138188o;

    public static final class a extends cu.b.AbstractC0805b<vr.e, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vr.e f138189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<R> f138190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l<lt.k, Collection<R>> f138191c;

        /* JADX WARN: Multi-variable type inference failed */
        a(vr.e eVar, Set<R> set, er.l<? super lt.k, ? extends Collection<? extends R>> lVar) {
            this.f138189a = eVar;
            this.f138190b = set;
            this.f138191c = lVar;
        }

        @Override // cu.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return oq.i0.f148189a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // cu.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(vr.e eVar) {
            if (eVar == this.f138189a) {
                return true;
            }
            lt.k kVarQ0 = eVar.q0();
            if (!(kVarQ0 instanceof a1)) {
                return true;
            }
            this.f138190b.addAll((Collection<? extends R>) ((Collection) this.f138191c.b(kVarQ0)));
            return false;
        }

        public void e() {
        }
    }

    public z0(ms.k kVar, qs.g gVar, ls.c cVar) {
        super(kVar);
        this.f138187n = gVar;
        this.f138188o = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(qs.q qVar) {
        return qVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(zs.f fVar, lt.k kVar) {
        return kVar.c(fVar, ds.d.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(lt.k kVar) {
        return kVar.d();
    }

    private final <R> Set<R> p0(vr.e eVar, Set<R> set, er.l<? super lt.k, ? extends Collection<? extends R>> lVar) {
        cu.b.b(pq.v.e(eVar), x0.f138176a, new a(eVar, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(vr.e eVar) {
        return eu.k.u(eu.k.J(pq.v.a0(eVar.o().q()), y0.f138178a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.e r0(st.t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        if (hVarC instanceof vr.e) {
            return (vr.e) hVarC;
        }
        return null;
    }

    private final vr.z0 t0(vr.z0 z0Var) {
        if (z0Var.k().b()) {
            return z0Var;
        }
        Collection<? extends vr.z0> collectionE = z0Var.e();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionE, 10));
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(t0((vr.z0) it.next()));
        }
        return (vr.z0) pq.v.P0(pq.v.e0(arrayList));
    }

    private final Set<g1> u0(zs.f fVar, vr.e eVar) {
        z0 z0VarB = ls.h.b(eVar);
        return z0VarB == null ? e1.e() : pq.v.k1(z0VarB.a(fVar, ds.d.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // ns.t0
    protected void B(Collection<g1> collection, zs.f fVar) {
        collection.addAll(ks.a.e(fVar, u0(fVar, R()), collection, R(), L().a().c(), L().a().k().a()));
        if (this.f138187n.x()) {
            if (fr.t.c(fVar, sr.p.f183608f)) {
                collection.add(dt.h.g(R()));
            } else if (fr.t.c(fVar, sr.p.f183606d)) {
                collection.add(dt.h.h(R()));
            }
        }
    }

    @Override // ns.a1, ns.t0
    protected void C(zs.f fVar, Collection<vr.z0> collection) {
        zs.f fVar2;
        Collection<vr.z0> collection2;
        Set setP0 = p0(R(), new LinkedHashSet(), new w0(fVar));
        if (collection.isEmpty()) {
            fVar2 = fVar;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                vr.z0 z0VarT0 = t0((vr.z0) obj);
                Object arrayList = linkedHashMap.get(z0VarT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(z0VarT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection<vr.z0> collection3 = collection2;
                zs.f fVar3 = fVar2;
                collection2 = collection3;
                fVar2 = fVar3;
                pq.v.D(arrayList2, ks.a.e(fVar3, (Collection) ((Map.Entry) it.next()).getValue(), collection3, R(), L().a().c(), L().a().k().a()));
            }
            collection2.addAll(arrayList2);
        } else {
            fVar2 = fVar;
            collection2 = collection;
            collection2.addAll(ks.a.e(fVar2, setP0, collection2, R(), L().a().c(), L().a().k().a()));
        }
        if (this.f138187n.x() && fr.t.c(fVar2, sr.p.f183607e)) {
            cu.a.a(collection2, dt.h.f(R()));
        }
    }

    @Override // ns.t0
    protected Set<zs.f> D(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        Set<zs.f> setJ1 = pq.v.j1(N().a().c());
        p0(R(), setJ1, v0.f138172a);
        if (this.f138187n.x()) {
            setJ1.add(sr.p.f183607e);
        }
        return setJ1;
    }

    @Override // lt.l, lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ns.t0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b z() {
        return new b(this.f138187n, u0.f138169a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ns.t0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public ls.c R() {
        return this.f138188o;
    }

    @Override // ns.t0
    protected Set<zs.f> v(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        return e1.e();
    }

    @Override // ns.t0
    protected Set<zs.f> x(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        Set<zs.f> setJ1 = pq.v.j1(N().a().a());
        z0 z0VarB = ls.h.b(R());
        Set<zs.f> setB = z0VarB != null ? z0VarB.b() : null;
        if (setB == null) {
            setB = e1.e();
        }
        setJ1.addAll(setB);
        if (this.f138187n.x()) {
            setJ1.addAll(pq.v.q(sr.p.f183608f, sr.p.f183606d));
        }
        setJ1.addAll(L().a().w().b(R(), L()));
        return setJ1;
    }

    @Override // ns.t0
    protected void y(Collection<g1> collection, zs.f fVar) {
        L().a().w().f(R(), fVar, collection, L());
    }
}
