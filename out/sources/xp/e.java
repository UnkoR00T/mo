package xp;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f220423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f220424b;

    static {
        long[] jArr = new long[19];
        f220423a = jArr;
        jArr[0] = 1;
        int i15 = 1;
        int i16 = 1;
        while (true) {
            long[] jArr2 = f220423a;
            if (i16 >= jArr2.length) {
                break;
            }
            jArr2[i16] = jArr2[i16 - 1] * 10;
            i16++;
        }
        int[] iArr = new int[10];
        f220424b = iArr;
        iArr[0] = 1;
        while (true) {
            int[] iArr2 = f220424b;
            if (i15 >= iArr2.length) {
                return;
            }
            iArr2[i15] = iArr2[i15 - 1] * 10;
            i15++;
        }
    }

    public static int a(float f15, int i15, byte[] bArr) {
        int i16;
        if (Float.isNaN(f15) || Float.isInfinite(f15) || f15 > 9.223372E18f || f15 <= -9.223372E18f || i15 > 5) {
            return -1;
        }
        long j15 = (long) f15;
        if (f15 < 0.0f) {
            bArr[0] = 45;
            j15 = -j15;
            i16 = 1;
        } else {
            i16 = 0;
        }
        double dAbs = Math.abs(f15) - j15;
        long j16 = f220423a[i15];
        long j17 = (long) ((dAbs * j16) + 0.5d);
        if (j17 >= j16) {
            j15++;
            j17 -= j16;
        }
        long j18 = j17;
        long j19 = j15;
        int iB = b(j19, c(j19), false, bArr, i16);
        if (j18 <= 0 || i15 <= 0) {
            return iB;
        }
        bArr[iB] = 46;
        return b(j18, i15 - 1, true, bArr, iB + 1);
    }

    private static int b(long j15, int i15, boolean z15, byte[] bArr, int i16) {
        while (j15 > 2147483647L && (!z15 || j15 > 0)) {
            long j16 = f220423a[i15];
            long j17 = j15 / j16;
            j15 -= j16 * j17;
            bArr[i16] = (byte) (j17 + 48);
            i15--;
            i16++;
        }
        int i17 = (int) j15;
        while (i15 >= 0 && (!z15 || i17 > 0)) {
            int i18 = f220424b[i15];
            int i19 = i17 / i18;
            i17 -= i18 * i19;
            bArr[i16] = (byte) (i19 + 48);
            i15--;
            i16++;
        }
        return i16;
    }

    private static int c(long j15) {
        int i15 = 0;
        while (true) {
            long[] jArr = f220423a;
            if (i15 >= jArr.length - 1) {
                return jArr.length - 1;
            }
            int i16 = i15 + 1;
            if (j15 < jArr[i16]) {
                return i15;
            }
            i15 = i16;
        }
    }
}
