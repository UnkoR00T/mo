package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class f1 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f184026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d2> f184027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f184028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lt.k f184029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final er.l<tt.g, e1> f184030f;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(x1 x1Var, List<? extends d2> list, boolean z15, lt.k kVar, er.l<? super tt.g, ? extends e1> lVar) {
        this.f184026b = x1Var;
        this.f184027c = list;
        this.f184028d = z15;
        this.f184029e = kVar;
        this.f184030f = lVar;
        if (!(r() instanceof ut.g) || (r() instanceof ut.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + r() + '\n' + T0());
    }

    @Override // st.t0
    public List<d2> R0() {
        return this.f184027c;
    }

    @Override // st.t0
    public t1 S0() {
        return t1.f184126b.k();
    }

    @Override // st.t0
    public x1 T0() {
        return this.f184026b;
    }

    @Override // st.t0
    public boolean U0() {
        return this.f184028d;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1 */
    public e1 X0(boolean z15) {
        if (z15 == U0()) {
            return this;
        }
        return z15 ? new c1(this) : new a1(this);
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return t1Var.isEmpty() ? this : new g1(this, t1Var);
    }

    @Override // st.o2
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public e1 d1(tt.g gVar) {
        e1 e1VarB = this.f184030f.b(gVar);
        return e1VarB == null ? this : e1VarB;
    }

    @Override // st.t0
    public lt.k r() {
        return this.f184029e;
    }
}
