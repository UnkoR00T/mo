package rs;

import st.l2;
import st.n2;

/* JADX INFO: loaded from: classes4.dex */
final class o1 extends e<wr.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr.a f175698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f175699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ms.k f175700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final js.c f175701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f175702e;

    public o1(wr.a aVar, boolean z15, ms.k kVar, js.c cVar, boolean z16) {
        this.f175698a = aVar;
        this.f175699b = z15;
        this.f175700c = kVar;
        this.f175701d = cVar;
        this.f175702e = z16;
    }

    @Override // rs.e
    public zs.d A(wt.i iVar) {
        vr.e eVarF = l2.f((st.t0) iVar);
        if (eVarF != null) {
            return dt.i.m(eVarF);
        }
        return null;
    }

    @Override // rs.e
    public boolean D() {
        return this.f175702e;
    }

    @Override // rs.e
    public boolean F(wt.i iVar) {
        return sr.j.e0((st.t0) iVar);
    }

    @Override // rs.e
    public boolean G() {
        return this.f175699b;
    }

    @Override // rs.e
    public boolean H(wt.i iVar, wt.i iVar2) {
        return this.f175700c.a().k().c((st.t0) iVar, (st.t0) iVar2);
    }

    @Override // rs.e
    public boolean I(wt.q qVar) {
        return qVar instanceof ns.b1;
    }

    @Override // rs.e
    public boolean J(wt.i iVar) {
        return ((st.t0) iVar).W0() instanceof k;
    }

    @Override // rs.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public boolean o(wr.c cVar, wt.i iVar) {
        if ((cVar instanceof ls.g) && ((ls.g) cVar).j()) {
            return true;
        }
        if ((cVar instanceof ns.j) && !x() && (((ns.j) cVar).l() || t() == js.c.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return iVar != null && sr.j.r0((st.t0) iVar) && p().p(cVar) && !this.f175700c.a().q().d();
    }

    @Override // rs.e
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public js.d p() {
        return this.f175700c.a().a();
    }

    @Override // rs.e
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public st.t0 y(wt.i iVar) {
        return n2.a((st.t0) iVar);
    }

    @Override // rs.e
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public wt.v E() {
        return tt.u.f192145a;
    }

    @Override // rs.e
    public Iterable<wr.c> q(wt.i iVar) {
        return ((st.t0) iVar).getAnnotations();
    }

    @Override // rs.e
    public Iterable<wr.c> s() {
        wr.h annotations;
        wr.a aVar = this.f175698a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? pq.v.n() : annotations;
    }

    @Override // rs.e
    public js.c t() {
        return this.f175701d;
    }

    @Override // rs.e
    public js.f0 u() {
        return this.f175700c.b();
    }

    @Override // rs.e
    public boolean v() {
        wr.a aVar = this.f175698a;
        return (aVar instanceof vr.t1) && ((vr.t1) aVar).y0() != null;
    }

    @Override // rs.e
    protected m w(m mVar, js.w wVar) {
        m mVarB;
        if (mVar != null && (mVarB = m.b(mVar, l.NOT_NULL, false, 2, null)) != null) {
            return mVarB;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    @Override // rs.e
    public boolean x() {
        return this.f175700c.a().q().c();
    }

    public /* synthetic */ o1(wr.a aVar, boolean z15, ms.k kVar, js.c cVar, boolean z16, int i15, fr.k kVar2) {
        this(aVar, z15, kVar, cVar, (i15 & 16) != 0 ? false : z16);
    }
}
