package qt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public class m0 extends w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vr.o0 f168366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f168367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zs.c f168368i;

    public m0(vr.o0 o0Var, us.m mVar, ws.d dVar, ws.a aVar, s sVar, ot.n nVar, String str, er.a<? extends Collection<zs.f>> aVar2) {
        super(nVar.a(o0Var, dVar, new ws.h(mVar.c0()), ws.j.f214769b.a(mVar.d0()), aVar, sVar), mVar.U(), mVar.X(), mVar.b0(), aVar2);
        this.f168366g = o0Var;
        this.f168367h = str;
        this.f168368i = o0Var.g();
    }

    @Override // lt.l, lt.n
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
        Collection<vr.m> collectionM = m(dVar, lVar, ds.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<xr.b> iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator<xr.b> it = iterableL.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, it.next().a(this.f168368i));
        }
        return pq.v.L0(collectionM, arrayList);
    }

    public void C(zs.f fVar, ds.b bVar) {
        cs.a.b(s().c().p(), bVar, this.f168366g, fVar);
    }

    @Override // qt.w, lt.l, lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        C(fVar, bVar);
        return super.e(fVar, bVar);
    }

    @Override // qt.w
    protected void j(Collection<vr.m> collection, er.l<? super zs.f, Boolean> lVar) {
    }

    @Override // qt.w
    protected zs.b p(zs.f fVar) {
        return new zs.b(this.f168368i, fVar);
    }

    public String toString() {
        return this.f168367h;
    }

    @Override // qt.w
    protected Set<zs.f> v() {
        return e1.e();
    }

    @Override // qt.w
    protected Set<zs.f> w() {
        return e1.e();
    }

    @Override // qt.w
    protected Set<zs.f> x() {
        return e1.e();
    }

    @Override // qt.w
    protected boolean z(zs.f fVar) {
        if (super.z(fVar)) {
            return true;
        }
        Iterable<xr.b> iterableL = s().c().l();
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return false;
        }
        Iterator<xr.b> it = iterableL.iterator();
        while (it.hasNext()) {
            if (it.next().c(this.f168368i, fVar)) {
                return true;
            }
        }
        return false;
    }
}
