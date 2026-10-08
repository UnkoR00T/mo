package m8;

import t7.m0;

/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f124490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f124491b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v f124496g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f124501l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u.a f124492c = new u.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.j0<m0> f124493d = new w7.j0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.j0<Long> f124494e = new w7.j0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w7.v f124495f = new w7.v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f124497h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m0 f124500k = m0.f188329e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f124498i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f124499j = -9223372036854775807L;

    interface a {
        void a(m0 m0Var);

        void b();

        void c(long j15, long j16, boolean z15);
    }

    public y(a aVar, u uVar, v vVar) {
        this.f124490a = aVar;
        this.f124491b = uVar;
        this.f124496g = vVar;
    }

    private void a() {
        this.f124495f.f();
        this.f124490a.b();
    }

    private static <T> T c(w7.j0<T> j0Var) {
        zj.p.d(j0Var.k() > 0);
        while (j0Var.k() > 1) {
            j0Var.h();
        }
        return (T) zj.p.q(j0Var.h());
    }

    private boolean e(long j15) {
        Long lI = this.f124494e.i(j15);
        if (lI == null || lI.longValue() == this.f124501l) {
            return false;
        }
        this.f124501l = lI.longValue();
        return true;
    }

    private boolean f(long j15) {
        m0 m0VarI = this.f124493d.i(j15);
        if (m0VarI == null || m0VarI.equals(m0.f188329e) || m0VarI.equals(this.f124500k)) {
            return false;
        }
        this.f124500k = m0VarI;
        return true;
    }

    private void k(boolean z15) {
        long jF = this.f124495f.f();
        if (f(jF)) {
            this.f124490a.a(this.f124500k);
        }
        this.f124490a.c(z15 ? w7.h.f210683a.c() : this.f124492c.g(), jF, this.f124491b.g());
    }

    public void b() {
        this.f124495f.b();
        this.f124497h = -9223372036854775807L;
        this.f124498i = -9223372036854775807L;
        this.f124499j = -9223372036854775807L;
        if (this.f124494e.k() > 0) {
            this.f124501l = ((Long) c(this.f124494e)).longValue();
        }
        if (this.f124493d.k() > 0) {
            this.f124493d.a(0L, (m0) c(this.f124493d));
        }
    }

    public boolean d() {
        long j15 = this.f124499j;
        return j15 != -9223372036854775807L && this.f124498i == j15;
    }

    public void g(long j15) {
        this.f124495f.a(j15);
        this.f124497h = j15;
        this.f124499j = -9223372036854775807L;
    }

    public void h(int i15, long j15) {
        if (this.f124495f.e()) {
            this.f124491b.j(i15);
            this.f124501l = j15;
        } else {
            w7.j0<Long> j0Var = this.f124494e;
            long j16 = this.f124497h;
            j0Var.a(j16 == -9223372036854775807L ? -4611686018427387904L : j16 + 1, Long.valueOf(j15));
        }
    }

    public void i(int i15, int i16) {
        w7.j0<m0> j0Var = this.f124493d;
        long j15 = this.f124497h;
        j0Var.a(j15 == -9223372036854775807L ? 0L : j15 + 1, new m0(i15, i16));
    }

    public void j(long j15, long j16) {
        while (!this.f124495f.e()) {
            long jD = this.f124495f.d();
            if (e(jD)) {
                this.f124491b.j(2);
            }
            int iC = this.f124491b.c(jD, j15, j16, this.f124501l, false, false, this.f124492c);
            if (iC != 5 && iC != 4) {
                this.f124496g.b(jD, this.f124492c.f());
            }
            if (iC == 0 || iC == 1) {
                this.f124498i = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f124498i = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f124498i = jD;
            }
        }
    }

    public void l() {
        if (this.f124497h == -9223372036854775807L) {
            this.f124497h = Long.MIN_VALUE;
            this.f124498i = Long.MIN_VALUE;
        }
        this.f124499j = this.f124497h;
    }
}
