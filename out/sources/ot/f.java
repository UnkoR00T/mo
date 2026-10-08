package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends a<wr.c> implements e<wr.c, ft.g<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f149749b;

    public f(vr.i0 i0Var, vr.n0 n0Var, nt.a aVar) {
        super(aVar);
        this.f149749b = new g(i0Var, n0Var);
    }

    @Override // ot.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public wr.c b(us.b bVar, ws.d dVar) {
        return this.f149749b.a(bVar, dVar);
    }

    @Override // ot.e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ft.g<?> d(o0 o0Var, us.o oVar, st.t0 t0Var) {
        return null;
    }

    @Override // ot.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ft.g<?> k(o0 o0Var, us.o oVar, st.t0 t0Var) {
        us.b.C5222b.c cVar = (us.b.C5222b.c) ws.f.a(oVar, n().b());
        if (cVar == null) {
            return null;
        }
        return this.f149749b.f(t0Var, cVar, o0Var.b());
    }
}
