package h9;

import java.math.RoundingMode;
import o8.h0;
import o8.l0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f81912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f81914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f81915d;

    public b(long j15, long j16, long j17) {
        this.f81915d = new h0(new long[]{j16}, new long[]{0}, j15);
        this.f81912a = j16;
        this.f81913b = j17;
        int i15 = -2147483647;
        if (j15 == -9223372036854775807L) {
            this.f81914c = -2147483647;
            return;
        }
        long jW0 = o0.W0(j16 - j17, 8L, j15, RoundingMode.HALF_UP);
        if (jW0 > 0 && jW0 <= 2147483647L) {
            i15 = (int) jW0;
        }
        this.f81914c = i15;
    }

    @Override // h9.i
    public long a() {
        return this.f81912a;
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        return this.f81915d.c(j15);
    }

    @Override // h9.i
    public long d() {
        return this.f81913b;
    }

    @Override // o8.l0
    public boolean e() {
        return this.f81915d.e();
    }

    @Override // h9.i
    public long f(long j15) {
        return this.f81915d.f(j15);
    }

    @Override // h9.i
    public int g() {
        return this.f81914c;
    }

    @Override // o8.l0
    public long h() {
        return this.f81915d.h();
    }

    public boolean i(long j15) {
        return this.f81915d.j(j15, 100000L);
    }

    public void j(long j15, long j16) {
        if (i(j15)) {
            return;
        }
        this.f81915d.i(j15, j16);
    }

    void k(long j15) {
        this.f81915d.k(j15);
    }
}
