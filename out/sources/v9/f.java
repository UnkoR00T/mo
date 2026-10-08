package v9;

import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.b0 f204934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f204935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f204936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f204937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f204938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f204939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f204940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f204941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f204942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f204943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f204944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f204945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t7.p f204946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f204947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f204948o;

    public f(String str) {
        this(null, 0, str);
    }

    private boolean a(w7.c0 c0Var, byte[] bArr, int i15) {
        int iMin = Math.min(c0Var.a(), i15 - this.f204942i);
        c0Var.u(bArr, this.f204942i, iMin);
        int i16 = this.f204942i + iMin;
        this.f204942i = i16;
        return i16 == i15;
    }

    private void g() {
        this.f204934a.p(0);
        o8.c.C3545c c3545cG = o8.c.g(this.f204934a);
        t7.p pVar = this.f204946m;
        if (pVar == null || c3545cG.f143030c != pVar.H || c3545cG.f143029b != pVar.I || !"audio/ac4".equals(pVar.f188381p)) {
            t7.p pVarQ = new t7.p.b().k0(this.f204939f).X(this.f204938e).A0("audio/ac4").U(c3545cG.f143030c).B0(c3545cG.f143029b).o0(this.f204936c).y0(this.f204937d).Q();
            this.f204946m = pVarQ;
            this.f204940g.e(pVarQ);
        }
        this.f204947n = c3545cG.f143031d;
        this.f204945l = (((long) c3545cG.f143032e) * 1000000) / ((long) this.f204946m.I);
    }

    private boolean h(w7.c0 c0Var) {
        while (true) {
            if (c0Var.a() <= 0) {
                return false;
            }
            if (this.f204943j) {
                int iQ = c0Var.Q();
                this.f204943j = iQ == 172;
                if (iQ == 64 || iQ == 65) {
                    this.f204944k = iQ == 65;
                    return true;
                }
            } else {
                this.f204943j = c0Var.Q() == 172;
            }
        }
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        zj.p.q(this.f204940g);
        while (c0Var.a() > 0) {
            int i15 = this.f204941h;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        int iMin = Math.min(c0Var.a(), this.f204947n - this.f204942i);
                        this.f204940g.a(c0Var, iMin);
                        int i16 = this.f204942i + iMin;
                        this.f204942i = i16;
                        if (i16 == this.f204947n) {
                            zj.p.w(this.f204948o != -9223372036854775807L);
                            this.f204940g.c(this.f204948o, 1, this.f204947n, 0, null);
                            this.f204948o += this.f204945l;
                            this.f204941h = 0;
                        }
                    }
                } else if (a(c0Var, this.f204935b.f(), 16)) {
                    g();
                    this.f204935b.f0(0);
                    this.f204940g.a(this.f204935b, 16);
                    this.f204941h = 2;
                }
            } else if (h(c0Var)) {
                this.f204941h = 1;
                this.f204935b.f()[0] = -84;
                this.f204935b.f()[1] = (byte) (this.f204944k ? 65 : 64);
                this.f204942i = 2;
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f204941h = 0;
        this.f204942i = 0;
        this.f204943j = false;
        this.f204944k = false;
        this.f204948o = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f204939f = dVar.b();
        this.f204940g = rVar.v(dVar.c(), 1);
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f204948o = j15;
    }

    public f(String str, int i15, String str2) {
        w7.b0 b0Var = new w7.b0(new byte[16]);
        this.f204934a = b0Var;
        this.f204935b = new w7.c0(b0Var.f210609a);
        this.f204941h = 0;
        this.f204942i = 0;
        this.f204943j = false;
        this.f204944k = false;
        this.f204948o = -9223372036854775807L;
        this.f204936c = str;
        this.f204937d = i15;
        this.f204938e = str2;
    }
}
