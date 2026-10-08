package w5;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
final class g {
    public static int[] a(int[] iArr, int i15, int i16) {
        if (i15 + 1 > iArr.length) {
            int[] iArr2 = new int[c(i15)];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            iArr = iArr2;
        }
        iArr[i15] = i16;
        return iArr;
    }

    public static <T> T[] b(T[] tArr, int i15, T t15) {
        if (i15 + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c(i15));
            System.arraycopy(tArr, 0, objArr, 0, i15);
            tArr = (T[]) objArr;
        }
        tArr[i15] = t15;
        return tArr;
    }

    public static int c(int i15) {
        if (i15 <= 4) {
            return 8;
        }
        return i15 * 2;
    }
}
