package ht;

import er.l;
import eu.h;
import eu.k;
import fr.p0;
import fr.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import pq.v;
import sr.j;
import st.e1;
import st.t0;
import tt.c0;
import tt.g;
import tt.t;
import vr.a0;
import vr.i;
import vr.i0;
import vr.j0;
import vr.m;
import vr.o0;
import vr.r1;
import vr.t1;
import vr.y0;
import zs.f;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f86596a = f.l("value");

    static final /* synthetic */ class a extends q implements l<t1, Boolean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f86597j = new a();

        a() {
            super(1, t1.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean b(t1 t1Var) {
            return Boolean.valueOf(t1Var.E0());
        }
    }

    public static final class b extends cu.b.AbstractC0805b<vr.b, vr.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p0<vr.b> f86598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<vr.b, Boolean> f86599b;

        /* JADX WARN: Multi-variable type inference failed */
        b(p0<vr.b> p0Var, l<? super vr.b, Boolean> lVar) {
            this.f86598a = p0Var;
            this.f86599b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cu.b.AbstractC0805b, cu.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(vr.b bVar) {
            if (this.f86598a.f66410a == null && this.f86599b.b(bVar).booleanValue()) {
                this.f86598a.f66410a = bVar;
            }
        }

        @Override // cu.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(vr.b bVar) {
            return this.f86598a.f66410a == null;
        }

        @Override // cu.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public vr.b a() {
            return this.f86598a.f66410a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h A(boolean z15, vr.b bVar) {
        return z(bVar, z15);
    }

    public static final vr.e B(i0 i0Var, zs.c cVar, ds.b bVar) {
        cVar.c();
        vr.h hVarE = i0Var.V(cVar.d()).r().e(cVar.f(), bVar);
        if (hVarE instanceof vr.e) {
            return (vr.e) hVarE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m a(m mVar) {
        return mVar.b();
    }

    public static final boolean f(t1 t1Var) {
        return cu.b.e(v.e(t1Var), ht.a.f86592a, a.f86597j).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(t1 t1Var) {
        Collection<t1> collectionE = t1Var.e();
        ArrayList arrayList = new ArrayList(v.y(collectionE, 10));
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(((t1) it.next()).a());
        }
        return arrayList;
    }

    public static final vr.b h(vr.b bVar, boolean z15, l<? super vr.b, Boolean> lVar) {
        return (vr.b) cu.b.b(v.e(bVar), new c(z15), new b(new p0(), lVar));
    }

    public static /* synthetic */ vr.b i(vr.b bVar, boolean z15, l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return h(bVar, z15, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable j(boolean z15, vr.b bVar) {
        Collection<? extends vr.b> collectionE;
        if (z15) {
            bVar = bVar != null ? bVar.a() : null;
        }
        return (bVar == null || (collectionE = bVar.e()) == null) ? v.n() : collectionE;
    }

    public static final zs.c k(m mVar) {
        zs.d dVarP = p(mVar);
        if (!dVarP.f()) {
            dVarP = null;
        }
        if (dVarP != null) {
            return dVarP.m();
        }
        return null;
    }

    public static final vr.e l(wr.c cVar) {
        vr.h hVarC = cVar.getType().T0().c();
        if (hVarC instanceof vr.e) {
            return (vr.e) hVarC;
        }
        return null;
    }

    public static final j m(m mVar) {
        return s(mVar).i();
    }

    public static final zs.b n(vr.h hVar) {
        m mVarB;
        zs.b bVarN;
        if (hVar != null && (mVarB = hVar.b()) != null) {
            if (mVarB instanceof o0) {
                return new zs.b(((o0) mVarB).g(), hVar.getName());
            }
            if ((mVarB instanceof i) && (bVarN = n((vr.h) mVarB)) != null) {
                return bVarN.d(hVar.getName());
            }
        }
        return null;
    }

    public static final zs.c o(m mVar) {
        return dt.i.n(mVar);
    }

    public static final zs.d p(m mVar) {
        return dt.i.m(mVar);
    }

    public static final a0<e1> q(vr.e eVar) {
        r1<e1> r1VarY = eVar != null ? eVar.Y() : null;
        if (r1VarY instanceof a0) {
            return (a0) r1VarY;
        }
        return null;
    }

    public static final g r(i0 i0Var) {
        t tVar = (t) i0Var.L0(tt.h.a());
        c0 c0Var = tVar != null ? (c0) tVar.a() : null;
        return c0Var instanceof c0.a ? ((c0.a) c0Var).b() : g.a.f192119a;
    }

    public static final i0 s(m mVar) {
        return dt.i.g(mVar);
    }

    public static final j0<e1> t(vr.e eVar) {
        r1<e1> r1VarY = eVar != null ? eVar.Y() : null;
        if (r1VarY instanceof j0) {
            return (j0) r1VarY;
        }
        return null;
    }

    public static final h<m> u(m mVar) {
        return k.w(v(mVar), 1);
    }

    public static final h<m> v(m mVar) {
        return k.o(mVar, ht.b.f86593a);
    }

    public static final vr.b w(vr.b bVar) {
        return bVar instanceof y0 ? ((y0) bVar).Z() : bVar;
    }

    public static final vr.e x(vr.e eVar) {
        for (t0 t0Var : eVar.t().T0().q()) {
            if (!j.c0(t0Var)) {
                vr.h hVarC = t0Var.T0().c();
                if (dt.i.w(hVarC)) {
                    return (vr.e) hVarC;
                }
            }
        }
        return null;
    }

    public static final boolean y(i0 i0Var) {
        c0 c0Var;
        t tVar = (t) i0Var.L0(tt.h.a());
        return (tVar == null || (c0Var = (c0) tVar.a()) == null || !c0Var.a()) ? false : true;
    }

    public static final h<vr.b> z(vr.b bVar, boolean z15) {
        if (z15) {
            bVar = bVar.a();
        }
        return k.K(k.s(bVar), k.C(v.a0(bVar.e()), new d(z15)));
    }
}
