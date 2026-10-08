package st;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends k0 implements x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f184070e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f184071f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f184072d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public l0(e1 e1Var, e1 e1Var2) {
        super(e1Var, e1Var2);
    }

    private final void f1() {
        if (!f184071f || this.f184072d) {
            return;
        }
        this.f184072d = true;
        n0.b(b1());
        n0.b(c1());
        fr.t.c(b1(), c1());
        tt.e.f192117a.b(b1(), c1());
    }

    @Override // st.x
    public boolean I0() {
        return (b1().T0().c() instanceof vr.m1) && fr.t.c(b1().T0(), c1().T0());
    }

    @Override // st.x
    public t0 M0(t0 t0Var) {
        o2 o2VarE;
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof k0) {
            o2VarE = o2VarW0;
        } else {
            if (!(o2VarW0 instanceof e1)) {
                throw new oq.p();
            }
            e1 e1Var = (e1) o2VarW0;
            o2VarE = w0.e(e1Var, e1Var.X0(true));
        }
        return n2.b(o2VarE, o2VarW0);
    }

    @Override // st.o2
    public o2 X0(boolean z15) {
        return w0.e(b1().X0(z15), c1().X0(z15));
    }

    @Override // st.o2
    public o2 Z0(t1 t1Var) {
        return w0.e(b1().Z0(t1Var), c1().Z0(t1Var));
    }

    @Override // st.k0
    public e1 a1() {
        f1();
        return b1();
    }

    @Override // st.k0
    public String d1(ct.n nVar, ct.y yVar) {
        if (!yVar.i()) {
            return nVar.P(nVar.S(b1()), nVar.S(c1()), xt.d.n(this));
        }
        return '(' + nVar.S(b1()) + ".." + nVar.S(c1()) + ')';
    }

    @Override // st.o2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public k0 d1(tt.g gVar) {
        return new l0((e1) gVar.a(b1()), (e1) gVar.a(c1()));
    }

    @Override // st.k0
    public String toString() {
        return '(' + b1() + ".." + c1() + ')';
    }
}
