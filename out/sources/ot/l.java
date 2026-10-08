package ot;

import java.util.Iterator;
import java.util.Set;
import pq.e1;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f149782c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<zs.b> f149783d = e1.d(zs.b.f236634d.c(sr.p.a.f183635d.m()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f149784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<a, vr.e> f149785b;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zs.b f149786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f149787b;

        public a(zs.b bVar, i iVar) {
            this.f149786a = bVar;
            this.f149787b = iVar;
        }

        public final i a() {
            return this.f149787b;
        }

        public final zs.b b() {
            return this.f149786a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && fr.t.c(this.f149786a, ((a) obj).f149786a);
        }

        public int hashCode() {
            return this.f149786a.hashCode();
        }
    }

    public static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        public final Set<zs.b> a() {
            return l.f149783d;
        }

        private b() {
        }
    }

    public l(n nVar) {
        this.f149784a = nVar;
        this.f149785b = nVar.u().a(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.e c(l lVar, a aVar) {
        return lVar.d(aVar);
    }

    private final vr.e d(a aVar) {
        Object next;
        p pVarA;
        vr.o0 o0Var;
        zs.b bVarB = aVar.b();
        Iterator<xr.b> it = this.f149784a.l().iterator();
        while (it.hasNext()) {
            vr.e eVarB = it.next().b(bVarB);
            if (eVarB != null) {
                return eVarB;
            }
        }
        if (f149783d.contains(bVarB)) {
            return null;
        }
        i iVarA = aVar.a();
        if (iVarA == null && (iVarA = this.f149784a.e().a(bVarB)) == null) {
            return null;
        }
        ws.d dVarA = iVarA.a();
        us.c cVarB = iVarA.b();
        ws.a aVarC = iVarA.c();
        h1 h1VarD = iVarA.d();
        zs.b bVarE = bVarB.e();
        if (bVarE != null) {
            vr.e eVarF = f(this, bVarE, null, 2, null);
            qt.m mVar = eVarF instanceof qt.m ? (qt.m) eVarF : null;
            if (mVar == null || !mVar.q1(bVarB.h())) {
                return null;
            }
            pVarA = mVar.j1();
        } else {
            Iterator<T> it4 = vr.t0.c(this.f149784a.s(), bVarB.f()).iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                o0Var = (vr.o0) next;
                if (!(o0Var instanceof r)) {
                    break;
                }
            } while (!((r) o0Var).Q0(bVarB.h()));
            vr.o0 o0Var2 = (vr.o0) next;
            if (o0Var2 == null) {
                return null;
            }
            pVarA = this.f149784a.a(o0Var2, dVarA, new ws.h(cVarB.k1()), ws.j.f214769b.a(cVarB.m1()), aVarC, null);
            aVarC = aVarC;
        }
        return new qt.m(pVarA, cVarB, dVarA, aVarC, h1VarD);
    }

    public static /* synthetic */ vr.e f(l lVar, zs.b bVar, i iVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            iVar = null;
        }
        return lVar.e(bVar, iVar);
    }

    public final vr.e e(zs.b bVar, i iVar) {
        return this.f149785b.b(new a(bVar, iVar));
    }
}
