package st;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rt.n f184177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final er.a<t0> f184178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i<t0> f184179d;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(rt.n nVar, er.a<? extends t0> aVar) {
        this.f184177b = nVar;
        this.f184178c = aVar;
        this.f184179d = nVar.d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 b1(tt.g gVar, z0 z0Var) {
        return gVar.a(z0Var.f184178c.a());
    }

    @Override // st.q2
    protected t0 X0() {
        return this.f184179d.a();
    }

    @Override // st.q2
    public boolean Y0() {
        return this.f184179d.t();
    }

    @Override // st.t0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public z0 d1(tt.g gVar) {
        return new z0(this.f184177b, new y0(gVar, this));
    }
}
