package st;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f184004b;

    public c0(e1 e1Var) {
        this.f184004b = e1Var;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1 */
    public e1 X0(boolean z15) {
        return z15 == U0() ? this : c1().X0(z15).Z0(S0());
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return t1Var != S0() ? new g1(this, t1Var) : this;
    }

    @Override // st.b0
    protected e1 c1() {
        return this.f184004b;
    }
}
