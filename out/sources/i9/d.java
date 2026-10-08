package i9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f90381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f90382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f90383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f90384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f90385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f90386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f90387g;

        private b(long[] jArr, int[] iArr, int i15, long[] jArr2, int[] iArr2, long j15, long j16) {
            this.f90381a = jArr;
            this.f90382b = iArr;
            this.f90383c = i15;
            this.f90384d = jArr2;
            this.f90385e = iArr2;
            this.f90386f = j15;
            this.f90387g = j16;
        }
    }

    public static b a(int i15, long[] jArr, int[] iArr, long j15) {
        int[] iArr2 = iArr;
        int i16 = PKIFailureInfo.certRevoked / i15;
        int i17 = 0;
        int iJ = 0;
        for (int i18 : iArr2) {
            iJ += o0.j(i18, i16);
        }
        long[] jArr2 = new long[iJ];
        int[] iArr3 = new int[iJ];
        long[] jArr3 = new long[iJ];
        int[] iArr4 = new int[iJ];
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        int iMax = 0;
        while (i17 < iArr2.length) {
            int i27 = iArr2[i17];
            long j16 = jArr[i17];
            while (i27 > 0) {
                int iMin = Math.min(i16, i27);
                jArr2[i26] = j16;
                int i28 = i15 * iMin;
                iArr3[i26] = i28;
                i25 += i28;
                iMax = Math.max(iMax, i28);
                jArr3[i26] = ((long) i19) * j15;
                iArr4[i26] = 1;
                j16 += (long) iArr3[i26];
                i19 += iMin;
                i27 -= iMin;
                i26++;
                i16 = i16;
            }
            i17++;
            iArr2 = iArr;
        }
        return new b(jArr2, iArr3, iMax, jArr3, iArr4, j15 * ((long) i19), i25);
    }
}
