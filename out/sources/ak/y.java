package ak;

/* JADX INFO: loaded from: classes4.dex */
final class y {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int b(int i15, String str) {
        if (i15 >= 0) {
            return i15;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i15);
    }

    static void c(int i15, String str) {
        if (i15 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i15);
    }

    static void d(boolean z15) {
        zj.p.x(z15, "no calls to next() since the last call to remove()");
    }
}
