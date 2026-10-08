package v9;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements o8.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o8.u f204886d = new o8.u() { // from class: v9.a
        @Override // o8.u
        public final o8.p[] f() {
            return b.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f204887a = new c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f204888b = new w7.c0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f204889c;

    public static /* synthetic */ o8.p[] h() {
        return new o8.p[]{new b()};
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f204889c = false;
        this.f204887a.c();
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
            qVar.p(c0Var.f(), 0, 6);
            c0Var.f0(0);
            if (c0Var.Y() != 2935) {
                qVar.g();
                i17++;
                if (i17 - i15 >= 8192) {
                    return false;
                }
                qVar.k(i17);
                i16 = 0;
            } else {
                i16++;
                if (i16 >= 4) {
                    return true;
                }
                int iG = o8.b.g(c0Var.f());
                if (iG == -1) {
                    return false;
                }
                qVar.k(iG - 6);
            }
        }
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        this.f204887a.d(rVar, new l0.d(0, 1));
        rVar.s();
        rVar.f(new o8.l0.b(-9223372036854775807L));
    }

    @Override // o8.p
    public int g(o8.q qVar, o8.k0 k0Var) {
        int i15 = qVar.read(this.f204888b.f(), 0, 2786);
        if (i15 == -1) {
            return -1;
        }
        this.f204888b.f0(0);
        this.f204888b.e0(i15);
        if (!this.f204889c) {
            this.f204887a.f(0L, 4);
            this.f204889c = true;
        }
        this.f204887a.b(this.f204888b);
        return 0;
    }
}
