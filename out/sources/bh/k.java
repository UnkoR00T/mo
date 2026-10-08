package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    static Object[] a(Object[] objArr, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (objArr[i16] == null) {
                throw new NullPointerException("at index " + i16);
            }
        }
        return objArr;
    }
}
