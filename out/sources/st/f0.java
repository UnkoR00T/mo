package st;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends k0 implements wt.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t1 f184025d;

    public f0(sr.j jVar, t1 t1Var) {
        super(jVar.I(), jVar.J());
        this.f184025d = t1Var;
    }

    @Override // st.k0, st.t0
    public t1 S0() {
        return this.f184025d;
    }

    @Override // st.k0, st.t0
    public boolean U0() {
        return false;
    }

    @Override // st.k0
    public e1 a1() {
        return c1();
    }

    @Override // st.k0
    public String d1(ct.n nVar, ct.y yVar) {
        return "dynamic";
    }

    @Override // st.o2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public f0 X0(boolean z15) {
        return this;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public f0 d1(tt.g gVar) {
        return this;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public f0 Z0(t1 t1Var) {
        return new f0(xt.d.n(a1()), t1Var);
    }
}
