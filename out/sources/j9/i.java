package j9;

import o8.k0;
import o8.l0;
import o8.q;
import o8.r;
import o8.s0;
import t7.p;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f100379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f100380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f100381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f100382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f100383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f100384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f100386i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f100388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f100389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f100390m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f100378a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f100387j = new b();

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        p f100391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f100392b;

        b() {
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // j9.g
        public long a(q qVar) {
            return -1L;
        }

        @Override // j9.g
        public l0 b() {
            return new l0.b(-9223372036854775807L);
        }

        @Override // j9.g
        public void c(long j15) {
        }
    }

    private void a() {
        zj.p.q(this.f100379b);
        o0.h(this.f100380c);
    }

    private boolean h(q qVar) {
        while (this.f100378a.d(qVar)) {
            this.f100388k = qVar.getPosition() - this.f100383f;
            if (!i(this.f100378a.c(), this.f100383f, this.f100387j)) {
                return true;
            }
            this.f100383f = qVar.getPosition();
        }
        this.f100385h = 3;
        return false;
    }

    private int j(q qVar) {
        if (!h(qVar)) {
            return -1;
        }
        p pVar = this.f100387j.f100391a;
        this.f100386i = pVar.I;
        if (!this.f100390m) {
            this.f100379b.e(pVar);
            this.f100390m = true;
        }
        g gVar = this.f100387j.f100392b;
        if (gVar != null) {
            this.f100381d = gVar;
        } else if (qVar.a() == -1) {
            this.f100381d = new c();
        } else {
            f fVarB = this.f100378a.b();
            this.f100381d = new j9.a(this, this.f100383f, qVar.a(), fVarB.f100371h + fVarB.f100372i, fVarB.f100366c, (fVarB.f100365b & 4) != 0);
        }
        this.f100385h = 2;
        this.f100378a.f();
        return 0;
    }

    private int k(q qVar, k0 k0Var) {
        long jA = this.f100381d.a(qVar);
        if (jA >= 0) {
            k0Var.f143128a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f100389l) {
            l0 l0Var = (l0) zj.p.q(this.f100381d.b());
            this.f100380c.f(l0Var);
            this.f100379b.d(l0Var.h());
            this.f100389l = true;
        }
        if (this.f100388k <= 0 && !this.f100378a.d(qVar)) {
            this.f100385h = 3;
            return -1;
        }
        this.f100388k = 0L;
        c0 c0VarC = this.f100378a.c();
        long jF = f(c0VarC);
        if (jF >= 0) {
            long j15 = this.f100384g;
            if (j15 + jF >= this.f100382e) {
                long jB = b(j15);
                this.f100379b.a(c0VarC, c0VarC.j());
                this.f100379b.c(jB, 1, c0VarC.j(), 0, null);
                this.f100382e = -1L;
            }
        }
        this.f100384g += jF;
        return 0;
    }

    protected long b(long j15) {
        return (j15 * 1000000) / ((long) this.f100386i);
    }

    protected long c(long j15) {
        return (((long) this.f100386i) * j15) / 1000000;
    }

    void d(r rVar, s0 s0Var) {
        this.f100380c = rVar;
        this.f100379b = s0Var;
        l(true);
    }

    protected void e(long j15) {
        this.f100384g = j15;
    }

    protected abstract long f(c0 c0Var);

    final int g(q qVar, k0 k0Var) {
        a();
        int i15 = this.f100385h;
        if (i15 == 0) {
            return j(qVar);
        }
        if (i15 == 1) {
            qVar.n((int) this.f100383f);
            this.f100385h = 2;
            return 0;
        }
        if (i15 == 2) {
            o0.h(this.f100381d);
            return k(qVar, k0Var);
        }
        if (i15 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean i(c0 c0Var, long j15, b bVar);

    protected void l(boolean z15) {
        if (z15) {
            this.f100387j = new b();
            this.f100383f = 0L;
            this.f100385h = 0;
        } else {
            this.f100385h = 1;
        }
        this.f100382e = -1L;
        this.f100384g = 0L;
    }

    final void m(long j15, long j16) {
        this.f100378a.e();
        if (j15 == 0) {
            l(!this.f100389l);
        } else if (this.f100385h != 0) {
            this.f100382e = c(j16);
            ((g) o0.h(this.f100381d)).c(this.f100382e);
            this.f100385h = 2;
        }
    }
}
