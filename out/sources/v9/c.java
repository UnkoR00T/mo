package v9;

import java.util.Objects;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.b0 f204890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f204891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f204892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f204893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f204894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f204895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f204896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f204897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f204898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f204899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f204900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t7.p f204901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f204902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f204903n;

    public c(String str) {
        this(null, 0, str);
    }

    private boolean a(w7.c0 c0Var, byte[] bArr, int i15) {
        int iMin = Math.min(c0Var.a(), i15 - this.f204898i);
        c0Var.u(bArr, this.f204898i, iMin);
        int i16 = this.f204898i + iMin;
        this.f204898i = i16;
        return i16 == i15;
    }

    private void g() {
        this.f204890a.p(0);
        o8.b.C3544b c3544bF = o8.b.f(this.f204890a);
        t7.p pVar = this.f204901l;
        if (pVar == null || c3544bF.f143015d != pVar.H || c3544bF.f143014c != pVar.I || !Objects.equals(c3544bF.f143012a, pVar.f188381p)) {
            t7.p.b bVarU0 = new t7.p.b().k0(this.f204895f).X(this.f204894e).A0(c3544bF.f143012a).U(c3544bF.f143015d).B0(c3544bF.f143014c).o0(this.f204892c).y0(this.f204893d).u0(c3544bF.f143018g);
            if ("audio/ac3".equals(c3544bF.f143012a)) {
                bVarU0.T(c3544bF.f143018g);
            }
            t7.p pVarQ = bVarU0.Q();
            this.f204901l = pVarQ;
            this.f204896g.e(pVarQ);
        }
        this.f204902m = c3544bF.f143016e;
        this.f204900k = (((long) c3544bF.f143017f) * 1000000) / ((long) this.f204901l.I);
    }

    private boolean h(w7.c0 c0Var) {
        while (true) {
            if (c0Var.a() <= 0) {
                return false;
            }
            if (this.f204899j) {
                int iQ = c0Var.Q();
                if (iQ == 119) {
                    this.f204899j = false;
                    return true;
                }
                this.f204899j = iQ == 11;
            } else {
                this.f204899j = c0Var.Q() == 11;
            }
        }
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        zj.p.q(this.f204896g);
        while (c0Var.a() > 0) {
            int i15 = this.f204897h;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        int iMin = Math.min(c0Var.a(), this.f204902m - this.f204898i);
                        this.f204896g.a(c0Var, iMin);
                        int i16 = this.f204898i + iMin;
                        this.f204898i = i16;
                        if (i16 == this.f204902m) {
                            zj.p.w(this.f204903n != -9223372036854775807L);
                            this.f204896g.c(this.f204903n, 1, this.f204902m, 0, null);
                            this.f204903n += this.f204900k;
                            this.f204897h = 0;
                        }
                    }
                } else if (a(c0Var, this.f204891b.f(), 128)) {
                    g();
                    this.f204891b.f0(0);
                    this.f204896g.a(this.f204891b, 128);
                    this.f204897h = 2;
                }
            } else if (h(c0Var)) {
                this.f204897h = 1;
                this.f204891b.f()[0] = 11;
                this.f204891b.f()[1] = 119;
                this.f204898i = 2;
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f204897h = 0;
        this.f204898i = 0;
        this.f204899j = false;
        this.f204903n = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f204895f = dVar.b();
        this.f204896g = rVar.v(dVar.c(), 1);
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f204903n = j15;
    }

    public c(String str, int i15, String str2) {
        w7.b0 b0Var = new w7.b0(new byte[128]);
        this.f204890a = b0Var;
        this.f204891b = new w7.c0(b0Var.f210609a);
        this.f204897h = 0;
        this.f204903n = -9223372036854775807L;
        this.f204892c = str;
        this.f204893d = i15;
        this.f204894e = str2;
    }
}
