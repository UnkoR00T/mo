package tr;

import fu.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pq.e1;
import pq.v;
import rt.n;
import sr.h;
import vr.i0;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements xr.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f191698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f191699b;

    public a(n nVar, i0 i0Var) {
        this.f191698a = nVar;
        this.f191699b = i0Var;
    }

    @Override // xr.b
    public Collection<vr.e> a(zs.c cVar) {
        return e1.e();
    }

    @Override // xr.b
    public vr.e b(zs.b bVar) {
        zs.c cVarF;
        g.b bVarC;
        if (bVar.i() || bVar.j()) {
            return null;
        }
        String strA = bVar.g().a();
        if (!r.d0(strA, "Function", false, 2, null) || (bVarC = g.f191729c.a().c((cVarF = bVar.f()), strA)) == null) {
            return null;
        }
        f fVarA = bVarC.a();
        int iB = bVarC.b();
        List<o0> listN0 = this.f191699b.V(cVarF).n0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (obj instanceof sr.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof h) {
                arrayList2.add(obj2);
            }
        }
        o0 o0Var = (h) v.n0(arrayList2);
        if (o0Var == null) {
            o0Var = (sr.c) v.l0(arrayList);
        }
        return new b(this.f191698a, o0Var, fVarA, iB);
    }

    @Override // xr.b
    public boolean c(zs.c cVar, zs.f fVar) {
        String strE = fVar.e();
        return (r.V(strE, "Function", false, 2, null) || r.V(strE, "KFunction", false, 2, null) || r.V(strE, "SuspendFunction", false, 2, null) || r.V(strE, "KSuspendFunction", false, 2, null)) && g.f191729c.a().c(cVar, strE) != null;
    }
}
