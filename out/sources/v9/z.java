package v9;

/* JADX INFO: loaded from: classes3.dex */
final class z extends o8.e {

    private static final class b implements o8.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w7.k0 f205299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w7.c0 f205300b;

        private o8.e.C3546e c(w7.c0 c0Var, long j15, long j16) {
            int iG = -1;
            int iG2 = -1;
            long j17 = -9223372036854775807L;
            while (c0Var.a() >= 4) {
                if (z.k(c0Var.f(), c0Var.g()) != 442) {
                    c0Var.g0(1);
                } else {
                    c0Var.g0(4);
                    long jL = a0.l(c0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f205299a.b(jL);
                        if (jB > j15) {
                            return j17 == -9223372036854775807L ? o8.e.C3546e.d(jB, j16) : o8.e.C3546e.e(j16 + ((long) iG2));
                        }
                        if (100000 + jB > j15) {
                            return o8.e.C3546e.e(j16 + ((long) c0Var.g()));
                        }
                        iG2 = c0Var.g();
                        j17 = jB;
                    }
                    d(c0Var);
                    iG = c0Var.g();
                }
            }
            return j17 != -9223372036854775807L ? o8.e.C3546e.f(j17, j16 + ((long) iG)) : o8.e.C3546e.f143064d;
        }

        private static void d(w7.c0 c0Var) {
            int iK;
            int iJ = c0Var.j();
            if (c0Var.a() < 10) {
                c0Var.f0(iJ);
                return;
            }
            c0Var.g0(9);
            int iQ = c0Var.Q() & 7;
            if (c0Var.a() < iQ) {
                c0Var.f0(iJ);
                return;
            }
            c0Var.g0(iQ);
            if (c0Var.a() < 4) {
                c0Var.f0(iJ);
                return;
            }
            if (z.k(c0Var.f(), c0Var.g()) == 443) {
                c0Var.g0(4);
                int iY = c0Var.Y();
                if (c0Var.a() < iY) {
                    c0Var.f0(iJ);
                    return;
                }
                c0Var.g0(iY);
            }
            while (c0Var.a() >= 4 && (iK = z.k(c0Var.f(), c0Var.g())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                c0Var.g0(4);
                if (c0Var.a() < 2) {
                    c0Var.f0(iJ);
                    return;
                }
                c0Var.f0(Math.min(c0Var.j(), c0Var.g() + c0Var.Y()));
            }
        }

        @Override // o8.e.f
        public o8.e.C3546e a(o8.q qVar, long j15) {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(20000L, qVar.a() - position);
            this.f205300b.b0(iMin);
            qVar.p(this.f205300b.f(), 0, iMin);
            return c(this.f205300b, j15, position);
        }

        @Override // o8.e.f
        public void b() {
            this.f205300b.c0(w7.o0.f210729f);
        }

        private b(w7.k0 k0Var) {
            this.f205299a = k0Var;
            this.f205300b = new w7.c0();
        }
    }

    public z(w7.k0 k0Var, long j15, long j16) {
        super(new o8.e.b(), new b(k0Var), j15, 0L, j15 + 1, 0L, j16, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i15) {
        return (bArr[i15 + 3] & 255) | ((bArr[i15] & 255) << 24) | ((bArr[i15 + 1] & 255) << 16) | ((bArr[i15 + 2] & 255) << 8);
    }
}
