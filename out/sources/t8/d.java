package t8;

import o8.k0;
import o8.l0;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import o8.u;
import o8.v;
import o8.w;
import o8.x;
import o8.y;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f188833o = new u() { // from class: t8.c
        @Override // o8.u
        public final p[] f() {
            return d.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f188834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f188835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f188836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f188837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f188838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f188839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f188840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t7.v f188841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f188842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f188843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f188844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f188845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f188846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f188847n;

    public d() {
        this(0);
    }

    public static /* synthetic */ p[] h() {
        return new p[]{new d()};
    }

    private long i(c0 c0Var, boolean z15) {
        boolean zD;
        zj.p.q(this.f188842i);
        int iG = c0Var.g();
        while (iG <= c0Var.j() - 16) {
            c0Var.f0(iG);
            if (v.d(c0Var, this.f188842i, this.f188844k, this.f188837d)) {
                c0Var.f0(iG);
                return this.f188837d.f143207a;
            }
            iG++;
        }
        if (!z15) {
            c0Var.f0(iG);
            return -1L;
        }
        while (iG <= c0Var.j() - this.f188843j) {
            c0Var.f0(iG);
            try {
                zD = v.d(c0Var, this.f188842i, this.f188844k, this.f188837d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (c0Var.g() <= c0Var.j() ? zD : false) {
                c0Var.f0(iG);
                return this.f188837d.f143207a;
            }
            iG++;
        }
        c0Var.f0(c0Var.j());
        return -1L;
    }

    private void j(q qVar) {
        this.f188844k = w.b(qVar);
        ((r) o0.h(this.f188838e)).f(k(qVar.getPosition(), qVar.a()));
        this.f188840g = 5;
    }

    private l0 k(long j15, long j16) {
        zj.p.q(this.f188842i);
        y yVar = this.f188842i;
        y.a aVar = yVar.f143242k;
        if (aVar != null && aVar.f143244a.length > 0) {
            return new x(yVar, j15);
        }
        if (j16 == -1 || yVar.f143241j <= 0) {
            return new l0.b(yVar.f());
        }
        b bVar = new b(yVar, this.f188844k, j15, j16);
        this.f188845l = bVar;
        return bVar.b();
    }

    private void l(q qVar) {
        byte[] bArr = this.f188834a;
        qVar.p(bArr, 0, bArr.length);
        qVar.g();
        this.f188840g = 2;
    }

    private void m() {
        ((s0) o0.h(this.f188839f)).c((this.f188847n * 1000000) / ((long) ((y) o0.h(this.f188842i)).f143236e), 1, this.f188846m, 0, null);
    }

    private int n(q qVar, k0 k0Var) {
        boolean z15;
        zj.p.q(this.f188839f);
        zj.p.q(this.f188842i);
        b bVar = this.f188845l;
        if (bVar != null && bVar.d()) {
            return this.f188845l.c(qVar, k0Var);
        }
        if (this.f188847n == -1) {
            this.f188847n = v.j(qVar, this.f188842i);
            return 0;
        }
        int iJ = this.f188835b.j();
        if (iJ < 32768) {
            int i15 = qVar.read(this.f188835b.f(), iJ, 32768 - iJ);
            z15 = i15 == -1;
            if (!z15) {
                this.f188835b.e0(iJ + i15);
            } else if (this.f188835b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z15 = false;
        }
        int iG = this.f188835b.g();
        int i16 = this.f188846m;
        int i17 = this.f188843j;
        if (i16 < i17) {
            c0 c0Var = this.f188835b;
            c0Var.g0(Math.min(i17 - i16, c0Var.a()));
        }
        long jI = i(this.f188835b, z15);
        int iG2 = this.f188835b.g() - iG;
        this.f188835b.f0(iG);
        this.f188839f.a(this.f188835b, iG2);
        this.f188846m += iG2;
        if (jI != -1) {
            m();
            this.f188846m = 0;
            this.f188847n = jI;
        }
        int length = this.f188835b.f().length - this.f188835b.j();
        if (this.f188835b.a() < 16 && length < 16) {
            int iA = this.f188835b.a();
            System.arraycopy(this.f188835b.f(), this.f188835b.g(), this.f188835b.f(), 0, iA);
            this.f188835b.f0(0);
            this.f188835b.e0(iA);
        }
        return 0;
    }

    private void o(q qVar) {
        this.f188841h = w.d(qVar, !this.f188836c);
        this.f188840g = 1;
    }

    private void p(q qVar) {
        w.a aVar = new w.a(this.f188842i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(qVar, aVar);
            this.f188842i = (y) o0.h(aVar.f143225a);
        }
        zj.p.q(this.f188842i);
        this.f188843j = Math.max(this.f188842i.f143234c, 6);
        ((s0) o0.h(this.f188839f)).e(this.f188842i.g(this.f188834a, this.f188841h).b().X("audio/flac").Q());
        ((s0) o0.h(this.f188839f)).d(this.f188842i.f());
        this.f188840g = 4;
    }

    private void q(q qVar) throws t7.x {
        w.i(qVar);
        this.f188840g = 3;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        if (j15 == 0) {
            this.f188840g = 0;
        } else {
            b bVar = this.f188845l;
            if (bVar != null) {
                bVar.h(j16);
            }
        }
        this.f188847n = j16 != 0 ? -1L : 0L;
        this.f188846m = 0;
        this.f188835b.b0(0);
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) throws Throwable {
        w.c(qVar, false);
        return w.a(qVar);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f188838e = rVar;
        this.f188839f = rVar.v(0, 1);
        rVar.s();
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) throws t7.x {
        int i15 = this.f188840g;
        if (i15 == 0) {
            o(qVar);
            return 0;
        }
        if (i15 == 1) {
            l(qVar);
            return 0;
        }
        if (i15 == 2) {
            q(qVar);
            return 0;
        }
        if (i15 == 3) {
            p(qVar);
            return 0;
        }
        if (i15 == 4) {
            j(qVar);
            return 0;
        }
        if (i15 == 5) {
            return n(qVar, k0Var);
        }
        throw new IllegalStateException();
    }

    public d(int i15) {
        this.f188834a = new byte[42];
        this.f188835b = new c0(new byte[32768], 0);
        this.f188836c = (i15 & 1) != 0;
        this.f188837d = new v.a();
        this.f188840g = 0;
    }
}
