package yr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class x extends m implements vr.v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f228942h = {fr.q0.j(new fr.h0(x.class, "fragments", "getFragments()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(x.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f228943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zs.c f228944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.i f228945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rt.i f228946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lt.k f228947g;

    public x(f0 f0Var, zs.c cVar, rt.n nVar) {
        super(wr.h.f214542p0.b(), cVar.g());
        this.f228943c = f0Var;
        this.f228944d = cVar;
        this.f228945e = nVar.d(new u(this));
        this.f228946f = nVar.d(new v(this));
        this.f228947g = new lt.i(nVar, new w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R0(x xVar) {
        return vr.t0.b(xVar.F0().S0(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List S0(x xVar) {
        return vr.t0.c(xVar.F0().S0(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lt.k W0(x xVar) {
        if (xVar.isEmpty()) {
            return lt.k.b.f120132b;
        }
        List<vr.o0> listN0 = xVar.n0();
        ArrayList arrayList = new ArrayList(pq.v.y(listN0, 10));
        Iterator<T> it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(((vr.o0) it.next()).r());
        }
        List listM0 = pq.v.M0(arrayList, new p0(xVar.F0(), xVar.g()));
        return lt.b.f120085d.a("package view scope for " + xVar.g() + " in " + xVar.F0().getName(), listM0);
    }

    @Override // vr.m
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public vr.v0 b() {
        if (g().c()) {
            return null;
        }
        return F0().V(g().d());
    }

    protected final boolean U0() {
        return ((Boolean) rt.m.a(this.f228946f, this, f228942h[1])).booleanValue();
    }

    @Override // vr.v0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public f0 F0() {
        return this.f228943c;
    }

    public boolean equals(Object obj) {
        vr.v0 v0Var = obj instanceof vr.v0 ? (vr.v0) obj : null;
        return v0Var != null && fr.t.c(g(), v0Var.g()) && fr.t.c(F0(), v0Var.F0());
    }

    @Override // vr.v0
    public zs.c g() {
        return this.f228944d;
    }

    public int hashCode() {
        return (F0().hashCode() * 31) + g().hashCode();
    }

    @Override // vr.v0
    public boolean isEmpty() {
        return U0();
    }

    @Override // vr.v0
    public List<vr.o0> n0() {
        return (List) rt.m.a(this.f228945e, this, f228942h[0]);
    }

    @Override // vr.v0
    public lt.k r() {
        return this.f228947g;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.k(this, d15);
    }
}
