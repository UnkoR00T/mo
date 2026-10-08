package v9;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements o8.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o8.u f204924d = new o8.u() { // from class: v9.d
        @Override // o8.u
        public final o8.p[] f() {
            return e.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f204925a = new f("audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f204926b = new w7.c0(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f204927c;

    public static /* synthetic */ o8.p[] h() {
        return new o8.p[]{new e()};
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f204927c = false;
        this.f204925a.c();
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        w7.c0 c0Var = new w7.c0(10);
        int i15 = 0;
        while (true) {
            qVar.p(c0Var.f(), 0, 10);
            c0Var.f0(0);
            if (c0Var.T() != 4801587) {
                break;
            }
            c0Var.g0(3);
            int iP = c0Var.P();
            i15 += iP + 10;
            qVar.k(iP);
        }
        qVar.g();
        qVar.k(i15);
        int i16 = 0;
        int i17 = i15;
        while (true) {
            qVar.p(c0Var.f(), 0, 7);
            c0Var.f0(0);
            int iY = c0Var.Y();
            if (iY == 44096 || iY == 44097) {
                i16++;
                if (i16 >= 4) {
                    return true;
                }
                int iH = o8.c.h(c0Var.f(), iY);
                if (iH == -1) {
                    return false;
                }
                qVar.k(iH - 7);
            } else {
                qVar.g();
                i17++;
                if (i17 - i15 >= 8192) {
                    return false;
                }
                qVar.k(i17);
                i16 = 0;
            }
        }
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        this.f204925a.d(rVar, new l0.d(0, 1));
        rVar.s();
        rVar.f(new o8.l0.b(-9223372036854775807L));
    }

    @Override // o8.p
    public int g(o8.q qVar, o8.k0 k0Var) {
        int i15 = qVar.read(this.f204926b.f(), 0, 16384);
        if (i15 == -1) {
            return -1;
        }
        this.f204926b.f0(0);
        this.f204926b.e0(i15);
        if (!this.f204927c) {
            this.f204925a.f(0L, 4);
            this.f204927c = true;
        }
        this.f204925a.b(this.f204926b);
        return 0;
    }
}
