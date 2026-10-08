package vr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<o0> f208075a;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(Collection<? extends o0> collection) {
        this.f208075a = collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zs.c f(o0 o0Var) {
        return o0Var.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(zs.c cVar, zs.c cVar2) {
        return !cVar2.c() && fr.t.c(cVar2.d(), cVar);
    }

    @Override // vr.p0
    @oq.a
    public List<o0> a(zs.c cVar) {
        Collection<o0> collection = this.f208075a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (fr.t.c(((o0) obj).g(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // vr.u0
    public boolean b(zs.c cVar) {
        Collection<o0> collection = this.f208075a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (fr.t.c(((o0) it.next()).g(), cVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.u0
    public void c(zs.c cVar, Collection<o0> collection) {
        for (Object obj : this.f208075a) {
            if (fr.t.c(((o0) obj).g(), cVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // vr.p0
    public Collection<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar) {
        return eu.k.P(eu.k.x(eu.k.H(pq.v.a0(this.f208075a), q0.f208072a), new r0(cVar)));
    }
}
