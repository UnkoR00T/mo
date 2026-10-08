package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f143195a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f143196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f143197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f143198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f143199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f143200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f143201g;

    public void a(s0 s0Var, s0.a aVar) {
        if (this.f143197c > 0) {
            s0Var.c(this.f143198d, this.f143199e, this.f143200f, this.f143201g, aVar);
            this.f143197c = 0;
        }
    }

    public void b() {
        this.f143196b = false;
        this.f143197c = 0;
    }

    public void c(s0 s0Var, long j15, int i15, int i16, int i17, s0.a aVar) {
        zj.p.x(this.f143201g <= i16 + i17, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f143196b) {
            int i18 = this.f143197c;
            int i19 = i18 + 1;
            this.f143197c = i19;
            if (i18 == 0) {
                this.f143198d = j15;
                this.f143199e = i15;
                this.f143200f = 0;
            }
            this.f143200f += i16;
            this.f143201g = i17;
            if (i19 >= 16) {
                a(s0Var, aVar);
            }
        }
    }

    public void d(q qVar) {
        if (this.f143196b) {
            return;
        }
        qVar.p(this.f143195a, 0, 10);
        qVar.g();
        if (b.j(this.f143195a) == 0) {
            return;
        }
        this.f143196b = true;
    }
}
