package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static int a(int i15, int i16, String str) {
        String strA;
        if (i15 >= 0 && i15 < i16) {
            return i15;
        }
        if (i15 < 0) {
            strA = d.a("%s (%s) must not be negative", "index", Integer.valueOf(i15));
        } else {
            if (i16 < 0) {
                throw new IllegalArgumentException("negative size: " + i16);
            }
            strA = d.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int b(int i15, int i16, String str) {
        if (i15 < 0 || i15 > i16) {
            throw new IndexOutOfBoundsException(e(i15, i16, "index"));
        }
        return i15;
    }

    public static void c(int i15, int i16, int i17) {
        String strE;
        if (i15 < 0 || i16 < i15 || i16 > i17) {
            if (i15 < 0 || i15 > i17) {
                strE = e(i15, i17, "start index");
            } else {
                strE = (i16 < 0 || i16 > i17) ? e(i16, i17, "end index") : d.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i16), Integer.valueOf(i15));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void d(boolean z15, Object obj) {
        if (!z15) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String e(int i15, int i16, String str) {
        if (i15 < 0) {
            return d.a("%s (%s) must not be negative", str, Integer.valueOf(i15));
        }
        if (i16 >= 0) {
            return d.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IllegalArgumentException("negative size: " + i16);
    }
}
