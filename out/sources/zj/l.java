package zj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends f {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
