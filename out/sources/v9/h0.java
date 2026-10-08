package v9;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends o8.e {

    private static final class a implements o8.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w7.k0 f204967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w7.c0 f204968b = new w7.c0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f204969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f204970d;

        public a(int i15, w7.k0 k0Var, int i16) {
            this.f204969c = i15;
            this.f204967a = k0Var;
            this.f204970d = i16;
        }

        private o8.e.C3546e c(w7.c0 c0Var, long j15, long j16) {
            int iA;
            int iA2;
            int iJ = c0Var.j();
            long j17 = -1;
            long j18 = -1;
            long j19 = -9223372036854775807L;
            while (c0Var.a() >= 188 && (iA2 = (iA = m0.a(c0Var.f(), c0Var.g(), iJ)) + 188) <= iJ) {
                long jC = m0.c(c0Var, iA, this.f204969c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f204967a.b(jC);
                    if (jB > j15) {
                        return j19 == -9223372036854775807L ? o8.e.C3546e.d(jB, j16) : o8.e.C3546e.e(j16 + j18);
                    }
                    if (100000 + jB > j15) {
                        return o8.e.C3546e.e(j16 + ((long) iA));
                    }
                    j18 = iA;
                    j19 = jB;
                }
                c0Var.f0(iA2);
                j17 = iA2;
            }
            return j19 != -9223372036854775807L ? o8.e.C3546e.f(j19, j16 + j17) : o8.e.C3546e.f143064d;
        }

        @Override // o8.e.f
        public o8.e.C3546e a(o8.q qVar, long j15) {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(this.f204970d, qVar.a() - position);
            this.f204968b.b0(iMin);
            qVar.p(this.f204968b.f(), 0, iMin);
            return c(this.f204968b, j15, position);
        }

        @Override // o8.e.f
        public void b() {
            this.f204968b.c0(w7.o0.f210729f);
        }
    }

    public h0(w7.k0 k0Var, long j15, long j16, int i15, int i16) {
        super(new o8.e.b(), new a(i15, k0Var, i16), j15, 0L, j15 + 1, 0L, j16, 188L, 940);
    }
}
