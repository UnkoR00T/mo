package a8;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f4417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f4419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f4422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f4425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f4426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f4427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f4429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f4430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f4431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f4433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4434s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f4435a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f4436b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4437c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f4438d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4439e = w7.o0.J0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f4440f = w7.o0.J0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f4441g = 0.999f;

        public g a() {
            return new g(this.f4435a, this.f4436b, this.f4437c, this.f4438d, this.f4439e, this.f4440f, this.f4441g);
        }
    }

    private void f(long j15) {
        long j16 = this.f4433r + (this.f4434s * 3);
        if (this.f4428m > j16) {
            float fJ0 = w7.o0.J0(this.f4418c);
            this.f4428m = ek.i.d(j16, this.f4425j, this.f4428m - (((long) ((this.f4431p - 1.0f) * fJ0)) + ((long) ((this.f4429n - 1.0f) * fJ0))));
            return;
        }
        long jP = w7.o0.p(j15 - ((long) (Math.max(0.0f, this.f4431p - 1.0f) / this.f4419d)), this.f4428m, j16);
        this.f4428m = jP;
        long j17 = this.f4427l;
        if (j17 == -9223372036854775807L || jP <= j17) {
            return;
        }
        this.f4428m = j17;
    }

    private void g() {
        long j15;
        long j16 = this.f4423h;
        if (j16 != -9223372036854775807L) {
            j15 = this.f4424i;
            if (j15 == -9223372036854775807L) {
                long j17 = this.f4426k;
                if (j17 != -9223372036854775807L && j16 < j17) {
                    j16 = j17;
                }
                j15 = this.f4427l;
                if (j15 == -9223372036854775807L || j16 <= j15) {
                    j15 = j16;
                }
            }
        } else {
            j15 = -9223372036854775807L;
        }
        if (this.f4425j == j15) {
            return;
        }
        this.f4425j = j15;
        this.f4428m = j15;
        this.f4433r = -9223372036854775807L;
        this.f4434s = -9223372036854775807L;
        this.f4432q = -9223372036854775807L;
    }

    private static long h(long j15, long j16, float f15) {
        return (long) ((j15 * f15) + ((1.0f - f15) * j16));
    }

    private void i(long j15, long j16) {
        long j17 = j15 - j16;
        long j18 = this.f4433r;
        if (j18 == -9223372036854775807L) {
            this.f4433r = j17;
            this.f4434s = 0L;
        } else {
            long jMax = Math.max(j17, h(j18, j17, this.f4422g));
            this.f4433r = jMax;
            this.f4434s = h(this.f4434s, Math.abs(j17 - jMax), this.f4422g);
        }
    }

    @Override // a8.z1
    public float a(long j15, long j16) {
        if (this.f4423h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j15, j16);
        if (this.f4432q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f4432q < this.f4418c) {
            return this.f4431p;
        }
        this.f4432q = SystemClock.elapsedRealtime();
        f(j15);
        long j17 = j15 - this.f4428m;
        if (Math.abs(j17) < this.f4420e) {
            this.f4431p = 1.0f;
        } else {
            this.f4431p = w7.o0.n((this.f4419d * j17) + 1.0f, this.f4430o, this.f4429n);
        }
        return this.f4431p;
    }

    @Override // a8.z1
    public long b() {
        return this.f4428m;
    }

    @Override // a8.z1
    public void c() {
        long j15 = this.f4428m;
        if (j15 == -9223372036854775807L) {
            return;
        }
        long j16 = j15 + this.f4421f;
        this.f4428m = j16;
        long j17 = this.f4427l;
        if (j17 != -9223372036854775807L && j16 > j17) {
            this.f4428m = j17;
        }
        this.f4432q = -9223372036854775807L;
    }

    @Override // a8.z1
    public void d(t7.s.g gVar) {
        this.f4423h = w7.o0.J0(gVar.f188510a);
        this.f4426k = w7.o0.J0(gVar.f188511b);
        this.f4427l = w7.o0.J0(gVar.f188512c);
        float f15 = gVar.f188513d;
        if (f15 == -3.4028235E38f) {
            f15 = this.f4416a;
        }
        this.f4430o = f15;
        float f16 = gVar.f188514e;
        if (f16 == -3.4028235E38f) {
            f16 = this.f4417b;
        }
        this.f4429n = f16;
        if (f15 == 1.0f && f16 == 1.0f) {
            this.f4423h = -9223372036854775807L;
        }
        g();
    }

    @Override // a8.z1
    public void e(long j15) {
        this.f4424i = j15;
        g();
    }

    private g(float f15, float f16, long j15, float f17, long j16, long j17, float f18) {
        this.f4416a = f15;
        this.f4417b = f16;
        this.f4418c = j15;
        this.f4419d = f17;
        this.f4420e = j16;
        this.f4421f = j17;
        this.f4422g = f18;
        this.f4423h = -9223372036854775807L;
        this.f4424i = -9223372036854775807L;
        this.f4426k = -9223372036854775807L;
        this.f4427l = -9223372036854775807L;
        this.f4430o = f15;
        this.f4429n = f16;
        this.f4431p = 1.0f;
        this.f4432q = -9223372036854775807L;
        this.f4425j = -9223372036854775807L;
        this.f4428m = -9223372036854775807L;
        this.f4433r = -9223372036854775807L;
        this.f4434s = -9223372036854775807L;
    }
}
