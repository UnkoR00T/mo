package r0;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
class c {
    static <T> T[] a(T[] tArr, int i15) {
        if (tArr.length < i15) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i15));
        }
        if (tArr.length > i15) {
            tArr[i15] = null;
        }
        return tArr;
    }
}
