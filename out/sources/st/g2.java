package st;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f184038a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g2 f184039b = new a();

    public static final class a extends g2 {
        a() {
        }

        @Override // st.g2
        public /* bridge */ /* synthetic */ d2 e(t0 t0Var) {
            return (d2) i(t0Var);
        }

        @Override // st.g2
        public boolean f() {
            return true;
        }

        public Void i(t0 t0Var) {
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends g2 {
        c() {
        }

        @Override // st.g2
        public boolean a() {
            return false;
        }

        @Override // st.g2
        public boolean b() {
            return false;
        }

        @Override // st.g2
        public wr.h d(wr.h hVar) {
            return g2.this.d(hVar);
        }

        @Override // st.g2
        public d2 e(t0 t0Var) {
            return g2.this.e(t0Var);
        }

        @Override // st.g2
        public boolean f() {
            return g2.this.f();
        }

        @Override // st.g2
        public t0 g(t0 t0Var, p2 p2Var) {
            return g2.this.g(t0Var, p2Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final i2 c() {
        return i2.h(this);
    }

    public wr.h d(wr.h hVar) {
        return hVar;
    }

    public abstract d2 e(t0 t0Var);

    public boolean f() {
        return false;
    }

    public t0 g(t0 t0Var, p2 p2Var) {
        return t0Var;
    }

    public final g2 h() {
        return new c();
    }
}
