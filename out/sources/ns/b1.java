package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.k2;
import st.p2;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends yr.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ms.k f138058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final qs.y f138059m;

    public b1(ms.k kVar, qs.y yVar, int i15, vr.m mVar) {
        super(kVar.e(), mVar, new ms.g(kVar, yVar, false, 4, null), yVar.getName(), p2.INVARIANT, false, i15, h1.f208052a, kVar.a().v());
        this.f138058l = kVar;
        this.f138059m = yVar;
    }

    private final List<st.t0> S0() {
        Collection<qs.j> upperBounds = this.f138059m.getUpperBounds();
        if (upperBounds.isEmpty()) {
            return pq.v.e(st.w0.e(this.f138058l.d().i().i(), this.f138058l.d().i().J()));
        }
        Collection<qs.j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(pq.v.y(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f138058l.g().p((qs.j) it.next(), os.b.b(k2.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // yr.h
    protected List<st.t0> M0(List<? extends st.t0> list) {
        return this.f138058l.a().r().r(this, list, this.f138058l);
    }

    @Override // yr.h
    protected void Q0(st.t0 t0Var) {
    }

    @Override // yr.h
    protected List<st.t0> R0() {
        return S0();
    }
}
