package st;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends b0 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f184045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f184046c;

    public h1(e1 e1Var, t0 t0Var) {
        this.f184045b = e1Var;
        this.f184046c = t0Var;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1 */
    public e1 X0(boolean z15) {
        return (e1) n2.d(K0().X0(z15), m0().W0().X0(z15));
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return (e1) n2.d(K0().Z0(t1Var), m0());
    }

    @Override // st.b0
    protected e1 c1() {
        return this.f184045b;
    }

    @Override // st.m2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public e1 K0() {
        return c1();
    }

    @Override // st.b0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public h1 d1(tt.g gVar) {
        return new h1((e1) gVar.a(c1()), gVar.a(m0()));
    }

    @Override // st.b0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public h1 e1(e1 e1Var) {
        return new h1(e1Var, m0());
    }

    @Override // st.m2
    public t0 m0() {
        return this.f184046c;
    }

    @Override // st.e1
    public String toString() {
        return "[@EnhancedForWarnings(" + m0() + ")] " + K0();
    }
}
