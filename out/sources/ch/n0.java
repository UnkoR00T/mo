package ch;

/* JADX INFO: loaded from: classes3.dex */
final class n0 {
    static int a(int i15, String str) {
        if (i15 >= 0) {
            return i15;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i15);
    }

    static void b(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
