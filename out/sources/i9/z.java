package i9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f90519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f90521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f90522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f90524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f90525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f90526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f90527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f90528j;

    public z(w wVar, long[] jArr, int[] iArr, int i15, long[] jArr2, int[] iArr2, int[] iArr3, boolean z15, long j15, int i16) {
        zj.p.d(iArr.length == jArr2.length);
        zj.p.d(jArr.length == jArr2.length);
        zj.p.d(iArr2.length == jArr2.length);
        this.f90519a = wVar;
        this.f90521c = jArr;
        this.f90522d = iArr;
        this.f90523e = i15;
        this.f90524f = jArr2;
        this.f90525g = iArr2;
        this.f90526h = iArr3;
        this.f90528j = z15;
        this.f90527i = j15;
        this.f90520b = i16;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public int a(long j15) {
        int i15 = 0;
        if (this.f90528j) {
            return o0.g(this.f90524f, j15, true, false);
        }
        int length = this.f90526h.length - 1;
        int i16 = -1;
        while (i15 <= length) {
            int i17 = ((length - i15) / 2) + i15;
            if (this.f90524f[this.f90526h[i17]] <= j15) {
                i15 = i17 + 1;
                i16 = i17;
            } else {
                length = i17 - 1;
            }
        }
        if (i16 == -1) {
            return -1;
        }
        long j16 = this.f90524f[this.f90526h[i16]];
        if (j16 == j15) {
            while (i16 > 0 && this.f90524f[this.f90526h[i16 - 1]] == j16) {
                i16--;
            }
        }
        return this.f90526h[i16];
    }

    public int b(long j15) {
        int i15 = 0;
        if (this.f90528j) {
            return o0.d(this.f90524f, j15, true, false);
        }
        int length = this.f90526h.length - 1;
        int i16 = -1;
        while (i15 <= length) {
            int i17 = ((length - i15) / 2) + i15;
            if (this.f90524f[this.f90526h[i17]] >= j15) {
                length = i17 - 1;
                i16 = i17;
            } else {
                i15 = i17 + 1;
            }
        }
        if (i16 == -1) {
            return -1;
        }
        long j16 = this.f90524f[this.f90526h[i16]];
        if (j16 == j15) {
            while (true) {
                int[] iArr = this.f90526h;
                if (i16 >= iArr.length - 1) {
                    break;
                }
                int i18 = i16 + 1;
                if (this.f90524f[iArr[i18]] != j16) {
                    break;
                }
                i16 = i18;
            }
        }
        return this.f90526h[i16];
    }
}
