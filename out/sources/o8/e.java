package o8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f143045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f143046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f143047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f143048d;

    public static class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f143049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f143050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f143051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f143052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f143053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f143054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f143055g;

        public a(d dVar, long j15, long j16, long j17, long j18, long j19, long j25) {
            this.f143049a = dVar;
            this.f143050b = j15;
            this.f143051c = j16;
            this.f143052d = j17;
            this.f143053e = j18;
            this.f143054f = j19;
            this.f143055g = j25;
        }

        @Override // o8.l0
        public l0.a c(long j15) {
            return new l0.a(new m0(j15, c.h(this.f143049a.a(j15), this.f143051c, this.f143052d, this.f143053e, this.f143054f, this.f143055g)));
        }

        @Override // o8.l0
        public boolean e() {
            return true;
        }

        @Override // o8.l0
        public long h() {
            return this.f143050b;
        }

        public long n(long j15) {
            return this.f143049a.a(j15);
        }
    }

    public static final class b implements d {
        @Override // o8.e.d
        public long a(long j15) {
            return j15;
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f143056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f143057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f143058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f143059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f143060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f143061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f143062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f143063h;

        protected c(long j15, long j16, long j17, long j18, long j19, long j25, long j26) {
            this.f143056a = j15;
            this.f143057b = j16;
            this.f143059d = j17;
            this.f143060e = j18;
            this.f143061f = j19;
            this.f143062g = j25;
            this.f143058c = j26;
            this.f143063h = h(j16, j17, j18, j19, j25, j26);
        }

        protected static long h(long j15, long j16, long j17, long j18, long j19, long j25) {
            if (j18 + 1 >= j19 || j16 + 1 >= j17) {
                return j18;
            }
            long j26 = (long) ((j15 - j16) * ((j19 - j18) / (j17 - j16)));
            return w7.o0.p(((j26 + j18) - j25) - (j26 / 20), j18, j19 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f143062g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f143061f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f143063h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f143056a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f143057b;
        }

        private void n() {
            this.f143063h = h(this.f143057b, this.f143059d, this.f143060e, this.f143061f, this.f143062g, this.f143058c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j15, long j16) {
            this.f143060e = j15;
            this.f143062g = j16;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j15, long j16) {
            this.f143059d = j15;
            this.f143061f = j16;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long a(long j15);
    }

    /* JADX INFO: renamed from: o8.e$e, reason: collision with other inner class name */
    public static final class C3546e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C3546e f143064d = new C3546e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f143065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f143066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f143067c;

        private C3546e(int i15, long j15, long j16) {
            this.f143065a = i15;
            this.f143066b = j15;
            this.f143067c = j16;
        }

        public static C3546e d(long j15, long j16) {
            return new C3546e(-1, j15, j16);
        }

        public static C3546e e(long j15) {
            return new C3546e(0, -9223372036854775807L, j15);
        }

        public static C3546e f(long j15, long j16) {
            return new C3546e(-2, j15, j16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {
        C3546e a(q qVar, long j15);

        default void b() {
        }
    }

    protected e(d dVar, f fVar, long j15, long j16, long j17, long j18, long j19, long j25, int i15) {
        this.f143046b = fVar;
        this.f143048d = i15;
        this.f143045a = new a(dVar, j15, j16, j17, j18, j19, j25);
    }

    protected c a(long j15) {
        return new c(j15, this.f143045a.n(j15), this.f143045a.f143051c, this.f143045a.f143052d, this.f143045a.f143053e, this.f143045a.f143054f, this.f143045a.f143055g);
    }

    public final l0 b() {
        return this.f143045a;
    }

    public int c(q qVar, k0 k0Var) {
        while (true) {
            c cVar = (c) zj.p.q(this.f143047c);
            long j15 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j15 <= this.f143048d) {
                e(false, j15);
                return g(qVar, j15, k0Var);
            }
            if (!i(qVar, jK)) {
                return g(qVar, jK, k0Var);
            }
            qVar.g();
            C3546e c3546eA = this.f143046b.a(qVar, cVar.m());
            int i15 = c3546eA.f143065a;
            if (i15 == -3) {
                e(false, jK);
                return g(qVar, jK, k0Var);
            }
            if (i15 == -2) {
                cVar.p(c3546eA.f143066b, c3546eA.f143067c);
            } else {
                if (i15 != -1) {
                    if (i15 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(qVar, c3546eA.f143067c);
                    e(true, c3546eA.f143067c);
                    return g(qVar, c3546eA.f143067c, k0Var);
                }
                cVar.o(c3546eA.f143066b, c3546eA.f143067c);
            }
        }
    }

    public final boolean d() {
        return this.f143047c != null;
    }

    protected final void e(boolean z15, long j15) {
        this.f143047c = null;
        this.f143046b.b();
        f(z15, j15);
    }

    protected void f(boolean z15, long j15) {
    }

    protected final int g(q qVar, long j15, k0 k0Var) {
        if (j15 == qVar.getPosition()) {
            return 0;
        }
        k0Var.f143128a = j15;
        return 1;
    }

    public final void h(long j15) {
        c cVar = this.f143047c;
        if (cVar == null || cVar.l() != j15) {
            this.f143047c = a(j15);
        }
    }

    protected final boolean i(q qVar, long j15) {
        long position = j15 - qVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        qVar.n((int) position);
        return true;
    }
}
