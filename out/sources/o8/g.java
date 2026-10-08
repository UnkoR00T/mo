package o8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f143089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f143090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f143091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f143092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f143093f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f143089b = iArr;
        this.f143090c = jArr;
        this.f143091d = jArr2;
        this.f143092e = jArr3;
        int length = iArr.length;
        this.f143088a = length;
        if (length > 0) {
            this.f143093f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f143093f = 0L;
        }
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        int i15 = i(j15);
        m0 m0Var = new m0(this.f143092e[i15], this.f143090c[i15]);
        if (m0Var.f143158a >= j15 || i15 == this.f143088a - 1) {
            return new l0.a(m0Var);
        }
        int i16 = i15 + 1;
        return new l0.a(m0Var, new m0(this.f143092e[i16], this.f143090c[i16]));
    }

    @Override // o8.l0
    public boolean e() {
        return true;
    }

    @Override // o8.l0
    public long h() {
        return this.f143093f;
    }

    public int i(long j15) {
        return w7.o0.g(this.f143092e, j15, true, true);
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f143088a + ", sizes=" + Arrays.toString(this.f143089b) + ", offsets=" + Arrays.toString(this.f143090c) + ", timeUs=" + Arrays.toString(this.f143092e) + ", durationsUs=" + Arrays.toString(this.f143091d) + ")";
    }
}
