package v9;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f204928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f204929b = new w7.c0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f204930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f204931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f204932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f204933f;

    public e0(d0 d0Var) {
        this.f204928a = d0Var;
    }

    @Override // v9.l0
    public void a(w7.k0 k0Var, o8.r rVar, l0.d dVar) {
        this.f204928a.a(k0Var, rVar, dVar);
        this.f204933f = true;
    }

    @Override // v9.l0
    public void b(w7.c0 c0Var, int i15) {
        int iG;
        boolean z15 = (i15 & 1) != 0;
        if (z15) {
            iG = c0Var.g() + c0Var.Q();
        } else {
            iG = -1;
        }
        if (this.f204933f) {
            if (!z15) {
                return;
            }
            this.f204933f = false;
            c0Var.f0(iG);
            this.f204931d = 0;
        }
        while (c0Var.a() > 0) {
            int i16 = this.f204931d;
            if (i16 < 3) {
                if (i16 == 0) {
                    int iQ = c0Var.Q();
                    c0Var.f0(c0Var.g() - 1);
                    if (iQ == 255) {
                        this.f204933f = true;
                        return;
                    }
                }
                int iMin = Math.min(c0Var.a(), 3 - this.f204931d);
                c0Var.u(this.f204929b.f(), this.f204931d, iMin);
                int i17 = this.f204931d + iMin;
                this.f204931d = i17;
                if (i17 == 3) {
                    this.f204929b.f0(0);
                    this.f204929b.e0(3);
                    this.f204929b.g0(1);
                    int iQ2 = this.f204929b.Q();
                    int iQ3 = this.f204929b.Q();
                    this.f204932e = (iQ2 & 128) != 0;
                    this.f204930c = (((iQ2 & 15) << 8) | iQ3) + 3;
                    int iB = this.f204929b.b();
                    int i18 = this.f204930c;
                    if (iB < i18) {
                        this.f204929b.d(Math.min(4098, Math.max(i18, this.f204929b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c0Var.a(), this.f204930c - this.f204931d);
                c0Var.u(this.f204929b.f(), this.f204931d, iMin2);
                int i19 = this.f204931d + iMin2;
                this.f204931d = i19;
                int i25 = this.f204930c;
                if (i19 != i25) {
                    continue;
                } else {
                    if (!this.f204932e) {
                        this.f204929b.e0(i25);
                    } else {
                        if (w7.o0.w(this.f204929b.f(), 0, this.f204930c, -1) != 0) {
                            this.f204933f = true;
                            return;
                        }
                        this.f204929b.e0(this.f204930c - 4);
                    }
                    this.f204929b.f0(0);
                    this.f204928a.b(this.f204929b);
                    this.f204931d = 0;
                }
            }
        }
    }

    @Override // v9.l0
    public void c() {
        this.f204933f = true;
    }
}
