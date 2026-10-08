package a8;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements z2, a3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4232b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b3 f4234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b8.e2 f4236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w7.h f4237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4238h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h8.z0 f4239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t7.p[] f4240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f4241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4242m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4245q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h8.c0.b f4247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a3.a f4248t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4231a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1 f4233c = new y1();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f4243n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private t7.e0 f4246r = t7.e0.f188127a;

    public b(int i15) {
        this.f4232b = i15;
    }

    private void t0(long j15, boolean z15, boolean z16) {
        this.f4244p = false;
        this.f4242m = j15;
        this.f4243n = j15;
        if (!z16) {
            z16 = u0(j15) != 0;
        }
        k0(j15, z15, z16);
    }

    @Override // a8.x2.b
    public void A(int i15, Object obj) {
    }

    @Override // a8.z2
    public final void B() {
        ((h8.z0) zj.p.q(this.f4239j)).a();
    }

    @Override // a8.z2
    public final boolean E() {
        return this.f4244p;
    }

    @Override // a8.z2
    public final void G(b3 b3Var, t7.p[] pVarArr, h8.z0 z0Var, long j15, boolean z15, boolean z16, long j16, long j17, h8.c0.b bVar) {
        zj.p.w(this.f4238h == 0);
        this.f4234d = b3Var;
        this.f4247s = bVar;
        this.f4238h = 1;
        i0(z15, z16);
        q(pVarArr, z0Var, j16, j17, bVar);
        t0(j16, z15, true);
    }

    @Override // a8.z2
    public final void L(long j15, boolean z15) {
        t0(j15, false, z15);
    }

    @Override // a8.z2
    public final a3 M() {
        return this;
    }

    @Override // a8.z2
    public final void P(int i15, b8.e2 e2Var, w7.h hVar) {
        this.f4235e = i15;
        this.f4236f = e2Var;
        this.f4237g = hVar;
        j0();
    }

    @Override // a8.a3
    public int Q() {
        return 0;
    }

    @Override // a8.z2
    public final long R() {
        return this.f4243n;
    }

    @Override // a8.z2
    public c2 S() {
        return null;
    }

    protected final w U(Throwable th4, t7.p pVar, int i15) {
        return V(th4, pVar, false, i15);
    }

    protected final w V(Throwable th4, t7.p pVar, boolean z15, int i15) {
        int iT;
        if (pVar == null || this.f4245q) {
            iT = 4;
        } else {
            this.f4245q = true;
            try {
                iT = a3.T(a(pVar));
                this.f4245q = false;
            } catch (w unused) {
                this.f4245q = false;
                iT = 4;
            } catch (Throwable th5) {
                this.f4245q = false;
                throw th5;
            }
        }
        return w.b(th4, getName(), Z(), pVar, iT, this.f4247s, z15, i15);
    }

    protected final w7.h W() {
        return (w7.h) zj.p.q(this.f4237g);
    }

    protected final b3 X() {
        return (b3) zj.p.q(this.f4234d);
    }

    protected final y1 Y() {
        this.f4233c.a();
        return this.f4233c;
    }

    protected final int Z() {
        return this.f4235e;
    }

    protected final long a0() {
        return this.f4242m;
    }

    @Override // a8.z2
    public final void b() {
        zj.p.w(this.f4238h == 0);
        l0();
    }

    protected final h8.c0.b b0() {
        return this.f4247s;
    }

    @Override // a8.z2
    public final void c() {
        zj.p.w(this.f4238h == 1);
        this.f4233c.a();
        this.f4238h = 0;
        this.f4239j = null;
        this.f4240k = null;
        this.f4244p = false;
        h0();
        this.f4247s = null;
    }

    protected final b8.e2 c0() {
        return (b8.e2) zj.p.q(this.f4236f);
    }

    protected final t7.p[] d0() {
        return (t7.p[]) zj.p.q(this.f4240k);
    }

    protected final long e0() {
        return this.f4241l;
    }

    protected final t7.e0 f0() {
        return this.f4246r;
    }

    @Override // a8.z2, a8.a3
    public final int g() {
        return this.f4232b;
    }

    protected final boolean g0() {
        return n() ? this.f4244p : ((h8.z0) zj.p.q(this.f4239j)).f();
    }

    @Override // a8.z2
    public final int getState() {
        return this.f4238h;
    }

    protected abstract void h0();

    protected void i0(boolean z15, boolean z16) {
    }

    @Override // a8.z2
    public final h8.z0 j() {
        return this.f4239j;
    }

    protected void j0() {
    }

    @Override // a8.a3
    public final void k() {
        synchronized (this.f4231a) {
            this.f4248t = null;
        }
    }

    protected abstract void k0(long j15, boolean z15, boolean z16);

    @Override // a8.z2
    public final void l(t7.e0 e0Var) {
        if (Objects.equals(this.f4246r, e0Var)) {
            return;
        }
        this.f4246r = e0Var;
        r0(e0Var);
    }

    protected void l0() {
    }

    protected final void m0() {
        a3.a aVar;
        synchronized (this.f4231a) {
            aVar = this.f4248t;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // a8.z2
    public final boolean n() {
        return this.f4243n == Long.MIN_VALUE;
    }

    protected void n0() {
    }

    protected void o0() {
    }

    protected void p0() {
    }

    @Override // a8.z2
    public final void q(t7.p[] pVarArr, h8.z0 z0Var, long j15, long j16, h8.c0.b bVar) {
        zj.p.w(!this.f4244p);
        this.f4239j = z0Var;
        this.f4247s = bVar;
        if (this.f4243n == Long.MIN_VALUE) {
            this.f4243n = j15;
        }
        this.f4240k = pVarArr;
        this.f4241l = j16;
        q0(pVarArr, j15, j16, bVar);
    }

    protected void q0(t7.p[] pVarArr, long j15, long j16, h8.c0.b bVar) {
    }

    protected void r0(t7.e0 e0Var) {
    }

    @Override // a8.z2
    public final void reset() {
        zj.p.w(this.f4238h == 0);
        this.f4233c.a();
        n0();
    }

    @Override // a8.z2
    public final void s() {
        this.f4244p = true;
    }

    protected final int s0(y1 y1Var, z7.f fVar, int i15) {
        int iB = ((h8.z0) zj.p.q(this.f4239j)).b(y1Var, fVar, i15);
        if (iB != -4) {
            if (iB == -5) {
                t7.p pVar = (t7.p) zj.p.q(y1Var.f4794b);
                if (pVar.f188386u != Long.MAX_VALUE) {
                    y1Var.f4794b = pVar.b().E0(pVar.f188386u + this.f4241l).Q();
                }
            }
            return iB;
        }
        if (fVar.p()) {
            this.f4243n = Long.MIN_VALUE;
            return this.f4244p ? -4 : -3;
        }
        long j15 = fVar.f233230f + this.f4241l;
        fVar.f233230f = j15;
        this.f4243n = Math.max(this.f4243n, j15);
        return iB;
    }

    @Override // a8.z2
    public final void start() {
        zj.p.w(this.f4238h == 1);
        this.f4238h = 2;
        o0();
    }

    @Override // a8.z2
    public final void stop() {
        zj.p.w(this.f4238h == 2);
        this.f4238h = 1;
        p0();
    }

    @Override // a8.a3
    public final void u(a3.a aVar) {
        synchronized (this.f4231a) {
            this.f4248t = aVar;
        }
    }

    protected int u0(long j15) {
        return ((h8.z0) zj.p.q(this.f4239j)).c(j15 - this.f4241l);
    }
}
