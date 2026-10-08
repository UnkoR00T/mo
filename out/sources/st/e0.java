package st;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends g2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f184018e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g2 f184019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g2 f184020d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final g2 a(g2 g2Var, g2 g2Var2) {
            if (g2Var.f()) {
                return g2Var2;
            }
            return g2Var2.f() ? g2Var : new e0(g2Var, g2Var2, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e0(g2 g2Var, g2 g2Var2, fr.k kVar) {
        this(g2Var, g2Var2);
    }

    public static final g2 i(g2 g2Var, g2 g2Var2) {
        return f184018e.a(g2Var, g2Var2);
    }

    @Override // st.g2
    public boolean a() {
        return this.f184019c.a() || this.f184020d.a();
    }

    @Override // st.g2
    public boolean b() {
        return this.f184019c.b() || this.f184020d.b();
    }

    @Override // st.g2
    public wr.h d(wr.h hVar) {
        return this.f184020d.d(this.f184019c.d(hVar));
    }

    @Override // st.g2
    public d2 e(t0 t0Var) {
        d2 d2VarE = this.f184019c.e(t0Var);
        return d2VarE == null ? this.f184020d.e(t0Var) : d2VarE;
    }

    @Override // st.g2
    public boolean f() {
        return false;
    }

    @Override // st.g2
    public t0 g(t0 t0Var, p2 p2Var) {
        return this.f184020d.g(this.f184019c.g(t0Var, p2Var), p2Var);
    }

    private e0(g2 g2Var, g2 g2Var2) {
        this.f184019c = g2Var;
        this.f184020d = g2Var2;
    }
}
