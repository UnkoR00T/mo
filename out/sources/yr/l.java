package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements vr.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<vr.p0> f228846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f228847b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends vr.p0> list, String str) {
        this.f228846a = list;
        this.f228847b = str;
        list.size();
        pq.v.k1(list).size();
    }

    @Override // vr.p0
    @oq.a
    public List<vr.o0> a(zs.c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<vr.p0> it = this.f228846a.iterator();
        while (it.hasNext()) {
            vr.t0.a(it.next(), cVar, arrayList);
        }
        return pq.v.f1(arrayList);
    }

    @Override // vr.u0
    public boolean b(zs.c cVar) {
        List<vr.p0> list = this.f228846a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!vr.t0.b((vr.p0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // vr.u0
    public void c(zs.c cVar, Collection<vr.o0> collection) {
        Iterator<vr.p0> it = this.f228846a.iterator();
        while (it.hasNext()) {
            vr.t0.a(it.next(), cVar, collection);
        }
    }

    @Override // vr.p0
    public Collection<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar) {
        HashSet hashSet = new HashSet();
        Iterator<vr.p0> it = this.f228846a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().s(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f228847b;
    }
}
