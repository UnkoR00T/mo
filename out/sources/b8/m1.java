package b8;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class m1 implements b8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.h f17422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.e0.b f17423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t7.e0.c f17424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f17425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b.a> f17426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w7.s<b> f17427f = new w7.s<>(w7.o0.T());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t7.a0 f17428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w7.p f17429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17430i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t7.e0.b f17431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ak.n0<h8.c0.b> f17432b = ak.n0.C();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ak.p0<h8.c0.b, t7.e0> f17433c = ak.p0.m();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h8.c0.b f17434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h8.c0.b f17435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h8.c0.b f17436f;

        public a(t7.e0.b bVar) {
            this.f17431a = bVar;
        }

        private void b(ak.p0.a<h8.c0.b, t7.e0> aVar, h8.c0.b bVar, t7.e0 e0Var) {
            if (bVar == null) {
                return;
            }
            if (e0Var.b(bVar.f81468a) != -1) {
                aVar.g(bVar, e0Var);
                return;
            }
            t7.e0 e0Var2 = this.f17433c.get(bVar);
            if (e0Var2 != null) {
                aVar.g(bVar, e0Var2);
            }
        }

        private static h8.c0.b c(t7.a0 a0Var, ak.n0<h8.c0.b> n0Var, h8.c0.b bVar, t7.e0.b bVar2) {
            t7.e0 e0VarR = a0Var.r();
            int iV = a0Var.v();
            Object objM = e0VarR.q() ? null : e0VarR.m(iV);
            int iD = (a0Var.c() || e0VarR.q()) ? -1 : e0VarR.f(iV, bVar2).d(w7.o0.J0(a0Var.G()) - bVar2.o());
            for (int i15 = 0; i15 < n0Var.size(); i15++) {
                h8.c0.b bVar3 = n0Var.get(i15);
                if (i(bVar3, objM, a0Var.c(), a0Var.o(), a0Var.x(), iD)) {
                    return bVar3;
                }
            }
            if (n0Var.isEmpty() && bVar != null && i(bVar, objM, a0Var.c(), a0Var.o(), a0Var.x(), iD)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(h8.c0.b bVar, Object obj, boolean z15, int i15, int i16, int i17) {
            if (!bVar.f81468a.equals(obj)) {
                return false;
            }
            if (z15 && bVar.f81469b == i15 && bVar.f81470c == i16) {
                return true;
            }
            return !z15 && bVar.f81469b == -1 && bVar.f81472e == i17;
        }

        private void m(t7.e0 e0Var) {
            ak.p0.a<h8.c0.b, t7.e0> aVarA = ak.p0.a();
            if (this.f17432b.isEmpty()) {
                b(aVarA, this.f17435e, e0Var);
                if (!Objects.equals(this.f17436f, this.f17435e)) {
                    b(aVarA, this.f17436f, e0Var);
                }
                if (!Objects.equals(this.f17434d, this.f17435e) && !Objects.equals(this.f17434d, this.f17436f)) {
                    b(aVarA, this.f17434d, e0Var);
                }
            } else {
                for (int i15 = 0; i15 < this.f17432b.size(); i15++) {
                    b(aVarA, this.f17432b.get(i15), e0Var);
                }
                if (!this.f17432b.contains(this.f17434d)) {
                    b(aVarA, this.f17434d, e0Var);
                }
            }
            this.f17433c = aVarA.d();
        }

        public h8.c0.b d() {
            return this.f17434d;
        }

        public h8.c0.b e() {
            if (this.f17432b.isEmpty()) {
                return null;
            }
            return (h8.c0.b) ak.x0.f(this.f17432b);
        }

        public t7.e0 f(h8.c0.b bVar) {
            return this.f17433c.get(bVar);
        }

        public h8.c0.b g() {
            return this.f17435e;
        }

        public h8.c0.b h() {
            return this.f17436f;
        }

        public void j(t7.a0 a0Var) {
            this.f17434d = c(a0Var, this.f17432b, this.f17435e, this.f17431a);
        }

        public void k(List<h8.c0.b> list, h8.c0.b bVar, t7.a0 a0Var) {
            this.f17432b = ak.n0.v(list);
            if (!list.isEmpty()) {
                this.f17435e = list.get(0);
                this.f17436f = (h8.c0.b) zj.p.q(bVar);
            }
            if (this.f17434d == null) {
                this.f17434d = c(a0Var, this.f17432b, this.f17435e, this.f17431a);
            }
            m(a0Var.r());
        }

        public void l(t7.a0 a0Var) {
            this.f17434d = c(a0Var, this.f17432b, this.f17435e, this.f17431a);
            m(a0Var.r());
        }
    }

    public m1(w7.h hVar) {
        this.f17422a = (w7.h) zj.p.q(hVar);
        t7.e0.b bVar = new t7.e0.b();
        this.f17423b = bVar;
        this.f17424c = new t7.e0.c();
        this.f17425d = new a(bVar);
        this.f17426e = new SparseArray<>();
    }

    public static /* synthetic */ void B0(b.a aVar, t7.m0 m0Var, b bVar) {
        bVar.d(aVar, m0Var);
        bVar.k(aVar, m0Var.f188333a, m0Var.f188334b, 0, m0Var.f188336d);
    }

    private b.a B1(h8.c0.b bVar) {
        zj.p.q(this.f17428g);
        t7.e0 e0VarF = bVar == null ? null : this.f17425d.f(bVar);
        if (bVar != null && e0VarF != null) {
            return C1(e0VarF, e0VarF.h(bVar.f81468a, this.f17423b).f188138c, bVar);
        }
        int iD = this.f17428g.D();
        t7.e0 e0VarR = this.f17428g.r();
        if (iD >= e0VarR.p()) {
            e0VarR = t7.e0.f188127a;
        }
        return C1(e0VarR, iD, null);
    }

    public static /* synthetic */ void C0(b.a aVar, h8.x xVar, h8.a0 a0Var, int i15, b bVar) {
        bVar.i0(aVar, xVar, a0Var);
        bVar.k0(aVar, xVar, a0Var, i15);
    }

    private b.a D1() {
        return B1(this.f17425d.e());
    }

    private b.a E1(int i15, h8.c0.b bVar) {
        zj.p.q(this.f17428g);
        if (bVar != null) {
            return this.f17425d.f(bVar) != null ? B1(bVar) : C1(t7.e0.f188127a, i15, bVar);
        }
        t7.e0 e0VarR = this.f17428g.r();
        if (i15 >= e0VarR.p()) {
            e0VarR = t7.e0.f188127a;
        }
        return C1(e0VarR, i15, null);
    }

    private b.a F1() {
        return B1(this.f17425d.g());
    }

    private b.a G1() {
        return B1(this.f17425d.h());
    }

    private b.a H1(t7.y yVar) {
        h8.c0.b bVar;
        return (!(yVar instanceof a8.w) || (bVar = ((a8.w) yVar).f4674q) == null) ? A1() : B1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1() {
        final b.a aVarA1 = A1();
        J1(aVarA1, 1028, new w7.s.a() { // from class: b8.c0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).K(aVarA1);
            }
        });
        this.f17427f.i();
    }

    public static /* synthetic */ void P0(b.a aVar, boolean z15, b bVar) {
        bVar.z(aVar, z15);
        bVar.J(aVar, z15);
    }

    public static /* synthetic */ void Y0(b.a aVar, int i15, t7.a0.e eVar, t7.a0.e eVar2, b bVar) {
        bVar.q0(aVar, i15);
        bVar.P(aVar, eVar, eVar2, i15);
    }

    public static /* synthetic */ void i1(b.a aVar, String str, long j15, long j16, b bVar) {
        bVar.a(aVar, str, j15);
        bVar.M(aVar, str, j16, j15);
    }

    public static /* synthetic */ void m1(b.a aVar, d8.h0 h0Var, b bVar) {
        bVar.n0(aVar);
        bVar.F(aVar, h0Var);
    }

    public static /* synthetic */ void s0(b.a aVar, String str, long j15, long j16, b bVar) {
        bVar.p(aVar, str, j15);
        bVar.s0(aVar, str, j16, j15);
    }

    public static /* synthetic */ void t0(b.a aVar, int i15, b bVar) {
        bVar.W(aVar);
        bVar.A(aVar, i15);
    }

    @Override // t7.a0.d
    public final void A(final t7.v vVar) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 28, new w7.s.a() { // from class: b8.f
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).h(aVarA1, vVar);
            }
        });
    }

    protected final b.a A1() {
        return B1(this.f17425d.d());
    }

    @Override // b8.a
    public final void B(final long j15, final int i15) {
        final b.a aVarF1 = F1();
        J1(aVarF1, 1021, new w7.s.a() { // from class: b8.h0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).N(aVarF1, j15, i15);
            }
        });
    }

    @Override // t7.a0.d
    public final void C(final int i15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 6, new w7.s.a() { // from class: b8.i
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).D(aVarA1, i15);
            }
        });
    }

    protected final b.a C1(t7.e0 e0Var, int i15, h8.c0.b bVar) {
        h8.c0.b bVar2 = e0Var.q() ? null : bVar;
        long jB = this.f17422a.b();
        boolean z15 = e0Var.equals(this.f17428g.r()) && i15 == this.f17428g.D();
        long jB2 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z15) {
                jB2 = this.f17428g.y();
            } else if (!e0Var.q()) {
                jB2 = e0Var.n(i15, this.f17424c).b();
            }
        } else if (z15 && this.f17428g.o() == bVar2.f81469b && this.f17428g.x() == bVar2.f81470c) {
            jB2 = this.f17428g.G();
        }
        return new b.a(jB, e0Var, i15, bVar2, jB2, this.f17428g.r(), this.f17428g.D(), this.f17425d.d(), this.f17428g.G(), this.f17428g.e());
    }

    @Override // d8.t
    public final void D(int i15, h8.c0.b bVar) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1026, new w7.s.a() { // from class: b8.e1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).f0(aVarE1);
            }
        });
    }

    @Override // t7.a0.d
    public void E(boolean z15) {
    }

    @Override // t7.a0.d
    public final void F(t7.e0 e0Var, final int i15) {
        this.f17425d.l((t7.a0) zj.p.q(this.f17428g));
        final b.a aVarA1 = A1();
        J1(aVarA1, 0, new w7.s.a() { // from class: b8.j1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).i(aVarA1, i15);
            }
        });
    }

    @Override // h8.j0
    public final void G(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var, final int i16) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1000, new w7.s.a() { // from class: b8.b0
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.C0(aVarE1, xVar, a0Var, i16, (b) obj);
            }
        });
    }

    @Override // h8.j0
    public final void H(int i15, h8.c0.b bVar, final h8.a0 a0Var) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1004, new w7.s.a() { // from class: b8.z
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).a0(aVarE1, a0Var);
            }
        });
    }

    @Override // h8.j0
    public final void I(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var, final IOException iOException, final boolean z15) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1003, new w7.s.a() { // from class: b8.e0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).p0(aVarE1, xVar, a0Var, iOException, z15);
            }
        });
    }

    @Override // t7.a0.d
    public void J(final t7.k kVar) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 29, new w7.s.a() { // from class: b8.l0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).x(aVarA1, kVar);
            }
        });
    }

    protected final void J1(b.a aVar, int i15, w7.s.a<b> aVar2) {
        this.f17426e.put(i15, aVar);
        this.f17427f.k(i15, aVar2);
    }

    @Override // t7.a0.d
    public void K(t7.a0 a0Var, t7.a0.c cVar) {
    }

    @Override // t7.a0.d
    public final void L(final t7.s sVar, final int i15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 1, new w7.s.a() { // from class: b8.k1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).o(aVarA1, sVar, i15);
            }
        });
    }

    @Override // t7.a0.d
    public final void M(final int i15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 4, new w7.s.a() { // from class: b8.r
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).u(aVarA1, i15);
            }
        });
    }

    @Override // h8.j0
    public final void N(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1001, new w7.s.a() { // from class: b8.m0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).v(aVarE1, xVar, a0Var);
            }
        });
    }

    @Override // k8.d.a
    public final void O(final int i15, final long j15, final long j16) {
        final b.a aVarD1 = D1();
        J1(aVarD1, 1006, new w7.s.a() { // from class: b8.w0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).l0(aVarD1, i15, j15, j16);
            }
        });
    }

    @Override // b8.a
    public final void P() {
        if (this.f17430i) {
            return;
        }
        final b.a aVarA1 = A1();
        this.f17430i = true;
        J1(aVarA1, -1, new w7.s.a() { // from class: b8.s
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).b0(aVarA1);
            }
        });
    }

    @Override // t7.a0.d
    public final void Q(final t7.a0.e eVar, final t7.a0.e eVar2, final int i15) {
        if (i15 == 1) {
            this.f17430i = false;
        }
        this.f17425d.j((t7.a0) zj.p.q(this.f17428g));
        final b.a aVarA1 = A1();
        J1(aVarA1, 11, new w7.s.a() { // from class: b8.t
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.Y0(aVarA1, i15, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // t7.a0.d
    public void R(final t7.a0.b bVar) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 13, new w7.s.a() { // from class: b8.i1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).m(aVarA1, bVar);
            }
        });
    }

    @Override // t7.a0.d
    public void S(final int i15, final boolean z15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 30, new w7.s.a() { // from class: b8.g0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).c0(aVarA1, i15, z15);
            }
        });
    }

    @Override // t7.a0.d
    public void T(final t7.y yVar) {
        final b.a aVarH1 = H1(yVar);
        J1(aVarH1, 10, new w7.s.a() { // from class: b8.k
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).X(aVarH1, yVar);
            }
        });
    }

    @Override // b8.a
    public final void U(List<h8.c0.b> list, h8.c0.b bVar) {
        this.f17425d.k(list, bVar, (t7.a0) zj.p.q(this.f17428g));
    }

    @Override // t7.a0.d
    public void V() {
    }

    @Override // d8.t
    public final void W(int i15, h8.c0.b bVar, final Exception exc) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1024, new w7.s.a() { // from class: b8.b1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).G(aVarE1, exc);
            }
        });
    }

    @Override // b8.a
    public void X(final int i15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 1034, new w7.s.a() { // from class: b8.p
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).e(aVarA1, i15);
            }
        });
    }

    @Override // t7.a0.d
    public final void Y(final int i15, final int i16) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 24, new w7.s.a() { // from class: b8.x
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).t0(aVarG1, i15, i16);
            }
        });
    }

    @Override // t7.a0.d
    public void Z(int i15) {
    }

    @Override // t7.a0.d
    public final void a(final t7.m0 m0Var) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 25, new w7.s.a() { // from class: b8.q0
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.B0(aVarG1, m0Var, (b) obj);
            }
        });
    }

    @Override // b8.a
    public void b() {
        ((w7.p) zj.p.q(this.f17429h)).j(new Runnable() { // from class: b8.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f17486a.I1();
            }
        });
    }

    @Override // d8.t
    public void b0(int i15, h8.c0.b bVar, final d8.h0 h0Var) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1023, new w7.s.a() { // from class: b8.d1
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.m1(aVarE1, h0Var, (b) obj);
            }
        });
    }

    @Override // t7.a0.d
    public final void c(final int i15) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 21, new w7.s.a() { // from class: b8.p0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).q(aVarG1, i15);
            }
        });
    }

    @Override // t7.a0.d
    public final void c0(final boolean z15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 3, new w7.s.a() { // from class: b8.u0
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.P0(aVarA1, z15, (b) obj);
            }
        });
    }

    @Override // t7.a0.d
    public final void d(final boolean z15) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 23, new w7.s.a() { // from class: b8.x0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).r0(aVarG1, z15);
            }
        });
    }

    @Override // d8.t
    public final void d0(int i15, h8.c0.b bVar, final int i16) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1022, new w7.s.a() { // from class: b8.a1
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.t0(aVarE1, i16, (b) obj);
            }
        });
    }

    @Override // b8.a
    public final void e(final Exception exc) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1014, new w7.s.a() { // from class: b8.v0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).g0(aVarG1, exc);
            }
        });
    }

    @Override // b8.a
    public void e0(final t7.a0 a0Var, Looper looper) {
        zj.p.w(this.f17428g == null || this.f17425d.f17432b.isEmpty());
        this.f17428g = (t7.a0) zj.p.q(a0Var);
        this.f17429h = this.f17422a.e(looper, null);
        this.f17427f = this.f17427f.d(looper, this.f17422a, new w7.s.b() { // from class: b8.d
            @Override // w7.s.b
            public final void a(Object obj, t7.n nVar) {
                b bVar = (b) obj;
                bVar.n(a0Var, new b.C0423b(nVar, this.f17346a.f17426e));
            }
        });
    }

    @Override // b8.a
    public void f(final c8.a0.a aVar) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1032, new w7.s.a() { // from class: b8.h1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).s(aVarG1, aVar);
            }
        });
    }

    @Override // t7.a0.d
    public final void f0(final t7.y yVar) {
        final b.a aVarH1 = H1(yVar);
        J1(aVarH1, 10, new w7.s.a() { // from class: b8.q
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).L(aVarH1, yVar);
            }
        });
    }

    @Override // b8.a
    public void g(final c8.a0.a aVar) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1031, new w7.s.a() { // from class: b8.o0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).l(aVarG1, aVar);
            }
        });
    }

    @Override // b8.a
    public void g0(final int i15, final int i16, final boolean z15) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1033, new w7.s.a() { // from class: b8.m
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).o0(aVarG1, i15, i16, z15);
            }
        });
    }

    @Override // b8.a
    public final void h(final t7.p pVar, final a8.f fVar) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1017, new w7.s.a() { // from class: b8.n0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).u0(aVarG1, pVar, fVar);
            }
        });
    }

    @Override // t7.a0.d
    public final void h0(final boolean z15, final int i15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, -1, new w7.s.a() { // from class: b8.e
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).c(aVarA1, z15, i15);
            }
        });
    }

    @Override // b8.a
    public final void i(final String str) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1019, new w7.s.a() { // from class: b8.j
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).C(aVarG1, str);
            }
        });
    }

    @Override // t7.a0.d
    public void i0(final t7.u uVar) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 14, new w7.s.a() { // from class: b8.j0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).S(aVarA1, uVar);
            }
        });
    }

    @Override // b8.a
    public final void j(final String str, final long j15, final long j16) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1016, new w7.s.a() { // from class: b8.w
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.s0(aVarG1, str, j16, j15, (b) obj);
            }
        });
    }

    @Override // t7.a0.d
    public final void j0(final boolean z15, final int i15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 5, new w7.s.a() { // from class: b8.l
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).d0(aVarA1, z15, i15);
            }
        });
    }

    @Override // b8.a
    public final void k(final t7.p pVar, final a8.f fVar) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1009, new w7.s.a() { // from class: b8.r0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).Q(aVarG1, pVar, fVar);
            }
        });
    }

    @Override // t7.a0.d
    public void k0(final t7.i0 i0Var) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 2, new w7.s.a() { // from class: b8.n
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).y(aVarA1, i0Var);
            }
        });
    }

    @Override // t7.a0.d
    public void l(final v7.c cVar) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 27, new w7.s.a() { // from class: b8.y
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).f(aVarA1, cVar);
            }
        });
    }

    @Override // d8.t
    public final void l0(int i15, h8.c0.b bVar) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1025, new w7.s.a() { // from class: b8.g1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).V(aVarE1);
            }
        });
    }

    @Override // b8.a
    public final void m(final String str) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1012, new w7.s.a() { // from class: b8.f1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).g(aVarG1, str);
            }
        });
    }

    @Override // d8.t
    public final void m0(int i15, h8.c0.b bVar) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1027, new w7.s.a() { // from class: b8.c1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).j(aVarE1);
            }
        });
    }

    @Override // b8.a
    public final void n(final String str, final long j15, final long j16) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1008, new w7.s.a() { // from class: b8.h
            @Override // w7.s.a
            public final void b(Object obj) {
                m1.i1(aVarG1, str, j16, j15, (b) obj);
            }
        });
    }

    @Override // h8.j0
    public final void n0(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var) {
        final b.a aVarE1 = E1(i15, bVar);
        J1(aVarE1, 1002, new w7.s.a() { // from class: b8.i0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).O(aVarE1, xVar, a0Var);
            }
        });
    }

    @Override // b8.a
    public final void o(final a8.e eVar) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1007, new w7.s.a() { // from class: b8.d0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).E(aVarG1, eVar);
            }
        });
    }

    @Override // b8.a
    public void o0(b bVar) {
        zj.p.q(bVar);
        this.f17427f.c(bVar);
    }

    @Override // t7.a0.d
    public void p(final List<v7.a> list) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 27, new w7.s.a() { // from class: b8.o
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).U(aVarA1, list);
            }
        });
    }

    @Override // t7.a0.d
    public void p0(final boolean z15) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 7, new w7.s.a() { // from class: b8.g
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).Z(aVarA1, z15);
            }
        });
    }

    @Override // b8.a
    public final void q(final long j15) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1010, new w7.s.a() { // from class: b8.z0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).e0(aVarG1, j15);
            }
        });
    }

    @Override // b8.a
    public final void r(final Exception exc) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1030, new w7.s.a() { // from class: b8.l1
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).r(aVarG1, exc);
            }
        });
    }

    @Override // b8.a
    public final void s(final a8.e eVar) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1015, new w7.s.a() { // from class: b8.s0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).t(aVarG1, eVar);
            }
        });
    }

    @Override // b8.a
    public final void t(final a8.e eVar) {
        final b.a aVarF1 = F1();
        J1(aVarF1, 1013, new w7.s.a() { // from class: b8.k0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).m0(aVarF1, eVar);
            }
        });
    }

    @Override // t7.a0.d
    public final void u(final t7.z zVar) {
        final b.a aVarA1 = A1();
        J1(aVarA1, 12, new w7.s.a() { // from class: b8.c
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).j0(aVarA1, zVar);
            }
        });
    }

    @Override // b8.a
    public final void v(final a8.e eVar) {
        final b.a aVarF1 = F1();
        J1(aVarF1, 1020, new w7.s.a() { // from class: b8.a0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).w(aVarF1, eVar);
            }
        });
    }

    @Override // b8.a
    public final void w(final int i15, final long j15) {
        final b.a aVarF1 = F1();
        J1(aVarF1, 1018, new w7.s.a() { // from class: b8.f0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).B(aVarF1, i15, j15);
            }
        });
    }

    @Override // b8.a
    public final void x(final Object obj, final long j15) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 26, new w7.s.a() { // from class: b8.t0
            @Override // w7.s.a
            public final void b(Object obj2) {
                ((b) obj2).T(aVarG1, obj, j15);
            }
        });
    }

    @Override // b8.a
    public final void y(final Exception exc) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1029, new w7.s.a() { // from class: b8.v
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).R(aVarG1, exc);
            }
        });
    }

    @Override // b8.a
    public final void z(final int i15, final long j15, final long j16) {
        final b.a aVarG1 = G1();
        J1(aVarG1, 1011, new w7.s.a() { // from class: b8.y0
            @Override // w7.s.a
            public final void b(Object obj) {
                ((b) obj).H(aVarG1, i15, j15, j16);
            }
        });
    }
}
