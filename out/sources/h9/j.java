package h9;

import o8.i0;
import o8.l0;
import o8.m0;
import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f81949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f81950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f81951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f81952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f81953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f81954f;

    private j(long[] jArr, long[] jArr2, long j15, long j16, long j17, int i15) {
        this.f81949a = jArr;
        this.f81950b = jArr2;
        this.f81951c = j15;
        this.f81952d = j16;
        this.f81953e = j17;
        this.f81954f = i15;
    }

    public static j i(long j15, long j16, i0.a aVar, c0 c0Var) {
        int iQ;
        c0Var.g0(6);
        int iZ = c0Var.z();
        long j17 = j16 + ((long) aVar.f143116c);
        long jMax = ((long) iZ) + j17;
        int iZ2 = c0Var.z();
        if (iZ2 <= 0) {
            return null;
        }
        long jT0 = o0.T0((((long) iZ2) * ((long) aVar.f143120g)) - 1, aVar.f143117d);
        int iY = c0Var.Y();
        int iY2 = c0Var.Y();
        int iY3 = c0Var.Y();
        c0Var.g0(2);
        int i15 = iY2;
        long[] jArr = new long[iY];
        long[] jArr2 = new long[iY];
        int i16 = 0;
        long j18 = j16 + ((long) aVar.f143116c);
        while (i16 < iY) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i16] = (((long) i16) * jT0) / ((long) iY);
            jArr3[i16] = j18;
            if (iY3 == 1) {
                iQ = c0Var.Q();
            } else if (iY3 == 2) {
                iQ = c0Var.Y();
            } else if (iY3 == 3) {
                iQ = c0Var.T();
            } else {
                if (iY3 != 4) {
                    return null;
                }
                iQ = c0Var.U();
            }
            int i17 = i16;
            int i18 = i15;
            j18 += ((long) iQ) * ((long) i18);
            i15 = i18;
            i16 = i17 + 1;
            iY = iY;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j15 != -1 && j15 != jMax) {
            t.h("VbriSeeker", "VBRI data size mismatch: " + j15 + ", " + jMax);
        }
        if (jMax != j18) {
            t.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j18 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j18);
        }
        return new j(jArr6, jArr5, jT0, j17, jMax, aVar.f143119f);
    }

    @Override // h9.i
    public long a() {
        return this.f81952d;
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        int iG = o0.g(this.f81949a, j15, true, true);
        m0 m0Var = new m0(this.f81949a[iG], this.f81950b[iG]);
        if (m0Var.f143158a >= j15 || iG == this.f81949a.length - 1) {
            return new l0.a(m0Var);
        }
        int i15 = iG + 1;
        return new l0.a(m0Var, new m0(this.f81949a[i15], this.f81950b[i15]));
    }

    @Override // h9.i
    public long d() {
        return this.f81953e;
    }

    @Override // o8.l0
    public boolean e() {
        return true;
    }

    @Override // h9.i
    public long f(long j15) {
        return this.f81949a[o0.g(this.f81950b, j15, true, true)];
    }

    @Override // h9.i
    public int g() {
        return this.f81954f;
    }

    @Override // o8.l0
    public long h() {
        return this.f81951c;
    }
}
