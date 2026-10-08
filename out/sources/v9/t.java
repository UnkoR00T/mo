package v9;

import o8.s0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.c0 f205236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o8.i0.a f205237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f205238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f205239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f205240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f205241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f205242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f205243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f205244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f205245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f205246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f205247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f205248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f205249n;

    public t(String str) {
        this(null, 0, str);
    }

    private void a(w7.c0 c0Var) {
        byte[] bArrF = c0Var.f();
        int iJ = c0Var.j();
        for (int iG = c0Var.g(); iG < iJ; iG++) {
            byte b15 = bArrF[iG];
            boolean z15 = (b15 & 255) == 255;
            boolean z16 = this.f205246k && (b15 & 224) == 224;
            this.f205246k = z15;
            if (z16) {
                c0Var.f0(iG + 1);
                this.f205246k = false;
                this.f205236a.f()[1] = bArrF[iG];
                this.f205244i = 2;
                this.f205243h = 1;
                return;
            }
        }
        c0Var.f0(iJ);
    }

    private void g(w7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), this.f205248m - this.f205244i);
        this.f205241f.a(c0Var, iMin);
        int i15 = this.f205244i + iMin;
        this.f205244i = i15;
        if (i15 < this.f205248m) {
            return;
        }
        zj.p.w(this.f205249n != -9223372036854775807L);
        this.f205241f.c(this.f205249n, 1, this.f205248m, 0, null);
        this.f205249n += this.f205247l;
        this.f205244i = 0;
        this.f205243h = 0;
    }

    private void h(w7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), 4 - this.f205244i);
        c0Var.u(this.f205236a.f(), this.f205244i, iMin);
        int i15 = this.f205244i + iMin;
        this.f205244i = i15;
        if (i15 < 4) {
            return;
        }
        this.f205236a.f0(0);
        if (!this.f205237b.a(this.f205236a.z())) {
            this.f205244i = 0;
            this.f205243h = 1;
            return;
        }
        o8.i0.a aVar = this.f205237b;
        this.f205248m = aVar.f143116c;
        if (!this.f205245j) {
            this.f205247l = (((long) aVar.f143120g) * 1000000) / ((long) aVar.f143117d);
            this.f205241f.e(new t7.p.b().k0(this.f205242g).X(this.f205240e).A0(this.f205237b.f143115b).p0(PKIFailureInfo.certConfirmed).U(this.f205237b.f143118e).B0(this.f205237b.f143117d).o0(this.f205238c).y0(this.f205239d).Q());
            this.f205245j = true;
        }
        this.f205236a.f0(0);
        this.f205241f.a(this.f205236a, 4);
        this.f205243h = 2;
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        zj.p.q(this.f205241f);
        while (c0Var.a() > 0) {
            int i15 = this.f205243h;
            if (i15 == 0) {
                a(c0Var);
            } else if (i15 == 1) {
                h(c0Var);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException();
                }
                g(c0Var);
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f205243h = 0;
        this.f205244i = 0;
        this.f205246k = false;
        this.f205249n = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205242g = dVar.b();
        this.f205241f = rVar.v(dVar.c(), 1);
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205249n = j15;
    }

    public t(String str, int i15, String str2) {
        this.f205243h = 0;
        w7.c0 c0Var = new w7.c0(4);
        this.f205236a = c0Var;
        c0Var.f()[0] = -1;
        this.f205237b = new o8.i0.a();
        this.f205249n = -9223372036854775807L;
        this.f205238c = str;
        this.f205239d = i15;
        this.f205240e = str2;
    }
}
