package ak;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class p1 {
    static <T> T[] a(Object[] objArr, int i15, int i16, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i15, i16, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i15) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i15);
    }

    static <K, V> Map<K, V> c(int i15) {
        return a0.B(i15);
    }

    static <K, V> Map<K, V> d() {
        return a0.u();
    }
}
