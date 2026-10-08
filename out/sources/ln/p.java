package ln;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f118896a = {1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f118897b = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f118898c = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[][] f118899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[][] f118900e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f118899d = iArr;
        int[][] iArr2 = new int[20][];
        f118900e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i15 = 10; i15 < 20; i15++) {
            int[] iArr3 = f118899d[i15 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i16 = 0; i16 < iArr3.length; i16++) {
                iArr4[i16] = iArr3[(iArr3.length - i16) - 1];
            }
            f118900e[i15] = iArr4;
        }
    }

    static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i15 = length - 1;
        return b(charSequence.subSequence(0, i15)) == Character.digit(charSequence.charAt(i15), 10);
    }

    static int b(CharSequence charSequence) throws en.d {
        int length = charSequence.length();
        int i15 = 0;
        for (int i16 = length - 1; i16 >= 0; i16 -= 2) {
            int iCharAt = charSequence.charAt(i16) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw en.d.a();
            }
            i15 += iCharAt;
        }
        int i17 = i15 * 3;
        for (int i18 = length - 2; i18 >= 0; i18 -= 2) {
            int iCharAt2 = charSequence.charAt(i18) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw en.d.a();
            }
            i17 += iCharAt2;
        }
        return (1000 - i17) % 10;
    }
}
