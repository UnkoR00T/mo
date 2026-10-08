package h9;

import o8.i0;
import t7.v;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.a f81955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f81958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f81961g;

    private k(i0.a aVar, long j15, long j16, long[] jArr, h hVar, int i15, int i16) {
        this.f81955a = new i0.a(aVar);
        this.f81956b = j15;
        this.f81957c = j16;
        this.f81961g = jArr;
        this.f81958d = hVar;
        this.f81959e = i15;
        this.f81960f = i16;
    }

    public static k c(i0.a aVar, c0 c0Var) {
        long[] jArr;
        int i15;
        int i16;
        int iZ = c0Var.z();
        int iU = (iZ & 1) != 0 ? c0Var.U() : -1;
        long jS = (iZ & 2) != 0 ? c0Var.S() : -1L;
        h hVarD = null;
        if ((iZ & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i17 = 0; i17 < 100; i17++) {
                jArr2[i17] = c0Var.Q();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZ & 8) != 0) {
            c0Var.g0(4);
        }
        if (c0Var.a() >= 24) {
            c0Var.g0(11);
            hVarD = h.d(c0Var.y(), c0Var.Y(), c0Var.Y());
            c0Var.g0(2);
            int iT = c0Var.T();
            i16 = iT & 4095;
            i15 = (16773120 & iT) >> 12;
        } else {
            i15 = -1;
            i16 = -1;
        }
        return new k(aVar, iU, jS, jArr, hVarD, i15, i16);
    }

    public long a() {
        long j15 = this.f81956b;
        if (j15 == -1 || j15 == 0) {
            return -9223372036854775807L;
        }
        i0.a aVar = this.f81955a;
        return o0.T0((j15 * ((long) aVar.f143120g)) - 1, aVar.f143117d);
    }

    public v b() {
        h hVar = this.f81958d;
        if (hVar != null) {
            return new v(hVar);
        }
        return null;
    }
}
