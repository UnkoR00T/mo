package xg;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    static Object[] a(Object[] objArr, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (objArr[i16] == null) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 9);
                sb5.append("at index ");
                sb5.append(i16);
                throw new NullPointerException(sb5.toString());
            }
        }
        return objArr;
    }
}
