package ak;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 {
    static Object a(Object obj, int i15) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i15);
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            a(objArr[i16], i16);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i15) {
        return (T[]) p1.b(tArr, i15);
    }
}
