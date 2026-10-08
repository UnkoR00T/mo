package w8;

import java.util.Objects;
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
final class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f210884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f210886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f210887e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x8.c f210889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f210890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q0 f210891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i9.q f210892j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f210883a = new c0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f210888f = -1;

    private void h() {
        ((r) zj.p.q(this.f210884b)).s();
        this.f210884b.f(new l0.b(-9223372036854775807L));
        this.f210885c = 6;
    }

    private static x8.c i(String str, long j15) {
        c cVarB;
        if (j15 == -1 || (cVarB = d.b(str)) == null) {
            return null;
        }
        return cVarB.a(j15);
    }

    private boolean j(c0 c0Var) {
        if (Objects.equals(c0Var.K(), "http://ns.adobe.com/xap/1.0/")) {
            return d.a(c0Var.K());
        }
        return false;
    }

    private void k(x8.c cVar) {
        ((r) zj.p.q(this.f210884b)).v(1024, 4).e(new t7.p.b().X("image/jpeg").s0(new v(cVar)).Q());
    }

    private int l(q qVar) {
        this.f210883a.b0(2);
        qVar.p(this.f210883a.f(), 0, 2);
        return this.f210883a.Y();
    }

    private int m(q qVar) {
        this.f210883a.b0(2);
        qVar.p(this.f210883a.f(), 0, 2);
        return this.f210883a.Y() - 2;
    }

    private void n(q qVar) {
        this.f210883a.b0(2);
        qVar.readFully(this.f210883a.f(), 0, 2);
        int iY = this.f210883a.Y();
        this.f210886d = iY;
        if (iY == 65498) {
            if (this.f210888f != -1) {
                this.f210885c = 4;
                return;
            } else {
                h();
                return;
            }
        }
        if ((iY < 65488 || iY > 65497) && iY != 65281) {
            this.f210885c = 1;
        }
    }

    private void o(q qVar) {
        String strK;
        if (this.f210886d == 65505) {
            c0 c0Var = new c0(this.f210887e);
            qVar.readFully(c0Var.f(), 0, this.f210887e);
            if (this.f210889g == null && "http://ns.adobe.com/xap/1.0/".equals(c0Var.K()) && (strK = c0Var.K()) != null) {
                x8.c cVarI = i(strK, qVar.a());
                this.f210889g = cVarI;
                if (cVarI != null) {
                    this.f210888f = cVarI.f40392d;
                }
            }
        } else {
            qVar.n(this.f210887e);
        }
        this.f210885c = 0;
    }

    private void p(q qVar) {
        this.f210887e = m(qVar);
        qVar.n(2);
        this.f210885c = 2;
    }

    private void q(q qVar) {
        if (!qVar.e(this.f210883a.f(), 0, 1, true)) {
            h();
            return;
        }
        qVar.g();
        if (this.f210892j == null) {
            this.f210892j = new i9.q(s.a.f117245a, 8);
        }
        q0 q0Var = new q0(qVar, this.f210888f);
        this.f210891i = q0Var;
        if (!this.f210892j.c(q0Var)) {
            h();
        } else {
            this.f210892j.d(new r0(this.f210888f, (r) zj.p.q(this.f210884b)));
            r();
        }
    }

    private void r() {
        k((x8.c) zj.p.q(this.f210889g));
        this.f210885c = 5;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        if (j15 == 0) {
            this.f210885c = 0;
            this.f210892j = null;
        } else if (this.f210885c == 5) {
            ((i9.q) zj.p.q(this.f210892j)).a(j15, j16);
        }
    }

    @Override // o8.p
    public void b() {
        i9.q qVar = this.f210892j;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // o8.p
    public boolean c(q qVar) {
        int iM;
        if (l(qVar) != 65496) {
            return false;
        }
        while (true) {
            int iL = l(qVar);
            this.f210886d = iL;
            if (iL == 65498 || (iM = m(qVar)) < 0) {
                break;
            }
            if (this.f210886d != 65505) {
                qVar.k(iM);
            } else {
                this.f210883a.b0(iM);
                qVar.p(this.f210883a.f(), 0, iM);
                if (j(this.f210883a)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f210884b = rVar;
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        int i15 = this.f210885c;
        if (i15 == 0) {
            n(qVar);
            return 0;
        }
        if (i15 == 1) {
            p(qVar);
            return 0;
        }
        if (i15 == 2) {
            o(qVar);
            return 0;
        }
        if (i15 == 4) {
            long position = qVar.getPosition();
            long j15 = this.f210888f;
            if (position != j15) {
                k0Var.f143128a = j15;
                return 1;
            }
            q(qVar);
            return 0;
        }
        if (i15 != 5) {
            if (i15 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f210891i == null || qVar != this.f210890h) {
            this.f210890h = qVar;
            this.f210891i = new q0(qVar, this.f210888f);
        }
        int iG = ((i9.q) zj.p.q(this.f210892j)).g(this.f210891i, k0Var);
        if (iG == 1) {
            k0Var.f143128a += this.f210888f;
        }
        return iG;
    }
}
