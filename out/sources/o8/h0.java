package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.u f143096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.u f143097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f143098c;

    public h0(long[] jArr, long[] jArr2, long j15) {
        zj.p.d(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f143096a = new w7.u(length);
            this.f143097b = new w7.u(length);
        } else {
            int i15 = length + 1;
            w7.u uVar = new w7.u(i15);
            this.f143096a = uVar;
            w7.u uVar2 = new w7.u(i15);
            this.f143097b = uVar2;
            uVar.a(0L);
            uVar2.a(0L);
        }
        this.f143096a.b(jArr);
        this.f143097b.b(jArr2);
        this.f143098c = j15;
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        if (this.f143097b.d() == 0) {
            return new l0.a(m0.f143157c);
        }
        int iE = w7.o0.e(this.f143097b, j15, true, true);
        m0 m0Var = new m0(this.f143097b.c(iE), this.f143096a.c(iE));
        if (m0Var.f143158a == j15 || iE == this.f143097b.d() - 1) {
            return new l0.a(m0Var);
        }
        int i15 = iE + 1;
        return new l0.a(m0Var, new m0(this.f143097b.c(i15), this.f143096a.c(i15)));
    }

    @Override // o8.l0
    public boolean e() {
        return this.f143097b.d() > 0;
    }

    public long f(long j15) {
        if (this.f143097b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f143097b.c(w7.o0.e(this.f143096a, j15, true, true));
    }

    @Override // o8.l0
    public long h() {
        return this.f143098c;
    }

    public void i(long j15, long j16) {
        if (this.f143097b.d() == 0 && j15 > 0) {
            this.f143096a.a(0L);
            this.f143097b.a(0L);
        }
        this.f143096a.a(j16);
        this.f143097b.a(j15);
    }

    public boolean j(long j15, long j16) {
        if (this.f143097b.d() == 0) {
            return false;
        }
        w7.u uVar = this.f143097b;
        return j15 - uVar.c(uVar.d() - 1) < j16;
    }

    public void k(long j15) {
        this.f143098c = j15;
    }
}
