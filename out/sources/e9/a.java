package e9;

import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f48665c;

    private a(long j15, byte[] bArr, long j16) {
        this.f48663a = j16;
        this.f48664b = j15;
        this.f48665c = bArr;
    }

    static a d(c0 c0Var, int i15, long j15) {
        long jS = c0Var.S();
        int i16 = i15 - 4;
        byte[] bArr = new byte[i16];
        c0Var.u(bArr, 0, i16);
        return new a(jS, bArr, j15);
    }

    @Override // e9.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f48663a + ", identifier= " + this.f48664b + " }";
    }
}
