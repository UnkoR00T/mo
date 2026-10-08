package h9;

import android.util.Pair;
import o8.l0;
import o8.m0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f81916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f81917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f81918c;

    private c(long[] jArr, long[] jArr2, long j15) {
        this.f81916a = jArr;
        this.f81917b = jArr2;
        this.f81918c = j15 == -9223372036854775807L ? o0.J0(jArr2[jArr2.length - 1]) : j15;
    }

    public static c i(long j15, c9.l lVar, long j16) {
        int length = lVar.f24609e.length;
        int i15 = length + 1;
        long[] jArr = new long[i15];
        long[] jArr2 = new long[i15];
        jArr[0] = j15;
        long j17 = 0;
        jArr2[0] = 0;
        for (int i16 = 1; i16 <= length; i16++) {
            int i17 = i16 - 1;
            j15 += (long) (lVar.f24607c + lVar.f24609e[i17]);
            j17 += (long) (lVar.f24608d + lVar.f24610f[i17]);
            jArr[i16] = j15;
            jArr2[i16] = j17;
        }
        return new c(jArr, jArr2, j16);
    }

    private static Pair<Long, Long> j(long j15, long[] jArr, long[] jArr2) {
        int iG = o0.g(jArr, j15, true, true);
        long j16 = jArr[iG];
        long j17 = jArr2[iG];
        int i15 = iG + 1;
        if (i15 == jArr.length) {
            return Pair.create(Long.valueOf(j16), Long.valueOf(j17));
        }
        long j18 = jArr[i15];
        return Pair.create(Long.valueOf(j15), Long.valueOf(((long) ((j18 == j16 ? 0.0d : (j15 - j16) / (j18 - j16)) * (jArr2[i15] - j17))) + j17));
    }

    @Override // h9.i
    public long a() {
        return 0L;
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        Pair<Long, Long> pairJ = j(o0.g1(o0.p(j15, 0L, this.f81918c)), this.f81917b, this.f81916a);
        return new l0.a(new m0(o0.J0(((Long) pairJ.first).longValue()), ((Long) pairJ.second).longValue()));
    }

    @Override // h9.i
    public long d() {
        return -1L;
    }

    @Override // o8.l0
    public boolean e() {
        return true;
    }

    @Override // h9.i
    public long f(long j15) {
        return o0.J0(((Long) j(j15, this.f81916a, this.f81917b).second).longValue());
    }

    @Override // h9.i
    public int g() {
        return -2147483647;
    }

    @Override // o8.l0
    public long h() {
        return this.f81918c;
    }
}
