package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f143230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f143231b;

    public x(y yVar, long j15) {
        this.f143230a = yVar;
        this.f143231b = j15;
    }

    private m0 i(long j15, long j16) {
        return new m0((j15 * 1000000) / ((long) this.f143230a.f143236e), this.f143231b + j16);
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        zj.p.q(this.f143230a.f143242k);
        y yVar = this.f143230a;
        y.a aVar = yVar.f143242k;
        long[] jArr = aVar.f143244a;
        long[] jArr2 = aVar.f143245b;
        int iG = w7.o0.g(jArr, yVar.i(j15), true, false);
        m0 m0VarI = i(iG == -1 ? 0L : jArr[iG], iG != -1 ? jArr2[iG] : 0L);
        if (m0VarI.f143158a == j15 || iG == jArr.length - 1) {
            return new l0.a(m0VarI);
        }
        int i15 = iG + 1;
        return new l0.a(m0VarI, i(jArr[i15], jArr2[i15]));
    }

    @Override // o8.l0
    public boolean e() {
        return true;
    }

    @Override // o8.l0
    public long h() {
        return this.f143230a.f();
    }
}
