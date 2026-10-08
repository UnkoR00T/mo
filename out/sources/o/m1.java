package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import v.b3;
import v.j3;
import v.n3;
import v.t2;
import v.u2;
import v.w3;
import v.x3;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends j2 {
    public static final b D = new b();
    private static final Executor E = z.a.d();
    h2 A;
    private g0.v0 B;
    private j3.c C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f140071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Executor f140072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    j3.b f140073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private v.u1 f140074y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g0.n0 f140075z;

    public static final class a implements w3.b<m1, b3, a>, v.f2.a<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u2 f140076a;

        public a() {
            this(u2.l0());
        }

        static a f(v.p1 p1Var) {
            return new a(u2.m0(p1Var));
        }

        @Override // o.j0
        public t2 a() {
            return this.f140076a;
        }

        public m1 e() {
            b3 b3VarD = d();
            v.f2.t(b3VarD);
            return new m1(b3VarD);
        }

        @Override // v.w3.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b3 d() {
            return new b3(z2.k0(this.f140076a));
        }

        public a h(x3.b bVar) {
            a().m(w3.L, bVar);
            return this;
        }

        public a i(i0 i0Var) {
            a().m(v.e2.f202559p, i0Var);
            return this;
        }

        public a j(boolean z15) {
            a().m(w3.K, Boolean.valueOf(z15));
            return this;
        }

        public a k(j0.c cVar) {
            a().m(v.f2.f202585y, cVar);
            return this;
        }

        public a l(int i15) {
            a().m(w3.E, Integer.valueOf(i15));
            return this;
        }

        @Deprecated
        public a m(int i15) {
            if (i15 == -1) {
                i15 = 0;
            }
            a().m(v.f2.f202577q, Integer.valueOf(i15));
            return this;
        }

        public a n(Class<m1> cls) {
            a().m(b0.r.f15616c, cls);
            if (a().f(b0.r.f15615b, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a o(String str) {
            a().m(b0.r.f15615b, str);
            return this;
        }

        @Override // v.f2.a
        @Deprecated
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a c(Size size) {
            a().m(v.f2.f202581u, size);
            return this;
        }

        @Override // v.f2.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a b(int i15) {
            a().m(v.f2.f202578r, Integer.valueOf(i15));
            a().m(v.f2.f202579s, Integer.valueOf(i15));
            return this;
        }

        private a(u2 u2Var) {
            this.f140076a = u2Var;
            Class cls = (Class) u2Var.f(b0.r.f15616c, null);
            if (cls != null && !cls.equals(m1.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            h(x3.b.PREVIEW);
            n(m1.class);
            v.p1.a<Integer> aVar = v.f2.f202580t;
            if (((Integer) u2Var.f(aVar, -1)).intValue() == -1) {
                u2Var.m(aVar, 2);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j0.c f140077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b3 f140078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final i0 f140079c;

        static {
            j0.c cVarA = new j0.c.a().d(j0.a.f98425c).f(j0.d.f98437c).a();
            f140077a = cVarA;
            i0 i0Var = i0.f140010c;
            f140079c = i0Var;
            f140078b = new a().l(2).m(0).k(cVarA).j(true).i(i0Var).d();
        }

        public b3 a() {
            return f140078b;
        }
    }

    public interface c {
        void a(h2 h2Var);
    }

    m1(b3 b3Var) {
        super(b3Var);
        this.f140072w = E;
    }

    public static /* synthetic */ void i0(m1 m1Var, j3 j3Var, j3.g gVar) {
        if (m1Var.i() == null) {
            return;
        }
        m1Var.v0((b3) m1Var.l(), m1Var.g());
        m1Var.M();
    }

    private void l0(j3.b bVar, n3 n3Var) {
        if (this.f140071v != null) {
            bVar.n(this.f140074y, n3Var.b(), s(), q());
        }
        j3.c cVar = this.C;
        if (cVar != null) {
            cVar.b();
        }
        j3.c cVar2 = new j3.c(new j3.d() { // from class: o.l1
            @Override // v.j3.d
            public final void a(j3 j3Var, j3.g gVar) {
                m1.i0(this.f140067a, j3Var, gVar);
            }
        });
        this.C = cVar2;
        bVar.r(cVar2);
    }

    private void m0() {
        j3.c cVar = this.C;
        if (cVar != null) {
            cVar.b();
            this.C = null;
        }
        v.u1 u1Var = this.f140074y;
        if (u1Var != null) {
            u1Var.d();
            this.f140074y = null;
        }
        g0.v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.f();
            this.B = null;
        }
        g0.n0 n0Var = this.f140075z;
        if (n0Var != null) {
            n0Var.i();
            this.f140075z = null;
        }
        h2 h2Var = this.A;
        if (h2Var != null) {
            h2Var.l();
        }
        this.A = null;
    }

    private j3.b n0(b3 b3Var, n3 n3Var) {
        y.w.b();
        v.n0 n0VarI = i();
        Objects.requireNonNull(n0VarI);
        final v.n0 n0Var = n0VarI;
        m0();
        i6.i.i(this.f140075z == null);
        Matrix matrixY = y();
        boolean zS = n0Var.s();
        Rect rectO0 = o0(n3Var.f());
        Objects.requireNonNull(rectO0);
        this.f140075z = new g0.n0(1, 34, n3Var, matrixY, zS, rectO0, u(n0Var, I(n0Var)), f(), u0(n0Var));
        k kVarN = n();
        if (kVarN != null) {
            this.B = new g0.v0(n0Var, kVarN.a(), "Preview");
            this.f140075z.e(new Runnable() { // from class: o.i1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140020a.M();
                }
            });
            i0.f fVarJ = i0.f.j(this.f140075z);
            g0.n0 n0Var2 = this.B.j(g0.v0.b.c(this.f140075z, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n0Var2);
            n0Var2.e(new Runnable() { // from class: o.j1
                @Override // java.lang.Runnable
                public final void run() {
                    m1 m1Var = this.f140022a;
                    m1Var.p0(m1Var.f140075z, n0Var);
                }
            });
            this.A = n0Var2.k(n0Var);
            this.f140074y = this.f140075z.o();
        } else {
            this.f140075z.e(new Runnable() { // from class: o.i1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140020a.M();
                }
            });
            h2 h2VarK = this.f140075z.k(n0Var);
            this.A = h2VarK;
            this.f140074y = h2VarK.n();
        }
        if (this.f140071v != null) {
            q0();
        }
        j3.b bVarP = j3.b.p(b3Var, n3Var.f());
        bVarP.x(n3Var.g());
        b(bVarP, n3Var);
        bVarP.w(b3Var.D());
        if (n3Var.d() != null) {
            bVarP.g(n3Var.d());
        }
        l0(bVarP, n3Var);
        return bVarP;
    }

    private Rect o0(Size size) {
        if (E() != null) {
            return E();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(g0.n0 n0Var, v.n0 n0Var2) {
        y.w.b();
        if (n0Var2 == i()) {
            n0Var.v();
        }
    }

    private void q0() {
        r0();
        final c cVar = (c) i6.i.g(this.f140071v);
        final h2 h2Var = (h2) i6.i.g(this.A);
        this.f140072w.execute(new Runnable() { // from class: o.k1
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(h2Var);
            }
        });
    }

    private void r0() {
        v.n0 n0VarI = i();
        g0.n0 n0Var = this.f140075z;
        if (n0VarI == null || n0Var == null) {
            return;
        }
        n0Var.z(u(n0VarI, I(n0VarI)), f());
    }

    private boolean u0(v.n0 n0Var) {
        return n0Var.s() && I(n0Var);
    }

    private void v0(b3 b3Var, n3 n3Var) {
        j3.b bVarN0 = n0(b3Var, n3Var);
        this.f140073x = bVarN0;
        f0(k0.a(new Object[]{bVarN0.o()}));
    }

    @Override // o.j2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // o.j2
    public w3.b<?, ?, ?> D(v.p1 p1Var) {
        return a.f(p1Var);
    }

    @Override // o.j2
    protected w3<?> Q(v.m0 m0Var, w3.b<?, ?, ?> bVar) {
        bVar.a().m(v.e2.f202557n, 34);
        return bVar.d();
    }

    @Override // o.j2
    protected n3 U(v.p1 p1Var) {
        this.f140073x.g(p1Var);
        f0(k0.a(new Object[]{this.f140073x.o()}));
        return g().i().d(p1Var).a();
    }

    @Override // o.j2
    protected n3 V(n3 n3Var, n3 n3Var2) {
        e1.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + n3Var + ", secondaryStreamSpec " + n3Var2);
        v0((b3) l(), n3Var);
        return n3Var;
    }

    @Override // o.j2
    public void W() {
        m0();
    }

    @Override // o.j2
    public void d0(Rect rect) {
        super.d0(rect);
        r0();
    }

    @Override // o.j2
    public w3<?> m(boolean z15, x3 x3Var) {
        b bVar = D;
        v.p1 p1VarA = x3Var.a(bVar.a().W(), 1);
        if (z15) {
            p1VarA = v.p1.u(p1VarA, bVar.a());
        }
        if (p1VarA == null) {
            return null;
        }
        return D(p1VarA).d();
    }

    public void s0(Executor executor, c cVar) {
        y.w.b();
        if (cVar == null) {
            this.f140071v = null;
            L();
            return;
        }
        this.f140071v = cVar;
        this.f140072w = executor;
        if (h() != null) {
            v0((b3) l(), g());
            M();
        }
        K();
    }

    public void t0(c cVar) {
        s0(E, cVar);
    }

    public String toString() {
        return "Preview:" + r();
    }
}
