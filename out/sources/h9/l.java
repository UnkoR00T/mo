package h9;

import o8.i0;
import o8.l0;
import o8.m0;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f81962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f81964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f81965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f81966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f81967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f81968g;

    private l(long j15, int i15, long j16, int i16, long j17, long[] jArr) {
        this.f81962a = j15;
        this.f81963b = i15;
        this.f81964c = j16;
        this.f81965d = i16;
        this.f81966e = j17;
        this.f81968g = jArr;
        this.f81967f = j17 != -1 ? j15 + j17 : -1L;
    }

    public static l i(k kVar, long j15) {
        long jA = kVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        i0.a aVar = kVar.f81955a;
        return new l(j15, aVar.f143116c, jA, aVar.f143119f, kVar.f81957c, kVar.f81961g);
    }

    private long j(int i15) {
        return (this.f81964c * ((long) i15)) / 100;
    }

    @Override // h9.i
    public long a() {
        return this.f81962a + ((long) this.f81963b);
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        if (!e()) {
            return new l0.a(new m0(0L, this.f81962a + ((long) this.f81963b)));
        }
        long jP = o0.p(j15, 0L, this.f81964c);
        double d15 = (jP * 100.0d) / this.f81964c;
        double d16 = 0.0d;
        if (d15 > 0.0d) {
            if (d15 >= 100.0d) {
                d16 = 256.0d;
            } else {
                int i15 = (int) d15;
                long[] jArr = (long[]) p.q(this.f81968g);
                double d17 = jArr[i15];
                d16 = d17 + ((d15 - ((double) i15)) * ((i15 == 99 ? 256.0d : jArr[i15 + 1]) - d17));
            }
        }
        return new l0.a(new m0(jP, this.f81962a + o0.p(Math.round((d16 / 256.0d) * this.f81966e), this.f81963b, this.f81966e - 1)));
    }

    @Override // h9.i
    public long d() {
        return this.f81967f;
    }

    @Override // o8.l0
    public boolean e() {
        return this.f81968g != null;
    }

    @Override // h9.i
    public long f(long j15) {
        long j16 = j15 - this.f81962a;
        if (!e() || j16 <= this.f81963b) {
            return 0L;
        }
        long[] jArr = (long[]) p.q(this.f81968g);
        double d15 = (j16 * 256.0d) / this.f81966e;
        int iG = o0.g(jArr, (long) d15, true, true);
        long j17 = j(iG);
        long j18 = jArr[iG];
        int i15 = iG + 1;
        long j19 = j(i15);
        long j25 = iG == 99 ? 256L : jArr[i15];
        return j17 + Math.round((j18 == j25 ? 0.0d : (d15 - j18) / (j25 - j18)) * (j19 - j17));
    }

    @Override // h9.i
    public int g() {
        return this.f81965d;
    }

    @Override // o8.l0
    public long h() {
        return this.f81964c;
    }
}
