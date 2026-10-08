package lt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import st.i2;
import vr.g1;
import vr.j1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f120142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oq.k f120143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i2 f120144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<vr.m, vr.m> f120145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oq.k f120146f = oq.l.a(new s(this));

    public t(k kVar, i2 i2Var) {
        this.f120142b = kVar;
        this.f120143c = oq.l.a(new r(i2Var));
        this.f120144d = et.e.h(i2Var.k(), false, 1, null).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(t tVar) {
        return tVar.l(n.a.a(tVar.f120142b, null, null, 3, null));
    }

    private final Collection<vr.m> k() {
        return (Collection) this.f120146f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends vr.m> Collection<D> l(Collection<? extends D> collection) {
        if (this.f120144d.l() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = cu.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(m((vr.m) it.next()));
        }
        return linkedHashSetG;
    }

    private final <D extends vr.m> D m(D d15) {
        if (this.f120144d.l()) {
            return d15;
        }
        if (this.f120145e == null) {
            this.f120145e = new HashMap();
        }
        Map<vr.m, vr.m> map = this.f120145e;
        vr.m mVarC = map.get(d15);
        if (mVarC == null) {
            if (!(d15 instanceof j1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d15).toString());
            }
            mVarC = ((j1) d15).c(this.f120144d);
            if (mVarC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d15 + " substitution fails");
            }
            map.put(d15, mVarC);
        }
        return (D) mVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i2 n(i2 i2Var) {
        return i2Var.k().c();
    }

    @Override // lt.k
    public Collection<? extends g1> a(zs.f fVar, ds.b bVar) {
        return l(this.f120142b.a(fVar, bVar));
    }

    @Override // lt.k
    public Set<zs.f> b() {
        return this.f120142b.b();
    }

    @Override // lt.k
    public Collection<? extends z0> c(zs.f fVar, ds.b bVar) {
        return l(this.f120142b.c(fVar, bVar));
    }

    @Override // lt.k
    public Set<zs.f> d() {
        return this.f120142b.d();
    }

    @Override // lt.n
    public vr.h e(zs.f fVar, ds.b bVar) {
        vr.h hVarE = this.f120142b.e(fVar, bVar);
        if (hVarE != null) {
            return (vr.h) m(hVarE);
        }
        return null;
    }

    @Override // lt.n
    public Collection<vr.m> f(d dVar, er.l<? super zs.f, Boolean> lVar) {
        return k();
    }

    @Override // lt.k
    public Set<zs.f> g() {
        return this.f120142b.g();
    }
}
