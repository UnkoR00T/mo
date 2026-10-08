package e9;

import w7.c0;
import w7.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48700b;

    private g(long j15, long j16) {
        this.f48699a = j15;
        this.f48700b = j16;
    }

    static g d(c0 c0Var, long j15, k0 k0Var) {
        long jE = e(c0Var, j15);
        return new g(jE, k0Var.b(jE));
    }

    static long e(c0 c0Var, long j15) {
        long jQ = c0Var.Q();
        if ((128 & jQ) != 0) {
            return 8589934591L & ((((jQ & 1) << 32) | c0Var.S()) + j15);
        }
        return -9223372036854775807L;
    }

    @Override // e9.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f48699a + ", playbackPositionUs= " + this.f48700b + " }";
    }
}
