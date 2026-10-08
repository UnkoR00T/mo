package v9;

import java.util.Collections;
import o8.s0;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f205213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f205214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f205215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.c0 f205216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.b0 f205217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f205218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f205219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t7.p f205220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f205221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f205222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f205223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f205224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f205225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f205226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f205227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f205228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f205229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f205230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f205231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f205232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f205233u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f205234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f205235w;

    public s(String str, int i15, String str2) {
        this.f205213a = str;
        this.f205214b = i15;
        this.f205215c = str2;
        w7.c0 c0Var = new w7.c0(1024);
        this.f205216d = c0Var;
        this.f205217e = new w7.b0(c0Var.f());
        this.f205225m = -9223372036854775807L;
    }

    private static long a(w7.b0 b0Var) {
        return b0Var.h((b0Var.h(2) + 1) * 8);
    }

    private void g(w7.b0 b0Var) throws t7.x {
        if (!b0Var.g()) {
            this.f205226n = true;
            l(b0Var);
        } else if (!this.f205226n) {
            return;
        }
        if (this.f205227o != 0) {
            throw t7.x.a(null, null);
        }
        if (this.f205228p != 0) {
            throw t7.x.a(null, null);
        }
        k(b0Var, j(b0Var));
        if (this.f205230r) {
            b0Var.r((int) this.f205231s);
        }
    }

    private int h(w7.b0 b0Var) throws t7.x {
        int iB = b0Var.b();
        o8.a.b bVarD = o8.a.d(b0Var, true);
        this.f205235w = bVarD.f143004c;
        this.f205232t = bVarD.f143002a;
        this.f205234v = bVarD.f143003b;
        return iB - b0Var.b();
    }

    private void i(w7.b0 b0Var) {
        int iH = b0Var.h(3);
        this.f205229q = iH;
        if (iH == 0) {
            b0Var.r(8);
            return;
        }
        if (iH == 1) {
            b0Var.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            b0Var.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            b0Var.r(1);
        }
    }

    private int j(w7.b0 b0Var) throws t7.x {
        int iH;
        if (this.f205229q != 0) {
            throw t7.x.a(null, null);
        }
        int i15 = 0;
        do {
            iH = b0Var.h(8);
            i15 += iH;
        } while (iH == 255);
        return i15;
    }

    private void k(w7.b0 b0Var, int i15) {
        int iE = b0Var.e();
        if ((iE & 7) == 0) {
            this.f205216d.f0(iE >> 3);
        } else {
            b0Var.i(this.f205216d.f(), 0, i15 * 8);
            this.f205216d.f0(0);
        }
        this.f205218f.a(this.f205216d, i15);
        zj.p.w(this.f205225m != -9223372036854775807L);
        this.f205218f.c(this.f205225m, 1, i15, 0, null);
        this.f205225m += this.f205233u;
    }

    private void l(w7.b0 b0Var) throws t7.x {
        boolean zG;
        int iH = b0Var.h(1);
        int iH2 = iH == 1 ? b0Var.h(1) : 0;
        this.f205227o = iH2;
        if (iH2 != 0) {
            throw t7.x.a(null, null);
        }
        if (iH == 1) {
            a(b0Var);
        }
        if (!b0Var.g()) {
            throw t7.x.a(null, null);
        }
        this.f205228p = b0Var.h(6);
        int iH3 = b0Var.h(4);
        int iH4 = b0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw t7.x.a(null, null);
        }
        if (iH == 0) {
            int iE = b0Var.e();
            int iH5 = h(b0Var);
            b0Var.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            b0Var.i(bArr, 0, iH5);
            t7.p pVarQ = new t7.p.b().k0(this.f205219g).X(this.f205215c).A0("audio/mp4a-latm").V(this.f205235w).U(this.f205234v).B0(this.f205232t).l0(Collections.singletonList(bArr)).o0(this.f205213a).y0(this.f205214b).Q();
            if (!pVarQ.equals(this.f205220h)) {
                this.f205220h = pVarQ;
                this.f205233u = 1024000000 / ((long) pVarQ.I);
                this.f205218f.e(pVarQ);
            }
        } else {
            b0Var.r(((int) a(b0Var)) - h(b0Var));
        }
        i(b0Var);
        boolean zG2 = b0Var.g();
        this.f205230r = zG2;
        this.f205231s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f205231s = a(b0Var);
            } else {
                do {
                    zG = b0Var.g();
                    this.f205231s = (this.f205231s << 8) + ((long) b0Var.h(8));
                } while (zG);
            }
        }
        if (b0Var.g()) {
            b0Var.r(8);
        }
    }

    private void m(int i15) {
        this.f205216d.b0(i15);
        this.f205217e.n(this.f205216d.f());
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) throws t7.x {
        zj.p.q(this.f205218f);
        while (c0Var.a() > 0) {
            int i15 = this.f205221i;
            if (i15 != 0) {
                if (i15 == 1) {
                    int iQ = c0Var.Q();
                    if ((iQ & BERTags.FLAGS) == 224) {
                        this.f205224l = iQ;
                        this.f205221i = 2;
                    } else if (iQ != 86) {
                        this.f205221i = 0;
                    }
                } else if (i15 == 2) {
                    int iQ2 = ((this.f205224l & (-225)) << 8) | c0Var.Q();
                    this.f205223k = iQ2;
                    if (iQ2 > this.f205216d.f().length) {
                        m(this.f205223k);
                    }
                    this.f205222j = 0;
                    this.f205221i = 3;
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(c0Var.a(), this.f205223k - this.f205222j);
                    c0Var.u(this.f205217e.f210609a, this.f205222j, iMin);
                    int i16 = this.f205222j + iMin;
                    this.f205222j = i16;
                    if (i16 == this.f205223k) {
                        this.f205217e.p(0);
                        g(this.f205217e);
                        this.f205221i = 0;
                    }
                }
            } else if (c0Var.Q() == 86) {
                this.f205221i = 1;
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f205221i = 0;
        this.f205225m = -9223372036854775807L;
        this.f205226n = false;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205218f = rVar.v(dVar.c(), 1);
        this.f205219g = dVar.b();
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205225m = j15;
    }
}
