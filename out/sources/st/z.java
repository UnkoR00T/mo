package st;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends b0 implements x, wt.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f184174d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f184175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f184176c;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private final boolean a(o2 o2Var) {
            return (o2Var.T0() instanceof tt.r) || (o2Var.T0().c() instanceof vr.m1) || (o2Var instanceof tt.i) || (o2Var instanceof n1);
        }

        public static /* synthetic */ z c(a aVar, o2 o2Var, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                z15 = false;
            }
            if ((i15 & 4) != 0) {
                z16 = false;
            }
            return aVar.b(o2Var, z15, z16);
        }

        private final boolean d(o2 o2Var, boolean z15) {
            if (!a(o2Var)) {
                return false;
            }
            if (o2Var instanceof n1) {
                return l2.l(o2Var);
            }
            vr.h hVarC = o2Var.T0().c();
            yr.t0 t0Var = hVarC instanceof yr.t0 ? (yr.t0) hVarC : null;
            if (t0Var == null || t0Var.Z0()) {
                return (z15 && (o2Var.T0().c() instanceof vr.m1)) ? l2.l(o2Var) : !tt.s.f192143a.a(o2Var);
            }
            return true;
        }

        public final z b(o2 o2Var, boolean z15, boolean z16) {
            if (o2Var instanceof z) {
                return (z) o2Var;
            }
            fr.k kVar = null;
            if (!z16 && !d(o2Var, z15)) {
                return null;
            }
            if (o2Var instanceof k0) {
                k0 k0Var = (k0) o2Var;
                fr.t.c(k0Var.b1().T0(), k0Var.c1().T0());
            }
            return new z(n0.c(o2Var).X0(false), z15, kVar);
        }

        private a() {
        }
    }

    public /* synthetic */ z(e1 e1Var, boolean z15, fr.k kVar) {
        this(e1Var, z15);
    }

    @Override // st.x
    public boolean I0() {
        return (c1().T0() instanceof tt.r) || (c1().T0().c() instanceof vr.m1);
    }

    @Override // st.x
    public t0 M0(t0 t0Var) {
        return i1.e(t0Var.W0(), this.f184176c);
    }

    @Override // st.b0, st.t0
    public boolean U0() {
        return false;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: a1 */
    public e1 X0(boolean z15) {
        return z15 ? c1().X0(z15) : this;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return new z(c1().Z0(t1Var), this.f184176c);
    }

    @Override // st.b0
    protected e1 c1() {
        return this.f184175b;
    }

    public final e1 f1() {
        return this.f184175b;
    }

    @Override // st.b0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public z e1(e1 e1Var) {
        return new z(e1Var, this.f184176c);
    }

    @Override // st.e1
    public String toString() {
        return c1() + " & Any";
    }

    private z(e1 e1Var, boolean z15) {
        this.f184175b = e1Var;
        this.f184176c = z15;
    }
}
