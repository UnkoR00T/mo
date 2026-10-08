package zt;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.t0;
import vr.c1;
import vr.l1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f237241a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<h> f237242b;

    static {
        zs.f fVar = t.f237260k;
        k.b bVar = k.b.f237230b;
        h hVar = new h(fVar, new f[]{bVar, new a0.a(1)}, (er.l) null, 4, (fr.k) null);
        h hVar2 = new h(t.f237261l, new f[]{bVar, new a0.a(2)}, p.f237238a);
        zs.f fVar2 = t.f237245b;
        m mVar = m.f237232a;
        a0.a aVar = new a0.a(2);
        j jVar = j.f237226a;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (er.l) null, 4, (fr.k) null);
        h hVar4 = new h(t.f237247c, new f[]{bVar, mVar, new a0.a(3), jVar}, (er.l) null, 4, (fr.k) null);
        h hVar5 = new h(t.f237249d, new f[]{bVar, mVar, new a0.b(2), jVar}, (er.l) null, 4, (fr.k) null);
        h hVar6 = new h(t.f237258i, new f[]{bVar}, (er.l) null, 4, (fr.k) null);
        zs.f fVar3 = t.f237257h;
        a0.d dVar = a0.d.f237206b;
        v.a aVar2 = v.a.f237280d;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (er.l) null, 4, (fr.k) null);
        zs.f fVar4 = t.f237259j;
        a0.c cVar = a0.c.f237205b;
        f237242b = pq.v.q(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, (er.l) null, 4, (fr.k) null), new h(t.f237262m, new f[]{bVar, cVar}, (er.l) null, 4, (fr.k) null), new h(t.f237263n, new f[]{bVar, cVar, aVar2}, (er.l) null, 4, (fr.k) null), new h(t.H, new f[]{bVar, dVar, mVar}, (er.l) null, 4, (fr.k) null), new h(t.I, new f[]{bVar, dVar, mVar}, (er.l) null, 4, (fr.k) null), new h(t.f237251e, new f[]{k.a.f237229b}, q.f237239a), new h(t.f237255g, new f[]{bVar, v.b.f237281d, dVar, mVar}, (er.l) null, 4, (fr.k) null), new h(t.X, new f[]{bVar, dVar, mVar}, (er.l) null, 4, (fr.k) null), new h(t.W, new f[]{bVar, cVar}, (er.l) null, 4, (fr.k) null), new h(pq.v.q(t.f237273x, t.f237274y), new f[]{bVar}, r.f237240a), new h(t.f237248c0, new f[]{bVar, v.c.f237282d, dVar, mVar}, (er.l) null, 4, (fr.k) null), new h(t.f237265p, new f[]{bVar, cVar}, (er.l) null, 4, (fr.k) null));
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(vr.z zVar) {
        t1 t1Var = (t1) pq.v.z0(zVar.l());
        boolean z15 = false;
        if (t1Var != null && !ht.e.f(t1Var) && t1Var.y0() == null) {
            z15 = true;
        }
        if (z15) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    public static final String g(vr.z zVar) {
        boolean z15;
        if (h(zVar.b())) {
            z15 = true;
        } else {
            Collection<? extends vr.z> collectionE = zVar.e();
            if (!collectionE.isEmpty()) {
                Iterator<T> it = collectionE.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (h(((vr.z) it.next()).b())) {
                        }
                    } else if (vr.s.c(zVar)) {
                        z15 = false;
                    }
                    z15 = true;
                }
            } else if (vr.s.c(zVar)) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        if (z15) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("must override ''equals()'' in Any");
        if (dt.k.g(zVar.b())) {
            sb5.append(" or define ''equals(other: " + ct.n.f37668j.S(xt.d.D(((vr.e) zVar.b()).t())) + "): Boolean''");
        }
        return sb5.toString();
    }

    private static final boolean h(vr.m mVar) {
        return (mVar instanceof vr.e) && sr.j.b0((vr.e) mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(vr.z zVar) {
        c1 c1VarN = zVar.N();
        if (c1VarN == null) {
            c1VarN = zVar.R();
        }
        s sVar = f237241a;
        boolean z15 = false;
        if (c1VarN != null) {
            t0 t0VarF = zVar.f();
            if ((t0VarF != null ? xt.d.w(t0VarF, c1VarN.getType()) : false) || sVar.j(zVar, c1VarN)) {
                z15 = true;
            }
        }
        if (z15) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    private final boolean j(vr.z zVar, c1 c1Var) {
        zs.b bVarN;
        t0 t0VarF;
        mt.g value = c1Var.getValue();
        if (!(value instanceof mt.e)) {
            return false;
        }
        vr.e eVarY = ((mt.e) value).y();
        if (!eVarY.o0() || (bVarN = ht.e.n(eVarY)) == null) {
            return false;
        }
        vr.h hVarC = vr.y.c(ht.e.s(eVarY), bVarN);
        l1 l1Var = hVarC instanceof l1 ? (l1) hVarC : null;
        if (l1Var == null || (t0VarF = zVar.f()) == null) {
            return false;
        }
        return xt.d.w(t0VarF, l1Var.K());
    }

    @Override // zt.b
    public List<h> b() {
        return f237242b;
    }
}
