package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends m implements vr.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.n f228756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sr.j f228757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zs.f f228758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<vr.h0<?>, Object> f228759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i0 f228760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f228761h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private vr.p0 f228762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f228763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final rt.g<zs.c, vr.v0> f228764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final oq.k f228765m;

    public f0(zs.f fVar, rt.n nVar, sr.j jVar, at.a aVar) {
        this(fVar, nVar, jVar, aVar, null, null, 48, null);
    }

    private final String R0() {
        return getName().toString();
    }

    private final l T0() {
        return (l) this.f228765m.getValue();
    }

    private final boolean V0() {
        return this.f228762j != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l X0(f0 f0Var) {
        b0 b0Var = f0Var.f228761h;
        if (b0Var == null) {
            throw new AssertionError("Dependencies of module " + f0Var.R0() + " were not set before querying module content");
        }
        List<f0> listA = b0Var.a();
        f0Var.Q0();
        listA.contains(f0Var);
        List<f0> list = listA;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).V0();
        }
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList.add(((f0) it4.next()).f228762j);
        }
        return new l(arrayList, "CompositeProvider@ModuleDescriptor for " + f0Var.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.v0 Y0(f0 f0Var, zs.c cVar) {
        return f0Var.f228760g.a(f0Var, cVar, f0Var.f228756c);
    }

    @Override // vr.i0
    public boolean C(vr.i0 i0Var) {
        return fr.t.c(this, i0Var) || pq.v.c0(this.f228761h.c(), i0Var) || D0().contains(i0Var) || i0Var.D0().contains(this);
    }

    @Override // vr.i0
    public List<vr.i0> D0() {
        b0 b0Var = this.f228761h;
        if (b0Var != null) {
            return b0Var.b();
        }
        throw new AssertionError("Dependencies of module " + R0() + " were not set");
    }

    @Override // vr.i0
    public <T> T L0(vr.h0<T> h0Var) {
        T t15 = (T) this.f228759f.get(h0Var);
        if (t15 == null) {
            return null;
        }
        return t15;
    }

    public void Q0() {
        if (W0()) {
            return;
        }
        vr.c0.a(this);
    }

    public final vr.p0 S0() {
        Q0();
        return T0();
    }

    public final void U0(vr.p0 p0Var) {
        V0();
        this.f228762j = p0Var;
    }

    @Override // vr.i0
    public vr.v0 V(zs.c cVar) {
        Q0();
        return this.f228764l.b(cVar);
    }

    public boolean W0() {
        return this.f228763k;
    }

    public final void Z0(List<f0> list) {
        a1(list, e1.e());
    }

    public final void a1(List<f0> list, Set<f0> set) {
        b1(new c0(list, set, pq.v.n(), e1.e()));
    }

    @Override // vr.m
    public /* bridge */ vr.m b() {
        return vr.i0.a.b(this);
    }

    public final void b1(b0 b0Var) {
        this.f228761h = b0Var;
    }

    public final void c1(f0... f0VarArr) {
        Z0(pq.n.n1(f0VarArr));
    }

    @Override // vr.i0
    public sr.j i() {
        return this.f228757d;
    }

    @Override // vr.i0
    public Collection<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar) {
        Q0();
        return S0().s(cVar, lVar);
    }

    @Override // yr.m
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        if (!W0()) {
            sb5.append(" !isValid");
        }
        sb5.append(" packageFragmentProvider: ");
        vr.p0 p0Var = this.f228762j;
        sb5.append(p0Var != null ? p0Var.getClass().getSimpleName() : null);
        return sb5.toString();
    }

    @Override // vr.m
    public /* bridge */ <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return (R) vr.i0.a.a(this, oVar, d15);
    }

    public /* synthetic */ f0(zs.f fVar, rt.n nVar, sr.j jVar, at.a aVar, Map map, zs.f fVar2, int i15, fr.k kVar) {
        this(fVar, nVar, jVar, (i15 & 8) != 0 ? null : aVar, (i15 & 16) != 0 ? pq.v0.i() : map, (i15 & 32) != 0 ? null : fVar2);
    }

    public f0(zs.f fVar, rt.n nVar, sr.j jVar, at.a aVar, Map<vr.h0<?>, ? extends Object> map, zs.f fVar2) {
        super(wr.h.f214542p0.b(), fVar);
        this.f228756c = nVar;
        this.f228757d = jVar;
        this.f228758e = fVar2;
        if (fVar.n()) {
            this.f228759f = map;
            i0 i0Var = (i0) L0(i0.f228797a.a());
            this.f228760g = i0Var == null ? i0.b.f228800b : i0Var;
            this.f228763k = true;
            this.f228764l = nVar.i(new d0(this));
            this.f228765m = oq.l.a(new e0(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }
}
