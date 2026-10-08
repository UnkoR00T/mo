package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q f8267d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8270c;

    q() {
    }

    static q b() {
        if (f8267d == null) {
            f8267d = new q();
        }
        return f8267d;
    }

    public void a(long j15, double d15, double d16) {
        float f15 = (j15 - 946728000000L) / 8.64E7f;
        float f16 = (0.01720197f * f15) + 6.24006f;
        double d17 = f16;
        double dSin = (Math.sin(d17) * 0.03341960161924362d) + d17 + (Math.sin(2.0f * f16) * 3.4906598739326E-4d) + (Math.sin(f16 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d18 = (-d16) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f15 - 9.0E-4f)) - d18) + 9.0E-4f)) + d18 + (Math.sin(d17) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d19 = 0.01745329238474369d * d15;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d19) * Math.sin(dAsin))) / (Math.cos(d19) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f8270c = 1;
            this.f8268a = -1L;
            this.f8269b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f8270c = 0;
                this.f8268a = -1L;
                this.f8269b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f8268a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f8269b = jRound;
            if (jRound >= j15 || this.f8268a <= j15) {
                this.f8270c = 1;
            } else {
                this.f8270c = 0;
            }
        }
    }
}
