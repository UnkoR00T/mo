package m8;

import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f124460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f124461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f124462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range<Double> f124463d;

    public v(float f15) {
        zj.p.d(f15 > 0.0f);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f15)));
        this.f124463d = range;
        this.f124462c = ((Double) range.getUpper()).doubleValue();
        this.f124460a = -9223372036854775807L;
        this.f124461b = -9223372036854775807L;
    }

    private double a(long j15, long j16) {
        long j17 = this.f124460a;
        if (j17 != -9223372036854775807L) {
            long j18 = this.f124461b;
            if (j18 != -9223372036854775807L && j15 != j17) {
                return (j16 - j18) / (j15 - j17);
            }
        }
        return ((Double) this.f124463d.getUpper()).doubleValue();
    }

    private void f(double d15) {
        this.f124462c = (this.f124462c * 0.800000011920929d) + (d15 * 0.20000000298023224d);
    }

    public void b(long j15, long j16) {
        zj.p.d(j15 != -9223372036854775807L);
        zj.p.d(j16 != -9223372036854775807L);
        f(((Double) this.f124463d.clamp(Double.valueOf(a(j15, j16)))).doubleValue());
        this.f124460a = j15;
        this.f124461b = j16;
    }

    public long c(long j15) {
        long j16 = this.f124460a;
        if (j16 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f124461b + ((j15 - j16) * this.f124462c));
    }

    public void d() {
        this.f124462c = ((Double) this.f124463d.getUpper()).doubleValue();
        this.f124460a = -9223372036854775807L;
        this.f124461b = -9223372036854775807L;
    }

    public void e(float f15) {
        zj.p.d(f15 > 0.0f);
        this.f124463d = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f15)));
        d();
    }
}
