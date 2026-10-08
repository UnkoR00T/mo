package v8;

import l9.s;
import o8.k0;
import o8.l0;
import o8.p;
import o8.q;
import o8.q0;
import o8.r;
import o8.r0;
import t7.v;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class a implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f204406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x8.c f204407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f204408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q0 f204409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i9.q f204410f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f204412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f204413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f204414j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f204405a = new c0(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f204415k = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f204411g = 0;

    private void h() {
        ((r) zj.p.q(this.f204406b)).s();
        this.f204406b.f(new l0.b(-9223372036854775807L));
        this.f204411g = 4;
    }

    private void i(x8.c cVar) {
        ((r) zj.p.q(this.f204406b)).v(1024, 4).e(new t7.p.b().X("image/heic").s0(new v(cVar)).Q());
    }

    private boolean j(q qVar) {
        if (this.f204414j == 0) {
            if (!qVar.h(this.f204405a.f(), 0, 8, true)) {
                return false;
            }
            this.f204414j = 8;
            this.f204405a.f0(0);
            this.f204413i = this.f204405a.S();
            this.f204412h = this.f204405a.z();
        }
        if (this.f204413i == 1) {
            qVar.readFully(this.f204405a.f(), 8, 8);
            this.f204414j += 8;
            this.f204413i = this.f204405a.X();
        }
        if (this.f204412h == 1836086884) {
            long position = qVar.getPosition();
            this.f204415k = position;
            int i15 = this.f204414j;
            x8.c cVar = new x8.c(0L, position - ((long) i15), -9223372036854775807L, position, this.f204413i - ((long) i15));
            this.f204407c = cVar;
            i(cVar);
            this.f204411g = 2;
        } else {
            this.f204411g = 1;
        }
        return true;
    }

    private void k(q qVar) {
        qVar.n((int) (this.f204413i - ((long) this.f204414j)));
        this.f204414j = 0;
        this.f204411g = 0;
    }

    private int l(q qVar, k0 k0Var) {
        if (this.f204409e == null || qVar != this.f204408d) {
            this.f204408d = qVar;
            this.f204409e = new q0(qVar, this.f204415k);
        }
        int iG = ((i9.q) zj.p.q(this.f204410f)).g(this.f204409e, k0Var);
        if (iG == 1) {
            k0Var.f143128a += this.f204415k;
        }
        return iG;
    }

    private void m(q qVar) {
        if (this.f204410f == null) {
            this.f204410f = new i9.q(s.a.f117245a, 8);
        }
        q0 q0Var = new q0(qVar, this.f204415k);
        this.f204409e = q0Var;
        if (!this.f204410f.c(q0Var)) {
            h();
        } else {
            this.f204410f.d(new r0(this.f204415k, (r) zj.p.q(this.f204406b)));
            this.f204411g = 3;
        }
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        if (j15 != 0) {
            if (this.f204411g == 3) {
                ((i9.q) zj.p.q(this.f204410f)).a(j15, j16);
                return;
            }
            return;
        }
        this.f204411g = 0;
        this.f204414j = 0;
        this.f204415k = -1L;
        i9.q qVar = this.f204410f;
        if (qVar != null) {
            qVar.b();
            this.f204410f = null;
        }
    }

    @Override // o8.p
    public void b() {
        i9.q qVar = this.f204410f;
        if (qVar != null) {
            qVar.b();
            this.f204410f = null;
        }
    }

    @Override // o8.p
    public boolean c(q qVar) {
        return c.a(qVar, true);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f204406b = rVar;
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        while (true) {
            int i15 = this.f204411g;
            if (i15 != 0) {
                if (i15 == 1) {
                    k(qVar);
                } else {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            return l(qVar, k0Var);
                        }
                        if (i15 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    m(qVar);
                }
            } else if (!j(qVar)) {
                h();
                return -1;
            }
        }
    }
}
