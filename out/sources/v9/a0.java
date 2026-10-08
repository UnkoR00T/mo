package v9;

/* JADX INFO: loaded from: classes3.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f204880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f204881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f204882e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.k0 f204878a = new w7.k0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f204883f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f204884g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f204885h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f204879b = new w7.c0();

    a0() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(o8.q qVar) {
        this.f204879b.c0(w7.o0.f210729f);
        this.f204880c = true;
        qVar.g();
        return 0;
    }

    private int f(byte[] bArr, int i15) {
        return (bArr[i15 + 3] & 255) | ((bArr[i15] & 255) << 24) | ((bArr[i15 + 1] & 255) << 16) | ((bArr[i15 + 2] & 255) << 8);
    }

    private int h(o8.q qVar, o8.k0 k0Var) {
        int iMin = (int) Math.min(20000L, qVar.a());
        long j15 = 0;
        if (qVar.getPosition() != j15) {
            k0Var.f143128a = j15;
            return 1;
        }
        this.f204879b.b0(iMin);
        qVar.g();
        qVar.p(this.f204879b.f(), 0, iMin);
        this.f204883f = i(this.f204879b);
        this.f204881d = true;
        return 0;
    }

    private long i(w7.c0 c0Var) {
        int iJ = c0Var.j();
        for (int iG = c0Var.g(); iG < iJ - 3; iG++) {
            if (f(c0Var.f(), iG) == 442) {
                c0Var.f0(iG + 4);
                long jL = l(c0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(o8.q qVar, o8.k0 k0Var) {
        long jA = qVar.a();
        int iMin = (int) Math.min(20000L, jA);
        long j15 = jA - ((long) iMin);
        if (qVar.getPosition() != j15) {
            k0Var.f143128a = j15;
            return 1;
        }
        this.f204879b.b0(iMin);
        qVar.g();
        qVar.p(this.f204879b.f(), 0, iMin);
        this.f204884g = k(this.f204879b);
        this.f204882e = true;
        return 0;
    }

    private long k(w7.c0 c0Var) {
        int iG = c0Var.g();
        for (int iJ = c0Var.j() - 4; iJ >= iG; iJ--) {
            if (f(c0Var.f(), iJ) == 442) {
                c0Var.f0(iJ + 4);
                long jL = l(c0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(w7.c0 c0Var) {
        int iG = c0Var.g();
        if (c0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c0Var.u(bArr, 0, 9);
        c0Var.f0(iG);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b15 = bArr[0];
        long j15 = (((((long) b15) & 56) >> 3) << 30) | ((((long) b15) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b16 = bArr[2];
        return j15 | (((((long) b16) & 248) >> 3) << 15) | ((((long) b16) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f204885h;
    }

    public w7.k0 d() {
        return this.f204878a;
    }

    public boolean e() {
        return this.f204880c;
    }

    public int g(o8.q qVar, o8.k0 k0Var) {
        if (!this.f204882e) {
            return j(qVar, k0Var);
        }
        if (this.f204884g == -9223372036854775807L) {
            return b(qVar);
        }
        if (!this.f204881d) {
            return h(qVar, k0Var);
        }
        long j15 = this.f204883f;
        if (j15 == -9223372036854775807L) {
            return b(qVar);
        }
        this.f204885h = this.f204878a.c(this.f204884g) - this.f204878a.b(j15);
        return b(qVar);
    }
}
