package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f143161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f143162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f143163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f143164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f143165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f143166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f143167g;

    public n0(int i15, int i16, String str) {
        this.f143161a = i15;
        this.f143162b = i16;
        this.f143163c = str;
    }

    private void h(String str) {
        s0 s0VarV = this.f143166f.v(1024, 4);
        this.f143167g = s0VarV;
        s0VarV.e(new t7.p.b().X(str).A0(str).Q());
        this.f143166f.s();
        this.f143166f.f(new o0(-9223372036854775807L));
        this.f143165e = 1;
    }

    private void i(q qVar) {
        int iF = ((s0) zj.p.q(this.f143167g)).f(qVar, 1024, true);
        if (iF != -1) {
            this.f143164d += iF;
            return;
        }
        this.f143165e = 2;
        this.f143167g.c(0L, 1, this.f143164d, 0, null);
        this.f143164d = 0;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        if (j15 == 0 || this.f143165e == 1) {
            this.f143165e = 1;
            this.f143164d = 0;
        }
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        zj.p.w((this.f143161a == -1 || this.f143162b == -1) ? false : true);
        w7.c0 c0Var = new w7.c0(this.f143162b);
        qVar.p(c0Var.f(), 0, this.f143162b);
        return c0Var.Y() == this.f143161a;
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f143166f = rVar;
        h(this.f143163c);
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        int i15 = this.f143165e;
        if (i15 == 1) {
            i(qVar);
            return 0;
        }
        if (i15 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }
}
