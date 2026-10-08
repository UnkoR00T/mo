package vr;

import java.util.List;
import st.p2;

/* JADX INFO: loaded from: classes4.dex */
final class c implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f208022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f208023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f208024c;

    public c(m1 m1Var, m mVar, int i15) {
        this.f208022a = m1Var;
        this.f208023b = mVar;
        this.f208024c = i15;
    }

    @Override // vr.m1
    public boolean B() {
        return this.f208022a.B();
    }

    @Override // vr.m1
    public rt.n P() {
        return this.f208022a.P();
    }

    @Override // vr.m1
    public boolean T() {
        return true;
    }

    @Override // vr.n, vr.m
    public m b() {
        return this.f208023b;
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        return this.f208022a.getAnnotations();
    }

    @Override // vr.m1
    public int getIndex() {
        return this.f208024c + this.f208022a.getIndex();
    }

    @Override // vr.k0
    public zs.f getName() {
        return this.f208022a.getName();
    }

    @Override // vr.m1
    public List<st.t0> getUpperBounds() {
        return this.f208022a.getUpperBounds();
    }

    @Override // vr.p
    public h1 m() {
        return this.f208022a.m();
    }

    @Override // vr.m1, vr.h
    public st.x1 o() {
        return this.f208022a.o();
    }

    @Override // vr.m1
    public p2 q() {
        return this.f208022a.q();
    }

    @Override // vr.h
    public st.e1 t() {
        return this.f208022a.t();
    }

    public String toString() {
        return this.f208022a + "[inner-copy]";
    }

    @Override // vr.m
    public <R, D> R z0(o<R, D> oVar, D d15) {
        return (R) this.f208022a.z0(oVar, d15);
    }

    @Override // vr.m
    /* JADX INFO: renamed from: a */
    public m1 Q0() {
        return this.f208022a.Q0();
    }
}
