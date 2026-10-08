package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public class p0 extends lt.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.i0 f228857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zs.c f228858c;

    public p0(vr.i0 i0Var, zs.c cVar) {
        this.f228857b = i0Var;
        this.f228858c = cVar;
    }

    @Override // lt.l, lt.n
    public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        if (!dVar.a(lt.d.f120091c.f())) {
            return pq.v.n();
        }
        if (this.f228858c.c() && dVar.l().contains(lt.c.b.f120090a)) {
            return pq.v.n();
        }
        Collection<zs.c> collectionS = this.f228857b.s(this.f228858c, lVar);
        ArrayList arrayList = new ArrayList(collectionS.size());
        Iterator<zs.c> it = collectionS.iterator();
        while (it.hasNext()) {
            zs.f fVarF = it.next().f();
            if (lVar.b(fVarF).booleanValue()) {
                cu.a.a(arrayList, h(fVarF));
            }
        }
        return arrayList;
    }

    @Override // lt.l, lt.k
    public Set<zs.f> g() {
        return e1.e();
    }

    protected final vr.v0 h(zs.f fVar) {
        if (fVar.n()) {
            return null;
        }
        vr.v0 v0VarV = this.f228857b.V(this.f228858c.b(fVar));
        if (v0VarV.isEmpty()) {
            return null;
        }
        return v0VarV;
    }

    public String toString() {
        return "subpackages of " + this.f228858c + " from " + this.f228857b;
    }
}
