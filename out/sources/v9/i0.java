package v9;

/* JADX INFO: loaded from: classes3.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f204995a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f204998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f204999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f205000f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.k0 f204996b = new w7.k0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f205001g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f205002h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f205003i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.c0 f204997c = new w7.c0();

    i0(int i15) {
        this.f204995a = i15;
    }

    private int a(o8.q qVar) {
        this.f204997c.c0(w7.o0.f210729f);
        this.f204998d = true;
        qVar.g();
        return 0;
    }

    private int f(o8.q qVar, o8.k0 k0Var, int i15) {
        int iMin = (int) Math.min(this.f204995a, qVar.a());
        long j15 = 0;
        if (qVar.getPosition() != j15) {
            k0Var.f143128a = j15;
            return 1;
        }
        this.f204997c.b0(iMin);
        qVar.g();
        qVar.p(this.f204997c.f(), 0, iMin);
        this.f205001g = g(this.f204997c, i15);
        this.f204999e = true;
        return 0;
    }

    private long g(w7.c0 c0Var, int i15) {
        int iJ = c0Var.j();
        for (int iG = c0Var.g(); iG < iJ; iG++) {
            if (c0Var.f()[iG] == 71) {
                long jC = m0.c(c0Var, iG, i15);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(o8.q qVar, o8.k0 k0Var, int i15) {
        long jA = qVar.a();
        int iMin = (int) Math.min(this.f204995a, jA);
        long j15 = jA - ((long) iMin);
        if (qVar.getPosition() != j15) {
            k0Var.f143128a = j15;
            return 1;
        }
        this.f204997c.b0(iMin);
        qVar.g();
        qVar.p(this.f204997c.f(), 0, iMin);
        this.f205002h = i(this.f204997c, i15);
        this.f205000f = true;
        return 0;
    }

    private long i(w7.c0 c0Var, int i15) {
        int iG = c0Var.g();
        int iJ = c0Var.j();
        for (int i16 = iJ - 188; i16 >= iG; i16--) {
            if (m0.b(c0Var.f(), iG, iJ, i16)) {
                long jC = m0.c(c0Var, i16, i15);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f205003i;
    }

    public w7.k0 c() {
        return this.f204996b;
    }

    public boolean d() {
        return this.f204998d;
    }

    public int e(o8.q qVar, o8.k0 k0Var, int i15) {
        if (i15 <= 0) {
            return a(qVar);
        }
        if (!this.f205000f) {
            return h(qVar, k0Var, i15);
        }
        if (this.f205002h == -9223372036854775807L) {
            return a(qVar);
        }
        if (!this.f204999e) {
            return f(qVar, k0Var, i15);
        }
        long j15 = this.f205001g;
        if (j15 == -9223372036854775807L) {
            return a(qVar);
        }
        this.f205003i = this.f204996b.c(this.f205002h) - this.f204996b.b(j15);
        return a(qVar);
    }
}
