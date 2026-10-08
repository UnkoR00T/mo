package st;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends k0 implements m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k0 f184081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0 f184082e;

    public m0(k0 k0Var, t0 t0Var) {
        super(k0Var.b1(), k0Var.c1());
        this.f184081d = k0Var;
        this.f184082e = t0Var;
    }

    @Override // st.o2
    public o2 X0(boolean z15) {
        return n2.d(K0().X0(z15), m0().W0().X0(z15));
    }

    @Override // st.o2
    public o2 Z0(t1 t1Var) {
        return n2.d(K0().Z0(t1Var), m0());
    }

    @Override // st.k0
    public e1 a1() {
        return K0().a1();
    }

    @Override // st.k0
    public String d1(ct.n nVar, ct.y yVar) {
        return yVar.d() ? nVar.S(m0()) : K0().d1(nVar, yVar);
    }

    @Override // st.m2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public k0 K0() {
        return this.f184081d;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public m0 d1(tt.g gVar) {
        return new m0((k0) gVar.a(K0()), gVar.a(m0()));
    }

    @Override // st.m2
    public t0 m0() {
        return this.f184082e;
    }

    @Override // st.k0
    public String toString() {
        return "[@EnhancedForWarnings(" + m0() + ")] " + K0();
    }
}
