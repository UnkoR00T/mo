package rs;

import st.l2;
import st.n2;
import st.o2;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends st.b0 implements st.b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final st.e1 f175670b;

    public k(st.e1 e1Var) {
        this.f175670b = e1Var;
    }

    private final st.e1 f1(st.e1 e1Var) {
        st.e1 e1VarX0 = e1Var.X0(false);
        return !xt.d.y(e1Var) ? e1VarX0 : new k(e1VarX0);
    }

    @Override // st.x
    public boolean I0() {
        return true;
    }

    @Override // st.x
    public st.t0 M0(st.t0 t0Var) {
        o2 o2VarW0 = t0Var.W0();
        if (!xt.d.y(o2VarW0) && !l2.l(o2VarW0)) {
            return o2VarW0;
        }
        if (o2VarW0 instanceof st.e1) {
            return f1((st.e1) o2VarW0);
        }
        if (!(o2VarW0 instanceof st.k0)) {
            throw new oq.p();
        }
        st.k0 k0Var = (st.k0) o2VarW0;
        return n2.d(st.w0.e(f1(k0Var.b1()), f1(k0Var.c1())), n2.a(o2VarW0));
    }

    @Override // st.b0, st.t0
    public boolean U0() {
        return false;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1 */
    public st.e1 X0(boolean z15) {
        return z15 ? c1().X0(true) : this;
    }

    @Override // st.b0
    protected st.e1 c1() {
        return this.f175670b;
    }

    @Override // st.e1
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public k Z0(st.t1 t1Var) {
        return new k(c1().Z0(t1Var));
    }

    @Override // st.b0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public k e1(st.e1 e1Var) {
        return new k(e1Var);
    }
}
