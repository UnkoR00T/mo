package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import st.e1;
import st.k2;
import st.p2;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ls.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f138098i = {fr.q0.j(new fr.h0(j.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), fr.q0.j(new fr.h0(j.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), fr.q0.j(new fr.h0(j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms.k f138099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qs.a f138100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.j f138101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i f138102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ps.a f138103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rt.i f138104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f138105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f138106h;

    public j(ms.k kVar, qs.a aVar, boolean z15) {
        this.f138099a = kVar;
        this.f138100b = aVar;
        this.f138101c = kVar.e().c(new g(this));
        this.f138102d = kVar.e().d(new h(this));
        this.f138103e = kVar.a().t().a(aVar);
        this.f138104f = kVar.e().d(new i(this));
        this.f138105g = aVar.j();
        this.f138106h = aVar.K() || z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e(j jVar) {
        Collection<qs.b> collectionE = jVar.f138100b.e();
        ArrayList arrayList = new ArrayList();
        for (qs.b bVar : collectionE) {
            zs.f name = bVar.getName();
            if (name == null) {
                name = js.j0.f104662c;
            }
            ft.g<?> gVarN = jVar.n(bVar);
            oq.r rVarA = gVarN != null ? oq.y.a(name, gVarN) : null;
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return pq.v0.s(arrayList);
    }

    private final vr.e f(zs.c cVar) {
        return vr.y.d(this.f138099a.d(), zs.b.f236634d.c(cVar), this.f138099a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zs.c h(j jVar) {
        zs.b bVarI = jVar.f138100b.i();
        if (bVarI != null) {
            return bVarI.a();
        }
        return null;
    }

    private final ft.g<?> n(qs.b bVar) {
        if (bVar instanceof qs.o) {
            return ft.i.f(ft.i.f66956a, ((qs.o) bVar).getValue(), null, 2, null);
        }
        if (bVar instanceof qs.m) {
            qs.m mVar = (qs.m) bVar;
            return q(mVar.d(), mVar.e());
        }
        if (bVar instanceof qs.e) {
            qs.e eVar = (qs.e) bVar;
            zs.f name = eVar.getName();
            if (name == null) {
                name = js.j0.f104662c;
            }
            return p(name, eVar.c());
        }
        if (bVar instanceof qs.c) {
            return o(((qs.c) bVar).a());
        }
        if (bVar instanceof qs.h) {
            return r(((qs.h) bVar).b());
        }
        return null;
    }

    private final ft.g<?> o(qs.a aVar) {
        return new ft.a(new j(this.f138099a, aVar, false, 4, null));
    }

    private final ft.g<?> p(zs.f fVar, List<? extends qs.b> list) {
        st.t0 t0VarM;
        if (st.x0.a(getType())) {
            return null;
        }
        t1 t1VarB = ks.a.b(fVar, ht.e.l(this));
        if (t1VarB == null || (t0VarM = t1VarB.getType()) == null) {
            t0VarM = this.f138099a.a().m().i().m(p2.INVARIANT, ut.l.d(ut.k.f201293d1, new String[0]));
        }
        List<? extends qs.b> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ft.g<?> gVarN = n((qs.b) it.next());
            if (gVarN == null) {
                gVarN = new ft.v();
            }
            arrayList.add(gVarN);
        }
        return ft.i.f66956a.b(arrayList, t0VarM);
    }

    private final ft.g<?> q(zs.b bVar, zs.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new ft.k(bVar, fVar);
    }

    private final ft.g<?> r(qs.x xVar) {
        return ft.t.f66974b.a(this.f138099a.g().p(xVar, os.b.b(k2.COMMON, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 s(j jVar) {
        zs.c cVarG = jVar.g();
        if (cVarG == null) {
            return ut.l.d(ut.k.f201295e1, jVar.f138100b.toString());
        }
        vr.e eVarF = ur.d.f(ur.d.f200051a, cVarG, jVar.f138099a.d().i(), null, 4, null);
        if (eVarF == null) {
            qs.g gVarC = jVar.f138100b.c();
            eVarF = gVarC != null ? jVar.f138099a.a().n().a(gVarC) : null;
            if (eVarF == null) {
                eVarF = jVar.f(cVarG);
            }
        }
        return eVarF.t();
    }

    @Override // wr.c
    public Map<zs.f, ft.g<?>> a() {
        return (Map) rt.m.a(this.f138104f, this, f138098i[2]);
    }

    @Override // wr.c
    public zs.c g() {
        return (zs.c) rt.m.b(this.f138101c, this, f138098i[0]);
    }

    @Override // wr.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ps.a m() {
        return this.f138103e;
    }

    @Override // ls.g
    public boolean j() {
        return this.f138105g;
    }

    @Override // wr.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e1 getType() {
        return (e1) rt.m.a(this.f138102d, this, f138098i[1]);
    }

    public final boolean l() {
        return this.f138106h;
    }

    public String toString() {
        return ct.n.O(ct.n.f37666h, this, null, 2, null);
    }

    public /* synthetic */ j(ms.k kVar, qs.a aVar, boolean z15, int i15, fr.k kVar2) {
        this(kVar, aVar, (i15 & 4) != 0 ? false : z15);
    }
}
