package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f118891b = {1, 1, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f118892c = {3, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f118893d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // ln.n
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        n.c(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iB = n.b(zArr, 0, f118891b, true);
        for (int i15 = 0; i15 < length; i15 += 2) {
            int iDigit = Character.digit(str.charAt(i15), 10);
            int iDigit2 = Character.digit(str.charAt(i15 + 1), 10);
            int[] iArr = new int[10];
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = i16 * 2;
                int[][] iArr2 = f118893d;
                iArr[i17] = iArr2[iDigit][i16];
                iArr[i17 + 1] = iArr2[iDigit2][i16];
            }
            iB += n.b(zArr, iB, iArr, true);
        }
        n.b(zArr, iB, f118892c, true);
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.ITF);
    }
}
