package w9;

import o8.l0;
import o8.m0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class e implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f211137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f211138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f211139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f211140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f211141e;

    public e(c cVar, int i15, long j15, long j16) {
        this.f211137a = cVar;
        this.f211138b = i15;
        this.f211139c = j15;
        long j17 = (j16 - j15) / ((long) cVar.f211130e);
        this.f211140d = j17;
        this.f211141e = i(j17);
    }

    private long i(long j15) {
        return o0.U0(j15 * ((long) this.f211138b), 1000000L, this.f211137a.f211128c);
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        long jP = o0.p((((long) this.f211137a.f211128c) * j15) / (((long) this.f211138b) * 1000000), 0L, this.f211140d - 1);
        long j16 = this.f211139c + (((long) this.f211137a.f211130e) * jP);
        long jI = i(jP);
        m0 m0Var = new m0(jI, j16);
        if (jI >= j15 || jP == this.f211140d - 1) {
            return new l0.a(m0Var);
        }
        long j17 = jP + 1;
        return new l0.a(m0Var, new m0(i(j17), this.f211139c + (((long) this.f211137a.f211130e) * j17)));
    }

    @Override // o8.l0
    public boolean e() {
        return true;
    }

    @Override // o8.l0
    public long h() {
        return this.f211141e;
    }
}
