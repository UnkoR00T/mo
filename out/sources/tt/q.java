package tt;

import st.o2;
import st.t0;
import st.w1;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f192140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f192141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dt.o f192142e;

    public q(g gVar, f fVar) {
        this.f192140c = gVar;
        this.f192141d = fVar;
        this.f192142e = dt.o.m(d());
    }

    @Override // tt.p
    public dt.o a() {
        return this.f192142e;
    }

    @Override // tt.e
    public boolean b(t0 t0Var, t0 t0Var2) {
        return g(a.b(true, false, null, f(), d(), 6, null), t0Var.W0(), t0Var2.W0());
    }

    @Override // tt.e
    public boolean c(t0 t0Var, t0 t0Var2) {
        return e(a.b(false, false, null, f(), d(), 6, null), t0Var.W0(), t0Var2.W0());
    }

    @Override // tt.p
    public g d() {
        return this.f192140c;
    }

    public final boolean e(w1 w1Var, o2 o2Var, o2 o2Var2) {
        return st.h.f184041a.m(w1Var, o2Var, o2Var2);
    }

    public f f() {
        return this.f192141d;
    }

    public final boolean g(w1 w1Var, o2 o2Var, o2 o2Var2) {
        return st.h.w(st.h.f184041a, w1Var, o2Var, o2Var2, false, 8, null);
    }

    public /* synthetic */ q(g gVar, f fVar, int i15, fr.k kVar) {
        this(gVar, (i15 & 2) != 0 ? f.a.f192118a : fVar);
    }
}
